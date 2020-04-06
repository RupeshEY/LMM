package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkflowStatsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($WorkflowStats :  gw.api.database.IQueryBeanResult<WorkflowStepStats>) : void {
    __widgetOf(this, pcf.WorkflowStatsLV, SECTION_WIDGET_CLASS).setVariables(false, {$WorkflowStats})
  }
  
  function refreshVariables ($WorkflowStats :  gw.api.database.IQueryBeanResult<WorkflowStepStats>) : void {
    __widgetOf(this, pcf.WorkflowStatsLV, SECTION_WIDGET_CLASS).setVariables(true, {$WorkflowStats})
  }
  
  
}