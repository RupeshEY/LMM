package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/TransactionExchangeRateInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionExchangeRateInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionExchangeRateInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$transaction})
  }
  
  function refreshVariables ($transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionExchangeRateInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$transaction})
  }
  
  
}