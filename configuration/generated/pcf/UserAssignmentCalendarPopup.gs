package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/UserAssignmentCalendarPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAssignmentCalendarPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.UserAssignmentCalendarPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (User :  User) : pcf.api.Destination {
    return __newDestination(config(), {User}, 0)
  }
  
  static function push (User :  User) : pcf.api.Location {
    return __newDestination(config(), {User}, 0).push()
  }
  
  
}