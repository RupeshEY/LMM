package gw.webservice.cc.cc900.vendormanagement

uses gw.api.contact.ContactSystemUtil
uses gw.api.database.IQueryBuilder
uses gw.api.database.Query
uses gw.api.database.QuerySelectColumns
uses gw.api.path.Paths
uses gw.api.system.CCConfigParameters
uses gw.document.DocumentsUtil
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSource
uses gw.transaction.Transaction
uses gw.vendormanagement.ServiceRequestActivityPattern
uses gw.vendormanagement.servicerequeststate.ServiceRequestInvoiceOperationDefinition
uses gw.vendormanagement.servicerequeststate.ServiceRequestOperationDefinition

uses java.io.ByteArrayInputStream
uses java.lang.IllegalArgumentException
uses java.lang.IllegalStateException
uses java.util.ArrayList
uses java.util.Date
uses java.util.HashMap
uses gw.pl.persistence.core.Bundle
uses java.util.List

/**
 * This is the helper class for {@link ServiceRequestAPI}, which you should consult for documentation.
 */
@Export
internal class ServiceRequestAPIUtil {
  public static final var INSTANCE: ServiceRequestAPIUtil = new ServiceRequestAPIUtil()

  protected construct() {}

  function searchForServiceRequests(specialistId: String, searchCriteria: ServiceRequestSearchCriteria): ServiceRequestSearchResults {
    validateSpecialistId(specialistId)

    var q = Query.make(ServiceRequest)
    q.join(ServiceRequest#Specialist).compare(Contact#AddressBookUID, Equals, specialistId)

    addVisibilityRestriction(q)

    if (searchCriteria.ClaimNumber.HasContent) {
      q.join(ServiceRequest#Claim)
       .compare(Claim#ClaimNumber, Equals, searchCriteria.ClaimNumber)
    }
    if (searchCriteria.ServiceRequestReferenceNumber.HasContent) {
      q.compare(ServiceRequest#ServiceRequestReferenceNumber, Equals, searchCriteria.ServiceRequestReferenceNumber)
    }

    if (searchCriteria.OnlyActive) {
      addActiveRestriction(q)
    }
    if (searchCriteria.OnlyInactive) {
      q.compareIn(ServiceRequest#Progress, ServiceRequest.TerminalProgressValues?.toTypedArray())
    }
    if (searchCriteria.OnlyWaiting) {
      q.or(\ restriction -> {
        restriction.compare(ServiceRequest#Progress, Equals, ServiceRequestProgress.TC_SPECIALISTWAITING)
        restriction.and(\ restriction2 -> {
          restriction2.compare(ServiceRequest#Progress, Equals, ServiceRequestProgress.TC_WORKCOMPLETE)
          addHasUnpaidInvoiceRestriction(restriction2)
        })
      })
    }
    if (searchCriteria.OnlyOverdue) {
      // service requests in terminal states are never considered overdue; this simple criterion is used
      // to limit the results of the query, and then a proper check for overdueness will be performed on the beans
      q.compareNotIn(ServiceRequest#Progress, ServiceRequest.TerminalProgressValues?.toTypedArray())
      q.or(\ restriction -> {
        restriction.compare(ServiceRequest#ExpectedQuoteCompletionDate, LessThan, Date.CurrentDate)
        restriction.compare(ServiceRequest#ExpectedServiceCompletionDate, LessThan, Date.CurrentDate)
      })
    }
    if (searchCriteria.OnlyWaitingForQuote) {
      q.compare(ServiceRequest#QuoteStatus, Equals, ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE)
    }
    if (searchCriteria.OnlyCanceledAndDeclined) {
      q.compareIn(ServiceRequest#Progress, {ServiceRequestProgress.TC_CANCELED, ServiceRequestProgress.TC_DECLINED})
    }
    if (searchCriteria.OnlyUnpaidInvoices) {
      // service request is either in a non-terminal Progress or is in WORKCOMPLETE
      q.or(\ restriction -> {
        restriction.compareNotIn(ServiceRequest#Progress, ServiceRequest.TerminalProgressValues?.toTypedArray())
        restriction.compare(ServiceRequest#Progress, Equals, ServiceRequestProgress.TC_WORKCOMPLETE)
      })
      addHasUnpaidInvoiceRestriction(q)
    }
    if (searchCriteria.OnlyCompleteWaitingForInvoice) {
      q.compare(ServiceRequest#Progress, Equals, ServiceRequestProgress.TC_WORKCOMPLETE)
      var restriction2 = q.subselect(ServiceRequest#ID, CompareNotIn, ServiceRequestStatement#ServiceRequest)
      restriction2.cast(ServiceRequestInvoice).compareIn(ServiceRequestInvoice#Status, {ServiceRequestInvoiceStatus.TC_APPROVED, ServiceRequestInvoiceStatus.TC_CHECKCREATED, ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL})
    }
    var recentlyCanceledLimitDate: Date = null
    if (searchCriteria.OnlyRecentlyCanceled) {
      if (searchCriteria.CanceledWithinDays == null  or  searchCriteria.CanceledWithinDays < 0) {
        throw new IllegalArgumentException("When OnlyRecentlyCanceled is used, CanceledWithinDays must be specified as a positive number of days within which to search")
      }
      // a recently-canceled service request must have a latest change timestamp within the day limit and must still be canceled;
      // this simple criterion is used to limit the results of the query, and then a proper check for recent cancelation will be
      // performed on the beans
      recentlyCanceledLimitDate = Date.Today.addDays(- searchCriteria.CanceledWithinDays)
      q.compare(ServiceRequest#Progress, Equals, ServiceRequestProgress.TC_CANCELED)
      q.compare(ServiceRequest#LatestChangeTimestampDenorm, GreaterThanOrEquals, recentlyCanceledLimitDate)
    }

    // Perform Query
    var results = new ArrayList<ServiceRequestSummary>(20)
    var resultsTruncated = false
    var queryBeanResults = q.select().orderByDescending(QuerySelectColumns.path(Paths.make(ServiceRequest#LatestChangeTimestampDenorm)))
    queryBeanResults.setPageSize(100)
    for (sr in queryBeanResults) {
      var stateHandler = sr.createStateHandler()

      // for the following search criteria flags, an initial, simplified restriction was applied on the
      // query to limit the results to a reasonable number of candidates, and then we complete the restriction
      // here using with further filtering on the returned beans
      if (searchCriteria.OnlyOverdue  and
        not sr.isOverdue(stateHandler)) {
        continue
      }
      if (searchCriteria.OnlyRecentlyCanceled  and
        // the query will have already checked that the service request is canceled; now just walk backwards to find when
        // it became canceled
        sr.OrderedHistory.lastWhere(\ src -> src.Progress_Chg).Timestamp < recentlyCanceledLimitDate) {
        continue
      }

      if (searchCriteria.OnlyActive or searchCriteria.OnlyCompleteWaitingForInvoice) {
        //Service Requests that are terminal and don't allow invoices need to be skipped
        if (ServiceRequest.TerminalProgressValues.contains(sr.Progress) and
          not stateHandler.AllowsInvoices) {
          continue
        }
      }

      if (results.Count >= CCConfigParameters.ServiceRequestAPIMaxSearchResults.Value) {
        resultsTruncated = true
        break
      }
      results.add(new ServiceRequestSummary(sr))
    }

    return new ServiceRequestSearchResults() {
      :Results = results,
      :ResultsAreTruncated = resultsTruncated
    }
  }


  function getServiceRequest(specialistId: String, serviceRequestNumber: String): ServiceRequestDetails {
    var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber)
    return new ServiceRequestDetails(serviceRequest)
  }


  function updateServiceRequestReferenceNumber(specialistId: String, serviceRequestNumber: String, newReferenceNumber: String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      serviceRequest.ServiceRequestReferenceNumber = newReferenceNumber
    })
  }


  function getDocumentContent(specialistId: String, serviceRequestNumber: String, documentPublicId: String): DocumentWithContent {
    var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber)
    for (documentLink in serviceRequest.DocumentLinks) {
      if (documentLink.VisibleToSpecialist) {
        var linkedDocument = documentLink.LinkedDocument
        if (linkedDocument != null  and  linkedDocument.PublicID == documentPublicId) {
          if (not linkedDocument.DMS) {
            throw new IllegalArgumentException("the specified file does not have content")
          }
          return new DocumentWithContent(linkedDocument)
        }
      }
    }
    throw new IllegalArgumentException("the specified file was not found on the service request")
  }


  function getMessagesForSpecialist(specialistId: String): MessagesForSpecialistResults {
    validateSpecialistId(specialistId)

    var q = Query.make(ServiceRequestMessage)
    var serviceRequestTable = q.join("ServiceRequest")
    addVisibilityRestriction(serviceRequestTable)
    addActiveRestriction(serviceRequestTable)
    serviceRequestTable.join("Specialist").compare(Contact#AddressBookUID, Equals, specialistId)
    var resultsTruncated = false
    var maxMessages = CCConfigParameters.ServiceRequestAPIMaxMessageResults.Value
    var messages = q.select().orderByDescending(QuerySelectColumns.path(Paths.make(ServiceRequestMessage#SendDate)))
    var results = new ArrayList<gw.webservice.cc.cc900.vendormanagement.Message>()
    //We need to track the active status of SRs after the query
    var activeStatusOfServiceRequest = new HashMap<ServiceRequest, Boolean>()
    messages.setPageSize(100)
    for (message in messages) {
      if (activeStatusOfServiceRequest[message.ServiceRequest] == null) {
        if (ServiceRequest.TerminalProgressValues.contains(message.ServiceRequest.Progress) and
          not message.ServiceRequest.createStateHandler().AllowsInvoices) {
          //This service request is not active, since Invoicing is not allowed
          activeStatusOfServiceRequest[message.ServiceRequest] = false
        }
        else {
          activeStatusOfServiceRequest[message.ServiceRequest] = true
        }
      }

      //If the service request is actually inactive, skip this message
      if (not activeStatusOfServiceRequest[message.ServiceRequest]) {
        continue
      }

      if (results.Count >= maxMessages) {
        resultsTruncated = true
        break
      }

      results.add(new gw.webservice.cc.cc900.vendormanagement.Message(message, true))
    }

    return new MessagesForSpecialistResults () {
      : Results = results,
      : ResultsAreTruncated = resultsTruncated
    }
  }


  function sendMessage(specialistId: String,
                       serviceRequestNumber: String,
                       title: String,
                       body: String,
                       type: ServiceRequestMessageType) {
    Transaction.runWithNewBundle(\ bundle -> {
      var newMessage = new ServiceRequestMessage(bundle) {
        :Title = title,
        :Body = body,
        :SendDate = java.util.Date.CurrentDate,
        :SentFromPortal = true,
        :Type = type
      }
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      serviceRequest.addToMessages(newMessage)

      newMessage.Author = serviceRequest.Specialist
      if (newMessage.Type == ServiceRequestMessageType.TC_QUESTION) {
        serviceRequest.createNewActivity(ServiceRequestActivityPattern.VENDOR_SENT_QUESTION_MESSAGE, newMessage.Title, newMessage.Body, null)
      }
    })
  }


  function addOrReplaceQuote(specialistId: String,
                             serviceRequestNumber: String,
                             creationInstructions: StatementCreationInstructions): String {
    creationInstructions.normalizeAndValidate()

    var newQuote: ServiceRequestQuote
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      newQuote = new ServiceRequestQuote(bundle) {
        :ServiceRequest = serviceRequest
      }

      ServiceRequestStatementPopulator.populate(newQuote, creationInstructions)
    })
    return newQuote.PublicID
  }


  function addInvoiceToServiceRequest(specialistId: String,
                                      serviceRequestNumber: String,
                                      creationInstructions: StatementCreationInstructions): String {
    var invoice: ServiceRequestInvoice
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      invoice = addInvoiceToServiceRequest(serviceRequest, creationInstructions)
    })
    return invoice.PublicID
  }


  protected function addInvoiceToServiceRequest(serviceRequest: ServiceRequest,
                                                creationInstructions: StatementCreationInstructions): ServiceRequestInvoice {
    creationInstructions.normalizeAndValidate()

    if (creationInstructions.Currency != null and creationInstructions.Currency != serviceRequest.Currency) {
      throw new IllegalArgumentException("The invoice currency does not match the service request currency" )
    }

    var newInvoice = new ServiceRequestInvoice(serviceRequest) {
      :ServiceRequest = serviceRequest,
      :Status = ServiceRequestInvoiceStatus.TC_APPROVED
    }
    ServiceRequestStatementPopulator.populate(newInvoice, creationInstructions)
    return newInvoice
  }

  function addInvoiceToClaim(specialistId: String, claimNumber: String, incidentId: String, exposureId: String, services: List<String>, creationInstructions: StatementCreationInstructions): String {
    var incident: Incident
    var exposure: Exposure

    validateSpecialistId(specialistId)

	  if (!claimNumber.HasContent) {
      throw new IllegalArgumentException("claimNumber must be provided")
    }

    var claim = Claim.finder.findClaimByClaimNumber(claimNumber)
    if (claim == null) {
      throw new IllegalArgumentException("No Claim found with ClaimNumber '" + claimNumber + "'")
    }

    if (incidentId != null) {
      incident = Query.make(Incident).compare(Incident#PublicID, Equals, incidentId).select().AtMostOneRow
      if (incident == null) {
        throw new IllegalArgumentException("No Incident found with PublicID == " + incidentId)
      }
      if (incident.Claim != claim) {
        throw new IllegalArgumentException(
          "The Incident with PublicID == '" + incident.PublicID + "' is on Claim '" + incident.Claim.ClaimNumber
            + "', not Claim '" + claimNumber + "'."
        )
      }
    }

    if (exposureId != null) {

      if(incidentId == null) {
        throw new IllegalArgumentException("IncidentId must be provided if ExposureId is specified.")
      }

      exposure = Query.make(Exposure).compare(Exposure#PublicID, Equals, exposureId).select().AtMostOneRow
      if (exposure == null) {
        throw new IllegalArgumentException("No Exposure found with PublicID == " + exposureId)
      }
      if (exposure.Incident != incident) {
        throw new IllegalArgumentException(
            "Exposure '" + exposure.PublicID + "' does not belong to Incident '" + incident.PublicID + "'."
        )
      }
    }

    // If the currency is not specified, use the claim currency by default
    creationInstructions.Currency = creationInstructions.Currency?: claim.Currency

    return addInvoiceToClaim(specialistId, claim, incident, exposure, services, creationInstructions)
  }

  private function addInvoiceToClaim(specialistId: String, claim: Claim, incident: Incident, exposure: Exposure, services: List<String>, creationInstructions: StatementCreationInstructions): String {
    // If there is an exposure we want its collection 'ServiceRequests' first, even if it is empty.
    // If there is no exposure, then we want the incident's collection.
    // If there is no incident then we want the claim's collection.
    var candidateSRs = exposure.ServiceRequests ?: (incident.ServiceRequests ?: claim.ServiceRequests)
    var serviceRequest = selectServiceRequestFromCandidates(specialistId, candidateSRs, services, creationInstructions)
    var invoice: ServiceRequestInvoice

    Transaction.runWithNewBundle(\ bundle -> {
      claim = bundle.add(claim)

      if (serviceRequest == null) {
        serviceRequest = createServiceRequest(specialistId, claim, incident, exposure, services, creationInstructions)
      }
      else {
        serviceRequest = bundle.add(serviceRequest)
      }

      invoice = addInvoiceToServiceRequest(serviceRequest, creationInstructions)
    })
    return invoice.PublicID
  }


  /**
   * Create a service request that complies with the supplied arguments. This assumes the claim is in an editable bundle.
   * @param specialistId The address book UID of the specialist.
   * @param claim The claim.
   * @param incident The incident. null may be provided if the SR is claim-level.
   * @param exposure The exposure. null may be provided if the SR is claim-level or incident-level.
   * @param services The list of services performed.
   * @param creationInstructions The creationInstructions.
   */
  protected function createServiceRequest(specialistId: String,
                                          claim: Claim,
                                          incident: Incident,
                                          exposure: Exposure,
                                          services: List<String>,
                                          creationInstructions: StatementCreationInstructions): ServiceRequest {
    var specialist: Contact

    validateSpecialistId(specialistId)

    // is the contact already on the claim?
    specialist = claim.Contacts.firstWhere(\ claimContact -> claimContact.Contact.AddressBookUID == specialistId).Contact

    if (specialist == null) {
      specialist = ContactSystemUtil.importContactFromContactSystem(claim.Bundle, specialistId, false)
    }

    var serviceRequest = claim.newServiceRequest(null, incident, exposure)

    for (serviceCode in services) {
      serviceRequest.Instruction.addServiceFoundByCode(serviceCode)
    }

    serviceRequest.Currency    = creationInstructions.Currency
    serviceRequest.Kind        = ServiceRequestKind.TC_UNMANAGED
    serviceRequest.Progress    = ServiceRequestProgress.TC_WORKCOMPLETE
    serviceRequest.QuoteStatus = ServiceRequestQuoteStatus.TC_NOQUOTE
    serviceRequest.Specialist  = specialist

    serviceRequest.RequestedQuoteCompletionDate   = null
    serviceRequest.RequestedServiceCompletionDate = null

    serviceRequest.assignServiceRequestNumber()
    serviceRequest.initializeCommMethod()
    serviceRequest.setExpectedServiceRequestRoles()

    return serviceRequest
  }


  protected function selectServiceRequestFromCandidates(specialistId: String,
                                                      candidateSRs: ServiceRequest[],
                                                      services: List<String>,
                                                      creationInstructions: StatementCreationInstructions): ServiceRequest {
    creationInstructions.normalizeAndValidate()

    var lineItemCategories = creationInstructions.LineItems*.Category

    if (services.Empty) {
      throw new IllegalArgumentException("Services do not have content. You need to specify at least one service to perform")
    }

    var invalidSpecialistServices = services.where( \ service -> SpecialistService.getForCode(service) == null)
    if (invalidSpecialistServices.HasElements) {
      throw new IllegalArgumentException("The following service codes do not match a valid SpecialistService: " + invalidSpecialistServices.join(", "))
    }

    candidateSRs = candidateSRs.where(\ srvReq -> {
      var instructionServiceCodes = srvReq.Instruction.Services*.Service*.Code.toSet()

      var sameVendorAsTheRequest = specialistId == srvReq.Specialist.AddressBookUID
      var sameCurrencyAsTheRequest = creationInstructions.Currency == srvReq.Currency
      var everyServiceInTheRequest = instructionServiceCodes.containsAll(services)
      var addInvoiceOperationAvailable = srvReq.operationAvailable(ServiceRequestOperation.TC_ADDINVOICE, true)

      // Only keep this ServiceRequests if it has ...
      return sameVendorAsTheRequest
        and sameCurrencyAsTheRequest
        and everyServiceInTheRequest
        and addInvoiceOperationAvailable
    })

    // we expect at most one candidate
    if (candidateSRs.Count > 1) {
      throw new IllegalStateException("The search criteria matches more than one ServiceRequest.")
    }

    // Note that we are not verifying that the vendor fields in the request agree with those on the existing vendor.
    return candidateSRs.first()
  }


  function updateExpectedCompletionDate(specialistId: String, serviceRequestNumber: String, newDate: Date, isService: boolean, changeReason: String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      var originalDate = isService ? serviceRequest.ExpectedServiceCompletionDate : serviceRequest.ExpectedQuoteCompletionDate
      if (newDate != originalDate or changeReason.HasContent) {
        serviceRequest.setExpectedCompletionDateAndRecordChange(newDate, changeReason, true, isService)
      }
    })
  }


  function addDocument(specialistId: String,
                       serviceRequestNumber: String,
                       documentToUpload: DocumentContent,
                       documentToUploadName: String): String {
    if (documentToUpload == null  or  not documentToUploadName.HasContent) {
      throw new IllegalArgumentException("documentToUpload and documentToUploadName must both have content")
    }

    var documentLink: ServiceRequestDocumentLink
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      var documentCreationInfo = DocumentsUtil.createDocumentCreationInfo(serviceRequest.Claim)
      documentCreationInfo.Document.Author = serviceRequest.Specialist.DisplayName
      documentCreationInfo.setFile(documentToUploadName, documentToUpload.MimeType, new ByteArrayInputStream(documentToUpload.Content))
      documentCreationInfo.Document.preSynchronousStore(Plugins.get(IDocumentContentSource))
      documentLink = serviceRequest.linkDocument(documentCreationInfo.Document)
      documentLink.VisibleToSpecialist = true
    })
    return documentLink.LinkedDocument.PublicID
  }


  function acceptWork(specialistId: String,
                      serviceRequestNumber: String,
                      expectedCompletionDate: Date) {
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      serviceRequest.acceptWorkAndRecordChange(expectedCompletionDate, true)
    })
  }


  function declineWork(specialistId: String,
                       serviceRequestNumber: String,
                       reason: String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      var context = new ServiceRequestOperationDefinition.OperationContext() { :Reason = reason }
      serviceRequest.performOperation(TC_SPECIALISTDECLINED, context, true)
    })
  }


  function recordWorkResumed(specialistId: String,
                             serviceRequestNumber: String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      serviceRequest.performOperation(TC_SPECIALISTRESUMEDWORK, null, true)
    })
  }


  function recordWaiting(specialistId: String,
                         serviceRequestNumber: String,
                         reason: String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      var context = new ServiceRequestOperationDefinition.OperationContext() { :Reason = reason }
      serviceRequest.performOperation(TC_SPECIALISTWAITING, context, true)
    })
  }


  function recordWorkCompleted(specialistId: String, serviceRequestNumber: String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      serviceRequest.performOperation(TC_SPECIALISTCOMPLETEDWORK, null, true)
    })
  }


  function cancelServiceRequest(specialistId: String, serviceRequestNumber: String, reason: String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      var context = new ServiceRequestOperationDefinition.OperationContext() { :Reason = reason }
      serviceRequest.performOperation(TC_SPECIALISTCANCELED, context, true)
    })
  }


  function withdrawInvoice(specialistId: String,
                           serviceRequestNumber: String,
                           invoicePublicID: String,
                           reason: String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber, bundle)
      var invoicesResult = serviceRequest.Invoices.where(\ i -> i.PublicID == invoicePublicID)
      if (invoicesResult.IsEmpty) {
        throw new IllegalArgumentException("Invoice #" + invoicePublicID + " not found")
      }
      else if (invoicesResult.Count > 1){
        throw new IllegalStateException("found multiple Invoices with the same invoice ID")
      }
      var context = new ServiceRequestInvoiceOperationDefinition.OperationContext() { :Reason = reason }
      invoicesResult.single().performOperation(TC_WITHDRAWINVOICE, context, true)
    })
  }


  protected function getServiceRequestEntity(specialistId: String, serviceRequestNumber: String, bundle: Bundle): ServiceRequest {
    var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber)
    return bundle.add(serviceRequest)
  }


  protected function getServiceRequestEntity(specialistId: String, serviceRequestNumber: String): ServiceRequest {
    validateSpecialistId(specialistId)
    var q = Query.make(ServiceRequest)
    q.compare(ServiceRequest#ServiceRequestNumber, Equals, serviceRequestNumber)
    addVisibilityRestriction(q)
    var queryResult = q.select()
    if (queryResult.Count > 1) {
      throw new IllegalStateException("found multiple ServiceRequests with the same ServiceRequestNumber; there should be a unique index to prevent this")
    }
    var result = queryResult.FirstResult
    if (result == null  or  result.Specialist.AddressBookUID != specialistId) {
      // throw the same exception whether the service request # was invalid or just mismatched with the specialist,
      // to avoid revealing the existence of a service request # to a specialist who is not
      // authorized to know about it
      throw new IllegalArgumentException("service request #" + serviceRequestNumber + " not found")
    }
    return result
  }


  protected function addVisibilityRestriction(serviceRequestQueryBuilder: IQueryBuilder) {
    serviceRequestQueryBuilder
      // draft and unmanaged service requests are never visible to the client
      .compare(ServiceRequest#Progress, NotEquals, ServiceRequestProgress.TC_DRAFT)
      .compare(ServiceRequest#Kind, NotEquals, ServiceRequestKind.TC_UNMANAGED)

    // a service request must reach a non-terminal progress value at least once for it to become visible to the client
    var nonTerminalProgressesOtherThanDraft = ServiceRequestProgress.getTypeKeys(false).copy()
    nonTerminalProgressesOtherThanDraft.removeAll(ServiceRequest.TerminalProgressValues)
    nonTerminalProgressesOtherThanDraft.remove(ServiceRequestProgress.TC_DRAFT)
    serviceRequestQueryBuilder.subselect("ID", CompareIn, ServiceRequestChange, "ServiceRequest")
      .compareIn(ServiceRequestChange#New_Progress, nonTerminalProgressesOtherThanDraft?.toTypedArray())
  }


  /**
   * Adds the restriction that the service request must be "active". Callers should filter out SRs that
   * are in a terminal state and the StateHandler disallows Invoices after the query
   */
  protected function addActiveRestriction(serviceRequestQueryBuilder: IQueryBuilder) {
    /*
     * Progress not in terminal progress values OR (WorkComplete AND (HasUnpaidInvoice OR (HasNoPaidInvoice AND ModifiedRecently)))
     */
    serviceRequestQueryBuilder
      .or(\ restriction -> {
      restriction.compareNotIn(ServiceRequest#Progress, ServiceRequest.TerminalProgressValues?.toTypedArray())
      restriction.and(\ restriction2 -> {
        restriction2.compare(ServiceRequest#Progress, Equals, ServiceRequestProgress.TC_WORKCOMPLETE)
        restriction2.or(\ restriction3 -> {
          addHasUnpaidInvoiceRestriction(restriction3)
          restriction3.and(\ restriction4 -> {
            addHasNoPaidInvoiceRestriction(restriction4)
            restriction4.compare(ServiceRequest#LatestChangeTimestampDenorm, GreaterThanOrEquals,
              Date.CurrentDate.addDays(- CCConfigParameters.ServiceRequestAPIMaxDaysKeepActiveWithoutInvoice.Value))
          })
        })
      })
    })
    //debug
    //CCLoggerCategory.APPLICATION.info(\ -> "DEBUG SQL: " + serviceRequestQueryBuilder.toString())
  }


  protected function addHasUnpaidInvoiceRestriction(serviceRequestQueryBuilder: IQueryBuilder) {
    var restriction = serviceRequestQueryBuilder.subselect("ID", CompareIn, ServiceRequestStatement, "ServiceRequest")
    restriction.cast(ServiceRequestInvoice).compareIn(ServiceRequestInvoice#Status, {ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL, ServiceRequestInvoiceStatus.TC_APPROVED})
  }


  protected function addHasNoPaidInvoiceRestriction(serviceRequestQueryBuilder: IQueryBuilder) {
    var restriction = serviceRequestQueryBuilder.subselect("ID", CompareNotIn, ServiceRequestStatement, "ServiceRequest")
    restriction.cast(ServiceRequestInvoice).compare(ServiceRequestInvoice#Status, Equals, ServiceRequestInvoiceStatus.TC_CHECKCREATED)
  }

  private function validateSpecialistId (specialistId: String) {
    if (not specialistId.HasContent) {
      throw new IllegalArgumentException("SpecialistId must be specified")
    }
  }
}
