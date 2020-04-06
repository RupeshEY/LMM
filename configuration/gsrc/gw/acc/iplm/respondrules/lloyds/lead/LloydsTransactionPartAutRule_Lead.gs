package gw.acc.iplm.respondrules.lloyds.lead

uses gw.acc.iplm.respondrules.RespondRuleState
uses gw.acc.iplm.utils.ECFUtils

/**
 * Evaluation Lloyds Lead rule for transaction status 14_PART_AUT
 */
class LloydsTransactionPartAutRule_Lead extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.PrimaryParticipantLead
        and ecfMessage.ActionParticipant != ECFUtils.stripPrefixesFromID(ecfMessage.ReceiverPartyId)
        and ecfMessage.TransactionStatus == TC_14_PART_AUT
  }
}