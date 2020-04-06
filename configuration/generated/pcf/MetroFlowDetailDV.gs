package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroFlowDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Workflow :  Workflow) : void {
    __widgetOf(this, pcf.MetroFlowDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$Workflow})
  }
  
  function refreshVariables ($Workflow :  Workflow) : void {
    __widgetOf(this, pcf.MetroFlowDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$Workflow})
  }
  
  
}