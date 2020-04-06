package gw.vendormanagement.servicerequeststate

uses gw.api.locale.DisplayKey
uses gw.api.util.DateUtil
uses gw.api.util.StringUtil
uses gw.vendormanagement.ServiceRequestActivityPattern
uses java.util.Map
uses java.util.Date

@Export
class ServiceRequestQuoteAndServiceStateHandler extends ServiceRequestStateHandler {

  private final var SERVICE_REQUEST_OPERATION_DEFINITIONS : Map<ServiceRequestOperation, ServiceRequestOperationDefinition> = {
    ServiceRequestOperation.TC_SUBMITINSTRUCTION -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress == ServiceRequestProgress.TC_DRAFT and sr.Specialist != null,
          :AvailableToSpecialistExpression = \sr, context -> false,
          :ActionExpression         = \sr, context -> { // send documents marked as "VisibleToSpecialist" and update "DateSpecialistNotified"
                                                        for (srDoc in sr.DocumentLinks) {
                                                          if (srDoc.VisibleToSpecialist and srDoc.DateSpecialistNotified == null) {
                                                            srDoc.DateSpecialistNotified = DateUtil.currentDate()
                                                          }
                                                        }
                                                        // Set the expected quote completion date
                                                        sr.ExpectedQuoteCompletionDate = sr.RequestedQuoteCompletionDate
                                                      },
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_REQUESTED,
          :NewQuoteStatusExpression = \sr, context -> ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE,
          :DescriptionExpression    = \sr, context -> { return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InstructionSubmitted")}},
          
    ServiceRequestOperation.TC_SPECIALISTACCEPTEDWORK -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress == ServiceRequestProgress.TC_REQUESTED,
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> {
                                                          if (sr.isInstructedToProvideQuote(this)) {
                                                            sr.ExpectedQuoteCompletionDate = context.ExpectedCompletionDate
                                                          } else {
                                                            sr.ExpectedServiceCompletionDate = context.ExpectedCompletionDate
                                                          }
                                                       },
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_INPROGRESS,
          :DescriptionExpression    = \sr, context -> {
                                                        if (sr.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE) {
                                                          return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistAcceptedWork.Quote", StringUtil.formatDate(context.ExpectedCompletionDate,"short"))  
                                                        } else {
                                                          return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistAcceptedWork.Service", StringUtil.formatDate(context.ExpectedCompletionDate,"short"))  
                                                        }
                                                      }},
                                                      
    ServiceRequestOperation.TC_ADDQUOTE -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress != ServiceRequestProgress.TC_WORKCOMPLETE  and  quoteActionsAvailable(sr),
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> { /* Note: It is required that the quote in the context is added to the Service Request before performing this operation */
                                                        if (sr.Progress == ServiceRequestProgress.TC_REQUESTED) {
                                                          sr.acceptWorkAndRecordChange(sr.ExpectedQuoteCompletionDate, context.PerformedBySpecialist)
                                                        }
                                                        var quote = context.Statement as ServiceRequestQuote
                                                        quote.StatementCreationTime = Date.CurrentDate
                                                        sr.LatestQuote = quote
                                                        if (context.PerformedBySpecialist) {
                                                          sr.createNewActivity(ServiceRequestActivityPattern.VENDOR_ADDED_QUOTE, quote)
                                                        }
                                                      },    
          :NewProgressExpression    = \sr, context -> (sr.Progress == ServiceRequestProgress.TC_REQUESTED or
                                              sr.Progress == ServiceRequestProgress.TC_INPROGRESS) ? 
                                              ServiceRequestProgress.TC_SPECIALISTWAITING : sr.Progress,
          :NewQuoteStatusExpression = \sr, context -> ServiceRequestQuoteStatus.TC_WAITINGFORAPPROVAL,
          :DescriptionExpression    = \sr, context -> { var quote = context.Statement as ServiceRequestQuote
                                                        if (sr.Quotes.Count == 1) { // If it is first quote, record a change for quote added. Otherwise, record a change for quote revised
                                                          return quote.ReferenceNumber.HasContent ? 
                                                            DisplayKey.get("Web.ServiceRequest.StateTransition.Description.AddedQuoteWithReferenceNumber", quote.ReferenceNumber, quote.Amount) :
                                                            DisplayKey.get("Web.ServiceRequest.StateTransition.Description.AddedQuote", quote.Amount)
                                                        } 
                                                        return quote.ReferenceNumber.HasContent ? 
                                                            DisplayKey.get("Web.ServiceRequest.StateTransition.Description.RevisedQuoteWithReferenceNumber", quote.ReferenceNumber, quote.Amount) :
                                                            DisplayKey.get("Web.ServiceRequest.StateTransition.Description.RevisedQuote", quote.Amount)
                                                      }},
                                                                                                                               
    ServiceRequestOperation.TC_APPROVEQUOTE -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORAPPROVAL and quoteActionsAvailable(sr),
          :AvailableToSpecialistExpression = \sr, context -> false,
          :ActionExpression         = \sr, context -> {// Set the expected service completion date if the work is not already complete
                                                        if(not sr.IsDone) {
                                                          sr.RequestedServiceCompletionDate = context.RequestedCompletionDate
                                                          sr.ExpectedServiceCompletionDate = context.RequestedCompletionDate
                                                        }
                                                        sr.LatestQuote.ApprovalDate = Date.CurrentDate
                                                        sr.LatestQuote.ApprovedBy = User.util.CurrentUser},
          :NewProgressExpression    = \sr, context -> sr.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING ? ServiceRequestProgress.TC_INPROGRESS : sr.Progress,
          :NewQuoteStatusExpression = \sr, context -> ServiceRequestQuoteStatus.TC_APPROVED,
          :DescriptionExpression    = \sr, context -> { var quote = context.Statement as ServiceRequestQuote
                                                        return quote.ReferenceNumber.HasContent ? 
                                                          DisplayKey.get("Web.ServiceRequest.StateTransition.Description.QuoteApprovedWithReferenceNumber", quote.ReferenceNumber, quote.Amount) :
                                                          DisplayKey.get("Web.ServiceRequest.StateTransition.Description.QuoteApproved", quote.Amount)
                                                      }},                                              
    
    ServiceRequestOperation.TC_SPECIALISTCOMPLETEDWORK -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> getServiceInProgress(sr) or getSpecialistWaitingForCustomer(sr),
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> { if (context.PerformedBySpecialist) {
                                                          sr.createNewActivity(ServiceRequestActivityPattern.VENDOR_COMPLETED_WORK)
                                                        }
                                                      },
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_WORKCOMPLETE,
          :DescriptionExpression    = \sr, context -> {return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistCompletedWork")}},


    ServiceRequestOperation.TC_ADDINVOICE -> ServiceRequestStandardInvoiceOperationDefinitions.AddInvoiceDefinition,
                                                        
    ServiceRequestOperation.TC_REQUESTREQUOTE -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORAPPROVAL and quoteActionsAvailable(sr),
          :AvailableToSpecialistExpression = \sr, context -> false,
          :ActionExpression         = \sr, context -> {sr.RequestedQuoteCompletionDate = context.RequestedCompletionDate
                                                        sr.ExpectedQuoteCompletionDate = context.RequestedCompletionDate
                                                        sr.LatestQuote.DeclinedReason = context.Reason
                                                      },
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_INPROGRESS ,
          :NewQuoteStatusExpression = \sr, context -> ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE,
          :DescriptionExpression    = \sr, context -> { var reason = context.Reason
                                                        return reason.HasContent ? 
                                                          DisplayKey.get("Web.ServiceRequest.StateTransition.Description.RequoteRequestedWithReason", reason) :
                                                          DisplayKey.get("Web.ServiceRequest.StateTransition.Description.RequoteRequested") 
                                                      }},                                            
                                    
    ServiceRequestOperation.TC_SPECIALISTWAITING -> new ServiceRequestOperationDefinition(){
          :AvailableExpression        = \sr, context -> getServiceInProgress(sr),
          :AvailableToSpecialistExpression = \sr, context -> true,
          :NewProgressExpression      = \sr, context -> ServiceRequestProgress.TC_SPECIALISTWAITING,
          :DescriptionExpression      = \sr, context -> { var reason = context.Reason
                                                          return reason.HasContent ? 
                                                            DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistWaitingWithReason", reason) :
                                                            DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistWaiting") 
                                                        }},
    
    ServiceRequestOperation.TC_SPECIALISTRESUMEDWORK -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> getSpecialistWaitingForCustomer(sr),
          :AvailableToSpecialistExpression = \sr, context -> true,
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_INPROGRESS,
          :DescriptionExpression    = \sr, context -> { return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistResumedWork")}},

    ServiceRequestOperation.TC_UPDATEQUOTEECD -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.expectedQuoteCompletionDateApplies(this),
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> { var originalDate = context.OriginalDate
                                                        var newDate = context.ExpectedCompletionDate
                                                        sr.ExpectedQuoteCompletionDate = newDate
                                                        if (context.PerformedBySpecialist and newDate > originalDate) {
                                                          sr.createNewActivity(ServiceRequestActivityPattern.VENDOR_ADDED_DELAY)
                                                        }
                                                      },
          :DescriptionExpression    = \sr, context -> { var changeReason = context.Reason
                                                        var description =  sr.calculateDelayDescription(context.OriginalDate, false)
                                                        return changeReason.HasContent ?
                                                                 DisplayKey.get("Web.ServiceRequest.StateTransition.Description.ExpectedCompletionDateChangedWithReason", description, changeReason) :
                                                                 description}},

    ServiceRequestOperation.TC_UPDATESERVICEECD -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.expectedServiceCompletionDateApplies(this),
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> { var originalDate = context.OriginalDate
                                                        var newDate = context.ExpectedCompletionDate
                                                        sr.ExpectedServiceCompletionDate = newDate
                                                        if (context.PerformedBySpecialist and newDate > originalDate) {
                                                          sr.createNewActivity(ServiceRequestActivityPattern.VENDOR_ADDED_DELAY)
                                                        }
                                                      },
          :DescriptionExpression    = \sr, context -> { var changeReason = context.Reason
                                                        var description =  sr.calculateDelayDescription(context.OriginalDate, true)
                                                        return changeReason.HasContent ?
                                                                 DisplayKey.get("Web.ServiceRequest.StateTransition.Description.ExpectedCompletionDateChangedWithReason", description, changeReason) :
                                                                 description}},

    ServiceRequestOperation.TC_SPECIALISTDECLINED -> new ServiceRequestOperationDefinition(){
          :AvailableExpression        = \sr, context -> sr.Progress == ServiceRequestProgress.TC_REQUESTED,
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> { if (context.PerformedBySpecialist) {
                                                          sr.createNewActivity(ServiceRequestActivityPattern.VENDOR_DECLINED_WORK)
                                                        }
                                                      },
          :NewProgressExpression      = \sr, context -> ServiceRequestProgress.TC_DECLINED,
          :NewQuoteStatusExpression   = \sr, context -> sr.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE ? ServiceRequestQuoteStatus.TC_NOQUOTE : sr.QuoteStatus,
          :DescriptionExpression      = \sr, context -> { var reason = context.Reason
                                                          return reason.HasContent ? 
                                                            DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistDeclinedWorkWithReason", reason) :
                                                            DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistDeclinedWork") 
                                                        }},
                                                        
    ServiceRequestOperation.TC_CANCELSERVICEREQUEST -> new ServiceRequestOperationDefinition(){
          :AvailableExpression        = \sr, context -> sr.Progress == ServiceRequestProgress.TC_DRAFT or
                                               sr.Progress == ServiceRequestProgress.TC_REQUESTED or
                                               sr.Progress == ServiceRequestProgress.TC_INPROGRESS or
                                               sr.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING,
          :AvailableToSpecialistExpression = \sr, context -> false,
          :ActionExpression           = \sr, context -> {sr.CanceledReason = context.Reason},
          :NewProgressExpression      = \sr, context -> ServiceRequestProgress.TC_CANCELED,
          :NewQuoteStatusExpression   = \sr, context -> sr.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE ? ServiceRequestQuoteStatus.TC_NOQUOTE : sr.QuoteStatus,
          :DescriptionExpression      = \sr, context -> { var reason = context.Reason
                                                          return reason.HasContent ? 
                                                            DisplayKey.get("Web.ServiceRequest.StateTransition.Description.ServiceRequestCanceledWithReason", reason) :
                                                            DisplayKey.get("Web.ServiceRequest.StateTransition.Description.ServiceRequestCanceled")
                                                        }},

    ServiceRequestOperation.TC_SPECIALISTCANCELED -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress == ServiceRequestProgress.TC_INPROGRESS or sr.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING,
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> { if (context.PerformedBySpecialist) {
                                                          sr.createNewActivity(ServiceRequestActivityPattern.VENDOR_CANCELED_WORK)
                                                        }
                                                      },
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_DECLINED,
          :DescriptionExpression    = \sr, context -> { var reason = context.Reason
                                                          return reason.HasContent ? 
                                                            DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistCanceledWorkWithReason", reason) :
                                                            DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistCanceledWork")
                                                        }}
  }  
  
  private final var INVOICE_OPERATIONS_DEFINITIONS = ServiceRequestStandardInvoiceOperationDefinitions.AllInvoiceOperationDefinitions

  override function getServiceRequestOperationDefinition(operation: ServiceRequestOperation): ServiceRequestOperationDefinition {
    return SERVICE_REQUEST_OPERATION_DEFINITIONS[operation]
  }

  override function getInvoiceOperationDefinition(operation : ServiceRequestOperation) : ServiceRequestInvoiceOperationDefinition {
    return INVOICE_OPERATIONS_DEFINITIONS[operation]
  }

  override property get AllowsQuote() : boolean {
    return true
  }

  override property get AllowsInvoices() : boolean {
    return true
  }

  /**
   * Helper method to determine when the service request is in a state to be able to add quotes
   * @param serviceRequest to determine the state of
   */
  private static function quoteActionsAvailable(serviceRequest: ServiceRequest) : boolean {
    return serviceRequest.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING or
        serviceRequest.Progress == ServiceRequestProgress.TC_INPROGRESS or
        serviceRequest.Progress == ServiceRequestProgress.TC_WORKCOMPLETE or
        serviceRequest.Progress == ServiceRequestProgress.TC_REQUESTED
  }

  override function isExpectedQuoteCompletionDateApplicable(serviceRequest: ServiceRequest): boolean {
    return serviceRequest.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE  and  not serviceRequest.Terminated
  }

  override function isExpectedServiceCompletionDateApplicable(serviceRequest: ServiceRequest): boolean {
    return ((serviceRequest.Progress == ServiceRequestProgress.TC_INPROGRESS or serviceRequest.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING)
            and serviceRequest.QuoteStatus != ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE
            and serviceRequest.QuoteStatus != ServiceRequestQuoteStatus.TC_WAITINGFORAPPROVAL)
            or (isInstructedToPerformService(serviceRequest))
  }
  
  override function isInstructedToProvideQuote(serviceRequest: ServiceRequest): boolean {
    return serviceRequest.Progress == ServiceRequestProgress.TC_REQUESTED and serviceRequest.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE
  }
  
  override function isInstructedToPerformService(serviceRequest: ServiceRequest): boolean {
    return serviceRequest.Progress == ServiceRequestProgress.TC_REQUESTED and serviceRequest.QuoteStatus == ServiceRequestQuoteStatus.TC_APPROVED
  }
  
  private static function getServiceInProgress(sr: ServiceRequest): boolean {
    return sr.Progress == ServiceRequestProgress.TC_INPROGRESS and sr.QuoteStatus != ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE
  }
  
  private static function getSpecialistWaitingForCustomer(sr: ServiceRequest): boolean {
    return sr.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING and sr.QuoteStatus == ServiceRequestQuoteStatus.TC_APPROVED
  }

}
