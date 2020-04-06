package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceSearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($BulkInvoiceSearchViewList :  gw.api.database.IQueryBeanResult<BulkInvoiceSearchView>, $criteria :  BulkInvoiceSearchCriteria) : void {
    __widgetOf(this, pcf.BulkInvoiceSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$BulkInvoiceSearchViewList, $criteria})
  }
  
  function refreshVariables ($BulkInvoiceSearchViewList :  gw.api.database.IQueryBeanResult<BulkInvoiceSearchView>, $criteria :  BulkInvoiceSearchCriteria) : void {
    __widgetOf(this, pcf.BulkInvoiceSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$BulkInvoiceSearchViewList, $criteria})
  }
  
  
}