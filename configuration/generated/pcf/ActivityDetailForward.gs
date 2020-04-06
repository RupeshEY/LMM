package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDetailForward extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ActivityDetailForward, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, Activity :  Activity) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Activity}, 0)
  }
  
  static function drilldown (Claim :  Claim, Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Claim, Activity}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Claim, Activity}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Claim, Activity}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (Claim :  Claim, Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Claim, Activity}, 0).goInWorkspace()
  }
  
  static function printPage (Claim :  Claim, Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Claim, Activity}, 0).printPage()
  }
  
  static function push (Claim :  Claim, Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Claim, Activity}, 0).push()
  }
  
  
}