package gw.acc.iplm.respondrules.lirma.lead

uses gw.acc.iplm.respondrules.RespondRuleState
uses gw.acc.iplm.utils.ECFUtils

class LirmaCirculationAcknowledgementRule_Lead extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, true)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.PrimaryParticipantLead
        and ecfMessage.TransactionStatus == ECFTransactionStatus_Ext.TC_20_CIRCULATED
        and ecfMessage.ActionCode == ECFActionCode_Ext.TC_R
        and ecfMessage.ActionParticipant == ECFUtils.stripPrefixesFromID(ecfMessage.ReceiverPartyId)
        and ecfMessage.ResponseCode == ECFResponseCode_Ext.TC_CIR
  }
}