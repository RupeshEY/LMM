package gw.acc.iplm.controller

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.services.suspensequeue.ECFSuspenseQueueService
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.testutils.ECFSuspenseQueueTestUtil
uses gw.api.util.DisplayableException
uses gw.testharness.v3.GUnitTestClass

class ECFSuspenseQueueControllerTest extends GUnitTestClass {

  private static final var UCR1 = "UCR1"
  private static final var UCR2 = "UCR2"
  private static final var UMR1 = "UMR1"
  private static final var TR1 = "TR1"
  private static final var INVALID_ACTION_CODE = "K"

  private var _ecfSuspenseQueueController: ECFSuspenseQueueController
  private var _ecfSuspenseQueueService: ECFSuspenseQueueService

  private static function createCNEntityWithUCRAndActionCode(ucr: String, actionCode: String): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyRqMessage = ECFMessageUtil.createNewClaimNotifyRq()
    claimNotifyRqMessage.UCR = ucr
    claimNotifyRqMessage.UMR = UMR1
    claimNotifyRqMessage.TR = TR1
    claimNotifyRqMessage.ClaimMovement.Explanation = actionCode
    return ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyRqMessage)
  }

  override function beforeMethod() {
    super.beforeMethod()
    _ecfSuspenseQueueController = new ECFSuspenseQueueController()
    _ecfSuspenseQueueService = new ECFSuspenseQueueService()
  }

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    ECFMessageEntityUtil.deleteAllECFMessagesFromDB()
  }

  function testUpdateMessageClaimRequest_MessageProcessed() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var claim = ECFSuspenseQueueTestUtil.createSampleClaimWithUCR()

    assertNotSame(claim.UCR_Ext, claimNotifyEntity.UCR)
    assertEquals("The ClaimNotify entity suspended flag should be true.", true, claimNotifyEntity.Suspended)
    var newClaimNotifyEntity = _ecfSuspenseQueueController.processMessageAgainstClaim(claimNotifyEntity, claim.UCR_Ext)

    assertNotNull(newClaimNotifyEntity)
    assertEquals("The ClaimNotify entity suspended flag should be false.", false, newClaimNotifyEntity.Suspended)
    assertEquals("The ClaimNotify claim ucr does not matach with given UCR.", claim.UCR_Ext, newClaimNotifyEntity.UCR)
    assertEquals("The ClaimNotify entity returned does not match what was given.", claimNotifyEntity.UUID, newClaimNotifyEntity.UUID)

  }

  function testUpdateMessageClaimRequest_ClaimAlreadyHasSuspendedMessages() {
    var claimNotifyInSuspenseQueue = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var claim = ECFSuspenseQueueTestUtil.createSampleClaimWithUCR()

    var claimNotifyAlreadysuspendedOnClaim = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, claim.UMR_Ext, claim.UCR_Ext, "TR1")

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claim.addToLMMessages(claimNotifyAlreadysuspendedOnClaim)
    }, User.util.UnrestrictedUser)

    assertCausesException(\-> {
      _ecfSuspenseQueueController.processMessageAgainstClaim(claimNotifyInSuspenseQueue, claim.UCR_Ext)
    }, DisplayableException)
  }

  function testUpdateMessagePolicyRequest_MessageProcessed() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var policy = ECFSuspenseQueueTestUtil.getSamplePolicyFromPolicySearch()

    assertNotSame(policy.PolicyNumber, claimNotifyEntity.InsurerReference)
    assertEquals("The ClaimNotify entity suspended flag should be true.", true, claimNotifyEntity.Suspended)
    var newClaimNotifyEntity = _ecfSuspenseQueueController.processMessageAgainstPolicy(claimNotifyEntity, policy.PolicyNumber)

    assertNotNull(newClaimNotifyEntity)
    assertEquals("The ClaimNotify entity suspended flag should be false.", false, newClaimNotifyEntity.Suspended)
    assertEquals("The ClaimNotify policy number does not matach with given policy number.", policy.PolicyNumber, newClaimNotifyEntity.PolicyNumber)
    assertEquals("The ClaimNotify entity returned does not match what was given.", claimNotifyEntity.UUID, newClaimNotifyEntity.UUID)
  }

  function testDeleteMessageRequest() {
    var ecfMessage = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var ecfMessage1 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    _ecfSuspenseQueueController.deleteECFMessages({ecfMessage, ecfMessage1})
    var retiredECFMessages = gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, ecfMessage.UUID).withFindRetired(true).select().AtMostOneRow
    assertNotNull("Message is not retired", retiredECFMessages)
    retiredECFMessages = gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, ecfMessage.UUID).select().AtMostOneRow
    assertNull("Message should not be in the not retired list", retiredECFMessages)
    assertNull("Message is still assigned to user", retiredECFMessages.AssignedUser)
  }

  function testValidateBeforeDeleteAdditionalMessage_fail() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var cnEntity1 = createCNEntityWithUCRAndActionCode(UCR1, INVALID_ACTION_CODE)
      cnEntity1.Suspended = true
      cnEntity1 = bundle.add(cnEntity1)
      var cnEntity2 = createCNEntityWithUCRAndActionCode(UCR2, INVALID_ACTION_CODE)
      cnEntity2.Suspended = true
      cnEntity2 = bundle.add(cnEntity2)
      bundle.commit()

      assertCausesException(\-> {
        _ecfSuspenseQueueController.validateBeforeDeleteAdditionalMessages({cnEntity1, cnEntity2})
      }, DisplayableException)
    }, User.util.UnrestrictedUser)
  }

  function testValidateBeforeDeleteAdditionalMessage_sucesss() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var cnEntity1 = createCNEntityWithUCRAndActionCode(UCR1, INVALID_ACTION_CODE)
      cnEntity1.Suspended = true
      bundle.add(cnEntity1)
      var cnEntity2 = createCNEntityWithUCRAndActionCode(UCR1, INVALID_ACTION_CODE)
      cnEntity2.Suspended = true
      bundle.add(cnEntity2)
      bundle.commit()

      try {
        _ecfSuspenseQueueController.validateBeforeDeleteAdditionalMessages({cnEntity1, cnEntity2})
      } catch (e: IllegalArgumentException) {
        fail("The ECF Messages array has only 1 unique combination of claim transaction(i.e UMR, UCR, TR), it should not fail.")
      }
    }, User.util.UnrestrictedUser)
  }

  function testGetAllSusupenedQueueMessagesForClaimTransaction(){
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var cnEntity1 = createCNEntityWithUCRAndActionCode(UCR1, INVALID_ACTION_CODE)
      cnEntity1.Suspended = true
      bundle.add(cnEntity1)
      var cnEntity2 = createCNEntityWithUCRAndActionCode(UCR1, INVALID_ACTION_CODE)
      cnEntity2.Suspended = true
      bundle.add(cnEntity2)
      bundle.commit()
      var messages = _ecfSuspenseQueueController.getAllSuspendedMsgsForClaimTransaction(cnEntity1)
      assertNotNull(messages)
      assertEquals(2, messages.length)
    }, User.util.UnrestrictedUser)
  }

  function testApplyMessageToClaim_MultipleMsgsWithOneInvalidCode() {
    // GIVEN
    var claim = ECFSuspenseQueueTestUtil.createSampleClaimWithUCR()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      // Set up a message
      var cnEntity1 = createCNEntityWithUCRAndActionCode(UCR1, "U")
      cnEntity1.Suspended = true
      bundle.add(cnEntity1)

      var cnEntity2 = createCNEntityWithUCRAndActionCode(UCR1, "U")
      cnEntity2.Suspended = true
      bundle.add(cnEntity2)
      var cnEntity3 = createCNEntityWithUCRAndActionCode(UCR1, "U")

      cnEntity3.Suspended = true
      bundle.add(cnEntity3)

      var cnEntity4 = createCNEntityWithUCRAndActionCode(UCR1, INVALID_ACTION_CODE)
      cnEntity4.Suspended = true
      bundle.add(cnEntity4)

      var cnEntity5 = createCNEntityWithUCRAndActionCode(UCR1, "U")
      cnEntity5.Suspended = true
      bundle.add(cnEntity5)

      var cnEntity6 = createCNEntityWithUCRAndActionCode(UCR1, "U")
      cnEntity6.Suspended = true
      bundle.add(cnEntity6)
      bundle.commit()

      //WHEN
      _ecfSuspenseQueueController.processMessageAgainstClaim(cnEntity1, claim.UCR_Ext)

      //THEN
      var susupenseQueueMessages = _ecfSuspenseQueueService.getMessagesForUser(cnEntity1.getAssignedUser())

      assertNotNull(susupenseQueueMessages)
      assertEquals(3, susupenseQueueMessages.length)
      assertEquals("The UCR on the ClaimNotifyEntity was not updated.", claim.UCR_Ext, susupenseQueueMessages.first().UCR)
      assertEquals("The UCR on the ClaimNotifyEntity was not updated.", claim.UCR_Ext, susupenseQueueMessages[1].UCR)
      assertEquals("The UCR on the ClaimNotifyEntity was not updated.", claim.UCR_Ext, susupenseQueueMessages[2].UCR)
    }, User.util.UnrestrictedUser)
  }

  function testApplyMessageToPolicy_MultipleMsgsWithOneInvalidCode() {
    // GIVEN
    var policy = ECFSuspenseQueueTestUtil.getSamplePolicyFromPolicySearch()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      // Set up a message
      var cnEntity1 = createCNEntityWithUCRAndActionCode(UCR1, "A")
      cnEntity1.Suspended = true
      bundle.add(cnEntity1)

      var cnEntity2 = createCNEntityWithUCRAndActionCode(UCR1, "A")
      cnEntity2.Suspended = true
      bundle.add(cnEntity2)
      var cnEntity3 = createCNEntityWithUCRAndActionCode(UCR1, "A")

      cnEntity3.Suspended = true
      bundle.add(cnEntity3)

      var cnEntity4 = createCNEntityWithUCRAndActionCode(UCR1, INVALID_ACTION_CODE)
      cnEntity4.Suspended = true
      bundle.add(cnEntity4)

      var cnEntity5 = createCNEntityWithUCRAndActionCode(UCR1, "U")
      cnEntity5.Suspended = true
      bundle.add(cnEntity5)

      var cnEntity6 = createCNEntityWithUCRAndActionCode(UCR1, "U")
      cnEntity6.Suspended = true
      bundle.add(cnEntity6)
      bundle.commit()

      //WHEN
      _ecfSuspenseQueueController.processMessageAgainstPolicy(cnEntity1, policy.PolicyNumber)

      //THEN
      var susupenseQueueMessages = _ecfSuspenseQueueService.getMessagesForUser(cnEntity1.getAssignedUser())

      assertNotNull(susupenseQueueMessages)
      assertEquals(3, susupenseQueueMessages.length)
      assertEquals("The ClaimNotify policy number does not matach with given policy number.", policy.PolicyNumber, susupenseQueueMessages.first().PolicyNumber)
      assertEquals("The ClaimNotify policy number does not matach with given policy number.", policy.PolicyNumber, susupenseQueueMessages[1].PolicyNumber)
      assertEquals("The ClaimNotify policy number does not matach with given policy number.", policy.PolicyNumber, susupenseQueueMessages[2].PolicyNumber)
    }, User.util.UnrestrictedUser)
  }
}