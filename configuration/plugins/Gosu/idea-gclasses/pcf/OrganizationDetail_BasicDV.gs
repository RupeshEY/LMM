package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/OrganizationDetail_BasicDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OrganizationDetail_BasicDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Group :  Group, $Organization :  Organization) : void {
    __widgetOf(this, pcf.OrganizationDetail_BasicDV, SECTION_WIDGET_CLASS).setVariables(false, {$Group, $Organization})
  }
  
  function refreshVariables ($Group :  Group, $Organization :  Organization) : void {
    __widgetOf(this, pcf.OrganizationDetail_BasicDV, SECTION_WIDGET_CLASS).setVariables(true, {$Group, $Organization})
  }
  
  
}