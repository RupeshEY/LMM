package gw.acc.iplm.respondrules.ilu.lead

uses gw.acc.iplm.respondrules.ilu.IluRespondRuleTester

class IluTransactionPendingRuleTest extends IluRespondRuleTester {

  public function testStateUpdatedForPended() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_12_PENDED_REJECTED)
    assertTrue("The transaction state should be updated for 12 Pended Rejected transaction", updateTransactionState(claimNotify))
    assertNull("Respond UUID should be null", claimNotify.ECFTransactionState.UUID)
  }

  public function testStateNotUpdatedForOtherTransactionStatus() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    assertFalse("The transaction state should not be updated for another transaction status", updateTransactionState(claimNotify))
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new IluTransactionPendingRule().updateTansactionState(claimNotify)
  }

  protected override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_iluTestId)
  }
}