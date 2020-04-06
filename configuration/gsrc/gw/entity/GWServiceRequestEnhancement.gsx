package gw.entity

uses gw.api.locale.DisplayKey
uses com.google.common.collect.ImmutableList
uses com.google.common.collect.Sets
uses gw.api.assignment.AutoAssignAssignee
uses gw.api.domain.BeanUtil
uses gw.api.financials.CurrencyAmount
uses gw.api.util.DateUtil
uses gw.api.util.DisplayableException
uses gw.api.util.StringUtil
uses gw.document.DocumentCreationInfo
uses gw.transaction.Transaction
uses gw.util.Pair

uses java.lang.IllegalStateException
uses java.util.ArrayList
uses java.util.Date
uses java.util.Map
uses java.util.Set
uses java.lang.IllegalArgumentException

@Export
enhancement GWServiceRequestEnhancement : entity.ServiceRequest {

  function assignServiceRequestNumber() {
    // Use a simple mechanism to construct a reliably-unique value for the ServiceRequest.ServiceRequestNumber
    // property: allocate a new ID as if creating a new ServiceRequest instance.
    this.ServiceRequestNumber = BeanUtil.generateNextId(ServiceRequest) as String
  }

  /**
   * Initialize fields not set via the UI and record a ServiceRequestChange event.  The service request participant
   * and service request specialist roles are only set if this method is called outside of the FNOL wizard.
   * Has no effect if it was already called on this service request.
   */
  function finishSetup() {
    if (this.ServiceRequestNumber != null) {
      return
    }
    
    if (this.Specialist == null) {
      throw new DisplayableException(DisplayKey.get("Web.ServiceRequest.MustSelectSpecialist"))
    }

    this.Currency = this.Specialist.PreferredCurrency ?: this.Claim.Currency

    this.assignServiceRequestNumber()
    this.Progress = ServiceRequestProgress.TC_DRAFT
    this.QuoteStatus = ServiceRequestQuoteStatus.TC_NOQUOTE
    this.initializeCommMethod()

    // Assign users and set roles when creating a Service Request outside the FNOL.
    // The ClaimState is DRAFT only when coming from the FNOL Wizard
    if (this.Claim.State != ClaimState.TC_DRAFT) {
      this.setExpectedServiceRequestRoles()
      AutoAssignAssignee.INSTANCE.assignToThis(this) //Use the assignment rules
    }

    // clear the incompatible value, since it may contain a dummy initial values
    if (this.quoteAllowed()) {
      this.RequestedServiceCompletionDate = null
    } else {
      this.RequestedQuoteCompletionDate = null
    }

    this.recordChange(DisplayKey.get("Web.ServiceRequest.StateTransition.Description.ServiceCreated"), null, null, User.util.CurrentUser.Contact)
  }

  /**
   * Initialize SpecialistCommMethod field, based on the service request's Specialist and Kind fields
   */
  function initializeCommMethod() {
    if (this.Specialist == null) {
      this.SpecialistCommMethod = null
    } else if (this.Kind == TC_UNMANAGED) {
      this.SpecialistCommMethod = SpecialistCommMethod.TC_PHONE
    } else {
      this.SpecialistCommMethod = SpecialistCommMethod.TC_GWPORTAL
    }
  }
  
  /**
   * Gets the exposure's display name, incident's type prefixed name, or a displaykey indicating the service request is at claim level
   */
  property get RelatedToName(): String {
    if (this.Exposure != null) {
      return this.Exposure.DisplayName
    } else {
      return this.TypePrefixedIncidentName
    }
  }

  /**
   * Gets the incident's type prefixed name or a displaykey indicating the service request is at claim level
   */
  property get TypePrefixedIncidentName() : String {
    var incident = this.Incident
    return  incident == null ? DisplayKey.get("Web.ServiceRequest.ClaimLevelServiceRequest") : incident.TypePrefixedIncidentName
  }

  /**
   * Gets the specialist's display name or a displaykey indicating no specialist is assigned
   */
  property get SpecialistName() : String {
    return this.Specialist == null ? DisplayKey.get("Web.ServiceRequest.NoSpecialistAssigned") : this.Specialist.DisplayName
  }

  property set SpecialistAndCreateClaimContact(specialist : Contact) {
    // call createClaimContact to ensure that there is a ClaimContact for this specialist; this will allow the
    // ClaimContactInputs for other ServiceRequests to find this Contact instance even if the roles have not been added
    // yet (the roles are added when finishing the wizard)
    var claimContact = this.Claim.createClaimContact(specialist)
    this.Specialist = claimContact.Contact
  }

  property get SpecialistAndCreateClaimContact() : Contact {
    return this.Specialist
  }

  /**
   * Gets a string representing the services to be performed for this service request, formatted as "ParentServiceType - MostSpecificServiceType"
   */
  property get ServicesString() : String {
    return this.Instruction.OrderedServices*.ServiceString.join("\n")
  }
  
  /**
   * Gets the notes that are viewable by the current user, based on their permissions
   */
  property get NotesWithPermCheck() : Note [] {
    var viewable = this.Claim.ViewableNotes
    return viewable.intersect(this.Notes?.toList())?.toTypedArray()
  }

  /**
   * Gets whether the create new quote and service request should be available
   */
  property get IsPromotableQuoteOnly(): boolean {
      return this.Kind == ServiceRequestKind.TC_QUOTEONLY and 
             this.Progress == ServiceRequestProgress.TC_WORKCOMPLETE and 
             this.QuoteStatus == ServiceRequestQuoteStatus.TC_QUOTED and
             // this should be implied by the quote status, but check for sanity:
             this.LatestQuote != null and
             not AlreadyPromoted
  }

  /**
   * Gets whether this Service Request has been promoted
   */
  property get AlreadyPromoted(): boolean {
    return PromotionServiceRequest != null
  }
  
  /**
   * Gets whether this Service Request is the result of promoting another Service Request
   */
  property get IsPromotion(): boolean {
    return this.OriginatingServiceRequest != null
  }

  /**
   * Used in UI to determine whether this service request can be edited or deleted
   */
  property get IsEditableInUI() : boolean {
    return this.Progress == null or this.Progress == ServiceRequestProgress.TC_DRAFT
  }
  
  /**
   * Gets the Service Request that was created as a result of a promotion for this Service Request
   */
  property get PromotionServiceRequest(): ServiceRequest {
    var promotionSR: ServiceRequest = null
    var promotionServiceRequests = this.PromotionServiceRequests
    if (promotionServiceRequests.HasElements) {
      if (promotionServiceRequests.Count == 1) {
        promotionSR = promotionServiceRequests.single()
      } else {
        throw new IllegalStateException("Service request is promoted more than once")
      }
    }
    return promotionSR
  }

  /**
   * Gets the label for the quote details based on the quote state in the Service Request
   */
  property get QuoteLabel(): String {
    if (this.LatestQuote == null) {
      return DisplayKey.get("Web.ServiceRequest.Quote.Label")
    } else {
      if (this.LatestQuote.DeclinedReason == null) {
        return DisplayKey.get("Web.ServiceRequest.Quote.LatestLabel")
      } else {
        return DisplayKey.get("Web.ServiceRequest.Quote.PriorLabel")    
      }
    }
  }
  
  // Used in the UI to provide a default value for RequestedQuoteCompletionDate
  property get DefaultRequestedQuoteCompletionDate(): Date {
    return Date.CurrentDate.addBusinessDays(5)
  }

  // Used in the UI to provide a default value for RequestedServiceCompletionDate  
  property get DefaultRequestedServiceCompletionDate(): Date {
    return Date.CurrentDate.addBusinessDays(5)
  }
  
  // Used for this.PassingWaitingThreshold
  property get GlobalSpecialistWaitingThreshold() : int {
    return 5
  }
  
  /* Set of properties that sets the Requested and Expected Completion
  Dates and moves the time to the end of the day and returns them accordingly */
  property set RequestedQuoteCompletionDateMoveToEndOfDay(date: Date) {
    this.RequestedQuoteCompletionDate = date?.moveToEndOfDay()
  }
  
  property get RequestedQuoteCompletionDateMoveToEndOfDay(): Date {
    return this.RequestedQuoteCompletionDate
  }
  
  property set RequestedServiceCompletionDateMoveToEndOfDay(date: Date) {
    this.RequestedServiceCompletionDate = date?.moveToEndOfDay()
  }

  property get RequestedServiceCompletionDateMoveToEndOfDay(): Date {
    return this.RequestedServiceCompletionDate
  }

  property set ExpectedQuoteCompletionDateMoveToEndOfDay(date: Date) {
    this.ExpectedQuoteCompletionDate = date?.moveToEndOfDay()
  }
  
  property get ExpectedQuoteCompletionDateMoveToEndOfDay(): Date {
    return this.ExpectedQuoteCompletionDate
  }
  
  property set ExpectedServiceCompletionDateMoveToEndOfDay(date: Date) {
    this.ExpectedServiceCompletionDate = date?.moveToEndOfDay()
  }
  
  property get ExpectedServiceCompletionDateMoveToEndOfDay(): Date {
    return this.ExpectedServiceCompletionDate
  }  

  /**
   * Returns the sum of the amounts of the invoices on this Service Request that have been approved but have not been
   * paid, rejected, or withdrawn
   */
  property get OutstandingInvoicesAmount(): CurrencyAmount {
    return this.Invoices
              .where(\ i -> i.Status == ServiceRequestInvoiceStatus.TC_APPROVED or i.Status == ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL)
              .sum(\ s -> s.Amount)
            ?: new CurrencyAmount(0,this.Currency)
  }

  private property get ActiveChecks() : Set<Check> {
    var checkStatuses = {
        TransactionStatus.TC_PENDINGAPPROVAL,
        TransactionStatus.TC_AWAITINGSUBMISSION,
        TransactionStatus.TC_REQUESTING,
        TransactionStatus.TC_REQUESTED,
        TransactionStatus.TC_NOTIFYING,
        TransactionStatus.TC_ISSUED,
        TransactionStatus.TC_CLEARED}
    // return as a set to avoid returning multiple copies of checks (the same check could be reached through multiple invoices)
    return Sets.newHashSet(this.Invoices*.Check.where(\ chk -> chk != null  and  checkStatuses.contains(chk.Status)))
  }

  /**
   * Returns the sum of the amounts of the checks linked to this service request that are in one of the following
   * "active" states:
   * <ul>
   *   <li>Pending approval</li>
   *   <li>Awaiting submission</li>
   *   <li>Requesting</li>
   *   <li>Requested</li>
   *   <li>Notifying</li>
   *   <li>Issued</li>
   *   <li>Cleared</li>
   * </ul>
   * This list of states is intended to include checks that are likely to be successfully sent.
   */
  property get ActiveChecksAmount() : CurrencyAmount {
    return ActiveChecks.sum(\ chk -> chk.GrossAmount) ?: new CurrencyAmount(0,this.Currency)
  }

  /**
   * Returns true if any of the checks included in ActiveChecksAmount are linked to ServiceRequestInvoices on other
   * ServiceRequests
   */
  property get ActiveChecksAmountIncludesNonExclusiveChecks() : boolean {
    return ActiveChecks*.ServiceRequestInvoices.hasMatch(\ inv -> inv.ServiceRequest != this)
  }

  /**
   * Gets the total amount of all the invoices in this Service Request that are in states 'rejected' or 'withdrawn'
   */
  property get RejectedAndWithdrawnInvoicesAmount() : CurrencyAmount {
    return this.Invoices
              .where(\ i -> i.Status == ServiceRequestInvoiceStatus.TC_WITHDRAWN or i.Status == ServiceRequestInvoiceStatus.TC_REJECTED)
              .sum(\ i -> i.Amount)
            ?: new CurrencyAmount(0,this.Currency)
  }

  /**
   * Create a new note related to this service request and initialize some of the required fields
   */
  function newNote() : Note {
    var note = new Note()
    note.Claim = this.Claim
    this.addToNotes(note)
    return note
  }
  
  /**
   * Link to the Service Request and send the given document to the specialist. This works in
   * a separate bundle and commits.
   * @param document to link and send to specialist
   */
  function linkDocumentForUI(document: Document, visibleToSpecialist: boolean) {
    validateNotAlreadyLinked(document)
    if (visibleToSpecialist) {
      verifyDocumentNotSensitive(document)
    }

    Transaction.runWithNewBundle(\ bundle -> {
      var selectedServiceRequest = bundle.add(this)
      selectedServiceRequest.linkAndSendDocument(document, visibleToSpecialist)
    })
  }
  
  /**
   * Unlink the given document from the Service Request
   * @param document to unlink from the service request
   */
  function unlinkDocumentForUI(document: Document) {
    Transaction.runWithNewBundle(\ bundle -> {
      var serviceRequest = bundle.add(this)
      serviceRequest.unlinkDocument(document)
    })
  }

  /**
   * Attach a document from the file system to the statement
   */
  function attachDocument(doc: Document, visibleToSpecialist: boolean) {
    // Validate the document is not already attached to the claim
    this.Claim.verifyDocumentDoesNotExistOnClaim(doc)
    if (visibleToSpecialist) {
      verifyDocumentNotSensitive(doc)
    }

    linkAndSendDocument(doc, visibleToSpecialist)
  }

  function linkAndSendDocument(doc: Document, visibleToSpecialist: boolean) {
    var serviceRequestDocumentLink = this.linkDocument(doc)
    serviceRequestDocumentLink.VisibleToSpecialist = visibleToSpecialist

    if(visibleToSpecialist and this.getProgress() != ServiceRequestProgress.TC_DRAFT){
      serviceRequestDocumentLink.DateSpecialistNotified = DateUtil.currentDate()
      serviceRequestDocumentLink.addEvent(entity.ServiceRequestDocumentLink.DOCUMENT_TO_VENDOR_ADDED_EVENT)
    }
  }

  /**
   * Validates if the given document is sensitive. If so, it cannot be added to the statement.
   */
  private function verifyDocumentNotSensitive(document: Document) {
    if (document.SecurityType == DocumentSecurityType.TC_SENSITIVE) {
      throw new gw.api.util.DisplayableException(DisplayKey.get("Web.ServiceRequest.SensitiveDocumentException"))
    }
  }

  property get WaitingForInvoiceAlertText(): String {
    var someWaitingForApproval = false
    var someWaitingForPayment  = false

    for (ivc in this.Invoices) {
      someWaitingForApproval ||= ivc.IsWaitingForApproval
      someWaitingForPayment  ||= ivc.IsWaitingForPayment
      if (someWaitingForApproval and someWaitingForPayment) {
        break   // quit early if we've found one of each
      }
    }

    var msg: String
    if (someWaitingForApproval and someWaitingForPayment) {
      msg = DisplayKey.get('Web.ServiceRequest.Invoices.WaitingForApprovalOrPaymentAlert')
    }
    else if (someWaitingForApproval) {
      msg = DisplayKey.get('Web.ServiceRequest.Invoices.WaitingForApprovalAlert')
    }
    else if (someWaitingForPayment) {
      msg = DisplayKey.get('Web.ServiceRequest.Invoices.WaitingForPaymentAlert')
    }
    return msg
  }

  /**
   * Gets a list of ServiceRequestKinds that are compatible with the selected services and should be allowed for
   * this ServiceRequest. This list is intended to be used to populate a drop-down menu in the UI to let the user
   * choose a kind for the ServiceRequest.
   */
  property get AvailableKinds() : List<ServiceRequestKind> {
    return IsPromotion ? ImmutableList.of(PromotionKind) : calculateAvailableKinds(this.Instruction.Services*.Service)
  }

  static function calculateAvailableKinds(specialistServices: SpecialistService[]) : List<ServiceRequestKind> {
    var result = ServiceRequestKind.getTypeKeys(false).toSet()
    // users should not explicitly create unmanaged service requests
    result.remove(ServiceRequestKind.TC_UNMANAGED)
    // don't use non-leaf SpecialistServices when filtering, since we assume those parts of the ServiceRequest
    // are still in the process of being edited
    for (leafService in specialistServices.where(\ s -> s.Leaf)) {
      var compatibleKinds = leafService.CompatibleKinds*.Kind
      if (compatibleKinds.IsEmpty) {
        throw new DisplayableException(DisplayKey.get("Web.ServiceRequest.LeafSpecialistServiceWithoutKind", leafService.DisplayName))
      }
      result = result.intersect(compatibleKinds.toSet())
    }
    return result.order()
  }

  function updateKindBasedOnSpecialistServicesSelection(){
    var kinds = AvailableKinds
    if (kinds.Count == 0) {
      // no kinds are available after this change, so select the parent (possibly null) and show an error
      throw new IllegalStateException("No available kinds for the selected Specialist Services")
    } else if(kinds.Count == 1) {
      this.Kind = kinds.single()
    } else {
      if (not kinds.contains(this.Kind)) {
        this.Kind = null
      }
    }
  }

  property get SpecialistServicesIncompatibleWithIncident(): List<ServiceRequestInstructionService> {
    var allowedRootServices = SpecialistService.getRootsCompatibleWithIncident(this.Incident).toSet()
    return this.Instruction.Services.where(\ s -> not allowedRootServices.contains(s.Service.Ancestry.first())).toList()
  }

  /**
   * The ServiceRequestKind allowed for promoted SRs
   */
  private property get PromotionKind() : ServiceRequestKind {
    return ServiceRequestKind.TC_QUOTEANDSERVICE
  }

  /**
   * Creates a new Quote and Service request based on this Quote-Only Service Request.
   * Note: this function can only be used when IsPromotableQuoteOnly evaluates to true.
   * 
   * @return new Quote and Service request based on the information of this service request
   */
  function createPromotionFromQuoteOnlyServiceRequest(removedServiceTypes: List<ServiceRequestInstructionService>) : ServiceRequest {
    if (not IsPromotableQuoteOnly) {
      throw new IllegalStateException("service request does not satisfy promotability criteria")
    }
    var newQuoteAndServiceSR = this.Claim.newServiceRequest(this.Instruction.CustomerContact, this.Incident, this.Exposure)
    newQuoteAndServiceSR.OriginatingServiceRequest = this
    newQuoteAndServiceSR.Kind = PromotionKind
    newQuoteAndServiceSR.Progress = ServiceRequestProgress.TC_REQUESTED
    newQuoteAndServiceSR.QuoteStatus = ServiceRequestQuoteStatus.TC_APPROVED
    newQuoteAndServiceSR.Currency = this.Currency
    newQuoteAndServiceSR.Specialist = this.Specialist
    newQuoteAndServiceSR.SpecialistCommMethod = this.SpecialistCommMethod
    newQuoteAndServiceSR.RequestedServiceCompletionDate = this.DefaultRequestedServiceCompletionDate
    newQuoteAndServiceSR.RequestedQuoteCompletionDate = this.RequestedQuoteCompletionDate
    newQuoteAndServiceSR.ExpectedQuoteCompletionDate = this.ExpectedQuoteCompletionDate
  
    // Create new Instruction with this.Instruction information    
    var newInstruction = newQuoteAndServiceSR.Instruction
    newInstruction.InstructionText = this.Instruction.InstructionText    
    newInstruction.ServiceAddress = this.Instruction.ServiceAddress
    for(s in this.Instruction.Services) {
      // If the service type is not compatible with the new kind add it to the removed service types
      if(s.isCompatibleWithKind(newQuoteAndServiceSR.Kind)){
        var newService = new ServiceRequestInstructionService()
        newService.Service = s.Service
        newInstruction.addToServices(newService)     
      } else {
        removedServiceTypes.add(s)
      }
    }
    
    // Copy all quotes from this.Quotes
    var quotesMap : Map<ServiceRequestQuote, ServiceRequestQuote> = {} // represents the mapping between original quote and new quote
    for (quote in this.Quotes) {
      var newQuote = new ServiceRequestQuote() {
          :Description                  = quote.Description,
          :ExpectedDaysToPerformService = quote.ExpectedDaysToPerformService,
          :ReferenceNumber              = quote.ReferenceNumber,
          :ServiceRequest               = newQuoteAndServiceSR,
          :StatementCreationTime        = quote.StatementCreationTime
      }
      for (oldLineItem in quote.LineItems) {
        var newLineItem = new ServiceRequestStatementLineItem() {
            :ServiceRequestStatement = newQuote,
            :Amount                  = oldLineItem.Amount,
            :Description             = oldLineItem.Description,
            :Category                = oldLineItem.Category
        }
      }
      if (quote == this.LatestQuote) {
        newQuoteAndServiceSR.LatestQuote = newQuote
      }
      for (oldStmtDocLink in quote.StatementDocumentLinks) {
        var quoteDocument = oldStmtDocLink.ServiceRequestDocumentLink.LinkedDocument
        newQuote.linkDocument(quoteDocument)
      }
      quotesMap.put(quote, newQuote)
    }

    // Add the CCAssignable properties
    for (prop in (CCAssignable.Type as IEntityType).EntityProperties) {
      if(not prop.Autogenerated){
        var propInternal = (typeof newQuoteAndServiceSR).TypeInfo.getProperty(prop.Name)
        propInternal.Accessor.setValue(newQuoteAndServiceSR, prop.Accessor.getValue(this))
      }
    }
   
    // Link documents to the Service Request and quote
    for (oldDocLink in this.DocumentLinks){
      var newDocLink = newQuoteAndServiceSR.linkDocument(oldDocLink.LinkedDocument)
      newDocLink.VisibleToSpecialist = oldDocLink.VisibleToSpecialist
      newDocLink.DateSpecialistNotified = oldDocLink.DateSpecialistNotified
    }

    // Copy messages from this.Messages
    for (message in this.Messages) {
      var newMessage = new ServiceRequestMessage()
      newMessage.Title = message.Title
      newMessage.Author = message.Author
      newMessage.Type = message.Type
      newMessage.Body = message.Body
      newMessage.SendDate = message.SendDate
      newMessage.SentFromPortal = message.SentFromPortal
      newQuoteAndServiceSR.addToMessages(newMessage)
    }

    /*
     * Copy the history of originating Service Request to the new Service
    */
    this.copyHistoryAndInstructionsToNewServiceRequest(newQuoteAndServiceSR, quotesMap)
    return newQuoteAndServiceSR
  }
  
  /**
   * Perform validations for service types and record the change 
   * for the Service Request history
   */
  function finishSetupForPromotedServiceRequest() {
    
    // Validate the instruction service types
    this.Instruction.verifyServiceTypesForUI()
    
    // Assign a new Service Request Number    
    this.ServiceRequestNumber = BeanUtil.generateNextId(ServiceRequest) as String    
    
    // Update expected and requested service completion dates
    this.RequestedServiceCompletionDate = this.RequestedServiceCompletionDate
    this.ExpectedServiceCompletionDate = this.RequestedServiceCompletionDate
    // Record a change to the promotion and the originating service request to reflect promotion
    this.recordChange(DisplayKey.get("Web.ServiceRequest.StateTransition.Description.ServiceRequestPromotedFrom", this.OriginatingServiceRequest.ServiceRequestNumber), null, null, User.util.CurrentUser.Contact)
    this.OriginatingServiceRequest.recordChange(DisplayKey.get("Web.ServiceRequest.StateTransition.Description.ServiceRequestPromoted"), null, null, User.util.CurrentUser.Contact)
  }
  
  /**
   * Calculate the number of days that the Expected Quote/Service Completion Date
   * has been delayed or brought forward and creates the description to be added
   * as reason for the ServiceRequestChange
   */
  function calculateDelayDescription(originalDate: Date, isServiceDate: boolean) : String {
    var newDate = isServiceDate ? StringUtil.formatDate(this.ExpectedServiceCompletionDate, "short") : StringUtil.formatDate(this.ExpectedQuoteCompletionDate, "short")
    var dateType = isServiceDate ? DisplayKey.get("Web.ServiceRequest.ExpectedCompletionDate.Service") : DisplayKey.get("Web.ServiceRequest.ExpectedCompletionDate.Quote")
    var delayValue = DisplayKey.get("Web.ServiceRequest.StateTransition.ExpectedCompletionDate.NoChange", dateType)
    
    if (originalDate == null) {
      if (isServiceDate and this.ExpectedServiceCompletionDate != null) {
        return DisplayKey.get("Web.ServiceRequest.StateTransition.ExpectedCompletionDate.ServiceCompletionDateUpdated", StringUtil.formatDate(this.ExpectedServiceCompletionDate, "short"))
      } else if (not isServiceDate and this.ExpectedQuoteCompletionDate != null) {
        return DisplayKey.get("Web.ServiceRequest.StateTransition.ExpectedCompletionDate.QuoteCompletionDateUpdated", StringUtil.formatDate(this.ExpectedQuoteCompletionDate, "short")) 
      }
      return delayValue
    }
    var numberChangedDays = isServiceDate ? DateUtil.differenceInDays(originalDate, this.ExpectedServiceCompletionDate) : DateUtil.differenceInDays(originalDate, this.ExpectedQuoteCompletionDate)
    if (numberChangedDays == 1) {
      delayValue = DisplayKey.get("Web.ServiceRequest.StateTransition.ExpectedCompletionDate.DelayedOneDay", dateType, newDate)
    } else if (numberChangedDays > 1) {
      delayValue = DisplayKey.get("Web.ServiceRequest.StateTransition.ExpectedCompletionDate.Delayed", dateType, numberChangedDays, newDate)
    } else if (numberChangedDays == -1){
      delayValue = DisplayKey.get("Web.ServiceRequest.StateTransition.ExpectedCompletionDate.BroughtForwardOneDay", dateType, newDate)
    } else if (numberChangedDays < -1){
      delayValue = DisplayKey.get("Web.ServiceRequest.StateTransition.ExpectedCompletionDate.BroughtForward", dateType, java.lang.Math.abs(numberChangedDays), newDate)
    } 
    return delayValue
  }

  /**
   * Check whether the given document is already linked to the Service Request
   */
  private function validateNotAlreadyLinked(document: Document) {
    
    if (this.getMatchingServiceRequestDocumentLink(document) != null) {
      throw new gw.api.util.DisplayableException(DisplayKey.get("Web.ServiceRequest.DocumentAlreadyLinked", document.Name, this.ServiceRequestNumber))
    }
  }

  /**
   * Returns a list of pairs of document links and documents for this service request where
   * the user has permission to view the document.
   */
  property get ViewableDocumentLinksAndDocuments() : List<Pair<ServiceRequestDocumentLink,Document>> {
    var result = new ArrayList<Pair<ServiceRequestDocumentLink,Document>>()
    for (di in this.DocumentLinks) {
      var document = di.LinkedDocument
      if (document != null) {
        result.add(Pair.make(di,document))
      }
    }
    return result
  }

  /**
   * Returns a list of entity this Service Request can potentially be "related to". Each Service Request is associated with a Claim,
   * and can then optionally marked as "related" to one other entity, of type Incident or Exposure.
   */
  function getRelatedToCandidates(incidentsToExclude: List<Incident>): List<Object> {
    var list: List<Object> = {}

    var listOfIncident = this.Claim.Incidents.where(\i -> not incidentsToExclude.contains(i))?.toList().sortBy(\i -> i.TypePrefixedIncidentName) as ArrayList<entity.Incident>
    var listOfExposure = this.Claim.Exposures.where(\e -> not incidentsToExclude.contains(e.Incident))?.toList().sortBy(\e -> e.ClaimOrder) as ArrayList<entity.Exposure>

    list.add(this.Claim)

    // Incidents not used for workers compensation claims. Therefore only show related incidents for non-WC claims.
    if (this.Claim.LossType != LossType.TypekeyUsedForWorkersComp) {
      list.addAll(listOfIncident)
    }

    list.addAll(listOfExposure)

    return list
  }

  /**
   * Sets the entity this ServiceRequest is "related to". Each Service Request is associated
   * with an Incident, an Exposure, or the Claim itself.
   *
   * @param relatedTo The entity this Service Request should be "related to".
   *
   */
  property set RelatedTo(relatedTo: gw.pl.persistence.core.Bean) {
    if (relatedTo typeis Exposure) {
      this.Claim = relatedTo.Claim
      this.Incident = relatedTo.Incident
      this.Exposure = relatedTo
    } else if (relatedTo typeis Incident) {
      this.Claim = relatedTo.Claim
      this.Incident = relatedTo
      this.Exposure = null
    } else if (relatedTo typeis Claim) {
      this.Claim = relatedTo
      this.Incident = null
      this.Exposure = null
    } else {
      throw new IllegalArgumentException("Service Request can only be linked with Claim, Incident or Exposure.")
    }
  }

  /**
   * Gets the entity this Service Request is "related to". Each Service Request is associated
   * with an Incident, an Exposure, or the Claim itself.
   *
   * @return The entity this Service Request is "related to", or null if none is set.
   */
  property get RelatedTo(): gw.pl.persistence.core.Bean {
    return this.Exposure ?: this.Incident ?: this.Claim
  }
}
