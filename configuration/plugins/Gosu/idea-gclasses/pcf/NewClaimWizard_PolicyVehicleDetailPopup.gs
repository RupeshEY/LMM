package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_PolicyVehicleDetailPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewClaimWizard_PolicyVehicleDetailPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (VehicleRU :  VehicleRU, Policy :  Policy) : pcf.api.Destination {
    return __newDestination(config(), {VehicleRU, Policy}, 0)
  }
  
  static function push (VehicleRU :  VehicleRU, Policy :  Policy) : pcf.api.Location {
    return __newDestination(config(), {VehicleRU, Policy}, 0).push()
  }
  
  
}