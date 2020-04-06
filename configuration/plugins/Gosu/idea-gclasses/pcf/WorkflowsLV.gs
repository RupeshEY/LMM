package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkflowsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Workflows :  gw.api.database.IQueryBeanResult<Workflow>, $isParent :  boolean) : void {
    __widgetOf(this, pcf.WorkflowsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Workflows, $isParent})
  }
  
  function refreshVariables ($Workflows :  gw.api.database.IQueryBeanResult<Workflow>, $isParent :  boolean) : void {
    __widgetOf(this, pcf.WorkflowsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Workflows, $isParent})
  }
  
  
}