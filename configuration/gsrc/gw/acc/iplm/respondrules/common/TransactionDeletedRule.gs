package gw.acc.iplm.respondrules.common

uses gw.acc.iplm.respondrules.RespondRuleState

class TransactionDeletedRule extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false, true)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.ActionCode == ECFActionCode_Ext.TC_D
        or  ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_DELETED
  }
}