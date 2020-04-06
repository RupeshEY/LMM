package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/TransactionEditWrapperExchangeRateInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionEditWrapperExchangeRateInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($transactionEditWrapper :  TransactionEditWrapper) : void {
    __widgetOf(this, pcf.TransactionEditWrapperExchangeRateInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$transactionEditWrapper})
  }
  
  function refreshVariables ($transactionEditWrapper :  TransactionEditWrapper) : void {
    __widgetOf(this, pcf.TransactionEditWrapperExchangeRateInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$transactionEditWrapper})
  }
  
  
}