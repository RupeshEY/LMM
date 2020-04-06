package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for ContactAddress.
 */
@Export
class ContactAddressMatcher extends InitializablePolicyGraphMatcherBase<ContactAddress> {
  
  /**
   * Matches on the AddressBook UID, then on the related Address and Contact.
   */
  override function doEntitiesMatch(contactAddr1 : ContactAddress, contactAddr2 : ContactAddress) : boolean {
    if(areBothNotNull(contactAddr1.AddressBookUID, contactAddr2.AddressBookUID)) {
      return contactAddr1.AddressBookUID.equals(contactAddr2.AddressBookUID)
    }
    return doRelatedEntitiesMatch(contactAddr1.Address, contactAddr2.Address) 
      and doRelatedEntitiesMatch(contactAddr1.Contact, contactAddr2.Contact)
  }

}
