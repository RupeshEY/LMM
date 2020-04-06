package gw.acc.iplm.services.claim.contacts.builder

uses com.google.common.base.Strings


/**
 * This class create Bureue Lead Contact (Party)
 */
class BureauLeadContactBuilder extends ContactBuilder {

  override function createContacts() : List<ClaimContact> {
    var newClaimContacts = new ArrayList<ClaimContact>()
    for(contactDetail in _contactDetails) {
      var name = contactDetail.Name

      if (Strings.isNullOrEmpty(name) or name == contactDetail.ReceiverName) {
        continue
      }

      var newClaimContact = getClaimContactFromCurrentContacts(_contactRole, name)

      if (newClaimContact == null) {
        newClaimContact = new ClaimContact(_newClaim)
      }

      newClaimContact.Contact = new Company(_newClaim)
      newClaimContact.Contact.Name = name
      newClaimContact.Contact.LMContactID_Ext = name

      newClaimContacts.add(newClaimContact)
    }
    return newClaimContacts
  }
}