package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailPanelSet.reserve.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionDetailPanelSet_reserveExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailPanelSet.reserve.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at TransactionDetailPanelSet.reserve.pcf: line 13, column 59
    function def_onEnter_0 (def :  pcf.TransactionReserveDV) : void {
      def.onEnter(Transaction as Reserve)
    }
    
    // 'def' attribute on PanelRef at TransactionDetailPanelSet.reserve.pcf: line 13, column 59
    function def_refreshVariables_1 (def :  pcf.TransactionReserveDV) : void {
      def.refreshVariables(Transaction as Reserve)
    }
    
    property get Transaction () : Transaction {
      return getRequireValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setRequireValue("Transaction", 0, $arg)
    }
    
    
  }
  
  
}