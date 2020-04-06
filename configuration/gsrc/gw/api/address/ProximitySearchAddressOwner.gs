package gw.api.address
uses java.util.Set

@Export
class ProximitySearchAddressOwner extends ContactSearchAddressOwner{

  private var _contactSearchCriteria : ContactSearchCriteria
  private var _claim : Claim as Claim
  
  construct(contactSearchCriteria : ContactSearchCriteria, aClaim : Claim) {
    super(contactSearchCriteria)
    _contactSearchCriteria = contactSearchCriteria
    _claim = aClaim
  }

  override property set Address(value : Address) {
      _contactSearchCriteria.ProximitySearchCenter = value
  }
  
  override property get Address() : Address {
    return _contactSearchCriteria.ProximitySearchCenter
  }

  override property get HiddenFields() : Set<AddressOwnerFieldId> {
    return AddressOwnerFieldId.HIDDEN_FOR_PROXIMITY_SEARCH
  }
  
  override function isAvailable(fieldId : AddressOwnerFieldId) : boolean {
    return _contactSearchCriteria.ProximitySearchParameters != null
  }
  
}
