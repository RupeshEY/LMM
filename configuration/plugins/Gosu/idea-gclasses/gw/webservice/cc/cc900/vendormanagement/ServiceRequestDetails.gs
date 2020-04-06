package gw.webservice.cc.cc900.vendormanagement

uses com.google.common.cache.CacheBuilder
uses com.google.common.cache.CacheLoader
uses com.google.common.cache.LoadingCache
uses gw.xml.ws.annotation.WsiExportable

uses java.lang.IllegalArgumentException
uses java.math.BigDecimal
uses java.util.Date
uses java.util.List

/**
 * Contains detailed information about a service request.
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestDetails")
final class ServiceRequestDetails {

  /**
   * A reference to an object containing summary information about this service request. Information available
   * in ServiceRequestSummary is not repeated here in ServiceRequestDetails.
   */
  var _serviceRequestSummary : ServiceRequestSummary as ServiceRequestSummary

  /**
   * Text instructions describing what the specialist is being asked to do.
   */
  var _instructionText : String as InstructionText

  /**
   * The location at which the service is to be performed; may be null if the location is implied by the
   * specialist, such as if it will be performed at the specialist's place of business.
   */
  var _serviceAddress : String as ServiceAddress

  /**
   * A quote object representing the aggregate of all of the quote information related to the service request.
   */
  var _quote : Statement as Quote

  /**
   * A list of all invoices related to this service request.
   */
  var _invoices : List<Statement> as Invoices

  /**
   * The total of all invoices on this service request with status 'paid'.
   */
  var _invoicesTotalPaid : BigDecimal as InvoicesTotalPaid

  /**
   * The total of all invoices on this service request with status 'approved'.
   */
  var _invoicesTotalUnpaid : BigDecimal as InvoicesTotalUnpaid

  /**
   * The loss date from the claim.
   */
  var _claimLossDate : Date as ClaimLossDate

  /**
   * The date the service request Progress value first reached 'instructed'.
   */
  var _instructedDate : Date as InstructedDate

  /**
   * The date that this service request was terminated, if it is in a terminal state (for example,
   * canceled or expired). Null if the service request is not in a terminal state.
   */
  var _terminationDate : Date as TerminationDate

  /**
   * A list of documents related to this service request. This list includes all documents
   * linked to quotes or invoices on the service request.
   */
  var _documents : List<DocumentSummary> as Documents

  /**
   * A list of contacts related to this service request.
   */
  var _contacts : List<ContactSummary> as Contacts

  /**
  * The details of the Customer Contact
  */
  var _customerContactDetail : ContactDetail as CustomerContactDetail

  /**
   * The details of the Adjuster
  */
  var _adjusterDetail : ContactDetail as AdjusterDetail

  /**
   * A list of messages on this service request, ordered by send date (descending).
   * Note that this list includes messages sent both by the specialist and by the person
   * handling the claim at the carrier. This list of messages does not have a reference back to the
   * service request
   */
  var _messages : List<gw.webservice.cc.cc900.vendormanagement.Message> as Messages

  var _canceledReason: String as CanceledReason


  construct() {}

  construct(serviceRequest : ServiceRequest) {
    ServiceRequestSummary = new ServiceRequestSummary(serviceRequest)

    InstructionText = serviceRequest.Instruction.InstructionText
    ServiceAddress = serviceRequest.Instruction.ServiceAddress.DisplayName

    var documentCache = newDocumentLinkToDocumentCache()

    if (serviceRequest.LatestQuote != null) {
      Quote = new Statement(serviceRequest.LatestQuote, documentCache)
    }
    
    Invoices = serviceRequest.Invoices.map(\ i -> new Statement(i, documentCache)).toList()
    InvoicesTotalPaid = serviceRequest.ActiveChecksAmount
    InvoicesTotalUnpaid = serviceRequest.OutstandingInvoicesAmount

    ClaimLossDate = serviceRequest.Claim.LossDate
    var orderedHistory = serviceRequest.OrderedHistory

    // find the last change where it became instructed
    var orderedHistoryIterator = orderedHistory.listIterator(orderedHistory.Count)
    while (orderedHistoryIterator.hasPrevious()  and  InstructedDate == null) {
      var change = orderedHistoryIterator.previous()
      if (change.New_Progress==ServiceRequestProgress.TC_REQUESTED) {
        InstructedDate = change.Timestamp
      }
    }

    // find the first change where it entered a terminal progress that falls after the last
    // non-terminal progress; the timestamp of that change (if found) is considered the termination
    // date of the service request
    orderedHistoryIterator = orderedHistory.listIterator(orderedHistory.Count)
    while (orderedHistoryIterator.hasPrevious()) {
      var change = orderedHistoryIterator.previous()
      if (change.Progress_Chg) {
        if (entity.ServiceRequest.TerminalProgressValues.contains(change.New_Progress)) {
          TerminationDate = change.Timestamp
        } else {
          break
        }
      }
    }

    Documents = serviceRequest.DocumentLinks.where(\ di -> di.VisibleToSpecialist).map(\ di -> new DocumentSummary(documentCache.get(di))).toList()
    Contacts = {_serviceRequestSummary.CustomerContact, _serviceRequestSummary.Adjuster}
    CustomerContactDetail = new ContactDetail(serviceRequest.Instruction.CustomerContact)
    AdjusterDetail = new ContactDetail(serviceRequest.AssignedUser.Contact)
    Messages = serviceRequest.Messages.sortByDescending(\ message -> message.SendDate ).map(\ message -> new gw.webservice.cc.cc900.vendormanagement.Message(message)).toList()
    CanceledReason = serviceRequest.CanceledReason
  }

  /**
   * Evaluating ServiceRequestDocumentLink.LinkedDocument can call the DMS, which can be expensive. This method
   * creates and returns a cache to be used to store (for short periods, to avoid stale documents) instances
   * of Document for given ServiceRequestDocumentLinks in order to minimize the number of calls to LinkedDocument.
   */
  private static function newDocumentLinkToDocumentCache() : LoadingCache<ServiceRequestDocumentLink,Document> {
    return CacheBuilder.newBuilder()
          .build<ServiceRequestDocumentLink,Document>(
              new CacheLoader<ServiceRequestDocumentLink,Document>() {
                override function load(di : ServiceRequestDocumentLink) : Document {
                  var result = di.LinkedDocument
                  if (result == null) {
                    throw new IllegalArgumentException("the current user does not have permission to view the document or no linked document was found")
                  }
                  return result
                }
              })
  }
}
