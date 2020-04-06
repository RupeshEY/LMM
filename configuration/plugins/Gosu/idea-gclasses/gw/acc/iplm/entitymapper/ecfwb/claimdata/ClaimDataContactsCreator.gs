package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.dto.ClaimMessageDTO

class ClaimDataContactsCreator {

  public static function createContacts(final claimData: ECFMessageClaimData_Ext, final xmlDto: ClaimMessageDTO) {
    var claimNotifyRq = xmlDto._claimNotifyRq
    var claimRetrieveRs = xmlDto._claimRetrieveRs
    var ecfContacts =  new ECFMessageClaimDataContacts_Ext()
    ecfContacts.AdjusterName = claimNotifyRq.AdjusterName?:claimRetrieveRs.AdjusterName
    ecfContacts.AdjusterReference = claimNotifyRq.AdjusterReference?:claimRetrieveRs.AdjusterReference
    ecfContacts.BrokerPartyName = claimNotifyRq.BrokerName?:claimRetrieveRs.BrokerName
    ecfContacts.BrokerPartyId = claimNotifyRq.BrokerId?:claimRetrieveRs.BrokerId
    ecfContacts.BrokerContactName = claimNotifyRq.BrokerContact?:claimRetrieveRs.BrokerContact
    ecfContacts.BrokerContactTelephone = claimNotifyRq.BrokerPhone?:claimRetrieveRs.BrokerPhone
    ecfContacts.BureauLeadInsurerOrReinsurer = claimNotifyRq.BureauLeadInsurerOrReinsurerName?:claimRetrieveRs.BureauLeadInsurerOrReinsurerName
    ecfContacts.BureauLeadInsurerContactName = claimNotifyRq.BureauLeadInsurerOrReinsurerContactName?:claimRetrieveRs.BureauLeadInsurerOrReinsurerContactName
    ecfContacts.BureauLeadInsurerContactPhone = claimNotifyRq.BureauLeadInsurerOrReinsurerContactPhone?:claimRetrieveRs.BureauLeadInsurerOrReinsurerContactPhone
    ecfContacts.BureauLeadInsurerContactEmail = claimNotifyRq.BureauLeadInsurerOrReinsurerContactEmail?:claimRetrieveRs.BureauLeadInsurerOrReinsurerContactEmail
    ecfContacts.InsurerId = claimNotifyRq.InsurerId?:claimRetrieveRs.InsurerId
    ecfContacts.InsurerName = claimNotifyRq.InsurerName?:claimRetrieveRs.InsurerName
    ecfContacts.InsurerAgency = claimNotifyRq.InsurerAgency?:claimRetrieveRs.InsurerAgency
    ecfContacts.ReinsurerId = claimNotifyRq.ReinsurerId?:claimRetrieveRs.ReinsurerId
    ecfContacts.ReinsurerName = claimNotifyRq.ReinsurerName?:claimRetrieveRs.ReinsurerName
    ecfContacts.ReinsurerAgency = claimNotifyRq.ReinsurerAgency?:claimRetrieveRs.ReinsurerAgency
    ecfContacts.LawyerName = claimNotifyRq.LawyerName?:claimRetrieveRs.LawyerName
    ecfContacts.LawyerReference = claimNotifyRq.LawyerReference?:claimRetrieveRs.LawyerReference
    claimData.ECFContactData = ecfContacts
  }
}