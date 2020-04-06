package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/print/TransactionDetailPrintScreen.Payment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailPrintScreen_Payment extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionDetailPrintScreen_Payment, SECTION_WIDGET_CLASS).setVariables(false, {$Transaction})
  }
  
  function refreshVariables ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionDetailPrintScreen_Payment, SECTION_WIDGET_CLASS).setVariables(true, {$Transaction})
  }
  
  
}