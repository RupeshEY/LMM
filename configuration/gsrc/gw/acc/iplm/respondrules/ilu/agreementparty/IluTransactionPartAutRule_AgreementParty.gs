package gw.acc.iplm.respondrules.ilu.agreementparty

uses gw.acc.iplm.respondrules.RespondRuleState

/**
 * ILU SAP rule for 15 Part Aut messages, where this SAP has not yet agreed to the transaction
 */
class IluTransactionPartAutRule_AgreementParty extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, true)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.PrimaryParticipantAgreementParty
        and ecfMessage.TransactionStatus == TC_15_PART_AUT
        and not ecfMessage.ECFTransactionState.Agreed
  }
}