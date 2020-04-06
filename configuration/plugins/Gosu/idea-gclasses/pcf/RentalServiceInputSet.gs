package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/RentalServiceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RentalServiceInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($rentalServiceRequest :  ServiceRequest, $vehicleIncident :  VehicleIncident, $unusedServices :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.RentalServiceInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$rentalServiceRequest, $vehicleIncident, $unusedServices})
  }
  
  function refreshVariables ($rentalServiceRequest :  ServiceRequest, $vehicleIncident :  VehicleIncident, $unusedServices :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.RentalServiceInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$rentalServiceRequest, $vehicleIncident, $unusedServices})
  }
  
  
}