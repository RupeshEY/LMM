package gw.api.iso
uses gw.api.locale.DisplayKey
uses xsd.iso.req.ClaimsParty
uses java.math.BigDecimal
uses xsd.iso.req.ClaimsPayment
uses xsd.iso.req.PropertyLossInfo
uses xsd.iso.req.AdjusterPartyInfo
uses xsd.iso.req.PropertySchedule
uses gw.xml.XmlElement
uses xsd.iso.req.anonymous.elements.PropertyLossInfo_ClaimsSubjectInsuranceInfo
uses java.util.List
uses gw.api.upgrade.Coercions

/**
 * Creates an PropertyLossInfo loss section as used for 1st party property
 * losses, populated with information from the exposure. There can only
 * be one PropertyLossInfo aggregate per request (even for claim level
 * requests) but that single aggregate can have multiple
 * ClaimsSubjectInsuranceInfo sub aggregates. So the first property loss
 * section to be added will add the PropertyLossInfo aggregate and the
 * first ClaimsSubjectInsuranceInfo sub aggregate, while subsequent
 * sections will add further ClaimsSubjectInsuranceInfo sub aggregates.
 * <p>
 * Note that multiple property loss sections are only possible when doing
 * claim level messaging. 
 */
@Export
class ISOPropertyLossSectionBase extends ISOLossSection {  

  /** Is this the first property loss section to be added to this request? */
  private var _isFirstPropertyLossSection = true
  
  /**
   * Exposure level constructor, used when creating a request for just the
   * given exposure. Implicitly creates an ISOClaimSearchRequest.
   */
  construct(inExposure : Exposure) {
    super(inExposure)
  }
  
  /**
   * Claim level constructor, for adding a new loss section to an existing
   * claim level request.
   */
  construct(inSearchRequest : ISOClaimSearchRequest, inExposure : Exposure) {
    super(inSearchRequest, inExposure)
  }
  
  /**
   * The type of loss section aggregate created by this object - PropertyLossInfo
   * in this case.
   */
  override property get LossSectionAggregateType() : Type {
    return PropertyLossInfo
  }

  /**
   * Override the standard createLossSection method to create or update a
   * PropertyLossInfo aggregate. The ClaimsParty represents the claimant and
   * is linked to the new PropertyLossInfo aggregate
   */
  protected override function createLossSection(claimantParty : ClaimsParty) : XmlElement {
    return addPropertyLossInfo(claimantParty)
  }
  
  /**
   * Override default checking. There can only be a single PropertyLossInfo
   * aggregate on a request. But if it is already being used for a normal first
   * party property loss, that is if it has at least one ClaimsSubjectInsuranceInfo,
   * then we can share the existing PropertyLossInfo and add a new
   * ClaimsSubjectInsuranceInfo.
   */
  override function verifyCanPopulate(existingLossSections : List<ISOLossSectionBase>) : String {
    var result : String = null
    var lossInfo = SearchRequest.AddRequest.PropertyLossInfoSingular
    if (lossInfo != null and lossInfo.ClaimsSubjectInsuranceInfo.Count == 0) {
      result = DisplayKey.get("Java.Error.ISO.NoMultiplePropertyLossInfo")
    }
    return result
  }
  
  /**
   * Overridden to do nothing, as we do not need this aggregate for property
   * loss sections
   */
  protected override function createProbableIncurredAmt() {
  }
  
  /**
   * Override of standard loss section behavior: PropertyLossInfos are only used
   * for first party losses, and can only have one associated ClaimsParty. If
   * there is an existing PropertyLossInfo we re-use its ClaimsParty rather than
   * trying to create a new one
   */
  override protected function createClaimantAndInsured() : ClaimsParty {
    var lossInfo = SearchRequest.AddRequest.PropertyLossInfoSingular
    if (lossInfo == null) {
      return super.createClaimantAndInsured()
    } else {
      _isFirstPropertyLossSection = false
      return lossInfo.getClaimsPartyRefs()[0].cast(ClaimsParty.Type)
    }
  }

  /**
   * Override of standard loss section behavior: only add adjuster if this is
   * the first property loss section; subsequent sections will just add
   * ClaimsSubjectInsuranceInfo sub aggregates, which cannot be associated with
   * a specific adjuster.
   */
  override protected function addAdjuster() : AdjusterPartyInfo {
    return _isFirstPropertyLossSection ? super.addAdjuster() : null
  }

  /**
   * Override of standard loss section behavior: for property loss info the
   * ClaimsPayment aggregate will be under ClaimsSubjectInsuranceInfo
   */
  protected override function createAndAddClaimsPayment(claimantParty : ClaimsParty) : ClaimsPayment {
    var claimsPayment : ClaimsPayment = null
    if (SearchRequest.AddRequest.PropertyLossInfoSingular.ClaimsSubjectInsuranceInfo.Count > 0) {
      claimsPayment = createClaimsPayment(claimantParty)
      claimsPayment.ClaimsPaymentCovInfo[0].CoverageCd = "PRPD"
      SearchRequest.AddRequest.PropertyLossInfoSingular.ClaimsSubjectInsuranceInfo.last().ClaimsPayment.add(claimsPayment)
    }
    return claimsPayment
  }

  /**
   * Creates or updates a PropertyLossInfo aggregate, and adds a new
   * ClaimsSubjectInsuranceInfo sub aggregate based on the exposure. If a new
   * PropertyLossInfo aggregate is created, it is linked to the given claimant
   * party.
   */
  protected function addPropertyLossInfo(claimantParty : ClaimsParty) : xsd.iso.req.PropertyLossInfo {
    var lossInfo = SearchRequest.AddRequest.PropertyLossInfoSingular
    if (lossInfo == null) {
      lossInfo = new PropertyLossInfo()
      SearchRequest.AddRequest.PropertyLossInfoSingular = lossInfo
      lossInfo.Id = SearchRequest.getNextId()
      lossInfo.ClaimsPartyRefs = {claimantParty}
    }
    lossInfo.ClaimsSubjectInsuranceInfo.add(createClaimsSubjectInsuranceInfo())
    var addressType = Exposure.FixedPropertyIncident.Property.Address.AddressType
    var propertyType = SearchRequest.Translate.translateTypeCode(addressType)
    if (propertyType != null and lossInfo.RealEstateTypeCd == null) {
      lossInfo.RealEstateTypeCd = propertyType
      if (propertyType.equals(ISOConstants.PROPERTY_TYPE_OTHER)) {
        var propertyDesc = Exposure.FixedPropertyIncident.PropertyDesc
        lossInfo.RealEstateTypeOtherDesc = truncateString(propertyDesc, 35)
      }
    }
    if (Exposure.Claim.PropertyFireDamage.Arson != null and lossInfo.IncendiaryFireInd == null){
      lossInfo.IncendiaryFireInd = (Exposure.Claim.PropertyFireDamage.Arson) ? ISOConstants.YES : ISOConstants.NO
    }
    if (Exposure.Claim.LocationOfTheft != null and lossInfo.TheftLocationCd == null) {
      lossInfo.TheftLocationCd = SearchRequest.Translate.translateTypeCode(Exposure.Claim.LocationOfTheft)
    }
    if (lossInfo.OccupancyTypeCd == null) {
      lossInfo.OccupancyTypeCd = SearchRequest.Translate.translateTypeCode(Exposure.FixedPropertyIncident.OccupancyType)
    }
    if (Exposure.LostPropertyType != null) {
      lossInfo.PropertySchedule.add(createPropertySchedule())
    }
    return lossInfo
  }
  
  /**
   * Creates a new ClaimsSubjectInsuranceInfo aggregate (sub aggregate of
   * PropertyLossInfo) based on the exposure.
   */
  protected function createClaimsSubjectInsuranceInfo() : PropertyLossInfo_ClaimsSubjectInsuranceInfo {
    var claimsSubjectInsuranceInfo = new PropertyLossInfo_ClaimsSubjectInsuranceInfo()
    var subjectInsuranceCd = SearchRequest.Translate.translateTypeCode(Exposure.ExposureType)
    claimsSubjectInsuranceInfo.SubjectInsuranceCd =subjectInsuranceCd
    if (subjectInsuranceCd == ISOConstants.SUBJECT_INSURANCE_BUILDING ||
        subjectInsuranceCd == ISOConstants.SUBJECT_INSURANCE_CONTENTS ||
        subjectInsuranceCd == ISOConstants.SUBJECT_INSURANCE_USEOCCUPANCY ||
        subjectInsuranceCd == ISOConstants.SUBJECT_INSURANCE_STOCK ||
        subjectInsuranceCd == ISOConstants.SUBJECT_INSURANCE_OTHER ) {
      var exposureLimit = Exposure.Coverage.ExposureLimit.Amount
      if (Exposure.Coverage.HasExposureLimit) {
        claimsSubjectInsuranceInfo.InsuranceAmt.Amt = exposureLimit as java.lang.String 
      }
    } 
    var lossEstimate = Exposure.Incident.LossEstimate
    if (lossEstimate != null && not lossEstimate.Amount.IsZero) {
      claimsSubjectInsuranceInfo.ProbableIncurredAmt.Amt = lossEstimate.Amount as java.lang.String
    }
    return claimsSubjectInsuranceInfo 
  }

  /**
   * Creates a PropertySchedule aggregate, used for theft and populated from the
   * exposure's LostPropertyType
   */    
  protected function createPropertySchedule() : PropertySchedule {
    var propertySchedule = new PropertySchedule()
    propertySchedule.IsSummaryInd = IsSummary ? ISOConstants.TRUE : ISOConstants.FALSE
    propertySchedule.ItemDefinition.ItemTypeCd = SearchRequest.Translate.translateTypeCode(Exposure.LostPropertyType) 
    var subjectInsuranceCodeList = SearchRequest.findOrCreateCodeList(ISOCodeList.SUBJECT_INSURANCE_CODE.Id) 
    propertySchedule.ItemDefinition.ItemTypeCd_elem.Codelistref = subjectInsuranceCodeList
    return propertySchedule
  }
  
  /**
   * Used to populate the PropertySchedule.IsSummaryInd field. Not mapped in the
   * out of box datamodel so default implementation just returns true - could be
   * overridden by a customer
   */
  protected property get IsSummary() : boolean {
    return true
  }
}
