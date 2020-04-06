package gw.api.address

/**
 * CCAddressOwner object for the LocationBasedRU entity.
 * See AddressOwner and CCAddressOwner for details of what an
 * AddressOwner object does.
 */
@Export
class LocationBasedRUAddressOwner extends PolicyRelatedAddressOwner {

  var _riskUnit : LocationBasedRU
  
  construct(riskUnit : LocationBasedRU) {
    super(getAddressProperty(entity.PolicyLocation, "Address"), riskUnit.Policy)
    _riskUnit = riskUnit
  }
  
  override property get Addresses() : Address[] {
    return null
  }
  
  override property get Owner() : KeyableBean {
    return _riskUnit.PolicyLocation
  }

}
