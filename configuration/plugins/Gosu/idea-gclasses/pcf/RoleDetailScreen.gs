package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/roles/RoleDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RoleDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Role :  Role) : void {
    __widgetOf(this, pcf.RoleDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Role})
  }
  
  function refreshVariables ($Role :  Role) : void {
    __widgetOf(this, pcf.RoleDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Role})
  }
  
  
}