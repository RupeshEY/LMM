package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/NewAutomatedHandlerDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewAutomatedHandlerDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($newHandler :  AutomatedHandler, $mode :  String) : void {
    __widgetOf(this, pcf.NewAutomatedHandlerDV, SECTION_WIDGET_CLASS).setVariables(false, {$newHandler, $mode})
  }
  
  function refreshVariables ($newHandler :  AutomatedHandler, $mode :  String) : void {
    __widgetOf(this, pcf.NewAutomatedHandlerDV, SECTION_WIDGET_CLASS).setVariables(true, {$newHandler, $mode})
  }
  
  
}