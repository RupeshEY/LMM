package util.lvwrapper
uses gw.lang.reflect.IType

@Export
class ClaimContactContactLVWrapper
{
    private var _contactContact : ContactContact;
    private var _claim : Claim;
    private var _primaryContact : Contact;
  
    construct(contactContact : ContactContact, primaryContact : Contact, claim : Claim)  
    {
      _contactContact = contactContact
      _primaryContact = primaryContact
      _claim = claim
    }
  
    property get OtherContact(): Contact{
      return _contactContact.getOtherContact(_primaryContact)
    }
  
    property get OtherContactType(): IType {
      return _contactContact.getOtherCommonContactType(_primaryContact)
    }
  
    property set OtherContact(contact : Contact) {
      _claim.resolveAndSetContactContact(_contactContact, _primaryContact, contact)
    }
  
    property get BidiRel(): ContactBidiRel{
      return _contactContact.getBidiRel(_primaryContact)
    }
  
    property set BidiRel(newBidiRel : ContactBidiRel) {
      _contactContact.setBidiRel(_primaryContact, newBidiRel)  
    }
}
