package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.recovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailToolbarButtonSet_recovery extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionDetailToolbarButtonSet_recovery, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Transaction})
  }
  
  function refreshVariables ($Claim :  Claim, $Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionDetailToolbarButtonSet_recovery, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Transaction})
  }
  
  
}