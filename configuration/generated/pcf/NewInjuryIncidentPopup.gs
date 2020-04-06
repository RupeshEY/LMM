package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/injury/NewInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewInjuryIncidentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewInjuryIncidentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {Claim}, 0)
  }
  
  static function createDestination (Claim :  Claim, Exposure :  Exposure) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Exposure}, 1)
  }
  
  function pickValueAndCommit (value :  InjuryIncident) : void {
    __widgetOf(this, pcf.NewInjuryIncidentPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Claim}, 0).push()
  }
  
  static function push (Claim :  Claim, Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure}, 1).push()
  }
  
  
}