package gw.acc.iplm.respondrules.lirma.common

uses gw.acc.iplm.respondrules.RespondRuleState
uses gw.acc.iplm.utils.ECFUtils

class LirmaAgreementAcknowledgementRule extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false, true)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_20_CIRCULATED
      and ecfMessage.ActionCode == ECFActionCode_Ext.TC_R
      and ecfMessage.ActionParticipant == ECFUtils.stripPrefixesFromID(ecfMessage.ReceiverPartyId)
      and (ecfMessage.ResponseCode == ECFResponseCode_Ext.TC_CAA
        or ecfMessage.ResponseCode == ECFResponseCode_Ext.TC_YES)
  }
}