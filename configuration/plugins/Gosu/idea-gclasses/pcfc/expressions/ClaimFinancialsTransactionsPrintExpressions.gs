package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimFinancialsTransactionsPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsTransactionsPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, requestedOption :  gw.api.financials.ClaimFinancialsTransactionsOption) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ClaimFinancialsTransactionsPrint) at ClaimFinancialsTransactionsPrint.pcf: line 10, column 110
    static function canVisit_12 (Claim :  Claim, requestedOption :  gw.api.financials.ClaimFinancialsTransactionsOption) : java.lang.Boolean {
      return perm.Claim.viewtransactiondetails(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsPrint.pcf: line 25, column 40
    function def_onEnter_1 (def :  pcf.TransactionsLV_default) : void {
      def.onEnter(Claim, requestedOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsPrint.pcf: line 25, column 40
    function def_onEnter_3 (def :  pcf.TransactionsLV_payment) : void {
      def.onEnter(Claim, requestedOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsPrint.pcf: line 25, column 40
    function def_onEnter_5 (def :  pcf.TransactionsLV_recovery) : void {
      def.onEnter(Claim, requestedOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsPrint.pcf: line 25, column 40
    function def_onEnter_7 (def :  pcf.TransactionsLV_recoveryreserve) : void {
      def.onEnter(Claim, requestedOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsPrint.pcf: line 25, column 40
    function def_onEnter_9 (def :  pcf.TransactionsLV_reserve) : void {
      def.onEnter(Claim, requestedOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsPrint.pcf: line 25, column 40
    function def_refreshVariables_10 (def :  pcf.TransactionsLV_reserve) : void {
      def.refreshVariables(Claim, requestedOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsPrint.pcf: line 25, column 40
    function def_refreshVariables_2 (def :  pcf.TransactionsLV_default) : void {
      def.refreshVariables(Claim, requestedOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsPrint.pcf: line 25, column 40
    function def_refreshVariables_4 (def :  pcf.TransactionsLV_payment) : void {
      def.refreshVariables(Claim, requestedOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsPrint.pcf: line 25, column 40
    function def_refreshVariables_6 (def :  pcf.TransactionsLV_recovery) : void {
      def.refreshVariables(Claim, requestedOption)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsPrint.pcf: line 25, column 40
    function def_refreshVariables_8 (def :  pcf.TransactionsLV_recoveryreserve) : void {
      def.refreshVariables(Claim, requestedOption)
    }
    
    // 'initialValue' attribute on Variable at ClaimFinancialsTransactionsPrint.pcf: line 19, column 67
    function initialValue_0 () : gw.api.financials.ClaimFinancialsTransactionsOption {
      return gw.api.financials.ClaimFinancialsTransactionsOption.ALL
    }
    
    // 'mode' attribute on PanelRef at ClaimFinancialsTransactionsPrint.pcf: line 25, column 40
    function mode_11 () : java.lang.Object {
      return requestedOption.UiMode
    }
    
    // 'parent' attribute on Page (id=ClaimFinancialsTransactionsPrint) at ClaimFinancialsTransactionsPrint.pcf: line 10, column 110
    static function parent_13 (Claim :  Claim, requestedOption :  gw.api.financials.ClaimFinancialsTransactionsOption) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(Claim)
    }
    
    // 'title' attribute on Page (id=ClaimFinancialsTransactionsPrint) at ClaimFinancialsTransactionsPrint.pcf: line 10, column 110
    static function title_14 (Claim :  Claim, requestedOption :  gw.api.financials.ClaimFinancialsTransactionsOption) : java.lang.Object {
      return gw.api.print.ClaimPrintoutHelper.getTitleForFinancialTransactions(Claim, requestedOption.UiMode)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimFinancialsTransactionsPrint {
      return super.CurrentLocation as pcf.ClaimFinancialsTransactionsPrint
    }
    
    property get requestedOption () : gw.api.financials.ClaimFinancialsTransactionsOption {
      return getVariableValue("requestedOption", 0) as gw.api.financials.ClaimFinancialsTransactionsOption
    }
    
    property set requestedOption ($arg :  gw.api.financials.ClaimFinancialsTransactionsOption) {
      setVariableValue("requestedOption", 0, $arg)
    }
    
    
  }
  
  
}