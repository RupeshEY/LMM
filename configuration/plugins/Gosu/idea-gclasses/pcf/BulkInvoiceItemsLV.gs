package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceItemsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($bulkInvoice :  BulkInvoice, $helper :  gw.api.financials.BulkPayHelper) : void {
    __widgetOf(this, pcf.BulkInvoiceItemsLV, SECTION_WIDGET_CLASS).setVariables(false, {$bulkInvoice, $helper})
  }
  
  function refreshVariables ($bulkInvoice :  BulkInvoice, $helper :  gw.api.financials.BulkPayHelper) : void {
    __widgetOf(this, pcf.BulkInvoiceItemsLV, SECTION_WIDGET_CLASS).setVariables(true, {$bulkInvoice, $helper})
  }
  
  
}