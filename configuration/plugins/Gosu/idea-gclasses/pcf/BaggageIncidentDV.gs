package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BaggageIncidentDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aBaggageIncident :  BaggageIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.BaggageIncidentDV, SECTION_WIDGET_CLASS).setVariables(false, {$aBaggageIncident, $unusedServiceRequests})
  }
  
  function refreshVariables ($aBaggageIncident :  BaggageIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.BaggageIncidentDV, SECTION_WIDGET_CLASS).setVariables(true, {$aBaggageIncident, $unusedServiceRequests})
  }
  
  
}