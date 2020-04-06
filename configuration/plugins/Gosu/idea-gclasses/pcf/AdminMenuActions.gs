package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/AdminMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AdminMenuActions extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.AdminMenuActions, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.AdminMenuActions, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}