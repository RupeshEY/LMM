package gw.acc.iplm.respondrules.ilu.lead

uses gw.acc.iplm.respondrules.ilu.IluRespondRuleTester

class IluTransactionPartAutRule_LeadTest extends IluRespondRuleTester {

  public function testStateUpdatedForPurged() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    assertTrue("The transaction state should be updated for part aut transaction", updateTransactionState(claimNotify))
    assertNull("Respond UUID should be null", claimNotify.ECFTransactionState.UUID)
  }

  public function testStateNotUpdatedForOtherTransactionStatus() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    assertFalse("The transaction state should not be updated for another transaction status", updateTransactionState(claimNotify))
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new IluTransactionPartAutRule_Lead().updateTansactionState(claimNotify)
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_iluTestId)
  }

}