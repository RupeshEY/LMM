package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/print/TransactionDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionDetailPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/print/TransactionDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, TransactionView :  TransactionView) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at TransactionDetailPrint.pcf: line 23, column 49
    function def_onEnter_1 (def :  pcf.TransactionDetailPrintScreen_Payment) : void {
      def.onEnter(transaction)
    }
    
    // 'def' attribute on ScreenRef at TransactionDetailPrint.pcf: line 23, column 49
    function def_onEnter_3 (def :  pcf.TransactionDetailPrintScreen_Recovery) : void {
      def.onEnter(transaction)
    }
    
    // 'def' attribute on ScreenRef at TransactionDetailPrint.pcf: line 23, column 49
    function def_onEnter_5 (def :  pcf.TransactionDetailPrintScreen_RecoveryReserve) : void {
      def.onEnter(transaction)
    }
    
    // 'def' attribute on ScreenRef at TransactionDetailPrint.pcf: line 23, column 49
    function def_onEnter_7 (def :  pcf.TransactionDetailPrintScreen_Reserve) : void {
      def.onEnter(transaction)
    }
    
    // 'def' attribute on ScreenRef at TransactionDetailPrint.pcf: line 23, column 49
    function def_refreshVariables_2 (def :  pcf.TransactionDetailPrintScreen_Payment) : void {
      def.refreshVariables(transaction)
    }
    
    // 'def' attribute on ScreenRef at TransactionDetailPrint.pcf: line 23, column 49
    function def_refreshVariables_4 (def :  pcf.TransactionDetailPrintScreen_Recovery) : void {
      def.refreshVariables(transaction)
    }
    
    // 'def' attribute on ScreenRef at TransactionDetailPrint.pcf: line 23, column 49
    function def_refreshVariables_6 (def :  pcf.TransactionDetailPrintScreen_RecoveryReserve) : void {
      def.refreshVariables(transaction)
    }
    
    // 'def' attribute on ScreenRef at TransactionDetailPrint.pcf: line 23, column 49
    function def_refreshVariables_8 (def :  pcf.TransactionDetailPrintScreen_Reserve) : void {
      def.refreshVariables(transaction)
    }
    
    // 'initialValue' attribute on Variable at TransactionDetailPrint.pcf: line 20, column 27
    function initialValue_0 () : Transaction {
      return TransactionView.Transaction
    }
    
    // 'mode' attribute on ScreenRef at TransactionDetailPrint.pcf: line 23, column 49
    function mode_9 () : java.lang.Object {
      return (typeof transaction).RelativeName
    }
    
    // 'parent' attribute on Page (id=TransactionDetailPrint) at TransactionDetailPrint.pcf: line 8, column 57
    static function parent_10 (Claim :  Claim, TransactionView :  TransactionView) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(Claim)
    }
    
    // 'title' attribute on Page (id=TransactionDetailPrint) at TransactionDetailPrint.pcf: line 8, column 57
    static function title_11 (Claim :  Claim, TransactionView :  TransactionView) : java.lang.Object {
      return TransactionView.Transaction.DetailPageTitle
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.TransactionDetailPrint {
      return super.CurrentLocation as pcf.TransactionDetailPrint
    }
    
    property get TransactionView () : TransactionView {
      return getVariableValue("TransactionView", 0) as TransactionView
    }
    
    property set TransactionView ($arg :  TransactionView) {
      setVariableValue("TransactionView", 0, $arg)
    }
    
    property get transaction () : Transaction {
      return getVariableValue("transaction", 0) as Transaction
    }
    
    property set transaction ($arg :  Transaction) {
      setVariableValue("transaction", 0, $arg)
    }
    
    
  }
  
  
}