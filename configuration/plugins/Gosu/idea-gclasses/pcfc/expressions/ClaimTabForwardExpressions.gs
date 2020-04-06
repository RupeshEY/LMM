package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/ClaimTabForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimTabForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/ClaimTabForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimTabForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimTabForward.pcf: line 15, column 34
    function action_1 () : void {
      pcf.Claim.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimTabForward.pcf: line 17, column 30
    function action_4 () : void {
      NoClaim.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimTabForward.pcf: line 15, column 34
    function action_dest_2 () : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimTabForward.pcf: line 17, column 30
    function action_dest_5 () : pcf.api.Destination {
      return pcf.NoClaim.createDestination()
    }
    
    // 'condition' attribute on ForwardCondition at ClaimTabForward.pcf: line 15, column 34
    function condition_3 () : java.lang.Boolean {
      return Claim != null
    }
    
    // 'initialValue' attribute on Variable at ClaimTabForward.pcf: line 12, column 21
    function initialValue_0 () : Claim {
      return gw.api.claim.ClaimUtil.getMostRecentlyVisitedClaim()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimTabForward {
      return super.CurrentLocation as pcf.ClaimTabForward
    }
    
    
  }
  
  
}