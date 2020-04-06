package gw.acc.iplm.dao

/**
 * Policy DAO use for accessing/updating data related to Policy
 */
interface PolicyDAO {

  /**
   * This method is used for finding policy by policy number
   *
   * @param policyNumber
   * @return PolicySummary[]
   */
  function findPolicy(policyNumber: String): PolicySummary[]

  /**
   * This method is used for retrieve policy from policy summary
   *
   * @param policySummary
   * @return PolicyRetrievalResultSet
   */
  function retrievePolicyFromPolicySummary(policySummary: PolicySummary): PolicyRetrievalResultSet

}