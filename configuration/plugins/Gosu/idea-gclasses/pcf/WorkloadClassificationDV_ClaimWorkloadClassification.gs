package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkloadClassificationDV_ClaimWorkloadClassification extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($assignmentClassification :  WorkloadClassification) : void {
    __widgetOf(this, pcf.WorkloadClassificationDV_ClaimWorkloadClassification, SECTION_WIDGET_CLASS).setVariables(false, {$assignmentClassification})
  }
  
  function refreshVariables ($assignmentClassification :  WorkloadClassification) : void {
    __widgetOf(this, pcf.WorkloadClassificationDV_ClaimWorkloadClassification, SECTION_WIDGET_CLASS).setVariables(true, {$assignmentClassification})
  }
  
  
}