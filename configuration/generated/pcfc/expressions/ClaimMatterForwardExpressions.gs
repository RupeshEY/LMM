package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/ClaimMatterForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimMatterForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/ClaimMatterForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMatterForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Matter :  Matter) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimMatterForward.pcf: line 18, column 35
    function action_0 () : void {
      MatterDetailPage.go(Claim, Matter)
    }
    
    // 'action' attribute on ForwardCondition at ClaimMatterForward.pcf: line 20, column 40
    function action_3 () : void {
      ClaimMatters.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimMatterForward.pcf: line 22, column 37
    function action_5 () : void {
      pcf.Claim.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimMatterForward.pcf: line 18, column 35
    function action_dest_1 () : pcf.api.Destination {
      return pcf.MatterDetailPage.createDestination(Claim, Matter)
    }
    
    // 'action' attribute on ForwardCondition at ClaimMatterForward.pcf: line 20, column 40
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ClaimMatters.createDestination(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimMatterForward.pcf: line 22, column 37
    function action_dest_6 () : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'condition' attribute on ForwardCondition at ClaimMatterForward.pcf: line 18, column 35
    function condition_2 () : java.lang.Boolean {
      return Matter != null
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimMatterForward {
      return super.CurrentLocation as pcf.ClaimMatterForward
    }
    
    property get Matter () : Matter {
      return getVariableValue("Matter", 0) as Matter
    }
    
    property set Matter ($arg :  Matter) {
      setVariableValue("Matter", 0, $arg)
    }
    
    
  }
  
  
}