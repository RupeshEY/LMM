package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySummaryInfoPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.PolicySummaryInfoPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (PolicySummary :  PolicySummary) : pcf.api.Destination {
    return __newDestination(config(), {PolicySummary}, 0)
  }
  
  static function push (PolicySummary :  PolicySummary) : pcf.api.Location {
    return __newDestination(config(), {PolicySummary}, 0).push()
  }
  
  
}