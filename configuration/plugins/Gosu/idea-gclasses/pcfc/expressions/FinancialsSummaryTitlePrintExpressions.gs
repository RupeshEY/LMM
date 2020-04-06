package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/summary/print/FinancialsSummaryTitlePrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FinancialsSummaryTitlePrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/summary/print/FinancialsSummaryTitlePrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryTitlePrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'parent' attribute on Page (id=FinancialsSummaryTitlePrint) at FinancialsSummaryTitlePrint.pcf: line 8, column 489
    static function parent_0 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimFinancialsGroup.createDestination(Claim)
    }
    
    // 'title' attribute on Page (id=FinancialsSummaryTitlePrint) at FinancialsSummaryTitlePrint.pcf: line 8, column 489
    static function title_1 (Claim :  Claim) : java.lang.Object {
      return perm.Claim.viewnettotalincurred(Claim) ? DisplayKey.get("JSP.ClaimFinancials.Financials.Incurred", gw.api.util.CurrencyUtil.renderAsCurrency(gw.api.util.Math.Nz(gw.api.financials.FinancialsCalculations.getTotalIncurredNet().withClaim(Claim).Amount.Amount), Claim.Currency), DisplayKey.get("Web.Financials.Summary.Summary")) : DisplayKey.get("JSP.ClaimFinancials.Financials.NoIncurred", DisplayKey.get("Web.Financials.Summary.Summary"))
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.FinancialsSummaryTitlePrint {
      return super.CurrentLocation as pcf.FinancialsSummaryTitlePrint
    }
    
    
  }
  
  
}