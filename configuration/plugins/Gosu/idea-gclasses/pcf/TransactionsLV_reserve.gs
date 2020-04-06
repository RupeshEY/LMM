package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionsLV.reserve.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionsLV_reserve extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $TxnFilterOption :  gw.api.financials.ClaimFinancialsTransactionsOption) : void {
    __widgetOf(this, pcf.TransactionsLV_reserve, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $TxnFilterOption})
  }
  
  function refreshVariables ($Claim :  Claim, $TxnFilterOption :  gw.api.financials.ClaimFinancialsTransactionsOption) : void {
    __widgetOf(this, pcf.TransactionsLV_reserve, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $TxnFilterOption})
  }
  
  
}