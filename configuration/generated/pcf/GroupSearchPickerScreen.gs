package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchPickerScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupSearchPickerScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($RestrictedGroup :  Group) : void {
    __widgetOf(this, pcf.GroupSearchPickerScreen, SECTION_WIDGET_CLASS).setVariables(false, {$RestrictedGroup})
  }
  
  function refreshVariables ($RestrictedGroup :  Group) : void {
    __widgetOf(this, pcf.GroupSearchPickerScreen, SECTION_WIDGET_CLASS).setVariables(true, {$RestrictedGroup})
  }
  
  
}