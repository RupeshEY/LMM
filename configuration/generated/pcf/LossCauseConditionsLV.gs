package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/conditions/LossCauseConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LossCauseConditionsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($classification :  WorkloadClassification) : void {
    __widgetOf(this, pcf.LossCauseConditionsLV, SECTION_WIDGET_CLASS).setVariables(false, {$classification})
  }
  
  function refreshVariables ($classification :  WorkloadClassification) : void {
    __widgetOf(this, pcf.LossCauseConditionsLV, SECTION_WIDGET_CLASS).setVariables(true, {$classification})
  }
  
  
}