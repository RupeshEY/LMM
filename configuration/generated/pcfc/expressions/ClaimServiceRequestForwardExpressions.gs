package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ClaimServiceRequestForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimServiceRequestForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ClaimServiceRequestForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimServiceRequestForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, serviceRequest :  ServiceRequest) : int {
      return 1
    }
    
    static function __constructorIndex (claim :  Claim, serviceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimServiceRequestForward.pcf: line 22, column 43
    function action_0 () : void {
      pcf.ClaimServiceRequests.go(claim, serviceRequest, initialInvoice)
    }
    
    // 'action' attribute on ForwardCondition at ClaimServiceRequestForward.pcf: line 25, column 43
    function action_3 () : void {
      pcf.ClaimServiceRequests.go(claim, serviceRequest)
    }
    
    // 'action' attribute on ForwardCondition at ClaimServiceRequestForward.pcf: line 22, column 43
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimServiceRequests.createDestination(claim, serviceRequest, initialInvoice)
    }
    
    // 'action' attribute on ForwardCondition at ClaimServiceRequestForward.pcf: line 25, column 43
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ClaimServiceRequests.createDestination(claim, serviceRequest)
    }
    
    // 'condition' attribute on ForwardCondition at ClaimServiceRequestForward.pcf: line 22, column 43
    function condition_2 () : java.lang.Boolean {
      return initialInvoice != null
    }
    
    // 'condition' attribute on ForwardCondition at ClaimServiceRequestForward.pcf: line 25, column 43
    function condition_5 () : java.lang.Boolean {
      return initialInvoice == null
    }
    
    override property get CurrentLocation () : pcf.ClaimServiceRequestForward {
      return super.CurrentLocation as pcf.ClaimServiceRequestForward
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get initialInvoice () : ServiceRequestInvoice {
      return getVariableValue("initialInvoice", 0) as ServiceRequestInvoice
    }
    
    property set initialInvoice ($arg :  ServiceRequestInvoice) {
      setVariableValue("initialInvoice", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    
  }
  
  
}