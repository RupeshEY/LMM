package gw.acc.iplm.respondrules

class ClaimRetrieveTransactionStateRulesDispatcher extends TransactionStateRulesDispatcher {

  private var CLAIM_RETRIEVE_RULES: List<RespondRuleState> = {
      new ClaimRetrieveDefaultRule()
  }

  public function updateTransactionState(message: ECFMessageClaimData_Ext) {
      executeRules(CLAIM_RETRIEVE_RULES, message)
  }
}