package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/summary/FinancialsSummaryPanelSet.Claimant.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FinancialsSummaryPanelSet_ClaimantExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/summary/FinancialsSummaryPanelSet.Claimant.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at FinancialsSummaryPanelSet.Claimant.pcf: line 19, column 66
    function def_onEnter_0 (def :  pcf.FinancialsSummaryLV) : void {
      def.onEnter(Claim, financialsSummaryBridge)
    }
    
    // 'def' attribute on PanelRef at FinancialsSummaryPanelSet.Claimant.pcf: line 19, column 66
    function def_refreshVariables_1 (def :  pcf.FinancialsSummaryLV) : void {
      def.refreshVariables(Claim, financialsSummaryBridge)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get financialsSummaryBridge () : gw.api.financials.summary.FinancialSummaryBridge {
      return getRequireValue("financialsSummaryBridge", 0) as gw.api.financials.summary.FinancialSummaryBridge
    }
    
    property set financialsSummaryBridge ($arg :  gw.api.financials.summary.FinancialSummaryBridge) {
      setRequireValue("financialsSummaryBridge", 0, $arg)
    }
    
    property get useFloatingFinancials () : boolean {
      return getRequireValue("useFloatingFinancials", 0) as java.lang.Boolean
    }
    
    property set useFloatingFinancials ($arg :  boolean) {
      setRequireValue("useFloatingFinancials", 0, $arg)
    }
    
    
  }
  
  
}