package gw.acc.iplm.respondrules.lirma.lead

uses gw.acc.iplm.respondrules.lirma.LirmaRespondRuleTester

class LirmaCirculationAcknowledgementRule_LeadTest extends LirmaRespondRuleTester {

  public function testStateUpdatedForCitculated() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CIR)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lirmaTestId)

    assertTrue("The transaction state should be updated for circulated transaction", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertEquals(claimNotify.UUID, transaction.UUID)
  }

  public function testStateNotUpdatedForOtherTransactionStatus() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CIR)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lirmaTestId)
    assertFalse("The transaction state should not be updated for another transaction status", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertNull("Respond UUID should be null", transaction.UUID)
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LirmaCirculationAcknowledgementRule_Lead().updateTansactionState(claimNotify)
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lirmaTestId)
  }

}