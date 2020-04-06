package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/TeamUserGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamUserGroup extends com.guidewire.pl.web.codegen.LocationGroupBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationGroupConfig {
    return __configOf(pcf.TeamUserGroup, LOCATION_GROUP_CONFIG_CLASS)
  }
  
  static function createDestination (User :  User, Group :  Group) : pcf.api.Destination {
    return __newDestination(config(), {User, Group}, 0)
  }
  
  static function drilldown (User :  User, Group :  Group) : pcf.api.Location {
    return __newDestination(config(), {User, Group}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (User :  User, Group :  Group) : pcf.api.Location {
    return __newDestination(config(), {User, Group}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (User :  User, Group :  Group) : pcf.api.Location {
    return __newDestination(config(), {User, Group}, 0).goInMain()
  }
  
  static function printPage (User :  User, Group :  Group) : pcf.api.Location {
    return __newDestination(config(), {User, Group}, 0).printPage()
  }
  
  static function push (User :  User, Group :  Group) : pcf.api.Location {
    return __newDestination(config(), {User, Group}, 0).push()
  }
  
  
}