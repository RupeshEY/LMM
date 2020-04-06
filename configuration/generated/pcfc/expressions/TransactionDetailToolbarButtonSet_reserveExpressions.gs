package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.reserve.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionDetailToolbarButtonSet_reserveExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.reserve.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_CreateCheckButton) at TransactionDetailToolbarButtonSet.reserve.pcf: line 41, column 50
    function action_11 () : void {
      NormalCreateCheckWizardForward.go(claim, exposure, Transaction.CostType, Transaction.CostCategory, Transaction.ReservingCurrency, true)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_EditButton) at TransactionDetailToolbarButtonSet.reserve.pcf: line 26, column 49
    function action_3 () : void {
      NewReserveSet.go(claim, (Transaction as Reserve), null)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_DeleteButton) at TransactionDetailToolbarButtonSet.reserve.pcf: line 33, column 49
    function action_7 () : void {
      DeleteReserveSet.go(claim, (Transaction as Reserve))
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_CreateCheckButton) at TransactionDetailToolbarButtonSet.reserve.pcf: line 41, column 50
    function action_dest_12 () : pcf.api.Destination {
      return pcf.NormalCreateCheckWizardForward.createDestination(claim, exposure, Transaction.CostType, Transaction.CostCategory, Transaction.ReservingCurrency, true)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_EditButton) at TransactionDetailToolbarButtonSet.reserve.pcf: line 26, column 49
    function action_dest_4 () : pcf.api.Destination {
      return pcf.NewReserveSet.createDestination(claim, (Transaction as Reserve), null)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_DeleteButton) at TransactionDetailToolbarButtonSet.reserve.pcf: line 33, column 49
    function action_dest_8 () : pcf.api.Destination {
      return pcf.DeleteReserveSet.createDestination(claim, (Transaction as Reserve))
    }
    
    // 'available' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_EditButton) at TransactionDetailToolbarButtonSet.reserve.pcf: line 26, column 49
    function available_1 () : java.lang.Boolean {
      return ( !claim.Closed and (exposure == null or !exposure.Closed) ) and perm.Reserve.edit(Transaction)
    }
    
    // 'available' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_DeleteButton) at TransactionDetailToolbarButtonSet.reserve.pcf: line 33, column 49
    function available_5 () : java.lang.Boolean {
      return (Transaction as Reserve).Deletable and !(Transaction as Reserve).isZeroingOffset() and perm.Reserve.edit(Transaction)
    }
    
    // 'available' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_CreateCheckButton) at TransactionDetailToolbarButtonSet.reserve.pcf: line 41, column 50
    function available_9 () : java.lang.Boolean {
      return ( ((Transaction as Reserve).Status != null and !(Transaction as Reserve).NotApproved)) and perm.Claim.createpayment(claim)
    }
    
    // 'initialValue' attribute on Variable at TransactionDetailToolbarButtonSet.reserve.pcf: line 19, column 31
    function initialValue_0 () : entity.Exposure {
      return (null != (Transaction as Reserve).Exposure) ? (Transaction as Reserve).Exposure : null
    }
    
    // 'visible' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_CreateCheckButton) at TransactionDetailToolbarButtonSet.reserve.pcf: line 41, column 50
    function visible_10 () : java.lang.Boolean {
      return perm.Claim.createpayment(claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_EditButton) at TransactionDetailToolbarButtonSet.reserve.pcf: line 26, column 49
    function visible_2 () : java.lang.Boolean {
      return perm.Reserve.edit(Transaction)
    }
    
    property get Transaction () : Transaction {
      return getRequireValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setRequireValue("Transaction", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get exposure () : entity.Exposure {
      return getVariableValue("exposure", 0) as entity.Exposure
    }
    
    property set exposure ($arg :  entity.Exposure) {
      setVariableValue("exposure", 0, $arg)
    }
    
    
  }
  
  
}