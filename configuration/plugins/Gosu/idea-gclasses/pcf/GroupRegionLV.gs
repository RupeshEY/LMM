package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/GroupRegionLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupRegionLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Group :  Group) : void {
    __widgetOf(this, pcf.GroupRegionLV, SECTION_WIDGET_CLASS).setVariables(false, {$Group})
  }
  
  function refreshVariables ($Group :  Group) : void {
    __widgetOf(this, pcf.GroupRegionLV, SECTION_WIDGET_CLASS).setVariables(true, {$Group})
  }
  
  
}