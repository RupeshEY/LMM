package gw.acc.iplm.respondrules.lloyds.agreementparty

uses gw.acc.iplm.respondrules.lloyds.LloydsRespondRuleTester

class LloydsTransactionPartAutAgreedRule_AgreementPartyTest extends LloydsRespondRuleTester {

  public function testStateUpdatedForAut(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)
    claimNotify = setAgreement(claimNotify, true)

    assertTrue("The transaction state should be updated for an AUT where party is agreed", updateTransactionState(claimNotify))
    var transaction = claimNotify.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertNull("Respond UUID should be null", transaction.UUID)
  }

  public function testStateNotUpdatedOwnAgreementAcknowledgement(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _lloydsTestId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)

    assertFalse("The transaction state should not be updated for an AUT where party is us", updateTransactionState(claimNotify))
  }

  public function testStateNotUpdatedOwnotherTransactionStatus(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)
    claimNotify = setAgreement(claimNotify, true)

    assertFalse("The transaction state should not be updated for other tx status", updateTransactionState(claimNotify))

  }

  public function testStateNotUpdatedWhenNotAgreed(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setSecondAgreementParty(claimNotify, {_lloydsTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)
    claimNotify = setAgreement(claimNotify, false)

    assertFalse("The transaction state should not be updated when not agreed", updateTransactionState(claimNotify))
  }

  private function setAgreement(claimNotify: ECFMessageClaimNotifyRq_Ext, agree : boolean): ECFMessageClaimNotifyRq_Ext{
    claimNotify.ECFTransactionState.Agreed = agree
    return claimNotify
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LloydsTransactionPartAutAgreedRule_AgreementParty().updateTansactionState(claimNotify)
  }

  private function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lloydsTestId)
  }
}