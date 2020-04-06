package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserExposuresPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserExposuresPage extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.UserExposuresPage, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (User :  User) : pcf.api.Destination {
    return __newDestination(config(), {User}, 0)
  }
  
  static function drilldown (User :  User) : pcf.api.Location {
    return __newDestination(config(), {User}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (User :  User) : pcf.api.Location {
    return __newDestination(config(), {User}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (User :  User) : pcf.api.Location {
    return __newDestination(config(), {User}, 0).goInMain()
  }
  
  static function printPage (User :  User) : pcf.api.Location {
    return __newDestination(config(), {User}, 0).printPage()
  }
  
  static function push (User :  User) : pcf.api.Location {
    return __newDestination(config(), {User}, 0).push()
  }
  
  
}