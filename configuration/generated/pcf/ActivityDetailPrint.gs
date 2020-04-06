package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/ActivityDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDetailPrint extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ActivityDetailPrint, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Activity :  Activity) : pcf.api.Destination {
    return __newDestination(config(), {Activity}, 0)
  }
  
  static function drilldown (Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Activity}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Activity}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Activity}, 0).goInMain()
  }
  
  static function printPage (Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Activity}, 0).printPage()
  }
  
  static function push (Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Activity}, 0).push()
  }
  
  
}