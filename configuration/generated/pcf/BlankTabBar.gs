package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/BlankTabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BlankTabBar extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.BlankTabBar, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.BlankTabBar, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}