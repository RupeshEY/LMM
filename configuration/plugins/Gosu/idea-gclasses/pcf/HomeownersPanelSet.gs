package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/HomeownersPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class HomeownersPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $incident :  PropertyIncident, $incomingOtherServiceRequests :  java.util.Set<ServiceRequest>, $unusedServiceRequests :  java.util.Set<entity.ServiceRequest>) : void {
    __widgetOf(this, pcf.HomeownersPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $incident, $incomingOtherServiceRequests, $unusedServiceRequests})
  }
  
  function refreshVariables ($claim :  Claim, $incident :  PropertyIncident, $incomingOtherServiceRequests :  java.util.Set<ServiceRequest>, $unusedServiceRequests :  java.util.Set<entity.ServiceRequest>) : void {
    __widgetOf(this, pcf.HomeownersPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $incident, $incomingOtherServiceRequests, $unusedServiceRequests})
  }
  
  
}