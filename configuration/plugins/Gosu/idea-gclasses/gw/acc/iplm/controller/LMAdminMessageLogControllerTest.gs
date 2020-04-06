package gw.acc.iplm.controller

uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class LMAdminMessageLogControllerTest extends GUnitTestClass {

  function testMessageDetailsMode_Default() {
    var message = Mockito.mock(ECFMessageClaimResponseRq_Ext)

    assertEquals(LMAdminMessageLogController.MESSAGE_DETAILS_MODE_DEFAULT, LMAdminMessageLogController.messageDetailsMode(message))
  }

  function testMessageDetailsMode_ClaimResponseRejected() {
    var message = Mockito.mock(ECFMessageClaimResponseRq_Ext)
    Mockito.when(message.Status).thenReturn(ECFMessageStatus_Ext.TC_REJECTED)

    assertEquals(LMAdminMessageLogController.MESSAGE_DETAILS_MODE_RESPONSE_REJECTED, LMAdminMessageLogController.messageDetailsMode(message))
  }

  function testMessageDetailsMode_ClaimResponseSuperseded() {
    var message = Mockito.mock(ECFMessageClaimResponseRq_Ext)
    Mockito.when(message.Status).thenReturn(ECFMessageStatus_Ext.TC_SUPERSEDED)

    assertEquals(LMAdminMessageLogController.MESSAGE_DETAILS_MODE_RESPONSE_SUPERSEDED, LMAdminMessageLogController.messageDetailsMode(message))
  }

  function testMessageDetailsMode_ClaimResponseFinancialAuthorisation() {
    var message = Mockito.mock(ECFMessageClaimResponseRq_Ext)
    Mockito.when(message.Status).thenReturn(ECFMessageStatus_Ext.TC_FINANCIALAUTHORISATION)

    assertEquals(LMAdminMessageLogController.MESSAGE_DETAILS_MODE_FINANCIAL_AUTHORISATION, LMAdminMessageLogController.messageDetailsMode(message))
  }
}