package gw.plugin.policy.refresh.basic
uses gw.lang.Export
uses gw.plugin.policy.refresh.PolicyRefreshPluginBase
uses gw.plugin.policy.refresh.basic.BasicPolicyRefreshConfiguration

/**
 * This implementation of <code>IPolicyRefreshPlugin</code> provides an example of
 * how to integrate third-party Policy Administration Systems (i.e., not PolicyCenter)
 * with the Policy Refresh functionality. This implementation of the plugin uses
 * the <code>BasicPolicyRefreshConfiguration</code> which extracts the set of Policy-only
 * entities from an existing Claim/Policy manually by walking foreign key/array references.
 * 
 * Note that the definition of Policy-only entities should be all entities which are created
 * in ClaimCenter through the IPolicySearchAdapter, and hence all the entities which would get
 * replaced when the Policy is refreshed from the Policy Administration System.
 */
@Export
class BasicPolicyRefreshPlugin extends PolicyRefreshPluginBase {
  /**
   * Creates the plugin with the appropriate configuration.
   */
  construct() {
    super(new BasicPolicyRefreshConfiguration())
  }
}
