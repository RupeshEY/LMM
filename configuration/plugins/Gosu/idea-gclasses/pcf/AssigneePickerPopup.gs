package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AssigneePickerPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AssigneePickerPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (AssigneePicker :  gw.api.assignment.AssigneePicker) : pcf.api.Destination {
    return __newDestination(config(), {AssigneePicker}, 0)
  }
  
  static function createDestination (AssigneePicker :  gw.api.assignment.AssigneePicker, Claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {AssigneePicker, Claim}, 1)
  }
  
  function pickValueAndCommit (value :  gw.api.assignment.Assignee) : void {
    __widgetOf(this, pcf.AssigneePickerPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (AssigneePicker :  gw.api.assignment.AssigneePicker) : pcf.api.Location {
    return __newDestination(config(), {AssigneePicker}, 0).push()
  }
  
  static function push (AssigneePicker :  gw.api.assignment.AssigneePicker, Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {AssigneePicker, Claim}, 1).push()
  }
  
  
}