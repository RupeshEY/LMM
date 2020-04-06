package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourceDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VehAssessSourceDetailsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AssessmentSource :  AssessmentSource) : void {
    __widgetOf(this, pcf.VehAssessSourceDetailsDV, SECTION_WIDGET_CLASS).setVariables(false, {$AssessmentSource})
  }
  
  function refreshVariables ($AssessmentSource :  AssessmentSource) : void {
    __widgetOf(this, pcf.VehAssessSourceDetailsDV, SECTION_WIDGET_CLASS).setVariables(true, {$AssessmentSource})
  }
  
  
}