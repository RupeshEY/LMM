package gw.plugin.policy.refresh

uses gw.api.policy.refresh.PolicyExtractor
uses java.util.Set

/**
 * Base configuration class for customer who do not use PolicyCenter. Such customers will need to override
 * the getPolicyOnly method to specify the entities that are part of the policy graph. 
 */
@Export
abstract class ExtendablePolicyRefreshConfiguration extends PolicyRefreshConfigurationBase implements PolicyRefreshConfigurationBeanRelationships {

  delegate _delegate represents PolicyRefreshConfigurationBeanRelationships

  construct() {
    _delegate = new PolicyRefreshConfigurationDelegate()
  }

  override function getPolicyExtractor(policy : Policy) : PolicyExtractor {
    return new PolicyExtractor(getPolicyOnly(policy))
  }

  /**
   * Examines the existing Policy with associated Claim to identify all
   * entities that are part of the "policy graph", i.e., all entities that would normally
   * be retrieved from the policy search adapter. This helps to identify all
   * entities that should be compared to the new Policy.
   */
  abstract function getPolicyOnly(existingPolicy:Policy) : Set<KeyableBean>
}
