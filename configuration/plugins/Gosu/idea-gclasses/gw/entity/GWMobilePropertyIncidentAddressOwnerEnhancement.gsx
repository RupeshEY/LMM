package gw.entity
uses gw.api.address.MobilePropertyIncidentAddressOwner
uses gw.api.address.CCAddressOwner

@Export
enhancement GWMobilePropertyIncidentAddressOwnerEnhancement : MobilePropertyIncident {

  /**
   * This wraps the LocationAddress property and should be used in the UI when an
   * AddressOwner is required. In all other cases use LocationAddress.
   */
  property get AddressOwner() : CCAddressOwner { 
    return new MobilePropertyIncidentAddressOwner(this)
  }
}
