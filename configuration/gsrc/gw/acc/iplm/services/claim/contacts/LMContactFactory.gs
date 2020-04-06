package gw.acc.iplm.services.claim.contacts

uses gw.acc.iplm.services.claim.contacts.builder.BrokerContactBuilder
uses gw.acc.iplm.services.claim.contacts.builder.BureauLeadContactBuilder
uses gw.acc.iplm.services.claim.contacts.builder.ClaimantBuilder
uses gw.acc.iplm.services.claim.contacts.builder.ContactBuilder
uses gw.acc.iplm.services.claim.contacts.builder.InsurerOrReinsurerBuilder
uses gw.acc.iplm.services.claim.contacts.mapper.LMContactDetailsMapper

class LMContactFactory {

  /**
   * This is wrapper method to return specific types of contacts
   * throws IllegalArgumentException, if it don't find given Contact Role
   *
   * @param contactRole
   * @param newClaim
   * @param ecfContactDetails
   * @return List<ClaimContact>
   * @throws IllegalArgumentException
   */
  public static function createContacts(contactRole: ContactRole, newClaim: Claim, message: LMMessageLloydsSCM_Ext): List<ClaimContact> {
    var contactBuilder: ContactBuilder
    var contactDetails = new ArrayList<ContactDetailsDTO>()
    switch (contactRole) {
      case ContactRole.TC_BROKER_EXT:
        contactDetails.add(LMContactDetailsMapper.createBrokerContactDetails(message))
        contactBuilder = new BrokerContactBuilder()
        break
      case ContactRole.TC_CLAIMANT:
        contactDetails.add(LMContactDetailsMapper.createClaimantContactDetails(message))
        contactBuilder = new ClaimantBuilder()
        break
      case ContactRole.TC_BUREAULEADINSURERORREINSURER_EXT:
        contactDetails.add(LMContactDetailsMapper.createBureauLeadingInsurerContactDetails(message))
        contactBuilder = new BureauLeadContactBuilder()
        break
      case ContactRole.TC_ECFINSURER_EXT:
      case ContactRole.TC_ECFREINSURER_EXT:
        contactDetails.add(LMContactDetailsMapper.createInsurerOrReinsurerContactDetails(message))
        contactBuilder = new InsurerOrReinsurerBuilder()
        break
      default:
        throw new IllegalArgumentException("Unknown ContactType type for ECFContactFactory")
    }

    return contactBuilder.createNewClaimContacts(contactRole, newClaim, contactDetails)
  }
}