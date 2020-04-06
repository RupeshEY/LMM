package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimLossDetailsForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimLossDetailsForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimLossDetailsForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossDetailsForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (Claim :  Claim, fromCompensationActivity :  boolean) : int {
      return 1
    }
    
    // 'action' attribute on ForwardCondition at ClaimLossDetailsForward.pcf: line 25, column 45
    function action_0 () : void {
      ClaimLossDetails.go(Claim, fromCompensationActivity)
    }
    
    // 'action' attribute on ForwardCondition at ClaimLossDetailsForward.pcf: line 27, column 44
    function action_3 () : void {
      ClaimLossDetails.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimLossDetailsForward.pcf: line 29, column 38
    function action_5 () : void {
      CannotViewClaim.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimLossDetailsForward.pcf: line 25, column 45
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(Claim, fromCompensationActivity)
    }
    
    // 'action' attribute on ForwardCondition at ClaimLossDetailsForward.pcf: line 27, column 44
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimLossDetailsForward.pcf: line 29, column 38
    function action_dest_6 () : pcf.api.Destination {
      return pcf.CannotViewClaim.createDestination()
    }
    
    // 'condition' attribute on ForwardCondition at ClaimLossDetailsForward.pcf: line 25, column 45
    function condition_2 () : java.lang.Boolean {
      return fromCompensationActivity
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimLossDetailsForward {
      return super.CurrentLocation as pcf.ClaimLossDetailsForward
    }
    
    property get fromCompensationActivity () : boolean {
      return getVariableValue("fromCompensationActivity", 0) as java.lang.Boolean
    }
    
    property set fromCompensationActivity ($arg :  boolean) {
      setVariableValue("fromCompensationActivity", 0, $arg)
    }
    
    
  }
  
  
}