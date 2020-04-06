package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimFinancialsTransactionsDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsTransactionsDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Transaction :  Transaction) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=ClaimFinancialsTransactionsDetail) at ClaimFinancialsTransactionsDetail.pcf: line 11, column 41
    function canEdit_18 () : java.lang.Boolean {
      return Transaction.Subtype==TC_RECOVERY and perm.Recovery.edit(Transaction)
    }
    
    // 'canVisit' attribute on Page (id=ClaimFinancialsTransactionsDetail) at ClaimFinancialsTransactionsDetail.pcf: line 11, column 41
    static function canVisit_19 (Claim :  Claim, Transaction :  Transaction) : java.lang.Boolean {
      return perm.Transaction.view(Transaction)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsDetail.pcf: line 32, column 37
    function def_onEnter_11 (def :  pcf.TransactionDetailPanelSet_recovery) : void {
      def.onEnter(Transaction)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsDetail.pcf: line 32, column 37
    function def_onEnter_13 (def :  pcf.TransactionDetailPanelSet_recoveryreserve) : void {
      def.onEnter(Transaction)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsDetail.pcf: line 32, column 37
    function def_onEnter_15 (def :  pcf.TransactionDetailPanelSet_reserve) : void {
      def.onEnter(Transaction)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsDetail.pcf: line 32, column 37
    function def_onEnter_9 (def :  pcf.TransactionDetailPanelSet_payment) : void {
      def.onEnter(Transaction)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsDetail.pcf: line 32, column 37
    function def_refreshVariables_10 (def :  pcf.TransactionDetailPanelSet_payment) : void {
      def.refreshVariables(Transaction)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsDetail.pcf: line 32, column 37
    function def_refreshVariables_12 (def :  pcf.TransactionDetailPanelSet_recovery) : void {
      def.refreshVariables(Transaction)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsDetail.pcf: line 32, column 37
    function def_refreshVariables_14 (def :  pcf.TransactionDetailPanelSet_recoveryreserve) : void {
      def.refreshVariables(Transaction)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsTransactionsDetail.pcf: line 32, column 37
    function def_refreshVariables_16 (def :  pcf.TransactionDetailPanelSet_reserve) : void {
      def.refreshVariables(Transaction)
    }
    
    // 'mode' attribute on ToolbarButtonSetRef at ClaimFinancialsTransactionsDetail.pcf: line 28, column 85
    function mode_0 () : java.lang.Object {
      return Transaction.Subtype
    }
    
    // 'parent' attribute on Page (id=ClaimFinancialsTransactionsDetail) at ClaimFinancialsTransactionsDetail.pcf: line 11, column 41
    static function parent_20 (Claim :  Claim, Transaction :  Transaction) : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactions.createDestination(Claim)
    }
    
    // 'title' attribute on Page (id=ClaimFinancialsTransactionsDetail) at ClaimFinancialsTransactionsDetail.pcf: line 11, column 41
    static function title_21 (Claim :  Claim, Transaction :  Transaction) : java.lang.Object {
      return Transaction.DetailPageTitle
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimFinancialsTransactionsDetail.pcf: line 28, column 85
    function toolbarButtonSet_onEnter_1 (def :  pcf.TransactionDetailToolbarButtonSet_payment) : void {
      def.onEnter(Claim, Transaction)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimFinancialsTransactionsDetail.pcf: line 28, column 85
    function toolbarButtonSet_onEnter_3 (def :  pcf.TransactionDetailToolbarButtonSet_recovery) : void {
      def.onEnter(Claim, Transaction)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimFinancialsTransactionsDetail.pcf: line 28, column 85
    function toolbarButtonSet_onEnter_5 (def :  pcf.TransactionDetailToolbarButtonSet_recoveryreserve) : void {
      def.onEnter(Claim, Transaction)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimFinancialsTransactionsDetail.pcf: line 28, column 85
    function toolbarButtonSet_onEnter_7 (def :  pcf.TransactionDetailToolbarButtonSet_reserve) : void {
      def.onEnter(Claim, Transaction)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimFinancialsTransactionsDetail.pcf: line 28, column 85
    function toolbarButtonSet_refreshVariables_2 (def :  pcf.TransactionDetailToolbarButtonSet_payment) : void {
      def.refreshVariables(Claim, Transaction)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimFinancialsTransactionsDetail.pcf: line 28, column 85
    function toolbarButtonSet_refreshVariables_4 (def :  pcf.TransactionDetailToolbarButtonSet_recovery) : void {
      def.refreshVariables(Claim, Transaction)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimFinancialsTransactionsDetail.pcf: line 28, column 85
    function toolbarButtonSet_refreshVariables_6 (def :  pcf.TransactionDetailToolbarButtonSet_recoveryreserve) : void {
      def.refreshVariables(Claim, Transaction)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimFinancialsTransactionsDetail.pcf: line 28, column 85
    function toolbarButtonSet_refreshVariables_8 (def :  pcf.TransactionDetailToolbarButtonSet_reserve) : void {
      def.refreshVariables(Claim, Transaction)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimFinancialsTransactionsDetail {
      return super.CurrentLocation as pcf.ClaimFinancialsTransactionsDetail
    }
    
    property get Transaction () : Transaction {
      return getVariableValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setVariableValue("Transaction", 0, $arg)
    }
    
    property get TransactionView () : TransactionView {
      return getVariableValue("TransactionView", 0) as TransactionView
    }
    
    property set TransactionView ($arg :  TransactionView) {
      setVariableValue("TransactionView", 0, $arg)
    }
    
    
  }
  
  
}