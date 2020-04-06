package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditInjuryIncidentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.EditInjuryIncidentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (injuryIncident :  InjuryIncident) : pcf.api.Destination {
    return __newDestination(config(), {injuryIncident}, 1)
  }
  
  static function createDestination (injuryIncident :  InjuryIncident, startInEditMode :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {injuryIncident, startInEditMode}, 0)
  }
  
  static function push (injuryIncident :  InjuryIncident) : pcf.api.Location {
    return __newDestination(config(), {injuryIncident}, 1).push()
  }
  
  static function push (injuryIncident :  InjuryIncident, startInEditMode :  boolean) : pcf.api.Location {
    return __newDestination(config(), {injuryIncident, startInEditMode}, 0).push()
  }
  
  
}