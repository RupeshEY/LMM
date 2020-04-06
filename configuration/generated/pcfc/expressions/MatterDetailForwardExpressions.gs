package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/MatterDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MatterDetailForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/MatterDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MatterDetailForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Matter :  Matter) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at MatterDetailForward.pcf: line 18, column 52
    function action_0 () : void {
      MatterDetailPage.go(Claim, Matter)
    }
    
    // 'action' attribute on ForwardCondition at MatterDetailForward.pcf: line 18, column 52
    function action_dest_1 () : pcf.api.Destination {
      return pcf.MatterDetailPage.createDestination(Claim, Matter)
    }
    
    // 'canVisit' attribute on Forward (id=MatterDetailForward) at MatterDetailForward.pcf: line 8, column 27
    static function canVisit_2 (Claim :  Claim, Matter :  Matter) : java.lang.Boolean {
      return perm.Matter.view(Matter)
    }
    
    // 'parent' attribute on Forward (id=MatterDetailForward) at MatterDetailForward.pcf: line 8, column 27
    static function parent_3 (Claim :  Claim, Matter :  Matter) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.MatterDetailForward {
      return super.CurrentLocation as pcf.MatterDetailForward
    }
    
    property get Matter () : Matter {
      return getVariableValue("Matter", 0) as Matter
    }
    
    property set Matter ($arg :  Matter) {
      setVariableValue("Matter", 0, $arg)
    }
    
    
  }
  
  
}