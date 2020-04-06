package gw.acc.iplm.services.claim.contacts.mapper

uses gw.acc.iplm.config.LMCustomerConfigUtil
uses gw.acc.iplm.services.claim.contacts.ContactDetailsDTO
uses org.apache.commons.lang3.StringUtils

/**
 * This class maps contact information from {@link ECFMessageClaimData_Ext} as {@link ContactDetailsDTO}
 */
class ECFContactDetailsMapper {

  /**
   * Maps the contact data for Broker from {@link ECFMessageClaimData_Ext} to {@link ContactDetailsDTO}
   *
   * @param message ECF Message
   * @return Returns {@link ContactDetailsDTO} filled with necessary data
   */
  public static function createAdjusterContactDetails(message: ECFMessageClaimData_Ext): ContactDetailsDTO {
    var contactDetail = new ContactDetailsDTO()
    contactDetail.Name = message.ECFContactData.AdjusterName
    contactDetail.Reference = message.ECFContactData.AdjusterReference
    return contactDetail
  }

  /**
   * Maps the contact data for Broker from {@link ECFMessageClaimData_Ext} to {@link ContactDetailsDTO}
   *
   * @param message ECF Message
   * @return Returns {@link ContactDetailsDTO} filled with necessary data
   */
  public static function createBrokerContactDetails(message: ECFMessageClaimData_Ext): ContactDetailsDTO {
    var contactDetail = new ContactDetailsDTO()
    contactDetail.Id = message.ECFContactData.BrokerPartyId
    contactDetail.Name = message.ECFContactData.BrokerPartyName
    contactDetail.ContactName = message.ECFContactData.BrokerContactName
    contactDetail.ContactPhone = message.ECFContactData.BrokerContactTelephone
    return contactDetail
  }

  /**
   * Maps the contact data for BureauLead from {@link ECFMessageClaimData_Ext} to {@link ContactDetailsDTO}
   *
   * @param message ECF Message
   * @return Returns {@link ContactDetailsDTO} filled with necessary data
   */
  public static function createBureauLeadContactDetails(message: ECFMessageClaimData_Ext): ContactDetailsDTO {
    var contactDetail = new ContactDetailsDTO()
    contactDetail.Name = message.ECFContactData.BureauLeadInsurerOrReinsurer
    contactDetail.ReceiverName = message.ReceiverPartyName
    return contactDetail
  }

  /**
   * Maps the contact data for Claimant from {@link ECFMessageClaimData_Ext} to {@link ContactDetailsDTO}
   *
   * @param message ECF Message
   * @return Returns {@link ContactDetailsDTO} filled with necessary data
   */
  public static function createClaimantContactDetails(message: ECFMessageClaimData_Ext): ContactDetailsDTO {
    var contactDetail = new ContactDetailsDTO()
    contactDetail.Name = message.Claimant
    contactDetail.Description = message.LossOrEventName
    return contactDetail
  }

  /**
   * Maps the contact data for Lawyer from {@link ECFMessageClaimData_Ext} to {@link ContactDetailsDTO}
   *
   * @param message ECF Message
   * @return Returns {@link ContactDetailsDTO} filled with necessary data
   */
  public static function createLawyerContactDetails(message: ECFMessageClaimData_Ext): ContactDetailsDTO {
    var contactDetail = new ContactDetailsDTO()
    contactDetail.Name = message.ECFContactData.LawyerName
    contactDetail.Reference = message.ECFContactData.LawyerReference
    return contactDetail
  }

  /**
   * Maps the contact data for Insurer or Reinsurer from {@link ECFMessageClaimData_Ext} to {@link ContactDetailsDTO}
   *
   * @param message ECF Message
   * @return Returns {@link ContactDetailsDTO} filled with necessary data
   */
  public static function createInsurerOrReinsurerContactDetails(message: ECFMessageClaimData_Ext): ContactDetailsDTO {
    var contactDetail = new ContactDetailsDTO()
    if(StringUtils.isNotEmpty(message.ECFContactData.InsurerId)) {
      contactDetail.Id = message.ECFContactData.InsurerId
      contactDetail.Name = message.ECFContactData.InsurerName
      contactDetail.Agency = message.ECFContactData.InsurerAgency
    } else {
      contactDetail.Id = message.ECFContactData.ReinsurerId
      contactDetail.Name = message.ECFContactData.ReinsurerName
      contactDetail.Agency = message.ECFContactData.ReinsurerAgency
    }
    return contactDetail
  }

  /**
   * Maps the contact data for Contract Market Insurer or Reinsurer from {@link ECFMessageClaimData_Ext} to {@link ContactDetailsDTO} array
   *
   * @param message ECF Message
   * @return Returns {@link ContactDetailsDTO} array with one element filled with necessary data
   */
  public static function createContractMarketInsurerOrReinsurerContactDetails(message: ECFMessageClaimData_Ext): List<ContactDetailsDTO> {
    var contactDetails = new ArrayList<ContactDetailsDTO>()

    for (party in message.ECFContractMarkets) {
      if (party.PartyName == message.ReceiverPartyName or LMCustomerConfigUtil.isInsurerRegisteredMember(party.Bureau.Code, party.PartyID)) {
        continue
      }

      var contactDetail = new ContactDetailsDTO()
      contactDetail.Id = party.PartyID
      contactDetail.Agency = party.Bureau.Code
      contactDetail.Name = party.PartyName
      contactDetails.add(contactDetail)
    }
    return contactDetails
  }
}