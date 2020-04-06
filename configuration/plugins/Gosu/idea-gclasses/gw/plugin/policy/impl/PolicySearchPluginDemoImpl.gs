package gw.plugin.policy.impl

uses gw.util.concurrent.LocklessLazyVar
uses gw.plugin.policy.PolicySearchDataStore
uses gw.plugin.policy.base.PolicySearchPluginBase

/**
 * The demo version of the IPolicySearchAdapter.
 */
@Export
class PolicySearchPluginDemoImpl extends PolicySearchPluginBase  {

  var _policyStore = LocklessLazyVar.make(\ -> new PolicySearchDemoDataStore(\ -> new PolicySearchPolicyGenerator().generatePolicies()))
  
  /**
   * Lazily creates and gets the underlying demo policies.
   */
  override protected property get DataStore() : PolicySearchDataStore {
    return _policyStore.get()
  }

}
