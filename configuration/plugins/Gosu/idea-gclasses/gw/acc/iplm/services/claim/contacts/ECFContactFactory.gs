package gw.acc.iplm.services.claim.contacts

uses gw.acc.iplm.services.claim.contacts.builder.AdjusterContactBuilder
uses gw.acc.iplm.services.claim.contacts.builder.BrokerContactBuilder
uses gw.acc.iplm.services.claim.contacts.builder.BureauLeadContactBuilder
uses gw.acc.iplm.services.claim.contacts.builder.ClaimantBuilder
uses gw.acc.iplm.services.claim.contacts.builder.ContactBuilder
uses gw.acc.iplm.services.claim.contacts.builder.ContractMarketInsurerOrReinsurerBuilder
uses gw.acc.iplm.services.claim.contacts.builder.InsurerOrReinsurerBuilder
uses gw.acc.iplm.services.claim.contacts.builder.LawyerContactBuilder
uses gw.acc.iplm.services.claim.contacts.mapper.ECFContactDetailsMapper

/**
 * Wrapper class to create specific contact from ECFMessageClaimData_Ext
 */
class ECFContactFactory {

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
  public static function createContacts(contactRole: ContactRole, newClaim: Claim, ecfContactDetails: ECFMessageClaimData_Ext): List<ClaimContact> {
    var contactBuilder: ContactBuilder
    var contactDetails = new ArrayList<ContactDetailsDTO>()
    switch (contactRole) {
      case ContactRole.TC_EXTERNALADJUSTER_EXT:
        contactDetails.add(ECFContactDetailsMapper.createAdjusterContactDetails(ecfContactDetails))
        contactBuilder = new AdjusterContactBuilder()
        break
      case ContactRole.TC_BROKER_EXT:
        contactDetails.add(ECFContactDetailsMapper.createBrokerContactDetails(ecfContactDetails))
        contactBuilder = new BrokerContactBuilder()
        break
      case ContactRole.TC_BUREAULEADINSURERORREINSURER_EXT:
        contactDetails.add(ECFContactDetailsMapper.createBureauLeadContactDetails(ecfContactDetails))
        contactBuilder = new BureauLeadContactBuilder()
        break
      case ContactRole.TC_CLAIMANT:
        contactDetails.add(ECFContactDetailsMapper.createClaimantContactDetails(ecfContactDetails))
        contactBuilder = new ClaimantBuilder()
        break
      case ContactRole.TC_ATTORNEY:
        contactDetails.add(ECFContactDetailsMapper.createLawyerContactDetails(ecfContactDetails))
        contactBuilder = new LawyerContactBuilder()
        break
      case ContactRole.TC_ECFINSURER_EXT:
      case ContactRole.TC_ECFREINSURER_EXT:
        contactDetails.add(ECFContactDetailsMapper.createInsurerOrReinsurerContactDetails(ecfContactDetails))
        contactBuilder = new InsurerOrReinsurerBuilder()
        break
      case ContactRole.TC_ECFCONTRACTMARKETINSURERORREINSURER_EXT:
        contactDetails.addAll(ECFContactDetailsMapper.createContractMarketInsurerOrReinsurerContactDetails(ecfContactDetails))
        contactBuilder = new ContractMarketInsurerOrReinsurerBuilder()
        break
      default:
        throw new IllegalArgumentException("Unknown ContactType type for ECFContactFactory")
    }

    return contactBuilder.createNewClaimContacts(contactRole, newClaim, contactDetails)
  }
}