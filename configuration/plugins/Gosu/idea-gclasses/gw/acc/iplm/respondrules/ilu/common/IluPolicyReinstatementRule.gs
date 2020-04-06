package gw.acc.iplm.respondrules.ilu.common

uses gw.acc.iplm.respondrules.RespondRuleState

class IluPolicyReinstatementRule extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.TransactionStatus == TC_24_RIP_REQD
        or ecfMessage.TransactionStatus == TC_25_RIP_PREV
  }
}