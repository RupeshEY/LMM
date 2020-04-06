package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/IncidentAssessItemDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class IncidentAssessItemDetailsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($assessmentItem :  AssessmentItem) : void {
    __widgetOf(this, pcf.IncidentAssessItemDetailsDV, SECTION_WIDGET_CLASS).setVariables(false, {$assessmentItem})
  }
  
  function refreshVariables ($assessmentItem :  AssessmentItem) : void {
    __widgetOf(this, pcf.IncidentAssessItemDetailsDV, SECTION_WIDGET_CLASS).setVariables(true, {$assessmentItem})
  }
  
  
}