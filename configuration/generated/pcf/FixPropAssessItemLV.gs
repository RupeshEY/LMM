package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/FixPropAssessItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropAssessItemLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($FixedPropertyIncident :  FixedPropertyIncident) : void {
    __widgetOf(this, pcf.FixPropAssessItemLV, SECTION_WIDGET_CLASS).setVariables(false, {$FixedPropertyIncident})
  }
  
  function refreshVariables ($FixedPropertyIncident :  FixedPropertyIncident) : void {
    __widgetOf(this, pcf.FixPropAssessItemLV, SECTION_WIDGET_CLASS).setVariables(true, {$FixedPropertyIncident})
  }
  
  
}