package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/GroupUserSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupUserSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SearchCriteria :  UserSearchCriteria) : void {
    __widgetOf(this, pcf.GroupUserSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$SearchCriteria})
  }
  
  function refreshVariables ($SearchCriteria :  UserSearchCriteria) : void {
    __widgetOf(this, pcf.GroupUserSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$SearchCriteria})
  }
  
  
}