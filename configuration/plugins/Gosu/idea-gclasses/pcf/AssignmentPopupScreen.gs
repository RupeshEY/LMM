package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentPopupScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentPopupScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AssignmentPopup :  gw.api.assignment.AssignmentPopup, $claim :  Claim) : void {
    __widgetOf(this, pcf.AssignmentPopupScreen, SECTION_WIDGET_CLASS).setVariables(false, {$AssignmentPopup, $claim})
  }
  
  function refreshVariables ($AssignmentPopup :  gw.api.assignment.AssignmentPopup, $claim :  Claim) : void {
    __widgetOf(this, pcf.AssignmentPopupScreen, SECTION_WIDGET_CLASS).setVariables(true, {$AssignmentPopup, $claim})
  }
  
  
}