package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentMethodInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentMethodInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($owner :  entity.BulkInvoice, $helper :  gw.api.financials.PaymentMethodHelper, $isPayeeChangeable :  boolean, $showAddressFields :  org.apache.commons.lang3.mutable.MutableBoolean) : void {
    __widgetOf(this, pcf.PaymentMethodInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$owner, $helper, $isPayeeChangeable, $showAddressFields})
  }
  
  function refreshVariables ($owner :  entity.BulkInvoice, $helper :  gw.api.financials.PaymentMethodHelper, $isPayeeChangeable :  boolean, $showAddressFields :  org.apache.commons.lang3.mutable.MutableBoolean) : void {
    __widgetOf(this, pcf.PaymentMethodInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$owner, $helper, $isPayeeChangeable, $showAddressFields})
  }
  
  
}