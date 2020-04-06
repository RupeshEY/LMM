package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($BulkInvoiceSearchCriteria :  BulkInvoiceSearchCriteria) : void {
    __widgetOf(this, pcf.BulkInvoiceSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$BulkInvoiceSearchCriteria})
  }
  
  function refreshVariables ($BulkInvoiceSearchCriteria :  BulkInvoiceSearchCriteria) : void {
    __widgetOf(this, pcf.BulkInvoiceSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$BulkInvoiceSearchCriteria})
  }
  
  
}