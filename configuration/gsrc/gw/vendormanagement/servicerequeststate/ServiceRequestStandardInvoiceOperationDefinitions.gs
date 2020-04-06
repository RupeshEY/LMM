package gw.vendormanagement.servicerequeststate

uses gw.api.locale.DisplayKey

uses java.util.Date
uses java.util.Map

@Export
class ServiceRequestStandardInvoiceOperationDefinitions {

  static property get AddInvoiceDefinition() : ServiceRequestOperationDefinition {
    return new ServiceRequestOperationDefinition() {
        :AvailableExpression        = \sr, context -> invoiceActionsAvailable(sr),
        :AvailableToSpecialistExpression = \sr, context -> true,
        :ActionExpression           = \sr, context -> {/* It is required that the invoice in the context is added to the Service Request before performing this operation */
          var invoice = context.Statement as ServiceRequestInvoice
          invoice.StatementCreationTime = Date.CurrentDate
        },
        :DescriptionExpression      = \sr, context -> { var invoice = context.Statement as ServiceRequestInvoice
          return invoice.ReferenceNumber.HasContent ?
              DisplayKey.get("Web.ServiceRequest.StateTransition.Description.AddedInvoiceWithReferenceNumber", invoice.ReferenceNumber, invoice.Amount) :
              DisplayKey.get("Web.ServiceRequest.StateTransition.Description.AddedInvoice", invoice.Amount)
        }}
  }

  static property get AllInvoiceOperationDefinitions(): Map <ServiceRequestOperation, ServiceRequestInvoiceOperationDefinition> {
      return {
          ServiceRequestOperation.TC_APPROVEINVOICE -> new ServiceRequestInvoiceOperationDefinition() {
              : AvailableExpression = \sr, context -> sr.Status == ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL and invoiceActionsAvailable(sr.ServiceRequest),
              : AvailableToSpecialistExpression = \sr, context -> false,
              : NewInvoiceStatusExpression = \sr, context -> ServiceRequestInvoiceStatus.TC_APPROVED,
              : ActionExpression = \invoice, context -> {
                invoice.ApprovalDate   = Date.CurrentDate
                invoice.ApprovedBy     = User.util.CurrentUser
                invoice.DeclinedReason = null
              },
              : DescriptionExpression = \invoice, context -> {
                var msg: String
                if (context.PerformedBySystem) {
                  msg = invoice.ReferenceNumber.HasContent
                      ? DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AutoApprovedWithReferenceNumber", invoice.ReferenceNumber, invoice.Amount)
                      : DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AutoApproved", invoice.Amount)
                }
                else {
                  msg = invoice.ReferenceNumber.HasContent
                      ? DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceApprovedWithReferenceNumber", invoice.ReferenceNumber, invoice.Amount)
                      : DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceApproved", invoice.Amount)
                }
                return msg
              }},
          ServiceRequestOperation.TC_REJECTINVOICE -> new ServiceRequestInvoiceOperationDefinition() {
              : AvailableExpression = \sr, context -> sr.Status == ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL and invoiceActionsAvailable(sr.ServiceRequest),
              : AvailableToSpecialistExpression = \sr, context -> false,
              : NewInvoiceStatusExpression = \sr, context -> ServiceRequestInvoiceStatus.TC_REJECTED,
              : ActionExpression = \invoice, context -> {
                invoice.DeclinedReason = context.Reason
              },
              : DescriptionExpression = \invoice, context -> {
                var reason = context.Reason
                if (invoice.ReferenceNumber.HasContent and reason.HasContent) {
                  return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceRejectedWithReferenceNumberAndReason", invoice.ReferenceNumber, reason)
                } else if (invoice.ReferenceNumber.HasContent and not reason.HasContent) {
                  return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceRejectedWithReferenceNumber", invoice.ReferenceNumber)
                } else if (not invoice.ReferenceNumber.HasContent and reason.HasContent) {
                  return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceRejectedWithReason", reason)
                }
                return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceRejected")
              }},
          ServiceRequestOperation.TC_UNPAYINVOICE -> new ServiceRequestInvoiceOperationDefinition() {
              : AvailableToSpecialistExpression = \sr, context -> false,
              : AvailableExpression = \sr, context -> sr.Status == ServiceRequestInvoiceStatus.TC_CHECKCREATED and invoiceActionsAvailable(sr.ServiceRequest),
              : NewInvoiceStatusExpression = \sr, context -> ServiceRequestInvoiceStatus.TC_APPROVED,
              : ActionExpression = \invoice, context -> {
                invoice.PaymentDate = null
                invoice.PaidBy = null
                invoice.Check?.touch() // put the check in the bundle so it removes the invoice from its collection and the rules will run in the invoice
                invoice.Check = null
                invoice.DeclinedReason = null
              },
              : DescriptionExpression = \invoice, context -> {
                var reason = context.Reason
                if (invoice.ReferenceNumber.HasContent) {
                  return reason.HasContent
                      ? DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceMarkedAsUnpaidWithReferenceNumberAndReason", invoice.ReferenceNumber, reason)
                      : DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceMarkedAsUnpaidWithReferenceNumber", invoice.ReferenceNumber)
                }
                else {
                  return reason.HasContent
                      ? DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceMarkedAsUnpaidWithReason", reason)
                      : DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceMarkedAsUnpaid")
                }
              }},
          ServiceRequestOperation.TC_PAYINVOICE -> new ServiceRequestInvoiceOperationDefinition() {
              : AvailableExpression = \sr, context -> sr.Status == ServiceRequestInvoiceStatus.TC_APPROVED and invoiceActionsAvailable(sr.ServiceRequest),
              : AvailableToSpecialistExpression = \sr, context -> false,
              : NewInvoiceStatusExpression = \sr, context -> ServiceRequestInvoiceStatus.TC_CHECKCREATED,
              : ActionExpression = \invoice, context -> {
                /* pay specialist */
                invoice.PaymentDate = Date.CurrentDate
                invoice.PaidBy = User.util.CurrentUser
                invoice.Check?.touch()
                invoice.DeclinedReason = null
              },
              : DescriptionExpression = \invoice, context -> {
                var msg: String
                if (context.PerformedBySystem) {
                  msg = invoice.ReferenceNumber.HasContent
                      ? DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AutoPaidWithReferenceNumber", invoice.ReferenceNumber, invoice.Amount)
                      : DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AutoPaid", invoice.Amount)
                }
                else {
                  msg = invoice.ReferenceNumber.HasContent
                    ? DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoicePaidWithReferenceNumber", invoice.ReferenceNumber, invoice.Amount)
                    : DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoicePaid", invoice.Amount)
                }
                return msg
              }},
          ServiceRequestOperation.TC_WITHDRAWINVOICE -> new ServiceRequestInvoiceOperationDefinition() {
              : AvailableExpression = \sr, context -> (sr.Status == ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL or sr.Status == ServiceRequestInvoiceStatus.TC_APPROVED) and
                  invoiceActionsAvailable(sr.ServiceRequest),
              : AvailableToSpecialistExpression = \sr, context -> true,
              : NewInvoiceStatusExpression = \sr, context -> ServiceRequestInvoiceStatus.TC_WITHDRAWN,
              : ActionExpression = \invoice, context -> {
                invoice.DeclinedReason = null
              },
              : DescriptionExpression = \invoice, context -> {
                var reason = context.Reason
                if (invoice.ReferenceNumber.HasContent and reason.HasContent) {
                  return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistWithdrewInvoiceWithReferenceNumberAndReason", invoice.ReferenceNumber, reason)
                } else if (invoice.ReferenceNumber.HasContent and not reason.HasContent) {
                  return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistWithdrewInvoiceWithReferenceNumber", invoice.ReferenceNumber)
                } else if (not invoice.ReferenceNumber.HasContent and reason.HasContent) {
                  return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistWithdrewInvoiceWithReason", reason)
                }
                return DisplayKey.get("Web.ServiceRequest.StateTransition.Description.SpecialistWithdrewInvoice")
              }}
      }
    }

  /**
   * Helper method to determine when the service request is in a state to be able to add invoices
   * @param serviceRequest to determine the state of
   */
  static function invoiceActionsAvailable(serviceRequest: ServiceRequest): boolean {
    return serviceRequest.Progress == ServiceRequestProgress.TC_SPECIALISTWAITING or
        serviceRequest.Progress == ServiceRequestProgress.TC_INPROGRESS or
        serviceRequest.Progress == ServiceRequestProgress.TC_WORKCOMPLETE
  }
}