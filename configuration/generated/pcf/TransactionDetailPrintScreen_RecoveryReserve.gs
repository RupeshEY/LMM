package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/print/TransactionDetailPrintScreen.RecoveryReserve.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailPrintScreen_RecoveryReserve extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionDetailPrintScreen_RecoveryReserve, SECTION_WIDGET_CLASS).setVariables(false, {$Transaction})
  }
  
  function refreshVariables ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionDetailPrintScreen_RecoveryReserve, SECTION_WIDGET_CLASS).setVariables(true, {$Transaction})
  }
  
  
}