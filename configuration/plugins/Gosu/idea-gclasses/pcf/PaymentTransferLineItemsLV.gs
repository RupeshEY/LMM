package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentTransferLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentTransferLineItemsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.PaymentTransferLineItemsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Transaction})
  }
  
  function refreshVariables ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.PaymentTransferLineItemsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Transaction})
  }
  
  
}