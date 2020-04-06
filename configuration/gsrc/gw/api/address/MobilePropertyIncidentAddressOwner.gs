package gw.api.address

/**
 * CCAddressOwner object for the MobilePropertyIncident entity.
 * See AddressOwner and CCAddressOwner for details of what an
 * AddressOwner object does.
 */
@Export
class MobilePropertyIncidentAddressOwner extends ClaimRelatedAddressOwner {
  
  var _incident : MobilePropertyIncident
    
  construct(incident : MobilePropertyIncident) {
    super(getAddressProperty(entity.MobilePropertyIncident, "LocationAddress"), incident.Claim)
    _incident = incident
  }

  override property get Owner() : KeyableBean {
    return _incident
  }

}
