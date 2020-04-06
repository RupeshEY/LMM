package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropContentItemLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($FixedPropertyIncident :  FixedPropertyIncident) : void {
    __widgetOf(this, pcf.FixPropContentItemLV, SECTION_WIDGET_CLASS).setVariables(false, {$FixedPropertyIncident})
  }
  
  function refreshVariables ($FixedPropertyIncident :  FixedPropertyIncident) : void {
    __widgetOf(this, pcf.FixPropContentItemLV, SECTION_WIDGET_CLASS).setVariables(true, {$FixedPropertyIncident})
  }
  
  
}