package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/ClaimFinancialsChecks.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimFinancialsChecksExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/ClaimFinancialsChecks.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsChecksExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ClaimFinancialsChecks) at ClaimFinancialsChecks.pcf: line 9, column 503
    static function canVisit_2 (Claim :  Claim) : java.lang.Boolean {
      return (Claim.State != ClaimState.TC_DRAFT) and perm.Claim.viewpayments(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsChecks.pcf: line 19, column 32
    function def_onEnter_0 (def :  pcf.ChecksLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsChecks.pcf: line 19, column 32
    function def_refreshVariables_1 (def :  pcf.ChecksLV) : void {
      def.refreshVariables(Claim)
    }
    
    // Page (id=ClaimFinancialsChecks) at ClaimFinancialsChecks.pcf: line 9, column 503
    static function parent_3 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimFinancialsGroup.createDestination(Claim)
    }
    
    // 'title' attribute on Page (id=ClaimFinancialsChecks) at ClaimFinancialsChecks.pcf: line 9, column 503
    static function title_4 (Claim :  Claim) : java.lang.Object {
      return perm.Claim.viewnettotalincurred(Claim) ? DisplayKey.get("JSP.ClaimFinancials.Financials.Incurred", gw.api.util.CurrencyUtil.renderAsCurrency(gw.api.util.Math.Nz(gw.api.financials.FinancialsCalculations.getTotalIncurredNet().withClaim(Claim).Amount.Amount), Claim.Currency), DisplayKey.get("JSP.ClaimFinancials.Financials.Checks")) : DisplayKey.get("JSP.ClaimFinancials.Financials.NoIncurred", DisplayKey.get("JSP.ClaimFinancials.Financials.Checks"))
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimFinancialsChecks {
      return super.CurrentLocation as pcf.ClaimFinancialsChecks
    }
    
    
  }
  
  
}