package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionApprovalHistoryInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionApprovalHistoryInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionApprovalHistoryInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionApprovalHistoryInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at TransactionApprovalHistoryInputSet.pcf: line 15, column 25
    function def_onEnter_0 (def :  pcf.ApprovalHistoryLV) : void {
      def.onEnter(Transaction.TransactionSet.ApprovalHistory?.toTypedArray())
    }
    
    // 'def' attribute on ListViewInput at TransactionApprovalHistoryInputSet.pcf: line 15, column 25
    function def_refreshVariables_1 (def :  pcf.ApprovalHistoryLV) : void {
      def.refreshVariables(Transaction.TransactionSet.ApprovalHistory?.toTypedArray())
    }
    
    property get Transaction () : Transaction {
      return getRequireValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setRequireValue("Transaction", 0, $arg)
    }
    
    
  }
  
  
}