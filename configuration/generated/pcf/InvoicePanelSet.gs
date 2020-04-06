package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class InvoicePanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($selectedInvoice :  ServiceRequestInvoice, $stateHandler :  gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler, $callbackHelper :  gw.vendormanagement.ServiceRequestOperationCallbackHelper) : void {
    __widgetOf(this, pcf.InvoicePanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$selectedInvoice, $stateHandler, $callbackHelper})
  }
  
  function refreshVariables ($selectedInvoice :  ServiceRequestInvoice, $stateHandler :  gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler, $callbackHelper :  gw.vendormanagement.ServiceRequestOperationCallbackHelper) : void {
    __widgetOf(this, pcf.InvoicePanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$selectedInvoice, $stateHandler, $callbackHelper})
  }
  
  
}