package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/VehicleIncidentAutoBodyDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleIncidentAutoBodyDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($repairServiceRequest :  ServiceRequest, $vehicleIncident :  VehicleIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.VehicleIncidentAutoBodyDV, SECTION_WIDGET_CLASS).setVariables(false, {$repairServiceRequest, $vehicleIncident, $unusedServiceRequests})
  }
  
  function refreshVariables ($repairServiceRequest :  ServiceRequest, $vehicleIncident :  VehicleIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.VehicleIncidentAutoBodyDV, SECTION_WIDGET_CLASS).setVariables(true, {$repairServiceRequest, $vehicleIncident, $unusedServiceRequests})
  }
  
  
}