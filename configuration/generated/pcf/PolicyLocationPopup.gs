package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.PolicyLocationPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (PolicyLocation :  PolicyLocation, Claim :  Claim, EditMode :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {PolicyLocation, Claim, EditMode}, 0)
  }
  
  function pickValueAndCommit (value :  PolicyLocation) : void {
    __widgetOf(this, pcf.PolicyLocationPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (PolicyLocation :  PolicyLocation, Claim :  Claim, EditMode :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {PolicyLocation, Claim, EditMode}, 0).push()
  }
  
  
}