package gw.api.address

/**
 * CCAddressOwner object for the TripAccommodation entity.
 * See AddressOwner and CCAddressOwner for details of what an
 * AddressOwner object does.
 */
@Export
class TripAccommodationAddressOwner extends ClaimRelatedAddressOwner {
  
  private var _tripAccommodation : TripAccommodation
    
  construct(tripAccommodation : TripAccommodation) {
    super(getAddressProperty(entity.TripAccommodation, "Address"), tripAccommodation.TripIncident.Claim)
    _tripAccommodation = tripAccommodation
  }
  
  override property get Owner() : KeyableBean {
    return _tripAccommodation
  }
}