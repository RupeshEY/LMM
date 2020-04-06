package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedHandlerTriggerInputSet_claimindicatortrigger extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($automatedHandler :  AutomatedHandler) : void {
    __widgetOf(this, pcf.AutomatedHandlerTriggerInputSet_claimindicatortrigger, SECTION_WIDGET_CLASS).setVariables(false, {$automatedHandler})
  }
  
  function refreshVariables ($automatedHandler :  AutomatedHandler) : void {
    __widgetOf(this, pcf.AutomatedHandlerTriggerInputSet_claimindicatortrigger, SECTION_WIDGET_CLASS).setVariables(true, {$automatedHandler})
  }
  
  
}