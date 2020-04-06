package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class IncidentExposuresLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($incident :  Incident) : void {
    __widgetOf(this, pcf.IncidentExposuresLV, SECTION_WIDGET_CLASS).setVariables(false, {$incident})
  }
  
  function refreshVariables ($incident :  Incident) : void {
    __widgetOf(this, pcf.IncidentExposuresLV, SECTION_WIDGET_CLASS).setVariables(true, {$incident})
  }
  
  
}