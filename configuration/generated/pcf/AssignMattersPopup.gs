package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/AssignMattersPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignMattersPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AssignMattersPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (AssignmentPopup :  gw.api.matter.MatterAssignmentPopup) : pcf.api.Destination {
    return __newDestination(config(), {AssignmentPopup}, 0)
  }
  
  function pickValueAndCommit (value :  gw.api.assignment.Assignee) : void {
    __widgetOf(this, pcf.AssignMattersPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (AssignmentPopup :  gw.api.matter.MatterAssignmentPopup) : pcf.api.Location {
    return __newDestination(config(), {AssignmentPopup}, 0).push()
  }
  
  
}