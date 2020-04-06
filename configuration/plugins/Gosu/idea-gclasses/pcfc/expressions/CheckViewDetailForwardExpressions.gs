package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckViewDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckViewDetailForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckViewDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckViewDetailForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, CheckView :  CheckView) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at CheckViewDetailForward.pcf: line 21, column 62
    function action_1 () : void {
      ClaimFinancialsChecksDetail.go(Claim, Check)
    }
    
    // 'action' attribute on ForwardCondition at CheckViewDetailForward.pcf: line 21, column 62
    function action_dest_2 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, Check)
    }
    
    // 'initialValue' attribute on Variable at CheckViewDetailForward.pcf: line 19, column 21
    function initialValue_0 () : Check {
      return CheckView.Check
    }
    
    // 'parent' attribute on Forward (id=CheckViewDetailForward) at CheckViewDetailForward.pcf: line 7, column 43
    static function parent_3 (CheckView :  CheckView, Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimFinancialsChecks.createDestination(Claim)
    }
    
    property get Check () : Check {
      return getVariableValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setVariableValue("Check", 0, $arg)
    }
    
    property get CheckView () : CheckView {
      return getVariableValue("CheckView", 0) as CheckView
    }
    
    property set CheckView ($arg :  CheckView) {
      setVariableValue("CheckView", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.CheckViewDetailForward {
      return super.CurrentLocation as pcf.CheckViewDetailForward
    }
    
    
  }
  
  
}