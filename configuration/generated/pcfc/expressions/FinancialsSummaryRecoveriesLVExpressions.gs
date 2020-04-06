package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.financials.summary.FSRow
@javax.annotation.Generated("config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FinancialsSummaryRecoveriesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryRecoveriesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // RowTree (id=FinancialsSummaryRowTree) at FinancialsSummaryRecoveriesLV.pcf: line 28, column 20
    function containerLabel_28 (FSRow :  java.lang.Object) : java.lang.String {
      return ""
    }
    
    // 'initialValue' attribute on Variable at FinancialsSummaryRecoveriesLV.pcf: line 18, column 59
    function initialValue_0 () : List<gw.api.financials.summary.FSRow> {
      return financialsSummaryBridge.SummaryRows
    }
    
    // 'initialValue' attribute on Variable at FinancialsSummaryRecoveriesLV.pcf: line 23, column 43
    function initialValue_1 () : gw.api.tree.RowTreeRootNode {
      return getRowTreeRoots()
    }
    
    // 'value' attribute on RowTree (id=FinancialsSummaryRowTree) at FinancialsSummaryRecoveriesLV.pcf: line 28, column 20
    function value_27 () : java.lang.Object {
      return root
    }
    
    // 'visible' attribute on RowTree (id=FinancialsSummaryRowTree) at FinancialsSummaryRecoveriesLV.pcf: line 46, column 29
    function visible_2 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Claim)
    }
    
    // 'visible' attribute on RowTree (id=FinancialsSummaryRowTree) at FinancialsSummaryRecoveriesLV.pcf: line 57, column 29
    function visible_3 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.UseRecoveryReserves.Value and perm.Claim.viewrecoveryreserves(Claim) and perm.Claim.viewrecoveries(Claim)
    }
    
    // 'visible' attribute on RowTree (id=FinancialsSummaryRowTree) at FinancialsSummaryRecoveriesLV.pcf: line 68, column 29
    function visible_4 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.UseRecoveryReserves.Value and perm.Claim.viewrecoveryreserves(Claim)
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
    
    property get root () : gw.api.tree.RowTreeRootNode {
      return getVariableValue("root", 0) as gw.api.tree.RowTreeRootNode
    }
    
    property set root ($arg :  gw.api.tree.RowTreeRootNode) {
      setVariableValue("root", 0, $arg)
    }
    
    property get summaryRows () : List<gw.api.financials.summary.FSRow> {
      return getVariableValue("summaryRows", 0) as List<gw.api.financials.summary.FSRow>
    }
    
    property set summaryRows ($arg :  List<gw.api.financials.summary.FSRow>) {
      setVariableValue("summaryRows", 0, $arg)
    }
    
    
    function getRowTreeRoots() : gw.api.tree.RowTreeRootNode {
      return new gw.api.tree.RowTreeRootNode(financialsSummaryBridge.RootRows, \r ->((r as FSRow).Children), \b -> true)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RowTreeEntryExpressionsImpl extends FinancialsSummaryRecoveriesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=TotalRecoveries) at FinancialsSummaryRecoveriesLV.pcf: line 46, column 29
    function action_12 () : void {
      gw.api.financials.FinancialsUtil.updateCustomTransactionIdsForClaim(Claim, gw.api.financials.FinancialsCalculationUtil.TotalRecoveriesExpression, FSRow.TAccountOwnerDelegates); ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'action' attribute on TextCell (id=OpenRecoveryReserves) at FinancialsSummaryRecoveriesLV.pcf: line 57, column 29
    function action_18 () : void {
      gw.api.financials.FinancialsUtil.updateCustomTransactionIdsForClaim(Claim, gw.api.financials.FinancialsCalculationUtil.OpenRecoveryReservesExpression, FSRow.TAccountOwnerDelegates); ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'action' attribute on TextCell (id=TotalRecoveryReserves) at FinancialsSummaryRecoveriesLV.pcf: line 68, column 29
    function action_24 () : void {
      gw.api.financials.FinancialsUtil.updateCustomTransactionIdsForClaim(Claim, gw.api.financials.FinancialsCalculationUtil.TotalRecoveryReservesExpression, FSRow.TAccountOwnerDelegates); ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'available' attribute on TextCell (id=OpenRecoveryReserves) at FinancialsSummaryRecoveriesLV.pcf: line 57, column 29
    function available_14 () : java.lang.Boolean {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.OPEN_RECOVERY_RESERVES) != null
    }
    
    // 'available' attribute on TextCell (id=TotalRecoveryReserves) at FinancialsSummaryRecoveriesLV.pcf: line 68, column 29
    function available_20 () : java.lang.Boolean {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.TOTAL_RECOVERY_RESERVES) != null
    }
    
    // 'available' attribute on TextCell (id=TotalRecoveries) at FinancialsSummaryRecoveriesLV.pcf: line 46, column 29
    function available_8 () : java.lang.Boolean {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.TOTAL_RECOVERIES) != null
    }
    
    // 'useSubHeaderStyle' attribute on Row (id=FSRow) at FinancialsSummaryRecoveriesLV.pcf: line 31, column 41
    function useSubHeaderStyle_26 () : java.lang.Boolean {
      return !FSRow.Leaf
    }
    
    // 'value' attribute on TextCell (id=FinancialsSummaryLabel) at FinancialsSummaryRecoveriesLV.pcf: line 35, column 32
    function valueRoot_7 () : java.lang.Object {
      return FSRow
    }
    
    // 'value' attribute on TextCell (id=TotalRecoveries) at FinancialsSummaryRecoveriesLV.pcf: line 46, column 29
    function value_10 () : gw.api.financials.CurrencyAmount {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.TOTAL_RECOVERIES)
    }
    
    // 'value' attribute on TextCell (id=OpenRecoveryReserves) at FinancialsSummaryRecoveriesLV.pcf: line 57, column 29
    function value_16 () : gw.api.financials.CurrencyAmount {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.OPEN_RECOVERY_RESERVES)
    }
    
    // 'value' attribute on TextCell (id=TotalRecoveryReserves) at FinancialsSummaryRecoveriesLV.pcf: line 68, column 29
    function value_22 () : gw.api.financials.CurrencyAmount {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.TOTAL_RECOVERY_RESERVES)
    }
    
    // 'value' attribute on TextCell (id=FinancialsSummaryLabel) at FinancialsSummaryRecoveriesLV.pcf: line 35, column 32
    function value_5 () : java.lang.String {
      return FSRow.Label
    }
    
    // 'visible' attribute on TextCell (id=OpenRecoveryReserves) at FinancialsSummaryRecoveriesLV.pcf: line 57, column 29
    function visible_15 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.UseRecoveryReserves.Value and perm.Claim.viewrecoveryreserves(Claim) and perm.Claim.viewrecoveries(Claim)
    }
    
    // 'visible' attribute on TextCell (id=TotalRecoveryReserves) at FinancialsSummaryRecoveriesLV.pcf: line 68, column 29
    function visible_21 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.UseRecoveryReserves.Value and perm.Claim.viewrecoveryreserves(Claim)
    }
    
    // 'visible' attribute on TextCell (id=TotalRecoveries) at FinancialsSummaryRecoveriesLV.pcf: line 46, column 29
    function visible_9 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Claim)
    }
    
    property get FSRow () : gw.api.financials.summary.FSRow {
      return getIteratedValue(1) as gw.api.financials.summary.FSRow
    }
    
    
  }
  
  
}