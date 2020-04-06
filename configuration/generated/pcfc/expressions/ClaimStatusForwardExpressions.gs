package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimStatusForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimStatusForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimStatusForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimStatusForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimStatusForward.pcf: line 13, column 39
    function action_0 () : void {
      ClaimStatus.go(claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimStatusForward.pcf: line 15, column 38
    function action_2 () : void {
      CannotViewClaim.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimStatusForward.pcf: line 13, column 39
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimStatus.createDestination(claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimStatusForward.pcf: line 15, column 38
    function action_dest_3 () : pcf.api.Destination {
      return pcf.CannotViewClaim.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ClaimStatusForward {
      return super.CurrentLocation as pcf.ClaimStatusForward
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}