package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewOnsetPaymentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($OriginalPayment :  Payment, $PaymentList :  java.util.ArrayList<Payment>) : void {
    __widgetOf(this, pcf.NewOnsetPaymentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$OriginalPayment, $PaymentList})
  }
  
  function refreshVariables ($OriginalPayment :  Payment, $PaymentList :  java.util.ArrayList<Payment>) : void {
    __widgetOf(this, pcf.NewOnsetPaymentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$OriginalPayment, $PaymentList})
  }
  
  
}