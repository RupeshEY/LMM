package gw.vendormanagement.servicerequeststate

uses gw.xml.ws.annotation.WsiExportable

@WsiExportable("http://guidewire.com/cc/ws/gw/vendormanagement/servicerequeststate/ServiceRequestNextAction")
@Export
enum ServiceRequestNextAction {

  SubmitRequest,
  AcceptOrDeclineQuote,
  AcceptOrDeclineQuoteAndService,
  AcceptOrDeclineQuoteAndServicePromotion,
  AcceptOrDeclineService,
  AddQuote,
  ReviseQuote,
  ApproveQuote,
  ResumeWork,
  FinishWork,
  AddInvoice,
  ApproveInvoice,
  PayInvoice,
  None_Canceled,
  None_QuotePromoted,
  None_QuoteSubmitted,
  None_InvoicesPaid,
  ReassignWork_Expired,
  ReassignWork_Declined,
  FollowUp_SpecialistWaiting,
  FollowUp_QuoteOverdue_HasQuote,
  FollowUp_QuoteOverdue_NoQuote,
  FollowUp_WorkOverdue

  private construct() {}

  property get ActionName() : String {
    return gw.api.locale.DisplayKey.get("Web.ServiceRequest.StateTransition.NextAction."+this.Name)
  }

}
