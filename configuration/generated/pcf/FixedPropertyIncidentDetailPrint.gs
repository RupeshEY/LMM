package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FixedPropertyIncidentDetailPrint extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.FixedPropertyIncidentDetailPrint, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (fixedPropertyIncident :  FixedPropertyIncident) : pcf.api.Destination {
    return __newDestination(config(), {fixedPropertyIncident}, 0)
  }
  
  static function drilldown (fixedPropertyIncident :  FixedPropertyIncident) : pcf.api.Location {
    return __newDestination(config(), {fixedPropertyIncident}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (fixedPropertyIncident :  FixedPropertyIncident) : pcf.api.Location {
    return __newDestination(config(), {fixedPropertyIncident}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (fixedPropertyIncident :  FixedPropertyIncident) : pcf.api.Location {
    return __newDestination(config(), {fixedPropertyIncident}, 0).goInMain()
  }
  
  static function printPage (fixedPropertyIncident :  FixedPropertyIncident) : pcf.api.Location {
    return __newDestination(config(), {fixedPropertyIncident}, 0).printPage()
  }
  
  static function push (fixedPropertyIncident :  FixedPropertyIncident) : pcf.api.Location {
    return __newDestination(config(), {fixedPropertyIncident}, 0).push()
  }
  
  
}