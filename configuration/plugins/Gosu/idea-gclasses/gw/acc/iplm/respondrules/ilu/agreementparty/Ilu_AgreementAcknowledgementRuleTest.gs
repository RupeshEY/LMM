package gw.acc.iplm.respondrules.ilu.agreementparty

uses gw.acc.iplm.respondrules.ilu.IluRespondRuleTester
uses gw.acc.iplm.respondrules.ilu.common.IluAgreementAcknowledgementRule

class Ilu_AgreementAcknowledgementRuleTest extends IluRespondRuleTester {

  public function testStateUpdatedForAgreementAcknowledgement(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setSecondAgreementParty(claimNotify, _iluTestId)
    claimNotify = setActionParticipant(claimNotify, _iluTestId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AUT)

    assertTrue("The transaction state should be updated for an AUT acknowladgement", updateTransactionState(claimNotify))
  }

  public function testAgreedUpdatedForAgreementAcknowledgement(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setSecondAgreementParty(claimNotify, _iluTestId)
    claimNotify = setActionParticipant(claimNotify, _iluTestId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AUT)

    updateTransactionState(claimNotify)
    var transaction = claimNotify.ECFTransactionState.refresh() as  ECFTransactionState_Ext
    assertTrue(transaction.Agreed)
  }

  public function testStateNotUpdatedForOtherAgreement(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setSecondAgreementParty(claimNotify, {_iluTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AUT)

    assertFalse("The transaction state should not be updated for another party's acknowladgement", updateTransactionState(claimNotify))
  }

  public function testStateNotUpdatedForOtherResponse(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setSecondAgreementParty(claimNotify, _iluTestId)
    claimNotify = setActionParticipant(claimNotify, _iluTestId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_PEN)

    assertFalse("The transaction state should not be updated for PEN", updateTransactionState(claimNotify))
  }

  public function testStateNotUpdatedForOtherTransaction(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setSecondAgreementParty(claimNotify, _iluTestId)
    claimNotify = setActionParticipant(claimNotify, _iluTestId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AUT)

    assertFalse("The transaction state should not be updated for another transaction status", updateTransactionState(claimNotify))
  }

  function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new IluAgreementAcknowledgementRule().updateTansactionState(claimNotify)
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_iluTestId)
  }
}