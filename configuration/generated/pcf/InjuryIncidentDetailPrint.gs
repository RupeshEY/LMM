package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/InjuryIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class InjuryIncidentDetailPrint extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.InjuryIncidentDetailPrint, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (injuryIncident :  InjuryIncident) : pcf.api.Destination {
    return __newDestination(config(), {injuryIncident}, 0)
  }
  
  static function drilldown (injuryIncident :  InjuryIncident) : pcf.api.Location {
    return __newDestination(config(), {injuryIncident}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (injuryIncident :  InjuryIncident) : pcf.api.Location {
    return __newDestination(config(), {injuryIncident}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (injuryIncident :  InjuryIncident) : pcf.api.Location {
    return __newDestination(config(), {injuryIncident}, 0).goInMain()
  }
  
  static function printPage (injuryIncident :  InjuryIncident) : pcf.api.Location {
    return __newDestination(config(), {injuryIncident}, 0).printPage()
  }
  
  static function push (injuryIncident :  InjuryIncident) : pcf.api.Location {
    return __newDestination(config(), {injuryIncident}, 0).push()
  }
  
  
}