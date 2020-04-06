package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class IncidentAssessSourceDetailsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($assessmentSource :  AssessmentSource) : void {
    __widgetOf(this, pcf.IncidentAssessSourceDetailsDV, SECTION_WIDGET_CLASS).setVariables(false, {$assessmentSource})
  }
  
  function refreshVariables ($assessmentSource :  AssessmentSource) : void {
    __widgetOf(this, pcf.IncidentAssessSourceDetailsDV, SECTION_WIDGET_CLASS).setVariables(true, {$assessmentSource})
  }
  
  
}