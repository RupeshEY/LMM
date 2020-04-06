package gw.vendormanagement

uses gw.api.locale.DisplayKey

/**
 * Provides static methods that define the labels and title for the OperationReasonPromptPopup 
 * corresponding to the ServiceRequestOperation that requires a reason when executed.
 */
@Export
class ServiceRequestOperationDisplayHelper {
  
  private static var OPERATIONS : java.util.Map<ServiceRequestOperation, ServiceRequestOperationReasonDefinition> = {
    
      ServiceRequestOperation.TC_SPECIALISTWAITING    -> new ServiceRequestOperationReasonDefinition(
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.SpecialistWaitingPopup.Title"), 
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.SpecialistWaitingPopup.ChangeDescription"),
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.OperationReasonPopup.Update"),
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.OperationReasonPopup.Cancel")),
      ServiceRequestOperation.TC_REJECTINVOICE        -> new ServiceRequestOperationReasonDefinition(
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.RejectInvoicePopup.Title"), 
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.RejectInvoicePopup.ChangeDescription"), 
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.RejectInvoicePopup.RejectButton"),
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.RejectInvoicePopup.CancelButton")),
      ServiceRequestOperation.TC_SPECIALISTDECLINED   -> new ServiceRequestOperationReasonDefinition(
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.DeclinePopup.Title"), 
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.DeclinePopup.ChangeDescription"), 
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.OperationReasonPopup.Update"),
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.OperationReasonPopup.Cancel")),
      ServiceRequestOperation.TC_CANCELSERVICEREQUEST-> new ServiceRequestOperationReasonDefinition(
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.CancelPopup.Title"), 
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.CancelPopup.ChangeDescription"), 
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.CancelPopup.CancelServiceRequest"),
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.CancelPopup.CancelWorksheet")),
      ServiceRequestOperation.TC_SPECIALISTCANCELED   -> new ServiceRequestOperationReasonDefinition(
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.SpecialistCancelPopup.Title"), 
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.SpecialistCancelPopup.ChangeDescription"), 
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.CancelPopup.CancelServiceRequest"),
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.CancelPopup.CancelWorksheet")),
      ServiceRequestOperation.TC_WITHDRAWINVOICE      -> new ServiceRequestOperationReasonDefinition(
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.WithdrawInvoicePopup.Title"), 
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.WithdrawInvoicePopup.ChangeDescription"), 
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.WithdrawInvoicePopup.WithdrawButton"),
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.WithdrawInvoicePopup.CancelButton")),
      ServiceRequestOperation.TC_UNPAYINVOICE         -> new ServiceRequestOperationReasonDefinition(
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.UnpayInvoicePopup.Title"),
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.UnpayInvoicePopup.ChangeDescription"),
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.OperationReasonPopup.Update"),
                                                        DisplayKey.get("Web.ServiceRequest.StateTransition.OperationReasonPopup.Cancel"))
  }

  static function getPopupTitle(operation: ServiceRequestOperation, invoice: ServiceRequestInvoice) : String {
    return OPERATIONS[operation].PopupTitle + (invoice.ReferenceNumber.HasContent ? " " + invoice.ReferenceNumber : "")
  }

  static function getReasonLabel(operation: ServiceRequestOperation) : String {
    return OPERATIONS[operation].ReasonLabel
  }

  static function getUpdateLabel(operation: ServiceRequestOperation) : String {
    return OPERATIONS[operation].UpdateLabel
  }

  static function getCancelLabel(operation: ServiceRequestOperation) : String {
    return OPERATIONS[operation].CancelLabel
  }
  
  static class ServiceRequestOperationReasonDefinition {
    var _popupTitle : String as readonly PopupTitle
    var _reasonLabel : String as readonly ReasonLabel
    var _updateLabel : String as readonly UpdateLabel  
    var _cancelLabel : String as readonly CancelLabel  
    
    construct(popupTitleValue: String, reasonLabelValue: String, updateLabelValue : String, cancelLabelValue: String) { 
      _popupTitle = popupTitleValue
      _reasonLabel = reasonLabelValue
      _updateLabel = updateLabelValue
      _cancelLabel = cancelLabelValue
    }
  }
}
