package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/TripIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TripIncidentDetailPrint extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.TripIncidentDetailPrint, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (aClaim :  Claim, aTripIncident :  TripIncident) : pcf.api.Destination {
    return __newDestination(config(), {aClaim, aTripIncident}, 0)
  }
  
  static function drilldown (aClaim :  Claim, aTripIncident :  TripIncident) : pcf.api.Location {
    return __newDestination(config(), {aClaim, aTripIncident}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (aClaim :  Claim, aTripIncident :  TripIncident) : pcf.api.Location {
    return __newDestination(config(), {aClaim, aTripIncident}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (aClaim :  Claim, aTripIncident :  TripIncident) : pcf.api.Location {
    return __newDestination(config(), {aClaim, aTripIncident}, 0).goInMain()
  }
  
  static function printPage (aClaim :  Claim, aTripIncident :  TripIncident) : pcf.api.Location {
    return __newDestination(config(), {aClaim, aTripIncident}, 0).printPage()
  }
  
  static function push (aClaim :  Claim, aTripIncident :  TripIncident) : pcf.api.Location {
    return __newDestination(config(), {aClaim, aTripIncident}, 0).push()
  }
  
  
}