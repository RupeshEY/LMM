package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserSearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($searchResults :  gw.api.database.IQueryBeanResult<User>, $EnablePick :  boolean, $pageHelper :  gw.api.contact.ProximitySearchPageHelper, $searchCriteria :  UserSearchCriteria, $EnableCheckbox :  boolean) : void {
    __widgetOf(this, pcf.UserSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$searchResults, $EnablePick, $pageHelper, $searchCriteria, $EnableCheckbox})
  }
  
  function refreshVariables ($searchResults :  gw.api.database.IQueryBeanResult<User>, $EnablePick :  boolean, $pageHelper :  gw.api.contact.ProximitySearchPageHelper, $searchCriteria :  UserSearchCriteria, $EnableCheckbox :  boolean) : void {
    __widgetOf(this, pcf.UserSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$searchResults, $EnablePick, $pageHelper, $searchCriteria, $EnableCheckbox})
  }
  
  
}