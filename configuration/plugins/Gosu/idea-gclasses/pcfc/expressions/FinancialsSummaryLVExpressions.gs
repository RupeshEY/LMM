package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.financials.summary.FSRow
@javax.annotation.Generated("config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FinancialsSummaryLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // RowTree (id=FinancialsSummaryRowTree) at FinancialsSummaryLV.pcf: line 27, column 20
    function containerLabel_61 (FSRow :  java.lang.Object) : java.lang.String {
      return ""
    }
    
    // 'initialValue' attribute on Variable at FinancialsSummaryLV.pcf: line 17, column 59
    function initialValue_0 () : List<gw.api.financials.summary.FSRow> {
      return financialsSummaryBridge.SummaryRows
    }
    
    // 'initialValue' attribute on Variable at FinancialsSummaryLV.pcf: line 22, column 43
    function initialValue_1 () : gw.api.tree.RowTreeRootNode {
      return getRowTreeRoots()
    }
    
    // 'value' attribute on RowTree (id=FinancialsSummaryRowTree) at FinancialsSummaryLV.pcf: line 27, column 20
    function value_60 () : java.lang.Object {
      return root
    }
    
    // 'visible' attribute on RowTree (id=FinancialsSummaryRowTree) at FinancialsSummaryLV.pcf: line 72, column 29
    function visible_2 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.UseRecoveryReserves.Value and perm.Claim.viewrecoveryreserves(Claim) and perm.Claim.viewrecoveries(Claim)
    }
    
    // 'visible' attribute on RowTree (id=FinancialsSummaryRowTree) at FinancialsSummaryLV.pcf: line 83, column 29
    function visible_3 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Claim) and perm.Claim.viewpayments(Claim)
    }
    
    // 'visible' attribute on RowTree (id=FinancialsSummaryRowTree) at FinancialsSummaryLV.pcf: line 94, column 29
    function visible_4 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // 'visible' attribute on RowTree (id=FinancialsSummaryRowTree) at FinancialsSummaryLV.pcf: line 116, column 29
    function visible_6 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Claim)
    }
    
    // 'visible' attribute on RowTree (id=FinancialsSummaryRowTree) at FinancialsSummaryLV.pcf: line 127, column 29
    function visible_7 () : java.lang.Boolean {
      return perm.Claim.viewnettotalincurred(Claim)
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
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RowTreeEntryExpressionsImpl extends FinancialsSummaryLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=QuickMenu_EditReserve) at FinancialsSummaryLV.pcf: line 48, column 35
    function action_13 () : void {
      NewReserveSet.go(FSRow.Claim, FSRow.Exposure.orNull(),FSRow.CostType, FSRow.CostCategory, FSRow.ReservingCurrency)
    }
    
    // 'action' attribute on MenuItem (id=QuickMenu_QuickCheck) at FinancialsSummaryLV.pcf: line 54, column 35
    function action_17 () : void {
      QuickCreateCheckWizardForward.go( FSRow.Claim, FSRow.Exposure.orNull(), FSRow.CostType, FSRow.CostCategory, FSRow.ReservingCurrency, true)
    }
    
    // 'action' attribute on MenuItem (id=QuickMenu_CreateCheck) at FinancialsSummaryLV.pcf: line 60, column 35
    function action_21 () : void {
      NormalCreateCheckWizardForward.go( FSRow.Claim, FSRow.Exposure.orNull(), FSRow.CostType, FSRow.CostCategory, FSRow.ReservingCurrency, true)
    }
    
    // 'action' attribute on TextCell (id=OpenRecoveryReserves) at FinancialsSummaryLV.pcf: line 72, column 29
    function action_27 () : void {
      gw.api.financials.FinancialsUtil.updateCustomTransactionIdsForClaim(Claim, gw.api.financials.FinancialsCalculationUtil.OpenRecoveryReservesExpression, FSRow.TAccountOwnerDelegates); ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'action' attribute on TextCell (id=RemainingReserves) at FinancialsSummaryLV.pcf: line 83, column 29
    function action_33 () : void {
      gw.api.financials.FinancialsUtil.updateCustomTransactionIdsForClaim(Claim, gw.api.financials.FinancialsCalculationUtil.RemainingReservesExpression, FSRow.TAccountOwnerDelegates); ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'action' attribute on TextCell (id=FuturePayments) at FinancialsSummaryLV.pcf: line 94, column 29
    function action_39 () : void {
      gw.api.financials.FinancialsUtil.updateCustomTransactionIdsForClaim(Claim, gw.api.financials.FinancialsCalculationUtil.FuturePaymentsExpression, FSRow.TAccountOwnerDelegates); ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'action' attribute on TextCell (id=TotalPayments) at FinancialsSummaryLV.pcf: line 105, column 29
    function action_45 () : void {
      gw.api.financials.FinancialsUtil.updateCustomTransactionIdsForClaim(Claim, gw.api.financials.FinancialsCalculationUtil.TotalPaymentsExpression, FSRow.TAccountOwnerDelegates); ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'action' attribute on TextCell (id=TotalRecoveries) at FinancialsSummaryLV.pcf: line 116, column 29
    function action_51 () : void {
      gw.api.financials.FinancialsUtil.updateCustomTransactionIdsForClaim(Claim, gw.api.financials.FinancialsCalculationUtil.TotalRecoveriesExpression, FSRow.TAccountOwnerDelegates); ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'action' attribute on TextCell (id=TotalIncurredNet) at FinancialsSummaryLV.pcf: line 127, column 29
    function action_57 () : void {
      gw.api.financials.FinancialsUtil.updateCustomTransactionIdsForClaim(Claim, gw.api.financials.FinancialsCalculationUtil.TotalIncurredNetRecoveriesExpression, FSRow.TAccountOwnerDelegates); ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'action' attribute on MenuItem (id=QuickMenu_EditReserve) at FinancialsSummaryLV.pcf: line 48, column 35
    function action_dest_14 () : pcf.api.Destination {
      return pcf.NewReserveSet.createDestination(FSRow.Claim, FSRow.Exposure.orNull(),FSRow.CostType, FSRow.CostCategory, FSRow.ReservingCurrency)
    }
    
    // 'action' attribute on MenuItem (id=QuickMenu_QuickCheck) at FinancialsSummaryLV.pcf: line 54, column 35
    function action_dest_18 () : pcf.api.Destination {
      return pcf.QuickCreateCheckWizardForward.createDestination( FSRow.Claim, FSRow.Exposure.orNull(), FSRow.CostType, FSRow.CostCategory, FSRow.ReservingCurrency, true)
    }
    
    // 'action' attribute on MenuItem (id=QuickMenu_CreateCheck) at FinancialsSummaryLV.pcf: line 60, column 35
    function action_dest_22 () : pcf.api.Destination {
      return pcf.NormalCreateCheckWizardForward.createDestination( FSRow.Claim, FSRow.Exposure.orNull(), FSRow.CostType, FSRow.CostCategory, FSRow.ReservingCurrency, true)
    }
    
    // 'available' attribute on MenuItem (id=QuickMenu_EditReserve) at FinancialsSummaryLV.pcf: line 48, column 35
    function available_11 () : java.lang.Boolean {
      return FSRow.canCreateReserve()
    }
    
    // 'available' attribute on MenuItem (id=QuickMenu_QuickCheck) at FinancialsSummaryLV.pcf: line 54, column 35
    function available_15 () : java.lang.Boolean {
      return FSRow.canCreatePayment(financialsSummaryBridge)
    }
    
    // 'available' attribute on TextCell (id=OpenRecoveryReserves) at FinancialsSummaryLV.pcf: line 72, column 29
    function available_23 () : java.lang.Boolean {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.OPEN_RECOVERY_RESERVES) != null
    }
    
    // 'available' attribute on TextCell (id=RemainingReserves) at FinancialsSummaryLV.pcf: line 83, column 29
    function available_29 () : java.lang.Boolean {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.REMAINING_RESERVES) != null
    }
    
    // 'available' attribute on TextCell (id=FuturePayments) at FinancialsSummaryLV.pcf: line 94, column 29
    function available_35 () : java.lang.Boolean {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.FUTURE_PAYMENTS) != null
    }
    
    // 'available' attribute on TextCell (id=TotalPayments) at FinancialsSummaryLV.pcf: line 105, column 29
    function available_41 () : java.lang.Boolean {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.TOTAL_PAYMENTS) != null
    }
    
    // 'available' attribute on TextCell (id=TotalRecoveries) at FinancialsSummaryLV.pcf: line 116, column 29
    function available_47 () : java.lang.Boolean {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.TOTAL_RECOVERIES) != null
    }
    
    // 'available' attribute on TextCell (id=TotalIncurredNet) at FinancialsSummaryLV.pcf: line 127, column 29
    function available_53 () : java.lang.Boolean {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.TOTAL_INCURRED_NET_RECOVERIES) != null
    }
    
    // 'useSubHeaderStyle' attribute on Row (id=FSRow) at FinancialsSummaryLV.pcf: line 30, column 41
    function useSubHeaderStyle_59 () : java.lang.Boolean {
      return !FSRow.Leaf
    }
    
    // 'value' attribute on TextCell (id=FinancialsSummaryLabel) at FinancialsSummaryLV.pcf: line 34, column 32
    function valueRoot_10 () : java.lang.Object {
      return FSRow
    }
    
    // 'value' attribute on TextCell (id=OpenRecoveryReserves) at FinancialsSummaryLV.pcf: line 72, column 29
    function value_25 () : gw.api.financials.CurrencyAmount {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.OPEN_RECOVERY_RESERVES)
    }
    
    // 'value' attribute on TextCell (id=RemainingReserves) at FinancialsSummaryLV.pcf: line 83, column 29
    function value_31 () : gw.api.financials.CurrencyAmount {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.REMAINING_RESERVES)
    }
    
    // 'value' attribute on TextCell (id=FuturePayments) at FinancialsSummaryLV.pcf: line 94, column 29
    function value_37 () : gw.api.financials.CurrencyAmount {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.FUTURE_PAYMENTS)
    }
    
    // 'value' attribute on TextCell (id=TotalPayments) at FinancialsSummaryLV.pcf: line 105, column 29
    function value_43 () : gw.api.financials.CurrencyAmount {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.TOTAL_PAYMENTS)
    }
    
    // 'value' attribute on TextCell (id=TotalRecoveries) at FinancialsSummaryLV.pcf: line 116, column 29
    function value_49 () : gw.api.financials.CurrencyAmount {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.TOTAL_RECOVERIES)
    }
    
    // 'value' attribute on TextCell (id=TotalIncurredNet) at FinancialsSummaryLV.pcf: line 127, column 29
    function value_55 () : gw.api.financials.CurrencyAmount {
      return FSRow.getValue(gw.api.financials.summary.FinancialsSummaryColumnConstants.TOTAL_INCURRED_NET_RECOVERIES)
    }
    
    // 'value' attribute on TextCell (id=FinancialsSummaryLabel) at FinancialsSummaryLV.pcf: line 34, column 32
    function value_8 () : java.lang.String {
      return FSRow.Label
    }
    
    // 'visible' attribute on MenuItem (id=QuickMenu_EditReserve) at FinancialsSummaryLV.pcf: line 48, column 35
    function visible_12 () : java.lang.Boolean {
      return FSRow.Leaf
    }
    
    // 'visible' attribute on TextCell (id=OpenRecoveryReserves) at FinancialsSummaryLV.pcf: line 72, column 29
    function visible_24 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.UseRecoveryReserves.Value and perm.Claim.viewrecoveryreserves(Claim) and perm.Claim.viewrecoveries(Claim)
    }
    
    // 'visible' attribute on TextCell (id=RemainingReserves) at FinancialsSummaryLV.pcf: line 83, column 29
    function visible_30 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Claim) and perm.Claim.viewpayments(Claim)
    }
    
    // 'visible' attribute on TextCell (id=FuturePayments) at FinancialsSummaryLV.pcf: line 94, column 29
    function visible_36 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // 'visible' attribute on TextCell (id=TotalRecoveries) at FinancialsSummaryLV.pcf: line 116, column 29
    function visible_48 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Claim)
    }
    
    // 'visible' attribute on TextCell (id=TotalIncurredNet) at FinancialsSummaryLV.pcf: line 127, column 29
    function visible_54 () : java.lang.Boolean {
      return perm.Claim.viewnettotalincurred(Claim)
    }
    
    property get FSRow () : gw.api.financials.summary.FSRow {
      return getIteratedValue(1) as gw.api.financials.summary.FSRow
    }
    
    
  }
  
  
}