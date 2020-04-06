package gw.acc.iplm.services.claim.contacts.builder

uses gw.acc.iplm.config.LMCustomerConfigUtil

/**
 * This class create Insurer or Reinsurer (Party)
 */
class InsurerOrReinsurerBuilder extends ContactBuilder {

  override function createContacts(): List<ClaimContact> {
    var newClaimContacts = new ArrayList<ClaimContact>()
    for(contactDetail in _contactDetails) {
      if (contactDetail.Id == null or contactDetail.Agency == null or LMCustomerConfigUtil.isInsurerRegisteredMember(contactDetail.Agency, contactDetail.Id)) {
        continue
      }

      var newClaimContact = getClaimContactFromCurrentContacts(_contactRole, contactDetail.Id)
      var companyContact: Company

      if (newClaimContact == null) {
        newClaimContact = new ClaimContact(_newClaim)

        companyContact = new Company(_newClaim)
        companyContact.LMContactID_Ext = contactDetail.Id
      } else {
        companyContact = newClaimContact.Contact as Company
      }

      companyContact.Name = contactDetail.Name
      companyContact.ECFBureauId_Ext = contactDetail.Id
      companyContact.ECFBureauType_Ext = ECFBureauType_Ext.get(contactDetail.Agency)
      newClaimContact.Contact = companyContact
      newClaimContacts.add(newClaimContact)
    }
    return newClaimContacts

  }
}