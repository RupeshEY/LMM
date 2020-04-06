package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupSearchPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.GroupSearchPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 0)
  }
  
  static function createDestination (RestrictedGroup :  Group) : pcf.api.Destination {
    return __newDestination(config(), {RestrictedGroup}, 1)
  }
  
  function pickValueAndCommit (value :  Group) : void {
    __widgetOf(this, pcf.GroupSearchPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 0).push()
  }
  
  static function push (RestrictedGroup :  Group) : pcf.api.Location {
    return __newDestination(config(), {RestrictedGroup}, 1).push()
  }
  
  
}