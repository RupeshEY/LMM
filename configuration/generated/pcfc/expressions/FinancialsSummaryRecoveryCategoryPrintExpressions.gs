package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/summary/print/FinancialsSummaryRecoveryCategoryPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FinancialsSummaryRecoveryCategoryPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/summary/print/FinancialsSummaryRecoveryCategoryPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryRecoveryCategoryPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, useFloatingFinancials :  boolean) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at FinancialsSummaryRecoveryCategoryPrint.pcf: line 24, column 77
    function def_onEnter_1 (def :  pcf.FinancialsSummaryRecoveriesLV) : void {
      def.onEnter(Claim, financialsSummaryBridge)
    }
    
    // 'def' attribute on PanelRef at FinancialsSummaryRecoveryCategoryPrint.pcf: line 24, column 77
    function def_refreshVariables_2 (def :  pcf.FinancialsSummaryRecoveriesLV) : void {
      def.refreshVariables(Claim, financialsSummaryBridge)
    }
    
    // 'initialValue' attribute on Variable at FinancialsSummaryRecoveryCategoryPrint.pcf: line 20, column 64
    function initialValue_0 () : gw.api.financials.summary.FinancialSummaryBridge {
      return new gw.api.financials.summary.FinancialSummaryBridge(Claim, "RecoveryCategory")
    }
    
    // 'parent' attribute on Page (id=FinancialsSummaryRecoveryCategoryPrint) at FinancialsSummaryRecoveryCategoryPrint.pcf: line 8, column 81
    static function parent_3 (Claim :  Claim, useFloatingFinancials :  boolean) : pcf.api.Destination {
      return pcf.ClaimFinancialsGroup.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.FinancialsSummaryRecoveryCategoryPrint {
      return super.CurrentLocation as pcf.FinancialsSummaryRecoveryCategoryPrint
    }
    
    property get financialsSummaryBridge () : gw.api.financials.summary.FinancialSummaryBridge {
      return getVariableValue("financialsSummaryBridge", 0) as gw.api.financials.summary.FinancialSummaryBridge
    }
    
    property set financialsSummaryBridge ($arg :  gw.api.financials.summary.FinancialSummaryBridge) {
      setVariableValue("financialsSummaryBridge", 0, $arg)
    }
    
    property get useFloatingFinancials () : boolean {
      return getVariableValue("useFloatingFinancials", 0) as java.lang.Boolean
    }
    
    property set useFloatingFinancials ($arg :  boolean) {
      setVariableValue("useFloatingFinancials", 0, $arg)
    }
    
    
  }
  
  
}