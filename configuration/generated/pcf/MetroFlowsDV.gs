package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroFlowsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SearchCriteria :  WorkflowSearchCriteria) : void {
    __widgetOf(this, pcf.MetroFlowsDV, SECTION_WIDGET_CLASS).setVariables(false, {$SearchCriteria})
  }
  
  function refreshVariables ($SearchCriteria :  WorkflowSearchCriteria) : void {
    __widgetOf(this, pcf.MetroFlowsDV, SECTION_WIDGET_CLASS).setVariables(true, {$SearchCriteria})
  }
  
  
}