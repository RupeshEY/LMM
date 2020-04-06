package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimFinancialsGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ClaimFinancialsGroup) at ClaimFinancialsGroup.pcf: line 17, column 21
    function action_0 () : void {
      pcf.ClaimFinancialsSummary.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimFinancialsGroup) at ClaimFinancialsGroup.pcf: line 21, column 21
    function action_2 () : void {
      pcf.ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimFinancialsGroup) at ClaimFinancialsGroup.pcf: line 25, column 21
    function action_4 () : void {
      pcf.ClaimFinancialsChecks.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimFinancialsGroup) at ClaimFinancialsGroup.pcf: line 17, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimFinancialsSummary.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimFinancialsGroup) at ClaimFinancialsGroup.pcf: line 21, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactions.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimFinancialsGroup) at ClaimFinancialsGroup.pcf: line 25, column 21
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecks.createDestination(Claim)
    }
    
    // 'canVisit' attribute on LocationGroup (id=ClaimFinancialsGroup) at ClaimFinancialsGroup.pcf: line 8, column 80
    static function canVisit_6 (Claim :  Claim) : java.lang.Boolean {
      return (Claim.State != ClaimState.TC_DRAFT) and (perm.Claim.view(Claim) and ((perm.System.viewfinsum or perm.Claim.viewtransactiondetails(Claim)) or perm.Claim.viewpayments(Claim)))
    }
    
    // LocationGroup (id=ClaimFinancialsGroup) at ClaimFinancialsGroup.pcf: line 8, column 80
    static function firstVisitableChildDestinationMethod_10 (Claim :  Claim) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ClaimFinancialsSummary.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimFinancialsTransactions.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimFinancialsChecks.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=ClaimFinancialsGroup) at ClaimFinancialsGroup.pcf: line 8, column 80
    static function parent_7 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimFinancialsGroup) at ClaimFinancialsGroup.pcf: line 8, column 80
    function tabBar_onEnter_8 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimFinancialsGroup) at ClaimFinancialsGroup.pcf: line 8, column 80
    function tabBar_refreshVariables_9 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimFinancialsGroup {
      return super.CurrentLocation as pcf.ClaimFinancialsGroup
    }
    
    
  }
  
  
}