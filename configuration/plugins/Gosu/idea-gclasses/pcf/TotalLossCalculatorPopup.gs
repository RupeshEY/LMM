package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TotalLossCalculatorPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.TotalLossCalculatorPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (VehicleIncident :  VehicleIncident) : pcf.api.Destination {
    return __newDestination(config(), {VehicleIncident}, 0)
  }
  
  static function push (VehicleIncident :  VehicleIncident) : pcf.api.Location {
    return __newDestination(config(), {VehicleIncident}, 0).push()
  }
  
  
}