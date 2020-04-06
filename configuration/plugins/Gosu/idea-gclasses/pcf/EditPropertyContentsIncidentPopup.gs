package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditPropertyContentsIncidentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.EditPropertyContentsIncidentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (incident :  PropertyContentsIncident) : pcf.api.Destination {
    return __newDestination(config(), {incident}, 1)
  }
  
  static function createDestination (incident :  PropertyContentsIncident, startInEditMode :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {incident, startInEditMode}, 0)
  }
  
  static function push (incident :  PropertyContentsIncident) : pcf.api.Location {
    return __newDestination(config(), {incident}, 1).push()
  }
  
  static function push (incident :  PropertyContentsIncident, startInEditMode :  boolean) : pcf.api.Location {
    return __newDestination(config(), {incident, startInEditMode}, 0).push()
  }
  
  
}