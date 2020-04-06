package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/BlankMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BlankMenuActions extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.BlankMenuActions, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.BlankMenuActions, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}