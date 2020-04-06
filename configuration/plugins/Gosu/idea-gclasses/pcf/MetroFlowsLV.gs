package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroFlowsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Workflows :  gw.api.database.IQueryBeanResult<Workflow>) : void {
    __widgetOf(this, pcf.MetroFlowsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Workflows})
  }
  
  function refreshVariables ($Workflows :  gw.api.database.IQueryBeanResult<Workflow>) : void {
    __widgetOf(this, pcf.MetroFlowsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Workflows})
  }
  
  
}