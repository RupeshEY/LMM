package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SearchCriteria :  GroupSearchCriteria) : void {
    __widgetOf(this, pcf.GroupSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$SearchCriteria})
  }
  
  function refreshVariables ($SearchCriteria :  GroupSearchCriteria) : void {
    __widgetOf(this, pcf.GroupSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$SearchCriteria})
  }
  
  
}