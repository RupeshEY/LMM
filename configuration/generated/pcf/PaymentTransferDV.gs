package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentTransferDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentTransferDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Payment :  Payment, $Transaction :  Transaction, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.PaymentTransferDV, SECTION_WIDGET_CLASS).setVariables(false, {$Payment, $Transaction, $reserveLineInputSetHelper})
  }
  
  function refreshVariables ($Payment :  Payment, $Transaction :  Transaction, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.PaymentTransferDV, SECTION_WIDGET_CLASS).setVariables(true, {$Payment, $Transaction, $reserveLineInputSetHelper})
  }
  
  
}