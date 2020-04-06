package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InvoicePanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckDetailsExpressionsImpl extends InvoicePanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=CheckLabel) at InvoicePanelSet.pcf: line 189, column 88
    function action_94 () : void {
      ClaimFinancialsChecksDetail.go(check.Claim, check)
    }
    
    // 'action' attribute on TextInput (id=CheckLabel) at InvoicePanelSet.pcf: line 189, column 88
    function action_dest_95 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(check.Claim, check)
    }
    
    // 'initialValue' attribute on Variable at InvoicePanelSet.pcf: line 183, column 27
    function initialValue_93 () : Check {
      return selectedInvoice.Check
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at InvoicePanelSet.pcf: line 199, column 40
    function valueRoot_100 () : java.lang.Object {
      return check
    }
    
    // 'value' attribute on CurrencyInput (id=CheckAmount) at InvoicePanelSet.pcf: line 204, column 40
    function value_101 () : gw.api.financials.CurrencyAmount {
      return check.GrossAmount
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckStatus) at InvoicePanelSet.pcf: line 209, column 52
    function value_104 () : typekey.TransactionStatus {
      return check.Status
    }
    
    // 'value' attribute on DateInput (id=CheckScheduledSendDate) at InvoicePanelSet.pcf: line 213, column 46
    function value_107 () : java.util.Date {
      return check.ScheduledSendDate
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at InvoicePanelSet.pcf: line 199, column 40
    function value_98 () : java.lang.String {
      return check.CheckNumber
    }
    
    // 'visible' attribute on InputSet (id=CheckDetails) at InvoicePanelSet.pcf: line 178, column 51
    function visible_110 () : java.lang.Boolean {
      return selectedInvoice.Check != null
    }
    
    // 'visible' attribute on TextInput (id=InvoiceLinkedToMultipleInvoices) at InvoicePanelSet.pcf: line 195, column 82
    function visible_96 () : java.lang.Boolean {
      return selectedInvoice.Check.ServiceRequestInvoices.Count > 1
    }
    
    property get check () : Check {
      return getVariableValue("check", 1) as Check
    }
    
    property set check ($arg :  Check) {
      setVariableValue("check", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoicePanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=MarkAsPaid) at InvoicePanelSet.pcf: line 57, column 95
    function action_11 () : void {
      MarkInvoicePaidPopup.push(selectedInvoice)
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshAsyncContent) at InvoicePanelSet.pcf: line 232, column 142
    function action_113 () : void {
      
    }
    
    // 'action' attribute on Link (id=MarkAsUnpaid) at InvoicePanelSet.pcf: line 63, column 97
    function action_14 () : void {
      OperationReasonPromptPopup.push(selectedInvoice.ServiceRequest, selectedInvoice, TC_UNPAYINVOICE)
    }
    
    // 'action' attribute on Link (id=WithdrawInvoice) at InvoicePanelSet.pcf: line 70, column 100
    function action_17 () : void {
      OperationReasonPromptPopup.push(selectedInvoice.ServiceRequest, selectedInvoice, TC_WITHDRAWINVOICE)
    }
    
    // 'action' attribute on Link (id=ApproveInvoice) at InvoicePanelSet.pcf: line 37, column 99
    function action_3 () : void {
      callbackHelper.performInvoiceOperation(CurrentLocation, selectedInvoice, TC_APPROVEINVOICE, stateHandler)
    }
    
    // 'action' attribute on Link (id=RejectInvoice) at InvoicePanelSet.pcf: line 44, column 98
    function action_5 () : void {
      RejectInvoicePopup.push(selectedInvoice)
    }
    
    // 'action' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 9, column 49
    function action_50 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 12, column 49
    function action_52 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on UserInput (id=PaidBy) at UserWidget.xml: line 9, column 49
    function action_70 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=PaidBy) at UserWidget.xml: line 12, column 49
    function action_72 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on Link (id=PayInvoice) at InvoicePanelSet.pcf: line 51, column 95
    function action_8 () : void {
      NormalCreateCheckWizardForward.go(selectedInvoice.ServiceRequest.Claim, selectedInvoice)
    }
    
    // 'action' attribute on Link (id=MarkAsPaid) at InvoicePanelSet.pcf: line 57, column 95
    function action_dest_12 () : pcf.api.Destination {
      return pcf.MarkInvoicePaidPopup.createDestination(selectedInvoice)
    }
    
    // 'action' attribute on Link (id=MarkAsUnpaid) at InvoicePanelSet.pcf: line 63, column 97
    function action_dest_15 () : pcf.api.Destination {
      return pcf.OperationReasonPromptPopup.createDestination(selectedInvoice.ServiceRequest, selectedInvoice, TC_UNPAYINVOICE)
    }
    
    // 'action' attribute on Link (id=WithdrawInvoice) at InvoicePanelSet.pcf: line 70, column 100
    function action_dest_18 () : pcf.api.Destination {
      return pcf.OperationReasonPromptPopup.createDestination(selectedInvoice.ServiceRequest, selectedInvoice, TC_WITHDRAWINVOICE)
    }
    
    // 'action' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 9, column 49
    function action_dest_51 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 12, column 49
    function action_dest_53 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'action' attribute on Link (id=RejectInvoice) at InvoicePanelSet.pcf: line 44, column 98
    function action_dest_6 () : pcf.api.Destination {
      return pcf.RejectInvoicePopup.createDestination(selectedInvoice)
    }
    
    // 'action' attribute on UserInput (id=PaidBy) at UserWidget.xml: line 9, column 49
    function action_dest_71 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=PaidBy) at UserWidget.xml: line 12, column 49
    function action_dest_73 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'action' attribute on Link (id=PayInvoice) at InvoicePanelSet.pcf: line 51, column 95
    function action_dest_9 () : pcf.api.Destination {
      return pcf.NormalCreateCheckWizardForward.createDestination(selectedInvoice.ServiceRequest.Claim, selectedInvoice)
    }
    
    // 'available' attribute on ToolbarButton (id=RefreshAsyncContent) at InvoicePanelSet.pcf: line 232, column 142
    function available_111 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentContentServerAvailable
    }
    
    // 'def' attribute on ListViewInput (id=InvoiceDocuments) at InvoicePanelSet.pcf: line 224, column 31
    function def_onEnter_114 (def :  pcf.StatementDocumentsLV) : void {
      def.onEnter(selectedInvoice, false)
    }
    
    // 'def' attribute on ListViewInput at InvoicePanelSet.pcf: line 168, column 29
    function def_onEnter_91 (def :  pcf.StatementLineItemLV) : void {
      def.onEnter(selectedInvoice)
    }
    
    // 'def' attribute on ListViewInput (id=InvoiceDocuments) at InvoicePanelSet.pcf: line 224, column 31
    function def_refreshVariables_115 (def :  pcf.StatementDocumentsLV) : void {
      def.refreshVariables(selectedInvoice, false)
    }
    
    // 'def' attribute on ListViewInput at InvoicePanelSet.pcf: line 168, column 29
    function def_refreshVariables_92 (def :  pcf.StatementLineItemLV) : void {
      def.refreshVariables(selectedInvoice)
    }
    
    // 'icon' attribute on Link (id=InvoiceTabWaitingForInvoiceAlert) at InvoicePanelSet.pcf: line 81, column 52
    function icon_21 () : java.lang.String {
      return gw.vendormanagement.ServiceRequestStatus.ATTENTION.Icon
    }
    
    // 'initialValue' attribute on Variable at InvoicePanelSet.pcf: line 20, column 37
    function initialValue_0 () : entity.ServiceRequest {
      return selectedInvoice.ServiceRequest
    }
    
    // 'initialValue' attribute on Variable at InvoicePanelSet.pcf: line 24, column 52
    function initialValue_1 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'label' attribute on Link (id=InvoiceTabWaitingForInvoiceAlertText) at InvoicePanelSet.pcf: line 84, column 60
    function label_22 () : java.lang.Object {
      return selectedInvoice.ActionRequiredMessage
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 6, column 85
    function valueRange_57 () : java.lang.Object {
      return entity.User.util.getUsersInCurrentUsersGroup()
    }
    
    // 'value' attribute on TextInput (id=ReferenceNumber) at InvoicePanelSet.pcf: line 119, column 52
    function valueRoot_36 () : java.lang.Object {
      return selectedInvoice
    }
    
    // 'value' attribute on TextInput (id=ReferenceNumber) at InvoicePanelSet.pcf: line 119, column 52
    function value_34 () : java.lang.String {
      return selectedInvoice.ReferenceNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at InvoicePanelSet.pcf: line 124, column 60
    function value_37 () : typekey.ServiceRequestInvoiceStatus {
      return selectedInvoice.Status
    }
    
    // 'value' attribute on TextInput (id=RejectedReason) at InvoicePanelSet.pcf: line 129, column 61
    function value_41 () : java.lang.String {
      return selectedInvoice.DeclinedReason
    }
    
    // 'value' attribute on DateInput (id=SubmittedDate) at InvoicePanelSet.pcf: line 134, column 58
    function value_45 () : java.util.Date {
      return selectedInvoice.StatementCreationTime
    }
    
    // 'value' attribute on UserInput (id=ApprovedBy) at InvoicePanelSet.pcf: line 140, column 57
    function value_49 () : entity.User {
      return selectedInvoice.ApprovedBy
    }
    
    // 'value' attribute on DateInput (id=ApprovalDate) at InvoicePanelSet.pcf: line 146, column 59
    function value_64 () : java.util.Date {
      return selectedInvoice.ApprovalDate
    }
    
    // 'value' attribute on UserInput (id=PaidBy) at InvoicePanelSet.pcf: line 152, column 53
    function value_69 () : entity.User {
      return selectedInvoice.PaidBy
    }
    
    // 'value' attribute on DateInput (id=PaymentDate) at InvoicePanelSet.pcf: line 158, column 58
    function value_84 () : java.util.Date {
      return selectedInvoice.PaymentDate
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at InvoicePanelSet.pcf: line 163, column 48
    function value_88 () : java.lang.String {
      return selectedInvoice.Description
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_58 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_58 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_58 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=PaidBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_78 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=PaidBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_78 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=PaidBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_78 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRange_59 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_58(__valueRangeArg)
    }
    
    // 'valueRange' attribute on UserInput (id=PaidBy) at UserWidget.xml: line 6, column 85
    function verifyValueRange_79 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_78(__valueRangeArg)
    }
    
    // 'visible' attribute on ToolbarButton (id=RefreshAsyncContent) at InvoicePanelSet.pcf: line 232, column 142
    function visible_112 () : java.lang.Boolean {
      return documentsActionsHelper.isShowAsynchronousRefreshAction(selectedInvoice.ViewableDocumentLinksAndDocuments*.Second)
    }
    
    // 'visible' attribute on Link (id=MarkAsUnpaid) at InvoicePanelSet.pcf: line 63, column 97
    function visible_13 () : java.lang.Boolean {
      return selectedInvoice.operationAvailable(TC_UNPAYINVOICE, false, stateHandler)
    }
    
    // 'visible' attribute on Link (id=WithdrawInvoice) at InvoicePanelSet.pcf: line 70, column 100
    function visible_16 () : java.lang.Boolean {
      return selectedInvoice.operationAvailable(TC_WITHDRAWINVOICE, false, stateHandler)
    }
    
    // 'visible' attribute on ContentInput at InvoicePanelSet.pcf: line 30, column 164
    function visible_19 () : java.lang.Boolean {
      return selectedInvoice.anyOperationAvailable({TC_APPROVEINVOICE, TC_REJECTINVOICE, TC_PAYINVOICE, TC_WITHDRAWINVOICE, TC_UNPAYINVOICE}, stateHandler)
    }
    
    // 'visible' attribute on Link (id=ApproveInvoice) at InvoicePanelSet.pcf: line 37, column 99
    function visible_2 () : java.lang.Boolean {
      return selectedInvoice.operationAvailable(TC_APPROVEINVOICE, false, stateHandler)
    }
    
    // 'visible' attribute on ContentInput at InvoicePanelSet.pcf: line 78, column 59
    function visible_23 () : java.lang.Boolean {
      return selectedInvoice.ActionRequiredVisible
    }
    
    // 'visible' attribute on ContentInput at InvoicePanelSet.pcf: line 88, column 107
    function visible_26 () : java.lang.Boolean {
      return isInvoiceWarningMessageVisible(serviceRequest) and serviceRequest.LatestQuote == null
    }
    
    // 'visible' attribute on ContentInput at InvoicePanelSet.pcf: line 98, column 189
    function visible_29 () : java.lang.Boolean {
      return isInvoiceWarningMessageVisible(serviceRequest) and serviceRequest.LatestQuote != null and serviceRequest.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORAPPROVAL
    }
    
    // 'visible' attribute on ContentInput at InvoicePanelSet.pcf: line 108, column 186
    function visible_32 () : java.lang.Boolean {
      return isInvoiceWarningMessageVisible(serviceRequest) and serviceRequest.LatestQuote != null and serviceRequest.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE
    }
    
    // 'visible' attribute on Link (id=RejectInvoice) at InvoicePanelSet.pcf: line 44, column 98
    function visible_4 () : java.lang.Boolean {
      return selectedInvoice.operationAvailable(TC_REJECTINVOICE, false, stateHandler)
    }
    
    // 'visible' attribute on TextInput (id=RejectedReason) at InvoicePanelSet.pcf: line 129, column 61
    function visible_40 () : java.lang.Boolean {
      return selectedInvoice.DeclinedReason != null
    }
    
    // 'visible' attribute on UserInput (id=ApprovedBy) at InvoicePanelSet.pcf: line 140, column 57
    function visible_48 () : java.lang.Boolean {
      return selectedInvoice.ApprovedBy != null
    }
    
    // 'visible' attribute on DateInput (id=ApprovalDate) at InvoicePanelSet.pcf: line 146, column 59
    function visible_63 () : java.lang.Boolean {
      return selectedInvoice.ApprovalDate != null
    }
    
    // 'visible' attribute on UserInput (id=PaidBy) at InvoicePanelSet.pcf: line 152, column 53
    function visible_68 () : java.lang.Boolean {
      return selectedInvoice.PaidBy != null
    }
    
    // 'visible' attribute on Link (id=PayInvoice) at InvoicePanelSet.pcf: line 51, column 95
    function visible_7 () : java.lang.Boolean {
      return selectedInvoice.operationAvailable(TC_PAYINVOICE, false, stateHandler)
    }
    
    // 'visible' attribute on DateInput (id=PaymentDate) at InvoicePanelSet.pcf: line 158, column 58
    function visible_83 () : java.lang.Boolean {
      return selectedInvoice.PaymentDate != null
    }
    
    property get callbackHelper () : gw.vendormanagement.ServiceRequestOperationCallbackHelper {
      return getRequireValue("callbackHelper", 0) as gw.vendormanagement.ServiceRequestOperationCallbackHelper
    }
    
    property set callbackHelper ($arg :  gw.vendormanagement.ServiceRequestOperationCallbackHelper) {
      setRequireValue("callbackHelper", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get selectedInvoice () : ServiceRequestInvoice {
      return getRequireValue("selectedInvoice", 0) as ServiceRequestInvoice
    }
    
    property set selectedInvoice ($arg :  ServiceRequestInvoice) {
      setRequireValue("selectedInvoice", 0, $arg)
    }
    
    property get serviceRequest () : entity.ServiceRequest {
      return getVariableValue("serviceRequest", 0) as entity.ServiceRequest
    }
    
    property set serviceRequest ($arg :  entity.ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    property get stateHandler () : gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler {
      return getRequireValue("stateHandler", 0) as gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler
    }
    
    property set stateHandler ($arg :  gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler) {
      setRequireValue("stateHandler", 0, $arg)
    }
    
    function isInvoiceWarningMessageVisible(invoiceServiceRequest: ServiceRequest): boolean {
      return invoiceServiceRequest.quoteAllowed(stateHandler) and invoiceServiceRequest.IsActive
    }
    
    
  }
  
  
}