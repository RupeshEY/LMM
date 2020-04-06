package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupSearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($GroupList :  gw.api.database.IQueryBeanResult<Group>) : void {
    __widgetOf(this, pcf.GroupSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$GroupList})
  }
  
  function refreshVariables ($GroupList :  gw.api.database.IQueryBeanResult<Group>) : void {
    __widgetOf(this, pcf.GroupSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$GroupList})
  }
  
  
}