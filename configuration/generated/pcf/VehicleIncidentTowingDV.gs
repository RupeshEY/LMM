package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/VehicleIncidentTowingDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleIncidentTowingDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($towingServiceRequest :  ServiceRequest, $vehicleIncident :  VehicleIncident, $unusedServices :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.VehicleIncidentTowingDV, SECTION_WIDGET_CLASS).setVariables(false, {$towingServiceRequest, $vehicleIncident, $unusedServices})
  }
  
  function refreshVariables ($towingServiceRequest :  ServiceRequest, $vehicleIncident :  VehicleIncident, $unusedServices :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.VehicleIncidentTowingDV, SECTION_WIDGET_CLASS).setVariables(true, {$towingServiceRequest, $vehicleIncident, $unusedServices})
  }
  
  
}