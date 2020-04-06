package gw.acc.iplm.controller

uses gw.acc.iplm.InterceptorManagerWrapper
uses gw.acc.iplm.services.suspensequeue.LMSuspenseQueueService
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class LMSuspenseQueueControllerTest extends GUnitTestClass {

  private var _interceptorManager: InterceptorManagerWrapper
  private var _service: LMSuspenseQueueService
  private var _controller: LMSuspenseQueueController

  override function beforeMethod() {
    _interceptorManager = Mockito.mock(InterceptorManagerWrapper)
    _service = Mockito.mock(LMSuspenseQueueService)

    _controller = new LMSuspenseQueueController(_service, _interceptorManager)
  }

  function testProcessMessageAgainstPolicy() {
    final var expectedMessage = Mockito.mock(LMMessageLloydsSCM_Ext)
    final var expectedPolicy = "23-123123"
    Mockito.doReturn({expectedMessage}).when(_service).applyMessageToPolicy(expectedMessage, expectedPolicy)

    var message = _controller.processMessageAgainstPolicy(expectedMessage, expectedPolicy)

    Mockito.verify(_service, Mockito.times(1)).applyMessageToPolicy(expectedMessage, expectedPolicy)
    Mockito.verify(_interceptorManager, Mockito.times(1)).intercept(expectedMessage)
    assertEquals(expectedMessage, message)
  }

  function testDeleteMessages() {
    final var expectedMessage = Mockito.mock(LMMessageLloydsSCM_Ext)

    _controller.deleteMessages({expectedMessage})

    Mockito.verify(_service, Mockito.times(1)).deleteMessages({expectedMessage})
  }

  function testGetMessagesForUser() {
    final var expectedMessages: LMMessageLloydsSCM_Ext[] = {Mockito.mock(LMMessageLloydsSCM_Ext)}
    final var expectedUser = User.util.UnrestrictedUser
    Mockito.doReturn(expectedMessages).when(_service).getMessagesForUser(expectedUser)

    var messages = _controller.getMessagesForUser(expectedUser)

    Mockito.verify(_service).getMessagesForUser(expectedUser)
    assertEquals(expectedMessages, messages)
  }

  function testGetNumberSuspendedMessagesForUser() {
    final var expectedUser = User.util.UnrestrictedUser
    final var expectedMessages = 10
    Mockito.doReturn(expectedMessages).when(_service).getSuspendedMessagesCountForUser(expectedUser)

    assertEquals(expectedMessages, _controller.getNumberSuspendedMessagesForUser(expectedUser))
  }

  function testUnsuspendAndReprocessMessage_NullMessage() {
    assertNull(_controller.unsuspendAndReprocessMessage(null))
  }

  function testUnsuspendAndReprocessMessage_CallsInterceptorManager() {
    final var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    Mockito.doReturn(message).when(_service).unsuspendMessageEntity(message)

    _controller.unsuspendAndReprocessMessage(message)

    Mockito.verify(_interceptorManager, Mockito.times(1)).intercept(message)
  }

  function testUnsuspendAndReprocessMessage_UnsuspendsMessage() {
    final var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    Mockito.doReturn(message).when(_service).unsuspendMessageEntity(message)

    _controller.unsuspendAndReprocessMessage(message)

    Mockito.verify(_service, Mockito.times(1)).unsuspendMessageEntity(message)
  }

}