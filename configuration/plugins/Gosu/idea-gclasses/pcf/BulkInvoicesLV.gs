package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoicesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($bulkInvoices :  gw.api.database.IQueryBeanResult<BulkInvoice>) : void {
    __widgetOf(this, pcf.BulkInvoicesLV, SECTION_WIDGET_CLASS).setVariables(false, {$bulkInvoices})
  }
  
  function refreshVariables ($bulkInvoices :  gw.api.database.IQueryBeanResult<BulkInvoice>) : void {
    __widgetOf(this, pcf.BulkInvoicesLV, SECTION_WIDGET_CLASS).setVariables(true, {$bulkInvoices})
  }
  
  
}