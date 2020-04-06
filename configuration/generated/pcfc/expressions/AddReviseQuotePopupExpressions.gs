package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/AddReviseQuotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddReviseQuotePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/AddReviseQuotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddReviseQuotePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serviceRequest :  entity.ServiceRequest) : int {
      return 0
    }
    
    static function __constructorIndex (serviceRequest :  entity.ServiceRequest, oldQuote :  entity.ServiceRequestQuote) : int {
      return 1
    }
    
    // 'action' attribute on PickerToolbarButton (id=Link) at AddReviseQuotePopup.pcf: line 68, column 49
    function action_16 () : void {
      PickExistingDocumentPopup.push(serviceRequest.Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AttachDocument) at AddReviseQuotePopup.pcf: line 73, column 98
    function action_20 () : void {
      AttachStatementDocumentsPopup.push(currentQuote)
    }
    
    // 'action' attribute on PickerToolbarButton (id=Link) at AddReviseQuotePopup.pcf: line 68, column 49
    function action_dest_17 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(serviceRequest.Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AttachDocument) at AddReviseQuotePopup.pcf: line 73, column 98
    function action_dest_21 () : pcf.api.Destination {
      return pcf.AttachStatementDocumentsPopup.createDestination(currentQuote)
    }
    
    // 'available' attribute on PickerToolbarButton (id=Link) at AddReviseQuotePopup.pcf: line 68, column 49
    function available_14 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'available' attribute on ToolbarButton (id=AttachDocument) at AddReviseQuotePopup.pcf: line 73, column 98
    function available_19 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable and documentsActionsHelper.DocumentContentActionsAvailable
    }
    
    // 'beforeCommit' attribute on Popup (id=AddReviseQuotePopup) at AddReviseQuotePopup.pcf: line 11, column 18
    function beforeCommit_24 (pickedValue :  java.lang.Object) : void {
      currentQuote.finishSetup(false)
    }
    
    // 'def' attribute on PanelRef at AddReviseQuotePopup.pcf: line 54, column 82
    function def_onEnter_11 (def :  pcf.StatementDV_quoterevision) : void {
      def.onEnter(currentQuote, oldQuote?.Amount, true)
    }
    
    // 'def' attribute on ListViewInput at AddReviseQuotePopup.pcf: line 60, column 31
    function def_onEnter_22 (def :  pcf.StatementDocumentsLV) : void {
      def.onEnter(currentQuote, true)
    }
    
    // 'def' attribute on PanelRef at AddReviseQuotePopup.pcf: line 54, column 82
    function def_onEnter_7 (def :  pcf.StatementDV_invoice) : void {
      def.onEnter(currentQuote, oldQuote?.Amount, true)
    }
    
    // 'def' attribute on PanelRef at AddReviseQuotePopup.pcf: line 54, column 82
    function def_onEnter_9 (def :  pcf.StatementDV_quote) : void {
      def.onEnter(currentQuote, oldQuote?.Amount, true)
    }
    
    // 'def' attribute on PanelRef at AddReviseQuotePopup.pcf: line 54, column 82
    function def_refreshVariables_10 (def :  pcf.StatementDV_quote) : void {
      def.refreshVariables(currentQuote, oldQuote?.Amount, true)
    }
    
    // 'def' attribute on PanelRef at AddReviseQuotePopup.pcf: line 54, column 82
    function def_refreshVariables_12 (def :  pcf.StatementDV_quoterevision) : void {
      def.refreshVariables(currentQuote, oldQuote?.Amount, true)
    }
    
    // 'def' attribute on ListViewInput at AddReviseQuotePopup.pcf: line 60, column 31
    function def_refreshVariables_23 (def :  pcf.StatementDocumentsLV) : void {
      def.refreshVariables(currentQuote, true)
    }
    
    // 'def' attribute on PanelRef at AddReviseQuotePopup.pcf: line 54, column 82
    function def_refreshVariables_8 (def :  pcf.StatementDV_invoice) : void {
      def.refreshVariables(currentQuote, oldQuote?.Amount, true)
    }
    
    // 'initialValue' attribute on Variable at AddReviseQuotePopup.pcf: line 22, column 35
    function initialValue_0 () : ServiceRequestQuote {
      return initializeQuote()
    }
    
    // 'initialValue' attribute on Variable at AddReviseQuotePopup.pcf: line 29, column 52
    function initialValue_1 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // EditButtons at AddReviseQuotePopup.pcf: line 38, column 45
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on PanelRef at AddReviseQuotePopup.pcf: line 54, column 82
    function mode_13 () : java.lang.Object {
      return oldQuote != null ? "quoterevision" : "quote"
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=Link) at AddReviseQuotePopup.pcf: line 68, column 49
    function onPick_18 (PickedValue :  Document) : void {
      currentQuote.linkDocumentForUI(PickedValue, false)
    }
    
    // 'title' attribute on TitleBar (id=TitleBar) at AddReviseQuotePopup.pcf: line 34, column 226
    function title_2 () : java.lang.String {
      return oldQuote == null ? DisplayKey.get("Web.ServiceRequest.StateTransition.AddReviseQuotePopup.AddTitle") : DisplayKey.get("Web.ServiceRequest.StateTransition.AddReviseQuotePopup.ReviseTitle")
    }
    
    // 'title' attribute on Popup (id=AddReviseQuotePopup) at AddReviseQuotePopup.pcf: line 11, column 18
    static function title_25 (oldQuote :  entity.ServiceRequestQuote, serviceRequest :  entity.ServiceRequest) : java.lang.Object {
      return null
    }
    
    // 'visible' attribute on PickerToolbarButton (id=Link) at AddReviseQuotePopup.pcf: line 68, column 49
    function visible_15 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    // 'visible' attribute on AlertBar (id=IDCSDisabledAlert) at AddReviseQuotePopup.pcf: line 43, column 68
    function visible_4 () : java.lang.Boolean {
      return not documentsActionsHelper.ContentSourceEnabled
    }
    
    // 'visible' attribute on AlertBar (id=IDCSUnavailableAlert) at AddReviseQuotePopup.pcf: line 47, column 72
    function visible_5 () : java.lang.Boolean {
      return documentsActionsHelper.ShowContentServerDownWarning
    }
    
    // 'visible' attribute on AlertBar (id=IDMSUnavailableAlert) at AddReviseQuotePopup.pcf: line 51, column 73
    function visible_6 () : java.lang.Boolean {
      return documentsActionsHelper.ShowMetadataServerDownWarning
    }
    
    override property get CurrentLocation () : pcf.AddReviseQuotePopup {
      return super.CurrentLocation as pcf.AddReviseQuotePopup
    }
    
    property get currentQuote () : ServiceRequestQuote {
      return getVariableValue("currentQuote", 0) as ServiceRequestQuote
    }
    
    property set currentQuote ($arg :  ServiceRequestQuote) {
      setVariableValue("currentQuote", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get oldQuote () : entity.ServiceRequestQuote {
      return getVariableValue("oldQuote", 0) as entity.ServiceRequestQuote
    }
    
    property set oldQuote ($arg :  entity.ServiceRequestQuote) {
      setVariableValue("oldQuote", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    function initializeQuote(): ServiceRequestQuote {
        var newQuote = (oldQuote == null)
            ? new ServiceRequestQuote()
            : oldQuote.copyQuoteForRevision()
    
        newQuote.ServiceRequest = serviceRequest
        newQuote.Source = StatementSource.TC_MANUAL
      
        return newQuote
    }
    
    
  }
  
  
}