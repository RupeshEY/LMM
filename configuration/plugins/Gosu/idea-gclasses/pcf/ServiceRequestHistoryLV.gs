package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestHistoryLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($serviceRequest :  ServiceRequest) : void {
    __widgetOf(this, pcf.ServiceRequestHistoryLV, SECTION_WIDGET_CLASS).setVariables(false, {$serviceRequest})
  }
  
  function refreshVariables ($serviceRequest :  ServiceRequest) : void {
    __widgetOf(this, pcf.ServiceRequestHistoryLV, SECTION_WIDGET_CLASS).setVariables(true, {$serviceRequest})
  }
  
  
}