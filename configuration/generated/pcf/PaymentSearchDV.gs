package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/checks/PaymentSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PaymentSearchCriteria :  PaymentSearchCriteria) : void {
    __widgetOf(this, pcf.PaymentSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$PaymentSearchCriteria})
  }
  
  function refreshVariables ($PaymentSearchCriteria :  PaymentSearchCriteria) : void {
    __widgetOf(this, pcf.PaymentSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$PaymentSearchCriteria})
  }
  
  
}