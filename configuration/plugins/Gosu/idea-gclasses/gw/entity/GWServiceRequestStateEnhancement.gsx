package gw.entity

uses gw.api.metric.MetricLimitStatus
uses gw.api.util.DateUtil
uses gw.vendormanagement.ServiceRequestActivityPattern
uses gw.vendormanagement.ServiceRequestStatus
uses gw.vendormanagement.servicerequeststate.ServiceRequestActionHandler
uses gw.vendormanagement.servicerequeststate.ServiceRequestOperationDefinition
uses gw.vendormanagement.servicerequeststate.ServiceRequestOperationUnavailableException
uses gw.vendormanagement.servicerequeststate.ServiceRequestQuoteAndServiceStateHandler
uses gw.vendormanagement.servicerequeststate.ServiceRequestQuoteOnlyStateHandler
uses gw.vendormanagement.servicerequeststate.ServiceRequestServiceOnlyStateHandler
uses gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler
uses gw.vendormanagement.servicerequeststate.ServiceRequestUnmanagedStateHandler
uses gw.vendormanagement.servicerequeststate.ServiceRequestActionHandler.ActionDefinition
uses gw.vendormanagement.servicerequeststate.ServiceRequestOperationDefinition.OperationContext

uses java.lang.IllegalArgumentException
uses java.util.Collection
uses java.util.Date
uses java.util.Set

/**
 * Enhancement on ServiceRequest with methods for state transitions
 */
 
@Export
enhancement GWServiceRequestStateEnhancement : entity.ServiceRequest {
 
  /**
   * Checks the availability of an operation given the service request's current progress and quote status.
   * @param operation  to check for availability
   * @param toSpecialist  whether availability should be checked for specialists or for anyone
   * @return true if the ServiceRequestOperation is available given the service request's status, false otherwise;
   *         false is returned for invoice operations
   */
  function operationAvailable(operation : ServiceRequestOperation, toSpecialist : boolean = false, stateHandler : ServiceRequestStateHandler = null) : boolean {
    // No operation is available until a handler is defined
    var stateHandlerSafe = (stateHandler ?: createStateHandler())
    if (stateHandlerSafe == null) {
      return false
    }

    // The operation is not available if the current state handler does not provide a definition for it
    var operationDefinition = stateHandlerSafe.getServiceRequestOperationDefinition(operation)
    if (operationDefinition == null) {
      return false
    }

    // No operation is available if this Service Request has been promoted
    if (this.AlreadyPromoted) {
      return false
    }

    if (not operationDefinition.AvailableExpression(this)  or
        (toSpecialist and not operationDefinition.AvailableToSpecialistExpression(this))) {
      return false
    }

    return true
  }

  /**
   * Checks if any of the given operations are available to anyone
   */
  function anyOperationAvailable (operations: Collection<ServiceRequestOperation>, stateHandler : ServiceRequestStateHandler = null): boolean {
    return operations.hasMatch(\ operation -> operationAvailable(operation,false, stateHandler))
  }
 
  /**
   * Performs an operation on the service request such as adding a quote or canceling the service request.
   * Operations may only be performed on a fully-set-up service request. For example, during the process of
   * creating a service request through the UI, finishSetup() should be called before attempting to perform
   * operations.
   * @param operation to perform
   * @param context that contains the parameters to perform the operation
   * @param commitInNewBundle flag to indicate if the operation should happen in a separate bundle
   * @param isSpecialist true if the operation is being performed by the specialist; this
   *                     affects how the availability of the operation is computed
   */
  function performOperation(operation : ServiceRequestOperation, context: OperationContext, isSpecialist : boolean = false, stateHandler : ServiceRequestStateHandler = null) {

    var definition = (stateHandler ?: createStateHandler())?.getServiceRequestOperationDefinition(operation)
    if (not operationAvailable(operation,isSpecialist)) {
      throw new ServiceRequestOperationUnavailableException(operation.DisplayName, this)
    }
    if (context == null) {
      context = new OperationContext()
    } else {
      context = new OperationContext(context)
    }

    // Validate the fields in the context are correct
    var requiredFields = ServiceRequestOperationDefinition.getRequiredFields(operation)
    if(requiredFields*.RootType.hasMatch(\ i -> i != context.IntrinsicType)) {
      throw new IllegalArgumentException("The required fields for '" + operation.DisplayName + "' contains OperationContext properties that are not compatible with the current context")
    } 
    for (field in OperationContext.Type.TypeInfo.DeclaredProperties.where(\ prop -> prop.Public)) {
      if (requiredFields*.PropertyInfo.contains(field)) {
        if (field.Accessor.getValue(context) == null) {
          throw new IllegalArgumentException("The field '" + field.DisplayName + "' is required in the OperationContext to perform the operation '" + operation.DisplayName +"'")
        }
      } else {
        if (field.Accessor.getValue(context) != null) {
          throw new IllegalArgumentException("You must add '" + field.DisplayName + "' as a required field in ServiceRequestOperation for operation '" + operation.DisplayName +"'")
        }
      }
    }

    if (context.Operation != null) {
      throw new IllegalArgumentException("Operation cannot be specified on an OperationContext passed to performOperation; it will be set automatically")
    }
    if (context.PerformedBySpecialist != null) {
      throw new IllegalArgumentException("PerformedBySpecialist cannot be specified on an OperationContext passed to performOperation; it will be set automatically")
    }
    context.Operation = operation
    context.PerformedBySpecialist = isSpecialist
    
    transitionServiceRequestStateAndRecordChange(definition, context)
  }

  /**
   * Gets whether the Service Request is in an "active" state
   */
  property get IsActive(): boolean {
    return this.Progress != ServiceRequestProgress.TC_CANCELED
        and this.Progress != ServiceRequestProgress.TC_EXPIRED
        and this.Progress != ServiceRequestProgress.TC_DECLINED
  }

  /**
   * Gets whether the Service Request is in a "done" state
   */
  property get IsDone(): boolean {
    return this.Progress == ServiceRequestProgress.TC_WORKCOMPLETE
  }

  /**
   * Returns whether this ServiceRequest is "overdue", which indicates that an expected completion date has
   * passed without the specialist performing the desired action.
   * @return  true if the ServiceRequest is overdue
   */
  function isOverdue(stateHandler : ServiceRequestStateHandler = null): boolean {
    var currentDate = Date.CurrentDate
    var stateHandlerSafe = (stateHandler ?: createStateHandler())
    return stateHandlerSafe.isExpectedQuoteCompletionDateApplicable(this) and
                   this.ExpectedQuoteCompletionDate < currentDate  or
           stateHandlerSafe.isExpectedServiceCompletionDateApplicable(this) and
                   this.ExpectedServiceCompletionDate < currentDate
  }
  

  /**
   * Gets whether the Action required icon should be displayed
   */
  function actionRequiredVisible(stateHandler: ServiceRequestStateHandler = null): boolean {
    return this.Progress == ServiceRequestProgress.TC_DRAFT
        or (this.IsActive
            and (this.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORAPPROVAL
            or this.Invoices.hasMatch(\ i -> i.ActionRequiredVisible))
        )
        or (this.nextActionDefinition(stateHandler).ActionOwner != null
            and this.nextActionDefinition(stateHandler).ActionOwner == this.AssignedUser.Contact)
  }

  /**
   * Gets the action required icon for this Service Request
   */
  function actionRequiredIcon(stateHandler : ServiceRequestStateHandler = null) : ServiceRequestStatus {
    return actionRequiredVisible(stateHandler) ? ServiceRequestStatus.ATTENTION : ServiceRequestStatus.NONE
  }
    
  /**
   * Gets the status icon for this Service Request
   */
  property get StatusIcon(): ServiceRequestStatus {
    var progress = this.Progress
    if (progress == ServiceRequestProgress.TC_REQUESTED) {
      return convertMetricStatusToServiceRequestStatus(this.SpecialistInitialResponseTimeServiceRequestMetric.Status)
      
    } else if (progress == ServiceRequestProgress.TC_SPECIALISTWAITING or progress == ServiceRequestProgress.TC_INPROGRESS) {
      var metricStatus = ServiceRequestStatus.GREEN
      
      if (this.ServiceTimelinessServiceRequestMetric.StartTime != null) {
        metricStatus = convertMetricStatusToServiceRequestStatus(this.ServiceTimelinessServiceRequestMetric.Status)
      } else if (this.QuoteTimelinessServiceRequestMetric.StartTime  != null) {
        metricStatus = convertMetricStatusToServiceRequestStatus(this.QuoteTimelinessServiceRequestMetric.Status)
      }
      return metricStatus      
    } else if (progress == ServiceRequestProgress.TC_WORKCOMPLETE) {
       return ServiceRequestStatus.COMPLETE
    } 
    return ServiceRequestStatus.INACTIVE // all other progress values, including draft, declined, canceled, and expired
  }

  /**
   * Gets the corresponding ServiceRequestStateIcon for the metricIcon.
   */
  private function convertMetricStatusToServiceRequestStatus(metricStatus: MetricLimitStatus): ServiceRequestStatus {
    switch (metricStatus) {
      case MetricLimitStatus.NONE:       return ServiceRequestStatus.NONE
      case MetricLimitStatus.INACTIVE:   return ServiceRequestStatus.INACTIVE
      case MetricLimitStatus.GREEN:      return ServiceRequestStatus.GREEN
      case MetricLimitStatus.YELLOW:     return ServiceRequestStatus.YELLOW
      case MetricLimitStatus.RED:        return ServiceRequestStatus.RED
      default:                           return ServiceRequestStatus.NONE
    }
  }

  /**
   * Gets the next action definition
   */
  function nextActionDefinition(stateHandler : ServiceRequestStateHandler = null) : ActionDefinition {
    return ServiceRequestActionHandler.getNextAction(this, stateHandler)
  }

  property get CompletionDate() : Date {
    return this.Progress == ServiceRequestProgress.TC_WORKCOMPLETE ?
        this.OrderedHistory.lastWhere(\ c -> c.New_Progress == ServiceRequestProgress.TC_WORKCOMPLETE).Timestamp :
        null
  }

  /**
   * Returns whether this ServiceRequest has reached a terminal state
   */
  static property get TerminalProgressValues() : Set<ServiceRequestProgress> {
    return ServiceRequestProgress.TF_TERMINAL.TypeKeys.toSet()
  }

  /**
   * Returns whether this ServiceRequest has reached a terminal progres value
   */
  property get Terminated() : boolean {
    return TerminalProgressValues.contains(this.Progress)
  }

  /**
   * Returns whether this ServiceRequest can have quotes
   */
  function quoteAllowed(stateHandler : ServiceRequestStateHandler = null) : boolean {
    return (stateHandler ?: createStateHandler()).AllowsQuote
  }

  /**
   * Returns whether this ServiceRequest can have invoices
   */
  function invoiceAllowed(stateHandler : ServiceRequestStateHandler = null) : boolean {
    return (stateHandler ?: createStateHandler()).AllowsInvoices
  }
  
  /**
   * Retrieves the instance for each ServiceRequestKind implementation 
   * @return new implementation instance corresponding to this.Kind
   */ 
  function createStateHandler() : ServiceRequestStateHandler {
    switch (this.Kind) {
      case TC_QUOTEANDSERVICE : return new ServiceRequestQuoteAndServiceStateHandler()
      case TC_QUOTEONLY : return new ServiceRequestQuoteOnlyStateHandler()
      case TC_SERVICEONLY : return new ServiceRequestServiceOnlyStateHandler()
      case TC_UNMANAGED : return new ServiceRequestUnmanagedStateHandler()
    }
    return null
  }
  
  /**
   * Gets whether this service request has been in "specialist waiting" state
   * for more than a global threshold.
   */
  property get PassedWaitingThreshold(): boolean {
    var changeToWaitingStateDate = DateChangedToWaitingState
    return this.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING 
           and changeToWaitingStateDate != null 
           and (changeToWaitingStateDate.businessDaysBetween(Date.CurrentDate, this.Instruction.ServiceAddress) > this.GlobalSpecialistWaitingThreshold)
  }
  
  /**
   * Gets the Expected Completion date based on the Service Request state
   */  
  function nextExpectedCompletionDate(stateHandler : ServiceRequestStateHandler = null): Date {
    if (expectedQuoteCompletionDateApplies(stateHandler)){
      return this.ExpectedQuoteCompletionDate
    } else if (expectedServiceCompletionDateApplies(stateHandler)) {
      return this.ExpectedServiceCompletionDate
    }
    return null
  }
  
  /**
   * Gets whether the expected quote completion date can be updated
   */
  function expectedQuoteCompletionDateApplies(stateHandler : ServiceRequestStateHandler = null): boolean {
    return (stateHandler ?: createStateHandler()).isExpectedQuoteCompletionDateApplicable(this)
  }
  
  /**
   * Gets whether the expected service completion date can be updated 
   */
  function expectedServiceCompletionDateApplies(stateHandler : ServiceRequestStateHandler = null): boolean {
    return (stateHandler ?: createStateHandler()).isExpectedServiceCompletionDateApplicable(this)
  }
  
  /**
   * Perform the operation for updating the corresponding expected completion date with the 
   * newExpectedCompletionDate and record the change.
   */
  function setExpectedCompletionDateAndRecordChange(newExpectedCompletionDate: Date, changeReason: String, isSpecialist : boolean, isService : boolean, stateHandler : ServiceRequestStateHandler = null) {
    var context = new ServiceRequestOperationDefinition.OperationContext(){:ExpectedCompletionDate = newExpectedCompletionDate,
                                                                           :Reason = changeReason?: "", 
                                                                           :OriginalDate = expectedQuoteCompletionDateApplies(stateHandler) ? this.ExpectedQuoteCompletionDate : this.ExpectedServiceCompletionDate}
    this.performOperation(isService ? TC_UPDATESERVICEECD : TC_UPDATEQUOTEECD, context, isSpecialist, stateHandler)
  }
  
  /**
   * Perform the operation for accepting the work and record the change. This includes setting the expected completion date
   * to the corresponding field based on the service request state
   */
  function acceptWorkAndRecordChange(expectedCompletionDate: Date, isSpecialist : boolean) {
    var context = new OperationContext(){:ExpectedCompletionDate = (expectedCompletionDate == null) ? DateUtil.currentDate() : expectedCompletionDate}
    this.performOperation(TC_SPECIALISTACCEPTEDWORK, context, isSpecialist)
  }
  
  function isInstructedToProvideQuote(stateHandler : ServiceRequestStateHandler = null): boolean {
    return (stateHandler ?: createStateHandler()).isInstructedToProvideQuote(this)
  }

  /**
   * Creates a new activity assigned to the Service Request Owner indicating an operation was performed.
   */
  function createNewActivity(activityPattern: ServiceRequestActivityPattern): Activity {
    return createNewActivity(activityPattern, null, null, null)
  }
  
  /**
   * Creates a new activity assigned to the Service Request Owner indicating an operation was performed.
   */
  function createNewActivity(activityPattern: ActivityPattern): Activity {
    return createNewActivity(activityPattern, null, null, null)
  }

  /**
   * Creates a new activity assigned to the Service Request Owner indicating an operation was performed.
   * The new activity contains the statement documents
   */
  function createNewActivity(activityPattern: ServiceRequestActivityPattern, statement: ServiceRequestStatement): Activity {
    return createNewActivity(activityPattern, null, null, statement)
  }
  
  /**
   * Creates a new activity assigned to the Service Request Owner indicating a change made to the service request.
   * This method is used to indicate when an specialist performed an operation
   */
  function createNewActivity(pattern: ServiceRequestActivityPattern, subject: String, description: String, statement: ServiceRequestStatement): Activity {
    return createNewActivity(pattern.Pattern, subject, description, statement)
  }

  /**
   * Creates a new activity assigned to the Service Request Owner indicating a change made to the service request.
   * This method is used to indicate when an specialist performed an operation
   */
  function createNewActivity(activityPattern: ActivityPattern, subject: String, description: String, statement: ServiceRequestStatement): Activity {
    var activity = this.Claim.createActivityFromPattern(null, activityPattern)
    activity.RelatedTo = this
    activity.assignUserAndDefaultGroup(this.AssignedUser)
    if (subject.HasContent) {
      activity.Subject = subject
    }
    if (description.HasContent) {
      activity.Description = description
    }
    if (statement != null) {
      statement.Documents.each(\ d -> activity.addLinkedDocument(d))
    }
    this.addToActivities(activity)
    return activity
  }

  function isInstructedToPerformService(stateHandler : ServiceRequestStateHandler = null): boolean {
    return (stateHandler ?: createStateHandler()).isInstructedToPerformService(this)
  }
  
  /**
   * Gets the date when the Service Request last changed to "specialist waiting" state
   */
  private property get DateChangedToWaitingState(): Date {
    return this.OrderedHistory
               .lastWhere(\ change -> change.Progress_Chg and change.New_Progress == ServiceRequestProgress.TC_SPECIALISTWAITING)
               .Timestamp
  }
  
  /**
   * Perform the state transition and create a ServiceRequestChange object recording the change
   */
  private function transitionServiceRequestStateAndRecordChange(operationDefinition : ServiceRequestOperationDefinition,
                                                                context: OperationContext) {
    var initiator = context.PerformedBySpecialist ? this.Specialist : User.util.CurrentUser.Contact
    operationDefinition.ActionExpression(this, context)
    this.addEvent(generateEventID(context.Operation))
    this.Progress = operationDefinition.NewProgressExpression(this, context)
    this.QuoteStatus = operationDefinition.NewQuoteStatusExpression(this, context)
    this.recordChange(operationDefinition.DescriptionExpression(this, context), context.Operation, context.Statement, initiator)
  }

  private static function generateEventID(operation : ServiceRequestOperation) : String {
    return "ServiceRequestOperation_" + operation.Code
  }
}
