package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/workplan/ClaimWorkplanForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimWorkplanForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/workplan/ClaimWorkplanForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimWorkplanForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimWorkplanForward.pcf: line 14, column 41
    function action_0 () : void {
      ClaimWorkplan.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimWorkplanForward.pcf: line 16, column 37
    function action_2 () : void {
      pcf.Claim.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimWorkplanForward.pcf: line 14, column 41
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimWorkplan.createDestination(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimWorkplanForward.pcf: line 16, column 37
    function action_dest_3 () : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimWorkplanForward {
      return super.CurrentLocation as pcf.ClaimWorkplanForward
    }
    
    
  }
  
  
}