package gw.acc.iplm.services.claim.contacts.builder

uses gw.acc.iplm.services.claim.contacts.ContactDetailsDTO

class LawyerContactBuilder extends ContactBuilder {

  /**
   * This class create Lawyer Contact (Party)
   */
  override function createContacts() : List<ClaimContact> {
    var newClaimContacts = new ArrayList<ClaimContact>()
    for(contactDetail in _contactDetails) {
      if (not hasLawyerInformation(contactDetail)) {
        continue
      }

      var lawyerId = contactDetail.Name + "-" + contactDetail.Reference
      var newClaimContact = getClaimContactFromCurrentContacts(_contactRole, lawyerId)
      if (newClaimContact == null) {
        newClaimContact = new ClaimContact(_newClaim)
        newClaimContact.Contact = new Attorney(_newClaim)
        newClaimContact.Contact.LMContactID_Ext = lawyerId
      }
      newClaimContact.Contact.Name = contactDetail.Name
      newClaimContact.Contact.OriginalInsurerReference_Ext = contactDetail.Reference

      newClaimContacts.add(newClaimContact)
    }
    return newClaimContacts
  }

  private function hasLawyerInformation(contactDetail: ContactDetailsDTO) : boolean {
    return contactDetail.Name.NotBlank
        and contactDetail.Reference.NotBlank
  }

}