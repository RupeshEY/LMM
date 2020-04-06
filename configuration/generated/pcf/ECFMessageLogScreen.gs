package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagelog/ECFMessageLogScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageLogScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.ECFMessageLogScreen, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.ECFMessageLogScreen, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}