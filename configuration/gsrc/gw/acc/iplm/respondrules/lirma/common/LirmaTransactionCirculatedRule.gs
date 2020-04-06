package gw.acc.iplm.respondrules.lirma.common

uses gw.acc.iplm.respondrules.RespondRuleState

class LirmaTransactionCirculatedRule extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, true)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_20_CIRCULATED
        and ecfMessage.ActionCode == ECFActionCode_Ext.TC_R
        and not ecfMessage.ECFTransactionState?.Agreed
  }
}