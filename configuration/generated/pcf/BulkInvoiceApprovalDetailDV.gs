package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceApprovalDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($activity :  Activity, $helper :  gw.api.financials.BulkPayHelper) : void {
    __widgetOf(this, pcf.BulkInvoiceApprovalDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$activity, $helper})
  }
  
  function refreshVariables ($activity :  Activity, $helper :  gw.api.financials.BulkPayHelper) : void {
    __widgetOf(this, pcf.BulkInvoiceApprovalDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$activity, $helper})
  }
  
  
}