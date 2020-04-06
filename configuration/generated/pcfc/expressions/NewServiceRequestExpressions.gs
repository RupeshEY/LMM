package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewServiceRequest.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewServiceRequestExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newother/NewServiceRequest.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewServiceRequestExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=SubmitButton) at NewServiceRequest.pcf: line 38, column 51
    function action_2 () : void {
      submitServiceRequest = true; CurrentLocation.commit()
    }
    
    // 'afterCancel' attribute on Page (id=NewServiceRequest) at NewServiceRequest.pcf: line 14, column 66
    function afterCancel_5 () : void {
      pcf.ClaimServiceRequests.go(claim)
    }
    
    // 'afterCancel' attribute on Page (id=NewServiceRequest) at NewServiceRequest.pcf: line 14, column 66
    function afterCancel_dest_6 () : pcf.api.Destination {
      return pcf.ClaimServiceRequests.createDestination(claim)
    }
    
    // 'afterCommit' attribute on Page (id=NewServiceRequest) at NewServiceRequest.pcf: line 14, column 66
    function afterCommit_7 (TopLocation :  pcf.api.Location) : void {
      pcf.ClaimServiceRequests.go(claim,serviceRequest)
    }
    
    // 'beforeCommit' attribute on Page (id=NewServiceRequest) at NewServiceRequest.pcf: line 14, column 66
    function beforeCommit_8 (pickedValue :  java.lang.Object) : void {
      serviceRequest.Instruction.verifyServiceTypesForUI(); serviceRequest.finishSetup(); if (submitServiceRequest){serviceRequest.performOperation(TC_SUBMITINSTRUCTION, null, false)}
    }
    
    // 'def' attribute on PanelRef (id=NewServiceRequestScreen) at NewServiceRequest.pcf: line 32, column 38
    function def_onEnter_3 (def :  pcf.NewServiceRequestDV) : void {
      def.onEnter(serviceRequest, false, {})
    }
    
    // 'def' attribute on PanelRef (id=NewServiceRequestScreen) at NewServiceRequest.pcf: line 32, column 38
    function def_refreshVariables_4 (def :  pcf.NewServiceRequestDV) : void {
      def.refreshVariables(serviceRequest, false, {})
    }
    
    // 'initialValue' attribute on Variable at NewServiceRequest.pcf: line 23, column 30
    function initialValue_0 () : ServiceRequest {
      return claim.newServiceRequest(null, null)
    }
    
    // 'parent' attribute on Page (id=NewServiceRequest) at NewServiceRequest.pcf: line 14, column 66
    static function parent_9 (claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=SubmitButton) at NewServiceRequest.pcf: line 38, column 51
    function visible_1 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    override property get CurrentLocation () : pcf.NewServiceRequest {
      return super.CurrentLocation as pcf.NewServiceRequest
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    property get submitServiceRequest () : boolean {
      return getVariableValue("submitServiceRequest", 0) as java.lang.Boolean
    }
    
    property set submitServiceRequest ($arg :  boolean) {
      setVariableValue("submitServiceRequest", 0, $arg)
    }
    
    
  }
  
  
}