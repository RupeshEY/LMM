package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityBulkInvoiceWarningInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityBulkInvoiceWarningInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($BulkInvoice :  BulkInvoice) : void {
    __widgetOf(this, pcf.ActivityBulkInvoiceWarningInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$BulkInvoice})
  }
  
  function refreshVariables ($BulkInvoice :  BulkInvoice) : void {
    __widgetOf(this, pcf.ActivityBulkInvoiceWarningInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$BulkInvoice})
  }
  
  
}