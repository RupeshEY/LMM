package gw.acc.iplm.respondrules.lirma.common

uses gw.acc.iplm.respondrules.lirma.LirmaRespondRuleTester

class LirmaAgreementAcknowledgementRuleTest extends LirmaRespondRuleTester {

  function testUpdateTansactionState_ReceiverAgreement_CAA() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lirmaTestId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CAA)

    assertTrue("The transaction state should be updated for a receiver agreement of CAA", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_ReceiverAgreement_YES() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lirmaTestId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_YES)

    assertTrue("The transaction state should be updated for a receiver agreement of Yes", updateTransactionState(claimNotify))
  }

  function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LirmaAgreementAcknowledgementRule().updateTansactionState(claimNotify)
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lirmaTestId)
  }
}