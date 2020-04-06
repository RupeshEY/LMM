package gw.acc.iplm.respondrules.ilu.common

uses gw.acc.iplm.respondrules.ilu.IluRespondRuleTester

class IluTransactionPurgedRuleTest extends IluRespondRuleTester {

  public function testStateUpdatedForPurged() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_8_PURGED)
    assertTrue("The transaction state should be updated for purged transaction", updateTransactionState(claimNotify))
    assertNull("Respond UUID should be null", claimNotify.ECFTransactionState.UUID)
  }

  public function testStateNotUpdatedForOtherTransactionStatus() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    assertFalse("The transaction state should not be updated for another transaction status", updateTransactionState(claimNotify))
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new IluTransactionPurgedRule().updateTansactionState(claimNotify)
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_iluTestId)
  }

}