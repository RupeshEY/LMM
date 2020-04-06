package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/FixedPropertyIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FixedPropertyIncidentDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($FixedPropertyIncident :  FixedPropertyIncident, $singletonNewFixedProperty :  PolicyLocation, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.FixedPropertyIncidentDV, SECTION_WIDGET_CLASS).setVariables(false, {$FixedPropertyIncident, $singletonNewFixedProperty, $unusedServiceRequests})
  }
  
  function refreshVariables ($FixedPropertyIncident :  FixedPropertyIncident, $singletonNewFixedProperty :  PolicyLocation, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.FixedPropertyIncidentDV, SECTION_WIDGET_CLASS).setVariables(true, {$FixedPropertyIncident, $singletonNewFixedProperty, $unusedServiceRequests})
  }
  
  
}