package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/FixPropIncidentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropIncidentDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($FixedPropertyIncident :  FixedPropertyIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.FixPropIncidentDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$FixedPropertyIncident, $unusedServiceRequests})
  }
  
  function refreshVariables ($FixedPropertyIncident :  FixedPropertyIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.FixPropIncidentDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$FixedPropertyIncident, $unusedServiceRequests})
  }
  
  
}