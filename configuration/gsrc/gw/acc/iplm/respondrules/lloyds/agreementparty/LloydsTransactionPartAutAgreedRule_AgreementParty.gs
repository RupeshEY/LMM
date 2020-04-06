package gw.acc.iplm.respondrules.lloyds.agreementparty

uses gw.acc.iplm.respondrules.RespondRuleState
uses gw.acc.iplm.utils.ECFUtils

class LloydsTransactionPartAutAgreedRule_AgreementParty extends RespondRuleState<ECFMessageClaimNotifyRq_Ext> {

  override function updateTansactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    if (shouldUpdateTransactionState(ecfMessage)) {
      updateTransactionStateRespondableState(ecfMessage, false)
      return true
    }
    return false
  }

  private function shouldUpdateTransactionState(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return ecfMessage.PrimaryParticipantAgreementParty
        and ecfMessage.TransactionStatus == TC_14_PART_AUT
        and ecfMessage.ActionParticipant != ECFUtils.stripPrefixesFromID(ecfMessage.ReceiverPartyId)
        and ecfMessage.ECFTransactionState.Agreed
  }
}