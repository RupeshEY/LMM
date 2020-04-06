package gw.acc.iplm.entitymapper.lloyds

uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.LMFinancialConstants
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ClaimMovementAmtItem
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Jv_Ins_Reinsurance
uses gw.api.database.Query
uses gw.testharness.v3.GUnitTestClass

uses java.math.BigDecimal

class SyndicateClaimMessageEntityMapperTest extends GUnitTestClass {

  var _scmMessage: Jv_Ins_Reinsurance
  var _scmMessageDTO: LMMessageDTO
  var _entityMapper: SyndicateClaimMessageEntityMapper
  var _messageEntity: LMMessageLloydsSCM_Ext

  override function beforeMethod() {
    super.beforeClass()
    _entityMapper = new SyndicateClaimMessageEntityMapper()
    _scmMessage = ECFMessageUtil.createNewLloydsSyndicateClaimMessage()
    _scmMessage = populateDummyContactData(_scmMessage)
    _scmMessageDTO = new LMMessageDTO(LMMessageTypeString_Ext.TC_LMMESSAGELLOYDSSCM_EXT, _scmMessage, null)
    _messageEntity = mapEntity(_scmMessageDTO)
  }

  private function populateDummyContactData(xmlContent: Jv_Ins_Reinsurance): Jv_Ins_Reinsurance {
    return xmlContent
  }

  override function afterMethod(error: Throwable) {
    super.afterMethod(error)
    ECFMessageEntityUtil.deleteAllLMMessagesFromDB()
  }

  function testIsCorrectMessageType() {
    assertTrue(_entityMapper.isCorrectMessageType(_scmMessageDTO.XMLPayLoad))
  }

  function testCreateNewMessageMessageType() {
    assertEquals(ECFMessageType_Ext.TC_LLOYDSSYNDICATECLAIM, _messageEntity.MessageType)
  }

  function testCreateNewMessageUUID() {
    assertEquals(_scmMessage.UUID, _messageEntity.UUID)
  }

  function testCreateNewMessageUCR() {
    assertEquals(_scmMessage.UCR, _messageEntity.UCR)
  }

  function testCreateNewMessageUMR() {
    assertEquals(_scmMessage.UMR, _messageEntity.UMR)
  }

  function testCreateNewMessageOriginTimestamp() {
    assertEquals(_scmMessage.OriginTimestamp, _messageEntity.OriginTimeStamp)
  }

  function testCreateNewMessageSenderPartyRoleCd() {
    assertEquals(_scmMessage.SenderPartyRoleCd, _messageEntity.SenderPartyRoleCd)
  }

  function testCreateNewMessageSenderPartyId() {
    assertEquals(_scmMessage.SenderElement.FirstId, _messageEntity.SenderPartyId)
  }

  function testCreateNewMessageSenderPartyAgency() {
    assertEquals(_scmMessage.SenderElement.FirstAgency, _messageEntity.SenderPartyAgency)
  }

  function testCreateNewMessageSenderPartyName() {
    assertEquals(_scmMessage.SenderElement.Name, _messageEntity.SenderPartyName)
  }

  function testCreateNewMessageReceiverPartyRoleCd() {
    assertEquals(_scmMessage.ReceiverPartyRoleCd, _messageEntity.ReceiverPartyRoleCd)
  }

  function testCreateNewMessageReceiverPartyId() {
    assertEquals(_scmMessage.ReceiverElement.FirstId, _messageEntity.ReceiverPartyId)
  }

  function testCreateNewMessageReceiverPartyAgency() {
    assertEquals(_scmMessage.ReceiverElement.FirstAgency, _messageEntity.ReceiverPartyAgency)
  }

  function testCreateNewMessageReceiverPartyName() {
    assertEquals(_scmMessage.ReceiverElement.Name, _messageEntity.ReceiverPartyName)
  }

  function testCreateNewMessagePolicyNumber() {
    assertEquals(_scmMessage.PolicyNumber, _messageEntity.PolicyNumber)
  }

  function testMapLossStartDate() {
    assertEquals(parseDate(_scmMessage.LossStartDate), _messageEntity.LossStartDate)
  }

  function testMapLossEndDate() {
    assertEquals(parseDate(_scmMessage.LossEndDate), _messageEntity.LossEndDate)
  }

  function testMapLossDescription() {
    assertEquals(_scmMessage.LossDescription, _messageEntity.LossDescription)
  }

  function testMapLossLocation() {
    assertEquals(_scmMessage.LossLocation, _messageEntity.LossLocation)
  }

  function testOCR() {
    assertEquals(_scmMessage.ClaimMovement.ClaimEntry.ServiceProviderReference, _messageEntity.OCR)
  }

  function testMessageSequence() {
    assertEquals(_scmMessage.MessageSequence.toString(), _messageEntity.MessageSequence.toString())
  }

  function testMovementReferenceSequence() {
    assertEquals(_scmMessage.MovementReferenceSequence, _messageEntity.MovementReferenceSequence)
  }

  function testMapContactInformation() {
    assertEquals(_scmMessage.BrokerPartyId, _messageEntity.ContactData.BrokerPartyId)
    assertEquals(_scmMessage.BrokerPartyName, _messageEntity.ContactData.BrokerPartyName)
    assertEquals(_scmMessage.BrokerPartyAgency, _messageEntity.ContactData.BrokerPartyAgency)
    assertEquals(_scmMessage.BrokerContactName, _messageEntity.ContactData.BrokerContactName)
    assertEquals(_scmMessage.BrokerContactPhone, _messageEntity.ContactData.BrokerContactTelephone)
    assertEquals(_scmMessage.BrokerContactDescription, _messageEntity.ContactData.BrokerContactDescription)
    assertEquals(_scmMessage.InsurerPartyId, _messageEntity.ContactData.InsurerId)
    assertEquals(_scmMessage.InsurerPartyName, _messageEntity.ContactData.InsurerName)
    assertEquals(_scmMessage.InsurerPartyAgency, _messageEntity.ContactData.InsurerAgency)
    assertEquals(_scmMessage.ReinsurerPartyId, _messageEntity.ContactData.ReinsurerId)
    assertEquals(_scmMessage.ReinsurerPartyName, _messageEntity.ContactData.ReinsurerName)
    assertEquals(_scmMessage.ReinsurerPartyAgency, _messageEntity.ContactData.ReinsurerAgency)
    assertEquals(_scmMessage.ServiceProviderPartyId, _messageEntity.ContactData.ServiceProviderId)
    assertEquals(_scmMessage.ServiceProviderPartyName, _messageEntity.ContactData.ServiceProviderName)
    assertEquals(_scmMessage.ServiceProviderPartyAgency, _messageEntity.ContactData.ServiceProviderAgency)
    assertEquals(_scmMessage.ServiceProviderContactDescription, _messageEntity.ContactData.ServiceProviderDescription)
    assertEquals(_scmMessage.ClaimAgreementPartyId, _messageEntity.ContactData.ClaimAgreementPartyId)
    assertEquals(_scmMessage.ClaimAgreementPartyAgency, _messageEntity.ContactData.ClaimAgreementPartyAgency)
    assertEquals(_scmMessage.ClaimAgreementParticipantFunction, _messageEntity.ContactData.ClaimAgreementParticipant)
    assertEquals(_scmMessage.CoverHolderName, _messageEntity.ContactData.CoverHolderName)
    assertEquals(_scmMessage.InsuredName, _messageEntity.ContactData.InsuredName)
    assertEquals(_scmMessage.BureauLeadingInsurerOrReinsurerPartyId, _messageEntity.ContactData.BureauLeadingInsurerId)
    assertEquals(_scmMessage.BureauLeadingInsurerOrReinsurerPartyName, _messageEntity.ContactData.BureauLeadingInsurerName)
    assertEquals(_scmMessage.BureauLeadingInsurerOrReinsurerPartyAgency, _messageEntity.ContactData.BureauLeadingInsurerAgency)
  }

  function testMapBureauLeadingInsurerOrReinsurersComments() {
    assertEquals(_scmMessage.BureauLeadingInsurerOrReinsurersComments, _messageEntity.BureauLeadingInsurerComments)
  }

  /**
   * SCMMessage-Sample Risk code value : V
   */
  function testRiskCodeMapsToSCMRiskCodeEntityWhenValidCodeProvided() {
    var expectedRiskCode = _entityMapper.getRiskCodeByString("V");
    assertNotNull(_messageEntity.SCMRiskCode)
    assertEquals(expectedRiskCode, _messageEntity.SCMRiskCode)
  }

  function testGetFirstRiskCode() {
    var riskCode = Query.make(SCMRiskCode_Ext).select().first()
    var riskCodeString = riskCode.Code
    assertEquals(riskCode, _entityMapper.getRiskCodeByString(riskCodeString))
  }

  function testGetMiddleRiskCode() {
    var riskCodes = Query.make(SCMRiskCode_Ext).select().toList()
    var middleCode = riskCodes[(int)(riskCodes.size() / 2)]
    assertEquals(middleCode, _entityMapper.getRiskCodeByString(middleCode.Code))
  }

  function testGetLastRiskCode() {
    var riskCode = Query.make(SCMRiskCode_Ext).select().last()
    var riskCodeString = riskCode.Code
    assertEquals(riskCode, _entityMapper.getRiskCodeByString(riskCodeString))
  }

  function testPaidThisTimeIndemnity() {
    setFinancialAmountForType(1000.00bd, 'USD', LMFinancialConstants.PAID_THIS_TIME_INDEMNITY)
    _messageEntity = mapEntity(_scmMessageDTO)
    assertEquals(_scmMessage.PaidThisTimeIndemnity, _messageEntity.PaidThisTimeIndemnity)
  }

  function testPaidThisTimeFees() {
    setFinancialAmountForType(1000.00bd, 'USD', LMFinancialConstants.PAID_THIS_TIME_FEES)
    _messageEntity = mapEntity(_scmMessageDTO)
    assertEquals(_scmMessage.PaidThisTimeFees, _messageEntity.PaidThisTimeFees)
  }

  function testOutstandingIndemnity() {
    setFinancialAmountForType(1000.00bd, 'USD', LMFinancialConstants.OUTSTANDING_AMOUNT_INDEMNITY)
    _messageEntity = mapEntity(_scmMessageDTO)
    assertEquals(_scmMessage.OutstandingIndemnity, _messageEntity.OutstandingIndemnity)
  }

  function testOutstandingFees() {
    setFinancialAmountForType(1000.00bd, 'USD', LMFinancialConstants.OUTSTANDING_AMOUNT_FEES)
    _messageEntity = mapEntity(_scmMessageDTO)
    assertEquals(_scmMessage.OutstandingFees, _messageEntity.OutstandingFees)
  }

  private function setFinancialAmountForType(amount: BigDecimal, currency: String, type: String) {
    _scmMessage.ClaimMovement.ClaimMovementAmtItem.firstWhere(\elt -> elt.Type == type)?.Amt = {amount}
    _scmMessage.ClaimMovement.ClaimMovementAmtItem.firstWhere(\elt -> elt.Type == type)?.Amt_elem.first().Ccy = currency

    _scmMessageDTO.XMLPayLoad = _scmMessage
  }
  function testMapCurrencies() {
    final var CurrencyOriginalCurrency = Currency.get(_scmMessage.OriginalCurrency)
    final var CurrencySettlementCurrency = Currency.get(_scmMessage.SettlementCurrency)

    assertNotNull(CurrencyOriginalCurrency)
    assertNotNull(CurrencySettlementCurrency)
    assertEquals(CurrencyOriginalCurrency, _messageEntity.OriginalCurrency)
    assertEquals(CurrencySettlementCurrency, _messageEntity.SettlementCurrency)
  }

  function testMapCurrencies_WithUnknownCurrency() {
    (_scmMessageDTO.XMLPayLoad as Jv_Ins_Reinsurance).ClaimMovement.ContractReferenceCurrency.Ccy = "DKK"
    _messageEntity = mapEntity(_scmMessageDTO)

    final var CurrencySettlementCurrency = Currency.get(_scmMessage.SettlementCurrency)

    assertNotNull(CurrencySettlementCurrency)
    assertEquals(CurrencySettlementCurrency, _messageEntity.SettlementCurrency)
    assertNull(_messageEntity.OriginalCurrency)
  }

  function testNarrative() {
    assertEquals(_scmMessage.Narrative, _messageEntity.Narrative)
  }

  function testSyndicateLineNumber() {
    assertEquals(_scmMessage.SyndicateLineNumber, _messageEntity.SyndicateLineNumber)
  }

  function testReceiverShare() {
    assertEquals(_scmMessage.ReceiverShare, _messageEntity.ReceiverShare)
  }

  private function parseDate(date: String) : Date {
    return ECFConstants.ECF_DATE_FORMAT_YEAR_MONTH_DAY_ONLY.get().parse(date)
  }

  private function mapEntity(messageDTO: LMMessageDTO): LMMessageLloydsSCM_Ext {
    var messageEntity : LMMessageLloydsSCM_Ext

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      messageEntity = _entityMapper.createNewLMMessage(messageDTO) as LMMessageLloydsSCM_Ext
    })

    return messageEntity
  }

}