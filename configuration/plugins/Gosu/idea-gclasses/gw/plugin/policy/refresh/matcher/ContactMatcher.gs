package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for contacts.
 */
@Export
class ContactMatcher extends PolicyGraphMatcherBase<Contact>
{ 
  /**
   * Matches on Address Book UID, then TaxID, then display name.
   */
  override function doEntitiesMatch(c1:Contact, c2:Contact) : boolean {
    if(areBothNotNull(c1.AddressBookUID, c2.AddressBookUID)) {
      return c1.AddressBookUID.equals(c2.AddressBookUID)
    }
    
    if (areBothNotNull(c1.PolicySystemId, c2.PolicySystemId))
      return c1.PolicySystemId == c2.PolicySystemId

    if(not c1.Subtype.equals(c2.Subtype)) {
      return false
    }
    
    if(areBothNotNull(c1.TaxID, c2.TaxID)) {
      return c1.TaxID.equals(c2.TaxID)
    }
    //attempt to match on display name
    return c1.DisplayName.equals(c2.DisplayName)
  }

}
