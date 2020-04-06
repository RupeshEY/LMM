package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AssignmentSearchTypes :  AssignmentSearchType[], $SearchCriteria :  gw.api.assignment.CCAssignmentSearchCriteria, $proximitySearchPageHelper :  gw.api.contact.CCProximitySearchPageHelper, $claim :  Claim) : void {
    __widgetOf(this, pcf.AssignmentSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$AssignmentSearchTypes, $SearchCriteria, $proximitySearchPageHelper, $claim})
  }
  
  function refreshVariables ($AssignmentSearchTypes :  AssignmentSearchType[], $SearchCriteria :  gw.api.assignment.CCAssignmentSearchCriteria, $proximitySearchPageHelper :  gw.api.contact.CCProximitySearchPageHelper, $claim :  Claim) : void {
    __widgetOf(this, pcf.AssignmentSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$AssignmentSearchTypes, $SearchCriteria, $proximitySearchPageHelper, $claim})
  }
  
  
}