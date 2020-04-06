package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.controller.IMRMessageController
uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.dao.impl.PolicyDAOImpl
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.services.claim.ecfwb.ECFClaimService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Matchers
uses org.mockito.Mock
uses org.mockito.Mockito
uses org.mockito.MockitoAnnotations

class ClaimNotifyServiceUnitTest extends GUnitTestClass {

  @Mock
  private var _claimDao: ClaimDAO

  @Mock
  private var _policyDao: PolicyDAOImpl

  @Mock
  private var _imrMessageController: IMRMessageController

  @Mock
  private var _claimNotifyMapper: ECFClaimService

  private var _claimNotifyService: ClaimNotifyService
  private var _claimNotifyMsg = getClaimNotifyEventRqMsg()

  override function beforeMethod() {
    super.beforeMethod()
    MockitoAnnotations.initMocks(this)
    _claimNotifyService = new ClaimNotifyService()
    _claimNotifyService.PolicyDAO = _policyDao
    _claimNotifyService.ClaimDAO = _claimDao
    _claimNotifyService.ECFClaimService = _claimNotifyMapper
    _claimNotifyService.IMRMessageController = _imrMessageController
    _claimNotifyService = Mockito.spy(_claimNotifyService)
    _claimNotifyMsg.UCR = "12345"
    _claimNotifyMsg.ClaimMovement.Extension.Claim.LossPeriod.StartDate = "2013-12"
    _claimNotifyMsg.ClaimMovement.Extension.Claim.LossPeriod.EndDate = "2015"
  }

  //ECF Exception throw during processing of message
  public function testUpdateClaimFailure() {
    _claimNotifyMsg.ClaimMovement.Claim.LossLocation.Location.Description = "London"

    var claimMock = Mockito.mock(Claim)
    claimMock.setPublicID("ECF123456")

    Mockito.when(_claimDao.findClaim(Matchers.anyString())).thenReturn(claimMock)
    Mockito.when(_claimDao.saveClaim(claimMock)).thenReturn(claimMock)

    var ecfMessage = createNewClaimNotifyRqMessage(_claimNotifyMsg)

    assertCausesException(\-> {
      _claimNotifyService.process(ecfMessage)
    }, ECFException)
  }

  //NO ECF Exception should occured durring processing message
  function testUpdateClaim() {
    try {
      var claimMock = Mockito.mock(Claim)
      claimMock.setPublicID("ECF123456")
      Mockito.when(_claimDao.findClaim(Matchers.anyString())).thenReturn(claimMock)
      Mockito.when(_claimDao.saveClaim(claimMock)).thenReturn(claimMock)
      Mockito.when(_claimNotifyMapper.updateClaimData(null, claimMock)).thenReturn(claimMock)

      _claimNotifyService.updateClaim(claimMock, null)
    } catch (ex: ECFException) {
      //Exception should not occured
      ex.printStackTrace()
      fail("This line should not execute")
    }
  }

  private function createNewClaimNotifyRqMessage(claimNotifyXml: ClaimNotifyEventRq): ECFMessageClaimNotifyRq_Ext {

    var claimNotifyMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyXml)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyMessage = bundle.add(claimNotifyMessage)
      claimNotifyMessage.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICEANDSETTLEMENT
      claimNotifyMessage.TransactionSequence = "002"
      claimNotifyMessage.TransactionStatus = ECFTransactionStatus_Ext.TC_36_RELEASED
      claimNotifyMessage.AmendmentDetails = "On Account settlement"
    }, "su")

    return claimNotifyMessage
  }

  function getClaimNotifyEventRqMsg(): ClaimNotifyEventRq {
    var claimNotifyMsg = ECFMessageUtil.createNewClaimNotifyRq()

    claimNotifyMsg.UCR = ClaimBuilderHelper.getNextUCR()
    claimNotifyMsg.ClaimMovement.Contract.InsurerRiskReference = "54-123456"

    return claimNotifyMsg
  }

}