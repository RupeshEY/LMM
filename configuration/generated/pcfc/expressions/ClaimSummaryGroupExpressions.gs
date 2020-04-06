package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSummaryGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSummaryGroup) at ClaimSummaryGroup.pcf: line 16, column 39
    function action_0 () : void {
      pcf.ClaimSummary.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSummaryGroup) at ClaimSummaryGroup.pcf: line 19, column 38
    function action_2 () : void {
      pcf.ClaimStatus.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSummaryGroup) at ClaimSummaryGroup.pcf: line 22, column 42
    function action_4 () : void {
      pcf.ClaimKeyMetrics.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSummaryGroup) at ClaimSummaryGroup.pcf: line 16, column 39
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimSummary.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSummaryGroup) at ClaimSummaryGroup.pcf: line 19, column 38
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimStatus.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSummaryGroup) at ClaimSummaryGroup.pcf: line 22, column 42
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ClaimKeyMetrics.createDestination(Claim)
    }
    
    // 'canVisit' attribute on LocationGroup (id=ClaimSummaryGroup) at ClaimSummaryGroup.pcf: line 8, column 77
    static function canVisit_6 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimsummary
    }
    
    // LocationGroup (id=ClaimSummaryGroup) at ClaimSummaryGroup.pcf: line 8, column 77
    static function firstVisitableChildDestinationMethod_10 (Claim :  Claim) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ClaimSummary.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimStatus.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimKeyMetrics.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=ClaimSummaryGroup) at ClaimSummaryGroup.pcf: line 8, column 77
    static function parent_7 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimSummaryGroup) at ClaimSummaryGroup.pcf: line 8, column 77
    function tabBar_onEnter_8 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimSummaryGroup) at ClaimSummaryGroup.pcf: line 8, column 77
    function tabBar_refreshVariables_9 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSummaryGroup {
      return super.CurrentLocation as pcf.ClaimSummaryGroup
    }
    
    
  }
  
  
}