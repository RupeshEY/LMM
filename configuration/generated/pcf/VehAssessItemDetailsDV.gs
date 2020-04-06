package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VehAssessItemDetailsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AssessmentItem :  AssessmentItem) : void {
    __widgetOf(this, pcf.VehAssessItemDetailsDV, SECTION_WIDGET_CLASS).setVariables(false, {$AssessmentItem})
  }
  
  function refreshVariables ($AssessmentItem :  AssessmentItem) : void {
    __widgetOf(this, pcf.VehAssessItemDetailsDV, SECTION_WIDGET_CLASS).setVariables(true, {$AssessmentItem})
  }
  
  
}