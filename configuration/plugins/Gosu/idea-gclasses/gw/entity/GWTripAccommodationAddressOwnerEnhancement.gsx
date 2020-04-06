package gw.entity
uses gw.api.address.TripAccommodationAddressOwner
uses gw.api.address.CCAddressOwner

@Export
enhancement GWTripAccommodationAddressOwnerEnhancement : TripAccommodation {
  property get AddressOwner() : CCAddressOwner { 
    return new TripAccommodationAddressOwner(this)
  }
}
