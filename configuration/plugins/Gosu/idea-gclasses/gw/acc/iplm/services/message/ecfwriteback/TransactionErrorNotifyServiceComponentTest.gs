package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.testharness.v3.GUnitTestClass

class TransactionErrorNotifyServiceComponentTest extends GUnitTestClass {

  private var _service: TransactionErrorNotifyService

  override function beforeMethod() {
    super.beforeMethod()
    _service = new TransactionErrorNotifyService()
  }

  function testTransactionError_StateUpdated() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)

    var txErrorNotifyXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    var txErrorNotify = ECFMessageEntityUtil.createClaimNotifyRq(txErrorNotifyXml)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      txErrorNotify = bundle.add(txErrorNotify)
      txErrorNotify.Claim = claim
      txErrorNotify.UCR = claim.LMMessages.first().UCR
      txErrorNotify.UMR = claim.LMMessages.first().UMR
      txErrorNotify.TR = (claim.LMMessages.first() as ECFMessage_Ext).TR
      txErrorNotify.ReceiverPartyId = claim.LMMessages.first().ReceiverPartyId
    }, User.util.UnrestrictedUser)

    _service.process(txErrorNotify.refresh() as ECFMessageClaimNotifyRq_Ext)

    var result = refreshEntity(txErrorNotify.UUID)
    assertNotNull(result.ECFTransactionState)
    assertNull(result.ECFTransactionState.UUID)
  }

  function testTransactionError_ActivityCreated() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)

    var txErrorNotifyXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    var txErrorNotify = ECFMessageEntityUtil.createClaimNotifyRq(txErrorNotifyXml)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      txErrorNotify = bundle.add(txErrorNotify)
      txErrorNotify.Claim = claim
      txErrorNotify.UCR = claim.LMMessages.first().UCR
      txErrorNotify.UMR = claim.LMMessages.first().UMR
      txErrorNotify.TR = (claim.LMMessages.first() as ECFMessage_Ext).TR
      txErrorNotify.ReceiverPartyId = claim.LMMessages.first().ReceiverPartyId
    }, User.util.UnrestrictedUser)

    _service.process(txErrorNotify.refresh() as ECFMessageClaimNotifyRq_Ext)

    var result = refreshEntity(txErrorNotify.UUID)
    assertNotNull(result.Claim.Activities)
    assertTrue(result.Claim.Activities.HasElements)
    assertTrue(result.Claim.Activities.hasMatch(\activity -> activity.Description == txErrorNotify.ErrorsOrWarnings.first().Description))
  }

  function testTransactionError_TimestampUpdated() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)

    var txErrorNotifyXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    var txErrorNotify = ECFMessageEntityUtil.createClaimNotifyRq(txErrorNotifyXml)
    var initialUpdateTime = Date.Now

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      txErrorNotify = bundle.add(txErrorNotify)
      txErrorNotify.Claim = claim
      txErrorNotify.UCR = claim.LMMessages.first().UCR
      txErrorNotify.UMR = claim.LMMessages.first().UMR
      txErrorNotify.TR = (claim.LMMessages.first() as ECFMessage_Ext).TR
      txErrorNotify.ReceiverPartyId = claim.LMMessages.first().ReceiverPartyId
    }, User.util.UnrestrictedUser)

    _service.process(txErrorNotify.refresh() as ECFMessageClaimNotifyRq_Ext)

    var result = refreshEntity(txErrorNotify.UUID)
    assertTrue(initialUpdateTime.before(result.Claim.ECFLastUpdateTime))
  }

  function testTransactionError_ECFLockUpdated_Status3() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)

    var txErrorNotifyXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    var txErrorNotify = ECFMessageEntityUtil.createClaimNotifyRq(txErrorNotifyXml)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      txErrorNotify = bundle.add(txErrorNotify)
      txErrorNotify.Claim = bundle.add(claim)
      txErrorNotify.UCR = claim.LMMessages.first().UCR
      txErrorNotify.UMR = claim.LMMessages.first().UMR
      txErrorNotify.TR = (claim.LMMessages.first() as ECFMessage_Ext).TR
      txErrorNotify.ReceiverPartyId = claim.LMMessages.first().ReceiverPartyId
      txErrorNotify.TransactionStatus = ECFTransactionStatus_Ext.TC_3
    }, User.util.UnrestrictedUser)

    _service.process(txErrorNotify.refresh() as ECFMessageClaimNotifyRq_Ext)

    var result = refreshEntity(txErrorNotify.UUID)
    assertTrue(result.Claim.ECFLocked)
  }

  function testTransactionError_ECFLockUpdated_Status4() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)

    var txErrorNotifyXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    var txErrorNotify = ECFMessageEntityUtil.createClaimNotifyRq(txErrorNotifyXml)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      txErrorNotify = bundle.add(txErrorNotify)
      txErrorNotify.Claim = claim
      txErrorNotify.UCR = claim.LMMessages.first().UCR
      txErrorNotify.UMR = claim.LMMessages.first().UMR
      txErrorNotify.TR = (claim.LMMessages.first() as ECFMessage_Ext).TR
      txErrorNotify.ReceiverPartyId = claim.LMMessages.first().ReceiverPartyId
      txErrorNotify.TransactionStatus = ECFTransactionStatus_Ext.TC_4
    }, User.util.UnrestrictedUser)

    _service.process(txErrorNotify.refresh() as ECFMessageClaimNotifyRq_Ext)

    var result = refreshEntity(txErrorNotify.UUID)
    assertTrue(result.Claim.ECFLocked)
  }

  function testTransactionError_NotECFLockUpdated_DELETE() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var claim = ClaimBuilderHelper.createClaimWithAClaimNotifyMessage(ucr)

    var txErrorNotifyXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    var txErrorNotify = ECFMessageEntityUtil.createClaimNotifyRq(txErrorNotifyXml)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      txErrorNotify = bundle.add(txErrorNotify)
      txErrorNotify.Claim = claim
      txErrorNotify.UCR = claim.LMMessages.first().UCR
      txErrorNotify.UMR = claim.LMMessages.first().UMR
      txErrorNotify.TR = (claim.LMMessages.first() as ECFMessage_Ext).TR
      txErrorNotify.ReceiverPartyId = claim.LMMessages.first().ReceiverPartyId
      txErrorNotify.TransactionStatus = ECFTransactionStatus_Ext.TC_DELETED
    }, User.util.UnrestrictedUser)

    _service.process(txErrorNotify.refresh() as ECFMessageClaimNotifyRq_Ext)

    var result = refreshEntity(txErrorNotify.UUID)
    assertFalse(result.Claim.ECFLocked)
  }

  private function refreshEntity(uuid: String): ECFMessageClaimNotifyRq_Ext {
    return gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, uuid).select().AtMostOneRow as ECFMessageClaimNotifyRq_Ext
  }

}