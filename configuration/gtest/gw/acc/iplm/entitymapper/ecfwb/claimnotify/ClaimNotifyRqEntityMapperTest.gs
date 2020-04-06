package gw.acc.iplm.entitymapper.ecfwb.claimnotify

uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.utils.ECFIndicatorEnum
uses gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FileSize
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_SupportingDocument
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_SupportingDocument_ReferredObjects
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_SupportingDocument_ReferredObjects_Contract
uses gw.api.util.ConfigAccess
uses gw.testharness.v3.GUnitTestClass
uses gw.xml.date.XmlDateTime

class ClaimNotifyRqEntityMapperTest extends GUnitTestClass {

  private var _entityMapperService = new EntityMapperService()

  final var yes = ECFIndicatorEnum.Y.IntegrationCode
  final var no = ECFIndicatorEnum.N.IntegrationCode

  function testContentIsSentForMessageLargerThan65000Chars() {
    var notifyRqXml = ECFMessageUtil.createNewXmlMessage(ECFMessageUtil.CLAIM_NOTIFY_RQ_FILE_BIG_PAYLOAD)
    var claimNotifyRq = ClaimNotifyEventRq.parse(notifyRqXml.asUTFString())
    var oldSupportingDocument = claimNotifyRq.SupportingDocument.first()
    for (1..200index x) {
      var supportingDocument = new ClaimNotifyEventRqType_SupportingDocument()
      supportingDocument.DocumentId = oldSupportingDocument.DocumentId
      supportingDocument.DocumentVersion = "1"
      supportingDocument.DocumentVersionDtTime = new XmlDateTime()
      supportingDocument.FileId = "Doc" + x
      supportingDocument.FileFormatCd = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
      var fileSize = new FileSize()
      fileSize.NumUnits = 1234
      fileSize.UnitMeasurementCd = "KB"
      supportingDocument.FileSize = fileSize
      supportingDocument.DocumentTypeCd = "correspondence_client"
      var referredObjects = new ClaimNotifyEventRqType_SupportingDocument_ReferredObjects()
      var contract = new ClaimNotifyEventRqType_SupportingDocument_ReferredObjects_Contract()
      contract.BrokerReference = "TR001"
      referredObjects.Contract = contract
      supportingDocument.ReferredObjects = referredObjects
      claimNotifyRq.SupportingDocument.add(supportingDocument)
    }
    var ecfMessage = _entityMapperService.createEntity(claimNotifyRq) as ECFMessageClaimNotifyRq_Ext
    assertEquals("message content and file content must be the same.", claimNotifyRq.asUTFString(), ecfMessage.Content.ContentString)
  }

  function testCreateNewECFMessageForRespondErrorNotify() {
    var notifyRqXml = ECFMessageUtil.createNewXmlMessage(ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/RespondErrorNotifyRq.xml"))
    var ClaimNotifyRqEntityMapper = new ClaimNotifyRqEntityMapper()
    var ecfMessageDTO = new LMMessageDTO(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT, notifyRqXml, null)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var errorNotifyEntity = ClaimNotifyRqEntityMapper.createNewLMMessage(ecfMessageDTO)
      errorNotifyEntity.Content = new Blob(notifyRqXml.asUTFString().Bytes)
      assertNotNull(errorNotifyEntity.UUID)
      assertNotNull(errorNotifyEntity.OriginTimeStamp)
      assertEquals(notifyRqXml.asUTFString(), errorNotifyEntity.Content.ContentString)
    }, User.util.UnrestrictedUser)
  }

  function testNewClaimNotifyRqGeneralDetails() {
    var newMessage = getClaimNotifyRQ()
    assertEquals(ECFMessageClaimNotifyRq_Ext.TYPE.Name, newMessage.Subtype.getEntityType().Name)
    assertNotNull("UUID should not be null", newMessage.UUID)
    assertNull(newMessage.ClaimResponseUUId)
    assertNotNull("Content should not be null", newMessage.Content)
    assertNotNull("UCR should not be null", newMessage.UCR)
    assertNotNull("Status should not be null", newMessage.Status)
    assertNotNull("OriginTimeStamp should not be null", newMessage.OriginTimeStamp)
    assertNotNull("MessageSequence should not be null", newMessage.MessageSequence)
    assertNotNull("MessageType should not be null", newMessage.MessageType)
    assertNotNull("Suspended should not be null", newMessage.Suspended)
    assertNotNull("AsOfDate should not be null", newMessage.AsOfDate)
    assertNotNull("TransactionSequence should not be null", newMessage.TransactionSequence)
    assertNotNull("TransactionType should not be null", newMessage.TransactionType)
    assertNull(newMessage.AmendmentDetails)
    assertNull(newMessage.InsurerReference)
    assertNotNull("InsuredName should not be null", newMessage.InsuredName)
    assertNotNull("ECFContractMarkets should not be null", newMessage.ECFContractMarkets)
    assertNotNull("TransactionStatus should not be null", newMessage.TransactionStatus)
    assertNotNull("ActionCode should not be null", newMessage.ActionCode)
    assertNotNull("ResponseCode should not be null", newMessage.ResponseCode)
    assertNotNull("PcsCatastropheCode should not be null", newMessage.PcsCatastropheCode)
    assertNotNull("LcoCatastropheCode should not be null", newMessage.LcoCatastropheCode)
    assertNull(newMessage.InsuredId)
    assertEquals("PN", newMessage.Claimant)
    assertNotNull("ClaimStatus should not be null", newMessage.ClaimStatus)
    assertNotNull("ClassOfBusiness should not be null", newMessage.ClassOfBusiness)
    assertNotNull("ClaimLineNumber should not be null", newMessage.ClaimLineNumber)
    assertEquals(ECFParticipationType_Ext.TC_C, newMessage.ActionParticipantType)
    assertEquals(4, newMessage.ECFContractMarkets.length)
    var ecfContractMarket1 = newMessage.ECFContractMarkets.where(\elt ->
        elt.IsPrimaryRole == true)
    var ecfContractMarket2 = newMessage.ECFContractMarkets.where(\elt ->
        elt.IsPrimaryRole == false)
    assertEquals(1, ecfContractMarket1.length)
    assertEquals(3, ecfContractMarket2.length)
    assertEquals(7, newMessage.Docs.length)
    assertEquals("xxxxxx", newMessage.Insured)
    assertEquals("OP", newMessage.Policyholder)
    assertEquals("B0001OCT28SP2FOF", newMessage.UMR)
    assertEquals("54-123456", newMessage.PolicyNumber)
    assertEquals("10-123456", newMessage.RiskReference)
    assertEquals("abc", newMessage.BrokerReference)
    assertEquals("TEST", newMessage.RiskDescription)
    assertEquals("TEST", newMessage.RiskLocation)
    assertEquals("testing stuff", newMessage.PolicyType)
    assertEquals("surplus", newMessage.CoverType)
    assertEquals(ECFRiskCode_Ext.TC_XT, newMessage.RiskCode)
    assertEquals(ECFBureauType_Ext.TC_LLOYDS, newMessage.BureauType)
    assertEquals("GW0001", newMessage.BrokerId)
    assertEquals("TEST BROKER 0001", newMessage.BrokerName)
    assertEquals("xxxxx", newMessage.BrokerContact)
    assertEquals("1234", newMessage.BrokerPhone)
    assertEquals("abc@edf.com", newMessage.BrokerEmail)
    assertEquals("N", newMessage.CoLeadIndicator)
    assertEquals("Beazley 0623", newMessage.LeadName)
    assertEquals("10-AWAITING/QUERIED", newMessage.TransactionStatus.DisplayName)
    assertEquals(ECFScheme_Ext.TC_2010, newMessage.ClaimsScheme)
    assertEquals(4, newMessage.Carriers.length)
    assertEquals(1, newMessage.AggregateDetails.length)
    assertEquals(3, newMessage.Financials.length)
    assertNotNull("InsurerSharePercentage should not be null", newMessage.InsurerSharePercentage)
    assertEquals("2010", newMessage.ClaimsScheme?.DisplayName)
    assertEquals(ECFClaimCategoryCode_Ext.TC_A, newMessage.CategoryCode)
    assertEquals(ECFClaimSubCatCode_Ext.TC_AB, newMessage.SubCategoryCode)
  }

  function testNewClaimNotifyRqComments() {
    var newMessage = getClaimNotifyRQ()
    assertEquals(1, newMessage.BrokerComments.length)
    assertEquals(1, newMessage.SlipLeadComments.length)
    assertEquals(2, newMessage.PublicComments.length)
    assertEquals(2, newMessage.PrivateComments.length)
    assertEquals(3, newMessage.CrossMarketPublicComments.length)
    assertEquals(1, newMessage.CrossMarketPrivateComments.length)
  }

  function testNewClaimNotifyRqLossDetails() {
    var newMessage = getClaimNotifyRQ()
    assertNotNull("LossCause should not be null", newMessage.LossCause)
    assertEquals("London", newMessage.LossLocation)
    assertNotNull("LossStartDate should not be null", newMessage.LossStartDate)
    assertNotNull("LossEndDate should not be null", newMessage.LossEndDate)
    assertNotNull("LossDetails should not be null", newMessage.LossDetails)
  }

  function testNewClaimNotifyRqSenderDetails() {
    var newMessage = getClaimNotifyRQ()
    assertNotNull("SenderPartyId should not be null", newMessage.SenderPartyId)
    assertNotNull("SenderPartyName should not be null", newMessage.SenderPartyName)
    assertNotNull("SenderPartyRoleCd should not be null", newMessage.SenderPartyRoleCd)
    assertNotNull("SenderPartyAgency should not be null", newMessage.SenderPartyAgency)
  }

  function testNewClaimNotifyRqReceiverDetails() {
    var newMessage = getClaimNotifyRQ()
    assertNotNull("ReceiverPartyId should not be null", newMessage.ReceiverPartyId)
    assertNotNull("ReceiverPartyName should not be null", newMessage.ReceiverPartyName)
    assertNotNull("ReceiverPartyRoleCd should not be null", newMessage.ReceiverPartyRoleCd)
    assertNotNull("ReceiverPartyAgency should not be null", newMessage.ReceiverPartyAgency)
  }

  function testNewClaimNotifyRqCrossMarketDetails() {
    var newMessage = getClaimNotifyRQ()
    var lloydsRole = newMessage.ECFContractMarkets.where(\elt -> elt.Bureau == ECFBureauType_Ext.TC_LLOYDS
        and elt.PartyID == "623")
    lloydsRole.each(\elt -> {
      assertEquals("Beazley 623", elt.PartyName)
      assertEquals("Lloyd's", elt.Bureau)
      assertEquals(ECFParticipantFunction_Ext.TC_LEAD, elt.ParticipantFunction)
    })
  }

  function testNewClaimNotifyRqBulkDetails() {
    var newMessage = getClaimNotifyRQ()
    assertNull(newMessage.BulkClaimNoOfItems)
    assertNull(newMessage.BulkClaimHeaderUCR)
    assertNull(newMessage.BulkClaimHeaderTR)
    assertEquals(0, newMessage.BulkClaims.length)
  }

  function testNewClaimNotifyRqWithBrokerInformation() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var ecfMessage = getClaimNotifyRQ()
      assertEquals("GW0001", ecfMessage.BrokerId)
      assertEquals("TEST BROKER 0001", ecfMessage.BrokerName)
      assertEquals("xxxxx", ecfMessage.BrokerContact)
      assertEquals("1234", ecfMessage.BrokerPhone)
    })
  }

  function testConfictOfInterestInd() {
    var ecfMessage = getClaimNotifyRQ()
    assertFalse(ecfMessage.ConflictOfInterestInd)
  }

  function testSimultaneousReinstatementReqBoolean() {
    var ecfMessage = getClaimNotifyRQ()
    assertFalse(ecfMessage.SimultaneousReinstatementReqBoolean)
  }

  function testChaseUpIndicator() {
    var ecfMessage = getClaimNotifyRQ()
    assertEquals(yes, ecfMessage.ChaseUpIndicator)
  }

  function testChaseUpIndicatorInterval() {
    var ecfMessage = getClaimNotifyRQ()
    assertEquals(15, ecfMessage.ChaseUpIndicatorInterval)
  }

  function testCedantInLiquidationIndicator() {
    var ecfMessage = getClaimNotifyRQ()
    assertEquals(yes, ecfMessage.CedantInLiquidationIndicator)
  }

  function testSimultaneousReinstatementReq() {
    var ecfMessage = getClaimNotifyRQ()
    assertEquals(no, ecfMessage.SimultaneousReinstatementReq)
  }

  function testSimultaneousReinstatementProcd() {
    var ecfMessage = getClaimNotifyRQ()
    assertEquals(no, ecfMessage.SimultaneousReinstatementProcd)
  }

  function testXcsToAgreeIndicator() {
    var ecfMessage = getClaimNotifyRQ()
    assertEquals(yes, ecfMessage.XcsToAgreeIndicator)
  }

  function testContractualConditionsIndicator() {
    var ecfMessage = getClaimNotifyRQ()
    assertEquals(ECFIndicatorEnum.S.IntegrationCode, ecfMessage.ContractualConditionsIndicator)
  }

  function testImmediatePartCollectionInd() {
    var ecfMessage = getClaimNotifyRQ()
    assertEquals(yes, ecfMessage.ImmediatePartCollectionInd)
  }

  function testNoFurtherResponseIndicator() {
    var ecfMessage = getClaimNotifyRQ()
    assertEquals(yes, ecfMessage.NoFurtherResponseIndicator)
  }

  function testMultipleResponseIndicator() {
    var ecfMessage = getClaimNotifyRQ()
    assertEquals(no, ecfMessage.MultipleResponseIndicator)
  }

  function testMillisecondsTimestamp() {
    var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
    xmlPayload.CreationDate = "2017-01-01T12:01:23.456+00:00"
    var entity = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext
    var expectedDate = Date.create(2017, JANUARY, 1, 12, 01, 23, 456, TimeZone.GMT)

    assertEquals(entity.OriginTimeStamp, expectedDate)
  }

  private function getClaimNotifyRQ(): ECFMessageClaimNotifyRq_Ext {
    var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
    return _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext
  }
}