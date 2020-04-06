package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/IncidentAssessItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class IncidentAssessItemLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($incident :  Incident) : void {
    __widgetOf(this, pcf.IncidentAssessItemLV, SECTION_WIDGET_CLASS).setVariables(false, {$incident})
  }
  
  function refreshVariables ($incident :  Incident) : void {
    __widgetOf(this, pcf.IncidentAssessItemLV, SECTION_WIDGET_CLASS).setVariables(true, {$incident})
  }
  
  
}