package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/OtherStructureIncidentCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherStructureIncidentCV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($otherStructureIncident :  OtherStructureIncident) : void {
    __widgetOf(this, pcf.OtherStructureIncidentCV, SECTION_WIDGET_CLASS).setVariables(false, {$otherStructureIncident})
  }
  
  function refreshVariables ($otherStructureIncident :  OtherStructureIncident) : void {
    __widgetOf(this, pcf.OtherStructureIncidentCV, SECTION_WIDGET_CLASS).setVariables(true, {$otherStructureIncident})
  }
  
  
}