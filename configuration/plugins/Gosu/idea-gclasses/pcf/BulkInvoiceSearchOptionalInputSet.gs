package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearchOptionalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceSearchOptionalInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($BulkInvoiceSearchCriteria :  BulkInvoiceSearchCriteria) : void {
    __widgetOf(this, pcf.BulkInvoiceSearchOptionalInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$BulkInvoiceSearchCriteria})
  }
  
  function refreshVariables ($BulkInvoiceSearchCriteria :  BulkInvoiceSearchCriteria) : void {
    __widgetOf(this, pcf.BulkInvoiceSearchOptionalInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$BulkInvoiceSearchCriteria})
  }
  
  
}