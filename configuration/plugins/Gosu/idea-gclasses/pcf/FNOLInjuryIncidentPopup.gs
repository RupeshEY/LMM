package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLInjuryIncidentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.FNOLInjuryIncidentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, injuryIncident :  InjuryIncident) : pcf.api.Destination {
    return __newDestination(config(), {Claim, injuryIncident}, 0)
  }
  
  function pickValueAndCommit (value :  InjuryIncident) : void {
    __widgetOf(this, pcf.FNOLInjuryIncidentPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (Claim :  Claim, injuryIncident :  InjuryIncident) : pcf.api.Location {
    return __newDestination(config(), {Claim, injuryIncident}, 0).push()
  }
  
  
}