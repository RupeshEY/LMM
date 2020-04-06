package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/usersearch/UserSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SearchCriteria :  UserSearchCriteria, $proximitySearchPageHelper :  gw.api.contact.CCProximitySearchPageHelper) : void {
    __widgetOf(this, pcf.UserSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$SearchCriteria, $proximitySearchPageHelper})
  }
  
  function refreshVariables ($SearchCriteria :  UserSearchCriteria, $proximitySearchPageHelper :  gw.api.contact.CCProximitySearchPageHelper) : void {
    __widgetOf(this, pcf.UserSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$SearchCriteria, $proximitySearchPageHelper})
  }
  
  
}