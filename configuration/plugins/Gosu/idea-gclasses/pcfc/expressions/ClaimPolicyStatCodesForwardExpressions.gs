package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyStatCodesForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyStatCodesForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyStatCodesForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodesForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on Forward (id=ClaimPolicyStatCodesForward) at ClaimPolicyStatCodesForward.pcf: line 8, column 38
    function action_1 () : void {
      ClaimPolicyStatCodes.go(claim)
    }
    
    // 'action' attribute on Forward (id=ClaimPolicyStatCodesForward) at ClaimPolicyStatCodesForward.pcf: line 8, column 38
    function action_dest_2 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodes.createDestination(claim)
    }
    
    // 'parent' attribute on Forward (id=ClaimPolicyStatCodesForward) at ClaimPolicyStatCodesForward.pcf: line 8, column 38
    static function parent_0 (claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPolicyGroup.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyStatCodesForward {
      return super.CurrentLocation as pcf.ClaimPolicyStatCodesForward
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}