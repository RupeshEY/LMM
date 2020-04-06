package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($bulkInvoice :  BulkInvoice, $payeeLinkStatus :  gw.api.contact.ContactSystemLinkStatus, $paymentMethodHelper :  gw.api.financials.PaymentMethodHelper, $showMailingAddressFields :  org.apache.commons.lang3.mutable.MutableBoolean) : void {
    __widgetOf(this, pcf.BulkInvoiceDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$bulkInvoice, $payeeLinkStatus, $paymentMethodHelper, $showMailingAddressFields})
  }
  
  function refreshVariables ($bulkInvoice :  BulkInvoice, $payeeLinkStatus :  gw.api.contact.ContactSystemLinkStatus, $paymentMethodHelper :  gw.api.financials.PaymentMethodHelper, $showMailingAddressFields :  org.apache.commons.lang3.mutable.MutableBoolean) : void {
    __widgetOf(this, pcf.BulkInvoiceDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$bulkInvoice, $payeeLinkStatus, $paymentMethodHelper, $showMailingAddressFields})
  }
  
  
}