package gw.processes

uses com.google.common.collect.Iterables
uses gw.api.database.IQueryBeanResult
uses gw.api.database.Query
uses gw.api.database.QuerySelectColumns
uses gw.api.financials.CurrencyAmount
uses gw.api.heatmap.CCHeatMapGeneratorUtils
uses gw.api.heatmap.LatLong
uses gw.api.path.Paths
uses gw.api.util.CCCurrencyUtil
uses gw.api.util.CurrencyUtil
uses gw.claim.catastrophe.CatastropheMethodsImpl
uses gw.datatype.DataTypes
uses gw.lang.reflect.features.PropertyReference
uses gw.pl.persistence.core.Bundle
uses gw.pl.persistence.core.Key
uses gw.plugin.Plugins
uses gw.plugin.pcintegration.location.PolicyLocationSearchCriteriaImpl
uses gw.plugin.policy.location.CCPolicyLocationInfo
uses gw.plugin.policy.location.PolicyLocationSearchPlugin
uses gw.transaction.Transaction
uses gw.xml.ws.WsdlFault

uses java.lang.Exception
uses java.lang.System
uses java.math.BigDecimal
uses java.util.ArrayList
uses java.util.Date
uses java.util.List
uses gw.api.upgrade.Coercions

/** 
 * Batch process for downloading catastrophe policy location data from the policy system.
 * This code works with PolicyCenter, you may need to modify it to work with other policy systems.
 * Guidewire recommends you make modifications to the subclass
 * CatastrophePolicyLocationDownload.gs instead of directly in this class.  This will make
 * it easier to do future product upgrades.
 * <p>
 * The algorithm is:
 * <p><pre> 
 * for each catastrophe that needs a download:
 *   update the PolicyLocationSummary table to match the policy system
 *     removing a PLS or modifying its policy location address removes any associated PLSJoins
 *   update the PolicyLocationSummaryJoin table:
 *     for each claim in the catastrophe without a PLSJoin:
 *       find the PolicyLocation that matches the LossLocation
 *       find the PolicyLocationSummary that matches the PolicyLocation
 *       if there's a match, create a PolicyLocationSummaryJoin
 *       address matching is done by matchAddresses (exact equality)
 * </pre>
 * The code expects the policy system to return PolicyLoationSummary records in ascending order on
 * the key (policyNumber, policySystemId) and that key pairs are unique.
 * <p>
 * Updating the PLSJ info first does an exact match of the claim loss location address fields
 * to a policy location in the claim's policy, then the PolicyNumber and PolicySystemId from that 
 * policy location are matched against the PolicyLocationSummary.  The code currently doesn't check
 * that the PolicyLocationSummary address fields are equal to this PolicyLocation--but this easily
 * be added in configuration.
 * <p>
 * Note: the PLSJ info is also updated as part of claim preupdate/preinsert to keep it current
 * between batch process runs.
 * <p>
 * The batch process tries to preserve PolicyLocationSummary records so that those records
 * can persist information such as whether the policy location was inspected as part of a
 * catastrophe.  You can override keepPLS() to keep a PolicyLocationSummary record even if
 * it's no longer in the bounding box for the catastrophe--such as if the location was inspected.
 */
@Export
abstract class CatastrophePolicyLocationDownloadBase extends BatchProcessBase {
  
  public construct(name : String) {
    super(typekey.BatchProcessType.get(name))
  }

  // Parameters
  /** Product codes passed to the policy system */
  public var _productCodes : String[] as ProductCodes = {}  
  /** List of Total Insured Value types returned by the policy system to include in computing total TIV */
  public var _tivTypes : String[] as TIVTypes = {} 
                                     
  // developer options
  // these are public so they're accessible from test code
  public var retry : boolean = true // true enables retry when there's a ConcurrentDataChangeException--use "true" in production
  public var updateCatStatus : boolean = true  // false suppresses updating the cat data, allowing repeated fetches
                                               // use "true" in production
  public var bulkDelete : boolean = false   // if true, bulk delete all PLS entries for the catastrophe
                          // not good for production because:
                          // a) the heat map cache may be refreshed at any time, giving a window of inaccuracy
                          // b) conflicts with adding fields to PLS (e.g. flag whether/when a PLS has been visited)

  // Internal variables
  // per-catastrophe counts
  public var _summaryReceivedCount : int // # of PolicyLocationSummaries received
  public var _summaryCreatedCount : int  // # of PolicyLocationSummaries created
  public var _summaryUpdatedCount : int  // # of PolicyLocationSummaries updated
  public var _summaryRemovedCount : int  // # of PolicyLocationSummaries removed
  public var _summaryUnchangedCount : int // # of PolicyLocationSummaries that are unchanged
  
  public var _joinRemovedCount : int // # of PolicyLocationSummaryJoins removed during PLS update
  public var _joinCreatedCount : int // # of PolicyLocationSummaryJoins created
  public var _joinUpdatedCount : int // # of PolicyLocationSummaryJoins updated
  
  var _showedTerminateMessage = false
  var _logger = CCHeatMapGeneratorUtils.getHeatMapLogger()

  /** The number of records to process in a bundle */
  public static var BATCH_SIZE : int = 1000
  /** The number of claim IDs to read per chunk for updating PolicyLocationSummaryJoin records */
  public static var PLSJ_CLAIM_BATCH_SIZE : int = 50000

  /**
   * Entry point to the batch process.
   */
  override function doWork() {
    setParameters()
    
    for (var catastrophe in getCatastrophes()) {
      var catStart = System.currentTimeMillis()
      if (bulkDelete)
        deleteAllPLSEntries(catastrophe)

      updatePolicyLocationSummaries(catastrophe)
      _logger.info("${catastrophe.Name}: received ${_summaryReceivedCount} policy locations; created ${_summaryCreatedCount}, updated ${_summaryUpdatedCount} and removed ${_summaryRemovedCount} records")

      var joinCount = updatePLSJoinEntries(catastrophe)
      _logger.info("${catastrophe.Name}: examined ${joinCount} claims; created ${_joinCreatedCount}, updated ${_joinUpdatedCount} and removed ${_joinRemovedCount} claim associations")
      _logger.debug("Total time for catastrophe: ${System.currentTimeMillis() - catStart}")
  
      // update catastrophe status
      if (updateCatStatus) {
        updateCatStatus(catastrophe)
      }
      if (TerminateRequested) {
        printTerminateMessage()
        return
      }
    }
  }

  /**
   * This method is called when the batch process is initialized to allow setting parameters or perform other initialization in the subclass.
   */
  abstract function setParameters() 
 
  function getCatastrophes() : IQueryBeanResult<entity.Catastrophe> {
    var query = Query.make(Catastrophe)
    var catastrophes = query.compare("PolicyEffectiveDate", NotEquals, null)
                    .compare("PolicyRetrievalSetTime", NotEquals, null)
                    .or(\ restriction -> restriction.compare("PolicyRetrievalCompletionTime", Equals, null)
                                                    .compare("PolicyRetrievalSetTime", GreaterThan, query.getColumnRef("PolicyRetrievalCompletionTime")))
                    .compare("TopLeftLatitude", NotEquals, null)
                    .select()
    return catastrophes
  }

  /** Updates the PolicyRetrievalCompletionTime for the catastrophe */
  function updateCatStatus(catastrophe : Catastrophe) {
    var retries = 2
    for (i in 0..|retries) {  // try the update twice in case of ConcurrentDataChangeException
      try {
        Transaction.runWithNewBundle(\ bundle -> {
          var catastropheInNewBundle = bundle.loadBean(catastrophe.ID) as Catastrophe
          catastropheInNewBundle.PolicyRetrievalCompletionTime = Date.CurrentDate
        }, User.util.UnrestrictedUser)
        break
      } catch (e : Exception) {
        if (i == retries-1)
          _logger.error("Unable to update PolicyRetrievalCompletionTime for ${catastrophe.Name}", e)
      }
    }
  }

  /** Prints a message to the log indicating the process was terminated by the user */
  function printTerminateMessage() {
    if (not _showedTerminateMessage) {
      _logger.info("CatastrophePolicyLocationDownload batch process terminated by user")
      _showedTerminateMessage = true
    }
  }

  /**
   * bulk delete all PolicyLocationSummary entries for the specified catastrophe
   * associated PolicyLocationSummaryJoin entries will be deleted automatically
   */
  function deleteAllPLSEntries(catastrophe : Catastrophe) {
    while (not TerminateRequested) {      
      var deleteQuery = Query.make(PolicyLocationSummary)
        .compare("Catastrophe", Equals, catastrophe.ID)
        .select({QuerySelectColumns.path(Paths.make(PolicyLocationSummary#ID))})
        .transformQueryRow(\row -> row.getColumn(0) as Key)
      deleteQuery.setPageSize(BATCH_SIZE)

      if (deleteQuery.Empty)
        break
      
      // use iterables  
      Transaction.runWithNewBundle(\ bundle ->{
        for (pls in deleteQuery) {
          if (TerminateRequested)
            break
          bundle.delete(bundle.loadBean(pls))
          _summaryRemovedCount++
        }
      }, User.util.UnrestrictedUser)
    }
  }


  /**
   * Fetch and update PolicyLocationSummaries for the specified catastrophe 
   */
  function updatePolicyLocationSummaries(catastrophe : Catastrophe) {
    var topLeft = new LatLong((catastrophe.TopLeftLatitude as double), (catastrophe.TopLeftLongitude as double))
    var bottomRight = new LatLong((catastrophe.BottomRightLatitude as double), (catastrophe.BottomRightLongitude as double))
    var effDate = catastrophe.PolicyEffectiveDate

//    print("bounding box is ${topLeft}, ${bottomRight}  effective date is ${effDate}")
    initializeProcessingChunks()

    var pliList : CCPolicyLocationInfo []
    var startingOffset = 0
    var handle = "ClaimCenter" + System.currentTimeMillis()
    do {
      try {
        pliList = findPolicyLocationsWithinBoundingBox(effDate, topLeft, bottomRight, handle, startingOffset)
      } catch (e : WsdlFault) {
        // ignore this exception, which happens when the last record in the entire transfer is the last record in a chunk
        if (e.Message.contains("IndexOutOfBoundsException"))
          pliList = new CCPolicyLocationInfo [0]
        else  
          throw e
      }
      processChunk(catastrophe, pliList)
      startingOffset += BATCH_SIZE
    } while (pliList.Count == BATCH_SIZE)

    finishProcessingChunks(catastrophe)
  }

  /** Fetch a chunk of policy locations from the policy system */
  function findPolicyLocationsWithinBoundingBox(effDate : Date, topLeft : LatLong, bottomRight : LatLong, handle : String, startingOffset : int) : CCPolicyLocationInfo []  {
    var searchAPI = Plugins.get(PolicyLocationSearchPlugin)
    var searchCriteria = new PolicyLocationSearchCriteriaImpl() {
      :EffDate = effDate,
      :ProductCodes = ProductCodes,
      :TopLeftLat = topLeft.Lat,
      :TopLeftLong = topLeft.Long,
      :BottomRightLat = bottomRight.Lat,
      :BottomRightLong = bottomRight.Long,
      :Handle = handle,
      :StartingOffset = startingOffset,
      :Count = BATCH_SIZE
    }
    return searchAPI.findPolicyLocationsWithinBoundingBox(searchCriteria)
  }

  /** Initialize counters and state for updating the PolicyLocationSummary entries */
  function initializeProcessingChunks() {
    _summaryReceivedCount = 0
    _summaryCreatedCount = 0 
    _summaryUpdatedCount = 0
    _summaryRemovedCount = 0
    _summaryUnchangedCount = 0
    _joinRemovedCount = 0
    
    _previousReceivedPolicyNumber  = null
    _previousReceivedPolicySystemId = null
    fetcher = new CatastrophePolicyLocationSummaryFetcher(BATCH_SIZE)
  }
  
  // variables for processChunk()
  var _plsDeleteList = new ArrayList<PolicyLocationSummary>()  // list of PLS's to delete
  

  /**
   * Override this function to keep added PolicyLocationSummarys in the database even if they
   * are no longer in the catastrophe area of interest.  For example, if you extended PLS
   * to include whether/when the policy location was visited during a catastrophe, you may
   * want to preserve that information
   */
  function keepPLS(pls : PolicyLocationSummary) : boolean {
    return false
  }

  var _previousReceivedPolicyNumber : String
  var _previousReceivedPolicySystemId : String
  public var fetcher : CatastrophePolicyLocationSummaryFetcher

  /**
   * process a chunk of data returned from the policy system   
   */
  function processChunk(catastrophe : Catastrophe, pliList : CCPolicyLocationInfo []) {

    // check records returned by policy system are in ascending order
    for (pli in pliList) {
      if (_previousReceivedPolicyNumber != null and  _previousReceivedPolicySystemId != null
          and fetcher.compare(pli.PolicyNumber, pli.PolicyLocationPolicySystemID, _previousReceivedPolicyNumber, _previousReceivedPolicySystemId) <= 0) {
            throw new Exception("Policy locations received from policy system are not in ascending order: current (${pli.PolicyNumber}, ${pli.PolicyLocationPolicySystemID}) <= previous (${_previousReceivedPolicyNumber}, ${_previousReceivedPolicySystemId})")
      }
      _previousReceivedPolicyNumber = pli.PolicyNumber
      _previousReceivedPolicySystemId = pli.PolicyLocationPolicySystemID
    }

    
    var pliLast = pliList != null ? pliList.last() : null
    var pliIndex = 0
    var pls = fetcher.getNextExistingPLS(catastrophe, pliLast.PolicyNumber, pliLast.PolicyLocationPolicySystemID)
    Transaction.runWithNewBundle(\ bundle -> {
    
      while (not TerminateRequested) {
        var pli = pliIndex < pliList.Count ? pliList[pliIndex] : null
        
        var compare : int
        if (pli != null) {
          compare = pls != null
                    ? fetcher.compare(pls.PolicyNumber, pls.PolicySystemId, pli.PolicyNumber, pli.PolicyLocationPolicySystemID)
                    : 1
        } else if (pls != null) { // and pli == null
          compare = -1
        } else { // both are null
          break
        }
      
        if (compare < 0) { // pls < pli or pli null
          handleRemove(pls, bundle)
          pls = fetcher.getNextExistingPLS(catastrophe, pliLast.PolicyNumber, pliLast.PolicyLocationPolicySystemID)
        
        } else if (compare == 0) { // pls == pli
          handleUpdate(pls, pli, bundle)
          pls = fetcher.getNextExistingPLS(catastrophe, pliLast.PolicyNumber, pliLast.PolicyLocationPolicySystemID)
          pliIndex++
          _summaryReceivedCount++ // per-catastrophe records received
          OperationsCompleted++  // set to number of policy locations transferred for all catastrophes
  
        } else { // pls > pli or pls null
          handleCreate(pli, catastrophe, bundle)
          pliIndex++   
          _summaryReceivedCount++ // per-catastrophe records received
          OperationsCompleted++  // set to number of policy locations transferred for all catastrophes
        }
      }
    }, User.util.UnrestrictedUser)
  }
  
  /**
   * accumulate list of PLS entries to remove
   */
  function handleRemove(pls : PolicyLocationSummary, bundle : Bundle) {
    if (_logger.TraceEnabled) _logger.trace("remove ${pls.PolicyNumber} ${pls.PolicySystemId}")
    _plsDeleteList.add(pls)
    _summaryRemovedCount++
    removePLSJs(pls, bundle)
    if (_plsDeleteList.Count >= BATCH_SIZE) {
      commitRemovePLSEntries()
    }     
  }

  /** Remove the PolicyLocationSummaryJoin entries associated with a PolicyLocationSummary */
  function removePLSJs(pls : PolicyLocationSummary, bundle : Bundle) {
    for (plsj in pls.ClaimJoin) {
      bundle.add(plsj)
      pls.removeFromClaimJoin(plsj)
      if (_logger.TraceEnabled) _logger.trace("remove plsj ${pls.PolicyNumber} ${pls.PolicySystemId}")
      _joinRemovedCount++
    }
  }
  
  /** Commit a batch of PolicyLocationSummaryJoin removals */
  function commitRemovePLSEntries() {
    if (_plsDeleteList.HasElements) {
     Transaction.runWithNewBundle(\ bundle -> _plsDeleteList.each(\ pls -> bundle.delete(pls)), User.util.UnrestrictedUser)
     _plsDeleteList.clear()
    }
  }
  
  /** Update a PolicyLocationSummary entry */
  function handleUpdate(pls : PolicyLocationSummary, pli : CCPolicyLocationInfo, bundle : Bundle) {
    // if the address has changed, remove its existing PLSJ entries to force rematching later
    if (not matchAddresses(pli, pls)) {
      removePLSJs(pls, bundle)
    }

    if (not equal(pli, pls)) {
      // update the existing PLS 
      bundle.add(pls)
      copyToPLS(pli, pls)
      if (_logger.TraceEnabled)
        printDiffs(pli, pls, false)
      if (_logger.TraceEnabled) _logger.trace("update ${pli.PolicyNumber} ${pli.PolicyLocationPolicySystemID}")
      _summaryUpdatedCount++
    } else {
      _summaryUnchangedCount++
    }
  }
  
  /** Create a PolicyLocationSummary entry */
  function handleCreate(pli : CCPolicyLocationInfo, catastrophe : Catastrophe, bundle : Bundle) {
    // create a new PLS
    var pls = new PolicyLocationSummary(bundle)
    pls.Catastrophe = catastrophe
    if (_logger.TraceEnabled) _logger.trace("create ${pli.PolicyNumber} ${pli.PolicyLocationPolicySystemID}")
    _summaryCreatedCount++
    copyToPLS(pli, pls)
  }
  
  /**
   * finish processing chunks, commit uncommitted PLS removes 
   */
  function finishProcessingChunks(catastrophe : Catastrophe) {
    processChunk(catastrophe, null) // handle any remaining unprocessed PLS entries
    commitRemovePLSEntries()  // commit any uncommitted PLS removes
  }


  /**
   * update PLSJoin entries for claims in the specified catastrophe, return # of claims processed 
   */
  function updatePLSJoinEntries(catastrophe : Catastrophe) : int {
    _joinCreatedCount = 0
    _joinUpdatedCount = 0
    var count = 0
    
    // review all claims in the cat that don't have an associated policy location summary
    var claimQuery = Query.make(Claim)
                        .compare("Catastrophe", Equals, catastrophe)
                        .compare("PolicyLocationSummaryJoin", Equals, null)
                        .select({QuerySelectColumns.path(Paths.make(Claim#ID))})
    setChunkingById(claimQuery, PLSJ_CLAIM_BATCH_SIZE)
    for (claimIDs in Iterables.partition(claimQuery, BATCH_SIZE)) {
      if (TerminateRequested)
        break
      var claims = Query.make(Claim).compareIn("ID", claimIDs.toArray()).select().toList()
      try {
        var createdCount = 0
        var updatedCount = 0
        Transaction.runWithNewBundle(\ bundle ->{
          for (claim in claims) {
            if (_logger.TraceEnabled) _logger.trace("processing claim ${claim.ClaimNumber}")
            var action = CatastropheMethodsImpl.updatePolicyLocationSummaryJoin(bundle.add(claim), null)
            if (action == Created)
              createdCount++
            else if (action == Updated)
              updatedCount++
            count++
            if (TerminateRequested)
              break
          }
        })
        // bump counts after commit succeeds
        _joinCreatedCount += createdCount
        _joinUpdatedCount += updatedCount
      } catch (e : Exception) {
        // retry updating the claims one by one in separate bundles
        if (retry)
          retryUpdatePLSJ(claims)
      }
      
    } // for (partition)
    return count
  }

  /**
   * update PLSJ entries for a set of claims, each in a separate bundle 
   */
  function retryUpdatePLSJ(claims : List<Claim>) {
    for (claim in claims) {
      var action : CatastropheMethodsImpl.UpdateAction
      try {
        Transaction.runWithNewBundle(\ bundle ->{
          if (_logger.TraceEnabled) _logger.trace("re-processing claim ${claim.ClaimNumber}")
          action = CatastropheMethodsImpl.updatePolicyLocationSummaryJoin(bundle.add(claim), null)
        }, User.util.UnrestrictedUser)
        if (action == Created) {
          _joinCreatedCount++
        } else if (action == Updated)
          _joinUpdatedCount++
      } catch (e : Exception) {
        _logger.error("Unable to update PolicyLocationSummaryJoin for ${claim.ClaimNumber}", e)
        OperationsFailed++
      }
      if (TerminateRequested)
        break
    }
  }

  /**
   * check whether the policy location address from the policy system matches the PLS
   */
  function matchAddresses(pli : CCPolicyLocationInfo, pls : PolicyLocationSummary) : boolean {
    var pliAddr = pli.PolicyLocationAddress
    return
      pls.AddressLine1 == pliAddr.AddressLine1 and
      pls.AddressLine2 == pliAddr.AddressLine2 and
      pls.AddressLine3 == pliAddr.AddressLine3 and
      pls.City == pliAddr.City and
      pls.County == pliAddr.County and
      pls.State == typekey.State.get(pliAddr.State) and
      pls.PostalCode == pliAddr.PostalCode and
      pls.Country == typekey.Country.get(pliAddr.Country)
  }
 
  function convertPolicyType(policyType : String) : typekey.PolicyType {
    return typekey.PolicyType.getTypeKeys(false).firstWhere(\ polType -> polType.Code.equalsIgnoreCase(policyType))
  }

  /**
   * compute the Total Insured Value for the PolicyLocationSummary 
   */
  function computeTotalInsuredValue(pli : CCPolicyLocationInfo) : CurrencyAmount {
    var defaultCurrency = CurrencyUtil.getDefaultCurrency()
    var rv = new CurrencyAmount(BigDecimal.ZERO, defaultCurrency)
    if (pli.TotalInsuredValues != null) {
      for (var insuredValue in pli.TotalInsuredValues) {
        if (TIVTypes.contains(insuredValue.Name)) {
          var insuredValueCurrency = insuredValue.Currency == null ? defaultCurrency : Currency.get(insuredValue.Currency)
          var insuredValWithCurrency = CCCurrencyUtil.getStrict(insuredValue.Value, insuredValueCurrency)
          rv = rv.add(insuredValWithCurrency.convert(defaultCurrency, CurrencyUtil.getRoundingMode()))
        }
      }
    }
    return rv
  }

  /**
   * copy data from the WSI Soap message into a PolicyLocationSummary
   */
  function copyToPLS(pli : CCPolicyLocationInfo, pls : PolicyLocationSummary) {
    pls.Latitude = roundLatitudeOrLongitude(PolicyLocationSummary#Latitude, pli.PolicyLocationLatitude)
    pls.Longitude = roundLatitudeOrLongitude(PolicyLocationSummary#Longitude, pli.PolicyLocationLongitude)
    pls.GeocodeStatus = typekey.GeocodeStatus.get(pli.PolicyLocationGeocodeStatus)
    pls.PolicySystemId = pli.PolicyLocationPolicySystemID
    pls.PolicyType = convertPolicyType(pli.ProductCode)
    pls.PolicyNumber = pli.PolicyNumber
    
    // set TotalInsured to the sum of selected coverage types
    pls.TotalInsured = computeTotalInsuredValue(pli)

    var pliAddr = pli.PolicyLocationAddress
    pls.AddressLine1 = pliAddr.AddressLine1
    pls.AddressLine1Kanji = pliAddr.AddressLine1Kanji
    pls.AddressLine2 = pliAddr.AddressLine2
    pls.AddressLine2Kanji = pliAddr.AddressLine2Kanji
    pls.AddressLine3 = pliAddr.AddressLine3
    pls.City = pliAddr.City
    pls.CityKanji = pliAddr.CityKanji
    pls.County = pliAddr.County
    pls.State = typekey.State.get(pliAddr.State)
    pls.PostalCode = pliAddr.PostalCode
    pls.CEDEX = Coercions.makeBooleanFrom(pliAddr.CEDEX)
    pls.Country = typekey.Country.get(pliAddr.Country)
    
    var pliPNIAddr = pli.PNIAddressFields
    pls.InsuredAddressLine1 = pliPNIAddr.AddressLine1Kanji.HasContent ? pliPNIAddr.AddressLine1Kanji : pliPNIAddr.AddressLine1
    pls.InsuredAddressLine2 = pliPNIAddr.AddressLine2Kanji.HasContent ? pliPNIAddr.AddressLine2Kanji : pliPNIAddr.AddressLine2
    pls.InsuredAddressLine3 = pliPNIAddr.AddressLine3
    pls.InsuredCity = pliPNIAddr.CityKanji.HasContent ? pliPNIAddr.CityKanji : pliPNIAddr.City
    pls.InsuredCounty = pliPNIAddr.County
    pls.InsuredState = typekey.State.get(pliPNIAddr.State)
    pls.InsuredPostalCode = pliPNIAddr.PostalCode 
    pls.InsuredCountry = typekey.Country.get(pliPNIAddr.Country)
    pls.InsuredName = pli.PNIName
    pls.EmailAddress = pli.PNIEmail
    pls.PhoneCountry = pli.PNIPhoneCountry
    pls.Phone = pli.PNIPhoneNumber
    pls.PhoneExtension = pli.PNIPhoneExtension
  }

  /**
   * Rounds the given value as appropriate for the given latitude or longitude
   * property. The target scale is taken from the property definition. The value
   * is simply truncated (RoundingMode.DOWN) so that the valid range for a
   * latitude or longitude will not be exceeded (+179.999999 can't become
   * +180.00000).
   */
  private function roundLatitudeOrLongitude(
          entityProperty : PropertyReference< Object, BigDecimal>, unroundedValue : BigDecimal) : BigDecimal {
    if (unroundedValue == null) {
      return null
    } else {
      var propertyInfo = entityProperty.PropertyInfo
      return DataTypes.get(propertyInfo).asConstrainedDataType().round(null, propertyInfo, unroundedValue, DOWN)
    }
  }
  
  /**
   * determine if there is a change to any PolicyLocationSummary field 
   */
  function equal(pli : CCPolicyLocationInfo, pls : PolicyLocationSummary): boolean {
    var pliPNIAddr = pli.PNIAddressFields
    var tiv = computeTotalInsuredValue(pli)

    return pls != null and
      pls.Latitude == pli.PolicyLocationLatitude and
      pls.Longitude == pli.PolicyLocationLongitude and
      pls.GeocodeStatus == typekey.GeocodeStatus.get(pli.PolicyLocationGeocodeStatus) and
      pls.PolicySystemId == pli.PolicyLocationPolicySystemID and
      pls.PolicyType == convertPolicyType(pli.ProductCode) and
      pls.PolicyNumber == pli.PolicyNumber and
      pls.TotalInsured == tiv and

      matchAddresses(pli, pls) and
    
      pls.InsuredAddressLine1 == pliPNIAddr.AddressLine1 and
      pls.InsuredAddressLine2 == pliPNIAddr.AddressLine2 and
      pls.InsuredAddressLine3 == pliPNIAddr.AddressLine3 and
      pls.InsuredCity == pliPNIAddr.City and
      pls.InsuredCounty == pliPNIAddr.County and
      pls.InsuredState == typekey.State.get(pliPNIAddr.State) and
      pls.InsuredPostalCode == pliPNIAddr.PostalCode and
      pls.InsuredCountry == typekey.Country.get(pliPNIAddr.Country) and
      pls.InsuredName == pli.PNIName and
      pls.EmailAddress == pli.PNIEmail and
      pls.Phone == pli.PNIPhoneNumber and
      pls.PhoneCountry == pli.PNIPhoneCountry and
      pls.PhoneExtension == pli.PNIPhoneExtension
  }

  /**
   * compare and print all the fields in the object (for debugging)
   */
  function printDiffs(pli : CCPolicyLocationInfo, pls : PolicyLocationSummary, all : boolean) {
    var tiv = computeTotalInsuredValue(pli)
    if (all or pls.Latitude != pli.PolicyLocationLatitude)
      _logger.trace("Latitude: ${pls.Latitude} ${pli.PolicyLocationLatitude}")
    if (all or pls.Longitude != pli.PolicyLocationLongitude)
      _logger.trace("Longitude: ${pls.Longitude} ${pli.PolicyLocationLongitude}")
    if (all or pls.GeocodeStatus != typekey.GeocodeStatus.get(pli.PolicyLocationGeocodeStatus))
      _logger.trace("GeocodeStatus: ${pls.GeocodeStatus} ${typekey.GeocodeStatus.get(pli.PolicyLocationGeocodeStatus)}")

    if (all or pls.PolicySystemId != pli.PolicyLocationPolicySystemID)
      _logger.trace("PolicySystemId: ${pls.PolicySystemId} ${pli.PolicyLocationPolicySystemID}")
    if (all or pls.PolicyType != convertPolicyType(pli.ProductCode))
      _logger.trace("Product Code: ${pls.PolicyType} ${convertPolicyType(pli.ProductCode)}")
    if (all or pls.PolicyNumber != pli.PolicyNumber)
      _logger.trace("Policy Number: ${pls.PolicyNumber} ${pli.PolicyNumber}")
    if (all or pls.TotalInsured != tiv)
      _logger.trace("Total Insured: ${pls.TotalInsured} ${tiv}")
      
    var pliAddr = pli.PolicyLocationAddress
    if (all or pls.AddressLine1 != pliAddr.AddressLine1)
      _logger.trace("AddressLine1: ${pls.AddressLine1} ${pliAddr.AddressLine1}")
    if (all or pls.AddressLine2 != pliAddr.AddressLine2)
      _logger.trace("AddressLine2: ${pls.AddressLine2} ${pliAddr.AddressLine2}")
    if (all or pls.AddressLine3 != pliAddr.AddressLine3)
      _logger.trace("AddressLine3: ${pls.AddressLine3} ${pliAddr.AddressLine3}")
    if (all or pls.City != pliAddr.City)
      _logger.trace("City: ${pls.City} ${pliAddr.City}")
    if (all or pls.County != pliAddr.County)
      _logger.trace("County: ${pls.County} ${pliAddr.County}")
    if (all or pls.State != typekey.State.get(pliAddr.State))
      _logger.trace("State: ${pls.State} ${typekey.State.get(pliAddr.State)}")
    if (all or pls.PostalCode != pliAddr.PostalCode)
      _logger.trace("PostalCode: ${pls.PostalCode} ${pliAddr.PostalCode}")
    if (all or pls.Country != typekey.Country.get(pliAddr.Country))
      _logger.trace("Country: ${pls.Country} ${typekey.Country.get(pliAddr.Country)}")

    var pliPNIAddr = pli.PNIAddressFields
    if (all or pls.InsuredAddressLine1 != pliPNIAddr.AddressLine1)
      _logger.trace("InsuredAddressLine1: ${pls.InsuredAddressLine1} ${pliPNIAddr.AddressLine1}")
    if (all or pls.InsuredAddressLine2 != pliPNIAddr.AddressLine2)
      _logger.trace("InsuredAddressLine2: ${pls.InsuredAddressLine2} ${pliPNIAddr.AddressLine2}")
    if (all or pls.InsuredAddressLine3 != pliPNIAddr.AddressLine3)
      _logger.trace("InsuredAddressLine3: ${pls.InsuredAddressLine3} ${pliPNIAddr.AddressLine3}")
    if (all or pls.InsuredCity != pliPNIAddr.City)
      _logger.trace("InsuredCity: ${pls.InsuredCity} ${pliPNIAddr.City}")
    if (all or pls.InsuredCounty != pliPNIAddr.County)
      _logger.trace("InsuredCounty: ${pls.InsuredCounty} ${pliPNIAddr.County}")
    if (all or pls.InsuredState != typekey.State.get(pliPNIAddr.State))
      _logger.trace("InsuredState: ${pls.InsuredState} ${typekey.State.get(pliPNIAddr.State)}")
    if (all or pls.InsuredCountry != typekey.Country.get(pliPNIAddr.Country))
      _logger.trace("InsuredCountry: ${pls.InsuredCountry} ${pliPNIAddr.Country}")
      
    if (all or pls.InsuredName != pli.PNIName)
      _logger.trace("InsuredName: ${pls.InsuredName} ${pli.PNIName}")
    if (all or pls.EmailAddress != pli.PNIEmail)
      _logger.trace("EmailAddress: ${pls.EmailAddress} ${pli.PNIEmail}")
    if (all or pls.Phone != pli.PNIPhoneNumber)
      _logger.trace("Phone: ${pls.Phone} ${pli.PNIPhoneNumber}")
  }

}
