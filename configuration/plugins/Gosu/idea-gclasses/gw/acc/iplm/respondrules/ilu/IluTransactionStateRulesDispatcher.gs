package gw.acc.iplm.respondrules.ilu

uses gw.acc.iplm.respondrules.RespondRuleState
uses gw.acc.iplm.respondrules.TransactionStateRulesDispatcher
uses gw.acc.iplm.respondrules.ilu.agreementparty.IluTransactionPartAutAgreedRule_AgreementParty
uses gw.acc.iplm.respondrules.ilu.agreementparty.IluTransactionPartAutRule_AgreementParty
uses gw.acc.iplm.respondrules.ilu.common.IluAgreementAcknowledgementRule
uses gw.acc.iplm.respondrules.ilu.common.IluAuthorisedPaymentRule
uses gw.acc.iplm.respondrules.ilu.common.IluPolicyReinstatementRule
uses gw.acc.iplm.respondrules.ilu.common.IluTransactionPurgedRule
uses gw.acc.iplm.respondrules.ilu.lead.IluTransactionPartAutRule_Lead
uses gw.acc.iplm.respondrules.ilu.lead.IluTransactionPendingRule

class IluTransactionStateRulesDispatcher extends TransactionStateRulesDispatcher {

  private var ILU_COMMON_RULES: List<RespondRuleState> = {
      new IluAgreementAcknowledgementRule(),
      new IluPolicyReinstatementRule(),
      new IluTransactionPurgedRule(),
      new IluAuthorisedPaymentRule()
  }

  private var ILU_LEAD_RULES: List<RespondRuleState> = {
      new IluTransactionPartAutRule_Lead(),
      new IluTransactionPendingRule()
  }

  private var ILU_AP_RULES: List<RespondRuleState> = {
      new IluTransactionPartAutRule_AgreementParty(),
      new IluTransactionPartAutAgreedRule_AgreementParty(),
      new IluAgreementAcknowledgementRule()
  }

  private property get LeadRules(): List<RespondRuleState> {
    var leadRules: List<RespondRuleState> = {}
    leadRules.addAll(ALL_BUREAU_COMMON_RULES)
    leadRules.addAll(ILU_COMMON_RULES)
    leadRules.addAll(ILU_LEAD_RULES)
    return leadRules
  }

  private property get AgreementPartyRules(): List<RespondRuleState> {
    var sapRules: List<RespondRuleState> = {}
    sapRules.addAll(ALL_BUREAU_COMMON_RULES)
    sapRules.addAll(ILU_COMMON_RULES)
    sapRules.addAll(ILU_AP_RULES)
    return sapRules
  }

  override public function updateTransactionState(message: ECFMessageClaimData_Ext) {
    if (message.PrimaryParticipantLead) {
      executeRules(LeadRules, message)
    } else if (message.PrimaryParticipantAgreementParty) {
      executeRules(AgreementPartyRules, message)
    }
  }
}