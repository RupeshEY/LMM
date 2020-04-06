package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedHandlerTriggerInputSet_financialthresholdtrigger extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($automatedHandler :  AutomatedHandler) : void {
    __widgetOf(this, pcf.AutomatedHandlerTriggerInputSet_financialthresholdtrigger, SECTION_WIDGET_CLASS).setVariables(false, {$automatedHandler})
  }
  
  function refreshVariables ($automatedHandler :  AutomatedHandler) : void {
    __widgetOf(this, pcf.AutomatedHandlerTriggerInputSet_financialthresholdtrigger, SECTION_WIDGET_CLASS).setVariables(true, {$automatedHandler})
  }
  
  
}