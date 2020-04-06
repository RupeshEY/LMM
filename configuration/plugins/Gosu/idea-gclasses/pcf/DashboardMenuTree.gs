package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/DashboardMenuTree.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DashboardMenuTree extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.DashboardMenuTree, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.DashboardMenuTree, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}