package gw.acc.iplm.respondrules.lloyds.common

uses gw.acc.iplm.respondrules.RespondRuleState

class LloydsCompleteCoupledClaimRule extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false, true)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_31_ADV_BDWN or
        ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_32_SET_BDWN or
        ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_33_PROCESS or
        ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_36_RELEASED
  }

}