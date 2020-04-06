package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VehAssessItemLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($VehicleIncident :  VehicleIncident) : void {
    __widgetOf(this, pcf.VehAssessItemLV, SECTION_WIDGET_CLASS).setVariables(false, {$VehicleIncident})
  }
  
  function refreshVariables ($VehicleIncident :  VehicleIncident) : void {
    __widgetOf(this, pcf.VehAssessItemLV, SECTION_WIDGET_CLASS).setVariables(true, {$VehicleIncident})
  }
  
  
}