package gw.acc.iplm.respondrules.lirma

uses gw.acc.iplm.respondrules.RespondRuleState
uses gw.acc.iplm.respondrules.TransactionStateRulesDispatcher
uses gw.acc.iplm.respondrules.lirma.common.LirmaAgreementAcknowledgementRule
uses gw.acc.iplm.respondrules.lirma.common.LirmaTransactionCancelledRule
uses gw.acc.iplm.respondrules.lirma.common.LirmaTransactionCirculatedRule
uses gw.acc.iplm.respondrules.lirma.common.LirmaTransactionPurgedRule
uses gw.acc.iplm.respondrules.lirma.common.LirmaTransactionRejectedRule
uses gw.acc.iplm.respondrules.lirma.lead.LirmaCirculationAcknowledgementRule_Lead

/**
 * Lirma dispatcher class
 */

class LirmaTransactionStateRulesDispatcher extends TransactionStateRulesDispatcher {

  private var LIRMA_COMMON_RULES : List<RespondRuleState> = {
      new LirmaTransactionCancelledRule(),
      new LirmaAgreementAcknowledgementRule(),
      new LirmaTransactionCirculatedRule(),
      new LirmaTransactionRejectedRule(),
      new LirmaTransactionPurgedRule()
  }

  private var LIRMA_LEAD_RULES : List<RespondRuleState> = {
      new LirmaCirculationAcknowledgementRule_Lead()
  }

  private var LIRMA_AP_RULES : List<RespondRuleState> = {
  }

  private property get LeadRules() : List<RespondRuleState>{
    var leadRules : List<RespondRuleState> = {}
    leadRules.addAll(ALL_BUREAU_COMMON_RULES)
    leadRules.addAll(LIRMA_COMMON_RULES)
    leadRules.addAll(LIRMA_LEAD_RULES)
    return leadRules
  }

  private property get AgreementPartyRules() : List<RespondRuleState>{
    var sapRules : List<RespondRuleState> = {}
    sapRules.addAll(ALL_BUREAU_COMMON_RULES)
    sapRules.addAll(LIRMA_COMMON_RULES)
    sapRules.addAll(LIRMA_AP_RULES)
    return sapRules
  }

  public function updateTransactionState(message: ECFMessageClaimData_Ext) {
    if (message.PrimaryParticipantLead) {
      executeRules(this.LeadRules, message)
    } else if (message.PrimaryParticipantAgreementParty) {
      executeRules(this.AgreementPartyRules, message)
    }
  }
}
