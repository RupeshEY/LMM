package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchPickerResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupSearchPickerResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($groupList :  gw.api.database.IQueryBeanResult<Group>, $restrictedGroup :  Group) : void {
    __widgetOf(this, pcf.GroupSearchPickerResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$groupList, $restrictedGroup})
  }
  
  function refreshVariables ($groupList :  gw.api.database.IQueryBeanResult<Group>, $restrictedGroup :  Group) : void {
    __widgetOf(this, pcf.GroupSearchPickerResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$groupList, $restrictedGroup})
  }
  
  
}