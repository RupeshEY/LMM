package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassificationCommonInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkloadClassificationCommonInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($assignmentClassification :  WorkloadClassification) : void {
    __widgetOf(this, pcf.WorkloadClassificationCommonInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$assignmentClassification})
  }
  
  function refreshVariables ($assignmentClassification :  WorkloadClassification) : void {
    __widgetOf(this, pcf.WorkloadClassificationCommonInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$assignmentClassification})
  }
  
  
}