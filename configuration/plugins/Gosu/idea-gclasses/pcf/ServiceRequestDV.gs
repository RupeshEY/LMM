package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($serviceRequest :  entity.ServiceRequest, $stateHandler :  gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler) : void {
    __widgetOf(this, pcf.ServiceRequestDV, SECTION_WIDGET_CLASS).setVariables(false, {$serviceRequest, $stateHandler})
  }
  
  function refreshVariables ($serviceRequest :  entity.ServiceRequest, $stateHandler :  gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler) : void {
    __widgetOf(this, pcf.ServiceRequestDV, SECTION_WIDGET_CLASS).setVariables(true, {$serviceRequest, $stateHandler})
  }
  
  
}