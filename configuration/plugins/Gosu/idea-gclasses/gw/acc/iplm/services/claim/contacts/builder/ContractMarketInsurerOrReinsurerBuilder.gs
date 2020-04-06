package gw.acc.iplm.services.claim.contacts.builder

/**
 * This class create ACL(ECF Agreement parties) InsurerOrReinsurer.
 */
class ContractMarketInsurerOrReinsurerBuilder extends ContactBuilder {

  override function createContacts(): List<ClaimContact> {
    var newClaimContacts = new ArrayList<ClaimContact>()

    for (contactDetail in _contactDetails) {
      var newClaimContact = getClaimContactFromCurrentContacts(_contactRole, contactDetail.Id)
      var contact: Company

      if (newClaimContact == null) {
        contact = new Company(_newClaim)
        contact.LMContactID_Ext = contactDetail.Id

        newClaimContact = new ClaimContact(_newClaim)
        newClaimContact.Contact = contact
      }

      contact = newClaimContact.Contact as Company
      contact.Name = contactDetail.Name
      contact.ECFBureauId_Ext = contactDetail.Id
      contact.ECFBureauType_Ext = ECFBureauType_Ext.get(contactDetail.Agency)
      newClaimContact.Contact = contact
      newClaimContacts.add(newClaimContact)
    }

    return newClaimContacts
  }
}