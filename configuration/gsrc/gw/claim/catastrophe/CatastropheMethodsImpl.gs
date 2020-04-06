package gw.claim.catastrophe

uses gw.api.database.Query
uses gw.api.heatmap.CCHeatMapGeneratorUtils
uses gw.api.heatmap.CatastropheMethods
uses gw.pl.persistence.core.Bundle
uses gw.transaction.AbstractBundleTransactionCallback
uses gw.transaction.Transaction

uses java.lang.Exception
uses java.lang.Thread


@Export
class CatastropheMethodsImpl implements CatastropheMethods {

  public construct(aClaim : Claim) {
    _claim = aClaim
  }

  private var _claim : Claim as Claim
  static var _logger = CCHeatMapGeneratorUtils.getHeatMapLogger()

  /**
   * implements CatastropheMethods: called before commit when a claim is inserted or updated
   * to update catastrophe-related data
   */
  override function updatePolicyLocationSummaryJoin() {
    if (_claim.State == TC_DRAFT) {
      // avoid CDCE in FNOL Wizard
      return
    }
    
    // update the PLSJ entry in a separate transaction to avoid possible ConcurrentDataChangeException for claim commit
    _claim.Bundle.addBundleTransactionCallback(new AbstractBundleTransactionCallback() {
      override function afterCommit(committingBundle : Bundle, didCommit : boolean) {
        if (!didCommit) {
          return
        }
        // must be in a new thread, can't commit inside another transaction
        var updatePolicyLocationSummaryJoinThread =  new Thread() {
          override function run() {
            var retries = 2
            for (i in 0..|retries) {  // try the update twice in case of ConcurrentDataChangeException
              var claimInNewBundle : Claim
              try {
                Transaction.runWithNewBundle(\ bundle ->{
                  claimInNewBundle = bundle.loadBean(Claim.ID) as Claim
                  updatePolicyLocationSummaryJoin(claimInNewBundle, claimInNewBundle.PolicyLocationSummaryJoin)
                }, User.util.UnrestrictedUser)
                break
              } catch (e : Exception) {
                // print exception on second occurrence
                if (i == retries-1) {
                  _logger.error("Unable to update PolicyLocationSummaryJoin for ${claimInNewBundle.ClaimNumber}", e)
                 }
              }
            }
          }
        }
        updatePolicyLocationSummaryJoinThread.start()
        updatePolicyLocationSummaryJoinThread.join()
      }
    })
  }

  public static enum UpdateAction { Created, Updated, Removed, NoChange }

  /**
   * updates the PolicyLocationSummaryJoin entry for the single specified claim
   */
  static function updatePolicyLocationSummaryJoin(claim : Claim, plsJoin : PolicyLocationSummaryJoin) : UpdateAction {
    var policyLocation : PolicyLocation

    if (claim.Catastrophe != null and claim.Policy.PolicyLocations != null and claim.LossLocation != null) {
      // find a policy location that matches the loss location
      policyLocation = claim.Policy.PolicyLocations.firstWhere(\ pl -> matchAddresses(pl.Address, claim.LossLocation))
    }
    
    if (claim.Catastrophe == null or policyLocation == null) {
      // remove existing PLSJoin entry if present
      if (policyLocation == null and plsJoin != null) {
        if (_logger.TraceEnabled) _logger.trace("* claim not in cat or no matching policy location, clear PLSJoin entry")
        claim.Bundle.delete(plsJoin)
        return UpdateAction.Removed
      }
      return UpdateAction.NoChange
    }

    // otherwise, find matching PLS records
    var pls : PolicyLocationSummary
    var query = Query.make(PolicyLocationSummary) 
                       .compare("Catastrophe", Equals, claim.Catastrophe)
                       .compare("PolicyNumber", Equals, claim.Policy.PolicyNumber)

    if (policyLocation.PolicySystemId != null) {
      // preferred case
      pls = query.compare("PolicySystemId", Equals, policyLocation.PolicySystemId)
                 .select()
                 .AtMostOneRow
    } else {
      // alternate if psid not set
      pls = query.compare("AddressLine1", Equals, policyLocation.Address.AddressLine1)
                 .select()
                 .toList()
                 .firstWhere(\ p -> matchAddresses(policyLocation.Address, p))
    }
    
    var updateAction = UpdateAction.NoChange
    if (pls != null) {
      // create/update PLSJoin entry
      if (plsJoin == null) {
        if (_logger.TraceEnabled) _logger.trace("* create PLSJoin entry for ${claim.ClaimNumber}")
        updateAction = Created
        plsJoin = new PolicyLocationSummaryJoin(claim.Bundle)
      } else {
        if (_logger.TraceEnabled) _logger.trace("* update PLSJoin entry")
        updateAction = Updated
      }

      plsJoin.PolicyLocationSummary = pls
      plsJoin.Claim = claim
      
      if (claim.LossLocation.Latitude == null and pls.Latitude != null) {
        // copy lat/long from PLS
        var lossLocation = claim.LossLocation
        lossLocation.setGeocodeFieldsFromLatLong(pls.Latitude, pls.Longitude)
        lossLocation.GeocodeStatus = pls.GeocodeStatus
      }
    }
    return updateAction
  }

  /**
   * determine whether two addresses match
   */
  static function matchAddresses(addr1 : Address, addr2 : Address) : boolean {
    if (addr1 == null or addr2 == null)
      return false
    return (addr1.AddressLine1 == addr2.AddressLine1 and
            addr1.AddressLine2 == addr2.AddressLine2 and
            addr1.AddressLine3 == addr2.AddressLine3 and
            addr1.City         == addr2.City and
            addr1.County       == addr2.County and
            addr1.State        == addr2.State and
            addr1.PostalCode   == addr2.PostalCode and
            addr1.Country      == addr2.Country)
  }

  /**
   * do the same check as matchAddresses() with data from different objects 
   */
  static function matchAddresses(addr1 : Address, pls : PolicyLocationSummary) : boolean {
    return
      addr1.AddressLine1 == pls.AddressLine1 and
      addr1.AddressLine2 == pls.AddressLine2 and
      addr1.AddressLine3 == pls.AddressLine3 and
      addr1.City == pls.City and
      addr1.County == pls.County and
      addr1.State == pls.State and
      addr1.PostalCode == pls.PostalCode and
      addr1.Country == pls.Country
  }

  /**
   * compare and print all the fields in the object (for debugging)
   */
  function printDiffs(addr1 : Address, addr2 : Address, all : boolean) {
    if (all or addr1.AddressLine1 != addr2.AddressLine1)
      _logger.trace("AddressLine1: ${addr1.AddressLine1} ${addr2.AddressLine1}")
    if (all or addr1.AddressLine2 != addr2.AddressLine2)
      _logger.trace("AddressLine2: ${addr1.AddressLine2} ${addr2.AddressLine2}")
    if (all or addr1.AddressLine3 != addr2.AddressLine3)
      _logger.trace("AddressLine3: ${addr1.AddressLine3} ${addr2.AddressLine3}")
    if (all or addr1.City != addr2.City)
      _logger.trace("City: ${addr1.City} ${addr2.City}")
    if (all or addr1.County != addr2.County)
      _logger.trace("County: ${addr1.County} ${addr2.County}")
    if (all or addr1.State != addr2.State)
      _logger.trace("State: ${addr1.State} ${addr2.State}")
    if (all or addr1.PostalCode != addr2.PostalCode)
      _logger.trace("PostalCode: ${addr1.PostalCode} ${addr2.PostalCode}")
    if (all or addr1.Country != addr2.Country)
      _logger.trace("Country: ${addr1.Country} addr2.Country}")
  }

}