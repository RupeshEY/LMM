package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicySelectPolicyPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicySelectPolicyPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimPolicySelectPolicyPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {Claim}, 0)
  }
  
  function pickValueAndCommit (value :  PolicySummary) : void {
    __widgetOf(this, pcf.ClaimPolicySelectPolicyPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Claim}, 0).push()
  }
  
  
}