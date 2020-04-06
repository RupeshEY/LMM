package gw.acc.iplm.respondrules.common

uses gw.acc.iplm.respondrules.RespondRuleState

class TransactionAwaitingQueriedRule_AgreementParty extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false, false)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.PrimaryParticipantAgreementParty
        and ecfMessage.TransactionStatus == TC_10_AWAITING_QUERIED
        and (ecfMessage.ActionCode == ECFActionCode_Ext.TC_A
          or ecfMessage.ActionCode == ECFActionCode_Ext.TC_U)
  }
}