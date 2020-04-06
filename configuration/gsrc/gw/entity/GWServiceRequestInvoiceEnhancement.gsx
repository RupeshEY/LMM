package gw.entity

uses gw.api.locale.DisplayKey
uses gw.vendormanagement.ServiceRequestStatementEditHelper
uses gw.vendormanagement.ServiceRequestStatus
uses gw.vendormanagement.servicerequeststate.ServiceRequestInvoiceOperationDefinition
uses gw.vendormanagement.servicerequeststate.ServiceRequestOperationDefinition
uses gw.vendormanagement.servicerequeststate.ServiceRequestOperationUnavailableException
uses gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler

uses java.lang.IllegalArgumentException
uses java.util.Collection
uses gw.vendormanagement.ServiceRequestActivityPattern

@Export
enhancement GWServiceRequestInvoiceEnhancement : entity.ServiceRequestInvoice {

  function pay() {
    performOperation(ServiceRequestOperation.TC_PAYINVOICE, new ServiceRequestInvoiceOperationDefinition.OperationContext(), false)
  }

  function finishSetup(isSpecialist : boolean) {
    
    this.Status = ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL
    var serviceRequest = this.ServiceRequest
    ServiceRequestStatementEditHelper.removeUnusedDocuments(this)
    
    var context = new ServiceRequestOperationDefinition.OperationContext(){:Statement = this}
    serviceRequest.performOperation(TC_ADDINVOICE, context, isSpecialist)
    ServiceRequestStatementEditHelper.clearAttachedToStatementDocuments(this)
  }
  
  property get IsActive(): boolean {
    return !(this.Status == ServiceRequestInvoiceStatus.TC_REJECTED or this.Status == ServiceRequestInvoiceStatus.TC_WITHDRAWN)
  }

  /**
   * Checks the availability of an operation given the invoice status and service request's current progress.
   * @param operation  to check for availability
   * @param toSpecialist  whether availability should be checked for specialists or for anyone
   * @return true if the ServiceRequestOperation is available given the invoice's status, false otherwise
   */
  function operationAvailable(operation : ServiceRequestOperation, toSpecialist : boolean = false, stateHandler : ServiceRequestStateHandler = null) : boolean {
    // No operation is available until a handler is defined
    var stateHandlerSafe = stateHandler ?: this.ServiceRequest.createStateHandler()
    if (stateHandlerSafe == null) {
      return false
    }

    // If there is not a definition for the operation in the implementation for invoice's ServiceRequest.Kind
    var operationDefinition = stateHandlerSafe.getInvoiceOperationDefinition(operation)
    if (operationDefinition == null) {
      return false
    }

    // No operation is available if the Service Request has been promoted
    if (this.ServiceRequest.AlreadyPromoted) {
      return false
    }

    if (not operationDefinition.AvailableExpression(this)  or
        (toSpecialist and not operationDefinition.AvailableToSpecialistExpression(this))) {
      return false
    }

    return true
  }
  
  /**
   * Performs an operation on the invoice such as approving, adding, rejecting or paying an invoice
   * @param operation to perform
   * @param reason optional reason to record in a history record
   * @param commitInNewBundle flag to indicate if the operation should happen in a separate bundle
   */
  function performOperation(operation : ServiceRequestOperation, context: ServiceRequestInvoiceOperationDefinition.OperationContext, isSpecialist : boolean = false, stateHandler : ServiceRequestStateHandler = null, performedBySystem : boolean = false) {
    var stateHandlerSafe = stateHandler ?: this.ServiceRequest.createStateHandler()
    var definition = (stateHandlerSafe)?.getInvoiceOperationDefinition(operation)
    if (not operationAvailable(operation, isSpecialist, stateHandlerSafe)) {
      throw new ServiceRequestOperationUnavailableException(operation.DisplayName, this)
    }
    if (context == null) {
      context = new ServiceRequestInvoiceOperationDefinition.OperationContext()
    } else {
      context = new ServiceRequestInvoiceOperationDefinition.OperationContext(context)
    }

    if (performedBySystem and isSpecialist) {
      throw new IllegalArgumentException("performedBySystem and isSpecialist cannot both be true")
    }

    // Validate the fields in the context are correct
    var requiredFields = ServiceRequestOperationDefinition.getRequiredFields(operation)
    if(requiredFields*.RootType.hasMatch(\ i -> i != context.IntrinsicType)) {
      throw new IllegalArgumentException("The required fields for '" + operation.DisplayName + "' contains OperationContext properties that are not compatible with the current context")
    } 
    
    for (field in ServiceRequestInvoiceOperationDefinition.OperationContext.Type.TypeInfo.DeclaredProperties.where(\ prop -> prop.Public)) {
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
    context.Operation             = operation
    context.PerformedBySpecialist = isSpecialist
    context.PerformedBySystem     = performedBySystem

    transitionServiceRequestStateAndRecordChange(definition, context)
  }
  
  /**
   * Checks if any of the given operations are available to anyone
   */
  function anyOperationAvailable (operations: Collection<ServiceRequestOperation>, stateHandler : ServiceRequestStateHandler = null): boolean {
    return operations.hasMatch(\ operation -> operationAvailable(operation,false, stateHandler))
  }

  /**
   * Gets the action icon for this Invoice 
   */
  property get ActionRequiredIcon(): ServiceRequestStatus {
    return ActionRequiredVisible ? ServiceRequestStatus.ATTENTION : ServiceRequestStatus.NONE
  }
  
  /**
   * Gets whether the invoice action required icon should be displayed
   */
  property get ActionRequiredVisible(): boolean {
    return IsWaitingForApproval or IsWaitingForPayment
  }

  /**
   * Gets the invoice action required message to display
   */
  property get ActionRequiredMessage(): String {
    var answer: String
    if (IsWaitingForApproval) {
      answer = DisplayKey.get('Web.ServiceRequest.Invoice.WaitingForApprovalAlert')
    }
    else if (IsWaitingForPayment) {
      answer = DisplayKey.get('Web.ServiceRequest.Invoice.WaitingForPaymentAlert')
    }
    return answer
  }

  property get HasConsistentCheckCurrency() : boolean {
    if(this.Check != null) {
      return this.Check.Currency == this.ServiceRequest.Currency
    }
    return true
  }

  /**
   * Returns whether this invoice is awaiting manual (user-initiated) approval.
   * @return true if the invoice is WAITINGFORAPPROVAL and auto-approval was attempted but unsuccessful, and false
   * otherwise.
   */
  property get IsWaitingForManualApproval(): boolean {
    return IsWaitingForApproval and this.DeclinedReason.HasContent
  }

  /**
   * @return true if this statement is approved, false otherwise.
   */
  property get IsWaitingForPayment(): boolean {
    return this.Status == ServiceRequestInvoiceStatus.TC_APPROVED
  }

  /**
   * Returns true if this statement is approved, false otherwise.
   */
  property get IsWaitingForApproval(): boolean {
    return this.Status == ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL
  }

  /**
   * Returns true if this statement is paid, false otherwise.
   */
  property get IsPaid(): boolean {
    return this.Status == ServiceRequestInvoiceStatus.TC_CHECKCREATED
  }

  /**
   * Perform the invoice operation and create a ServiceRequestChange object recording the change
   */
  private function transitionServiceRequestStateAndRecordChange(operationDefinition : ServiceRequestInvoiceOperationDefinition,
                                                                context : ServiceRequestInvoiceOperationDefinition.OperationContext) {
    var initiator = context.PerformedBySpecialist
        ? this.ServiceRequest.Specialist
        : User.util.CurrentUser.Contact

    var previousStatus = this.Status
    operationDefinition.ActionExpression(this, context)
    this.addEvent(generateEventID(context.Operation))
    this.Status   = operationDefinition.NewInvoiceStatusExpression(this, context)

    completeAnyOpenObsoleteActivities(previousStatus)

    this.ServiceRequest.recordChange(operationDefinition.DescriptionExpression(this,context), context.Operation, this, initiator)
  }

  private function completeAnyOpenObsoleteActivities(previousStatus: ServiceRequestInvoiceStatus) {
    // no point looking unless the invoice's status has changed
    if (this.Status == previousStatus) {
      return
    }

    var obsoletePattern: ActivityPattern

    // if the status used to be "waiting for approval"
    if (previousStatus == ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL) {
      obsoletePattern = ServiceRequestActivityPattern.INVOICE_NOT_AUTO_APPROVED.Pattern
    }
    // or it used to be "approved" (i.e. waiting for payment)
    else if (previousStatus == ServiceRequestInvoiceStatus.TC_APPROVED) {
      obsoletePattern = ServiceRequestActivityPattern.INVOICE_NOT_AUTO_PAID.Pattern
    }

    // if we've identified an obsolete pattern
    if (obsoletePattern != null) {
      final var anyInvoicesHaveOldStatus = this.ServiceRequest.Invoices.hasMatch(\ invoice -> invoice.Status == previousStatus)

      // and no invoices have the old status
      if (not anyInvoicesHaveOldStatus) {
        final var activities = this.ServiceRequest.Activities
        // then go ahead and complete any with that pattern
        for (act in activities) {
          if (act.Status == ActivityStatus.TC_OPEN and act.ActivityPattern == obsoletePattern) {
            act.complete()
          }
        }
      }
    }
  }

  private static function generateEventID(operation : ServiceRequestOperation) : String {
    return "ServiceRequestInvoiceOperation_" + operation.Code
  }
}
