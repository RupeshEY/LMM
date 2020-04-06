package gw.acc.iplm.respondrules.lloyds.lead

uses gw.acc.iplm.respondrules.lloyds.LloydsRespondRuleTester

class LloydsTransactionPartAutRule_LeadTest extends LloydsRespondRuleTester {

  public function testStateUpdatedForAut(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _lloydsTestId)

    assertTrue("The transaction state should be updated for an AUT from someone else", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertNull(transaction.UUID)
  }

  public function testStateNotUpdatedForAnotherTranbsactionStatus(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _lloydsTestId)

    assertFalse("The transaction state should not be updated for another transaction status", updateTransactionState(claimNotify))
  }

  public function testStateNotUpdatedForSAP(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _otherCarrierId)

    assertFalse("The transaction state should not be updated for SAP", updateTransactionState(claimNotify))
  }

  public function testStateNotUpdatedForOwnAutMessage(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _lloydsTestId)

    assertFalse("The transaction state should not be updated for own aut", updateTransactionState(claimNotify))
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LloydsTransactionPartAutRule_Lead().updateTansactionState(claimNotify)
  }

  private function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lloydsTestId)
  }

}