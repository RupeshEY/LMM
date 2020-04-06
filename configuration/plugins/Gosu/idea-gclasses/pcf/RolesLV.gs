package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/roles/RolesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RolesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($RoleList :  Role[]) : void {
    __widgetOf(this, pcf.RolesLV, SECTION_WIDGET_CLASS).setVariables(false, {$RoleList})
  }
  
  function refreshVariables ($RoleList :  Role[]) : void {
    __widgetOf(this, pcf.RolesLV, SECTION_WIDGET_CLASS).setVariables(true, {$RoleList})
  }
  
  
}