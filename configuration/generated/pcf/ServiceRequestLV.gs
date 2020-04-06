package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $filterServiceRequests :  boolean, $operationCallbackHelper :  gw.vendormanagement.ServiceRequestOperationCallbackHelper) : void {
    __widgetOf(this, pcf.ServiceRequestLV, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $filterServiceRequests, $operationCallbackHelper})
  }
  
  function refreshVariables ($claim :  Claim, $filterServiceRequests :  boolean, $operationCallbackHelper :  gw.vendormanagement.ServiceRequestOperationCallbackHelper) : void {
    __widgetOf(this, pcf.ServiceRequestLV, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $filterServiceRequests, $operationCallbackHelper})
  }
  
  
}