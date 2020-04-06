package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/PaymentBasicsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentBasicsInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Payment :  Payment) : void {
    __widgetOf(this, pcf.PaymentBasicsInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$Payment})
  }
  
  function refreshVariables ($Payment :  Payment) : void {
    __widgetOf(this, pcf.PaymentBasicsInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$Payment})
  }
  
  
}