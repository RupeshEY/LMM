package gw.api.address

/**
 * CCAddressOwner object for the AddnlTripAccommodation entity.
 * See AddressOwner and CCAddressOwner for details of what an
 * AddressOwner object does.
 */
@Export
class AddnlTripAccommodationAddressOwner extends ClaimRelatedAddressOwner {
  
  var _addnlTripAccommodation : AddnlTripAccommodation

  construct(addnlTripAccommodation : AddnlTripAccommodation) {
    super(getAddressProperty(entity.AddnlTripAccommodation, "Address"), addnlTripAccommodation.TripAccommodation.TripIncident.Claim)
    _addnlTripAccommodation = addnlTripAccommodation
  }
  
  override property get Owner() : KeyableBean {
    return _addnlTripAccommodation
  }

}
