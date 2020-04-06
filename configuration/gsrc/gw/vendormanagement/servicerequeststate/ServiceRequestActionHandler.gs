package gw.vendormanagement.servicerequeststate
uses gw.api.locale.DisplayKey
uses java.util.Date

/**
 * Defines the ActionDefinition for different Service Request States. An ActionDefinition defines 
 * the next action to perform and the owner based on the Progress, Quote Status, and Invoice Status.
 */
@Export
class ServiceRequestActionHandler {

  construct() {  }

  public static function getNextAction(sr: ServiceRequest, stateHandler : ServiceRequestStateHandler = null): ActionDefinition {
      var serviceRequestOwner = sr.AssignedUser.Contact
      var specialist = sr.Specialist
      
      switch(sr.Progress) {
        case ServiceRequestProgress.TC_DRAFT:
          return new ActionDefinition() { :NextAction         = SubmitRequest,
                                          :ActionOwner        = serviceRequestOwner,
                                          :DefaultOperation   = null,
                                          :ActionLocation     = ServiceRequestActionLocation.PERFORM_OPERATION_WITH_CONFIRMATION,
                                          :ConfirmationMessage= DisplayKey.get("Web.ServiceRequest.StateTransition.NextAction.ConfirmMessage.SubmitRequest"),
                                          :ActionOperation    = ServiceRequestOperation.TC_SUBMITINSTRUCTION}

        case ServiceRequestProgress.TC_REQUESTED:
          var action : ServiceRequestNextAction
          if (sr.Kind == ServiceRequestKind.TC_QUOTEONLY) {
            action = AcceptOrDeclineQuote
          } else if (sr.Kind == ServiceRequestKind.TC_QUOTEANDSERVICE) {
            if (sr.IsPromotion) {
              action = AcceptOrDeclineQuoteAndServicePromotion
            } else {
              action = AcceptOrDeclineQuoteAndService
            }
          } else if (sr.Kind == ServiceRequestKind.TC_SERVICEONLY) {
            action = AcceptOrDeclineService
          }
          return new ActionDefinition() { :NextAction      = action,
                                          :ActionOwner     = specialist,
                                          :DefaultOperation= ServiceRequestOperation.TC_SPECIALISTACCEPTEDWORK}

        case ServiceRequestProgress.TC_EXPIRED:
          return new ActionDefinition() { :NextAction      = ReassignWork_Expired,
                                          :ActionOwner     = serviceRequestOwner,
                                          :DefaultOperation= null }

        case ServiceRequestProgress.TC_DECLINED:
          return new ActionDefinition() { :NextAction      = ReassignWork_Declined,
                                          :ActionOwner     = serviceRequestOwner,
                                          :DefaultOperation= null }

        case ServiceRequestProgress.TC_CANCELED:
          return new ActionDefinition() { :NextAction      = None_Canceled,
                                          :ActionOwner     = null }

        case ServiceRequestProgress.TC_SPECIALISTWAITING:
          if (sr.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORAPPROVAL) {
            return new ActionDefinition() { :NextAction      = ApproveQuote,
                                            :ActionOwner     = serviceRequestOwner,
                                            :DefaultOperation= null,
                                            :ActionLocation  = ServiceRequestActionLocation.SERVICE_REQUEST_DETAILS}
          } else {
            if (sr.PassedWaitingThreshold) {
              return new ActionDefinition() { :NextAction      = FollowUp_SpecialistWaiting,
                                              :ActionOwner     = serviceRequestOwner,
                                              :DefaultOperation= ServiceRequestOperation.TC_SPECIALISTRESUMEDWORK}
            } else {
              return new ActionDefinition() { :NextAction         = ResumeWork,
                                              :ActionOwner        = specialist,
                                              :DefaultOperation   = ServiceRequestOperation.TC_SPECIALISTRESUMEDWORK,
                                              :ActionLocation     = ServiceRequestActionLocation.PERFORM_OPERATION_WITH_CONFIRMATION,
                                              :ConfirmationMessage= DisplayKey.get("Web.ServiceRequest.StateTransition.NextAction.ConfirmMessage.ResumeWork"),
                                              :ActionOperation    = ServiceRequestOperation.TC_SPECIALISTRESUMEDWORK}
            }
          }

        case ServiceRequestProgress.TC_WORKCOMPLETE:
          if (sr.invoiceAllowed(stateHandler)) {
            var approvableInvoiceCondition : block(i:ServiceRequestInvoice) : boolean = \ i -> i.Status == ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL
            var payableInvoiceCondition : block(i:ServiceRequestInvoice) : boolean = \ i -> i.Status == ServiceRequestInvoiceStatus.TC_APPROVED
            var orderedInvoices = sr.Invoices.orderByDescending(\i -> i.StatementCreationTime)

            if (sr.Invoices.hasMatch(approvableInvoiceCondition)) {
              return new ActionDefinition() { :NextAction      = ApproveInvoice,
                                              :ActionOwner     = serviceRequestOwner,
                                              :DefaultOperation= null,
                                              :ActionLocation  = ServiceRequestActionLocation.SERVICE_REQUEST_INVOICE,
                                              :ActionInvoice   = orderedInvoices.firstWhere(approvableInvoiceCondition)}
            } else if (sr.Invoices.hasMatch(payableInvoiceCondition)) {
              return new ActionDefinition() { :NextAction      = PayInvoice,
                                              :ActionOwner     = serviceRequestOwner,
                                              :DefaultOperation= null,
                                              :ActionLocation  = ServiceRequestActionLocation.SERVICE_REQUEST_INVOICE,
                                              :ActionInvoice   = orderedInvoices.firstWhere(payableInvoiceCondition)}
            } else if (sr.Invoices.allMatch(\ i -> i.Status == ServiceRequestInvoiceStatus.TC_REJECTED or
                                                   i.Status == ServiceRequestInvoiceStatus.TC_WITHDRAWN)) {
              // includes the case where there are no invoices
              return new ActionDefinition() { :NextAction      = AddInvoice,
                                              :ActionOwner     = specialist,
                                              :DefaultOperation= ServiceRequestOperation.TC_ADDINVOICE,
                                              :ActionLocation  = ServiceRequestActionLocation.ADD_INVOICE_POPUP}
            } else {
              // at least one invoice is paid and no others are still outstanding
              return new ActionDefinition() { :NextAction      = None_InvoicesPaid,
                                              :ActionOwner     = null,
                                              :DefaultOperation= null }
            }
          } else {
            var action = sr.AlreadyPromoted ? ServiceRequestNextAction.None_QuotePromoted : ServiceRequestNextAction.None_QuoteSubmitted
            return new ActionDefinition() { :NextAction      = action,
                :ActionOwner     = null,
                :DefaultOperation= null}
          }

        case ServiceRequestProgress.TC_INPROGRESS: 
          var expCompletionDate = sr.nextExpectedCompletionDate(stateHandler)
          // an expected completion date will normally be present while the specialist is in progress,
          // but if it isn't, treat it as if the date as has not been reached
          if (expCompletionDate == null  or  expCompletionDate >= Date.CurrentDate.trimToMidnight()) {
            if (sr.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE) {
              if (sr.LatestQuote != null) {
                return new ActionDefinition() { :NextAction      = ReviseQuote,
                                                :ActionOwner     = specialist,
                                                :DefaultOperation= ServiceRequestOperation.TC_ADDQUOTE,
                                                :ActionLocation  = ServiceRequestActionLocation.REVISE_QUOTE_POPUP}
              } else {
                return new ActionDefinition() { :NextAction      = AddQuote,
                                                :ActionOwner     = specialist,
                                                :DefaultOperation= ServiceRequestOperation.TC_ADDQUOTE,
                                                :ActionLocation  = ServiceRequestActionLocation.ADD_QUOTE_POPUP}
              }
            } else {
              return new ActionDefinition() { :NextAction         = FinishWork,
                                              :ActionOwner        = specialist,
                                              :DefaultOperation   = ServiceRequestOperation.TC_SPECIALISTCOMPLETEDWORK,
                                              :ActionLocation     = ServiceRequestActionLocation.PERFORM_OPERATION_WITH_CONFIRMATION,
                                              :ConfirmationMessage= DisplayKey.get("Web.ServiceRequest.StateTransition.NextAction.ConfirmMessage.FinishWork"),
                                              :ActionOperation    = ServiceRequestOperation.TC_SPECIALISTCOMPLETEDWORK}
            }
          } else {
            if (sr.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE) {
              if (sr.LatestQuote != null) {
                return new ActionDefinition() { :NextAction      = FollowUp_QuoteOverdue_HasQuote,
                                                :ActionOwner     = serviceRequestOwner,
                                                :DefaultOperation= ServiceRequestOperation.TC_ADDQUOTE}
              } else {
                return new ActionDefinition() { :NextAction      = FollowUp_QuoteOverdue_NoQuote,
                                                :ActionOwner     = serviceRequestOwner,
                                                :DefaultOperation= ServiceRequestOperation.TC_ADDQUOTE}
              }
            } else {
              return new ActionDefinition() { :NextAction      = FollowUp_WorkOverdue,
                                              :ActionOwner     = serviceRequestOwner,
                                              :DefaultOperation= ServiceRequestOperation.TC_SPECIALISTCOMPLETEDWORK}
            }
          }
      }

      return new ActionDefinition() { :NextAction      = null,
                                      :ActionOwner     = null }
  }


  public static class ActionDefinition {
    var nextAction : ServiceRequestNextAction as NextAction
    var owner : Contact as ActionOwner
    var defaultOperation : ServiceRequestOperation as DefaultOperation
    var actionLocation : ServiceRequestActionLocation as ActionLocation
    var actionOperation : ServiceRequestOperation as ActionOperation
    var actionInvoice : ServiceRequestInvoice as ActionInvoice
    var confirmationMessage : String as ConfirmationMessage

    property get ActionOwnerString() : String {
      return owner.DisplayName ?: DisplayKey.get("Web.ServiceRequest.StateTransition.ActionOwner.None")
    }
  }

}
