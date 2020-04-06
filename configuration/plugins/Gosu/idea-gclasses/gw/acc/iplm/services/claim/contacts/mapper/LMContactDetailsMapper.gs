package gw.acc.iplm.services.claim.contacts.mapper

uses gw.acc.iplm.services.claim.contacts.ContactDetailsDTO
uses gw.api.locale.DisplayKey
uses org.apache.commons.lang3.StringUtils

/**
 * This class maps contact information from {@link LMMessageLloydsSCM_Ext} as {@link ContactDetailsDTO}
 */
class LMContactDetailsMapper {

  /**
   * Maps the contact data for Broker from {@link LMMessageLloydsSCM_Ext} to {@link ContactDetailsDTO}
   *
   * @param message SCM Message
   * @return Returns {@link ContactDetailsDTO} filled with necessary data,
   * throws IllegalArgumentException if either BrokerPartyId or BrokerPartyName is null
   */
  public static function createBrokerContactDetails(message: LMMessageLloydsSCM_Ext): ContactDetailsDTO {
    var contactDetail = new ContactDetailsDTO()
    contactDetail.Id = message.ContactData.BrokerPartyId
    contactDetail.Name = message.ContactData.BrokerPartyName
    if(contactDetail.Id == null or contactDetail.Name == null) {
      // According to data dictionary, they cannot be null
      throw new IllegalArgumentException(DisplayKey.get("Accelerator.IPLM.Web.BrokerPartyIdOrBrokerPartyNameCannotBeNull"))
    }
    contactDetail.ContactName = message.ContactData.BrokerContactName
    contactDetail.ContactPhone = message.ContactData.BrokerContactTelephone
    return contactDetail
  }

  /**
   * Maps the contact data for Claimant from {@link LMMessageLloydsSCM_Ext} to {@link ContactDetailsDTO}
   *
   * @param message SCM Message
   * @return Returns {@link ContactDetailsDTO} filled with necessary data
   */
  public static function createClaimantContactDetails(message: LMMessageLloydsSCM_Ext): ContactDetailsDTO {
    var contactDetail = new ContactDetailsDTO()
    contactDetail.Name = message.ContactData.InsuredName
    contactDetail.Description = message.LossDescription
    return contactDetail
  }

  /**
   * Maps the contact data for BureauLeadingInsurer from {@link LMMessageLloydsSCM_Ext} to {@link ContactDetailsDTO}
   *
   * @param message SCM Message
   * @return Returns {@link ContactDetailsDTO} filled with necessary data
   */
  public static function createBureauLeadingInsurerContactDetails(message: LMMessageLloydsSCM_Ext): ContactDetailsDTO {
    var contactDetail = new ContactDetailsDTO()
    contactDetail.Name = message.ContactData.BureauLeadingInsurerName
    contactDetail.ReceiverName = message.ReceiverPartyName
    return contactDetail
  }

  /**
   * Maps the contact data for Re/Insurer from {@link LMMessageLloydsSCM_Ext} to {@link ContactDetailsDTO}
   * @param message SCM Message
   * @return Returns {@link ContactDetailsDTO} array with one element filled with necessary data with Insurer details,
   * if InsurerId is empty or null Reinsurer data is being used to fill contactDetail.
   */
  public static function createInsurerOrReinsurerContactDetails(message: LMMessageLloydsSCM_Ext): ContactDetailsDTO {
    var contactDetail = new ContactDetailsDTO()
    if(StringUtils.isNotEmpty(message.ContactData.InsurerId)) {
      contactDetail.Id = message.ContactData.InsurerId
      contactDetail.Name = message.ContactData.InsurerName
      contactDetail.Agency = message.ContactData.InsurerAgency
    } else {
      contactDetail.Id = message.ContactData.ReinsurerId
      contactDetail.Name = message.ContactData.ReinsurerName
      contactDetail.Agency = message.ContactData.ReinsurerAgency
    }
    return contactDetail
  }
}