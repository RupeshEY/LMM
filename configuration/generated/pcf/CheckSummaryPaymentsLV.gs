package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckSummaryPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckSummaryPaymentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PaymentList :  Payment[]) : void {
    __widgetOf(this, pcf.CheckSummaryPaymentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$PaymentList})
  }
  
  function refreshVariables ($PaymentList :  Payment[]) : void {
    __widgetOf(this, pcf.CheckSummaryPaymentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$PaymentList})
  }
  
  
}