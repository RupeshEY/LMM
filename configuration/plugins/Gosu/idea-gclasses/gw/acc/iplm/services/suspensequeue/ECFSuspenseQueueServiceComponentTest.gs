package gw.acc.iplm.services.suspensequeue

uses gw.acc.iplm.dto.SuspenseQueueClaimTransactionDTO
uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.testutils.ECFSuspenseQueueTestUtil
uses gw.api.util.DisplayableException
uses gw.testharness.v3.GUnitTestClass
uses entity.LMMessage_Ext

class ECFSuspenseQueueServiceComponentTest extends GUnitTestClass {

  private static final var UCR1 = "UCR1"
  private static final var UCR2 = "UCR2"
  private static final var UMR1 = "UMR1"
  private static final var TR1 = "TR1"
  private var _entityMapperService: EntityMapperService
  var _ecfSuspenseQueueService: ECFSuspenseQueueService

  override function beforeMethod() {
    super.beforeMethod()
    _ecfSuspenseQueueService = new ECFSuspenseQueueService()
    _entityMapperService = new EntityMapperService()
  }

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    ECFMessageEntityUtil.deleteAllECFMessagesFromDB()
  }

  function testManualCheckHasAssignedUser() {
    var claimNotifyRqMessage: ECFMessageClaimNotifyRq_Ext
    var messageAfterSettingManualCheck: LMMessage_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      // Set up a message
      var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
      var claim = ClaimBuilderHelper.createClaim()
      claim = bundle.add(claim)
      claim.assignUserAndDefaultGroup(User.util.UnrestrictedUser)
      claimNotifyRqMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext
      claimNotifyRqMessage = bundle.add(claimNotifyRqMessage)
      claimNotifyRqMessage.Claim = claim
    }, User.util.UnrestrictedUser)
    // Check that the reason doesn't exist and no user is assigned
    assertNull("Didn't expect a user to be assigned yet", claimNotifyRqMessage.AssignedUser)
    assertNull("Didn't expect a validation failure reason yet", claimNotifyRqMessage.ValidationFailureReason)
    var validationFailureMessage = "Test that a validation failed"
    var validationErrorCode = 999
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      // Call the manual check with a reason for the error
      messageAfterSettingManualCheck = _ecfSuspenseQueueService.suspendMessage(claimNotifyRqMessage, validationErrorCode, validationFailureMessage)
      messageAfterSettingManualCheck = bundle.add(messageAfterSettingManualCheck)
    }, User.util.UnrestrictedUser)
    // Check that the reason exists and is the expected one and a user has been assigned
    assertNotNull("Expected a user to be assigned", (messageAfterSettingManualCheck as ECFMessageClaimNotifyRq_Ext).AssignedUser)
    assertEquals(validationFailureMessage, messageAfterSettingManualCheck.ValidationFailureReason)
    assertEquals(validationErrorCode, messageAfterSettingManualCheck.ValidationErrorCode)
  }


  function testMsgAssignedToUserWithAnExistingSuspendedMsg() {
    var claimNotifyRqMessage1: ECFMessageClaimNotifyRq_Ext
    var claimNotifyRqMessage2: ECFMessageClaimNotifyRq_Ext
    var message1AfterSettingManualCheck: LMMessage_Ext
    var message2AfterSettingManualCheck: LMMessage_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      // Set up a message
      claimNotifyRqMessage1 = ECFSuspenseQueueTestUtil.validMessage(UMR1, UCR1, TR1)
      claimNotifyRqMessage1 = bundle.add(claimNotifyRqMessage1)
      claimNotifyRqMessage2 = ECFSuspenseQueueTestUtil.validMessage(UMR1, UCR1, TR1)
      claimNotifyRqMessage2 = bundle.add(claimNotifyRqMessage2)
    }, User.util.UnrestrictedUser)
    // Check that the reason doesn't exist and no user is assigned
    assertNull("Didn't expect a user to be assigned to claimNotifyRqMessage1", claimNotifyRqMessage1.AssignedUser)
    assertNull("Didn't expect a validation failure reason yet for claimNotifyRqMessage1", claimNotifyRqMessage1.ValidationFailureReason)
    assertNull("Didn't expect a user to be assigned to claimNotifyRqMessage2 ", claimNotifyRqMessage2.AssignedUser)
    assertNull("Didn't expect a validation failure reason yet for claimNotifyRqMessage2", claimNotifyRqMessage2.ValidationFailureReason)
    var validationFailureMessage = "Test that a validation failed"
    var validationErrorCode = 999
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      // Call the manual check with a reason for the error
      message1AfterSettingManualCheck = _ecfSuspenseQueueService.suspendMessage(claimNotifyRqMessage1, validationErrorCode, validationFailureMessage)
      message1AfterSettingManualCheck = bundle.add(message1AfterSettingManualCheck)
      message2AfterSettingManualCheck = _ecfSuspenseQueueService.suspendMessage(claimNotifyRqMessage2, validationErrorCode, validationFailureMessage)
      message2AfterSettingManualCheck = bundle.add(message2AfterSettingManualCheck)
    }, User.util.UnrestrictedUser)

    assertNotNull("Expected a user to be assigned", message1AfterSettingManualCheck.AssignedUser)
    assertEquals(validationFailureMessage, message1AfterSettingManualCheck.ValidationFailureReason)
    assertEquals(validationErrorCode, message1AfterSettingManualCheck.ValidationErrorCode)
    assertNotNull("Expected a user to be assigned", message2AfterSettingManualCheck.AssignedUser)
    assertEquals(validationFailureMessage, message2AfterSettingManualCheck.ValidationFailureReason)
    assertEquals(validationErrorCode, message2AfterSettingManualCheck.ValidationErrorCode)
    // Check that assign user for claim notify message 1 and claim notify message 2 are similar
    assertEquals(message1AfterSettingManualCheck.AssignedUser, message2AfterSettingManualCheck.AssignedUser)
  }

  function testMessagesAssignedToUser() {
    var uuid1: String
    var userToTest = User.util.UnrestrictedUser
    var claimNotifyRq2: ECFMessageClaimNotifyRq_Ext
    var anotherUser: User

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var xmlPayload1 = ECFMessageUtil.createNewClaimNotifyRq()
      var claimNotifyRq1 = _entityMapperService.createEntity(xmlPayload1) as ECFMessageClaimNotifyRq_Ext
      claimNotifyRq1 = bundle.add(claimNotifyRq1)
      uuid1 = claimNotifyRq1.UUID
      var xmlPayload2 = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyRq2 = _entityMapperService.createEntity(xmlPayload2) as ECFMessageClaimNotifyRq_Ext
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq1.assignUserAndDefaultGroup(userToTest)
    }, User.util.UnrestrictedUser)

    var messages = _ecfSuspenseQueueService.getMessagesForUser(userToTest)
    assertEquals(1, messages.Count)
    assertEquals(uuid1, messages.first().UUID)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq2 = bundle.add(claimNotifyRq2)
      claimNotifyRq2.assignUserAndDefaultGroup(userToTest)
    }, User.util.UnrestrictedUser)

    messages = _ecfSuspenseQueueService.getMessagesForUser(userToTest)
    assertEquals(2, messages.Count)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      anotherUser = ECFSuspenseQueueTestUtil.createUser(bundle)
      anotherUser = bundle.add(anotherUser)
    }, User.util.UnrestrictedUser)
    messages = _ecfSuspenseQueueService.getMessagesForUser(anotherUser)
    assertEquals(0, messages.Count)
  }

  function testRetireECFMessage() {
    var ecfMessage = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    _ecfSuspenseQueueService.deleteMessages({ecfMessage})
    var retiredECFMessages = gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, ecfMessage.UUID).withFindRetired(true).select().AtMostOneRow
    assertNotNull("Message is not retired", retiredECFMessages)
    retiredECFMessages = gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, ecfMessage.UUID).select().AtMostOneRow
    assertNull("Message should not be in the not retired list", retiredECFMessages)
    assertNull("Message is still assigned to user", retiredECFMessages.AssignedUser)
  }

  function testApplyMessageToClaim_MessageProcessed() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var claim = ECFSuspenseQueueTestUtil.createSampleClaimWithUCR()

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToClaim(claimNotifyEntity, claim.UCR_Ext)

    assertNotNull(updatedCNMessages)
    assertEquals("The ClaimNotify entity returned does not match what was given.", claimNotifyEntity.UUID, updatedCNMessages.first().UUID)
  }

  function testApplyMessageToClaimWithMultipleMsgs_MessageProcessed() {
    var claimNotifyEntity1 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, "ucr2", TR1)
    var claimNotifyEntity2 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, "ucr2", TR1)
    var claimNotifyEntity3 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, "ucr2", TR1)

    var claim = ECFSuspenseQueueTestUtil.createSampleClaimWithUCR()
    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToClaim(claimNotifyEntity1, claim.UCR_Ext)

    assertNotNull(updatedCNMessages)
    assertEquals(3, updatedCNMessages.size())
    assertEquals("The ClaimNotify entity returned does not match what was given.", claimNotifyEntity1.UUID, updatedCNMessages.first().UUID)
    assertEquals("The ClaimNotify entity returned does not match what was given.", claimNotifyEntity2.UUID, updatedCNMessages[1].UUID)
    assertEquals("The ClaimNotify entity returned does not match what was given.", claimNotifyEntity3.UUID, updatedCNMessages[2].UUID)
    assertEquals("The UCR on the ClaimNotifyEntity was not updated.", claim.UCR_Ext, updatedCNMessages.first().UCR)
    assertEquals("The UCR on the ClaimNotifyEntity was not updated.", claim.UCR_Ext, updatedCNMessages[1].UCR)
    assertEquals("The UCR on the ClaimNotifyEntity was not updated.", claim.UCR_Ext, updatedCNMessages[2].UCR)
    assertEquals("The UMR on the ClaimNotifyEntity was not updated.", UMR1, updatedCNMessages.first().UMR)
  }

  function testApplyMessageToClaim_UCRChanged() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var preMessageUCR = claimNotifyEntity.UCR

    var claim = ECFSuspenseQueueTestUtil.createSampleClaimWithUCR()

    assertNotNull("The ClaimNotify message should contain a UCR.", preMessageUCR)

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToClaim(claimNotifyEntity, claim.UCR_Ext)

    assertNotNull(updatedCNMessages)
    assertNotSame("The UCR on the ClaimNotifyEntity was not updated.", preMessageUCR, updatedCNMessages.first().UCR)
  }

  function testApplyMessageToClaim_XMLContentUnchanged() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var claimNotifyXmlContent = claimNotifyEntity.Content

    var claim = ECFSuspenseQueueTestUtil.createSampleClaimWithUCR()

    assertNotNull("The ClaimNotify message should contain XML Content.", claimNotifyXmlContent)

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToClaim(claimNotifyEntity, claim.UCR_Ext)

    assertNotNull(updatedCNMessages)
    assertEquals("The XML Content in the ClaimNotify entity was changed.", claimNotifyXmlContent, updatedCNMessages.first().Content)
  }

  function testApplyMessageToClaim_ErrorCodesCleared() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var claim = ECFSuspenseQueueTestUtil.createSampleClaimWithUCR()

    assertNotNull("There should be an ErrorCode on the message.", claimNotifyEntity.ValidationErrorCode)

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToClaim(claimNotifyEntity, claim.UCR_Ext)

    assertNotNull(updatedCNMessages)
    assertNull("There should be no ErrorCode on the message.", updatedCNMessages.first().ValidationErrorCode)
  }

  function testApplyMessageToClaim_Unassigned() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var claim = ECFSuspenseQueueTestUtil.createSampleClaimWithUCR()

    assertNotNull("There should be no an assignee on the message.", claimNotifyEntity.AssignedUser)

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToClaim(claimNotifyEntity, claim.UCR_Ext)

    assertNotNull(updatedCNMessages)
    assertNull("There should be no one assigned to the message.", updatedCNMessages.first().AssignedUser)
  }

  function testApplyMessageToClaim_MessageUnsuspended() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var claim = ECFSuspenseQueueTestUtil.createSampleClaimWithUCR()

    assertTrue("The message should be suspended.", claimNotifyEntity.Suspended)

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToClaim(claimNotifyEntity, claim.UCR_Ext)

    assertNotNull(updatedCNMessages)
    assertFalse("The message should no longer be suspended.", updatedCNMessages.first().Suspended)
  }

  function testApplyMessageToClaim_NullUCR() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var ucr: String = null

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToClaim(claimNotifyEntity, ucr)
    assertNull("The return value should be null when null arguments are provided.", updatedCNMessages)
  }

  function testApplyMessageToClaim_NullMessage() {
    var claimNotifyEntity: ECFMessageClaimNotifyRq_Ext = null
    var claim = ECFSuspenseQueueTestUtil.createSampleClaimWithUCR()

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToClaim(claimNotifyEntity, claim.UCR_Ext)
    assertNull("The return value should be null when null arguments are provided.", updatedCNMessages)
  }

  function testApplyMessageToClaim_NullMessageAndUCR() {
    var claimNotifyEntity: ECFMessageClaimNotifyRq_Ext = null
    var ucr: String = null

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToClaim(claimNotifyEntity, ucr)
    assertNull("The return value should be null when null arguments are provided.", updatedCNMessages)
  }

  function testApplyMessageToPolicy_MessageProcessed() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var policy = ECFSuspenseQueueTestUtil.getSamplePolicyFromPolicySearch()

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToPolicy(claimNotifyEntity, policy.PolicyNumber)

    assertNotNull(updatedCNMessages)
    assertEquals("The ClaimNotify entity returned does not match what was given.", claimNotifyEntity.UUID, updatedCNMessages.first().UUID)
  }

  function testApplyMessageToPolicyWithMultipleMsgs_MessageProcessed() {
    var claimNotifyEntity1 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, "ucr2", TR1)
    var claimNotifyEntity2 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, "ucr2", TR1)
    var claimNotifyEntity3 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, "ucr2", TR1)

    var policy = ECFSuspenseQueueTestUtil.getSamplePolicyFromPolicySearch()
    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToPolicy(claimNotifyEntity1, policy.PolicyNumber)

    assertNotNull(updatedCNMessages)
    assertEquals(3, updatedCNMessages.size())
    assertEquals("The ClaimNotify entity returned does not match what was given.", claimNotifyEntity1.UUID, updatedCNMessages.first().UUID)
    assertEquals("The ClaimNotify entity returned does not match what was given.", claimNotifyEntity2.UUID, updatedCNMessages[1].UUID)
    assertEquals("The ClaimNotify entity returned does not match what was given.", claimNotifyEntity3.UUID, updatedCNMessages[2].UUID)
    assertEquals("The policy on the ClaimNotifyEntity was not updated.", policy.PolicyNumber, updatedCNMessages.first().PolicyNumber)
    assertEquals("The policy on the ClaimNotifyEntity was not updated.", policy.PolicyNumber, updatedCNMessages[1].PolicyNumber)
    assertEquals("The policy on the ClaimNotifyEntity was not updated.", policy.PolicyNumber, updatedCNMessages[1].PolicyNumber)
    assertEquals("The UMR on the ClaimNotifyEntity was not updated.", UMR1, updatedCNMessages.first().UMR)
  }

  function testDeleteECFMessagesAndUnsuspendMessagesForClaimTransactions() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var cn1 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR2, TR1)
      var cn2 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR2, TR1)
      _ecfSuspenseQueueService.deleteMessages({cn1})
      var updatedCNMessages = _ecfSuspenseQueueService.unsuspendMessagesForClaimTransactions({UMR1 + UCR1 + TR1->new SuspenseQueueClaimTransactionDTO(UMR1, UCR2, TR1)})
      assertNotNull(updatedCNMessages)
      assertEquals(1, updatedCNMessages.size())
    }, User.util.UnrestrictedUser)
  }

  function testCreateClaimTransactionHashMap() {
    var cn1 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR1, TR1)
    var cn2 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR1, TR1)
    var cn3 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR1, TR1)
    var cn4 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR2, TR1)
    var cn5 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR2, TR1)
    var cn6 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR2, TR1)
    var cn7 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR2, TR1)
    var messages = _ecfSuspenseQueueService.createClaimTransactionHashMap({cn1, cn2, cn3, cn4, cn5, cn6, cn7})
    assertNotNull(messages)
    assertEquals(2, messages.size())
  }

  function testCreateClaimTransactionHashMap_withNull() {
    var messages = _ecfSuspenseQueueService.createClaimTransactionHashMap({null, null})
    assertNotNull(messages)
    assertEquals(0, messages.size())
  }

  function testUnsuspendMessagesForClaimTransactions_withNullValues() {
    var updatedCNMessages = _ecfSuspenseQueueService.unsuspendMessagesForClaimTransactions({UMR1 + UCR1 + TR1->null,
        UMR1 + UCR2 + TR1->null})
    assertNull(updatedCNMessages)
  }

  function testUnsuspendMessagesForClaimTransactions_withNull() {
    var updatedCNMessages = _ecfSuspenseQueueService.unsuspendMessagesForClaimTransactions(null)
    assertNull(updatedCNMessages)
  }

  function testValidateBeforeDeleteAdditionalMessagesPopUp_fail() {
    var cn1 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR1, TR1)
    var cn2 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR2, TR1)
    assertCausesException(\-> {
      _ecfSuspenseQueueService.validateBeforeDeleteAdditionalMessages({cn1, cn2})
    }, DisplayableException)
  }

  function testValidateBeforeDeleteAdditionalMessagesPopUp_success() {
    var cn1 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR1, TR1)
    var cn2 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR1, TR1)

    try {
      _ecfSuspenseQueueService.validateBeforeDeleteAdditionalMessages({cn1, cn2})
    } catch (e: IllegalArgumentException) {
      fail("The ECF Messages array has only 1 unique combination of claim transaction(i.e UMR, UCR, TR), it should not fail.")
    }
  }

  function testValidateBeforeDeleteAdditionalMessagesPopUp_withNullValues() {
    try {
      _ecfSuspenseQueueService.validateBeforeDeleteAdditionalMessages({null, null})
    } catch (e: IllegalArgumentException) {
      fail("The ECF Messages array has only 1 unique combination of claim transaction(i.e UMR, UCR, TR), it should not fail.")
    }
  }

  function testValidateBeforeDeleteAdditionalMessagesPopUp_withNull() {
    try {
      _ecfSuspenseQueueService.validateBeforeDeleteAdditionalMessages(null)
    } catch (e: IllegalArgumentException) {
      fail("The ECF Messages array has only 1 unique combination of claim transaction(i.e UMR, UCR, TR), it should not fail.")
    }
  }

  function testFindAllSuspendedMsgsForClaimTransaction() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var cn1 = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntityWithTransactionDetail(_ecfSuspenseQueueService, UMR1, UCR1, TR1)
      var messages = _ecfSuspenseQueueService.findAllSuspendedMsgsForClaimTransaction(cn1)
      assertNotNull(messages)
      assertEquals(1, messages.size())
    }, User.util.UnrestrictedUser)
  }

  function testApplyMessageToPolicy_XMLContentUnchanged() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var claimNotifyXmlContent = claimNotifyEntity.Content

    var policy = ECFSuspenseQueueTestUtil.getSamplePolicyFromPolicySearch()

    assertNotNull("The ClaimNotify message should contain XML Content.", claimNotifyXmlContent)

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToPolicy(claimNotifyEntity, policy.PolicyNumber)

    assertNotNull(updatedCNMessages)
    assertEquals("The XML Content in the ClaimNotify entity was changed.", claimNotifyXmlContent, updatedCNMessages.first().Content)
  }

  function testApplyMessageToPolicy_MessageUnsuspended() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var policy = ECFSuspenseQueueTestUtil.getSamplePolicyFromPolicySearch()

    assertTrue("The message should be suspended.", claimNotifyEntity.Suspended)

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToPolicy(claimNotifyEntity, policy.PolicyNumber)

    assertNotNull(updatedCNMessages)
    assertFalse("The message should no longer be suspended.", updatedCNMessages.first().Suspended)
  }

  function testApplyMessageToPolicy_ErrorCodesCleared() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var policy = ECFSuspenseQueueTestUtil.getSamplePolicyFromPolicySearch()

    assertNotNull("There should be an ErrorCode on the message.", claimNotifyEntity.ValidationErrorCode)

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToPolicy(claimNotifyEntity, policy.PolicyNumber)

    assertNotNull(updatedCNMessages)
    assertNull("There should be no ErrorCode on the message.", updatedCNMessages.first().ValidationErrorCode)
  }

  function testApplyMessageToPolicy_Unassigned() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var policy = ECFSuspenseQueueTestUtil.getSamplePolicyFromPolicySearch()

    assertNotNull("There should be no an assignee on the message.", claimNotifyEntity.AssignedUser)

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToPolicy(claimNotifyEntity, policy.PolicyNumber)

    assertNotNull(updatedCNMessages)
    assertNull("There should be no one assigned to the message.", updatedCNMessages.first().AssignedUser)
  }

  function testApplyMessageToPolicy_NullPolicy() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var policy: Policy = null

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToPolicy(claimNotifyEntity, policy.PolicyNumber)
    assertNull("The return value should be null when null arguments are provided.", updatedCNMessages)
  }

  function testApplyMessageToPolicy_NullMessage() {
    var claimNotifyEntity: ECFMessageClaimNotifyRq_Ext = null
    var policy = ECFSuspenseQueueTestUtil.getSamplePolicyFromPolicySearch()

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToPolicy(claimNotifyEntity, policy.PolicyNumber)
    assertNull("The return value should be null when null arguments are provided.", updatedCNMessages)
  }

  function testApplyMessageToPolicy_NullMessageAndPolicy() {
    var claimNotifyEntity: ECFMessageClaimNotifyRq_Ext = null
    var policy: Policy = null

    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToPolicy(claimNotifyEntity, policy.PolicyNumber)
    assertNull("The return value should be null when null arguments are provided.", updatedCNMessages)
  }

  function testApplyMessageToPolicy_PolicyNumberChanged() {
    var claimNotifyEntity = ECFSuspenseQueueTestUtil.createSuspendedClaimNotifyEntity(_ecfSuspenseQueueService)
    var prePolicyNumber = claimNotifyEntity.PolicyNumber

    var policy = ECFSuspenseQueueTestUtil.getSamplePolicyFromPolicySearch()
    assertNotNull("The ClaimNotify message should contain a PolicyNumber.", prePolicyNumber)
    var updatedCNMessages = _ecfSuspenseQueueService.applyMessageToPolicy(claimNotifyEntity, policy.PolicyNumber)

    assertNotNull(updatedCNMessages)
    assertNotSame("The PolicyNumber on the ClaimNotifyEntity was not updated.", prePolicyNumber, updatedCNMessages.first().PolicyNumber)
  }

}