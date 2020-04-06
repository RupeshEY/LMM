package gw.acc.iplm.respondrules.ilu.lead

uses gw.acc.iplm.respondrules.RespondRuleState

class IluTransactionPendingRule extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {
  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, true)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_12_PENDED_REJECTED
  }
}