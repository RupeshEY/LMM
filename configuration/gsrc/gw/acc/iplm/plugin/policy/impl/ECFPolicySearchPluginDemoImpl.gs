package gw.acc.iplm.plugin.policy.impl

uses gw.api.locale.DisplayKey
uses gw.api.testdata.TestDataUtil
uses gw.api.util.CCBundleUtil
uses gw.api.util.DisplayableException
uses gw.api.util.Logger
uses gw.plugin.policy.impl.PolicyNotUniqueException
uses gw.plugin.policy.impl.PolicySearchPluginDemoImpl

/**
 * The demo version of the IPolicySearchAdapter for ECF.
 */
@Export
class ECFPolicySearchPluginDemoImpl extends PolicySearchPluginDemoImpl {

  /**
   * Retrieves the policy from the given policy summary.
   */
  override function retrievePolicyFromPolicySummary(policySummary:PolicySummary) : PolicyRetrievalResultSet {
    var effDate = policySummary.LossDate != null ? policySummary.LossDate : policySummary.EffectiveDate
    var resultSet = getResult( policySummary.PolicyNumber, effDate )
    return resultSet
  }

  /**
   * Retrieves the policy with the given policy number and corresponding to the given
   * Claim loss date.
   */
  private function getResult(policyNumber:String, lossDate:Date) : PolicyRetrievalResultSet {
    var policy : Policy
    var resultSet = new PolicyRetrievalResultSet(TestDataUtil.createBundle())
    if (lossDate == null) {
      throw new DisplayableException(DisplayKey.get("Java.PolicyItemHandler.LossDateRequired"))
    }

    try {
      policy = DataStore.getPolicy(policyNumber, lossDate)
    } catch (e : PolicyNotUniqueException) {
      Logger.logError(e.Message)
      resultSet.NotUnique = true
      return resultSet
    }
    resultSet.NotUnique = false
    if(policy == null) {
      return resultSet
    }
    var copiedPolicy = CCBundleUtil.copyBeanGraphToBundle(policy, resultSet.Bundle) as Policy
    ensureCurrencyIsSetForAllCoverages(copiedPolicy)
    resultSet.Result = copiedPolicy
    return resultSet
  }
}