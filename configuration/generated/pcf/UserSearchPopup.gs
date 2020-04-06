package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/usersearch/UserSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserSearchPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.UserSearchPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 0)
  }
  
  static function createDestination (Organization :  Organization) : pcf.api.Destination {
    return __newDestination(config(), {Organization}, 1)
  }
  
  function pickValueAndCommit (value :  User) : void {
    __widgetOf(this, pcf.UserSearchPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 0).push()
  }
  
  static function push (Organization :  Organization) : pcf.api.Location {
    return __newDestination(config(), {Organization}, 1).push()
  }
  
  
}