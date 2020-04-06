package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata

uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFSuspenseQueueTestUtil
uses gw.testharness.v3.GUnitTestClass


class ECFMessageInSuspenseQueueRuleTest extends GUnitTestClass {

  private static final var UCR1 = "UCR1"
  private static final var UMR1 = "UMR1"
  private static final var TR1 = "TR1"
  private var _rule: ECFMessageInSuspenseQueueRule
  private var _cn: ECFMessageClaimNotifyRq_Ext
  private var _cr: ECFMessageClaimRetrieveRs_Ext

  override function beforeMethod() {
    super.beforeMethod()
    _rule = new ECFMessageInSuspenseQueueRule()
  }

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    removeMessage(_cn)
    removeMessage(_cr)
  }

  public function testMessageWithAlreadySuspendedTransaction() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _cn = bundle.add(createClaimNotify(true))
      bundle.commit()
      assertCausesException(\-> {
        _rule.validate(_cn)
      }, ECFException)
    }, "su")
  }

  public function testMessageWithNoSuspendedTransaction() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _cn = bundle.add(createClaimNotify(false))
      bundle.commit()
      try {
        _rule.validate(_cn)
      } catch (e: ECFException) {
        fail("ECF Message in suspense queue validation failed. A suspended message with same transaction was found.")
      }
    }, "su")
  }

  public function testMessageWithAlreadySuspendedTransaction_ClaimRetrieve() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _cr = bundle.add(createClaimRetrieve(true))
      bundle.commit()
      assertCausesException(\-> {
        _rule.validate(_cr)
      }, ECFException)
    }, "su")
  }

  public function testMessageWithNoSuspendedTransaction_ClaimRetrieve() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _cr = bundle.add(createClaimRetrieve(false))
      bundle.commit()
      try {
        _rule.validate(_cr)
      } catch (e: ECFException) {
        fail("ECF Message in suspense queue validation failed. A suspended message with same transaction was found.")
      }
    }, "su")
  }

  private function createClaimNotify(suspended: boolean): ECFMessageClaimNotifyRq_Ext {
    return ECFSuspenseQueueTestUtil.validMessage(UMR1, UCR1, TR1, suspended)
  }

  private function createClaimRetrieve(suspended: boolean): ECFMessageClaimRetrieveRs_Ext {
    var cr = ECFMessageEntityUtil.createClaimRetrieveRs()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cr = bundle.add(cr)
      cr.UCR = UCR1
      cr.UMR = UCR1
      cr.TR = UCR1
      cr.Suspended = suspended
    }, User.util.UnrestrictedUser)
    return cr
  }

  private function removeMessage(message: ECFMessageClaimData_Ext) {
    if(message == null){
      return
    }
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      message = bundle.add(message)
      message.remove()
    }, "su")
  }
}