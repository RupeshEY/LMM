package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/VehicleIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleIncidentDetailPrint extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.VehicleIncidentDetailPrint, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (vehicleIncident :  VehicleIncident) : pcf.api.Destination {
    return __newDestination(config(), {vehicleIncident}, 0)
  }
  
  static function drilldown (vehicleIncident :  VehicleIncident) : pcf.api.Location {
    return __newDestination(config(), {vehicleIncident}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (vehicleIncident :  VehicleIncident) : pcf.api.Location {
    return __newDestination(config(), {vehicleIncident}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (vehicleIncident :  VehicleIncident) : pcf.api.Location {
    return __newDestination(config(), {vehicleIncident}, 0).goInMain()
  }
  
  static function printPage (vehicleIncident :  VehicleIncident) : pcf.api.Location {
    return __newDestination(config(), {vehicleIncident}, 0).printPage()
  }
  
  static function push (vehicleIncident :  VehicleIncident) : pcf.api.Location {
    return __newDestination(config(), {vehicleIncident}, 0).push()
  }
  
  
}