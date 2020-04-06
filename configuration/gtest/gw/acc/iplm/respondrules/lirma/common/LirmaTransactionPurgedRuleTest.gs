package gw.acc.iplm.respondrules.lirma.common

uses gw.acc.iplm.respondrules.lirma.LirmaRespondRuleTester

class LirmaTransactionPurgedRuleTest extends LirmaRespondRuleTester {

  public function testStateUpdatedForPurged() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_8_PURGED)
    assertTrue("The transaction state should be updated for purged transaction", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertNull("Respond UUID should be null", transaction.UUID)
  }

  public function testStateNotUpdatedForOtherTransactionStatus() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    assertFalse("The transaction state should not be updated for another transaction status", updateTransactionState(claimNotify))
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LirmaTransactionPurgedRule().updateTansactionState(claimNotify)
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lirmaTestId)
  }
}