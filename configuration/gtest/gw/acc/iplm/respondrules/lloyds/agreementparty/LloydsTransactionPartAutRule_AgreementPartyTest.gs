package gw.acc.iplm.respondrules.lloyds.agreementparty

uses gw.acc.iplm.respondrules.lloyds.LloydsRespondRuleTester

class LloydsTransactionPartAutRule_AgreementPartyTest extends LloydsRespondRuleTester {

  public function testStateUpdatedForAut(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)

    assertTrue("The transaction state should be updated for an AUT where party is agreed", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertEquals(claimNotify.UUID, transaction.UUID)
  }

  public function testStateNotUpdatedForAnotherTranbsactionStatus(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)

    assertFalse("The transaction state should not be updated for another transaction status", updateTransactionState(claimNotify))
  }

  public function testStateNotUpdatedForLead(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setSecondAgreementParty(claimNotify, {_otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _lloydsTestId)

    assertFalse("The transaction state should not be updated for Lead", updateTransactionState(claimNotify))
  }

  public function testStateUpdatedForOwnAutMessage(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId,_otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)

    assertTrue("The transaction state should not be updated for own aut", updateTransactionState(claimNotify))
  }

  public function testStateNotUpdatedWhenAlreadyAgreed(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId,_otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)
    claimNotify = setAgreement(claimNotify, true)

    assertFalse("The transaction state should not be updated when already agreed", updateTransactionState(claimNotify))
  }

  private function setAgreement(claimNotify: ECFMessageClaimNotifyRq_Ext, agree : boolean): ECFMessageClaimNotifyRq_Ext{
    claimNotify.ECFTransactionState.Agreed = agree
    return claimNotify
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LloydsTransactionPartAutRule_AgreementParty().updateTansactionState(claimNotify)
  }

  private function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lloydsTestId)
  }

}