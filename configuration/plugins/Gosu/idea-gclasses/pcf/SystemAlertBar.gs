package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/SystemAlertBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SystemAlertBar extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.SystemAlertBar, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.SystemAlertBar, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}