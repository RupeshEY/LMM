package gw.acc.iplm.services.message.ecfwriteback

uses com.guidewire.pl.web.controller.UserDisplayableException
uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.dao.impl.PolicyDAOImpl
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.api.locale.DisplayKey
uses gw.testharness.KnownBreak
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class ClaimResponseRqServiceComponentTest extends GUnitTestClass {

  private var _claimDao: ClaimDAO
  private var _policyDao: PolicyDAOImpl
  private var _claimResponseRqService: ClaimResponseRqService

  override function beforeMethod() {
    super.beforeMethod()

    _claimDao = new ClaimDAO()
    _policyDao = new PolicyDAOImpl()
    _claimResponseRqService = new ClaimResponseRqService()
    _claimResponseRqService.PolicyDAO = _policyDao
    _claimResponseRqService.ClaimDAO = _claimDao
  }

  @KnownBreak("Requires CM and SoapUI for full end to end test")
  function testClaimResponseProcessMessageSuccessfully() {
    var claimNotifyRq: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyMessage.UUId = UUID.randomUUID().toString()
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage)
      claimNotifyRq.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE

      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.ReferredUUID = claimNotifyRq.UUID
    }, User.util.UnrestrictedUser)

    assertEquals(claimResponseRq.ReferredUUID, claimResponseRq.ClaimDataResponded.UUID)
    assertEquals(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE, claimNotifyRq.MessageState)
    _claimResponseRqService.changeRespondedClaimDataMessageState(claimResponseRq)
    assertEquals(ECFClaimMessageState_Ext.TC_PENDING, claimNotifyRq.MessageState)
  }

  function testChangeClaimNotifyStateWithFinalResponse() {
    var claimNotifyRq: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyMessage.UUId = UUID.randomUUID().toString()
      claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage)
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE

      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.ReferredUUID = claimNotifyRq.UUID
      claimResponseRq.ResponseCode = ECFResponseCode_Ext.TC_AGREE_PAY
    }, User.util.UnrestrictedUser)

    assertEquals(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE, claimResponseRq.ClaimDataResponded.MessageState)
    _claimResponseRqService.changeRespondedClaimDataMessageState(claimResponseRq)
    assertEquals(ECFClaimMessageState_Ext.TC_PENDING, claimResponseRq.ClaimDataResponded.MessageState)
  }

  function testChangeClaimRetrieveRsStateWithFinalResponse() {
    var claimRetrieveRs: ECFMessageClaimRetrieveRs_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimRetrieveRsMessage = ECFMessageUtil.createNewClaimRetrieveRs()
      claimRetrieveRsMessage.UUId = UUID.randomUUID().toString()
      claimRetrieveRs = ECFMessageEntityUtil.createClaimRetrieveRs(claimRetrieveRsMessage)
      claimRetrieveRs = bundle.add(claimRetrieveRs)
      claimRetrieveRs.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE

      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.ReferredUUID = claimRetrieveRs.UUID
      claimResponseRq.ResponseCode = ECFResponseCode_Ext.TC_AGREE_PAY
    }, User.util.UnrestrictedUser)

    assertEquals(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE, claimResponseRq.ClaimDataResponded.MessageState)
    _claimResponseRqService.changeRespondedClaimDataMessageState(claimResponseRq)
    assertEquals(ECFClaimMessageState_Ext.TC_PENDING, claimResponseRq.ClaimDataResponded.MessageState)
  }

  function testChangeClaimNotifyStateWithoutFinalResponse() {
    var claimNotifyRq: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyMessage.UUId = UUID.randomUUID().toString()
      claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage)
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE

      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.ReferredUUID = claimNotifyRq.UUID
      claimResponseRq.ResponseCode = ECFResponseCode_Ext.TC_DELEGATE
    }, User.util.UnrestrictedUser)

    assertEquals(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE, claimResponseRq.ClaimDataResponded.MessageState)
    _claimResponseRqService.changeRespondedClaimDataMessageState(claimResponseRq)
    assertEquals(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE, claimResponseRq.ClaimDataResponded.MessageState)
  }

  function testChangeClaimRetrieveRsStateWithoutFinalResponse() {
    var claimRetrieveRs: ECFMessageClaimRetrieveRs_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimRetrieveRsMessage = ECFMessageUtil.createNewClaimRetrieveRs()
      claimRetrieveRsMessage.UUId = UUID.randomUUID().toString()
      claimRetrieveRs = ECFMessageEntityUtil.createClaimRetrieveRs(claimRetrieveRsMessage)
      claimRetrieveRs = bundle.add(claimRetrieveRs)
      claimRetrieveRs.MessageState = ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE

      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.ReferredUUID = claimRetrieveRs.UUID
      claimResponseRq.ResponseCode = ECFResponseCode_Ext.TC_DELEGATE
    }, User.util.UnrestrictedUser)

    assertEquals(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE, claimResponseRq.ClaimDataResponded.MessageState)
    _claimResponseRqService.changeRespondedClaimDataMessageState(claimResponseRq)
    assertEquals(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE, claimResponseRq.ClaimDataResponded.MessageState)
  }

  function testProcessRequestWithDownGateway() {
    var claimResponseService = new ClaimResponseRqService()
    var claimResponseRq = ECFMessageUtil.createNewClaimResponseRq()
    var claimResponseECFMessage = ECFMessageEntityUtil.createClaimResponseRq(claimResponseRq)
    try {
      claimResponseService.process(claimResponseECFMessage)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.UnableToConnect")))
    }
  }

  function testProcessRequestWithDownSoapUI() {
    var claimResponseRq = ECFMessageUtil.createNewClaimResponseRq()
    var claimResponseECFMessage = ECFMessageEntityUtil.createClaimResponseRq(claimResponseRq)
    var claimResponseService = Mockito.mock(ClaimResponseRqService)
    Mockito.doThrow(new ECFException(ECFErrorCodeType.CLAIM_RESPONSE_ERROR, new UserDisplayableException(DisplayKey.get("Accelerator.IPLM.Exception.UnexpectedMessage")))).when(claimResponseService).process(Mockito.any(ECFMessageClaimResponseRq_Ext))

    try {
      claimResponseService.process(claimResponseECFMessage)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnexpectedMessage")))
    }
  }
}