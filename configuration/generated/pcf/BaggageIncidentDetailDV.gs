package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/BaggageIncidentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BaggageIncidentDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aBaggageIncident :  BaggageIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.BaggageIncidentDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$aBaggageIncident, $unusedServiceRequests})
  }
  
  function refreshVariables ($aBaggageIncident :  BaggageIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.BaggageIncidentDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$aBaggageIncident, $unusedServiceRequests})
  }
  
  
}