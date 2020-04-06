package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/assignment/GroupUserPickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupUserPickerPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.GroupUserPickerPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 0)
  }
  
  function pickValueAndCommit (value :  GroupUser) : void {
    __widgetOf(this, pcf.GroupUserPickerPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 0).push()
  }
  
  
}