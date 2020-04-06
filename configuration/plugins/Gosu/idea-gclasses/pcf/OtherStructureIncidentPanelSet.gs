package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/OtherStructureIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherStructureIncidentPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($incident :  OtherStructureIncident) : void {
    __widgetOf(this, pcf.OtherStructureIncidentPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$incident})
  }
  
  function refreshVariables ($incident :  OtherStructureIncident) : void {
    __widgetOf(this, pcf.OtherStructureIncidentPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$incident})
  }
  
  
}