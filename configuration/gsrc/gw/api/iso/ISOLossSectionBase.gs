package gw.api.iso
uses gw.api.locale.DisplayKey
uses xsd.iso.req.ClaimsParty
uses gw.xml.XmlElement
uses xsd.iso.req.ClaimsPayment
uses java.math.BigDecimal
uses xsd.iso.req.ClaimsPaymentCovInfo
uses xsd.iso.req.ItemDefinition
uses java.util.Map
uses java.util.HashMap
uses xsd.iso.req.RecoveryInfo
uses xsd.iso.req.InvestigationInfo
uses xsd.iso.req.types.complex.StringCd
uses xsd.iso.req.SalvageInfo
uses xsd.iso.req.AdjusterPartyInfo
uses xsd.iso.req.anonymous.elements.InvestigationInfo_VehDispositionCd

/**
 * Base class for objects that know how to generate an ISO "loss section", with
 * its associated ClaimsParties, AdjusterParty and ClaimsPayment (if relevant),
 * and add it to an ISOClaimSearchRequest.
 * <p>
 * A loss section in an ISO ClaimSearch request corresponds to an Exposure in
 * ClaimCenter. A loss section can be represented by one of three aggregates:
 * <ol>
 * <li>AutoLossInfo (aka UV01), a loss involving an automobile.
 * <li>ClaimsInjuredInfo (aka UC01), used to report losses related to a
 *     specific injury, liability, or 3rd party property damage.
 * <li>PropertyLossInfo, used to report a first-party property loss. There are
 *     different sub aggregates for this type of loss:
 *     <ul>
 *     <li>ClaimsSubjectInsuranceInfo (aka UP01)
 *     <li>ItemInfo or Watercraft (aka UP02)
 *     </ul>
 * </ol>
 * Each loss section is associated with at least one ClaimsParty aggregate. For
 * first party losses there will be a ClaimsParty aggregate for the
 * claimant/insured. For third party losses there will be separate ClaimsParty
 * aggregates, one for the insured, one for the claimant. There may also be
 * other ClaimsParty aggregates with different ClaimsParty roles e.g. witnesses
 * or service providers. See the ISOClaimsPartyRole enumeration for a full list
 * of possible roles and see ISOClaimsPartiesBase for details of ClaimsParty
 * handling
 * <p>
 * Every loss section must also be associated with an AdjusterParty via an
 * AdjusterPartyInfo aggregate which specifies the loss party coverage type
 * and loss type (which roughly correspond with ClaimCenter's coverage type
 * and coverage subtype). See ISOAdjusterPartiesBase for details of
 * AdjusterParty handling
 * <p>
 * A loss section may optionally have an associated ClaimsPayment aggregate
 * specifying payments on the item and its state (open/closed)
 * <p>
 * Customers should avoid changing this class if possible, as it will almost
 * certainly change in future releases. Wherever possible changes should be
 * made by overriding methods and properties in subclasses of this class.
 */
@Export
abstract class ISOLossSectionBase {

  // ------------------------------------------------------- Instance Variables

  /** The exposure for with the loss section is to be generated */
  private var _exposure : Exposure as readonly Exposure

  /** The ISO ClaimSearch request to which the loss section is to be added */
  private var _searchRequest : ISOClaimSearchRequest as readonly SearchRequest

  /** True if other loss sections could be added to the search request */
  private var _sharedSearchRequest : boolean

  // ------------------------------------------------------------- Constructors
  
  /**
   * Used to create a new loss section on a new ISO ClaimSearch request
   */
  construct(inExposure : Exposure)  {
    _exposure = inExposure
    _searchRequest = new ISOClaimSearchRequest(inExposure.Claim)
    _sharedSearchRequest = false
  }

  /**
   * Used to create a new loss section on an existing ISO ClaimSearch request
   */
  construct(inSearchRequest : ISOClaimSearchRequest, inExposure : Exposure)  {
    _exposure = inExposure
    _searchRequest = inSearchRequest
    _sharedSearchRequest = true
  }

  // ----------------------------------------------------------- Public Methods

  /**
   * The main method of this class, populates the claim search request with a
   * loss section, using information from the exposure provided at construction
   * time. Returns the ACORD xml object representing the populated claim search
   */
  public function populate() : xsd.iso.req.ACORD {
    if (SearchRequest.AddRequest.ClaimsOccurrence == null) {
      var claim = Exposure.Claim
      SearchRequest.initializeClaimInvestigationAddRequest(
          _sharedSearchRequest ? claim.ClaimNumber : InsurerId,
          CoverageCodes.PolicyType,
          _sharedSearchRequest ? claim.Description : IncidentDescription)
    }
    createProbableIncurredAmt()
    var claimantParty = createClaimantAndInsured()
    createOptionalClaimsParties(claimantParty)
    modifyClaimantAndInsuredRoles()
    var lossSection = createLossSection(claimantParty)

    var adjusterPartyInfo = addAdjuster()
    if (adjusterPartyInfo != null and lossSection != null) {
      adjusterPartyInfo.AssignmentRef = lossSection
    }

    var claimsPayment = createAndAddClaimsPayment(claimantParty)
    if (claimsPayment != null and lossSection != null) {
      claimsPayment.Idref = lossSection
    }

    if (ShouldAddInvestigationInfo) {
      var investigationInfo = createAndAddInvestigationInfo()
      if (investigationInfo != null) {
        investigationInfo.ItemRef = lossSection
        for (var recoveryInfo in investigationInfo.RecoveryInfo) {
          recoveryInfo.ItemRef = lossSection
        }
        for (var salvageInfo in investigationInfo.SalvageInfo) {
          salvageInfo.ItemRef = lossSection
        }
      }
    }
    return SearchRequest.AcordRequest
  }
  
  // ------------------------------------------------------- Subclasser Methods

  /**
   * Called to create the loss section - the AutoLossInfo, ClaimsInjuredInfo
   * or PropertyLossInfo. Overridden by subclassers to create 
   */
  abstract protected function createLossSection(claimantParty : ClaimsParty) : XmlElement

  /**
   * Should be overridden to return the type of aggregate used for the loss
   * section, such as AutoLossInfo or PropertyLossInfo
   */
  abstract protected property get LossSectionAggregateType() : Type
  
  /**
   * Called when generating a claim level search request, before calling populate.
   * Verifies whether this loss section can be added to the search request and, if
   * so, returns null. If not returns a message explaining why not. For example
   * there can only be a single watercraft loss section in a claim search message,
   * so a watercraft loss section would verify that there is no existing PropertyLossInfo
   * aggregate in the message. The default implementation checks that there are no
   * existing loss sections that share the same loss section aggregate type, coverage
   * type and loss type
   */
  public function verifyCanPopulate(existingLossSections : List<ISOLossSectionBase>) : String {
    var thisCodes = CoverageCodes
    var thisAggregateType = LossSectionAggregateType
    for (addedLossSection in existingLossSections) {
      var addedLossAggregateType = addedLossSection.LossSectionAggregateType
      if (thisAggregateType == addedLossAggregateType) {
         var addedPolicyCoverageCodes = addedLossSection.CoverageCodes
         if (thisCodes.CoverageType == addedPolicyCoverageCodes.CoverageType and
             thisCodes.LossType == addedPolicyCoverageCodes.LossType) {
            return DisplayKey.get("Java.Error.ISO.WrongLossInfoCoverageAndLossCause")
         }
      }
    }
    return null
  }

  /**
   * The insurer id, used when initializing the ClaimsOccurrence. One of the
   * key fields used by ISO to identify a claim. By default, uses the claim
   * number plus a separator and then the exposure ClaimOrder.
   */
  protected property get InsurerId() : String {
    return Exposure.getISOInsurerId(SearchRequest.Properties)
  }

  /**
   * An object containing the ISO policy type, coverage type and loss type to
   * use for this loss section. By default, looks up the mappings for the
   * policy type, coverage type and coverage subtype associated with the
   * exposure using a call to ISOTranslate.getCoverageCodes(...)
   */
  public property get CoverageCodes() : ISOCoverageCodes {
    return Exposure.ISOCoverageCodes
  }
  
  /**
   * String describing the loss, defaults to the exposure's incident
   * description
   */
  protected property get IncidentDescription() : String {
    return Exposure.Incident.Description
  }

  /**
   * Is the loss a first party loss? If so the claimant is assumed to be
   * one of the insured. If not the claimant and insured should be separate
   * parties.
   */
  protected property get IsFirstParty() : boolean {
    return Exposure.LossParty == TC_INSURED
  }
  
  /** The claimant for the loss */
  protected property get Claimant() : Contact {
    return Exposure.ClaimantDenorm
  }
  
  /** The principal insured for the loss, if it is third party */
  protected property get Insured() : Contact {
    return Exposure.Claim.InsuredDenorm
  }
  
  /**
   * Called by populate to create the ProbableIncurredAmt aggregate in
   * the ClaimsOccurrence
   */
  protected function createProbableIncurredAmt() {
    SearchRequest.createProbableIncurredAmt(Exposure.Incident.LossEstimate)
  }
  
  /**
   * Called by populate to create the ClaimsParty or ClaimsParties for the
   * claimant and insured; two separate parties for third party losses, a
   * single "both claimant and insured" party for first party losses.
   * Returns the claimant party.
   */
  protected function createClaimantAndInsured() : ClaimsParty {
    var result : ClaimsParty
    if (IsFirstParty) {
      result = SearchRequest.ClaimsParties.addIndividualParty(Claimant, CI)
    } else {
      result = SearchRequest.ClaimsParties.addIndividualParty(Claimant, CL)
      SearchRequest.ClaimsParties.addIndividualParty(Insured, INS)
    }
    return result
  }

  /**
   * Called by populate to add any optional claim parties, such as witnesses
   * or service providers. For each mapping specified by the ContactRoleMap
   * the contacts with that ContactRole are looked up and then added as
   * ClaimsParties with the corresponding ISOClaimsPartyRole
   */    
  protected function createOptionalClaimsParties(claimantParty : ClaimsParty) {
    for (var entry in ContactRoleMap.entrySet()) {
      var isoRole = entry.Value
      var contactRole = entry.Key
      var contacts = getContactsWithRole(contactRole)
      for (contact in contacts) {
        SearchRequest.ClaimsParties.addParty(claimantParty, contact, isoRole)
      }
    }
  }

  /**
   * Mapping of ContactRoles to ISOClaimsPartyRoles; each role pair in this
   * mapping will be used by createOptionalClaimsParties. Default implementation
   * uses the mapping specified in the ISO.properties file.
   */
  public property get ContactRoleMap() : Map<ContactRole,ISOClaimsPartyRole> {
    var claimPartyMap = SearchRequest.Properties.getClaimPartyMap()
    var result = new HashMap<ContactRole,ISOClaimsPartyRole>()
    for (var entry in claimPartyMap.entrySet()) {
      var contactRole = entry.Key
      var isoRole = ISOClaimsPartyRole.byCode(entry.Value)
      if (contactRole != null and isoRole != null) {
        result[contactRole] = isoRole 
      }
    }
    return result
  }

  /**
   * Used by createOptionalClaimsParties to lookup all contacts with a given
   * role. Default implementation looks for contacts on the exposure and
   * its incident
   */  
  protected function getContactsWithRole(contactRole : ContactRole) : List<Contact> {
    var result = Exposure.getContactsByRole(contactRole).toList()
    result.addAll(Exposure.Incident.getContactsByRole(contactRole).toList())
    return result
  }

  /**
   * Called by populate after createOptionalClaimsParties. Can be overridden
   * to make the claimant and insured roles more specific, for example by
   * changing the CL role (claimant) to CD (claimant driver)
   */
  protected function modifyClaimantAndInsuredRoles() {
  }
 
  /**
   * Called by populate to create and add the adjuster
   */ 
  protected function addAdjuster() : AdjusterPartyInfo {
    return SearchRequest.AdjusterParties.addAdjuster(Exposure.AssignedUser, CoverageCodes)
  }
  
  /**
   * Called by populate to create and add the claims payment aggregate. The
   * default implementation adds a ClaimsPayment directly under the
   * ClaimInvestigationAddRq. First party property losses, using the
   * ClaimsSubjectInsuranceInfo aggregate, should override this method
   * to add the ClaimsPayment under ClaimsSubjectInsuranceInfo.
   */
  protected function createAndAddClaimsPayment(claimantParty : ClaimsParty) : ClaimsPayment {
    var claimsPayment = createClaimsPayment(claimantParty)
    SearchRequest.AddRequest.ClaimsPayment.add(claimsPayment)
    return claimsPayment
  }
  
  /**
   * Called by createAndAddClaimsPayment to create a new ClaimsPayment
   * aggregate
   */
  protected function createClaimsPayment(claimantParty : ClaimsParty) : xsd.iso.req.ClaimsPayment {
    var claimsPayment =  new xsd.iso.req.ClaimsPayment()
    claimsPayment.ClaimsPartyRef = claimantParty
    var coverageInfo = createClaimsPaymentCovInfo(CoverageCodes.CoverageType)
    claimsPayment.ClaimsPaymentCovInfo.add(coverageInfo)
    
    var payment = Exposure.PaymentAmount
    var hasPayment = payment != null and payment.compareTo(BigDecimal.ZERO.ofCurrency(payment.Currency)) != 0
    coverageInfo.CoverageCd_elem.Codelistref = SearchRequest.findOrCreateCodeList(ISOCodeList.COVERAGE_CODE.Id)
    coverageInfo.ClaimStatusCd = createClaimStatusCode(hasPayment)
    coverageInfo.ClaimStatusCd_elem.Codelistref = SearchRequest.findOrCreateCodeList(ISOCodeList.CLAIM_STATUS_CODE.Id)
    if (hasPayment) {
      claimsPayment.TotalPaymentAmt.Amt = payment as java.lang.String    
    }  
    return claimsPayment
  }
  
  /**
   * Called by createClaimsPayment to create a new ClaimsPaymentCovInfo
   * aggregate
   */
  protected function createClaimsPaymentCovInfo(coverageCode : String) : ClaimsPaymentCovInfo {
    var claimsPaymentCovInfo = new ClaimsPaymentCovInfo()
    if (coverageCode != null) {
      claimsPaymentCovInfo.CoverageCd_elem.Codelistref = SearchRequest.findOrCreateCodeList(ISOCodeList.COVERAGE_CODE.Id)
      claimsPaymentCovInfo.CoverageCd = coverageCode
    }
    return claimsPaymentCovInfo
  }

  /**
   * Called by createClaimsPayment to determine the value for the ClaimStatusCd
   * field
   */
  protected function createClaimStatusCode(hasPayment : boolean) : String {
    if (not Exposure.Closed) {
      return ISOConstants.OPEN_CLAIM_STATUS
    } else if (hasPayment) {
      return ISOConstants.CLOSED_CLAIM_STATUS
    } else {
      return ISOConstants.CLOSED_WITHOUT_PAYMENT_CLAIM_STATUS
    }
  }

  /**
   * Utility method for creating an ItemDefinition aggregate from a vehicle,
   * using the given itemType
   */
  protected function createItemDefinition(vehicle : Vehicle, itemType : String) : ItemDefinition {
    var itemDefinition = new ItemDefinition()
    itemDefinition.ItemTypeCd = itemType
    itemDefinition.Manufacturer = truncateString(vehicle.Make, 35)
    var model = vehicle.Model
    if (model.HasContent) {
      itemDefinition.Model = truncateString(model, 35)
    }
    var serialNumber = vehicle.Vin.HasContent
            ? vehicle.Vin : vehicle.SerialNumber
    itemDefinition.SerialIdNumber = truncateString(serialNumber, 20)
    itemDefinition.ModelYear = vehicle.Year as java.lang.String
    itemDefinition.ManufacturerCd = createManufacturerCode(vehicle)
    if (ISOConstants.MOBILE_EQUIPMENT_ITEM_TYPE.equals(itemType)) {
      itemDefinition.ModelCd = SearchRequest.Translate.optionallyTranslateTypeCode(vehicle.OffRoadStyle)
    }
    var vehicleStyleCode = SearchRequest.Translate.translateTypeCode(vehicle.Style)
    if (vehicleStyleCode != null) {
      itemDefinition.BodyTypeCd = vehicleStyleCode
    }
    return itemDefinition
  }

  /**
   * Called by createItemDefinition to determine the value for the
   * ManufacturerCd field
   */
  protected function createManufacturerCode(vehicle : Vehicle) : String {
    var manufacturer = vehicle.Manufacturer
    var make = vehicle.Make
    if (manufacturer == null) {
      return (make.length > 0) ? truncateString(make, 4) : null
    } else {
     return SearchRequest.Translate.optionallyTranslateTypeCode(manufacturer)
    }
  }  

  /**
   * Called by populate() to decide whether to add an InvestigationInfo
   * aggregate. Returns false by default, but is overriden to return true in
   * ISOWatercraftLossSection, ISOAutoLossSection and
   * ISOMobileEquipmentLossSection
   */
  protected property get ShouldAddInvestigationInfo() : boolean {
    return false
  }
  
  /**
  * If a vehicle, boat, or mobile equipment has been stolen and the insuring
  * agency is reporting the theft recovery information, then the
  * InvestigationInfo aggregate (including the RecoveryInfo and
  * SalvageInfo aggregates, if appropriate) should be added to the aggregates
  * reported.
  * <p>
  * This function is called by populate() if ShouldAddInvestigationInfo
  * is true.
  */
  protected function createAndAddInvestigationInfo() : InvestigationInfo {
    var recoveryInfo = createRecoveryInfo()
    var salvageInfo = createSalvageInfo()
    var totalLoss = Exposure.VehicleIncident.TotalLoss
    if (recoveryInfo != null or salvageInfo != null or totalLoss) {
      var investigationInfo = new InvestigationInfo()
      if (recoveryInfo != null) {
        investigationInfo.RecoveryInfo.add(recoveryInfo)
      } 
      if (salvageInfo != null) {
        investigationInfo.SalvageInfo.add(salvageInfo)
      }
      if (totalLoss) {
        var dispositionCode = new InvestigationInfo_VehDispositionCd()
        dispositionCode.Codelistref = SearchRequest.findOrCreateCodeList("VehDispositionCd")
        dispositionCode.Value = "T"
        investigationInfo.VehDispositionCd_elem.add(dispositionCode)
      }
      SearchRequest.AddRequest.InvestigationInfo.add(investigationInfo)
      return investigationInfo
    }   
    return null
  }

  /**
   * Creates a RecoveryInfo aggregate (sub aggregate of InvestigationInfo)
   * based on the exposure's VehicleIncident
   */
  protected function createRecoveryInfo() : RecoveryInfo {
    var recoveryAgent = findClaimsParty(RecoveringAgency)
    var recoveryConditionCode = SearchRequest.Translate.translateTypeCode(Exposure.VehicleIncident.RecovCondType)
    if (Exposure.VehicleIncident.RecovDate != null
            and Exposure.VehicleIncident.RecoveryLocation.State != null
            and recoveryAgent != null and recoveryConditionCode != null) {
      var recoveryInfo = new RecoveryInfo()      
      recoveryInfo.Addr = SearchRequest.createAddr(Exposure.VehicleIncident.RecoveryLocation)
      recoveryInfo.RecoveryDt = SearchRequest.Translate.formatClaimDate(Exposure.VehicleIncident.RecovDate) 
      recoveryInfo.RecoveryAgencyRef = recoveryAgent
      recoveryInfo.RecoveryStatusCd = {createRecoveryStatusCode(recoveryConditionCode).Value}
      return recoveryInfo
    }
    return null
  }
  
  /**
   * Creates a recovery status code StringCd for the given recovery condition
   * code. Used to populate RecoveryInfo.RecoveryStatusCds
   */
  protected function createRecoveryStatusCode(recoveryConditionCode : String) : StringCd {
    var roleCd = new StringCd()
    roleCd.Codelistref = SearchRequest.findOrCreateCodeList(ISOCodeList.RECOVERY_CONDITION_CODE.Id)
    roleCd.Value = recoveryConditionCode
    return roleCd
  }
  
  /**
   * Creates a SalvageInfo aggregate (sub aggregate of InvestigationInfo)
   * based on the exposure's VehicleIncident
   */
  protected function createSalvageInfo() : SalvageInfo {
    var salvageBuyer = findClaimsParty(SalvageBuyer)
    var ownerRetainingSalvage = Exposure.VehicleIncident.OwnerRetainingSalvage
    if (ownerRetainingSalvage != null
            and Exposure.VehicleIncident.DateSalvageAssigned != null) {
//      if (!ownerRetainingSalvage && salvageBuyer) {
//        return null
//      }
      var salvageInfo = new SalvageInfo()
      salvageInfo.SalvageDt = SearchRequest.Translate.formatClaimDate(Exposure.VehicleIncident.DateSalvageAssigned)
      salvageInfo.OwnerRetainingSalvageInd = 
        Exposure.VehicleIncident.OwnerRetainingSalvage ? ISOConstants.TRUE : ISOConstants.FALSE
      if (salvageBuyer != null) {
        salvageInfo.BuyerRef = salvageBuyer
      }
      return salvageInfo
    }
    return null
  }
  
  /**
   * Find the first ClaimsParty with the given role
   */
  protected function findClaimsParty(role : ISOClaimsPartyRole) : ClaimsParty {
     return SearchRequest.AddRequest.ClaimsParty.firstWhere(
             \ c -> c.ClaimsPartyInfo.ClaimsPartyRoleCd.hasMatch(
                     \ s -> s.equals(role.InternalCode)))
  }

  /**
   * String truncation utility, used to truncate string values that cannot
   * exceed a particular length
   */
  protected function truncateString(string : String, maxLength : int) : String {
    return SearchRequest.truncateString(string, maxLength)
  }
}
