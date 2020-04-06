package gw.vendormanagement.servicerequeststate
uses gw.api.locale.DisplayKey
uses java.util.Map
uses gw.api.util.DateUtil
uses gw.api.util.StringUtil
uses java.util.Date
uses gw.vendormanagement.ServiceRequestActivityPattern

@Export
class ServiceRequestQuoteOnlyStateHandler extends ServiceRequestStateHandler {
 
  private final var SERVICE_REQUEST_OPERATION_DEFINITIONS : Map<ServiceRequestOperation, ServiceRequestOperationDefinition> = {
   
    ServiceRequestOperation.TC_SUBMITINSTRUCTION -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress == ServiceRequestProgress.TC_DRAFT and sr.Specialist != null,
          :AvailableToSpecialistExpression = \sr, context -> false,
          :ActionExpression         = \sr, context -> { // documents mark as "VisibleToSpecialist" are updated with a  "DateSpecialistNotified"
                                              for (srDoc in sr.DocumentLinks) {
                                                if (srDoc.VisibleToSpecialist and srDoc.DateSpecialistNotified == null) {
                                                  //The doc will be sent with the Service Request Instructed Event
                                                  srDoc.DateSpecialistNotified = DateUtil.currentDate()
                                                }
                                              }
                                              sr.ExpectedQuoteCompletionDate = sr.RequestedQuoteCompletionDate
                                            },
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_REQUESTED,
          :NewQuoteStatusExpression = \sr, context -> ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE,
          :DescriptionExpression    = \sr, context -> { return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InstructionSubmitted")}},

    ServiceRequestOperation.TC_SPECIALISTACCEPTEDWORK -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress == ServiceRequestProgress.TC_REQUESTED,
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> {sr.ExpectedQuoteCompletionDate = context.ExpectedCompletionDate},
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_INPROGRESS,
          :DescriptionExpression    = \sr, context -> { return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistAcceptedWork.Quote", StringUtil.formatDate(context.ExpectedCompletionDate,"short"))}},
          
    ServiceRequestOperation.TC_ADDQUOTE -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> quoteActionsAvailable(sr),
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> { /* Note: It is required that the quote in the context is added to the Service Request before performing this operation */
                                                        if (sr.Progress == ServiceRequestProgress.TC_REQUESTED) {
                                                          sr.acceptWorkAndRecordChange(Date.CurrentDate, context.PerformedBySpecialist)
                                                        }
                                                        var quote = context.Statement as ServiceRequestQuote
                                                        quote.StatementCreationTime = Date.CurrentDate
                                                        sr.LatestQuote = quote
                                                        if (context.PerformedBySpecialist) {
                                                          sr.createNewActivity(ServiceRequestActivityPattern.VENDOR_ADDED_QUOTE, quote)
                                                        }
                                                      },    
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_WORKCOMPLETE,
          :NewQuoteStatusExpression = \sr, context -> ServiceRequestQuoteStatus.TC_QUOTED,
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

    ServiceRequestOperation.TC_REQUESTREQUOTE -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> quoteActionsAvailable(sr) and sr.LatestQuote != null and sr.QuoteStatus != ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE,
          :AvailableToSpecialistExpression = \sr, context -> false,
          :ActionExpression         = \sr, context -> {
                                                    sr.RequestedQuoteCompletionDate = context.RequestedCompletionDate
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
                                                        return changeReason.HasContent ? DisplayKey.get("Web.ServiceRequest.StateTransition.Description.ExpectedCompletionDateChangedWithReason", description, changeReason) : description}},
                                                        
    ServiceRequestOperation.TC_SPECIALISTDECLINED -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress == ServiceRequestProgress.TC_REQUESTED,
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> { if (context.PerformedBySpecialist) {
                                                          sr.createNewActivity(ServiceRequestActivityPattern.VENDOR_DECLINED_WORK)
                                                        }
                                                      },
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_DECLINED,
          :NewQuoteStatusExpression = \sr, context -> sr.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE ? ServiceRequestQuoteStatus.TC_NOQUOTE : sr.QuoteStatus,
          :DescriptionExpression    = \sr, context -> { var reason = context.Reason
                                                        return reason.HasContent ? 
                                                          DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistDeclinedWorkWithReason", reason) :
                                                          DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistDeclinedWork") 
                                                      }},
    
    ServiceRequestOperation.TC_CANCELSERVICEREQUEST -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress == ServiceRequestProgress.TC_DRAFT or
                                             sr.Progress == ServiceRequestProgress.TC_REQUESTED or
                                             sr.Progress == ServiceRequestProgress.TC_INPROGRESS or
                                             sr.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING,
          :AvailableToSpecialistExpression = \sr, context -> false,
          :ActionExpression           = \sr, context -> {sr.CanceledReason = context.Reason},
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_CANCELED,
          :NewQuoteStatusExpression = \sr, context -> { if (sr.LatestQuote != null) {
                                                 return ServiceRequestQuoteStatus.TC_QUOTED
                                               } else if (sr.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE) {
                                                 return ServiceRequestQuoteStatus.TC_NOQUOTE
                                               } else {
                                                 return sr.QuoteStatus
                                               }
                                             },
          :DescriptionExpression    = \sr, context -> { var reason = context.Reason
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
   
  override function getServiceRequestOperationDefinition(operation: ServiceRequestOperation): ServiceRequestOperationDefinition {
    return SERVICE_REQUEST_OPERATION_DEFINITIONS[operation]
  }
  
  override function getInvoiceOperationDefinition(operation : ServiceRequestOperation) : ServiceRequestInvoiceOperationDefinition {
    return null
  }

  override property get AllowsQuote() : boolean {
    return true
  }

  override property get AllowsInvoices(): boolean {
    return false
  }

  override function isExpectedQuoteCompletionDateApplicable(serviceRequest: ServiceRequest): boolean {
    return serviceRequest.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE and not serviceRequest.Terminated
  }
  
  override function isExpectedServiceCompletionDateApplicable(serviceRequest: ServiceRequest): boolean {
    return false
  }
  
  override function isInstructedToProvideQuote(serviceRequest: ServiceRequest): boolean {
    return serviceRequest.Progress == ServiceRequestProgress.TC_REQUESTED
  }
  
  override function isInstructedToPerformService(serviceRequest: ServiceRequest): boolean {
    return false
  }  

  /**
   * Helper method to determine when the service request is in a state to be able to add quotes
   * @param serviceRequest to determine the state of
   */
  private static function quoteActionsAvailable(serviceRequest : ServiceRequest) : boolean {
    return serviceRequest.Progress == ServiceRequestProgress.TC_REQUESTED or
           serviceRequest.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING or
           serviceRequest.Progress == ServiceRequestProgress.TC_INPROGRESS or
           serviceRequest.Progress == ServiceRequestProgress.TC_WORKCOMPLETE
  }

}
