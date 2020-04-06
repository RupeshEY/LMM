package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/TeamGroupOtherGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupOtherGroup extends com.guidewire.pl.web.codegen.LocationGroupBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationGroupConfig {
    return __configOf(pcf.TeamGroupOtherGroup, LOCATION_GROUP_CONFIG_CLASS)
  }
  
  static function createDestination (Group :  Group) : pcf.api.Destination {
    return __newDestination(config(), {Group}, 0)
  }
  
  static function drilldown (Group :  Group) : pcf.api.Location {
    return __newDestination(config(), {Group}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Group :  Group) : pcf.api.Location {
    return __newDestination(config(), {Group}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Group :  Group) : pcf.api.Location {
    return __newDestination(config(), {Group}, 0).goInMain()
  }
  
  static function printPage (Group :  Group) : pcf.api.Location {
    return __newDestination(config(), {Group}, 0).printPage()
  }
  
  static function push (Group :  Group) : pcf.api.Location {
    return __newDestination(config(), {Group}, 0).push()
  }
  
  
}