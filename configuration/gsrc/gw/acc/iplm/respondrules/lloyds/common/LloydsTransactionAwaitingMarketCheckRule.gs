package gw.acc.iplm.respondrules.lloyds.common

uses gw.acc.iplm.respondrules.RespondRuleState

class LloydsTransactionAwaitingMarketCheckRule  extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_9_MKT_CHK
  }
}