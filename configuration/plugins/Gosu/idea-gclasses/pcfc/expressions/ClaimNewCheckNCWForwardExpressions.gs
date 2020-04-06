package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/quickjump/contextualforward/ClaimNewCheckNCWForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewCheckNCWForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/quickjump/contextualforward/ClaimNewCheckNCWForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewCheckNCWForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimNewCheckNCWForward.pcf: line 14, column 62
    function action_0 () : void {
      pcf.NormalCreateCheckWizardForward.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimNewCheckNCWForward.pcf: line 14, column 62
    function action_dest_1 () : pcf.api.Destination {
      return pcf.NormalCreateCheckWizardForward.createDestination(Claim)
    }
    
    // 'canVisit' attribute on Forward (id=ClaimNewCheckNCWForward) at ClaimNewCheckNCWForward.pcf: line 7, column 34
    static function canVisit_2 (Claim :  Claim) : java.lang.Boolean {
      return !(Claim.State == ClaimState.TC_DRAFT) && perm.Claim.createpayment(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimNewCheckNCWForward {
      return super.CurrentLocation as pcf.ClaimNewCheckNCWForward
    }
    
    
  }
  
  
}