package util.lvwrapper
uses gw.lang.reflect.IType


@Export
class ContactContactLVWrapper
{
  private var _contactContact : ContactContact;
  private var _primaryContact : Contact;
  
  construct(contactContact : ContactContact, primaryContact : Contact)  
  {
    _contactContact = contactContact
    _primaryContact = primaryContact
  }
  
  property get OtherContact(): Contact{
    return _contactContact.getOtherContact(_primaryContact)
  }
  
  property set OtherContact(contact : Contact) {
    _contactContact.setOtherContact(_primaryContact, contact)  
  }
  
  property get OtherContactType(): IType {
    return _contactContact.getOtherCommonContactType(_primaryContact)
  }

  public function setNoneSelected(){
    _contactContact.setOtherContact(_primaryContact, null)  
  }

  property get BidiRel(): ContactBidiRel{
    return _contactContact.getBidiRel(_primaryContact)
  }
  
  property set BidiRel(newBidiRel : ContactBidiRel) {
    _contactContact.setBidiRel(_primaryContact, newBidiRel)  
  }

  
}
