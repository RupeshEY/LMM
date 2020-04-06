package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropIncidentAssessDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($FixedPropertyIncident :  FixedPropertyIncident) : void {
    __widgetOf(this, pcf.FixPropIncidentAssessDV, SECTION_WIDGET_CLASS).setVariables(false, {$FixedPropertyIncident})
  }
  
  function refreshVariables ($FixedPropertyIncident :  FixedPropertyIncident) : void {
    __widgetOf(this, pcf.FixPropIncidentAssessDV, SECTION_WIDGET_CLASS).setVariables(true, {$FixedPropertyIncident})
  }
  
  
}