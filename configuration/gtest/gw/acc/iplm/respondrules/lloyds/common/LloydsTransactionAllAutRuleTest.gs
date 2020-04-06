package gw.acc.iplm.respondrules.lloyds.common

uses gw.acc.iplm.respondrules.lloyds.LloydsRespondRuleTester

class LloydsTransactionAllAutRuleTest extends LloydsRespondRuleTester {

  public function testStateUpdatedForPartAut() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    assertTrue("The transaction state should be updated for a 15 part aut", updateTransactionState(claimNotify))
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

  public function testStateAgreedAfter15PartAut() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    updateTransactionState(claimNotify)
    assertTrue("The transaction should be final", claimNotify.ECFTransactionState.Agreed)
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LloydsTransactionAllAutRule().updateTansactionState(claimNotify)
  }

  private function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lloydsTestId)
  }

}