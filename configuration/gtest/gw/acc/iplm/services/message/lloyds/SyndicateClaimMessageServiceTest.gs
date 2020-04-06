package gw.acc.iplm.services.message.lloyds

uses entity.Activity
uses gw.acc.iplm.controller.LMSuspenseQueueController
uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.interceptor.EntityMapperInterceptor
uses gw.acc.iplm.services.suspensequeue.LMSuspenseQueueService
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.testutils.LMMUserUtil
uses gw.api.locale.DisplayKey
uses gw.api.util.CurrencyUtil
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

uses java.text.SimpleDateFormat

class SyndicateClaimMessageServiceTest extends GUnitTestClass {
  var _service: SyndicateClaimMessageService
  var _message: LMMessageLloydsSCM_Ext

  override function beforeClass() {
    CurrencyUtil.invokeMarketExchangeRateSetPlugin()
    LMMUserUtil.setUpUserForReserves()
  }

  override function beforeMethod() {
    super.beforeMethod()
    _service = new SyndicateClaimMessageService()
    _message = createMockedMessage()
  }

  override function afterMethod(error: Throwable) {
    super.afterMethod(error)

    ECFMessageEntityUtil.deleteAllLMMessagesFromDB()
  }

  function testProcess_ThrowsExceptionWhenUCRIsNull() {
    Mockito.when(_message.UCR).thenReturn(null)

    AssertUtils.assertCausesLMExceptionWithType(\-> _service.process(_message), LMErrorCodeType.CLAIM_UCR_NOT_FOUND)
  }

  function testProcess_ThrowsExceptionWhenUCRIsBlank() {
    Mockito.when(_message.UCR).thenReturn(" ")

    AssertUtils.assertCausesLMExceptionWithType(\-> _service.process(_message), LMErrorCodeType.CLAIM_UCR_NOT_FOUND)
  }

  function testProcess_CreateClaim() {
    var scmMessageEntity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    scmMessageEntity.PolicyNumber = "23-502012"

    assertNull(scmMessageEntity.Claim)

    _service.process(scmMessageEntity as LMMessageLloydsSCM_Ext)

    scmMessageEntity = scmMessageEntity.refresh() as LMMessageLloydsSCM_Ext

    assertNotNull(scmMessageEntity.Claim)
    assertEquals(1, scmMessageEntity.Claim.LMMessages.whereTypeIs(LMMessageLloydsSCM_Ext).Count)
  }

  function testProcess_AddsMessageToLMMessages() {
    var scmMessageEntity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()

    var claim = ClaimBuilderHelper.createClaimWithUCR(scmMessageEntity.UCR)

    assertEquals(0, claim.LMMessages.whereTypeIs(LMMessageLloydsSCM_Ext).Count)

    _service.process(scmMessageEntity as LMMessageLloydsSCM_Ext)

    assertEquals(1, claim.LMMessages.whereTypeIs(LMMessageLloydsSCM_Ext).Count)
  }

  function testProcess_AddActivityCreateClaimActivity() {
    var scmXml = ECFMessageUtil.createNewLloydsSyndicateClaimMessage()
    scmXml.ClaimMovement.Claim.LossPeriod.StartDate = new SimpleDateFormat("yyyy-MM-dd").format(Date.Now)
    scmXml.ClaimMovement.Claim.BrokerReference = ClaimBuilderHelper.getNextUCR()

    var scmMessageEntity = new EntityMapperInterceptor().logMessage(scmXml)

    var claim = ClaimBuilderHelper.createClaimWithUCR(scmMessageEntity.UCR)

    final var initialActivities = getLMActivities(claim).Count
    final var expectedSubject = DisplayKey.get("Accelerator.IPLM.Activity.LM.NewClaim.Subject", claim.ClaimNumber, scmMessageEntity.MessageTypeString)

    _service.process(scmMessageEntity as LMMessageLloydsSCM_Ext)

    assertEquals(initialActivities+1, getLMActivities(claim).Count)
    assertEquals(expectedSubject, getLMActivities(claim).last().Subject)
  }

  function testProcess_AddActivityExistingClaimActivity() {
    var scmXml1 = ECFMessageUtil.createNewLloydsSyndicateClaimMessage()
    scmXml1.ClaimMovement.Claim.LossPeriod.StartDate = new SimpleDateFormat("yyyy-MM-dd").format(Date.Now)
    var scmXml2 = ECFMessageUtil.createNewLloydsSyndicateClaimMessage()
    scmXml2.ClaimMovement.Claim.LossPeriod.StartDate = new SimpleDateFormat("yyyy-MM-dd").format(Date.Now)

    scmXml1.ClaimMovement.Claim.BrokerReference = ClaimBuilderHelper.getNextUCR()
    scmXml2.ClaimMovement.Claim.BrokerReference = scmXml1.ClaimMovement.Claim.BrokerReference

    var scmMessageEntity1 = new EntityMapperInterceptor().logMessage(scmXml1)
    var scmMessageEntity2 = new EntityMapperInterceptor().logMessage(scmXml2)

    var claim = ClaimBuilderHelper.createClaimWithUCR(scmMessageEntity1.UCR)

    final var initialActivities = getLMActivities(claim).Count
    final var expectedSubject = DisplayKey.get("Accelerator.IPLM.Activity.LM.ExistingClaim.Subject", claim.ClaimNumber, scmMessageEntity2.MessageTypeString)

    _service.process(scmMessageEntity1 as LMMessageLloydsSCM_Ext)
    _service.process(scmMessageEntity2 as LMMessageLloydsSCM_Ext)

    assertEquals(initialActivities + 2, getLMActivities(claim).Count)
    assertEquals(expectedSubject, getLMActivities(claim).last().Subject)
  }

  function testProcess_CreatesClaimWithLossDetails() {
    var scmMessageEntity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()

    _service.process(scmMessageEntity)
    scmMessageEntity = scmMessageEntity.refresh() as LMMessageLloydsSCM_Ext

    assertEquals(scmMessageEntity.LossDescription, scmMessageEntity.Claim.Description)
    assertEquals(scmMessageEntity.LossLocation, scmMessageEntity.Claim.LossLocation.Description)
    assertEquals(scmMessageEntity.LossStartDate, scmMessageEntity.Claim.LossDate)
    assertEquals(scmMessageEntity.LossEndDate, scmMessageEntity.Claim.LossEndDate_Ext)
  }

  function testProcess_UpdatesClaimWithLossDetails() {
    var scmMessageEntity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()

    var claim = ClaimBuilderHelper.createClaimWithUCR(scmMessageEntity.UCR)

    _service.process(scmMessageEntity)
    scmMessageEntity = scmMessageEntity.refresh() as LMMessageLloydsSCM_Ext

    assertEquals(scmMessageEntity.LossDescription, scmMessageEntity.Claim.Description)
    assertEquals(scmMessageEntity.LossLocation, scmMessageEntity.Claim.LossLocation.Description)
    assertEquals(scmMessageEntity.LossStartDate, scmMessageEntity.Claim.LossDate)
    assertEquals(scmMessageEntity.LossEndDate, scmMessageEntity.Claim.LossEndDate_Ext)
  }

  function testReprocessSuspendedMessages_UnsuspendsAndProcessesMessages() {
    final var UCR = "UCR0"
    var existingMessages: List<LMMessageLloydsSCM_Ext> = {createSCMMessage(:ucr = UCR, :messageSequence = 2, :movementRefSeq = "AB"), createSCMMessage(:ucr = UCR, :messageSequence = 3, :movementRefSeq = "AC")}
    existingMessages = existingMessages.map(\message -> suspendMessage(message))
    var newMessage = createSCMMessage(:ucr = UCR)

    spySuspenseQueueController()
    _service.process(newMessage)

    existingMessages = existingMessages.map(\message -> message.refresh() as LMMessageLloydsSCM_Ext)
    assertEquals(2, existingMessages.Count)
    existingMessages.each(\message -> {
      assertFalse(message.Suspended)
      assertFalse(message.Reprocess)
      Mockito.verify(_service.SuspenseQueueController, Mockito.times(1)).unsuspendAndReprocessMessage(message)
    })
  }

  function testReprocessSuspendedMessages_NoNextMessage() {
    final var UCR = "UCR2"
    var newMessage = createSCMMessage(:ucr = UCR)

    try {
      _service.process(newMessage)
    } catch (e: Exception) {
      fail("Processing the message failed when there was no next message" + e)
    }
  }

  function testReprocessSuspendedMessages_NextMessageSequenceIsTwoAway() {
    final var UCR = "UCR3"
    var existingMessages: List<LMMessageLloydsSCM_Ext> = {createSCMMessage(:ucr = UCR, :messageSequence = 3), createSCMMessage(:ucr = UCR, :messageSequence = 4)}
    existingMessages = existingMessages.map(\message -> suspendMessage(message))
    var newMessage = createSCMMessage(:ucr = UCR)

    spySuspenseQueueController()
    _service.process(newMessage)

    existingMessages = existingMessages.map(\message -> message.refresh() as LMMessageLloydsSCM_Ext)
    assertEquals(2, existingMessages.Count)
    existingMessages.each(\message -> {
      assertTrue(message.Suspended)
      assertFalse(message.Reprocess)
      Mockito.verify(_service.SuspenseQueueController, Mockito.times(0)).unsuspendAndReprocessMessage(message)
    })
  }

  function testReprocessSuspendedMessages_NextMessageSequenceIsForOtherOCR() {
    final var UCR = "UCR4"
    var existingMessages: List<LMMessageLloydsSCM_Ext> = {createSCMMessage(:ucr = UCR, :ocr = "OCR2"), createSCMMessage(:ucr = UCR, :messageSequence = 2, :ocr = "OCR2")}
    existingMessages = existingMessages.map(\message -> suspendMessage(message))
    var newMessage = createSCMMessage(:ucr = UCR)

    spySuspenseQueueController()
    _service.process(newMessage)

    existingMessages = existingMessages.map(\message -> message.refresh() as LMMessageLloydsSCM_Ext)
    assertEquals(2, existingMessages.Count)
    existingMessages.each(\message -> {
      assertTrue(message.Suspended)
      assertFalse(message.Reprocess)
      Mockito.verify(_service.SuspenseQueueController, Mockito.times(0)).unsuspendAndReprocessMessage(message)
    })
  }

  function testReprocessSuspendedMessages_FirstMessageThrowsException() {
    final var UCR = "UCR5"
    var existingMessages: List<LMMessageLloydsSCM_Ext> = {createSCMMessage(:ucr = UCR, :messageSequence = 2), createSCMMessage(:ucr = UCR, :messageSequence = 3)}
    existingMessages = existingMessages.map(\message -> suspendMessage(message))
    var newMessage = createSCMMessage(:ucr = UCR)


    _service.SuspenseQueueController = Mockito.mock(LMSuspenseQueueController)
    Mockito.doThrow(new LMException(LMErrorCodeType.UCR_AND_POLICY_NUMBER_NOT_FOUND)).when(_service.SuspenseQueueController).unsuspendAndReprocessMessage(existingMessages[0])
    _service.process(newMessage)

    existingMessages = existingMessages.map(\message -> message.refresh() as LMMessageLloydsSCM_Ext)
    assertEquals(2, existingMessages.Count)
    existingMessages.each(\message -> {
      assertFalse(message.Reprocess)
    })
    Mockito.verify(_service.SuspenseQueueController, Mockito.times(1)).unsuspendAndReprocessMessage(existingMessages[0])
    Mockito.verify(_service.SuspenseQueueController, Mockito.times(0)).unsuspendAndReprocessMessage(existingMessages[1])
}

  private function createMockedMessage(): LMMessageLloydsSCM_Ext {
    var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    var content = new Blob(ECFMessageUtil.createNewLloydsSyndicateClaimMessage().asUTFString().Bytes)
    Mockito.when(message.Content).thenReturn(content)

    return message
  }

  private function getLMActivities(claim: Claim) : Activity[] {
    return claim.Activities
        .sortBy(\elt -> elt.CreateTime)
        .where(\elt -> elt.LMMessage_Ext != null)
  }

  private function suspendMessage(message: LMMessageLloydsSCM_Ext, errorCode: LMErrorCodeType = LMErrorCodeType.PREVIOUS_MOVEMENT_NOT_POSTED) : LMMessageLloydsSCM_Ext {
    return new LMSuspenseQueueService().suspendMessage(message, errorCode.ErrorCode, errorCode.toString()) as LMMessageLloydsSCM_Ext
  }

  private function createSCMMessage(messageSequence: Integer = 1,
                                    brokerPartyId: String = "0623",
                                    ucr: String = "UCR1",
                                    ocr: String = "OCR1",
                                    movementRefSeq: String = "AA") : LMMessageLloydsSCM_Ext{
    var message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      message = bundle.add(message)
      message.MessageSequence = messageSequence
      message.UCR = ucr
      message.OCR = ocr
      message.MovementReferenceSequence = movementRefSeq
      message.ContactData.BrokerPartyId = brokerPartyId
    }, User.util.UnrestrictedUser)

    return message
  }

  private function spySuspenseQueueController() {
    _service.SuspenseQueueController = Mockito.spy(new LMSuspenseQueueController())
  }
}