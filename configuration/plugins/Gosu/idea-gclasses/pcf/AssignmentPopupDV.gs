package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentPopupDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentPopupDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AssignmentPopup :  gw.api.assignment.AssignmentPopup, $SearchResult :  gw.api.assignment.AssignmentProximitySearchResult, $SearchCriteria :  gw.api.assignment.CCAssignmentSearchCriteria) : void {
    __widgetOf(this, pcf.AssignmentPopupDV, SECTION_WIDGET_CLASS).setVariables(false, {$AssignmentPopup, $SearchResult, $SearchCriteria})
  }
  
  function refreshVariables ($AssignmentPopup :  gw.api.assignment.AssignmentPopup, $SearchResult :  gw.api.assignment.AssignmentProximitySearchResult, $SearchCriteria :  gw.api.assignment.CCAssignmentSearchCriteria) : void {
    __widgetOf(this, pcf.AssignmentPopupDV, SECTION_WIDGET_CLASS).setVariables(true, {$AssignmentPopup, $SearchResult, $SearchCriteria})
  }
  
  
}