package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecodePaymentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RecodePaymentDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Payment :  Payment, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.RecodePaymentDV, SECTION_WIDGET_CLASS).setVariables(false, {$Payment, $reserveLineInputSetHelper})
  }
  
  function refreshVariables ($Payment :  Payment, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.RecodePaymentDV, SECTION_WIDGET_CLASS).setVariables(true, {$Payment, $reserveLineInputSetHelper})
  }
  
  
}