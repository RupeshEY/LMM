package gw.acc.iplm.services.suspensequeue

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.api.database.Query
uses gw.api.database.Relop
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class LMSuspenseQueueServiceTest extends GUnitTestClass {

  private var _service: LMSuspenseQueueService

  override function beforeMethod() {
    _service = new LMSuspenseQueueService()
  }

  function testAssignMessage() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()

      assertNull(message.AssignedUser)
      message = _service.assignMessage(message)
      assertNotNull(message.AssignedUser)
    })
  }

  function testApplyMessageToPolicy_NullMessageShouldReturnNull() {
    assertNull(_service.applyMessageToPolicy(null, "Policy"))
  }

  function testApplyMessageToPolicy_NullPolicyShouldReturnNull() {
    final var mockedMessage = Mockito.mock(LMMessageLloydsSCM_Ext)
    assertNull(_service.applyMessageToPolicy(mockedMessage, null))
  }

  function testApplyMessageToPolicy() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      final var expectedPolicyNumber = "23-123123"
      var message = suspendMessage()

      assertTrue(message.Suspended)

      var appliedMessages = _service.applyMessageToPolicy(message, expectedPolicyNumber)


      assertEquals(1, appliedMessages.Count)
      assertFalse(appliedMessages.first().Suspended)
      assertEquals(expectedPolicyNumber, appliedMessages.first().PolicyNumber)
    })
  }

  function testApplyMessageToClaim() {
    final var mockedMessage = Mockito.mock(LMMessageLloydsSCM_Ext)

    assertCausesException(\->_service.applyMessageToClaim(mockedMessage, "UCR"), UnsupportedOperationException)
  }

  function testSuspendMessage() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var error = LMErrorCodeType.UCR_AND_POLICY_NUMBER_NOT_FOUND
      var message = suspendMessage(error)

      assertTrue(message.Suspended)
      assertNotNull(message.AssignedUser)
      assertEquals(error.ErrorCode, message.ValidationErrorCode)
      assertEquals(error.toString(), message.ValidationFailureReason)
    })
  }

  function testUnsuspendMessages() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var message = suspendMessage()

      assertTrue(message.Suspended)

      message = _service.unsuspendMessages({message}).first()

      assertFalse(message.Suspended)
      assertNull(message.AssignedUser)
      assertNull(message.ValidationErrorCode)
      assertNull(message.ValidationFailureReason)
    })
  }

  function testDeleteMessages() {
    var message = suspendMessageTransaction()
    assertEquals(message, getMessageWithUUID(message.UUID))

    _service.deleteMessages({message})
    assertNull(getMessageWithUUID(message.UUID))
  }

  function testGetMessagesForUser() {
    var message = suspendMessageTransaction()
    message = assignToUser(message, User.util.UnrestrictedUser)

    var messages = _service.getMessagesForUser(User.util.UnrestrictedUser)
    assertEquals(1, messages.Count)
    assertEquals(message.UUID, messages.first().UUID)
    _service.deleteMessages({message})
  }

  function testGetSuspendedMessagesCountForUser() {

    assertZero(_service.getSuspendedMessagesCountForUser(User.util.UnrestrictedUser))

    var message = suspendMessageTransaction()
    message = assignToUser(message, User.util.UnrestrictedUser)

    assertEquals(1, _service.getSuspendedMessagesCountForUser(User.util.UnrestrictedUser))
    _service.deleteMessages({message})
  }

  private function suspendMessageTransaction(error: LMErrorCodeType = LMErrorCodeType.UCR_AND_POLICY_NUMBER_NOT_FOUND) : LMMessageLloydsSCM_Ext {
    var message: LMMessageLloydsSCM_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      message = suspendMessage()
    }, User.util.UnrestrictedUser)
    return message
  }

  private function suspendMessage(error: LMErrorCodeType = LMErrorCodeType.UCR_AND_POLICY_NUMBER_NOT_FOUND) : LMMessageLloydsSCM_Ext {
    var message = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    return _service.suspendMessage(message,error.ErrorCode,error.toString())as LMMessageLloydsSCM_Ext
  }

  private function getMessageWithUUID(uuid: String) : LMMessageLloydsSCM_Ext {
    return Query.make(LMMessageLloydsSCM_Ext).compare(LMMessageLloydsSCM_Ext#UUID, Relop.Equals, uuid).select().AtMostOneRow
  }

  private function assignToUser(message: LMMessageLloydsSCM_Ext, user: User) : LMMessageLloydsSCM_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      message = bundle.add(message)
      message.AssignedUser = User.util.UnrestrictedUser
    }, User.util.UnrestrictedUser)

    return message
  }
}