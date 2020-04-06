package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/LivingExpensesIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LivingExpensesIncidentPrint extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.LivingExpensesIncidentPrint, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (c :  Claim, incident :  LivingExpensesIncident) : pcf.api.Destination {
    return __newDestination(config(), {c, incident}, 0)
  }
  
  static function drilldown (c :  Claim, incident :  LivingExpensesIncident) : pcf.api.Location {
    return __newDestination(config(), {c, incident}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (c :  Claim, incident :  LivingExpensesIncident) : pcf.api.Location {
    return __newDestination(config(), {c, incident}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (c :  Claim, incident :  LivingExpensesIncident) : pcf.api.Location {
    return __newDestination(config(), {c, incident}, 0).goInMain()
  }
  
  static function printPage (c :  Claim, incident :  LivingExpensesIncident) : pcf.api.Location {
    return __newDestination(config(), {c, incident}, 0).printPage()
  }
  
  static function push (c :  Claim, incident :  LivingExpensesIncident) : pcf.api.Location {
    return __newDestination(config(), {c, incident}, 0).push()
  }
  
  
}