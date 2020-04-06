package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PromoteQuoteOnlyExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PromoteQuoteOnlyExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (originalServiceRequest :  ServiceRequest) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=PromoteQuoteOnly) at PromoteQuoteOnly.pcf: line 14, column 101
    function afterCancel_16 () : void {
      pcf.ClaimServiceRequests.go(originalServiceRequest.Claim, originalServiceRequest)
    }
    
    // 'afterCancel' attribute on Page (id=PromoteQuoteOnly) at PromoteQuoteOnly.pcf: line 14, column 101
    function afterCancel_dest_17 () : pcf.api.Destination {
      return pcf.ClaimServiceRequests.createDestination(originalServiceRequest.Claim, originalServiceRequest)
    }
    
    // 'afterCommit' attribute on Page (id=PromoteQuoteOnly) at PromoteQuoteOnly.pcf: line 14, column 101
    function afterCommit_18 (TopLocation :  pcf.api.Location) : void {
      pcf.ClaimServiceRequests.go(newServiceRequest.Claim, newServiceRequest)
    }
    
    // 'beforeCommit' attribute on Page (id=PromoteQuoteOnly) at PromoteQuoteOnly.pcf: line 14, column 101
    function beforeCommit_19 (pickedValue :  java.lang.Object) : void {
      newServiceRequest.finishSetupForPromotedServiceRequest()
    }
    
    // 'def' attribute on PanelRef at PromoteQuoteOnly.pcf: line 59, column 29
    function def_onEnter_11 (def :  pcf.StatementDV_quoterevision) : void {
      def.onEnter(newServiceRequest.LatestQuote, null, false)
    }
    
    // 'def' attribute on ListViewInput (id=QuoteDocumentsLV) at PromoteQuoteOnly.pcf: line 68, column 65
    function def_onEnter_14 (def :  pcf.StatementDocumentsLV) : void {
      def.onEnter(newServiceRequest.LatestQuote, false)
    }
    
    // 'def' attribute on PanelRef (id=NewServiceRequestDV) at PromoteQuoteOnly.pcf: line 42, column 39
    function def_onEnter_5 (def :  pcf.NewServiceRequestDV) : void {
      def.onEnter(newServiceRequest, false, {})
    }
    
    // 'def' attribute on PanelRef at PromoteQuoteOnly.pcf: line 59, column 29
    function def_onEnter_7 (def :  pcf.StatementDV_invoice) : void {
      def.onEnter(newServiceRequest.LatestQuote, null, false)
    }
    
    // 'def' attribute on PanelRef at PromoteQuoteOnly.pcf: line 59, column 29
    function def_onEnter_9 (def :  pcf.StatementDV_quote) : void {
      def.onEnter(newServiceRequest.LatestQuote, null, false)
    }
    
    // 'def' attribute on PanelRef at PromoteQuoteOnly.pcf: line 59, column 29
    function def_refreshVariables_10 (def :  pcf.StatementDV_quote) : void {
      def.refreshVariables(newServiceRequest.LatestQuote, null, false)
    }
    
    // 'def' attribute on PanelRef at PromoteQuoteOnly.pcf: line 59, column 29
    function def_refreshVariables_12 (def :  pcf.StatementDV_quoterevision) : void {
      def.refreshVariables(newServiceRequest.LatestQuote, null, false)
    }
    
    // 'def' attribute on ListViewInput (id=QuoteDocumentsLV) at PromoteQuoteOnly.pcf: line 68, column 65
    function def_refreshVariables_15 (def :  pcf.StatementDocumentsLV) : void {
      def.refreshVariables(newServiceRequest.LatestQuote, false)
    }
    
    // 'def' attribute on PanelRef (id=NewServiceRequestDV) at PromoteQuoteOnly.pcf: line 42, column 39
    function def_refreshVariables_6 (def :  pcf.NewServiceRequestDV) : void {
      def.refreshVariables(newServiceRequest, false, {})
    }
    
    // 'def' attribute on PanelRef at PromoteQuoteOnly.pcf: line 59, column 29
    function def_refreshVariables_8 (def :  pcf.StatementDV_invoice) : void {
      def.refreshVariables(newServiceRequest.LatestQuote, null, false)
    }
    
    // 'initialValue' attribute on Variable at PromoteQuoteOnly.pcf: line 20, column 60
    function initialValue_0 () : List<ServiceRequestInstructionService> {
      return new java.util.ArrayList<ServiceRequestInstructionService>()
    }
    
    // 'initialValue' attribute on Variable at PromoteQuoteOnly.pcf: line 24, column 30
    function initialValue_1 () : ServiceRequest {
      return originalServiceRequest.createPromotionFromQuoteOnlyServiceRequest(removedServiceTypes)
    }
    
    // EditButtons at PromoteQuoteOnly.pcf: line 32, column 45
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'label' attribute on AlertBar (id=RemovedServiceTypes) at PromoteQuoteOnly.pcf: line 37, column 52
    function label_4 () : java.lang.Object {
      return DisplayKey.get("Web.ServiceRequest.QuoteAndService.RemovedServiceTypesAlert", ServiceRequestKind.TC_QUOTEANDSERVICE.DisplayName, ServiceRequestInstruction.sortInstructionServices(removedServiceTypes)*.ServiceString.map(\ s -> "'" + s + "'").join(", "))
    }
    
    // 'parent' attribute on Page (id=PromoteQuoteOnly) at PromoteQuoteOnly.pcf: line 14, column 101
    static function parent_20 (originalServiceRequest :  ServiceRequest) : pcf.api.Destination {
      return pcf.ClaimServiceRequests.createDestination(originalServiceRequest.Claim, originalServiceRequest)
    }
    
    // 'visible' attribute on ListViewInput (id=QuoteDocumentsLV) at PromoteQuoteOnly.pcf: line 68, column 65
    function visible_13 () : java.lang.Boolean {
      return newServiceRequest.LatestQuote != null
    }
    
    // 'visible' attribute on AlertBar (id=RemovedServiceTypes) at PromoteQuoteOnly.pcf: line 37, column 52
    function visible_3 () : java.lang.Boolean {
      return removedServiceTypes.HasElements
    }
    
    override property get CurrentLocation () : pcf.PromoteQuoteOnly {
      return super.CurrentLocation as pcf.PromoteQuoteOnly
    }
    
    property get newServiceRequest () : ServiceRequest {
      return getVariableValue("newServiceRequest", 0) as ServiceRequest
    }
    
    property set newServiceRequest ($arg :  ServiceRequest) {
      setVariableValue("newServiceRequest", 0, $arg)
    }
    
    property get originalServiceRequest () : ServiceRequest {
      return getVariableValue("originalServiceRequest", 0) as ServiceRequest
    }
    
    property set originalServiceRequest ($arg :  ServiceRequest) {
      setVariableValue("originalServiceRequest", 0, $arg)
    }
    
    property get removedServiceTypes () : List<ServiceRequestInstructionService> {
      return getVariableValue("removedServiceTypes", 0) as List<ServiceRequestInstructionService>
    }
    
    property set removedServiceTypes ($arg :  List<ServiceRequestInstructionService>) {
      setVariableValue("removedServiceTypes", 0, $arg)
    }
    
    
  }
  
  
}