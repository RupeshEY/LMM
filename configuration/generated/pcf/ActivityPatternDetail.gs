package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/activitypatterns/ActivityPatternDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityPatternDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ActivityPatternDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (ActivityPattern :  ActivityPattern) : pcf.api.Destination {
    return __newDestination(config(), {ActivityPattern}, 0)
  }
  
  static function drilldown (ActivityPattern :  ActivityPattern) : pcf.api.Location {
    return __newDestination(config(), {ActivityPattern}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (ActivityPattern :  ActivityPattern) : pcf.api.Location {
    return __newDestination(config(), {ActivityPattern}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (ActivityPattern :  ActivityPattern) : pcf.api.Location {
    return __newDestination(config(), {ActivityPattern}, 0).goInMain()
  }
  
  static function printPage (ActivityPattern :  ActivityPattern) : pcf.api.Location {
    return __newDestination(config(), {ActivityPattern}, 0).printPage()
  }
  
  static function push (ActivityPattern :  ActivityPattern) : pcf.api.Location {
    return __newDestination(config(), {ActivityPattern}, 0).push()
  }
  
  
}