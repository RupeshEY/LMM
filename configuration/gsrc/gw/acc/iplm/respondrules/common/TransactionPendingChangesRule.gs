package gw.acc.iplm.respondrules.common

uses gw.acc.iplm.respondrules.RespondRuleState

class TransactionPendingChangesRule extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_3
        or ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_4
  }
}