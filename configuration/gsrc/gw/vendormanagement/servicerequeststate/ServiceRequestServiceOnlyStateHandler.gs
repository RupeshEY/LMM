package gw.vendormanagement.servicerequeststate

uses gw.api.locale.DisplayKey
uses gw.api.util.DateUtil
uses gw.api.util.StringUtil
uses gw.vendormanagement.ServiceRequestActivityPattern

uses java.util.Map

@Export
class ServiceRequestServiceOnlyStateHandler extends ServiceRequestStateHandler {

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
                                              // Set the expected service completion date
                                              sr.ExpectedServiceCompletionDate = sr.RequestedServiceCompletionDate},
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_REQUESTED,
          :NewQuoteStatusExpression = \sr, context -> ServiceRequestQuoteStatus.TC_NOQUOTE,
          :DescriptionExpression    = \sr, context -> {return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InstructionSubmitted")}},
          
    ServiceRequestOperation.TC_SPECIALISTACCEPTEDWORK -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress == ServiceRequestProgress.TC_REQUESTED,
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> {sr.ExpectedServiceCompletionDate = context.ExpectedCompletionDate},
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_INPROGRESS,
          :DescriptionExpression    = \sr, context -> { return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistAcceptedWork.Service", StringUtil.formatDate(context.ExpectedCompletionDate,"short"))}},
          
    ServiceRequestOperation.TC_SPECIALISTCOMPLETEDWORK -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress == ServiceRequestProgress.TC_INPROGRESS or
                                             sr.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING,
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> { if (context.PerformedBySpecialist) {
                                                          sr.createNewActivity(ServiceRequestActivityPattern.VENDOR_COMPLETED_WORK)
                                                        }
                                                      },
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_WORKCOMPLETE,
          :DescriptionExpression    = \sr, context -> {return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistCompletedWork")}},
  
    ServiceRequestOperation.TC_ADDINVOICE -> ServiceRequestStandardInvoiceOperationDefinitions.AddInvoiceDefinition,
    
    ServiceRequestOperation.TC_SPECIALISTWAITING -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress == ServiceRequestProgress.TC_INPROGRESS,
          :AvailableToSpecialistExpression = \sr, context -> true,
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_SPECIALISTWAITING,
          :DescriptionExpression    = \sr, context -> { var reason = context.Reason
                                                        return reason.HasContent ? 
                                                          DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistWaitingWithReason", reason) :
                                                          DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistWaiting") 
                                                      }},
                                                      
    ServiceRequestOperation.TC_SPECIALISTRESUMEDWORK -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING,
          :AvailableToSpecialistExpression = \sr, context -> true,
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_INPROGRESS,
          :DescriptionExpression    = \sr, context -> { return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistResumedWork")}},

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
                                                        return changeReason.HasContent ? DisplayKey.get("Web.ServiceRequest.StateTransition.Description.ExpectedCompletionDateChangedWithReason", description, changeReason) : description}},

    ServiceRequestOperation.TC_SPECIALISTDECLINED -> new ServiceRequestOperationDefinition(){
          :AvailableExpression      = \sr, context -> sr.Progress == ServiceRequestProgress.TC_REQUESTED,
          :AvailableToSpecialistExpression = \sr, context -> true,
          :ActionExpression         = \sr, context -> { if (context.PerformedBySpecialist) {
                                                          sr.createNewActivity(ServiceRequestActivityPattern.VENDOR_DECLINED_WORK)
                                                        }
                                                      },
          :NewProgressExpression    = \sr, context -> ServiceRequestProgress.TC_DECLINED,
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
  
  private final var INVOICE_OPERATIONS_DEFINITIONS = ServiceRequestStandardInvoiceOperationDefinitions.AllInvoiceOperationDefinitions

  override function getServiceRequestOperationDefinition(operation : ServiceRequestOperation) : ServiceRequestOperationDefinition {
    return SERVICE_REQUEST_OPERATION_DEFINITIONS[operation]
  }

  override function getInvoiceOperationDefinition(operation : ServiceRequestOperation) : ServiceRequestInvoiceOperationDefinition {
    return INVOICE_OPERATIONS_DEFINITIONS[operation]
  }

  override property get AllowsQuote() : boolean {
    return false
  }
  
  override property get AllowsInvoices() : boolean {
    return true
  }
  
  override function isExpectedQuoteCompletionDateApplicable(serviceRequest: ServiceRequest): boolean {
    return false
  }
  
  override function isExpectedServiceCompletionDateApplicable(serviceRequest: ServiceRequest): boolean {
    return serviceRequest.Progress == ServiceRequestProgress.TC_INPROGRESS or
           serviceRequest.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING or
           serviceRequest.Progress == ServiceRequestProgress.TC_REQUESTED
  }
  
  override function isInstructedToProvideQuote(serviceRequest: ServiceRequest): boolean {
    return false
  }
  
  override function isInstructedToPerformService(serviceRequest: ServiceRequest): boolean {
    return serviceRequest.Progress == ServiceRequestProgress.TC_REQUESTED
  }
}
