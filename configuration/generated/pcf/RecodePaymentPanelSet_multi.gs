package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/RecodePaymentPanelSet.multi.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RecodePaymentPanelSet_multi extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($OriginalPayment :  Payment, $OnsetPayments :  java.util.ArrayList<Payment>, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.RecodePaymentPanelSet_multi, SECTION_WIDGET_CLASS).setVariables(false, {$OriginalPayment, $OnsetPayments, $reserveLineInputSetHelper})
  }
  
  function refreshVariables ($OriginalPayment :  Payment, $OnsetPayments :  java.util.ArrayList<Payment>, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.RecodePaymentPanelSet_multi, SECTION_WIDGET_CLASS).setVariables(true, {$OriginalPayment, $OnsetPayments, $reserveLineInputSetHelper})
  }
  
  
}