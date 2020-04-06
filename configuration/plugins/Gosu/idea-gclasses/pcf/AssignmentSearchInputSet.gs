package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentSearchInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentSearchInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($assignmentSearchTypes :  AssignmentSearchType[], $searchResult :  gw.api.assignment.AssignmentSearchResult, $searchCriteria :  gw.api.assignment.AssignmentSearchCriteria) : void {
    __widgetOf(this, pcf.AssignmentSearchInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$assignmentSearchTypes, $searchResult, $searchCriteria})
  }
  
  function refreshVariables ($assignmentSearchTypes :  AssignmentSearchType[], $searchResult :  gw.api.assignment.AssignmentSearchResult, $searchCriteria :  gw.api.assignment.AssignmentSearchCriteria) : void {
    __widgetOf(this, pcf.AssignmentSearchInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$assignmentSearchTypes, $searchResult, $searchCriteria})
  }
  
  
}