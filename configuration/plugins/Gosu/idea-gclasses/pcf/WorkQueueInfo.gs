package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueInfo extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.WorkQueueInfo, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 0)
  }
  
  static function createDestination (initialWorkQueueInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : pcf.api.Destination {
    return __newDestination(config(), {initialWorkQueueInfo}, 1)
  }
  
  static function drilldown () : pcf.api.Location {
    return __newDestination(config(), {}, 0).drilldown()
  }
  
  static function drilldown (initialWorkQueueInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : pcf.api.Location {
    return __newDestination(config(), {initialWorkQueueInfo}, 1).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go () : pcf.api.Location {
    return __newDestination(config(), {}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (initialWorkQueueInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : pcf.api.Location {
    return __newDestination(config(), {initialWorkQueueInfo}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain () : pcf.api.Location {
    return __newDestination(config(), {}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (initialWorkQueueInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : pcf.api.Location {
    return __newDestination(config(), {initialWorkQueueInfo}, 1).goInMain()
  }
  
  static function printPage () : pcf.api.Location {
    return __newDestination(config(), {}, 0).printPage()
  }
  
  static function printPage (initialWorkQueueInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : pcf.api.Location {
    return __newDestination(config(), {initialWorkQueueInfo}, 1).printPage()
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 0).push()
  }
  
  static function push (initialWorkQueueInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : pcf.api.Location {
    return __newDestination(config(), {initialWorkQueueInfo}, 1).push()
  }
  
  
}