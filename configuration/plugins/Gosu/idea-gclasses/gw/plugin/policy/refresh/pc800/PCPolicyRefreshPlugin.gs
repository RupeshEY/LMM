package gw.plugin.policy.refresh.pc800

uses gw.plugin.policy.refresh.PolicyRefreshPluginBase

/**
 * Implementation of the <code>IPolicyRefreshPlugin</code> for PolicyCenter integration. Uses
 * the gw.plugin.pcintegration.pc800.PolicySearchPCPlugin implementation for determining
 * which entities belong in the policy graph. No modification is needed to
 * the plugin for any customer extension entities since these are automatically
 * detected when they are added to the <code>pcintegration</code> web service.
 */
@Export
class PCPolicyRefreshPlugin extends PolicyRefreshPluginBase {

  /**
   * Creates the plugin with the appropriate
   * configuration.
   */
  construct() {
    super(new PCPolicyRefreshConfiguration())
  }

}