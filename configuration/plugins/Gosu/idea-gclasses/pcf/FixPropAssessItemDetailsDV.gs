package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/FixPropAssessItemDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropAssessItemDetailsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AssessmentItem :  AssessmentItem) : void {
    __widgetOf(this, pcf.FixPropAssessItemDetailsDV, SECTION_WIDGET_CLASS).setVariables(false, {$AssessmentItem})
  }
  
  function refreshVariables ($AssessmentItem :  AssessmentItem) : void {
    __widgetOf(this, pcf.FixPropAssessItemDetailsDV, SECTION_WIDGET_CLASS).setVariables(true, {$AssessmentItem})
  }
  
  
}