package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/AdminUserSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AdminUserSearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($searchResults :  gw.api.database.IQueryBeanResult<User>, $pageHelper :  gw.api.contact.ProximitySearchPageHelper, $searchCriteria :  UserSearchCriteria, $EnableCheckbox :  boolean) : void {
    __widgetOf(this, pcf.AdminUserSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$searchResults, $pageHelper, $searchCriteria, $EnableCheckbox})
  }
  
  function refreshVariables ($searchResults :  gw.api.database.IQueryBeanResult<User>, $pageHelper :  gw.api.contact.ProximitySearchPageHelper, $searchCriteria :  UserSearchCriteria, $EnableCheckbox :  boolean) : void {
    __widgetOf(this, pcf.AdminUserSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$searchResults, $pageHelper, $searchCriteria, $EnableCheckbox})
  }
  
  
}