package gw.api.iso
uses xsd.iso.req.AutoLossInfo
uses xsd.iso.req.Registration
uses gw.xml.xsd.IXMLNodeWithID
uses xsd.iso.req.ClaimsParty
uses gw.xml.XmlElement

/**
 * Creates an AutoLossInfo loss section, populated with information from the
 * exposure and exposure's vehicle incident
 */
@Export
class ISOAutoLossSectionBase extends ISOLossSection {  
  
  /**
   * Exposure level constructor, used when creating a request for just the
   * given exposure. Implicitly creates an ISOClaimSearchRequest.
   */
  construct(inExposure : Exposure)  {
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
   * Override of the standard populate method to add in the additional
   * com.iso.HitAndRunInd and com.iso.PhantomVehInd fields to the claims
   * occurrence. Returns the ACORD xml object representing the populated
   * claim search
   */
  public override function populate() : xsd.iso.req.ACORD {
    var acord = super.populate()
    var incident = Exposure.Incident
    var vehicleIncident = Exposure.VehicleIncident
    if (Exposure.VehicleIncident.HitAndRun != null) {
      SearchRequest.AddRequest.ClaimsOccurrence.ComIso_HitAndRunInd =
          Exposure.VehicleIncident.HitAndRun ? ISOConstants.YES : ISOConstants.NO
    }
    if (Exposure.VehicleIncident.PhantomVehicle != null) {
      SearchRequest.AddRequest.ClaimsOccurrence.ComIso_PhantomVehInd =
          Exposure.VehicleIncident.PhantomVehicle ? ISOConstants.YES : ISOConstants.NO
    }
    return acord
  }
  
  /**
   * The type of loss section aggregate created by this object - AutoLossInfo
   * in this case.
   */
  override property get LossSectionAggregateType() : Type {
    return AutoLossInfo
  }

  /**
   * Override the standard createLossSection method to create an AutoLossInfo
   * aggregate. The ClaimsParty represents the claimant and should be linked
   * to the AutoLossInfo aggregate
   */
  protected override function createLossSection(claimantParty : ClaimsParty) : XmlElement {
    // might need to check if vehicleIncident is null or not
    var lossInfo = createAutoLossInfo(claimantParty, Exposure.VehicleIncident)
    SearchRequest.AddRequest.AutoLossInfo.add(lossInfo)
    return lossInfo    
  }

  /**
   * Override to return true, so populate() will add an InvestigationInfo
   * aggregate
   */
  protected override property get ShouldAddInvestigationInfo() : boolean {
    return true
  }

  /**
   * Create the AutoLossInfo aggregate, populates it from the given vehicle
   * incident and links it to the given claimantParty.
   */
  protected function createAutoLossInfo(claimantParty : ClaimsParty, vehicleIncident : VehicleIncident) : AutoLossInfo {
    var vehicle = vehicleIncident.Vehicle
    var autoLossInfo = new xsd.iso.req.AutoLossInfo()
    autoLossInfo.Id = SearchRequest.getNextId()
    autoLossInfo.ClaimsPartyRefs = {claimantParty}
    autoLossInfo.VehInfo.Manufacturer = truncateString(vehicle.Make, 35)
    autoLossInfo.VehInfo.Model = truncateString(vehicle.Model, 35)    
    autoLossInfo.VehInfo.ModelYear = vehicle.Year as java.lang.String
    var vehicleStyleCode = SearchRequest.Translate.translateTypeCode(vehicle.Style)
    if (vehicleStyleCode != null) {
      autoLossInfo.VehInfo.VehBodyTypeCd = vehicleStyleCode
    }
    var registration = createRegistration(vehicle)
    if (registration != null) {
      autoLossInfo.VehInfo.Registration.add(registration)
    }
    autoLossInfo.VehInfo.VehIdentificationNumber = truncateString(vehicle.Vin, 20)
    autoLossInfo.ManufacturerCd = createManufacturerCode(vehicle)
    
    var collPoint = vehicleIncident.CollisionPoint
    if (collPoint != null) {
      autoLossInfo.ImpactPointCd = SearchRequest.Translate.translateTypeCode(collPoint)
    }
    
    return autoLossInfo
  }
  
  /**
   * Create a Registration sub aggregate based on the given vehicle. Returns
   * null if the vehicle does not contain enough information to construct the
   * aggregate.
   */
  protected function createRegistration(vehicle : Vehicle) : Registration{
    var registration : Registration = null
    if (vehicle.LicensePlate.HasContent or vehicle.State != null) {
      registration = new Registration() 
      if (vehicle.LicensePlate.HasContent) {
        registration.RegistrationNumber = vehicle.LicensePlate
      } 
      if (vehicle.State != null) {
        registration.StateProvCd = vehicle.State.Code
      }
    }
    return registration
  }
 
  /**
   * Override the standard, empty, implementation to set up the vehicle
   * specific driver and passenger roles. For example this may convert
   * CL (claimant) into CD (claimant driver).
   */
  override function modifyClaimantAndInsuredRoles() {
    SearchRequest.ClaimsParties.setDriver(Exposure.VehicleIncident.driver)
    for (passenger in Exposure.VehicleIncident.passenger) {
      SearchRequest.ClaimsParties.setPassenger(passenger)
    }
  }
}
