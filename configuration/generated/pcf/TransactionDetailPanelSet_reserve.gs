package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailPanelSet.reserve.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailPanelSet_reserve extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionDetailPanelSet_reserve, SECTION_WIDGET_CLASS).setVariables(false, {$Transaction})
  }
  
  function refreshVariables ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionDetailPanelSet_reserve, SECTION_WIDGET_CLASS).setVariables(true, {$Transaction})
  }
  
  
}