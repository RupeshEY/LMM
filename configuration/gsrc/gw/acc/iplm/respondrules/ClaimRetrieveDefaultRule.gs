package gw.acc.iplm.respondrules

/**
 * DE6490 - Allowing user to respond to Claim Retrieve
 * TODO: F2887 - Remove this rule and replace with actual business rules.
 */
class ClaimRetrieveDefaultRule extends RespondRuleState<ECFMessageClaimRetrieveRs_Ext> {

  /**
   * Always set latest Claim Retrieve to the respondable message for its transaction
   *
   * @param ecfMessage ECFMessageClaimRetrieveRs_Ext
   * @return true
   */
  override function updateTansactionState(ecfMessage: ECFMessageClaimRetrieveRs_Ext): boolean {
    updateTransactionStateRespondableState(ecfMessage, true)
    return true
  }

}