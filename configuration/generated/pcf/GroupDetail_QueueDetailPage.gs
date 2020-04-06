package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/GroupDetail_QueueDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupDetail_QueueDetailPage extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.GroupDetail_QueueDetailPage, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Group :  Group, AssignableQueue :  AssignableQueue) : pcf.api.Destination {
    return __newDestination(config(), {Group, AssignableQueue}, 0)
  }
  
  static function drilldown (Group :  Group, AssignableQueue :  AssignableQueue) : pcf.api.Location {
    return __newDestination(config(), {Group, AssignableQueue}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Group :  Group, AssignableQueue :  AssignableQueue) : pcf.api.Location {
    return __newDestination(config(), {Group, AssignableQueue}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Group :  Group, AssignableQueue :  AssignableQueue) : pcf.api.Location {
    return __newDestination(config(), {Group, AssignableQueue}, 0).goInMain()
  }
  
  static function printPage (Group :  Group, AssignableQueue :  AssignableQueue) : pcf.api.Location {
    return __newDestination(config(), {Group, AssignableQueue}, 0).printPage()
  }
  
  static function push (Group :  Group, AssignableQueue :  AssignableQueue) : pcf.api.Location {
    return __newDestination(config(), {Group, AssignableQueue}, 0).push()
  }
  
  
}