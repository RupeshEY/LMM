package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentUserLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentUserLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($searchResults :  gw.api.database.IQueryBeanResult<GroupUser>, $pageHelper :  gw.api.contact.ProximitySearchPageHelper, $searchCriteria :  ContactSearchCriteria) : void {
    __widgetOf(this, pcf.AssignmentUserLV, SECTION_WIDGET_CLASS).setVariables(false, {$searchResults, $pageHelper, $searchCriteria})
  }
  
  function refreshVariables ($searchResults :  gw.api.database.IQueryBeanResult<GroupUser>, $pageHelper :  gw.api.contact.ProximitySearchPageHelper, $searchCriteria :  ContactSearchCriteria) : void {
    __widgetOf(this, pcf.AssignmentUserLV, SECTION_WIDGET_CLASS).setVariables(true, {$searchResults, $pageHelper, $searchCriteria})
  }
  
  
}