package gw.api.address
uses gw.api.contact.ContactHandle
uses java.util.Set
uses java.util.Collections

/**
 * CCAddressOwner object for ContactHandles; ContactHandles are
 * used to refer to contacts that may be replaced by a sync
 * operation with the address book.
 * <p>
 * See AddressOwner and CCAddressOwner for details of what an
 * AddressOwner object does.
 */
@Export
class ContactHandleAddressOwner extends ContactAddressOwnerBase {

  private var _contactHandle : ContactHandle
    
  construct(contactHandle : ContactHandle) {
    _contactHandle = contactHandle
  }
  
  override property get Owner() : Contact {
    return _contactHandle.Contact
  }

  override property get RequiredFields() : Set<AddressOwnerFieldId> {
    return Collections.emptySet<AddressOwnerFieldId>()
  }

}
