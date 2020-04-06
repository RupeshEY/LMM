package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkloadClassificationDV_ExposureWorkloadClassification extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($assignmentClassification :  WorkloadClassification) : void {
    __widgetOf(this, pcf.WorkloadClassificationDV_ExposureWorkloadClassification, SECTION_WIDGET_CLASS).setVariables(false, {$assignmentClassification})
  }
  
  function refreshVariables ($assignmentClassification :  WorkloadClassification) : void {
    __widgetOf(this, pcf.WorkloadClassificationDV_ExposureWorkloadClassification, SECTION_WIDGET_CLASS).setVariables(true, {$assignmentClassification})
  }
  
  
}