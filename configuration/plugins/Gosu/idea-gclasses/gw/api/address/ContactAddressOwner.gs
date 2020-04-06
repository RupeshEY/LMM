package gw.api.address


/**
 * CCAddressOwner object for the Contact entity.
 * See AddressOwner and CCAddressOwner for details of what an
 * AddressOwner object does.
 */
@Export
class ContactAddressOwner extends ContactAddressOwnerBase {
  
  private var _contact : Contact
    
  construct(contact : Contact) {
    _contact = contact
  }
  
  override property get Owner() : Contact {
    return _contact
  }
}
