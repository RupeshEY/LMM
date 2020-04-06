package gw.acc.iplm.respondrules.lloyds.common

uses gw.acc.iplm.respondrules.RespondRuleState
uses gw.acc.iplm.utils.ECFUtils

class LloydsAgreementAcknowledgementRule extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false, true)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.ActionParticipant == ECFUtils.stripPrefixesFromID(ecfMessage.ReceiverPartyId)
        and (ecfMessage.TransactionStatus == TC_14_PART_AUT
          or ecfMessage.TransactionStatus == TC_15_PART_AUT)
        and (ecfMessage.ResponseCode == TC_AGREE_PAY
          or ecfMessage.ResponseCode == TC_SEEN_ACTION)
  }
}