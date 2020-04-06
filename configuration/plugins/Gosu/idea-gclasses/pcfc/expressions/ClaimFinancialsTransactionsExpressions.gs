package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimFinancialsTransactionsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsTransactionsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (Claim :  Claim, requestedOption :  gw.api.financials.ClaimFinancialsTransactionsOption) : int {
      return 1
    }
    
    // 'canVisit' attribute on Page (id=ClaimFinancialsTransactions) at ClaimFinancialsTransactions.pcf: line 9, column 515
    static function canVisit_18 (Claim :  Claim, requestedOption :  gw.api.financials.ClaimFinancialsTransactionsOption) : java.lang.Boolean {
      return perm.Claim.viewtransactiondetails(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactions.pcf: line 39, column 40
    function def_onEnter_11 (def :  pcf.TransactionsLV_recovery) : void {
      def.onEnter(Claim, TxnFilterOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactions.pcf: line 39, column 40
    function def_onEnter_13 (def :  pcf.TransactionsLV_recoveryreserve) : void {
      def.onEnter(Claim, TxnFilterOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactions.pcf: line 39, column 40
    function def_onEnter_15 (def :  pcf.TransactionsLV_reserve) : void {
      def.onEnter(Claim, TxnFilterOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactions.pcf: line 39, column 40
    function def_onEnter_7 (def :  pcf.TransactionsLV_default) : void {
      def.onEnter(Claim, TxnFilterOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactions.pcf: line 39, column 40
    function def_onEnter_9 (def :  pcf.TransactionsLV_payment) : void {
      def.onEnter(Claim, TxnFilterOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactions.pcf: line 39, column 40
    function def_refreshVariables_10 (def :  pcf.TransactionsLV_payment) : void {
      def.refreshVariables(Claim, TxnFilterOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactions.pcf: line 39, column 40
    function def_refreshVariables_12 (def :  pcf.TransactionsLV_recovery) : void {
      def.refreshVariables(Claim, TxnFilterOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactions.pcf: line 39, column 40
    function def_refreshVariables_14 (def :  pcf.TransactionsLV_recoveryreserve) : void {
      def.refreshVariables(Claim, TxnFilterOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactions.pcf: line 39, column 40
    function def_refreshVariables_16 (def :  pcf.TransactionsLV_reserve) : void {
      def.refreshVariables(Claim, TxnFilterOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactions.pcf: line 39, column 40
    function def_refreshVariables_8 (def :  pcf.TransactionsLV_default) : void {
      def.refreshVariables(Claim, TxnFilterOption)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=TransactionsLVRangeInput) at ClaimFinancialsTransactions.pcf: line 33, column 75
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      TxnFilterOption = (__VALUE_TO_SET as gw.api.financials.ClaimFinancialsTransactionsOption)
    }
    
    // 'initialValue' attribute on Variable at ClaimFinancialsTransactions.pcf: line 23, column 67
    function initialValue_0 () : gw.api.financials.ClaimFinancialsTransactionsOption {
      return gw.api.financials.ClaimFinancialsTransactionsUtil.getFilterOption(Claim, requestedOption)
    }
    
    // 'mode' attribute on PanelRef at ClaimFinancialsTransactions.pcf: line 39, column 40
    function mode_17 () : java.lang.Object {
      return TxnFilterOption.UiMode
    }
    
    // Page (id=ClaimFinancialsTransactions) at ClaimFinancialsTransactions.pcf: line 9, column 515
    static function parent_19 (Claim :  Claim, requestedOption :  gw.api.financials.ClaimFinancialsTransactionsOption) : pcf.api.Destination {
      return pcf.ClaimFinancialsGroup.createDestination(Claim)
    }
    
    // 'title' attribute on Page (id=ClaimFinancialsTransactions) at ClaimFinancialsTransactions.pcf: line 9, column 515
    static function title_20 (Claim :  Claim, requestedOption :  gw.api.financials.ClaimFinancialsTransactionsOption) : java.lang.Object {
      return perm.Claim.viewnettotalincurred(Claim) ? DisplayKey.get("JSP.ClaimFinancials.Financials.Incurred", gw.api.util.CurrencyUtil.renderAsCurrency(gw.api.util.Math.Nz(gw.api.financials.FinancialsCalculations.getTotalIncurredNet().withClaim(Claim).Amount.Amount), Claim.Currency), DisplayKey.get("JSP.ClaimFinancials.Financials.Transactions")) : DisplayKey.get("JSP.ClaimFinancials.Financials.NoIncurred", DisplayKey.get("JSP.ClaimFinancials.Financials.Transactions"))
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=TransactionsLVRangeInput) at ClaimFinancialsTransactions.pcf: line 33, column 75
    function valueRange_4 () : java.lang.Object {
      return getFilterOptions()
    }
    
    // 'value' attribute on ToolbarRangeInput (id=TransactionsLVRangeInput) at ClaimFinancialsTransactions.pcf: line 33, column 75
    function value_1 () : gw.api.financials.ClaimFinancialsTransactionsOption {
      return TxnFilterOption
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=TransactionsLVRangeInput) at ClaimFinancialsTransactions.pcf: line 33, column 75
    function verifyValueRangeIsAllowedType_5 ($$arg :  gw.api.financials.ClaimFinancialsTransactionsOption[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=TransactionsLVRangeInput) at ClaimFinancialsTransactions.pcf: line 33, column 75
    function verifyValueRangeIsAllowedType_5 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=TransactionsLVRangeInput) at ClaimFinancialsTransactions.pcf: line 33, column 75
    function verifyValueRange_6 () : void {
      var __valueRangeArg = getFilterOptions()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_5(__valueRangeArg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimFinancialsTransactions {
      return super.CurrentLocation as pcf.ClaimFinancialsTransactions
    }
    
    property get TxnFilterOption () : gw.api.financials.ClaimFinancialsTransactionsOption {
      return getVariableValue("TxnFilterOption", 0) as gw.api.financials.ClaimFinancialsTransactionsOption
    }
    
    property set TxnFilterOption ($arg :  gw.api.financials.ClaimFinancialsTransactionsOption) {
      setVariableValue("TxnFilterOption", 0, $arg)
    }
    
    property get requestedOption () : gw.api.financials.ClaimFinancialsTransactionsOption {
      return getVariableValue("requestedOption", 0) as gw.api.financials.ClaimFinancialsTransactionsOption
    }
    
    property set requestedOption ($arg :  gw.api.financials.ClaimFinancialsTransactionsOption) {
      setVariableValue("requestedOption", 0, $arg)
    }
    
    function getFilterOptions() : gw.api.financials.ClaimFinancialsTransactionsOption[] {
            var options = new java.util.ArrayList<gw.api.financials.ClaimFinancialsTransactionsOption>()
            if(perm.Claim.genericviewtransactions) {
              options.add(gw.api.financials.ClaimFinancialsTransactionsOption.ALL)
            }
            if(perm.Claim.genericviewreserves) {
              options.add(gw.api.financials.ClaimFinancialsTransactionsOption.RESERVE)
            }
            if(perm.Claim.genericviewpayments) {
              options.add(gw.api.financials.ClaimFinancialsTransactionsOption.PAYMENT)
            }
            if(perm.Claim.genericviewrecoveries) {
              options.add(gw.api.financials.ClaimFinancialsTransactionsOption.RECOVERY)
            }
            if(perm.Claim.genericviewrecoveryreserves and gw.api.system.CCConfigParameters.UseRecoveryReserves.Value) {
              options.add(gw.api.financials.ClaimFinancialsTransactionsOption.RECOVERY_RESERVE)
            }
            options.add(gw.api.financials.ClaimFinancialsTransactionsOption.CUSTOM)
            return options?.toTypedArray()
          }
    
    
  }
  
  
}