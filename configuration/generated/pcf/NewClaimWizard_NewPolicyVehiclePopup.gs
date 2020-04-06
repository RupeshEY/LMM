package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_NewPolicyVehiclePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_NewPolicyVehiclePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewClaimWizard_NewPolicyVehiclePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Policy :  Policy) : pcf.api.Destination {
    return __newDestination(config(), {Policy}, 0)
  }
  
  function pickValueAndCommit (value :  VehicleRU) : void {
    __widgetOf(this, pcf.NewClaimWizard_NewPolicyVehiclePopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (Policy :  Policy) : pcf.api.Location {
    return __newDestination(config(), {Policy}, 0).push()
  }
  
  
}