package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDV.invoice.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class StatementDV_invoice extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($currentInvoice :  ServiceRequestStatement, $previousTotal :  gw.api.financials.CurrencyAmount, $readOnly :  boolean) : void {
    __widgetOf(this, pcf.StatementDV_invoice, SECTION_WIDGET_CLASS).setVariables(false, {$currentInvoice, $previousTotal, $readOnly})
  }
  
  function refreshVariables ($currentInvoice :  ServiceRequestStatement, $previousTotal :  gw.api.financials.CurrencyAmount, $readOnly :  boolean) : void {
    __widgetOf(this, pcf.StatementDV_invoice, SECTION_WIDGET_CLASS).setVariables(true, {$currentInvoice, $previousTotal, $readOnly})
  }
  
  
}