package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/history/HistoryForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class HistoryForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/history/HistoryForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HistoryForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (history :  History) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at HistoryForward.pcf: line 20, column 46
    function action_1 () : void {
      EditBulkInvoiceDetail.go(history.BulkInvoice)
    }
    
    // 'action' attribute on ForwardCondition at HistoryForward.pcf: line 31, column 67
    function action_10 () : void {
      ClaimFinancialsTransactionsDetail.go(claim, history.FirstTransaction)
    }
    
    // 'action' attribute on ForwardCondition at HistoryForward.pcf: line 35, column 74
    function action_13 () : void {
      ClaimFinancialsTransactionsDetail.go(claim, history.FirstTransaction)
    }
    
    // 'action' attribute on ForwardCondition at HistoryForward.pcf: line 23, column 64
    function action_4 () : void {
      ClaimFinancialsTransactionsDetail.go(claim, history.FirstPayment)
    }
    
    // 'action' attribute on ForwardCondition at HistoryForward.pcf: line 27, column 66
    function action_7 () : void {
      ClaimFinancialsTransactionsDetail.go(claim, history.FirstTransaction)
    }
    
    // 'action' attribute on ForwardCondition at HistoryForward.pcf: line 31, column 67
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(claim, history.FirstTransaction)
    }
    
    // 'action' attribute on ForwardCondition at HistoryForward.pcf: line 35, column 74
    function action_dest_14 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(claim, history.FirstTransaction)
    }
    
    // 'action' attribute on ForwardCondition at HistoryForward.pcf: line 20, column 46
    function action_dest_2 () : pcf.api.Destination {
      return pcf.EditBulkInvoiceDetail.createDestination(history.BulkInvoice)
    }
    
    // 'action' attribute on ForwardCondition at HistoryForward.pcf: line 23, column 64
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(claim, history.FirstPayment)
    }
    
    // 'action' attribute on ForwardCondition at HistoryForward.pcf: line 27, column 66
    function action_dest_8 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(claim, history.FirstTransaction)
    }
    
    // 'canVisit' attribute on Forward (id=HistoryForward) at HistoryForward.pcf: line 7, column 25
    static function canVisit_16 (history :  History) : java.lang.Boolean {
      return (history.BulkInvoice != null ) || (history.TransactionSet != null  &&  (history.TransactionSet.Subtype!=TC_CHECKSET || (history.TransactionSet as CheckSet).PrimaryCheck != null))
    }
    
    // 'condition' attribute on ForwardCondition at HistoryForward.pcf: line 31, column 67
    function condition_12 () : java.lang.Boolean {
      return history.TransactionSet.Subtype==TC_RECOVERYSET
    }
    
    // 'condition' attribute on ForwardCondition at HistoryForward.pcf: line 35, column 74
    function condition_15 () : java.lang.Boolean {
      return history.TransactionSet.Subtype==TC_RECOVERYRESERVESET
    }
    
    // 'condition' attribute on ForwardCondition at HistoryForward.pcf: line 20, column 46
    function condition_3 () : java.lang.Boolean {
      return history.BulkInvoice!=null
    }
    
    // 'condition' attribute on ForwardCondition at HistoryForward.pcf: line 23, column 64
    function condition_6 () : java.lang.Boolean {
      return history.TransactionSet.Subtype==TC_CHECKSET
    }
    
    // 'condition' attribute on ForwardCondition at HistoryForward.pcf: line 27, column 66
    function condition_9 () : java.lang.Boolean {
      return history.TransactionSet.Subtype==TC_RESERVESET
    }
    
    // 'initialValue' attribute on Variable at HistoryForward.pcf: line 17, column 28
    function initialValue_0 () : entity.Claim {
      return history.Claim
    }
    
    override property get CurrentLocation () : pcf.HistoryForward {
      return super.CurrentLocation as pcf.HistoryForward
    }
    
    property get claim () : entity.Claim {
      return getVariableValue("claim", 0) as entity.Claim
    }
    
    property set claim ($arg :  entity.Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get history () : History {
      return getVariableValue("history", 0) as History
    }
    
    property set history ($arg :  History) {
      setVariableValue("history", 0, $arg)
    }
    
    
  }
  
  
}