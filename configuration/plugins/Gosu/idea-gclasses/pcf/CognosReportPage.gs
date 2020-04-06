package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/cognos/CognosReportPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CognosReportPage extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.CognosReportPage, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (repletName :  String) : pcf.api.Destination {
    return __newDestination(config(), {repletName}, 0)
  }
  
  static function drilldown (repletName :  String) : pcf.api.Location {
    return __newDestination(config(), {repletName}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (repletName :  String) : pcf.api.Location {
    return __newDestination(config(), {repletName}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (repletName :  String) : pcf.api.Location {
    return __newDestination(config(), {repletName}, 0).goInMain()
  }
  
  static function printPage (repletName :  String) : pcf.api.Location {
    return __newDestination(config(), {repletName}, 0).printPage()
  }
  
  static function push (repletName :  String) : pcf.api.Location {
    return __newDestination(config(), {repletName}, 0).push()
  }
  
  
}