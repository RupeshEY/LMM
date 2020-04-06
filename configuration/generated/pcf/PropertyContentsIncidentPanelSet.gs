package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyContentsIncidentPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($incident :  PropertyContentsIncident) : void {
    __widgetOf(this, pcf.PropertyContentsIncidentPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$incident})
  }
  
  function refreshVariables ($incident :  PropertyContentsIncident) : void {
    __widgetOf(this, pcf.PropertyContentsIncidentPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$incident})
  }
  
  
}