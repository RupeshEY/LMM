package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.reserve.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailToolbarButtonSet_reserve extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionDetailToolbarButtonSet_reserve, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $Transaction})
  }
  
  function refreshVariables ($claim :  Claim, $Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionDetailToolbarButtonSet_reserve, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $Transaction})
  }
  
  
}