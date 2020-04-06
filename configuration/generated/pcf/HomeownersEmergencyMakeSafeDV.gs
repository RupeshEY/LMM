package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/HomeownersEmergencyMakeSafeDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class HomeownersEmergencyMakeSafeDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($emsService :  ServiceRequest, $claim :  Claim, $incident :  PropertyIncident, $unusedServiceRequests :  java.util.Set<entity.ServiceRequest>) : void {
    __widgetOf(this, pcf.HomeownersEmergencyMakeSafeDV, SECTION_WIDGET_CLASS).setVariables(false, {$emsService, $claim, $incident, $unusedServiceRequests})
  }
  
  function refreshVariables ($emsService :  ServiceRequest, $claim :  Claim, $incident :  PropertyIncident, $unusedServiceRequests :  java.util.Set<entity.ServiceRequest>) : void {
    __widgetOf(this, pcf.HomeownersEmergencyMakeSafeDV, SECTION_WIDGET_CLASS).setVariables(true, {$emsService, $claim, $incident, $unusedServiceRequests})
  }
  
  
}