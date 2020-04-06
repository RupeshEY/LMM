package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/NewInvoice.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewInvoiceExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/NewInvoice.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewInvoiceExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serviceRequest :  ServiceRequest) : int {
      return 0
    }
    
    // 'action' attribute on PickerToolbarButton (id=Link) at NewInvoice.pcf: line 61, column 49
    function action_14 () : void {
      PickExistingDocumentPopup.push(serviceRequest.Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AttachDocument) at NewInvoice.pcf: line 66, column 98
    function action_18 () : void {
      AttachStatementDocumentsPopup.push(invoice)
    }
    
    // 'action' attribute on PickerToolbarButton (id=Link) at NewInvoice.pcf: line 61, column 49
    function action_dest_15 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(serviceRequest.Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AttachDocument) at NewInvoice.pcf: line 66, column 98
    function action_dest_19 () : pcf.api.Destination {
      return pcf.AttachStatementDocumentsPopup.createDestination(invoice)
    }
    
    // 'afterCancel' attribute on Page (id=NewInvoice) at NewInvoice.pcf: line 13, column 98
    function afterCancel_22 () : void {
      pcf.ClaimServiceRequests.go(serviceRequest.Claim, serviceRequest)
    }
    
    // 'afterCancel' attribute on Page (id=NewInvoice) at NewInvoice.pcf: line 13, column 98
    function afterCancel_dest_23 () : pcf.api.Destination {
      return pcf.ClaimServiceRequests.createDestination(serviceRequest.Claim, serviceRequest)
    }
    
    // 'afterCommit' attribute on Page (id=NewInvoice) at NewInvoice.pcf: line 13, column 98
    function afterCommit_24 (TopLocation :  pcf.api.Location) : void {
      pcf.ClaimServiceRequests.go(serviceRequest.Claim, serviceRequest, invoice)
    }
    
    // 'available' attribute on PickerToolbarButton (id=Link) at NewInvoice.pcf: line 61, column 49
    function available_12 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'available' attribute on ToolbarButton (id=AttachDocument) at NewInvoice.pcf: line 66, column 98
    function available_17 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable and documentsActionsHelper.DocumentContentActionsAvailable
    }
    
    // 'beforeCommit' attribute on Page (id=NewInvoice) at NewInvoice.pcf: line 13, column 98
    function beforeCommit_25 (pickedValue :  java.lang.Object) : void {
      invoice.finishSetup(false)
    }
    
    // 'def' attribute on PanelRef at NewInvoice.pcf: line 47, column 37
    function def_onEnter_10 (def :  pcf.StatementDV_quoterevision) : void {
      def.onEnter(invoice, null, true)
    }
    
    // 'def' attribute on ListViewInput at NewInvoice.pcf: line 53, column 31
    function def_onEnter_20 (def :  pcf.StatementDocumentsLV) : void {
      def.onEnter(invoice, true)
    }
    
    // 'def' attribute on PanelRef at NewInvoice.pcf: line 47, column 37
    function def_onEnter_6 (def :  pcf.StatementDV_invoice) : void {
      def.onEnter(invoice, null, true)
    }
    
    // 'def' attribute on PanelRef at NewInvoice.pcf: line 47, column 37
    function def_onEnter_8 (def :  pcf.StatementDV_quote) : void {
      def.onEnter(invoice, null, true)
    }
    
    // 'def' attribute on PanelRef at NewInvoice.pcf: line 47, column 37
    function def_refreshVariables_11 (def :  pcf.StatementDV_quoterevision) : void {
      def.refreshVariables(invoice, null, true)
    }
    
    // 'def' attribute on ListViewInput at NewInvoice.pcf: line 53, column 31
    function def_refreshVariables_21 (def :  pcf.StatementDocumentsLV) : void {
      def.refreshVariables(invoice, true)
    }
    
    // 'def' attribute on PanelRef at NewInvoice.pcf: line 47, column 37
    function def_refreshVariables_7 (def :  pcf.StatementDV_invoice) : void {
      def.refreshVariables(invoice, null, true)
    }
    
    // 'def' attribute on PanelRef at NewInvoice.pcf: line 47, column 37
    function def_refreshVariables_9 (def :  pcf.StatementDV_quote) : void {
      def.refreshVariables(invoice, null, true)
    }
    
    // 'initialValue' attribute on Variable at NewInvoice.pcf: line 19, column 37
    function initialValue_0 () : ServiceRequestInvoice {
      return initializeInvoice()
    }
    
    // 'initialValue' attribute on Variable at NewInvoice.pcf: line 26, column 52
    function initialValue_1 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // EditButtons at NewInvoice.pcf: line 31, column 45
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=Link) at NewInvoice.pcf: line 61, column 49
    function onPick_16 (PickedValue :  Document) : void {
      invoice.linkDocumentForUI(PickedValue, false)
    }
    
    // 'parent' attribute on Page (id=NewInvoice) at NewInvoice.pcf: line 13, column 98
    static function parent_26 (serviceRequest :  ServiceRequest) : pcf.api.Destination {
      return pcf.Claim.createDestination(serviceRequest.Claim)
    }
    
    // 'visible' attribute on PickerToolbarButton (id=Link) at NewInvoice.pcf: line 61, column 49
    function visible_13 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    // 'visible' attribute on AlertBar (id=IDCSDisabledAlert) at NewInvoice.pcf: line 36, column 68
    function visible_3 () : java.lang.Boolean {
      return not documentsActionsHelper.ContentSourceEnabled
    }
    
    // 'visible' attribute on AlertBar (id=IDCSUnavailableAlert) at NewInvoice.pcf: line 40, column 72
    function visible_4 () : java.lang.Boolean {
      return documentsActionsHelper.ShowContentServerDownWarning
    }
    
    // 'visible' attribute on AlertBar (id=IDMSUnavailableAlert) at NewInvoice.pcf: line 44, column 73
    function visible_5 () : java.lang.Boolean {
      return documentsActionsHelper.ShowMetadataServerDownWarning
    }
    
    override property get CurrentLocation () : pcf.NewInvoice {
      return super.CurrentLocation as pcf.NewInvoice
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get invoice () : ServiceRequestInvoice {
      return getVariableValue("invoice", 0) as ServiceRequestInvoice
    }
    
    property set invoice ($arg :  ServiceRequestInvoice) {
      setVariableValue("invoice", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    function initializeInvoice() : ServiceRequestInvoice{
      var statement = new ServiceRequestInvoice() {
        :ServiceRequest = serviceRequest,
        :Source = StatementSource.TC_MANUAL
      }
      return statement
    }
    
    
  }
  
  
}