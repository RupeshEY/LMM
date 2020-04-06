package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/checks/PaymentSearchOptionalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentSearchOptionalInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PaymentSearchCriteria :  PaymentSearchCriteria) : void {
    __widgetOf(this, pcf.PaymentSearchOptionalInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$PaymentSearchCriteria})
  }
  
  function refreshVariables ($PaymentSearchCriteria :  PaymentSearchCriteria) : void {
    __widgetOf(this, pcf.PaymentSearchOptionalInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$PaymentSearchCriteria})
  }
  
  
}