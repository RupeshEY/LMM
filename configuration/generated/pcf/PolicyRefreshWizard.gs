package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyRefreshWizard extends com.guidewire.pl.web.codegen.WizardBase {
  private static function config () : com.guidewire.pl.web.navigation.wizard.WizardConfig {
    return __configOf(pcf.PolicyRefreshWizard, WIZARD_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim, policyFetcher :  gw.api.policy.refresh.RefreshPolicyFetcher) : pcf.api.Destination {
    return __newDestination(config(), {claim, policyFetcher}, 0)
  }
  
  static function drilldown (claim :  Claim, policyFetcher :  gw.api.policy.refresh.RefreshPolicyFetcher) : pcf.api.Location {
    return __newDestination(config(), {claim, policyFetcher}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, policyFetcher :  gw.api.policy.refresh.RefreshPolicyFetcher) : pcf.api.Location {
    return __newDestination(config(), {claim, policyFetcher}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, policyFetcher :  gw.api.policy.refresh.RefreshPolicyFetcher) : pcf.api.Location {
    return __newDestination(config(), {claim, policyFetcher}, 0).goInMain()
  }
  
  static function printPage (claim :  Claim, policyFetcher :  gw.api.policy.refresh.RefreshPolicyFetcher) : pcf.api.Location {
    return __newDestination(config(), {claim, policyFetcher}, 0).printPage()
  }
  
  static function push (claim :  Claim, policyFetcher :  gw.api.policy.refresh.RefreshPolicyFetcher) : pcf.api.Location {
    return __newDestination(config(), {claim, policyFetcher}, 0).push()
  }
  
  
}