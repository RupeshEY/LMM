package gw.webservice.cc.cc800.vendormanagement
uses java.lang.IllegalArgumentException
uses gw.api.database.Query
uses java.lang.IllegalStateException

uses gw.api.database.QuerySelectColumns
uses gw.api.financials.CurrencyAmount
uses java.util.HashMap
uses java.io.ByteArrayInputStream

uses gw.api.path.Paths
uses gw.document.DocumentsUtil
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSource
uses java.util.Date
uses java.util.ArrayList
uses gw.api.database.IQueryBuilder
uses gw.vendormanagement.servicerequeststate.ServiceRequestOperationDefinition
uses gw.vendormanagement.servicerequeststate.ServiceRequestInvoiceOperationDefinition
uses gw.vendormanagement.ServiceRequestActivityPattern
uses gw.api.system.CCConfigParameters
uses java.util.List

@Export
internal class ServiceRequestAPIUtil {

  private construct() {}

  static function searchForServiceRequests(specialistId : String, searchCriteria : ServiceRequestSearchCriteria) : ServiceRequestSearchResults {
    if (not specialistId.HasContent) {
      throw new IllegalArgumentException("SpecialistId must be specified")
    }

    var q = Query.make(ServiceRequest)
    q.join("Specialist")
                 .compare(Contact#AddressBookUID, Equals, specialistId)

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
      restriction2.cast(ServiceRequestInvoice).compareIn(ServiceRequestInvoice#Status, {ServiceRequestInvoiceStatus.TC_APPROVED,ServiceRequestInvoiceStatus.TC_CHECKCREATED,ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL})
    }
    var recentlyCanceledLimitDate : Date = null
    if (searchCriteria.OnlyRecentlyCanceled) {
      if (searchCriteria.CanceledWithinDays == null  or  searchCriteria.CanceledWithinDays < 0) {
        throw new IllegalArgumentException("When OnlyRecentlyCanceled is used, CanceledWithinDays must be specified as a positive number of days within which to search")
      }
      // a recently-canceled service request must have a latest change timestamp within the day limit and must still be canceled;
      // this simple criterion is used to limit the results of the query, and then a proper check for recent cancelation will be
      // performed on the beans
      recentlyCanceledLimitDate = Date.Today.addDays(-searchCriteria.CanceledWithinDays)
      q.compare(ServiceRequest#Progress, Equals, ServiceRequestProgress.TC_CANCELED)
      q.compare(ServiceRequest#LatestChangeTimestampDenorm, GreaterThanOrEquals, recentlyCanceledLimitDate)
    }

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

      if(searchCriteria.OnlyActive or searchCriteria.OnlyCompleteWaitingForInvoice) {
        //Service Requests that are terminal and don't allow invoices need to be skipped
        if(ServiceRequest.TerminalProgressValues.contains(sr.Progress) and
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

  static function getServiceRequest(specialistId : String, serviceRequestNumber : String) : ServiceRequestDetails {
    var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber)
    return new ServiceRequestDetails(serviceRequest)
  }

  static function updateServiceRequestReferenceNumber(specialistId : String, serviceRequestNumber : String, newReferenceNumber : String) {
    var serviceRequest = getServiceRequestEntity(specialistId, serviceRequestNumber)
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var sr = bundle.add(serviceRequest)
      sr.ServiceRequestReferenceNumber = newReferenceNumber
    })
  }

  static function getDocumentContent(specialistId : String, serviceRequestNumber : String, documentPublicId : String) : DocumentWithContent {
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

  /**
   * Gets all of the messages for a given specialist ordered by the date they were sent
   * This method attaches a reference to the service request itself to the Messages
   */
  static function getMessagesForSpecialist(specialistId : String) : MessagesForSpecialistResults {
    if (not specialistId.HasContent) {
      throw new IllegalArgumentException("no specialistId specified")
    }

    var q = Query.make(ServiceRequestMessage)
    var serviceRequestTable = q.join("ServiceRequest")
    addVisibilityRestriction(serviceRequestTable)
    addActiveRestriction(serviceRequestTable)
    serviceRequestTable.join("Specialist").compare(Contact#AddressBookUID, Equals, specialistId)
    var resultsTruncated = false
    var maxMessages = CCConfigParameters.ServiceRequestAPIMaxMessageResults.Value
    var messages = q.select().orderByDescending(QuerySelectColumns.path(Paths.make(ServiceRequestMessage#SendDate)))
    var results = new ArrayList<gw.webservice.cc.cc800.vendormanagement.Message>()
    //We need to track the active status of SRs after the query
    var activeStatusOfServiceRequest = new HashMap<ServiceRequest, Boolean>()
    messages.setPageSize(100)
    for(message in messages) {
      if(activeStatusOfServiceRequest[message.ServiceRequest] == null) {
        if(ServiceRequest.TerminalProgressValues.contains(message.ServiceRequest.Progress) and
           not message.ServiceRequest.createStateHandler().AllowsInvoices) {
          //This service request is not active, since Invoicing is not allowed
          activeStatusOfServiceRequest[message.ServiceRequest] = false
        }
        else {
          activeStatusOfServiceRequest[message.ServiceRequest] = true
        }
      }

      //If the service request is actually inactive, skip this message
      if(not activeStatusOfServiceRequest[message.ServiceRequest]) {
        continue
      }

      if (results.Count >= maxMessages) {
        resultsTruncated = true
        break
      }

      results.add(new gw.webservice.cc.cc800.vendormanagement.Message(message, true))
  }

    return new MessagesForSpecialistResults () {
      :Results = results,
      :ResultsAreTruncated = resultsTruncated
    }
  }

  static function sendMessage(specialistId : String,
                              serviceRequestNumber : String,
                              title : String,
                              body : String,
                              type : ServiceRequestMessageType) {
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var newMessage = new ServiceRequestMessage(bundle)
      newMessage.Title = title
      newMessage.Body = body
      newMessage.SendDate = java.util.Date.CurrentDate
      newMessage.SentFromPortal = true
      newMessage.Type = type
      var serviceRequest = bundle.add(getServiceRequestEntity(specialistId, serviceRequestNumber))
      serviceRequest.addToMessages(newMessage)

      newMessage.Author = serviceRequest.Specialist    
      if (newMessage.Type == ServiceRequestMessageType.TC_QUESTION) {
        serviceRequest.createNewActivity(ServiceRequestActivityPattern.VENDOR_SENT_QUESTION_MESSAGE, newMessage.Title, newMessage.Body, null)
      }
    })
  }

  static function addOrReplaceQuote(specialistId : String,
                                    serviceRequestNumber : String,
                                    creationInstructions : StatementCreationInstructions) : String {
    creationInstructions.normalizeAndValidate()
    if (creationInstructions.QuoteNumberOfDaysToPerformService < 0) {
      throw new IllegalArgumentException("numberOfDaysToPerformService must be greater or equal than zero")
    }

    var newQuote : ServiceRequestQuote
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = bundle.add(getServiceRequestEntity(specialistId, serviceRequestNumber))
      newQuote = new ServiceRequestQuote(bundle) {
          :Description                  = creationInstructions.Description,
          :ExpectedDaysToPerformService = creationInstructions.QuoteNumberOfDaysToPerformService,
          :ReferenceNumber              = creationInstructions.ReferenceNumber,
          :ServiceRequest               = serviceRequest
      }
      var newLineItem = new ServiceRequestStatementLineItem() {
          :ServiceRequestStatement = newQuote,
          :Amount                  = new CurrencyAmount(creationInstructions.Amount, serviceRequest.Currency)
      }

      linkExistingDocumentsToNewStatement(newQuote, creationInstructions.ExistingDocumentsToLinkPublicIds)
      linkUploadedDocumentsToNewStatement(newQuote, creationInstructions.DocumentsToUpload, creationInstructions.DocumentsToUploadNames)
      newQuote.finishSetup(true)
    })
    return newQuote.PublicID
  }

  static function addInvoice(specialistId : String,
                             serviceRequestNumber : String,
                             creationInstructions : StatementCreationInstructions) : String {
    creationInstructions.normalizeAndValidate()

    var newInvoice : ServiceRequestInvoice
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = bundle.add(getServiceRequestEntity(specialistId, serviceRequestNumber))

      // create a new invoice on this SR
      newInvoice = new ServiceRequestInvoice(bundle) {
          :ServiceRequest  = serviceRequest,
          :Description     = creationInstructions.Description,
          :ReferenceNumber = creationInstructions.ReferenceNumber
      }

      // create a new line item on the new invoice
      var newLineItem = new ServiceRequestStatementLineItem(bundle) {
          :ServiceRequestStatement = newInvoice,
          :Amount                  = new CurrencyAmount(creationInstructions.Amount, serviceRequest.Currency)
      }

      linkExistingDocumentsToNewStatement(newInvoice, creationInstructions.ExistingDocumentsToLinkPublicIds)
      linkUploadedDocumentsToNewStatement(newInvoice, creationInstructions.DocumentsToUpload, creationInstructions.DocumentsToUploadNames)
      newInvoice.finishSetup(true)
    })
    return newInvoice.PublicID
  }

  static function updateExpectedCompletionDate(specialistId : String, serviceRequestNumber : String, newDate : Date, isService : boolean, changeReason : String) {
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = bundle.add(getServiceRequestEntity(specialistId, serviceRequestNumber))
      var originalDate = isService ? serviceRequest.ExpectedServiceCompletionDate : serviceRequest.ExpectedQuoteCompletionDate
      if (newDate != originalDate or changeReason.HasContent) {
        serviceRequest.setExpectedCompletionDateAndRecordChange(newDate, changeReason, true, isService)
      }
    })
  }

  static function addDocument(specialistId : String,
                              serviceRequestNumber : String,
                              documentToUpload : DocumentContent,
                              documentToUploadName : String) : String {
    if (documentToUpload == null  or  not documentToUploadName.HasContent) {
      throw new IllegalArgumentException("documentToUpload and documentToUploadName must both have content")
    }

    var documentLink: ServiceRequestDocumentLink
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = bundle.add(getServiceRequestEntity(specialistId, serviceRequestNumber))
      var documentCreationInfo = DocumentsUtil.createDocumentCreationInfo(serviceRequest.Claim)
      documentCreationInfo.Document.Author = serviceRequest.Specialist.DisplayName
      documentCreationInfo.setFile(documentToUploadName, documentToUpload.MimeType, new ByteArrayInputStream(documentToUpload.Content))
      documentCreationInfo.Document.preSynchronousStore(Plugins.get(IDocumentContentSource))
      documentLink = serviceRequest.linkDocument(documentCreationInfo.Document)
      documentLink.VisibleToSpecialist = true
    })
    return documentLink.LinkedDocument.PublicID
  }

  static function acceptWork(specialistId : String,
                      serviceRequestNumber : String,
                      expectedCompletionDate : Date) {
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = bundle.add(getServiceRequestEntity(specialistId, serviceRequestNumber))
      serviceRequest.acceptWorkAndRecordChange(expectedCompletionDate, true)
    })
  }

  static function declineWork(specialistId : String,
                              serviceRequestNumber : String,
                              reason : String) {
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = bundle.add(getServiceRequestEntity(specialistId, serviceRequestNumber))
      var context = new ServiceRequestOperationDefinition.OperationContext(){:Reason = reason}
      serviceRequest.performOperation(TC_SPECIALISTDECLINED, context, true)
    })
  }

  static function recordWorkResumed(specialistId : String,
                                    serviceRequestNumber : String) {
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = bundle.add(getServiceRequestEntity(specialistId, serviceRequestNumber))
      serviceRequest.performOperation(TC_SPECIALISTRESUMEDWORK, null, true)
    })
  }

  static function recordWaiting(specialistId : String,
                                serviceRequestNumber : String,
                                reason : String) {
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = bundle.add(getServiceRequestEntity(specialistId, serviceRequestNumber))
      var context = new ServiceRequestOperationDefinition.OperationContext(){:Reason = reason}
      serviceRequest.performOperation(TC_SPECIALISTWAITING, context, true)
    })
  }

  static function recordWorkCompleted(specialistId : String,
                               serviceRequestNumber : String) {
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = bundle.add(getServiceRequestEntity(specialistId, serviceRequestNumber))
      serviceRequest.performOperation(TC_SPECIALISTCOMPLETEDWORK, null, true)
    })
  }

  static function cancelServiceRequest(specialistId : String,
                                       serviceRequestNumber : String,
                                       reason : String) {
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = bundle.add(getServiceRequestEntity(specialistId, serviceRequestNumber))
      var context = new ServiceRequestOperationDefinition.OperationContext(){:Reason = reason}
      serviceRequest.performOperation(TC_SPECIALISTCANCELED, context, true)
    })
  }

  static function withdrawInvoice(specialistId : String,
                                  serviceRequestNumber : String,
                                  invoicePublicID : String,
                                  reason: String) {
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = bundle.add(getServiceRequestEntity(specialistId, serviceRequestNumber))
      var invoicesResult = serviceRequest.Invoices.where(\ i -> i.PublicID == invoicePublicID)
      if (invoicesResult.IsEmpty) {
        throw new IllegalArgumentException("Invoice #" + invoicePublicID + " not found")
      } else if (invoicesResult.Count > 1){
        throw new IllegalStateException("found multiple Invoices with the same invoice ID")
      }
      var context = new ServiceRequestInvoiceOperationDefinition.OperationContext(){:Reason = reason}
      invoicesResult.single().performOperation(TC_WITHDRAWINVOICE, context, true)
    })
  }

  private static function linkExistingDocumentsToNewStatement(newStatement : ServiceRequestStatement, existingDocumentsToLinkPublicIds : List<String>) {
    /*
     * PublicID is on Document itself, so we have to iterate over ServiceRequest.DocumentLinks and evaluate
     * LinkedDocument on the elements to find the Document with a particular PublicID. Store a map of
     * PublicIDs to Documents that we've already encountered, and store an iterator over the DocumentLinks
     * since we only need to look at each one once.
     */
    var publicIdToDocumentMap = new HashMap<String,Document>()
    var documentLinkIterator = newStatement.ServiceRequest.DocumentLinks.toList().iterator()
    for (existingDocumentPublicId in existingDocumentsToLinkPublicIds) {
      while (not publicIdToDocumentMap.containsKey(existingDocumentPublicId)) {
        if (not documentLinkIterator.hasNext()) {
          throw new IllegalArgumentException("document with publicid " + existingDocumentPublicId + " was not found on the service request")
        }
        var documentLink = documentLinkIterator.next()
        if (documentLink.VisibleToSpecialist) {
          var document = documentLink.LinkedDocument
          publicIdToDocumentMap[document.PublicID] = document
        }
      }
      newStatement.linkDocument(publicIdToDocumentMap[existingDocumentPublicId])
    }
  }

  private static function linkUploadedDocumentsToNewStatement(newStatement : ServiceRequestStatement,
                                                              uploadedDocuments : List<DocumentContent>,
                                                              uploadedDocumentNames : List<String>) {
    if (uploadedDocumentNames.toSet().Count != uploadedDocumentNames.Count) {
      throw new IllegalArgumentException("documentsToUploadNames cannot contain duplicate names")
    }
    for (documentToUpload in uploadedDocuments index i) {
      var requestedName = uploadedDocumentNames[i]

      var documentCreationInfo = DocumentsUtil.createDocumentCreationInfo(newStatement.ServiceRequest.Claim)
      documentCreationInfo.Document.Author = newStatement.ServiceRequest.Specialist.DisplayName
      documentCreationInfo.setFile(requestedName, documentToUpload.MimeType, new ByteArrayInputStream(documentToUpload.Content))
      documentCreationInfo.Document.preSynchronousStore(Plugins.get(IDocumentContentSource))
      newStatement.linkDocument(documentCreationInfo.Document)
    }
  }

  /**
   * Gets the identified ServiceRequest and verifies that the provided specialistId is the AddressBookUID
   * for that ServiceRequest's specialist.
   * @throws IllegalArgumentException  if the service request cannot be found or if it does not match specialistId
   */
  private static function getServiceRequestEntity(specialistId : String, serviceRequestNumber : String) : ServiceRequest {
    if (not specialistId.HasContent) {
      throw new IllegalArgumentException("SpecialistId must be specified")
    }
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
  
  private static function addVisibilityRestriction(serviceRequestQueryBuilder : IQueryBuilder) {
    serviceRequestQueryBuilder
          // draft and unmanaged service requests are never visible to the client
          .compare(ServiceRequest#Progress, NotEquals, ServiceRequestProgress.TC_DRAFT)
          .compare(ServiceRequest#Kind, NotEquals, ServiceRequestKind.TC_UNMANAGED)

    // a service request must reach a non-terminal progress value at least once for it to become visible to the client
    var nonTerminalProgressesOtherThanDraft = ServiceRequestProgress.getTypeKeys(false).copy()
    nonTerminalProgressesOtherThanDraft.removeAll(ServiceRequest.TerminalProgressValues)
    nonTerminalProgressesOtherThanDraft.remove(ServiceRequestProgress.TC_DRAFT)
    serviceRequestQueryBuilder.subselect( "ID", CompareIn, ServiceRequestChange, "ServiceRequest")
                 .compareIn(ServiceRequestChange#New_Progress,nonTerminalProgressesOtherThanDraft?.toTypedArray())
    
  }

  /**
   * Adds the restriction that the service request must be "active". Callers should filter out SRs that
   * are in a terminal state and the StateHandler disallows Invoices after the query
   */
  private static function addActiveRestriction(serviceRequestQueryBuilder : IQueryBuilder) {
     /*
      * Progress not in terminal progress values OR (WorkComplete AND (HasUnpaidInvoice OR (HasNoPaidInvoice AND ModifiedRecently)))
      */
    serviceRequestQueryBuilder
            .or(\ restriction -> {
                  restriction.compareNotIn(ServiceRequest#Progress, ServiceRequest.TerminalProgressValues?.toTypedArray())
                  restriction.and(\ restriction2 -> {
                    restriction2.compare(ServiceRequest#Progress, Equals, ServiceRequestProgress.TC_WORKCOMPLETE)
                    restriction2.or(\restriction3-> {
                      addHasUnpaidInvoiceRestriction(restriction3)
                      restriction3.and(\restriction4->{
                        addHasNoPaidInvoiceRestriction(restriction4)
                        restriction4.compare(ServiceRequest#LatestChangeTimestampDenorm, GreaterThanOrEquals, 
                            Date.CurrentDate.addDays(-CCConfigParameters.ServiceRequestAPIMaxDaysKeepActiveWithoutInvoice.Value))
                      })
                    })
                  })
               })
     //debug
     //CCLoggerCategory.APPLICATION.info(\ -> "DEBUG SQL: " + serviceRequestQueryBuilder.toString())
  }

  private static function addHasUnpaidInvoiceRestriction(serviceRequestQueryBuilder : IQueryBuilder) {
    var restriction = serviceRequestQueryBuilder.subselect("ID", CompareIn, ServiceRequestStatement, "ServiceRequest")
    restriction.cast(ServiceRequestInvoice).compareIn(ServiceRequestInvoice#Status, {ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL, ServiceRequestInvoiceStatus.TC_APPROVED})
  }

  private static function addHasNoPaidInvoiceRestriction(serviceRequestQueryBuilder : IQueryBuilder) {
    var restriction = serviceRequestQueryBuilder.subselect("ID", CompareNotIn, ServiceRequestStatement, "ServiceRequest")
    restriction.cast(ServiceRequestInvoice).compare(ServiceRequestInvoice#Status, Equals, ServiceRequestInvoiceStatus.TC_CHECKCREATED)
  }
}
