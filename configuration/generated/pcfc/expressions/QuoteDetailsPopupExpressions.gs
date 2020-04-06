package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/QuoteDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuoteDetailsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/QuoteDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuoteDetailsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (quote :  ServiceRequestQuote) : int {
      return 0
    }
    
    // 'action' attribute on Link (id=ApproveQuote) at QuoteDetailsPopup.pcf: line 38, column 98
    function action_3 () : void {
      ApproveQuotePopup.push(serviceRequest)
    }
    
    // 'action' attribute on Link (id=RequestRequote) at QuoteDetailsPopup.pcf: line 46, column 100
    function action_6 () : void {
      RequestRequotePopup.push(serviceRequest)
    }
    
    // 'action' attribute on Link (id=ReviseQuote) at QuoteDetailsPopup.pcf: line 53, column 94
    function action_9 () : void {
      AddReviseQuotePopup.push(serviceRequest, serviceRequest.LatestQuote)
    }
    
    // 'action' attribute on Link (id=ReviseQuote) at QuoteDetailsPopup.pcf: line 53, column 94
    function action_dest_10 () : pcf.api.Destination {
      return pcf.AddReviseQuotePopup.createDestination(serviceRequest, serviceRequest.LatestQuote)
    }
    
    // 'action' attribute on Link (id=ApproveQuote) at QuoteDetailsPopup.pcf: line 38, column 98
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ApproveQuotePopup.createDestination(serviceRequest)
    }
    
    // 'action' attribute on Link (id=RequestRequote) at QuoteDetailsPopup.pcf: line 46, column 100
    function action_dest_7 () : pcf.api.Destination {
      return pcf.RequestRequotePopup.createDestination(serviceRequest)
    }
    
    // 'afterReturnFromPopup' attribute on Popup (id=QuoteDetailsPopup) at QuoteDetailsPopup.pcf: line 9, column 78
    function afterReturnFromPopup_20 (popupCommitted :  boolean) : void {
      quote = serviceRequest.LatestQuote
    }
    
    // 'def' attribute on PanelRef at QuoteDetailsPopup.pcf: line 59, column 35
    function def_onEnter_12 (def :  pcf.StatementDV_invoice) : void {
      def.onEnter(quote, quote?.Amount, false)
    }
    
    // 'def' attribute on PanelRef at QuoteDetailsPopup.pcf: line 59, column 35
    function def_onEnter_14 (def :  pcf.StatementDV_quote) : void {
      def.onEnter(quote, quote?.Amount, false)
    }
    
    // 'def' attribute on PanelRef at QuoteDetailsPopup.pcf: line 59, column 35
    function def_onEnter_16 (def :  pcf.StatementDV_quoterevision) : void {
      def.onEnter(quote, quote?.Amount, false)
    }
    
    // 'def' attribute on ListViewInput at QuoteDetailsPopup.pcf: line 65, column 31
    function def_onEnter_18 (def :  pcf.StatementDocumentsLV) : void {
      def.onEnter(quote, false)
    }
    
    // 'def' attribute on PanelRef at QuoteDetailsPopup.pcf: line 59, column 35
    function def_refreshVariables_13 (def :  pcf.StatementDV_invoice) : void {
      def.refreshVariables(quote, quote?.Amount, false)
    }
    
    // 'def' attribute on PanelRef at QuoteDetailsPopup.pcf: line 59, column 35
    function def_refreshVariables_15 (def :  pcf.StatementDV_quote) : void {
      def.refreshVariables(quote, quote?.Amount, false)
    }
    
    // 'def' attribute on PanelRef at QuoteDetailsPopup.pcf: line 59, column 35
    function def_refreshVariables_17 (def :  pcf.StatementDV_quoterevision) : void {
      def.refreshVariables(quote, quote?.Amount, false)
    }
    
    // 'def' attribute on ListViewInput at QuoteDetailsPopup.pcf: line 65, column 31
    function def_refreshVariables_19 (def :  pcf.StatementDocumentsLV) : void {
      def.refreshVariables(quote, false)
    }
    
    // 'initialValue' attribute on Variable at QuoteDetailsPopup.pcf: line 18, column 30
    function initialValue_0 () : ServiceRequest {
      return quote.ServiceRequest
    }
    
    // 'initialValue' attribute on Variable at QuoteDetailsPopup.pcf: line 22, column 82
    function initialValue_1 () : gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler {
      return serviceRequest.createStateHandler()
    }
    
    // 'visible' attribute on DetailViewPanel at QuoteDetailsPopup.pcf: line 26, column 66
    function visible_11 () : java.lang.Boolean {
      return quote.ServiceRequest.LatestQuote.equals(quote)
    }
    
    // 'visible' attribute on Link (id=ApproveQuote) at QuoteDetailsPopup.pcf: line 38, column 98
    function visible_2 () : java.lang.Boolean {
      return serviceRequest.operationAvailable(TC_APPROVEQUOTE, false, stateHandler)
    }
    
    // 'visible' attribute on Link (id=RequestRequote) at QuoteDetailsPopup.pcf: line 46, column 100
    function visible_5 () : java.lang.Boolean {
      return serviceRequest.operationAvailable(TC_REQUESTREQUOTE, false, stateHandler)
    }
    
    // 'visible' attribute on Link (id=ReviseQuote) at QuoteDetailsPopup.pcf: line 53, column 94
    function visible_8 () : java.lang.Boolean {
      return serviceRequest.operationAvailable(TC_ADDQUOTE, false, stateHandler)
    }
    
    override property get CurrentLocation () : pcf.QuoteDetailsPopup {
      return super.CurrentLocation as pcf.QuoteDetailsPopup
    }
    
    property get quote () : ServiceRequestQuote {
      return getVariableValue("quote", 0) as ServiceRequestQuote
    }
    
    property set quote ($arg :  ServiceRequestQuote) {
      setVariableValue("quote", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    property get stateHandler () : gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler {
      return getVariableValue("stateHandler", 0) as gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler
    }
    
    property set stateHandler ($arg :  gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler) {
      setVariableValue("stateHandler", 0, $arg)
    }
    
    
  }
  
  
}