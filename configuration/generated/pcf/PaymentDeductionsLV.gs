package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentDeductionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentDeductionsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Check :  Check) : void {
    __widgetOf(this, pcf.PaymentDeductionsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Check})
  }
  
  function refreshVariables ($Check :  Check) : void {
    __widgetOf(this, pcf.PaymentDeductionsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Check})
  }
  
  
}