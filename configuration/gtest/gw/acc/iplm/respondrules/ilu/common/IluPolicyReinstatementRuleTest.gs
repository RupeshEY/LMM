package gw.acc.iplm.respondrules.ilu.common

uses gw.acc.iplm.respondrules.ilu.IluRespondRuleTester

class IluPolicyReinstatementRuleTest extends IluRespondRuleTester {

  public function testStateUpdatedForReinstatement_24() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_24_RIP_REQD)
    assertTrue("The transaction state should be updated for a policy reinstatement", updateTransactionState(claimNotify))
    assertNull("Respond UUID should be null", claimNotify.ECFTransactionState.UUID)
  }

  public function testStateUpdatedForReinstatement_25() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_25_RIP_PREV)
    assertTrue("The transaction state should be updated for a previous policy reinstatement", updateTransactionState(claimNotify))
    assertNull("Respond UUID should be null", claimNotify.ECFTransactionState.UUID)
  }

  public function testStateNotUpdatedForOtherTransactionStatus() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    assertFalse("The transaction state should not be updated for another transaction statust", updateTransactionState(claimNotify))
  }

  public function testStateUpdatedForReinstatementWhenAgreed_25() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_24_RIP_REQD)
    claimNotify = setAgreement(claimNotify, true)
    assertTrue("The transaction state should be updated for a policy reinstatement even when agreed", updateTransactionState(claimNotify))
  }

  private function setAgreement(claimNotify: ECFMessageClaimNotifyRq_Ext, agree: boolean): ECFMessageClaimNotifyRq_Ext {
    claimNotify.ECFTransactionState.Agreed = true
    return claimNotify
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new IluPolicyReinstatementRule().updateTansactionState(claimNotify)
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_iluTestId)
  }
}