package gw.acc.iplm.respondrules.lloyds

uses gw.acc.iplm.respondrules.RespondRuleState
uses gw.acc.iplm.respondrules.TransactionStateRulesDispatcher
uses gw.acc.iplm.respondrules.lloyds.agreementparty.LloydsTransactionPartAutAgreedRule_AgreementParty
uses gw.acc.iplm.respondrules.lloyds.agreementparty.LloydsTransactionPartAutRule_AgreementParty
uses gw.acc.iplm.respondrules.lloyds.common.LloydsAgreementAcknowledgementRule
uses gw.acc.iplm.respondrules.lloyds.common.LloydsCompleteCoupledClaimRule
uses gw.acc.iplm.respondrules.lloyds.common.LloydsTransactionAllAutRule
uses gw.acc.iplm.respondrules.lloyds.common.LloydsTransactionAwaitingMarketCheckRule
uses gw.acc.iplm.respondrules.lloyds.lead.LloydsTransactionPartAutRule_Lead

/**
 * Lloyds dispatcher class
 */

class LloydsTransactionStateRulesDispatcher extends TransactionStateRulesDispatcher {

  private var LLOYDS_COMMON_RULES: List<RespondRuleState> = {
      new LloydsAgreementAcknowledgementRule(),
      new LloydsTransactionAllAutRule(),
      new LloydsTransactionAwaitingMarketCheckRule(),
      new LloydsCompleteCoupledClaimRule()
  }

  private var LLOYDS_LEAD_RULES: List<RespondRuleState> = {
      new LloydsTransactionPartAutRule_Lead()
  }

  private var LLOYDS_AP_RULES: List<RespondRuleState> = {
      new LloydsTransactionPartAutRule_AgreementParty(),
      new LloydsTransactionPartAutAgreedRule_AgreementParty()
  }

  private property get LeadRules(): List<RespondRuleState> {
    var leadRules: List<RespondRuleState> = {}
    leadRules.addAll(ALL_BUREAU_COMMON_RULES)
    leadRules.addAll(LLOYDS_COMMON_RULES)
    leadRules.addAll(LLOYDS_LEAD_RULES)
    return leadRules
  }

  private property get AgreementPartyRules(): List<RespondRuleState> {
    var sapRules: List<RespondRuleState> = {}
    sapRules.addAll(ALL_BUREAU_COMMON_RULES)
    sapRules.addAll(LLOYDS_COMMON_RULES)
    sapRules.addAll(LLOYDS_AP_RULES)
    return sapRules
  }

  public function updateTransactionState(message: ECFMessageClaimData_Ext) {
    if (message.PrimaryParticipantLead) {
      executeRules(LeadRules, message)
    } else if (message.PrimaryParticipantAgreementParty) {
      executeRules(AgreementPartyRules, message)
    }
  }
}
