package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailPanelSet.recovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionDetailPanelSet_recoveryExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailPanelSet.recovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at TransactionDetailPanelSet.recovery.pcf: line 13, column 61
    function def_onEnter_0 (def :  pcf.TransactionRecoveryDV) : void {
      def.onEnter(Transaction as Recovery)
    }
    
    // 'def' attribute on PanelRef at TransactionDetailPanelSet.recovery.pcf: line 13, column 61
    function def_refreshVariables_1 (def :  pcf.TransactionRecoveryDV) : void {
      def.refreshVariables(Transaction as Recovery)
    }
    
    property get Transaction () : Transaction {
      return getRequireValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setRequireValue("Transaction", 0, $arg)
    }
    
    
  }
  
  
}