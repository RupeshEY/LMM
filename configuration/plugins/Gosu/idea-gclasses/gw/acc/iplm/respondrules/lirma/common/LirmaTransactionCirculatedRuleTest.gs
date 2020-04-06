package gw.acc.iplm.respondrules.lirma.common

uses gw.acc.iplm.respondrules.lirma.LirmaRespondRuleTester

class LirmaTransactionCirculatedRuleTest extends LirmaRespondRuleTester {

  function testUpdateTansactionState_NotActionParticipant() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)

    assertTrue("The transaction state should be updated when the receiver is not the action participant", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_ActionCode_R() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)

    assertTrue("The transaction state should be updated when Action Code is R", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_ActionCode_U() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_U)

    assertFalse("The transaction state should not be updated when Action Code is U", updateTransactionState(claimNotify))
  }


  function testUpdateTansactionState_TransactionStatus_10() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)

    assertFalse("The transaction state should not be updated when Transaction Status is 10-AWAITING/QUERIED", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_ReceiverAlreadyAgreed() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = createTransactionStateOnClaimNotify(claimNotify, true)

    assertFalse("The transaction state should not be updated when the receiver has already agreed.", updateTransactionState(claimNotify))
  }

  function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LirmaTransactionCirculatedRule().updateTansactionState(claimNotify)
  }

  private function createTransactionStateOnClaimNotify(claimNotify : ECFMessageClaimNotifyRq_Ext, agreedState : boolean) : ECFMessageClaimNotifyRq_Ext{
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      claimNotify = bundle.add(claimNotify)
      var transactionState = new ECFTransactionState_Ext(bundle)

      transactionState.ReceiverId = claimNotify.ReceiverPartyId
      transactionState.UCR = claimNotify.UCR
      transactionState.TR = claimNotify.TR
      transactionState.UUID = claimNotify.UUID
      transactionState.Agreed = agreedState
      transactionState.TransactionSequence = 1

      transactionState.addToECFMessages(claimNotify)
    }, User.util.UnrestrictedUser)
    return claimNotify
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lirmaTestId)
  }
}