package gw.acc.iplm.xmlmapper.writeback

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_Claim
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimEntry
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_Contract
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_Insurer
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_Insurer_Contact
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProvider
uses gw.xml.date.XmlDateTime

/**
 * Common methods for mapping ClaimResponseRq XML across all bureau and role
 */
abstract public class ClaimResponseRequestMapper {

  protected var _claimResponseRq: ClaimResponseRq as ClaimResponseRq
  protected var _ecfClaimResponseMessage: ECFMessageClaimResponseRq_Ext as ClaimResponseRqEntity

  public construct(ecfClaimResponseMessage: ECFMessageClaimResponseRq_Ext) {
    _ecfClaimResponseMessage = ecfClaimResponseMessage
    _claimResponseRq = new ClaimResponseRq()
    initClaimResponseRq()
  }

  /**
   * This method will generate the XML Payload and store it on the ECFMessageClaimResponseRq_Ext entity.
   *
   * @return ClaimResponseRq
   */
  public function createClaimResponseRq(): ClaimResponseRq {
    saveXmlToEntity()
    return _claimResponseRq
  }

  /**
   * All Response messages must have a response Code - The XML for this is unique for each Bureau / Role and so must be
   * implemented in each mapper
   */
  protected abstract function createResponseCode()

  protected function saveXmlToEntity() {
    _ecfClaimResponseMessage.Content = new Blob(_claimResponseRq.asUTFString().Bytes)
  }

  /**
   * This method will set the common properties in ClaimResponseRq which are common between all roles for all the companies
   *
   * @return ClaimResponseRq
   */
  private function initClaimResponseRq() {
    _claimResponseRq.Sender = _ecfClaimResponseMessage.SenderPartyRoleCd
    _claimResponseRq.Receiver = _ecfClaimResponseMessage.ReceiverPartyRoleCd
    _claimResponseRq.UUId = _ecfClaimResponseMessage.UUID
    _claimResponseRq.CreationDate = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().format(_ecfClaimResponseMessage.OriginTimeStamp)
    _claimResponseRq.InsurerTransactionReference = _ecfClaimResponseMessage.InsurerTransactionReference
    _claimResponseRq.AsOfDate = getAsOfDate()
    _claimResponseRq.ReferredUUId = _ecfClaimResponseMessage.ReferredUUID

    createInsurerElement()
    createServiceProviderElement()
    createContractElement()
    createClaimEntryElement()
    createClaimElement()
    createClaimResponseElement()
    createResponseCode()
  }

  private function getAsOfDate(): XmlDateTime {
    var asOfDate: XmlDateTime
    if (_ecfClaimResponseMessage.AsOfDate != null) {
      var cal = Calendar.getInstance()
      cal.setTime(_ecfClaimResponseMessage.AsOfDate)
      asOfDate = new XmlDateTime(cal, true)
    }

    return asOfDate
  }

  private function createInsurerElement() {
    var insurer = new ClaimResponseRq_Insurer()
    insurer.Party = new Party()
    insurer.Party.FirstId = _ecfClaimResponseMessage.SenderPartyId
    insurer.Party.FirstAgency = _ecfClaimResponseMessage.SenderPartyAgency
    insurer.Party.Name = _ecfClaimResponseMessage.SenderPartyName
    insurer.Contact = createInsurerContactElement()

    _claimResponseRq.Insurer = insurer
  }

  private function createInsurerContactElement(): ClaimResponseRq_Insurer_Contact {
    var contact = new ClaimResponseRq_Insurer_Contact()
    contact.ClassUserId = _ecfClaimResponseMessage.ContactClassUserId
    contact.AccountCode = _ecfClaimResponseMessage.ContactClassAccountId
    contact.PersonName = _ecfClaimResponseMessage.ContactName
    contact.Telephone = _ecfClaimResponseMessage.ContactTelephone
    contact.Email = _ecfClaimResponseMessage.ContactEmail

    return contact
  }

  private function createServiceProviderElement() {
    var serviceProvider = new ServiceProvider()
    serviceProvider.Party = new Party()
    serviceProvider.Party.Id = {_ecfClaimResponseMessage.ReceiverPartyId}
    serviceProvider.Party.FirstAgency = _ecfClaimResponseMessage.ReceiverPartyAgency
    serviceProvider.Party.Name = _ecfClaimResponseMessage.ReceiverPartyName

    _claimResponseRq.ServiceProvider = serviceProvider
  }

  private function createContractElement() {
    var contract = new ClaimResponseRq_Contract()
    contract.BrokerReference = _ecfClaimResponseMessage.UMR

    _claimResponseRq.Contract = contract
  }

  private function createClaimEntryElement() {
    var claimEntry = new ClaimResponseRq_ClaimEntry()
    claimEntry.BrokerReference = _ecfClaimResponseMessage.TR

    _claimResponseRq.ClaimEntry = claimEntry
  }

  private function createClaimElement() {
    var claimResponseRq_Claim = new ClaimResponseRq_Claim()
    claimResponseRq_Claim.BrokerReference = _ecfClaimResponseMessage.UCR
    claimResponseRq_Claim.ClaimType = _ecfClaimResponseMessage.ClaimType.Code

    _claimResponseRq.Claim = claimResponseRq_Claim
  }

  private function createClaimResponseElement() {
    var claimResponse = new ClaimResponseRq_ClaimResponse()
    claimResponse.ParticipantFunction = _ecfClaimResponseMessage.RespondAsParticipantFunction.DisplayName
    claimResponse.ClaimLineNo = _ecfClaimResponseMessage.ClaimLineNumber

    _claimResponseRq.ClaimResponse = claimResponse
  }

  /**
   * Only applies to LIRMA Lead, LLoyds Lead and Lloyds SAP
   */
  protected function createInsurerOrReinsurerClaimReferences() {
    _claimResponseRq.ClaimResponse.InsurerOrReinsurerClaimReference1 = _ecfClaimResponseMessage.InsurerOrReinsurerClaimRef1
    _claimResponseRq.ClaimResponse.InsurerOrReinsurerClaimReference2 = _ecfClaimResponseMessage.InsurerOrReinsurerClaimRef2
  }
}