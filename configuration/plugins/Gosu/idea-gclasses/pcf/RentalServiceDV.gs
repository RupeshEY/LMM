package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/RentalServiceDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RentalServiceDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($rentalService :  ServiceRequest, $incident :  VehicleIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.RentalServiceDV, SECTION_WIDGET_CLASS).setVariables(false, {$rentalService, $incident, $unusedServiceRequests})
  }
  
  function refreshVariables ($rentalService :  ServiceRequest, $incident :  VehicleIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.RentalServiceDV, SECTION_WIDGET_CLASS).setVariables(true, {$rentalService, $incident, $unusedServiceRequests})
  }
  
  
}