package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowStatsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkflowStatsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SearchCriteria :  WFStatsSearchCriteria) : void {
    __widgetOf(this, pcf.WorkflowStatsDV, SECTION_WIDGET_CLASS).setVariables(false, {$SearchCriteria})
  }
  
  function refreshVariables ($SearchCriteria :  WFStatsSearchCriteria) : void {
    __widgetOf(this, pcf.WorkflowStatsDV, SECTION_WIDGET_CLASS).setVariables(true, {$SearchCriteria})
  }
  
  
}