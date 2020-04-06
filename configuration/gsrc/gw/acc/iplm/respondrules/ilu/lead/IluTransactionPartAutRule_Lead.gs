package gw.acc.iplm.respondrules.ilu.lead

uses gw.acc.iplm.respondrules.RespondRuleState

class IluTransactionPartAutRule_Lead extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.PrimaryParticipantLead
        and ecfMessage.TransactionStatus == TC_15_PART_AUT
  }
}