package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditFixedPropertyIncidentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.EditFixedPropertyIncidentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (fixedPropertyIncident :  FixedPropertyIncident, startInEditMode :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {fixedPropertyIncident, startInEditMode}, 0)
  }
  
  static function push (fixedPropertyIncident :  FixedPropertyIncident, startInEditMode :  boolean) : pcf.api.Location {
    return __newDestination(config(), {fixedPropertyIncident, startInEditMode}, 0).push()
  }
  
  
}