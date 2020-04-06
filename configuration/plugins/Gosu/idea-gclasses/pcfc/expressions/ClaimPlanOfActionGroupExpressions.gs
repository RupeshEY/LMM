package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPlanOfActionGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPlanOfActionGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPlanOfActionGroup) at ClaimPlanOfActionGroup.pcf: line 17, column 21
    function action_0 () : void {
      pcf.ClaimEvaluations.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPlanOfActionGroup) at ClaimPlanOfActionGroup.pcf: line 21, column 21
    function action_2 () : void {
      pcf.ClaimNegotiations.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPlanOfActionGroup) at ClaimPlanOfActionGroup.pcf: line 17, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimEvaluations.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPlanOfActionGroup) at ClaimPlanOfActionGroup.pcf: line 21, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimNegotiations.createDestination(Claim)
    }
    
    // 'canVisit' attribute on LocationGroup (id=ClaimPlanOfActionGroup) at ClaimPlanOfActionGroup.pcf: line 8, column 80
    static function canVisit_4 (Claim :  Claim) : java.lang.Boolean {
      return (Claim.State != ClaimState.TC_DRAFT) and (perm.Claim.view(Claim) and ((perm.Evaluation.view(Claim) and perm.System.viewclaimevals) or (perm.Negotiation.view(Claim) and perm.System.viewclaimngtns)))
    }
    
    // LocationGroup (id=ClaimPlanOfActionGroup) at ClaimPlanOfActionGroup.pcf: line 8, column 80
    static function firstVisitableChildDestinationMethod_8 (Claim :  Claim) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ClaimEvaluations.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimNegotiations.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=ClaimPlanOfActionGroup) at ClaimPlanOfActionGroup.pcf: line 8, column 80
    static function parent_5 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimPlanOfActionGroup) at ClaimPlanOfActionGroup.pcf: line 8, column 80
    function tabBar_onEnter_6 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimPlanOfActionGroup) at ClaimPlanOfActionGroup.pcf: line 8, column 80
    function tabBar_refreshVariables_7 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPlanOfActionGroup {
      return super.CurrentLocation as pcf.ClaimPlanOfActionGroup
    }
    
    
  }
  
  
}