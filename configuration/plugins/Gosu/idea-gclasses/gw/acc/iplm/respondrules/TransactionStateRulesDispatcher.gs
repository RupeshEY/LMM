package gw.acc.iplm.respondrules

uses gw.acc.iplm.respondrules.common.TransactionAwaitingQueriedRule_AgreementParty
uses gw.acc.iplm.respondrules.common.TransactionAwaitingQueriedRule_Lead
uses gw.acc.iplm.respondrules.common.TransactionCompleteRule
uses gw.acc.iplm.respondrules.common.TransactionDeletedRule
uses gw.acc.iplm.respondrules.common.TransactionEEventRule
uses gw.acc.iplm.respondrules.common.TransactionPendingChangesRule

/**
 * This class is base dispatcher to be implemented by different bureaus.
 */
abstract class TransactionStateRulesDispatcher {

    protected final static var ALL_BUREAU_COMMON_RULES: List<RespondRuleState> = {
      new TransactionAwaitingQueriedRule_Lead(),
      new TransactionAwaitingQueriedRule_AgreementParty(),
      new TransactionCompleteRule(),
      new TransactionDeletedRule(),
      new TransactionEEventRule(),
      new TransactionPendingChangesRule()
  }

  /**
   * This method will Update the TransactionState for the correct dispatcher and bureau.
   *
   * @param message ECFMessageClaimData_Ext
   */
  abstract public function updateTransactionState(message: ECFMessageClaimData_Ext)

  protected function executeRules(rulesList: List<RespondRuleState>, message: ECFMessageClaimData_Ext) {
    for (rule in rulesList) {
      if (rule.updateTansactionState(message)) {
        return
      }
    }
  }
}