package gw.plugin.contact.ab900

uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.RelatedContactInfoContainer_SourceRelatedContacts_Entry
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.RelatedContactInfoContainer_TargetRelatedContacts_Entry
uses entity.Contact

/*
*  This class contains methods to map the RelatedInfoContainer to Contact.
*  If you add any properties to source or target entries in RelatedInfoContainer, you need to
*  update this file to make sure the properties are mapped back to the Contact that is returned
*  from the retrieveRelatedContact call.
*/
@Export
class ContactRelatedContactInfoContainerMapper {

  private construct() { }

  /**
   * Populate a contact from the RelatedContactInfoContainer_TargetRelatedContacts_Entry
   *
   * @param contact the Contact to populate
   * @param relContactEntry a TargetRelatedContact entry from the RelatedContactInfoContainer
   */
  public static function populateContactFromTargetRelatedContactEntry(contact : Contact, 
                                                      relContactEntry : RelatedContactInfoContainer_TargetRelatedContacts_Entry) : Contact {

    contact.AddressBookUID = relContactEntry.ContactLinkID
    contact.Name = relContactEntry.ContactName
    if(contact typeis Person) {
      contact.FirstName = relContactEntry.ContactFirstName
      contact.LastName = relContactEntry.ContactLastName
    }
    
    return contact                                                    
  }

  /**
   * Populate a contact from the RelatedContactInfoContainer_SourceRelatedContacts_Entry
   *
   * @param contact the Contact to populate
   * @param relContactEntry a SourceRelatedContact entry from the RelatedContactInfoContainer
   */
  public static function populateContactFromSourceRelatedContactEntry(contact : Contact, 
                                                      relContactEntry : RelatedContactInfoContainer_SourceRelatedContacts_Entry) : Contact {

    contact.AddressBookUID = relContactEntry.ContactLinkID
    contact.Name = relContactEntry.ContactName
    if(contact typeis Person) {
      contact.FirstName = relContactEntry.ContactFirstName
      contact.LastName = relContactEntry.ContactLastName
    }
    
    return contact                                                    
  }

}
