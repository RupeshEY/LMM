package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/TeamMenuTree.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamMenuTree extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.TeamMenuTree, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.TeamMenuTree, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}