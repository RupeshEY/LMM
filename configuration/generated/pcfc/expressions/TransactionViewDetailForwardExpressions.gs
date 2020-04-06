package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/TransactionViewDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionViewDetailForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/TransactionViewDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionViewDetailForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, TransactionView :  TransactionView) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at TransactionViewDetailForward.pcf: line 21, column 74
    function action_1 () : void {
      ClaimFinancialsTransactionsDetail.go(Claim, Transaction)
    }
    
    // 'action' attribute on ForwardCondition at TransactionViewDetailForward.pcf: line 21, column 74
    function action_dest_2 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(Claim, Transaction)
    }
    
    // 'initialValue' attribute on Variable at TransactionViewDetailForward.pcf: line 19, column 27
    function initialValue_0 () : Transaction {
      return TransactionView.Transaction
    }
    
    // 'parent' attribute on Forward (id=TransactionViewDetailForward) at TransactionViewDetailForward.pcf: line 7, column 49
    static function parent_3 (Claim :  Claim, TransactionView :  TransactionView) : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactions.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.TransactionViewDetailForward {
      return super.CurrentLocation as pcf.TransactionViewDetailForward
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