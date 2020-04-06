package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/VehIncidentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VehIncidentDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($VehicleIncident :  VehicleIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.VehIncidentDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$VehicleIncident, $unusedServiceRequests})
  }
  
  function refreshVariables ($VehicleIncident :  VehicleIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.VehIncidentDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$VehicleIncident, $unusedServiceRequests})
  }
  
  
}