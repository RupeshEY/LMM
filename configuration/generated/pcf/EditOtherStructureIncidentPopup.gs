package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditOtherStructureIncidentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.EditOtherStructureIncidentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (incident :  OtherStructureIncident) : pcf.api.Destination {
    return __newDestination(config(), {incident}, 0)
  }
  
  static function createDestination (incident :  OtherStructureIncident, startInEditMode :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {incident, startInEditMode}, 1)
  }
  
  static function push (incident :  OtherStructureIncident) : pcf.api.Location {
    return __newDestination(config(), {incident}, 0).push()
  }
  
  static function push (incident :  OtherStructureIncident, startInEditMode :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {incident, startInEditMode}, 1).push()
  }
  
  
}