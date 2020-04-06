package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/DwellingIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DwellingIncidentPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($dwellingIncident :  DwellingIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.DwellingIncidentPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$dwellingIncident, $unusedServiceRequests})
  }
  
  function refreshVariables ($dwellingIncident :  DwellingIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.DwellingIncidentPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$dwellingIncident, $unusedServiceRequests})
  }
  
  
}