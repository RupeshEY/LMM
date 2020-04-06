package gw.api.address

uses java.util.Set

/**
 * CCAddressOwner object for the VehicleIncident entity.
 * See AddressOwner and CCAddressOwner for details of what an
 * AddressOwner object does.
 */
@Export
class VehicleIncidentAddressOwner extends ClaimRelatedAddressOwner {

  private var _incident : VehicleIncident
    
  construct(incident : VehicleIncident) {
    super(getAddressProperty(entity.VehicleIncident, "RecoveryLocation"), incident.Claim)
    _incident = incident
  }
  
  override property get RequiredFields() : Set<AddressOwnerFieldId> {
    return CCAddressOwnerFieldId.NO_FIELDS
  }

  override property get Owner() : KeyableBean {
    return _incident
  }

}
