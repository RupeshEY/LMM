package gw.acc.iplm.respondrules.ilu.common

uses gw.acc.iplm.respondrules.ilu.IluRespondRuleTester

class IluAuthorisedPaymentRuleTest extends IluRespondRuleTester {

  public function testStateUpdatedForReinstatement_24() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_30_AUTHORSD)
    assertTrue("The transaction state should be updated", updateTransactionState(claimNotify))
    assertNull("Respond UUID should be null", claimNotify.ECFTransactionState.UUID)
    assertTrue("The transaction should be final", claimNotify.ECFTransactionState.Agreed)
  }

  public function testStateNotUpdatedForOtherTransactionStatus() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    assertFalse("The transaction state should not be updated for another transaction statust", updateTransactionState(claimNotify))
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new IluAuthorisedPaymentRule().updateTansactionState(claimNotify)
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_iluTestId)
  }

}