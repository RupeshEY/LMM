package gw.acc.iplm.respondrules.lirma.common

uses gw.acc.iplm.respondrules.RespondRuleState

class LirmaTransactionCancelledRule extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false, true)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_45_CANCELD
  }
}