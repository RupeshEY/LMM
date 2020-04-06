package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/roles/RoleUsersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RoleUsersLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Role :  Role) : void {
    __widgetOf(this, pcf.RoleUsersLV, SECTION_WIDGET_CLASS).setVariables(false, {$Role})
  }
  
  function refreshVariables ($Role :  Role) : void {
    __widgetOf(this, pcf.RoleUsersLV, SECTION_WIDGET_CLASS).setVariables(true, {$Role})
  }
  
  
}