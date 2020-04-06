package gw.acc.iplm.dao.impl

uses gw.acc.iplm.dao.PolicyDAO
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.utils.ECFConstants
uses gw.plugin.policy.search.IPolicySearchAdapter
uses org.apache.commons.lang.StringUtils

class PolicyDAOImpl implements PolicyDAO {

  private var LOGGER = ECFConstants.LOGGER_BLOCK()

  private var _policySearchPlugin: IPolicySearchAdapter

  construct() {
    _policySearchPlugin = gw.plugin.Plugins.get("IPolicySearchAdapter") as IPolicySearchAdapter
  }

  override function findPolicy(policyNumber: String): PolicySummary[] {
    if (StringUtils.isBlank(policyNumber)){
      throw new ECFException(ECFErrorCodeType.POLICY_NUMBER_BLANK)
    }
    //get IPolicySearchAdapter plugin to search for policy with policyNumber
    LOGGER.debug("ClaimMovementProcessor#findPolicy - searching for policy number ${policyNumber}")
    //search by policy number
    var searchCriteria = new PolicySearchCriteria()
    searchCriteria.PolicyNumber = policyNumber
    //retrieve policy summaries of policies with policyNumber
    return _policySearchPlugin.searchPolicies(searchCriteria).Summaries
  }

  function retrievePolicyFromPolicySummary(policySummary: entity.PolicySummary): entity.PolicyRetrievalResultSet {
    return _policySearchPlugin.retrievePolicyFromPolicySummary(policySummary)
  }
}