package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/activitypatterns/NewActivityPattern.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewActivityPattern extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewActivityPattern, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Category :  ActivityCategory) : pcf.api.Destination {
    return __newDestination(config(), {Category}, 0)
  }
  
  static function drilldown (Category :  ActivityCategory) : pcf.api.Location {
    return __newDestination(config(), {Category}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Category :  ActivityCategory) : pcf.api.Location {
    return __newDestination(config(), {Category}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Category :  ActivityCategory) : pcf.api.Location {
    return __newDestination(config(), {Category}, 0).goInMain()
  }
  
  static function printPage (Category :  ActivityCategory) : pcf.api.Location {
    return __newDestination(config(), {Category}, 0).printPage()
  }
  
  static function push (Category :  ActivityCategory) : pcf.api.Location {
    return __newDestination(config(), {Category}, 0).push()
  }
  
  
}