package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditVehicleIncidentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.EditVehicleIncidentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (vehIncident :  VehicleIncident) : pcf.api.Destination {
    return __newDestination(config(), {vehIncident}, 1)
  }
  
  static function createDestination (vehIncident :  VehicleIncident, startInEditMode :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {vehIncident, startInEditMode}, 0)
  }
  
  static function push (vehIncident :  VehicleIncident) : pcf.api.Location {
    return __newDestination(config(), {vehIncident}, 1).push()
  }
  
  static function push (vehIncident :  VehicleIncident, startInEditMode :  boolean) : pcf.api.Location {
    return __newDestination(config(), {vehIncident, startInEditMode}, 0).push()
  }
  
  
}