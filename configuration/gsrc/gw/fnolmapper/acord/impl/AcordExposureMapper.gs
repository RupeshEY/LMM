package gw.fnolmapper.acord.impl

uses gw.fnolmapper.acord.ContactManager
uses entity.InjuryIncident
uses entity.ClaimContact
uses entity.Incident
uses entity.VehicleIncident
uses gw.fnolmapper.acord.AcordConfig
uses gw.fnolmapper.acord.IExposureMapper
uses typekey.ExposureType
uses typekey.CoverageType
uses typekey.LossPartyType
uses gw.fnolmapper.acord.AcordUtil
uses entity.Exposure
uses typekey.ContactRole

uses xsd.acord.AutoLossInfo
uses xsd.acord.LiabilityLossInfo
uses xsd.acord.PropertyLossInfo
uses xsd.acord.WorkCompLossInfo
uses xsd.acord.ClaimsPartyInfo
uses java.lang.StringBuilder
uses xsd.acord.ClaimsInjuredInfo
uses xsd.acord.ClaimsParty
uses xsd.acord.Coverage
uses gw.api.fnolmapper.FNOLMapperException
uses java.util.List

/**
 * Maps an ACORD XML element(s) to Exposures on a Claim.
 */
@Export
class AcordExposureMapper implements IExposureMapper
{
  var config:AcordConfig
  var contactManager:ContactManager
  
  construct(configuration:AcordConfig, contactMgr:ContactManager) {
    this.config = configuration
    this.contactManager = contactMgr
  }
  
  //returns an exposure for an Auto Loss incident
  override function getVehicleExposure(claim:Claim, autoLossInfo:AutoLossInfo, incident:VehicleIncident) : Exposure {
    var exposure:Exposure
    var coverageType = getCoverageType(autoLossInfo.Coverage)
    //if coverage type is referenced from AutoLossInfo, use that
    if(coverageType!=null) {
      exposure = newExposure(coverageType, ExposureType.TC_VEHICLEDAMAGE, claim)
    } else {
      //attempt to determine coverage type elsewhere
      if(incident.Collision) {
        //Collision
        exposure = newExposure(typekey.CoverageType.TC_PACOLLISIONCOV, CoverageSubtype.TC_PACOLLISIONCOV, claim)
      } else if(containsPropertyOwner(autoLossInfo)) {
        //Property damage
        var coverageSubType = autoLossInfo.PropertyDamagedVehInd ?
          CoverageSubtype.TC_PALIABILITYCOV_VD:CoverageSubtype.TC_PALIABILITYCOV_PD
        exposure = newExposure(typekey.CoverageType.TC_PALIABILITYCOV, coverageSubType, claim)
      } else {
        //Comprehensive
        exposure = newExposure(typekey.CoverageType.TC_PACOMPREHENSIVECOV, CoverageSubtype.TC_PACOMPREHENSIVECOV, claim)
      }
    }
    exposure.VehicleIncident = incident

    for(var claimPartyRef in autoLossInfo.ClaimsPartyRefs) {
      var claimParty:ClaimsParty = claimPartyRef as ClaimsParty
      var contact = contactManager.getById(claimParty.Id)
      if(claimParty.hasRole( AcordUtil.ROLE_DRIVER_OTHER) and contact!=null)
        setExposureOnRole(contact, ContactRole.TC_DRIVER, exposure)
      if(claimParty.hasRole(AcordUtil.ROLE_VEHICLE_OWNER)) {
        if(contact!=null)
          setExposureOnRole(contact, ContactRole.TC_DRIVER, exposure)
        if(claimParty.ClaimsPartyInfo.ClaimsPartyLocCd_elem.$Text==AcordUtil.LOC_IN_VEHICLE)
          exposure.LossParty = LossPartyType.TC_INSURED
        setOtherCoverageInfo(exposure, claimParty.ClaimsPartyInfo)
      }
    }
    //if loss party not set, it is 3rd party
    if(exposure.LossParty==null) exposure.LossParty = LossPartyType.TC_THIRD_PARTY
    return exposure
  }
  
  //returns an exposure for a General Liability incident
  override function getGenLiabilityExposure(claim:Claim, glLossInfo:LiabilityLossInfo, incident:Incident) : Exposure {
    var exposure:Exposure
    var coverageType = getCoverageType(glLossInfo.Coverage)
    if(coverageType!=null) {
      exposure = newExposure(coverageType, ExposureType.TC_GENERALDAMAGE, claim)
    } else {
      exposure = newExposure(typekey.CoverageType.TC_GLCGLCOV, ExposureType.TC_GENERALDAMAGE, claim)
    }
    exposure.Incident = incident
    exposure.LossParty = LossPartyType.TC_THIRD_PARTY
    return exposure
  }
  
  //returns an exposure for a Property Loss incident
  override function getPropertyExposure(claim:Claim, propLossInfo:PropertyLossInfo, incident:PropertyIncident) : Exposure {
    var exposure:Exposure
    var exposureType:ExposureType
    if(claim.Policy.PolicyType==PolicyType.TC_HOMEOWNERS)
      exposureType = typekey.ExposureType.TC_PERSONALPROPERTYDAMAGE
    else //if(claim.Policy.CommercialPolicy)
      exposureType = typekey.ExposureType.TC_PROPERTYDAMAGE
    var coverageType = getCoverageType(propLossInfo.Coverage)
    if(coverageType!=null) {
      exposure = newExposure(coverageType, exposureType, claim)
    } else {
      exposure = newExposure(typekey.CoverageType.TC_CPBLDGCOV, exposureType, claim)
    }
    exposure.Incident =  incident
    exposure.LossParty = LossPartyType.TC_THIRD_PARTY
    return exposure
  }
  
  //returns an exposure for a Worker's Comp Loss incident
  override function getWorkCompExposure(claim:Claim, wcLossInfo:WorkCompLossInfo, incident:Incident) : Exposure {
    var exposure:Exposure
    //determine from WC claim type (required)
    if(wcLossInfo.WCClaimTypeCd_elem==null)
      throw new FNOLMapperException("Cannot create Worker's Comp exposure from a <WorkCompLossInfo> without a <WCClaimTypeCd> element")
    var wctype = wcLossInfo.WCClaimTypeCd_elem.$Text
    if(wctype.equalsIgnoreCase("BecameMed") or wctype.equalsIgnoreCase("Medical")) {
      exposure = newExposure(CoverageType.TC_WCWORKERSCOMPCOV, CoverageSubtype.TC_WCWORKERSCOMPMED, claim)
    } 
    else if(wctype.equalsIgnoreCase("Indemnity") or wctype.equalsIgnoreCase("LostTime")) {
      exposure = newExposure(CoverageType.TC_WCWORKERSCOMPCOV, CoverageSubtype.TC_WCWORKERSCOMPWAGES, claim)
    }
    else {
      exposure = newExposure(CoverageType.TC_WCEMPLIABCOV, CoverageSubtype.TC_WCEMPLIABCOV,claim)
    }
    exposure.Incident = incident
    return exposure
  }
  
  //for third-party claimant's bodily injuries
  override function getInjuryExposure(claim:Claim, injuryInfo:ClaimsInjuredInfo, incident:InjuryIncident) : Exposure {
    var exposure = newExposure(claim) 
    exposure.ExposureType = ExposureType.TC_BODILYINJURYDAMAGE
    if(claim.Policy.PolicyType==PolicyType.TC_PERSONALAUTO or claim.Policy.PolicyType==PolicyType.TC_BUSINESSAUTO)
      exposure.PrimaryCoverage = typekey.CoverageType.TC_PALIABILITYCOV
    else if(claim.Policy.PolicyType==PolicyType.TC_TRAVEL_PER)
      exposure.PrimaryCoverage = typekey.CoverageType.TC_TRIP
    else if(claim.Policy.PolicyType == PolicyType.TC_PROF_LIABILITY)
      exposure.PrimaryCoverage = typekey.CoverageType.TC_MALP
    else  //assume GL
      exposure.PrimaryCoverage = typekey.CoverageType.TC_GLCGLCOV
    exposure.LossParty = LossPartyType.TC_THIRD_PARTY
    exposure.Incident = incident
    return exposure
  }
  
  /////////////////////////////////////////////////////////////////////////////////////////////
  /// Private functions                                                                     ///
  /////////////////////////////////////////////////////////////////////////////////////////////
  
  //Creates a new exposure on the given claim (only basic info populated)
  private function newExposure(claim:Claim) : Exposure {
    var exposure = new Exposure()
    exposure.ClaimOrder = claim.MaxClaimOrder + 1
    exposure.State = ExposureState.TC_DRAFT
    claim.addToExposures(exposure)
    return exposure
  }
 
  //Creates a new exposure from the CoverageType and CoverageSubtype on the given claim
  private function newExposure(coverageType:CoverageType,coverageSubtype:CoverageSubtype, claim:Claim) : Exposure {
    return claim.newExposureWithNoIncident(coverageType, coverageSubtype, 
      matchCoverage(claim.Policy, coverageType))
  }
  
  //Creates a new exposure from the CoverageType and CoverageSubtype on the given claim
  private function newExposure(coverageType:CoverageType, exposureType:ExposureType, claim:Claim) : Exposure {
    var exposure = newExposure(claim)
    exposure.PrimaryCoverage = coverageType
    exposure.ExposureType = exposureType
    exposure.CoverageSubType = exposure.getPossibleCoverageSubtypes(coverageType).first()
    return exposure
  }
  
  //Checks for property owner 
  private function containsPropertyOwner(autoLossInfo:AutoLossInfo) : boolean {
    for(claimsPartyRef in autoLossInfo.ClaimsPartyRefs) {
      if((claimsPartyRef as ClaimsParty).hasRole(AcordUtil.ROLE_PROPERTY_OWNER))
        return true;
    }
    return false;
  }
  
  //Finds the CoverageType from the first Coverage element
  private function getCoverageType(coverages:List<Coverage>) : CoverageType {
     if(coverages.HasElements) {
       //print("[DEBUG] CategoryEnum: " + coverages.first().CategoryCd_elem.Text)
       return getCoverageType(coverages.first().CategoryCd_elem.$Text)
     }
     return null
  }
  
  private function getCoverageType(code:String) : CoverageType {
    return config.getCoverageTypeMap().get(code)
  }
  
  //attempts to match a coverage on the policy from a given coverage type
  private function matchCoverage(policy:Policy, coverageType: CoverageType) : entity.Coverage {
     var coverages : entity.Coverage[] = policy.getCoveragesByCoverageType(coverageType)
     if(!coverages.HasElements) return null
     return coverages.first()
  }
  
  //sets the exposure on the given role for the contact
  private function setExposureOnRole(contact:ClaimContact, whichRole:ContactRole, exposure:Exposure) {
    var roleEx = contact.Roles.firstWhere(\ cr -> {return cr.Role==whichRole}).Exposure
    if(roleEx==null) roleEx = exposure
  }
  
  //sets some additional info on the exposure: 
  private function setOtherCoverageInfo(exposure:Exposure, claimPartyInfo:ClaimsPartyInfo) {
    if(claimPartyInfo.OtherOrPriorPolicy!=null and claimPartyInfo.OtherOrPriorPolicy.size() > 0) {
      exposure.OtherCoverage = true
      var sb = new StringBuilder()
      for(otherPolicy in claimPartyInfo.OtherOrPriorPolicy) {
        if(otherPolicy.InsurerName!=null) sb.append(sb.length()>0 ? "," : "").append(otherPolicy.InsurerName)
        if(otherPolicy.PolicyNumber!=null) sb.append(sb.length()>0 ? "," : "").append(otherPolicy.PolicyNumber)
        if(otherPolicy.LOBCd!=null) sb.append(sb.length()>0 ? "," : "").append(otherPolicy.LOBCd)
      }
      exposure.OtherCoverageInfo = sb.toString()
    }
  }
}
