package gw.acc.iplm.respondrules.lirma.common

uses gw.acc.iplm.respondrules.lirma.LirmaRespondRuleTester

class LirmaTransactionRejectedRuleTest extends LirmaRespondRuleTester {

  function testUpdateTansactionState_TransactionStatus_12() {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_12_REJ)
    assertTrue("The transaction state should be updated for Transaction Status 12-REJ.", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_TransactionStatus_Not12() {
    var transactionStatus = ECFTransactionStatus_Ext.AllTypeKeys.firstWhere(\ ts -> ts != ECFTransactionStatus_Ext.TC_12_REJ)

    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, transactionStatus)
    assertFalse("The transaction state should only be updated for Transaction Status 12-REJ.", updateTransactionState(claimNotify))
  }

  function testUpdateTansactionState_TransactionStatus_12_MarkedAsAgreed() {
    // A rejected transaction can not be undeleted - A new transaction will be released.
    // So we can mark this as 'agreed' to 'close' the transaction
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_12_REJ)
    updateTransactionState(claimNotify)
    claimNotify = claimNotify.refresh() as ECFMessageClaimNotifyRq_Ext
    assertTrue("The transaction state should be closed", claimNotify.ECFTransactionState.Agreed)
  }

  function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new LirmaTransactionRejectedRule().updateTansactionState(claimNotify)
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_lirmaTestId)
  }
}