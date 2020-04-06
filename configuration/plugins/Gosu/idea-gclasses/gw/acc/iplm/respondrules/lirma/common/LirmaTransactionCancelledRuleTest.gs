package gw.acc.iplm.respondrules.lirma.common

uses gw.acc.iplm.respondrules.lirma.LirmaRespondRuleTester

class LirmaTransactionCancelledRuleTest extends LirmaRespondRuleTester {

  function testUpdateTansactionState_TransactionStatus_45() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_45_CANCELD)
    assertTrue("The transaction state should be updated for Transaction Status 45-CANCELD.", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_TransactionStatus_Not45() {
    var transactionStatus = ECFTransactionStatus_Ext.AllTypeKeys.firstWhere(\ ts -> ts != ECFTransactionStatus_Ext.TC_45_CANCELD)

    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, transactionStatus)
    assertFalse("The transaction state should only be updated for Transaction Status 45-CANCELD.", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_TransactionStatus_45_MarkedAsAgreed() {
    // A cancelled transaction can not be undeleted - A new transaction will be released.
    // So we can mark this as 'agreed' to 'close' the transaction
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_45_CANCELD)
    updateTransactionState(claimNotify)
    claimNotify = claimNotify.refresh() as ECFMessageClaimNotifyRq_Ext
    assertTrue("The transaction state should be closed", claimNotify.ECFTransactionState.Agreed)
  }

  function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LirmaTransactionCancelledRule().updateTansactionState(claimNotify)
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lirmaTestId)
  }
}