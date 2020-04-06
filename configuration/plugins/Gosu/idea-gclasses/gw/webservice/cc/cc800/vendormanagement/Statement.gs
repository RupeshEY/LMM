package gw.webservice.cc.cc800.vendormanagement
uses gw.xml.ws.annotation.WsiExportable
uses java.math.BigDecimal
uses java.util.Date
uses com.google.common.cache.LoadingCache
uses java.util.List

/**
 * Represents either a quote or an invoice. An instance of this class itself does not explicitly
 * indicate whether it is a quote or an invoice; referers are expected to know which it is.
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/Statement")
final class Statement {

  /**
   * The publicid of this statement in ClaimCenter. Required working the statement using
   * ServiceRequestAPI, such as when withdrawing an invoice.
   */
  var _publicID : String as PublicID

  /**
   * A number assigned to this quote or invoice by the specialist, usually when the quote
   * or invoice was created. This number is not used inside ClaimCenter but is expected to be
   * meaningful to the specialist. It may be the ID of a related record in a third-party system.
   */
  var _referenceNumber : String as ReferenceNumber

  /**
   * The date this quote or invoice was created.
   */
  var _creationDate : Date as CreationDate

  /**
   * The amount of the quote or invoice. In the case of quotes, this covers all work to be done
   * for the service request. This amount is in the currency of the service request.
   */
  var _totalAmount : BigDecimal as TotalAmount

  /**
   * Descriptive information about the quote or invoice.
   */
  var _description : String as Description

  /**
   * A list of documents related to this quote or invoice. All documents here are also linked to the
   * service request.
   */
  var _documents : List<DocumentSummary> as Documents

  /**
   * If the statement has been declined (request requote/rejected invoice)
   */
  var _declinedReason : String as DeclinedReason

  /**
   * For invoices, the current status of the invoice. Null for quotes.
   */
  var _invoiceStatus : ServiceRequestInvoiceStatus as InvoiceStatus

  /**
   * For invoices, the name of the InvoiceStatus in the current locale.
   */
  var _invoiceStatusName : String as InvoiceStatusName

  /**
   * For invoices, indicates whether it can be withdrawn. Null for quotes.
   */
  var _invoiceWithdrawable : boolean as InvoiceWithdrawable

  /**
   * For invoices that have been paid, contains the payment date.
   */
  var _invoicePaymentDate : Date as InvoicePaymentDate

  /**
   * For invoices that have been paid, contains the check information.
   */
  var _invoiceCheck : gw.webservice.cc.cc800.vendormanagement.Check as InvoiceCheck

  construct() {}

  construct(quote : ServiceRequestQuote, documentCache : LoadingCache<ServiceRequestDocumentLink,Document>) {
    initializeStatement(quote, documentCache)
  }
  
  construct(invoice : ServiceRequestInvoice, documentCache : LoadingCache<ServiceRequestDocumentLink,Document>) {
    initializeStatement(invoice,documentCache)
    InvoiceStatus = invoice.Status
    InvoiceStatusName = InvoiceStatus.DisplayName
    InvoiceWithdrawable = invoice.operationAvailable(TC_WITHDRAWINVOICE)
    InvoicePaymentDate = invoice.PaymentDate
    if (invoice.Check != null) {
      InvoiceCheck = new gw.webservice.cc.cc800.vendormanagement.Check(invoice.Check)
    }
  }

  private function initializeStatement(statement : ServiceRequestStatement, documentCache : LoadingCache<ServiceRequestDocumentLink,Document>){
    PublicID = statement.PublicID
    ReferenceNumber = statement.ReferenceNumber
    CreationDate = statement.StatementCreationTime
    TotalAmount = statement.Amount.Amount
    Description = statement.Description
    Documents = statement.StatementDocumentLinks*.ServiceRequestDocumentLink.map(\ di -> new DocumentSummary(documentCache.get(di))).toList()
    DeclinedReason = statement.DeclinedReason
  }
}
