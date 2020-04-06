package gw.acc.iplm.respondrules.lloyds.common

uses gw.acc.iplm.respondrules.lloyds.LloydsRespondRuleTester

class LloydsCompleteCoupledClaimRuleTest extends LloydsRespondRuleTester {

  public function testStateUpdatedForAdvBdwn() {
    runRule(ECFTransactionStatus_Ext.TC_31_ADV_BDWN, :expectedTransactionState = true, :expectedAgreed = true)
  }

  public function testStateUpdatedForSetBdwn() {
    runRule(ECFTransactionStatus_Ext.TC_32_SET_BDWN, :expectedTransactionState = true, :expectedAgreed = true)
  }

  public function testStateUpdatedForProcess() {
    runRule(ECFTransactionStatus_Ext.TC_33_PROCESS, :expectedTransactionState = true, :expectedAgreed = true)
  }

  public function testStateUpdatedForReleased() {
    runRule(ECFTransactionStatus_Ext.TC_36_RELEASED, :expectedTransactionState = true, :expectedAgreed = true)
  }

  public function testStateNotUpdatedForOtherTransactionStatue() {
    runRule(ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED, :expectedTransactionState = false, :expectedAgreed = false)
  }

  private function runRule(transactionStatus: ECFTransactionStatus_Ext, expectedTransactionState: Boolean, expectedAgreed: Boolean) {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, transactionStatus)
    assertEquals("The transaction state does not match the expected state", expectedTransactionState, updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertNull(transaction.UUID)
    assertEquals(expectedAgreed, transaction.Agreed)
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LloydsCompleteCoupledClaimRule().updateTansactionState(claimNotify)
  }

  private function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lloydsTestId)
  }

}