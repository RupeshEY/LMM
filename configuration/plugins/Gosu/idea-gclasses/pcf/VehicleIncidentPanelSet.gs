package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/VehicleIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleIncidentPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($VehicleIncident :  VehicleIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>, $allIncidentOtherServices :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.VehicleIncidentPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$VehicleIncident, $unusedServiceRequests, $allIncidentOtherServices})
  }
  
  function refreshVariables ($VehicleIncident :  VehicleIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>, $allIncidentOtherServices :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.VehicleIncidentPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$VehicleIncident, $unusedServiceRequests, $allIncidentOtherServices})
  }
  
  
}