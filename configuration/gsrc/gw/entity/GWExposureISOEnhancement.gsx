package gw.entity
uses gw.api.locale.DisplayKey
uses gw.api.iso.ISOProperties
uses gw.api.iso.ISOTranslate
uses gw.api.iso.ISOBadRequestException
uses gw.api.iso.ISOInjuryLossSection
uses gw.api.iso.ISOMobileEquipmentLossSection
uses gw.api.iso.ISOWatercraftLossSection
uses gw.api.iso.ISOAutoLossSection
uses gw.api.iso.ISOWCLossSection
uses gw.api.iso.ISOPropertyLossSection
uses gw.api.iso.ISOCoverageCodes

/**
 * Exposure enhancements for ISO integration
 */
@Export
enhancement GWExposureISOEnhancement : Exposure {
  
  /**
   * Constructs a value to put in the InsuredId field of an ISO ClaimSearch
   * request for this exposure, based on the claim's claim number and the
   * exposure's order number
   */
  function getISOInsurerId(properties : ISOProperties) : String {
    return getISOInsurerId(properties, this.Claim.ClaimNumber)
  }

  /**
   * Constructs a value to put in the InsuredId field of an ISO ClaimSearch
   * request for this exposure, based on the given claim number and the
   * exposure's order number
   */
  function getISOInsurerId(properties : ISOProperties, claimNumber : String) : String {
    return claimNumber + properties.ClaimExposureNumberSeparator + this.ClaimOrder
  }

  /**
   * A mapper object giving the appropriate ISO policy type, coverage type
   * and loss type codes for this exposure 
   */
  property get ISOCoverageCodes() : ISOCoverageCodes {
    var policyCoverageCode = ISOTranslate.instance().getCoverageCodes(
        this.Claim.Policy.PolicyType, this.Claim.LOBCode, this.PrimaryCoverage,
        this.CoverageSubType, this.Claim.LossCause)
    if (policyCoverageCode == null) {
      throw new ISOBadRequestException(DisplayKey.get("Java.Error.ISO.IncorrectPolicyCoverage", 
          this.Claim.Policy.PolicyType.Code, this.PrimaryCoverage.Code,
          this.CoverageSubType.Code, this.LossParty.Code))
    }
    return policyCoverageCode
  }

  /**
   * The appropriate ISO loss section type to construct for this exposure, or
   * null if this exposure should not be sent to ISO
   */
  property get ISOLossSectionType() : Type {
    var lossSectionType : Type
    if (this.ExposureType == TC_BODILYINJURYDAMAGE || this.ExposureType == TC_MEDPAY) {
      lossSectionType = ISOInjuryLossSection
    } else if (this.ExposureType == TC_VEHICLEDAMAGE) {
      if (this.VehicleIncident.Vehicle.Style == TC_ATV || this.VehicleIncident.Vehicle.Style == TC_SNOWMOBILE) {
        lossSectionType = ISOMobileEquipmentLossSection
      } else if (this.VehicleIncident.Vehicle.Style == TC_BOAT) {
        lossSectionType = ISOWatercraftLossSection
      } else {
        lossSectionType = ISOAutoLossSection
      }
    } else if (this.ExposureType == TC_WCINJURYDAMAGE) {
       lossSectionType = ISOWCLossSection
    } else if (this.ExposureType == TC_PROPERTYDAMAGE || this.ExposureType == TC_LOSSOFUSEDAMAGE || this.ExposureType == TC_PERSONALPROPERTYDAMAGE
               || this.ExposureType == TC_DWELLING || this.ExposureType == TC_OTHERSTRUCTURE
               || this.ExposureType == TC_CONTENT || this.ExposureType == TC_LIVINGEXPENSES) {
      if (this.LossParty == TC_INSURED) {
        lossSectionType = ISOPropertyLossSection
      } else {
        lossSectionType = ISOInjuryLossSection
      }
    }
    return lossSectionType   
  }

  /**
   * Used on the exposure and medical details pages to decide whether the ISO
   * buttons should be visible
   */
  property get ISOButtonsVisible() : boolean {
    return perm.Exposure.edit(this) and !this.Claim.ISOClaimLevelMessaging
       and (this.Claim.LossType != LossType.TC_WC or this.ExposureType == ExposureType.TC_WCINJURYDAMAGE)
  }

  /**
   * Used on the exposure and medical details pages to decide whether the ISO
   * buttons should be available
   */
  property get ISOButtonsAvailable() : boolean {
    return this.ISOButtonsVisible and this.ISOStatus != TC_NOTOFINTEREST
        and this.isValid(TC_ISO) and this.Claim.ISOEnabled
        and this.Claim.isValid(TC_ISO, false)
  }
  
}
