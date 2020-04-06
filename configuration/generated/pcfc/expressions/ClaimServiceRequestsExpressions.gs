package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimServiceRequestsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardViewPanelExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=Cancel) at ClaimServiceRequests.pcf: line 75, column 118
    function action_10 () : void {
      OperationReasonPromptPopup.push(selectedServiceRequest, TC_CANCELSERVICEREQUEST)
    }
    
    // 'action' attribute on Link (id=ReviseQuote) at ClaimServiceRequests.pcf: line 344, column 165
    function action_100 () : void {
      AddReviseQuotePopup.push(selectedServiceRequest, selectedServiceRequest.LatestQuote)
    }
    
    // 'action' attribute on ToolbarButton (id=AssignService) at ClaimServiceRequests.pcf: line 79, column 88
    function action_12 () : void {
      AssignServiceRequestPopup.push(new gw.api.vendormanagement.ServiceRequestAssignmentPopup({selectedServiceRequest}))
    }
    
    // 'action' attribute on PickerToolbarButton (id=LinkAndSend) at ClaimServiceRequests.pcf: line 504, column 51
    function action_141 () : void {
      PickExistingDocumentPopup.push(selectedServiceRequest.Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AttachAndSendDocument) at ClaimServiceRequests.pcf: line 509, column 102
    function action_145 () : void {
      AttachDocumentsPopup.push(selectedServiceRequest, true)
    }
    
    // 'action' attribute on PickerToolbarButton (id=Link) at ClaimServiceRequests.pcf: line 523, column 51
    function action_149 () : void {
      PickExistingDocumentPopup.push(selectedServiceRequest.Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=CreateNewService) at ClaimServiceRequests.pcf: line 86, column 75
    function action_15 () : void {
      confirmCanPromoteQuote(selectedServiceRequest); PromoteQuoteOnly.go(selectedServiceRequest)
    }
    
    // 'action' attribute on ToolbarButton (id=AttachDocument) at ClaimServiceRequests.pcf: line 528, column 95
    function action_153 () : void {
      AttachDocumentsPopup.push(selectedServiceRequest, false)
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshAsyncContent) at ClaimServiceRequests.pcf: line 535, column 151
    function action_157 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=AddNote) at ClaimServiceRequests.pcf: line 548, column 99
    function action_161 () : void {
      NewNotePopup.push(selectedServiceRequest.Claim, selectedServiceRequest)
    }
    
    // 'action' attribute on MenuItem (id=SpecialistResumedWork) at ClaimServiceRequests.pcf: line 99, column 121
    function action_17 () : void {
      operationCallbackHelper.performServiceRequestOperation(CurrentLocation, selectedServiceRequest, TC_SPECIALISTRESUMEDWORK, stateHandler)
    }
    
    // 'action' attribute on MenuItem (id=SpecialistWaiting) at ClaimServiceRequests.pcf: line 106, column 117
    function action_19 () : void {
      OperationReasonPromptPopup.push(selectedServiceRequest, TC_SPECIALISTWAITING)
    }
    
    // 'action' attribute on ToolbarButton (id=SendMessage) at ClaimServiceRequests.pcf: line 681, column 95
    function action_216 () : void {
      ServiceRequestMessagePopup.push(selectedServiceRequest)
    }
    
    // 'action' attribute on MenuItem (id=SpecialistAcceptedWork) at ClaimServiceRequests.pcf: line 113, column 122
    function action_22 () : void {
      AcceptedWorkPopup.push(selectedServiceRequest)
    }
    
    // 'action' attribute on MenuItem (id=SpecialistCompletedWork) at ClaimServiceRequests.pcf: line 120, column 123
    function action_25 () : void {
      operationCallbackHelper.performServiceRequestOperation(CurrentLocation, selectedServiceRequest, TC_SPECIALISTCOMPLETEDWORK, stateHandler)
    }
    
    // 'action' attribute on MenuItem (id=SpecialistDeclined) at ClaimServiceRequests.pcf: line 127, column 118
    function action_27 () : void {
      OperationReasonPromptPopup.push(selectedServiceRequest, TC_SPECIALISTDECLINED)
    }
    
    // 'action' attribute on MenuItem (id=SpecialistCanceled) at ClaimServiceRequests.pcf: line 134, column 118
    function action_30 () : void {
      OperationReasonPromptPopup.push(selectedServiceRequest, TC_SPECIALISTCANCELED)
    }
    
    // 'action' attribute on MenuItem (id=AddDelay) at ClaimServiceRequests.pcf: line 141, column 181
    function action_33 () : void {
      AddDelayPopup.push(selectedServiceRequest)
    }
    
    // 'action' attribute on MenuItem (id=UpdateReferenceNumber) at ClaimServiceRequests.pcf: line 147, column 49
    function action_35 () : void {
      EditReferenceNumberPopup.push(selectedServiceRequest)
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshAsyncContent) at ClaimServiceRequests.pcf: line 155, column 163
    function action_39 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=SubmitInstruction) at ClaimServiceRequests.pcf: line 68, column 115
    function action_8 () : void {
      operationCallbackHelper.performServiceRequestOperation(CurrentLocation, selectedServiceRequest, TC_SUBMITINSTRUCTION, stateHandler)
    }
    
    // 'action' attribute on Link (id=ApproveQuote) at ClaimServiceRequests.pcf: line 322, column 122
    function action_91 () : void {
      ApproveQuotePopup.push(selectedServiceRequest)
    }
    
    // 'action' attribute on Link (id=RequestRequote) at ClaimServiceRequests.pcf: line 330, column 124
    function action_94 () : void {
      RequestRequotePopup.push(selectedServiceRequest)
    }
    
    // 'action' attribute on Link (id=AddQuote) at ClaimServiceRequests.pcf: line 337, column 165
    function action_97 () : void {
      AddReviseQuotePopup.push(selectedServiceRequest)
    }
    
    // 'action' attribute on Link (id=ReviseQuote) at ClaimServiceRequests.pcf: line 344, column 165
    function action_dest_101 () : pcf.api.Destination {
      return pcf.AddReviseQuotePopup.createDestination(selectedServiceRequest, selectedServiceRequest.LatestQuote)
    }
    
    // 'action' attribute on ToolbarButton (id=Cancel) at ClaimServiceRequests.pcf: line 75, column 118
    function action_dest_11 () : pcf.api.Destination {
      return pcf.OperationReasonPromptPopup.createDestination(selectedServiceRequest, TC_CANCELSERVICEREQUEST)
    }
    
    // 'action' attribute on ToolbarButton (id=AssignService) at ClaimServiceRequests.pcf: line 79, column 88
    function action_dest_13 () : pcf.api.Destination {
      return pcf.AssignServiceRequestPopup.createDestination(new gw.api.vendormanagement.ServiceRequestAssignmentPopup({selectedServiceRequest}))
    }
    
    // 'action' attribute on PickerToolbarButton (id=LinkAndSend) at ClaimServiceRequests.pcf: line 504, column 51
    function action_dest_142 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(selectedServiceRequest.Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AttachAndSendDocument) at ClaimServiceRequests.pcf: line 509, column 102
    function action_dest_146 () : pcf.api.Destination {
      return pcf.AttachDocumentsPopup.createDestination(selectedServiceRequest, true)
    }
    
    // 'action' attribute on PickerToolbarButton (id=Link) at ClaimServiceRequests.pcf: line 523, column 51
    function action_dest_150 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(selectedServiceRequest.Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AttachDocument) at ClaimServiceRequests.pcf: line 528, column 95
    function action_dest_154 () : pcf.api.Destination {
      return pcf.AttachDocumentsPopup.createDestination(selectedServiceRequest, false)
    }
    
    // 'action' attribute on ToolbarButton (id=AddNote) at ClaimServiceRequests.pcf: line 548, column 99
    function action_dest_162 () : pcf.api.Destination {
      return pcf.NewNotePopup.createDestination(selectedServiceRequest.Claim, selectedServiceRequest)
    }
    
    // 'action' attribute on MenuItem (id=SpecialistWaiting) at ClaimServiceRequests.pcf: line 106, column 117
    function action_dest_20 () : pcf.api.Destination {
      return pcf.OperationReasonPromptPopup.createDestination(selectedServiceRequest, TC_SPECIALISTWAITING)
    }
    
    // 'action' attribute on ToolbarButton (id=SendMessage) at ClaimServiceRequests.pcf: line 681, column 95
    function action_dest_217 () : pcf.api.Destination {
      return pcf.ServiceRequestMessagePopup.createDestination(selectedServiceRequest)
    }
    
    // 'action' attribute on MenuItem (id=SpecialistAcceptedWork) at ClaimServiceRequests.pcf: line 113, column 122
    function action_dest_23 () : pcf.api.Destination {
      return pcf.AcceptedWorkPopup.createDestination(selectedServiceRequest)
    }
    
    // 'action' attribute on MenuItem (id=SpecialistDeclined) at ClaimServiceRequests.pcf: line 127, column 118
    function action_dest_28 () : pcf.api.Destination {
      return pcf.OperationReasonPromptPopup.createDestination(selectedServiceRequest, TC_SPECIALISTDECLINED)
    }
    
    // 'action' attribute on MenuItem (id=SpecialistCanceled) at ClaimServiceRequests.pcf: line 134, column 118
    function action_dest_31 () : pcf.api.Destination {
      return pcf.OperationReasonPromptPopup.createDestination(selectedServiceRequest, TC_SPECIALISTCANCELED)
    }
    
    // 'action' attribute on MenuItem (id=AddDelay) at ClaimServiceRequests.pcf: line 141, column 181
    function action_dest_34 () : pcf.api.Destination {
      return pcf.AddDelayPopup.createDestination(selectedServiceRequest)
    }
    
    // 'action' attribute on MenuItem (id=UpdateReferenceNumber) at ClaimServiceRequests.pcf: line 147, column 49
    function action_dest_36 () : pcf.api.Destination {
      return pcf.EditReferenceNumberPopup.createDestination(selectedServiceRequest)
    }
    
    // 'action' attribute on Link (id=ApproveQuote) at ClaimServiceRequests.pcf: line 322, column 122
    function action_dest_92 () : pcf.api.Destination {
      return pcf.ApproveQuotePopup.createDestination(selectedServiceRequest)
    }
    
    // 'action' attribute on Link (id=RequestRequote) at ClaimServiceRequests.pcf: line 330, column 124
    function action_dest_95 () : pcf.api.Destination {
      return pcf.RequestRequotePopup.createDestination(selectedServiceRequest)
    }
    
    // 'action' attribute on Link (id=AddQuote) at ClaimServiceRequests.pcf: line 337, column 165
    function action_dest_98 () : pcf.api.Destination {
      return pcf.AddReviseQuotePopup.createDestination(selectedServiceRequest)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=AssignButton) at ClaimServiceRequests.pcf: line 450, column 33
    function allCheckedRowsAction_129 (CheckedValues :  entity.Activity[], CheckedValuesErrors :  java.util.Map) : void {
      pushAssignmentPopup(CheckedValues)
    }
    
    // 'available' attribute on PickerToolbarButton (id=LinkAndSend) at ClaimServiceRequests.pcf: line 504, column 51
    function available_139 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'available' attribute on ToolbarButton (id=AttachAndSendDocument) at ClaimServiceRequests.pcf: line 509, column 102
    function available_144 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable and documentsActionsHelper.DocumentContentActionsAvailable
    }
    
    // 'available' attribute on ToolbarButton (id=RefreshAsyncContent) at ClaimServiceRequests.pcf: line 155, column 163
    function available_37 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentContentServerAvailable
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SkipButton) at ClaimServiceRequests.pcf: line 457, column 33
    function checkedRowAction_130 (element :  entity.Activity, CheckedValue :  entity.Activity) : void {
      CheckedValue.skip()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=CompleteButton) at ClaimServiceRequests.pcf: line 464, column 33
    function checkedRowAction_131 (element :  entity.Activity, CheckedValue :  entity.Activity) : void {
      CheckedValue.complete()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ApproveButton) at ClaimServiceRequests.pcf: line 472, column 33
    function checkedRowAction_132 (element :  entity.Activity, CheckedValue :  entity.Activity) : void {
      CheckedValue.approve()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=RejectButton) at ClaimServiceRequests.pcf: line 479, column 33
    function checkedRowAction_133 (element :  entity.Activity, CheckedValue :  entity.Activity) : void {
      CheckedValue.reject()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=EditButton) at ClaimServiceRequests.pcf: line 554, column 100
    function checkedRowAction_163 (element :  entity.Note, CheckedValue :  entity.Note) : void {
      EditNotePopup.push(CheckedValue, true, false)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=DeleteButton) at ClaimServiceRequests.pcf: line 561, column 73
    function checkedRowAction_165 (element :  entity.Note, CheckedValue :  entity.Note) : void {
      gw.api.note.NotesUtilBase.deleteNote(CheckedValue)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=PrintButton) at ClaimServiceRequests.pcf: line 568, column 72
    function checkedRowAction_166 (element :  entity.Note, CheckedValue :  entity.Note) : void {
      gw.api.print.PrintNoteAction.printNote(CheckedValue)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 352, column 49
    function def_onEnter_103 (def :  pcf.StatementDV_invoice) : void {
      def.onEnter(selectedServiceRequest.LatestQuote, null, false)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 352, column 49
    function def_onEnter_105 (def :  pcf.StatementDV_quote) : void {
      def.onEnter(selectedServiceRequest.LatestQuote, null, false)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 352, column 49
    function def_onEnter_107 (def :  pcf.StatementDV_quoterevision) : void {
      def.onEnter(selectedServiceRequest.LatestQuote, null, false)
    }
    
    // 'def' attribute on ListViewInput at ClaimServiceRequests.pcf: line 359, column 80
    function def_onEnter_110 (def :  pcf.StatementDocumentsLV) : void {
      def.onEnter(selectedServiceRequest.LatestQuote, false)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 433, column 69
    function def_onEnter_127 (def :  pcf.ServiceRequestHistoryLV) : void {
      def.onEnter(selectedServiceRequest)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 441, column 168
    function def_onEnter_135 (def :  pcf.ServiceRequestActivityLV) : void {
      def.onEnter(gw.api.database.Query.make(entity.Activity).compare("ServiceRequest", Equals, selectedServiceRequest).select())
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 487, column 46
    function def_onEnter_137 (def :  pcf.DocumentAlertPanelSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 489, column 71
    function def_onEnter_159 (def :  pcf.ServiceRequestDocumentsLV) : void {
      def.onEnter(selectedServiceRequest)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 543, column 83
    function def_onEnter_167 (def :  pcf.WideNotesLV) : void {
      def.onEnter(selectedServiceRequest.NotesWithPermCheck, false)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 674, column 84
    function def_onEnter_219 (def :  pcf.ServiceRequestMessagePanelSet) : void {
      def.onEnter(selectedServiceRequest.Messages)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 163, column 39
    function def_onEnter_41 (def :  pcf.ServiceRequestDV) : void {
      def.onEnter(selectedServiceRequest, stateHandler)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 352, column 49
    function def_refreshVariables_104 (def :  pcf.StatementDV_invoice) : void {
      def.refreshVariables(selectedServiceRequest.LatestQuote, null, false)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 352, column 49
    function def_refreshVariables_106 (def :  pcf.StatementDV_quote) : void {
      def.refreshVariables(selectedServiceRequest.LatestQuote, null, false)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 352, column 49
    function def_refreshVariables_108 (def :  pcf.StatementDV_quoterevision) : void {
      def.refreshVariables(selectedServiceRequest.LatestQuote, null, false)
    }
    
    // 'def' attribute on ListViewInput at ClaimServiceRequests.pcf: line 359, column 80
    function def_refreshVariables_111 (def :  pcf.StatementDocumentsLV) : void {
      def.refreshVariables(selectedServiceRequest.LatestQuote, false)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 433, column 69
    function def_refreshVariables_128 (def :  pcf.ServiceRequestHistoryLV) : void {
      def.refreshVariables(selectedServiceRequest)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 441, column 168
    function def_refreshVariables_136 (def :  pcf.ServiceRequestActivityLV) : void {
      def.refreshVariables(gw.api.database.Query.make(entity.Activity).compare("ServiceRequest", Equals, selectedServiceRequest).select())
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 487, column 46
    function def_refreshVariables_138 (def :  pcf.DocumentAlertPanelSet) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 489, column 71
    function def_refreshVariables_160 (def :  pcf.ServiceRequestDocumentsLV) : void {
      def.refreshVariables(selectedServiceRequest)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 543, column 83
    function def_refreshVariables_168 (def :  pcf.WideNotesLV) : void {
      def.refreshVariables(selectedServiceRequest.NotesWithPermCheck, false)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 674, column 84
    function def_refreshVariables_220 (def :  pcf.ServiceRequestMessagePanelSet) : void {
      def.refreshVariables(selectedServiceRequest.Messages)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 163, column 39
    function def_refreshVariables_42 (def :  pcf.ServiceRequestDV) : void {
      def.refreshVariables(selectedServiceRequest, stateHandler)
    }
    
    // 'icon' attribute on Link (id=WaitingForQuoteApprovalAlert) at ClaimServiceRequests.pcf: line 299, column 64
    function icon_87 () : java.lang.String {
      return gw.vendormanagement.ServiceRequestStatus.ATTENTION.Icon
    }
    
    // 'initialValue' attribute on Variable at ClaimServiceRequests.pcf: line 52, column 88
    function initialValue_6 () : gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler {
      return selectedServiceRequest?.createStateHandler()
    }
    
    // 'label' attribute on TextInput (id=ActiveQuoteLabel) at ClaimServiceRequests.pcf: line 293, column 43
    function label_85 () : java.lang.Object {
      return selectedServiceRequest.QuoteLabel
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=LinkAndSend) at ClaimServiceRequests.pcf: line 504, column 51
    function onPick_143 (PickedValue :  Document) : void {
      selectedServiceRequest.linkDocumentForUI(PickedValue, true)
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=Link) at ClaimServiceRequests.pcf: line 523, column 51
    function onPick_151 (PickedValue :  Document) : void {
      selectedServiceRequest.linkDocumentForUI(PickedValue, false)
    }
    
    // 'selectOnEnter' attribute on Card (id=Invoices) at ClaimServiceRequests.pcf: line 576, column 76
    function selectOnEnter_215 () : java.lang.Boolean {
      return initialInvoice != null
    }
    
    // 'value' attribute on RowIterator at ClaimServiceRequests.pcf: line 388, column 44
    function value_126 () : entity.ServiceRequestMetric[] {
      return selectedServiceRequest.ServiceRequestMetrics.sortBy(\ m -> m.Subtype.Priority)
    }
    
    // 'visible' attribute on PanelRef (id=QuoteStatusToolbar) at ClaimServiceRequests.pcf: line 308, column 143
    function visible_102 () : java.lang.Boolean {
      return selectedServiceRequest.anyOperationAvailable({TC_ADDQUOTE, TC_APPROVEQUOTE, TC_REQUESTREQUOTE}, stateHandler)
    }
    
    // 'visible' attribute on ListViewInput at ClaimServiceRequests.pcf: line 359, column 80
    function visible_109 () : java.lang.Boolean {
      return selectedServiceRequest.LatestQuote != null
    }
    
    // 'visible' attribute on PanelSet (id=QuotePanelSet) at ClaimServiceRequests.pcf: line 281, column 82
    function visible_112 () : java.lang.Boolean {
      return selectedServiceRequest?.quoteAllowed(stateHandler)
    }
    
    // 'visible' attribute on PanelDivider at ClaimServiceRequests.pcf: line 367, column 139
    function visible_113 () : java.lang.Boolean {
      return selectedServiceRequest?.invoiceAllowed(stateHandler) or selectedServiceRequest?.quoteAllowed(stateHandler)
    }
    
    // 'visible' attribute on ToolbarButton (id=CreateNewService) at ClaimServiceRequests.pcf: line 86, column 75
    function visible_14 () : java.lang.Boolean {
      return selectedServiceRequest.IsPromotableQuoteOnly
    }
    
    // 'visible' attribute on PickerToolbarButton (id=LinkAndSend) at ClaimServiceRequests.pcf: line 504, column 51
    function visible_140 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    // 'visible' attribute on ToolbarButton (id=RefreshAsyncContent) at ClaimServiceRequests.pcf: line 535, column 151
    function visible_156 () : java.lang.Boolean {
      return documentsActionsHelper.isShowAsynchronousRefreshAction(selectedServiceRequest.ViewableDocumentLinksAndDocuments*.Second)
    }
    
    // 'visible' attribute on MenuItem (id=SpecialistResumedWork) at ClaimServiceRequests.pcf: line 99, column 121
    function visible_16 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_SPECIALISTRESUMEDWORK, false, stateHandler)
    }
    
    // 'visible' attribute on MenuItem (id=SpecialistWaiting) at ClaimServiceRequests.pcf: line 106, column 117
    function visible_18 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_SPECIALISTWAITING, false, stateHandler)
    }
    
    // 'visible' attribute on MenuItem (id=SpecialistAcceptedWork) at ClaimServiceRequests.pcf: line 113, column 122
    function visible_21 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_SPECIALISTACCEPTEDWORK, false, stateHandler)
    }
    
    // 'visible' attribute on Card (id=Messages) at ClaimServiceRequests.pcf: line 672, column 174
    function visible_221 () : java.lang.Boolean {
      return selectedServiceRequest.Progress != ServiceRequestProgress.TC_DRAFT and selectedServiceRequest.SpecialistCommMethod == SpecialistCommMethod.TC_GWPORTAL
    }
    
    // 'visible' attribute on MenuItem (id=SpecialistCompletedWork) at ClaimServiceRequests.pcf: line 120, column 123
    function visible_24 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_SPECIALISTCOMPLETEDWORK, false, stateHandler)
    }
    
    // 'visible' attribute on MenuItem (id=SpecialistDeclined) at ClaimServiceRequests.pcf: line 127, column 118
    function visible_26 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_SPECIALISTDECLINED, false, stateHandler)
    }
    
    // 'visible' attribute on MenuItem (id=SpecialistCanceled) at ClaimServiceRequests.pcf: line 134, column 118
    function visible_29 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_SPECIALISTCANCELED, false, stateHandler)
    }
    
    // 'visible' attribute on MenuItem (id=AddDelay) at ClaimServiceRequests.pcf: line 141, column 181
    function visible_32 () : java.lang.Boolean {
      return selectedServiceRequest.expectedQuoteCompletionDateApplies(stateHandler) or selectedServiceRequest.expectedServiceCompletionDateApplies(stateHandler)
    }
    
    // 'visible' attribute on ToolbarButton (id=RefreshAsyncContent) at ClaimServiceRequests.pcf: line 155, column 163
    function visible_38 () : java.lang.Boolean {
      return documentsActionsHelper.isShowAsynchronousRefreshAction(selectedServiceRequest.LatestQuote.ViewableDocumentLinksAndDocuments*.Second)
    }
    
    // 'visible' attribute on Toolbar (id=StateToolbar) at ClaimServiceRequests.pcf: line 61, column 70
    function visible_40 () : java.lang.Boolean {
      return not selectedServiceRequest.AlreadyPromoted
    }
    
    // 'visible' attribute on ToolbarButton (id=SubmitInstruction) at ClaimServiceRequests.pcf: line 68, column 115
    function visible_7 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_SUBMITINSTRUCTION, false, stateHandler)
    }
    
    // 'visible' attribute on PanelDivider at ClaimServiceRequests.pcf: line 284, column 87
    function visible_84 () : java.lang.Boolean {
      return selectedServiceRequest?.invoiceAllowed(stateHandler)
    }
    
    // 'visible' attribute on ContentInput at ClaimServiceRequests.pcf: line 296, column 186
    function visible_88 () : java.lang.Boolean {
      return selectedServiceRequest.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORAPPROVAL and selectedServiceRequest.actionRequiredVisible(stateHandler)
    }
    
    // 'visible' attribute on ToolbarButton (id=Cancel) at ClaimServiceRequests.pcf: line 75, column 118
    function visible_9 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_CANCELSERVICEREQUEST, false, stateHandler)
    }
    
    // 'visible' attribute on Link (id=ApproveQuote) at ClaimServiceRequests.pcf: line 322, column 122
    function visible_90 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_APPROVEQUOTE, false, stateHandler)
    }
    
    // 'visible' attribute on Link (id=RequestRequote) at ClaimServiceRequests.pcf: line 330, column 124
    function visible_93 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_REQUESTREQUOTE, false, stateHandler)
    }
    
    // 'visible' attribute on Link (id=AddQuote) at ClaimServiceRequests.pcf: line 337, column 165
    function visible_96 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_ADDQUOTE, false, stateHandler) and selectedServiceRequest.LatestQuote == null
    }
    
    // 'visible' attribute on Link (id=ReviseQuote) at ClaimServiceRequests.pcf: line 344, column 165
    function visible_99 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_ADDQUOTE, false, stateHandler) and selectedServiceRequest.LatestQuote != null
    }
    
    property get stateHandler () : gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler {
      return getVariableValue("stateHandler", 2) as gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler
    }
    
    property set stateHandler ($arg :  gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler) {
      setVariableValue("stateHandler", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimServiceRequestsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (claim :  Claim, initialServiceRequest :  ServiceRequest) : int {
      return 1
    }
    
    static function __constructorIndex (claim :  Claim, initialServiceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : int {
      return 2
    }
    
    // 'beforeCommit' attribute on Page (id=ClaimServiceRequests) at ClaimServiceRequests.pcf: line 11, column 85
    function beforeCommit_223 (pickedValue :  java.lang.Object) : void {
      operationCallbackHelper.BeforeCommitAction()
    }
    
    // 'canVisit' attribute on Page (id=ClaimServiceRequests) at ClaimServiceRequests.pcf: line 11, column 85
    static function canVisit_224 (claim :  Claim, initialInvoice :  ServiceRequestInvoice, initialServiceRequest :  ServiceRequest) : java.lang.Boolean {
      return perm.Claim.view(claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimServiceRequests.pcf: line 24, column 30
    function initialValue_0 () : ServiceRequest {
      return null
    }
    
    // 'initialValue' attribute on Variable at ClaimServiceRequests.pcf: line 28, column 37
    function initialValue_1 () : ServiceRequestInvoice {
      return null
    }
    
    // 'initialValue' attribute on Variable at ClaimServiceRequests.pcf: line 32, column 73
    function initialValue_2 () : gw.vendormanagement.ServiceRequestOperationCallbackHelper {
      return new gw.vendormanagement.ServiceRequestOperationCallbackHelper()
    }
    
    // 'initialValue' attribute on Variable at ClaimServiceRequests.pcf: line 36, column 52
    function initialValue_3 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'parent' attribute on Page (id=ClaimServiceRequests) at ClaimServiceRequests.pcf: line 11, column 85
    static function parent_225 (claim :  Claim, initialInvoice :  ServiceRequestInvoice, initialServiceRequest :  ServiceRequest) : pcf.api.Destination {
      return pcf.Claim.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimServiceRequests {
      return super.CurrentLocation as pcf.ClaimServiceRequests
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get initialInvoice () : ServiceRequestInvoice {
      return getVariableValue("initialInvoice", 0) as ServiceRequestInvoice
    }
    
    property set initialInvoice ($arg :  ServiceRequestInvoice) {
      setVariableValue("initialInvoice", 0, $arg)
    }
    
    property get initialServiceRequest () : ServiceRequest {
      return getVariableValue("initialServiceRequest", 0) as ServiceRequest
    }
    
    property set initialServiceRequest ($arg :  ServiceRequest) {
      setVariableValue("initialServiceRequest", 0, $arg)
    }
    
    property get operationCallbackHelper () : gw.vendormanagement.ServiceRequestOperationCallbackHelper {
      return getVariableValue("operationCallbackHelper", 0) as gw.vendormanagement.ServiceRequestOperationCallbackHelper
    }
    
    property set operationCallbackHelper ($arg :  gw.vendormanagement.ServiceRequestOperationCallbackHelper) {
      setVariableValue("operationCallbackHelper", 0, $arg)
    }
    
    
    
    function pushAssignmentPopup(Activities : Activity[]){
      var popup = new gw.api.activity.ActivityAssignmentPopup(Activities);
      AssignActivitiesPopup.push(popup)
    }
    
    // does some checking for various states before attempting to enter the promote quote popup
    function confirmCanPromoteQuote(serviceRequest : ServiceRequest) {
      for (docLink in serviceRequest.DocumentLinks){
        if (docLink.LinkedDocument == null) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.ServiceRequest.CannotPromoteQuote"))
        }
      }
    }
    
    function doKindAndMetricSubtypeMatch(selectedServiceRequest : ServiceRequest, subType : typekey.ServiceRequestMetric) : boolean {
      if (selectedServiceRequest.Kind == TC_QUOTEONLY and (subType == typekey.ServiceRequestMetric.TC_SERVICETIMELINESSSERVICEREQUESTMETRIC or subType == typekey.ServiceRequestMetric.TC_INVOICEVARIANCEVSQUOTESERVICEREQUESTMETRIC)) {
        return false
      }
      if (selectedServiceRequest.Kind == TC_SERVICEONLY and (subType == typekey.ServiceRequestMetric.TC_QUOTETIMELINESSSERVICEREQUESTMETRIC or subType == typekey.ServiceRequestMetric.TC_INVOICEVARIANCEVSQUOTESERVICEREQUESTMETRIC)) {
        return false
      }
      return true
    }
    
    function isInvoiceWarningMessageVisible(selectedServiceRequest: ServiceRequest, sh : ServiceRequestStateHandler): boolean {
      return selectedServiceRequest.Invoices.HasElements and 
              selectedServiceRequest.quoteAllowed(sh) and 
              selectedServiceRequest.IsActive
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailViewPanelExpressionsImpl extends CardViewPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=AddInvoice) at ClaimServiceRequests.pcf: line 231, column 116
    function action_58 () : void {
      NewInvoice.go(selectedServiceRequest)
    }
    
    // 'action' attribute on Link (id=ViewInvoices) at ClaimServiceRequests.pcf: line 240, column 76
    function action_61 () : void {
      ClaimServiceRequestForward.go(claim, selectedServiceRequest, selectedServiceRequest.Invoices.orderByDescending(\i -> i.StatementCreationTime).firstWhere( \ i -> i.ActionRequiredVisible == true))
    }
    
    // 'action' attribute on Link (id=AddInvoice) at ClaimServiceRequests.pcf: line 231, column 116
    function action_dest_59 () : pcf.api.Destination {
      return pcf.NewInvoice.createDestination(selectedServiceRequest)
    }
    
    // 'action' attribute on Link (id=ViewInvoices) at ClaimServiceRequests.pcf: line 240, column 76
    function action_dest_62 () : pcf.api.Destination {
      return pcf.ClaimServiceRequestForward.createDestination(claim, selectedServiceRequest, selectedServiceRequest.Invoices.orderByDescending(\i -> i.StatementCreationTime).firstWhere( \ i -> i.ActionRequiredVisible == true))
    }
    
    // 'icon' attribute on Link (id=WaitingForInvoiceAlert) at ClaimServiceRequests.pcf: line 187, column 56
    function icon_44 () : java.lang.String {
      return gw.vendormanagement.ServiceRequestStatus.ATTENTION.Icon
    }
    
    // 'initialValue' attribute on Variable at ClaimServiceRequests.pcf: line 173, column 38
    function initialValue_43 () : String {
      return selectedServiceRequest.WaitingForInvoiceAlertText
    }
    
    // 'label' attribute on Link (id=WaitingForInvoiceAlertText) at ClaimServiceRequests.pcf: line 190, column 86
    function label_45 () : java.lang.Object {
      return selectedServiceRequest.WaitingForInvoiceAlertText
    }
    
    // 'label' attribute on CurrencyInput (id=ActiveChecksAmount) at ClaimServiceRequests.pcf: line 261, column 80
    function label_71 () : java.lang.Object {
      return selectedServiceRequest.ActiveChecksAmountIncludesNonExclusiveChecks ? DisplayKey.get("Web.ServiceRequest.Invoices.ActiveChecksAmountStar") : DisplayKey.get("Web.ServiceRequest.Invoices.ActiveChecksAmount")
    }
    
    // 'value' attribute on CurrencyInput (id=OutstandingInvoicesAmount) at ClaimServiceRequests.pcf: line 255, column 80
    function valueRoot_69 () : java.lang.Object {
      return selectedServiceRequest
    }
    
    // 'value' attribute on CurrencyInput (id=OutstandingInvoicesAmount) at ClaimServiceRequests.pcf: line 255, column 80
    function value_66 () : gw.api.financials.CurrencyAmount {
      return selectedServiceRequest.OutstandingInvoicesAmount
    }
    
    // 'value' attribute on CurrencyInput (id=ActiveChecksAmount) at ClaimServiceRequests.pcf: line 261, column 80
    function value_72 () : gw.api.financials.CurrencyAmount {
      return selectedServiceRequest.ActiveChecksAmount
    }
    
    // 'value' attribute on CurrencyInput (id=TotalInvoiced) at ClaimServiceRequests.pcf: line 267, column 80
    function value_78 () : gw.api.financials.CurrencyAmount {
      return selectedServiceRequest.OutstandingInvoicesAmount.add(selectedServiceRequest.ActiveChecksAmount)
    }
    
    // 'visible' attribute on ContentInput at ClaimServiceRequests.pcf: line 184, column 73
    function visible_46 () : java.lang.Boolean {
      return waitingForInvoiceAlertText.HasContent
    }
    
    // 'visible' attribute on ContentInput at ClaimServiceRequests.pcf: line 194, column 151
    function visible_49 () : java.lang.Boolean {
      return isInvoiceWarningMessageVisible(selectedServiceRequest, stateHandler) and selectedServiceRequest.LatestQuote == null
    }
    
    // 'visible' attribute on ContentInput at ClaimServiceRequests.pcf: line 204, column 241
    function visible_52 () : java.lang.Boolean {
      return isInvoiceWarningMessageVisible(selectedServiceRequest, stateHandler) and selectedServiceRequest.LatestQuote != null and selectedServiceRequest.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORAPPROVAL
    }
    
    // 'visible' attribute on ContentInput at ClaimServiceRequests.pcf: line 214, column 238
    function visible_55 () : java.lang.Boolean {
      return isInvoiceWarningMessageVisible(selectedServiceRequest, stateHandler) and selectedServiceRequest.LatestQuote != null and selectedServiceRequest.QuoteStatus == ServiceRequestQuoteStatus.TC_WAITINGFORQUOTE
    }
    
    // 'visible' attribute on Link (id=AddInvoice) at ClaimServiceRequests.pcf: line 231, column 116
    function visible_57 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_ADDINVOICE, false, stateHandler)
    }
    
    // 'visible' attribute on TextInput (id=NoInvoicesMessage) at ClaimServiceRequests.pcf: line 249, column 76
    function visible_63 () : java.lang.Boolean {
      return selectedServiceRequest.Invoices.IsEmpty
    }
    
    // 'visible' attribute on CurrencyInput (id=OutstandingInvoicesAmount) at ClaimServiceRequests.pcf: line 255, column 80
    function visible_65 () : java.lang.Boolean {
      return not selectedServiceRequest.Invoices.IsEmpty
    }
    
    // 'visible' attribute on TextInput (id=ActiveChecksAmountIncludesNonExclusiveChecksMessage) at ClaimServiceRequests.pcf: line 275, column 104
    function visible_81 () : java.lang.Boolean {
      return selectedServiceRequest.ActiveChecksAmountIncludesNonExclusiveChecks
    }
    
    // 'visible' attribute on DetailViewPanel at ClaimServiceRequests.pcf: line 168, column 83
    function visible_83 () : java.lang.Boolean {
      return selectedServiceRequest.invoiceAllowed(stateHandler)
    }
    
    property get waitingForInvoiceAlertText () : String {
      return getVariableValue("waitingForInvoiceAlertText", 3) as String
    }
    
    property set waitingForInvoiceAlertText ($arg :  String) {
      setVariableValue("waitingForInvoiceAlertText", 3, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ListDetailPanel2ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 4)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=ActionRequired) at ClaimServiceRequests.pcf: line 610, column 46
    function iconLabel_185 () : java.lang.String {
      return invoice.ActionRequiredIcon.Label
    }
    
    // 'icon' attribute on BooleanRadioCell (id=ActionRequired) at ClaimServiceRequests.pcf: line 610, column 46
    function icon_184 () : java.lang.String {
      return invoice.ActionRequiredIcon.Icon
    }
    
    // 'value' attribute on TextCell (id=ReferenceNumber) at ClaimServiceRequests.pcf: line 602, column 58
    function valueRoot_183 () : java.lang.Object {
      return invoice
    }
    
    // 'value' attribute on TextCell (id=CheckNumber) at ClaimServiceRequests.pcf: line 633, column 60
    function valueRoot_199 () : java.lang.Object {
      return invoice.Check
    }
    
    // 'value' attribute on TextCell (id=ReferenceNumber) at ClaimServiceRequests.pcf: line 602, column 58
    function value_181 () : java.lang.String {
      return invoice.ReferenceNumber
    }
    
    // 'value' attribute on DateCell (id=SubmittedDate) at ClaimServiceRequests.pcf: line 616, column 64
    function value_186 () : java.util.Date {
      return invoice.StatementCreationTime
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at ClaimServiceRequests.pcf: line 620, column 49
    function value_189 () : gw.api.financials.CurrencyAmount {
      return invoice.Amount
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at ClaimServiceRequests.pcf: line 625, column 74
    function value_192 () : typekey.ServiceRequestInvoiceStatus {
      return invoice.Status
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimServiceRequests.pcf: line 629, column 64
    function value_195 () : java.lang.String {
      return invoice.Description.elide(28)
    }
    
    // 'value' attribute on TextCell (id=CheckNumber) at ClaimServiceRequests.pcf: line 633, column 60
    function value_197 () : java.lang.String {
      return invoice.Check.CheckNumber
    }
    
    // 'value' attribute on CurrencyCell (id=CheckAmount) at ClaimServiceRequests.pcf: line 637, column 60
    function value_200 () : gw.api.financials.CurrencyAmount {
      return invoice.Check.GrossAmount
    }
    
    // 'value' attribute on TypeKeyCell (id=CheckStatus) at ClaimServiceRequests.pcf: line 642, column 64
    function value_203 () : typekey.TransactionStatus {
      return invoice.Check.Status
    }
    
    property get invoice () : entity.ServiceRequestInvoice {
      return getIteratedValue(4) as entity.ServiceRequestInvoice
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CardViewPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'fontColor' attribute on TextCell (id=MetricValue) at ClaimServiceRequests.pcf: line 411, column 62
    function fontColor_119 () : java.lang.String {
      return metric.DisplayColor
    }
    
    // 'icon' attribute on BooleanRadioCell (id=MetricStatus) at ClaimServiceRequests.pcf: line 398, column 54
    function icon_114 () : java.lang.String {
      return metric.Status.Icon
    }
    
    // 'value' attribute on TypeKeyCell (id=MetricName) at ClaimServiceRequests.pcf: line 404, column 75
    function valueRoot_117 () : java.lang.Object {
      return metric
    }
    
    // 'value' attribute on TypeKeyCell (id=MetricName) at ClaimServiceRequests.pcf: line 404, column 75
    function value_115 () : typekey.ServiceRequestMetric {
      return metric.Subtype
    }
    
    // 'value' attribute on TextCell (id=MetricValue) at ClaimServiceRequests.pcf: line 411, column 62
    function value_118 () : java.lang.String {
      return metric.DisplayValue
    }
    
    // 'value' attribute on TextCell (id=MetricTargetValue) at ClaimServiceRequests.pcf: line 418, column 51
    function value_122 () : java.lang.String {
      return metric.DisplayTargetValue
    }
    
    // 'visible' attribute on Row at ClaimServiceRequests.pcf: line 390, column 109
    function visible_125 () : java.lang.Boolean {
      return doKindAndMetricSubtypeMatch(selectedServiceRequest, metric.Subtype)
    }
    
    property get metric () : entity.ServiceRequestMetric {
      return getIteratedValue(3) as entity.ServiceRequestMetric
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanel2ExpressionsImpl extends CardViewPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=AddInvoice) at ClaimServiceRequests.pcf: line 588, column 110
    function action_170 () : void {
      NewInvoice.go(selectedServiceRequest)
    }
    
    // 'action' attribute on ToolbarButton (id=AddInvoice) at ClaimServiceRequests.pcf: line 588, column 110
    function action_dest_171 () : pcf.api.Destination {
      return pcf.NewInvoice.createDestination(selectedServiceRequest)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 654, column 37
    function def_onEnter_208 (def :  pcf.InvoicePanelSet) : void {
      def.onEnter(selectedInvoice, stateHandler, operationCallbackHelper)
    }
    
    // 'def' attribute on PanelRef at ClaimServiceRequests.pcf: line 654, column 37
    function def_refreshVariables_209 (def :  pcf.InvoicePanelSet) : void {
      def.refreshVariables(selectedInvoice, stateHandler, operationCallbackHelper)
    }
    
    // 'selectionOnEnter' attribute on ListDetailPanel at ClaimServiceRequests.pcf: line 580, column 53
    function selectionOnEnter_213 () : java.lang.Object {
      return initialInvoice
    }
    
    // 'value' attribute on RowIterator at ClaimServiceRequests.pcf: line 602, column 58
    function sortValue_172 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.ReferenceNumber
    }
    
    // 'value' attribute on RowIterator at ClaimServiceRequests.pcf: line 610, column 46
    function sortValue_173 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return true
    }
    
    // 'value' attribute on RowIterator at ClaimServiceRequests.pcf: line 616, column 64
    function sortValue_174 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.StatementCreationTime
    }
    
    // 'value' attribute on RowIterator at ClaimServiceRequests.pcf: line 620, column 49
    function sortValue_175 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.Amount
    }
    
    // 'value' attribute on RowIterator at ClaimServiceRequests.pcf: line 625, column 74
    function sortValue_176 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.Status
    }
    
    // 'value' attribute on RowIterator at ClaimServiceRequests.pcf: line 629, column 64
    function sortValue_177 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.Description.elide(28)
    }
    
    // 'value' attribute on RowIterator at ClaimServiceRequests.pcf: line 633, column 60
    function sortValue_178 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.Check.CheckNumber
    }
    
    // 'value' attribute on RowIterator at ClaimServiceRequests.pcf: line 637, column 60
    function sortValue_179 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.Check.GrossAmount
    }
    
    // 'value' attribute on RowIterator at ClaimServiceRequests.pcf: line 642, column 64
    function sortValue_180 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.Check.Status
    }
    
    // 'value' attribute on RowIterator at ClaimServiceRequests.pcf: line 597, column 64
    function value_206 () : entity.ServiceRequestInvoice[] {
      return selectedServiceRequest.Invoices
    }
    
    // 'visible' attribute on ToolbarButton (id=AddInvoice) at ClaimServiceRequests.pcf: line 588, column 110
    function visible_169 () : java.lang.Boolean {
      return selectedServiceRequest.operationAvailable(TC_ADDINVOICE, false, stateHandler)
    }
    
    // 'visible' attribute on ListViewPanel (id=ServiceRequestInvoicesLV) at ClaimServiceRequests.pcf: line 592, column 130
    function visible_207 () : java.lang.Boolean {
      return selectedServiceRequest?.invoiceAllowed(stateHandler) and not selectedServiceRequest.Invoices.IsEmpty
    }
    
    // 'visible' attribute on TextInput (id=InvoiceTabNoInvoicesMessage) at ClaimServiceRequests.pcf: line 664, column 72
    function visible_211 () : java.lang.Boolean {
      return selectedServiceRequest.Invoices.IsEmpty
    }
    
    property get selectedInvoice () : ServiceRequestInvoice {
      return getCurrentSelection(3) as ServiceRequestInvoice
    }
    
    property set selectedInvoice ($arg :  ServiceRequestInvoice) {
      setCurrentSelection(3, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimServiceRequestsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef (id=ServiceRequestList) at ClaimServiceRequests.pcf: line 44, column 35
    function def_onEnter_4 (def :  pcf.ServiceRequestLV) : void {
      def.onEnter(claim, false, operationCallbackHelper)
    }
    
    // 'def' attribute on PanelRef (id=ServiceRequestList) at ClaimServiceRequests.pcf: line 44, column 35
    function def_refreshVariables_5 (def :  pcf.ServiceRequestLV) : void {
      def.refreshVariables(claim, false, operationCallbackHelper)
    }
    
    // 'selectionOnEnter' attribute on ListDetailPanel at ClaimServiceRequests.pcf: line 41, column 40
    function selectionOnEnter_222 () : java.lang.Object {
      return initialServiceRequest
    }
    
    property get selectedServiceRequest () : ServiceRequest {
      return getCurrentSelection(1) as ServiceRequest
    }
    
    property set selectedServiceRequest ($arg :  ServiceRequest) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}