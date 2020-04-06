package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropContentItemDetailsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AssessmentContentItem :  AssessmentContentItem) : void {
    __widgetOf(this, pcf.FixPropContentItemDetailsDV, SECTION_WIDGET_CLASS).setVariables(false, {$AssessmentContentItem})
  }
  
  function refreshVariables ($AssessmentContentItem :  AssessmentContentItem) : void {
    __widgetOf(this, pcf.FixPropContentItemDetailsDV, SECTION_WIDGET_CLASS).setVariables(true, {$AssessmentContentItem})
  }
  
  
}