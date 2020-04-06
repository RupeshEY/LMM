package gw.acc.iplm.respondrules.ilu.common

uses gw.acc.iplm.respondrules.RespondRuleState
uses gw.acc.iplm.utils.ECFUtils

class IluAgreementAcknowledgementRule extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false, true)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.TransactionStatus == TC_15_PART_AUT
        and ecfMessage.ActionParticipant == ECFUtils.stripPrefixesFromID(ecfMessage.ReceiverPartyId)
        and ecfMessage.ResponseCode == ECFResponseCode_Ext.TC_AUT
  }
}