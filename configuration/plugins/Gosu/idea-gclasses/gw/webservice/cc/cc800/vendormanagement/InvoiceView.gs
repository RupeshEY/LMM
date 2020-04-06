package gw.webservice.cc.cc800.vendormanagement

uses gw.xml.ws.annotation.WsiExportable
uses java.math.BigDecimal

/**
 * Contains information about an invoice and its service request.
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/InvoiceView")
final class InvoiceView {

  /**
   * The service request reference information.
   */
  var _serviceRequestReference : ServiceRequestReference as ServiceRequestReference

  /**
   * The publicid of the invoice in ClaimCenter.
   */
  var _invoicePublicID : String as InvoicePublicID

  /**
   * The number assigned to the invoice by the specialist.
   */
  var _invoiceReferenceNumber : String as InvoiceReferenceNumber

  /**
   * The invoice amount.
   */
  var _invoiceAmount : BigDecimal as InvoiceAmount

  construct() {}

  construct(invoice : ServiceRequestInvoice) {
    ServiceRequestReference = new ServiceRequestReference(invoice.ServiceRequest)
    InvoicePublicID = invoice.PublicID
    InvoiceReferenceNumber = invoice.ReferenceNumber
    InvoiceAmount = invoice.Amount.Amount
  }
}