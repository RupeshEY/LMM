package gw.acc.iplm.handler.ecfwriteback

uses gw.acc.iplm.handler.BaseHandlerTest
uses gw.acc.iplm.services.message.ecfwriteback.ClaimNotifyService
uses gw.acc.iplm.services.message.ecfwriteback.RespondErrorNotifyService
uses gw.acc.iplm.testutils.EntityUtil
uses org.mockito.Mockito

/**
 * Most tests are defined and inherited from the parent class. Custom tests can be added in this class.
 */
class ClaimNotifyHandlerTest extends BaseHandlerTest {

  override function beforeMethod() {
    prepareTest()
        .forHandler(new ClaimNotifyHandler())
        .withValidSubtypes({typekey.LMMessage_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT})
        .withExpectedServiceClass(ClaimNotifyService)
  }

  function testProcessErrorNotify() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\ -> {
      var mockedService = Mockito.mock(ClaimNotifyService)
      var mockedRespondErrorService = Mockito.mock(RespondErrorNotifyService)
      var message = new ECFMessageClaimNotifyRq_Ext()

      Mockito.doNothing().when(mockedService).process(Mockito.any(ECFMessageClaimNotifyRq_Ext))
      Mockito.doNothing().when(mockedRespondErrorService).process(Mockito.any(ECFMessageClaimNotifyRq_Ext))
      message.MessageType = ECFMessageType_Ext.TC_RESPONDERRORNOTIFY

      _handler.Service = mockedService
      (_handler as ClaimNotifyHandler).RespondErrorNotifyService = mockedRespondErrorService
      _handler.processMessage(message)

      Mockito.verify(mockedRespondErrorService, Mockito.times(1)).process(Mockito.any(ECFMessageClaimNotifyRq_Ext))
      Mockito.verify(mockedService, Mockito.times(0)).process(Mockito.any(ECFMessageClaimNotifyRq_Ext))
    })
  }
}