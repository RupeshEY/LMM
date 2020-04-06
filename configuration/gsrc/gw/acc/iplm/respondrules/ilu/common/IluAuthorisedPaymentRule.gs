package gw.acc.iplm.respondrules.ilu.common

uses gw.acc.iplm.respondrules.RespondRuleState

class IluAuthorisedPaymentRule  extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {
  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false, true)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_30_AUTHORSD
  }
}