package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FailedAssignmentsLV_ServiceRequest extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AssignmentPopup :  gw.api.assignment.AssignmentPopup) : void {
    __widgetOf(this, pcf.FailedAssignmentsLV_ServiceRequest, SECTION_WIDGET_CLASS).setVariables(false, {$AssignmentPopup})
  }
  
  function refreshVariables ($AssignmentPopup :  gw.api.assignment.AssignmentPopup) : void {
    __widgetOf(this, pcf.FailedAssignmentsLV_ServiceRequest, SECTION_WIDGET_CLASS).setVariables(true, {$AssignmentPopup})
  }
  
  
}