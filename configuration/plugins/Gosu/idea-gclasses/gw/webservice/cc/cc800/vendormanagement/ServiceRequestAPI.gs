package gw.webservice.cc.cc800.vendormanagement
uses java.lang.IllegalArgumentException
uses gw.api.server.AvailabilityLevel
uses gw.xml.ws.annotation.WsiAvailability
uses gw.xml.ws.annotation.WsiWebService
uses java.lang.IllegalStateException
uses java.util.Date

/**
 * A webservice for getting information about and manipulating ServiceRequests from vendor systems.
 */
@Export
@WsiWebService("http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestAPI")
@WsiAvailability(AvailabilityLevel.MAINTENANCE)
class ServiceRequestAPI {

  construct() {}

  /*
   * Note: All methods in this webservice take a specialist ID argument, which is trusted as identifying
   *       the end user retrieving the information or initiating the action. The client system is expected to
   *       authenticate that party to confirm that the passed-in specialist ID belongs to them. The argument
   *       is required even for methods taking other arguments (such as the service request ID) that imply a
   *       specialist ID. This is so that the webservice can confirm that the requested information is available to
   *       that specialist, since the client will not normally be able to perform that accessibility check.
   */


  /**
   * Searches for service requests with a specific specialist and matching the criteria defined by
   * <code>searchCriteria</code>. Service request are returned in order of their last change date (descending).
   * The maximum number of results returned is controlled by the "ServiceRequestAPIMaxSearchResults" configuration
   * parameter. If the more service requests match the criteria, the results will be truncated and the
   * ResultsAreTruncated flag will be set on the result object.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call; only service requests
   *                      associated with this specialist will be returned
   * @param searchCriteria  criteria to restrict the service requests returned
   * @return  a list of matching service requests
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified")
  function searchForServiceRequests(specialistId : String, searchCriteria : ServiceRequestSearchCriteria) : ServiceRequestSearchResults {
    return ServiceRequestAPIUtil.searchForServiceRequests(specialistId, searchCriteria)
  }

  /**
   * Gets detailed information about the specified service request.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @return  an object providing detailed information about the specified service request
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialistId")
  function getServiceRequest(specialistId : String, serviceRequestNumber : String) : ServiceRequestDetails {
    return ServiceRequestAPIUtil.getServiceRequest(specialistId, serviceRequestNumber)
  }

  /**
   * Updates the ServiceRequestReferenceNumber for this service request. Unlike ServiceRequestNumber, which
   * is generated inside ClaimCenter and guaranteed to be unique, ServiceRequestReferenceNumber is not used
   * inside ClaimCenter but is expected to be meaningful to the specialist. It may be the ID of a related record
   * in a third-party system.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param newReferenceNumber  the new value of ServiceRequestReferenceNumber to set on the service request
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialistId")
  function updateServiceRequestReferenceNumber(specialistId : String, serviceRequestNumber : String, newReferenceNumber : String) {
    ServiceRequestAPIUtil.updateServiceRequestReferenceNumber(specialistId, serviceRequestNumber, newReferenceNumber)
  }

  /**
   * Gets the content for a document identified by publicid. This method may only be called with document
   * publicids listed in DocumentSummary objects returned from this API (such as in the ServiceRequestDetails.Documents
   * array returned by getServiceRequest(String,String)) and only where DocumentSummary.HasContent was true.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param documentPublicId  the publicid identifying the document
   * @return  an object containing the content of the document
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialistId, "
                                  + "or if a visible document matching the publicid is not found on the service request, "
                                  + "or if the document does not have content")
  function getDocumentContent(specialistId : String, serviceRequestNumber : String, documentPublicId : String) : DocumentWithContent {
    return ServiceRequestAPIUtil.getDocumentContent(specialistId, serviceRequestNumber, documentPublicId)
  }

  /**
   * Gets a list of all messages on active service requests associated with the specified specialist, ordered
   * by send date (descending).
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @return  a MessagesForSpecialistResult containing a list of messages ordered by send date (descending) and whether
   * they were truncated
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified")
  function getMessagesForSpecialist(specialistId : String) : MessagesForSpecialistResults {
    return ServiceRequestAPIUtil.getMessagesForSpecialist(specialistId)
  }

  /**
   * Adds a message to the service request. If the type of the message is 'question', then an activity
   * will be generated to notify the user assigned to the service request. The message's send date
   * will be set to today's date and its author will be set to the specialist.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param title  the title of the message to create
   * @param body  the body of the message to create
   * @param type  the type of message to create
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialistId")
  function sendMessage(specialistId : String,
                       serviceRequestNumber : String,
                       title : String,
                       body : String,
                       type : ServiceRequestMessageType) {
    ServiceRequestAPIUtil.sendMessage(specialistId, serviceRequestNumber, title, body, type)
  }

  /**
   * If there is no quote object on the service request, this adds the initial quote. If there is already a
   * quote object on the service request, it is replaced with this new quote object. In both cases, the new
   * quote becomes the active quote for the service request. The active quote object on a
   * service request represents the aggregate of all of the quote information related to the service request.
   * The quote must have at least one linked document.
   * This method requires that the 'Add Quote' operation is available.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param creationInstructions  an object specifying how the quote should be created
   * @return  the publicid of the created quote
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialist id, "
                                  + "or if Description or Amount are null, "
                                  + "or if a document identified by ExistingDocumentsToLinkPublicIds cannot be found on the service request, "
                                  + "or if ExistingDocumentsToLinkPublicIds and DocumentsToUpload are both empty, "
                                  + "or if DocumentsToUpload and DocumentsToUploadNames have different lengths, "
                                  + "or if DocumentsToUploadNames contains duplicate name, "
                                  + "or if NumberOfDaysToPerformService is a negative number")
  @Throws(IllegalStateException, "If the service request state does not currently allow this operation")
  function addOrReplaceQuote(specialistId : String,
                             serviceRequestNumber : String,
                             creationInstructions : StatementCreationInstructions) : String {
    return ServiceRequestAPIUtil.addOrReplaceQuote(specialistId, serviceRequestNumber, creationInstructions)
  }

  /**
   * Adds an invoice to the service request. The invoice must have at least one linked document.
   * This method requires that the 'Add Invoice' operation is available.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param creationInstructions  an object specifying how the invoice should be created
   * @return  the publicid of the created invoice; this value will be required to withdraw the invoice
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialist id, "
                                  + "or if Description or Amount are null, "
                                  + "or if a document identified by ExistingDocumentsToLinkPublicIds cannot be found on the service request, "
                                  + "or if ExistingDocumentsToLinkPublicIds and DocumentsToUpload are both empty, "
                                  + "or if DocumentsToUpload and DocumentsToUploadNames have different lengths, "
                                  + "or if DocumentsToUpload or DocumentsToUploadNames are missing elements, "
                                  + "or if DocumentsToUploadNames contains duplicate names")
  @Throws(IllegalStateException, "If the service request state does not currently allow this operation")
  function addInvoice(specialistId : String,
                      serviceRequestNumber : String,
                      creationInstructions : StatementCreationInstructions) : String {
    return ServiceRequestAPIUtil.addInvoice(specialistId, serviceRequestNumber, creationInstructions)
  }

  /**
   * Updates the expected quote completion date for the service request.
   * This method requires that the 'Update Quote ECD' operation is available.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param expectedCompletionDate new expected completion date to set on the service request 
   * @param changeReason  an optional reason for the date change; this reason will be recorded in the
   *                     service request history
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialistId")
  @Throws(IllegalStateException, "If the service request state does not currently allow this operation")
  function updateExpectedQuoteCompletionDate(specialistId : String, serviceRequestNumber : String, expectedCompletionDate: Date, changeReason: String) {
    ServiceRequestAPIUtil.updateExpectedCompletionDate(specialistId, serviceRequestNumber, expectedCompletionDate, false, changeReason)
  }

  /**
   * Updates the expected service completion date for the service request.
   * This method requires that the 'Update Service ECD' operation is available.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param expectedCompletionDate new expected completion date to set on the service request 
   * @param changeReason  an optional reason for the date change; this reason will be recorded in the
   *                      service request history
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialistId")
  @Throws(IllegalStateException, "If the service request state does not currently allow this operation")
  function updateExpectedServiceCompletionDate(specialistId : String, serviceRequestNumber : String, expectedCompletionDate: Date, changeReason: String) {
    ServiceRequestAPIUtil.updateExpectedCompletionDate(specialistId, serviceRequestNumber, expectedCompletionDate, true, changeReason)
  }

  /**
   * Adds a document to the service request.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param documentToUpload  the DocumentContent containing the contents of the document that
   *                          should be created and linked to the service request
   * @param documentToUploadName    the name that should be used for the document that is created; the name
   *                                provided here is not guaranteed to be the actual names used for the uploaded
   *                                file, since some deconfliction may occur between documents on the claim.
   * @return  the publicid of the created document
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialist id, "
                                  + "or if documentToUpload or documentsToUploadNames are missing content")
  function addDocument(specialistId : String,
                       serviceRequestNumber : String,
                       documentToUpload : DocumentContent,
                       documentToUploadName : String) : String {
    return ServiceRequestAPIUtil.addDocument(specialistId, serviceRequestNumber, documentToUpload, documentToUploadName)
  }

  /**
   * Records that the specialist has agreed to either provide a quote or perform the service,
   * depending on the kind of service request.
   * This method requires that the 'Specialist Accepted Work' operation is available.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param expectedCompletionDate  the date by which the specialist expects to complete either the quote
   *                                or the service, depending on the kind of service request
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialist id")
  @Throws(IllegalStateException, "If the service request state does not currently allow this operation")
  function acceptWork(specialistId : String,
                      serviceRequestNumber : String,
                      expectedCompletionDate : Date) {
    ServiceRequestAPIUtil.acceptWork(specialistId, serviceRequestNumber, expectedCompletionDate)
  }

  /**
   * Records that the specialist has declined this service request.
   * This method requires that the 'Specialist Declined' operation is available.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param reason  an optional reason for declining the service request
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialist id")
  @Throws(IllegalStateException, "If the service request state does not currently allow this operation")
  function declineWork(specialistId : String,
                       serviceRequestNumber : String,
                       reason : String) {
    ServiceRequestAPIUtil.declineWork(specialistId, serviceRequestNumber, reason)
  }

  /**
   * Records that the specialist has begun work on the service request. This is normally used when the
   * specialist was previously prevented from making progress but they are now able to proceed.
   * This method requires that the 'Specialist Resumed Work' operation is available.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialist id")
  @Throws(IllegalStateException, "If the service request state does not currently allow this operation")
  function recordWorkResumed(specialistId : String,
                             serviceRequestNumber : String) {
    ServiceRequestAPIUtil.recordWorkResumed(specialistId, serviceRequestNumber)
  }

  /**
   * Records that the specialist is unable to proceed with the work on the service request. This is normally
   * used when the work was in progress but is now blocked.
   * This method requires that the 'Specialist Waiting' operation is available.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param reason  an optional reason that the specialist is unable to proceed
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialist id")
  @Throws(IllegalStateException, "If the service request state does not currently allow this operation")
  function recordWaiting(specialistId : String,
                         serviceRequestNumber : String,
                         reason : String) {
    ServiceRequestAPIUtil.recordWaiting(specialistId, serviceRequestNumber, reason)
  }

  /**
   * Records that the specialist has completed work on the service request.
   * This method requires that the 'Specialist Completed Work' operation is available.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialist id")
  @Throws(IllegalStateException, "If the service request state does not currently allow this operation")
  function recordWorkCompleted(specialistId : String,
                               serviceRequestNumber : String) {
    ServiceRequestAPIUtil.recordWorkCompleted(specialistId, serviceRequestNumber)
  }

  /**
   * Records that the specialist does not intend to perform any further work on this service request. This operation
   * can normally be performed at any time after accepting the work but before completing the work.
   * This method requires that the 'Specialist Canceled' operation is available.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param reason  an optional reason for canceling the service request
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialist id")
  @Throws(IllegalStateException, "If the service request state does not currently allow this operation")
  function cancelServiceRequest(specialistId : String,
                                serviceRequestNumber : String,
                                reason : String) {
    ServiceRequestAPIUtil.cancelServiceRequest(specialistId, serviceRequestNumber, reason)
  }

  /**
   * Records that the specialist desires to withdraw this invoice. This operation
   * can normally be performed at any time before it is paid or rejected.
   * This method requires that the 'Withdraw Invoice' operation is available.
   * @param specialistId  the AddressBookUID identifying the specialist initiating the call
   * @param serviceRequestNumber  the ServiceRequestNumber identifying the service request; the service
   *                              request must be associated with the specialist identified by specialistId
   * @param invoicePublicID  a publicid identifying the invoice to withdraw; this should be a publicid
   *                         that was returned from addInvoice
   * @param reason  an optional reason for withdrawing the invoice
   */
  @Throws(IllegalArgumentException, "If a specialistId is not specified, "
                                  + "or if the service request is not found or does not match specialist id, "
                                  + "or if the invoice is not found")
  @Throws(IllegalStateException, "If the invoice state does not currently allow this operation, "
                               + "or if there are multiple invoices that matches the same invoice ID")
  function withdrawInvoice(specialistId : String,
                           serviceRequestNumber : String,
                           invoicePublicID : String,
                           reason: String) {
    ServiceRequestAPIUtil.withdrawInvoice(specialistId, serviceRequestNumber, invoicePublicID, reason)
  }
}
