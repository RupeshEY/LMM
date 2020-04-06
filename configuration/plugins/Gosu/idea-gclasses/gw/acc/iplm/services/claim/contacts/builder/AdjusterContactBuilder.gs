package gw.acc.iplm.services.claim.contacts.builder

uses gw.acc.iplm.services.claim.contacts.ContactDetailsDTO

/**
 * This class create Adjuster Contact (Party)
 */
class AdjusterContactBuilder extends ContactBuilder {

  override function createContacts() : List<ClaimContact>{
    var newClaimContacts = new ArrayList<ClaimContact>()
    for(contactDetail in _contactDetails) {
      if (not hasAdjusterInformation(contactDetail)) {
        continue
      }

      var adjusterId = contactDetail.Name + "-" + contactDetail.Reference
      var newClaimContact = getClaimContactFromCurrentContacts(_contactRole, adjusterId)

      if (newClaimContact == null) {
        newClaimContact = new ClaimContact(_newClaim)
        newClaimContact.Contact = new Company(_newClaim)
        newClaimContact.Contact.LMContactID_Ext = adjusterId
      }

      newClaimContact.Contact.Name = contactDetail.Name
      newClaimContact.Contact.OriginalInsurerReference_Ext = contactDetail.Reference
      newClaimContacts.add(newClaimContact)
    }
    return newClaimContacts
  }

  private function hasAdjusterInformation(contactDetail: ContactDetailsDTO) : boolean {
    return contactDetail.Name.NotBlank
        and contactDetail.Reference.NotBlank
  }
}