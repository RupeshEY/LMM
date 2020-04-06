package gw.acc.iplm.controller

uses gw.acc.iplm.InterceptorManagerWrapper
uses gw.acc.iplm.services.suspensequeue.ECFSuspenseQueueService
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class ECFSuspenseQueueControllerUnitTest extends GUnitTestClass {

  private var _ecfSuspenseQueueController : ECFSuspenseQueueController

  function testUpdateMessageClaimRequest_MessageProcessed() {
    var _ecfSuspenseQueueService  = Mockito.mock(ECFSuspenseQueueService)
    var _interceptorManager  = Mockito.mock(InterceptorManagerWrapper)
    _ecfSuspenseQueueController = new ECFSuspenseQueueController(_ecfSuspenseQueueService, _interceptorManager)
    var cn1 = Mockito.mock(ECFMessageClaimNotifyRq_Ext)
    var claimNotifys:List<ECFMessageClaimNotifyRq_Ext> = {cn1}
    Mockito.when(_ecfSuspenseQueueService.applyMessageToClaim(Mockito.any(ECFMessageClaimNotifyRq_Ext), Mockito.anyString())).thenReturn(claimNotifys)
    _ecfSuspenseQueueController.processMessageAgainstClaim(cn1, "ucr2")
    Mockito.verify(_ecfSuspenseQueueService, Mockito.times(1)).applyMessageToClaim(Mockito.any(ECFMessageClaimNotifyRq_Ext), Mockito.anyString())
    Mockito.verify(_interceptorManager, Mockito.times(1)).intercept(Mockito.any(entity.LMMessage_Ext))
  }


  function testapplyMessageToPolicy_MessageProcessed() {
    var _ecfSuspenseQueueService  = Mockito.mock(ECFSuspenseQueueService)
    var _interceptorManager  = Mockito.mock(InterceptorManagerWrapper)
    _ecfSuspenseQueueController = new ECFSuspenseQueueController(_ecfSuspenseQueueService, _interceptorManager)
    var cn1 = Mockito.mock(ECFMessageClaimNotifyRq_Ext)
    var claimNotifys:List<ECFMessageClaimNotifyRq_Ext> = {cn1}
    Mockito.when(_ecfSuspenseQueueService.applyMessageToPolicy(Mockito.any(ECFMessageClaimNotifyRq_Ext), Mockito.anyString())).thenReturn(claimNotifys)
    _ecfSuspenseQueueController.processMessageAgainstPolicy(cn1, "23-502012")
    Mockito.verify(_ecfSuspenseQueueService, Mockito.times(1)).applyMessageToPolicy(Mockito.any(ECFMessageClaimNotifyRq_Ext), Mockito.anyString())
    Mockito.verify(_interceptorManager, Mockito.times(1)).intercept(Mockito.any(entity.LMMessage_Ext))
  }

  function testResubmitMessage() {
    var _ecfSuspenseQueueService = Mockito.mock(ECFSuspenseQueueService)
    var _interceptorManager = Mockito.mock(InterceptorManagerWrapper)
    _ecfSuspenseQueueController = new ECFSuspenseQueueController(_ecfSuspenseQueueService, _interceptorManager)
    var retrieve = ECFMessageEntityUtil.createClaimRetrieveRs()
    _ecfSuspenseQueueController.resubmitECFMessages({retrieve})
    Mockito.verify(_ecfSuspenseQueueService, Mockito.times(1)).unsuspendMessageEntity(retrieve)
  }

  function testGetSuspendedMessagesCountForUser() {
    var user = User.util.UnrestrictedUser
    var service = Mockito.mock(ECFSuspenseQueueService)
    Mockito.doReturn(0).when(service).getSuspendedMessagesCountForUser(Mockito.any(User))

    _ecfSuspenseQueueController = new ECFSuspenseQueueController(service, null)
    var count = _ecfSuspenseQueueController.getNumberSuspendedMessagesForUser(user)

    Mockito.verify(service, Mockito.times(1)).getSuspendedMessagesCountForUser(user)
  }
}