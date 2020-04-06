package gw.acc.iplm.respondrules.common

uses gw.acc.iplm.respondrules.RespondRuleState

class TransactionAwaitingQueriedRule_Lead extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, true, false)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.PrimaryParticipantLead
        and ecfMessage.TransactionStatus == TC_10_AWAITING_QUERIED
        and (ecfMessage.ActionCode == TC_A
          or ecfMessage.ActionCode == TC_U
          or ecfMessage.ActionCode == TC_R)
  }
}