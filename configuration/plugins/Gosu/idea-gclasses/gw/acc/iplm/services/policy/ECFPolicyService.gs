package gw.acc.iplm.services.policy

uses gw.acc.iplm.dao.PolicyDAO
uses gw.acc.iplm.dao.impl.PolicyDAOImpl
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses org.apache.commons.lang3.StringUtils

class ECFPolicyService {

  private var _policyDAO : PolicyDAO as PolicyDAO

  construct() {
    this(new PolicyDAOImpl())
  }

  construct(policyDAO: PolicyDAO) {
    _policyDAO = policyDAO
  }

  /**
   * Finds a policy in the policy system, based on the policy number.
   * Includes some business validations for ECF
   *
   * @throws ECFException POLICY_NUMBER_BLANK        - No policy number was given
   * @throws ECFException POLICY_NOT_FOUND_IN_SYSTEM - No policies were found in the system
   * @throws ECFException POLICY_NOT_UNIQUE          - No unique policies found
   * @throws ECFException POLICY_NOT_VALID           - No valid policies found (i.e. No policy that was not canceled/expired was found)
   * @throws ECFException POLICY_MULTIPLE_RESULTS    - Multiple policies found
   * @throws ECFException POLICY_MISSING_TYPE        - Found policy missing policy type
   *
   * @param policyNumber Policy Number
   * @return Policy
   */
  public function findPolicy(policyNumber: String): Policy {
    final var INVALID_POLICY_STATUSES = {PolicyStatus.TC_CANCELED, PolicyStatus.TC_EXPIRED}

    if (StringUtils.isBlank(policyNumber)) {
      throw new ECFException(ECFErrorCodeType.POLICY_NUMBER_BLANK)
    }

    var policySummaries = _policyDAO.findPolicy(policyNumber)
    if (policySummaries.Count == 0) {
      throw new ECFException(ECFErrorCodeType.POLICY_NOT_FOUND_IN_SYSTEM, policyNumber)
    }

    var policyResults = new ArrayList<Policy>()
    for (summary in policySummaries) {
      var policies = _policyDAO.retrievePolicyFromPolicySummary(summary)
      if (policies.NotUnique) {
        throw new ECFException(ECFErrorCodeType.POLICY_NOT_UNIQUE)
      }

      var aPolicy = policies.Result
      if (!INVALID_POLICY_STATUSES.contains(aPolicy.Status)) {
        policyResults.add(aPolicy)
      }
    }

    if (policyResults.isEmpty()) {
      throw new ECFException(ECFErrorCodeType.POLICY_NOT_VALID, policyNumber)
    }
    if (policyResults.Count > 1) {
      throw new ECFException(ECFErrorCodeType.POLICY_MULTIPLE_RESULTS, policyNumber)
    }
    if (policyResults.first().PolicyType == null) {
      throw new ECFException(ECFErrorCodeType.POLICY_MISSING_TYPE, policyNumber)
    }

    return policyResults.first()
  }

}