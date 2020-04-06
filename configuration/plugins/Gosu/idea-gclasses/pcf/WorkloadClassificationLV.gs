package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkloadClassificationLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($weights :  gw.api.database.IQueryBeanResult<WorkloadClassification>) : void {
    __widgetOf(this, pcf.WorkloadClassificationLV, SECTION_WIDGET_CLASS).setVariables(false, {$weights})
  }
  
  function refreshVariables ($weights :  gw.api.database.IQueryBeanResult<WorkloadClassification>) : void {
    __widgetOf(this, pcf.WorkloadClassificationLV, SECTION_WIDGET_CLASS).setVariables(true, {$weights})
  }
  
  
}