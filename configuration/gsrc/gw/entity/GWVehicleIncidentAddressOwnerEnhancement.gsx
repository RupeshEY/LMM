package gw.entity
uses gw.api.address.VehicleIncidentAddressOwner
uses gw.api.address.CCAddressOwner

@Export
enhancement GWVehicleIncidentAddressOwnerEnhancement : VehicleIncident {

  /**
   * This wraps the LocationAddress property and should be used in the UI when an
   * AddressOwner is required. In all other cases use LocationAddress.
   */
  property get RecoveryAddressOwner() : CCAddressOwner {
    return new VehicleIncidentAddressOwner(this)  
  }
}
