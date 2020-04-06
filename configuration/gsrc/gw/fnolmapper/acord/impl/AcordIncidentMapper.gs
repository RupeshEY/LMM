package gw.fnolmapper.acord.impl

uses entity.VehicleIncident
uses entity.BodyPartDetails
uses gw.fnolmapper.acord.IIncidentMapper
uses typekey.State
uses entity.Incident
uses gw.fnolmapper.acord.ContactManager
uses gw.fnolmapper.acord.AcordUtil
uses entity.InjuryIncident
uses gw.fnolmapper.acord.AcordConfig
uses entity.Vehicle
uses entity.FixedPropertyIncident

uses xsd.acord.AutoLossInfo
uses xsd.acord.LiabilityLossInfo
uses xsd.acord.PropertyLossInfo
uses xsd.acord.WorkCompLossInfo
uses xsd.acord.ClaimsInjuredInfo

uses xsd.acord.ClaimsParty
uses gw.api.address.AddressJurisdictionHandler
uses gw.api.admin.BaseAdminUtil

/**
 * Maps an ACORD XML element(s) to Incidents on a Claim.
 */
@Export
class AcordIncidentMapper implements IIncidentMapper
{
  var config:AcordConfig
  var contactManager:ContactManager
  
  construct(configuration:AcordConfig, contactMgr:ContactManager) {
    this.config = configuration
    this.contactManager = contactMgr
  }
  
  //gets an auto loss incident
  override function getVehicleIncident(claim:Claim, autoLossInfo:AutoLossInfo) : VehicleIncident {
     var incident = claim.newIncident(VehicleIncident) as VehicleIncident
     incident.Description = autoLossInfo.DamageDesc
     if(autoLossInfo.ImpactPointCd!=null or involvesCollision(autoLossInfo))
       incident.Collision = true
     if(autoLossInfo.ProbableIncurredAmt.Amt!=null) {
       incident.LossEstimate = AcordUtil.getCurrencyAmount(autoLossInfo.ProbableIncurredAmt.Amt, 
         autoLossInfo.ProbableIncurredAmt.CurCd)
     }
     if(autoLossInfo.VehInfo!=null) {
       var vehicle = new Vehicle()
       vehicle.Make = autoLossInfo.VehInfo.Manufacturer
       vehicle.Model = autoLossInfo.VehInfo.Model
       vehicle.Year = autoLossInfo.VehInfo.ModelYear
       vehicle.Vin = autoLossInfo.VehInfo.VehIdentificationNumber
       vehicle.State = getVehicleJurisdiction(autoLossInfo)
       vehicle.LicensePlate = autoLossInfo.VehInfo.LicensePlateNumber
       incident.Vehicle = vehicle
     }
     //associate driver contact with incident
     for(claimPartyRef in autoLossInfo.ClaimsPartyRefs) {
       var claimParty:ClaimsParty = claimPartyRef as ClaimsParty
       var contact = contactManager.getById(claimParty.Id)
       if(contact!=null and claimParty.hasRole( AcordUtil.ROLE_DRIVER)) {
         var rel = claimParty.ClaimsPartyInfo.RelationshipToInsuredCd_elem.$Text
         incident.DriverRelation = config.getPersonRelationTypeMap().get(rel)
         incident.driver = contact.Person
       }
     }
     return incident
  }

  private function getVehicleJurisdiction(autoLossInfo:AutoLossInfo): Jurisdiction {
    var state = State.get(autoLossInfo.VehInfo.RegistrationStateProvCd)
    var country:Country = null;
    if(not autoLossInfo.VehInfo.Registration.Empty) {
       var countryCode = autoLossInfo.VehInfo.Registration.first().CountryCd
       if(countryCode.HasContent) {
         country = typekey.Country.get(countryCode)
       }
    }
    //use default if not found on VehInfo
    if(country==null) {
      country = BaseAdminUtil.DefaultCountry
    }
    return AddressJurisdictionHandler.getJurisdiction(state, country)
  }
  
  //gets a liability loss incident
  override function getGenLiabilityIncident(claim:Claim, glLossInfo:LiabilityLossInfo) : Incident {
    var incident = claim.newIncident(Incident)
    incident.Description = glLossInfo.ItemDesc
    if(glLossInfo.ProbableIncurredAmt.Amt!=null) {
      incident.LossEstimate = AcordUtil.getCurrencyAmount(glLossInfo.ProbableIncurredAmt.Amt, 
        glLossInfo.ProbableIncurredAmt.CurCd)
    }
    return incident
  }
  
  //gets a property loss incident
  override function getPropertyIncident(claim:Claim, propLossInfo:PropertyLossInfo) : PropertyIncident {
    var incident = claim.newIncident(FixedPropertyIncident) as FixedPropertyIncident
    incident.Description = propLossInfo.DamageDesc
    if(propLossInfo.ProbableIncurredAmt.Amt!=null) {
      incident.LossEstimate = AcordUtil.getCurrencyAmount(propLossInfo.ProbableIncurredAmt.Amt, propLossInfo.ProbableIncurredAmt.CurCd)
    }
    for(claimPartyRef in propLossInfo.ClaimsPartyRefs) {
      var claimParty:ClaimsParty = claimPartyRef.cast(ClaimsParty.Type)
      if(claimParty.hasRole(AcordUtil.ROLE_PROPERTY_OWNER))
         incident.Property.Address =
            contactManager.getById(claimParty.Id).Contact.PrimaryAddress
    }
    return incident
  }

  //used for claimant injury incidences
  override function getInjuryIncident(claim:Claim, injuryInfo:ClaimsInjuredInfo) : InjuryIncident {
    var incident = claim.newIncident(InjuryIncident) as InjuryIncident
    incident.Description = injuryInfo.EventsDesc
    for(injury in injuryInfo.ClaimsInjury) {
      var bodyPart = new BodyPartDetails()
        bodyPart.PrimaryBodyPart = config.getBodyPartTypeMap().get(injury.BodyPartDesc)
        incident.addToBodyParts(bodyPart)
     }
     return incident
  }
  
  //gets a worker's comp loss incident
  override function getWorkCompIncident(claim:Claim, wcLossInfo:WorkCompLossInfo) : InjuryIncident {
    var incident = claim.newIncident(InjuryIncident) as InjuryIncident
    if(wcLossInfo.WCClaimTypeCd_elem.$Text.equalsIgnoreCase("LostTime"))
      incident.LostWages = true
    return incident
  }
  
  ////////////////////////////////////////////////////////////////////////////////////////////////////////
  /// Private methods                                                                                  ///
  ////////////////////////////////////////////////////////////////////////////////////////////////////////  
  
  
  //checks for "driver other" role
  private function involvesCollision(autoLossInfo:AutoLossInfo) : boolean {
    for(claimsPartyRef in autoLossInfo.ClaimsPartyRefs) {
      if((claimsPartyRef as ClaimsParty).hasRole(AcordUtil.ROLE_DRIVER_OTHER) or 
        (claimsPartyRef as ClaimsParty).hasRole(AcordUtil.ROLE_DRIVER))
        return true;
    }
    return false;
  }
}
