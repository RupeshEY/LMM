package gw.entity
uses gw.api.address.CCAddressOwner
uses gw.api.address.LocationBasedRUAddressOwner

@Export
enhancement GWLocationBasedRUAddressOwnerEnhancement : entity.LocationBasedRU {

  property get AddressOwner() : CCAddressOwner {
    return new LocationBasedRUAddressOwner(this)
  }

}
