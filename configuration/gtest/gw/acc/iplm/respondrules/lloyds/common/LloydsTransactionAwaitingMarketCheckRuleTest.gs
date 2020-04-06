package gw.acc.iplm.respondrules.lloyds.common

uses gw.acc.iplm.respondrules.lloyds.LloydsRespondRuleTester

class LloydsTransactionAwaitingMarketCheckRuleTest extends LloydsRespondRuleTester {

  public function testStateUpdatedForMktChk() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_9_MKT_CHK)
    assertTrue("The transaction state should be updated for a awaiting market check", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertNull(transaction.UUID)
  }

  public function testStateNotUpdatedForOtherTransactionStatue() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    assertFalse("The transaction state should not be updated for another tx status", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertNull(transaction.UUID)
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LloydsTransactionAwaitingMarketCheckRule().updateTansactionState(claimNotify)
  }

  private function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lloydsTestId)
  }

}