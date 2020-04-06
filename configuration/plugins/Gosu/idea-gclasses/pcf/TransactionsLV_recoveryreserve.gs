package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionsLV.recoveryreserve.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionsLV_recoveryreserve extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $TxnFilterOption :  gw.api.financials.ClaimFinancialsTransactionsOption) : void {
    __widgetOf(this, pcf.TransactionsLV_recoveryreserve, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $TxnFilterOption})
  }
  
  function refreshVariables ($Claim :  Claim, $TxnFilterOption :  gw.api.financials.ClaimFinancialsTransactionsOption) : void {
    __widgetOf(this, pcf.TransactionsLV_recoveryreserve, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $TxnFilterOption})
  }
  
  
}