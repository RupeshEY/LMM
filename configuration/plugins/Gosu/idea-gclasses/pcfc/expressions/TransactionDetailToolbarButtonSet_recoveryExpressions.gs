package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.recovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionDetailToolbarButtonSet_recoveryExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.recovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_RecodeButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 39, column 67
    function action_11 () : void {
      RecodeRecovery.go(Transaction as Recovery)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_TransferButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 44, column 69
    function action_14 () : void {
      TransferRecovery.go(Transaction as Recovery)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_VoidButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 21, column 53
    function action_2 () : void {
      VoidRecovery.go(Claim, (Transaction as Recovery))
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_ResubmitButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 28, column 58
    function action_6 () : void {
      resubmitRecovery(Transaction as Recovery)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_DeleteButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 34, column 54
    function action_9 () : void {
      deleteRecovery(Transaction as Recovery)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_RecodeButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 39, column 67
    function action_dest_12 () : pcf.api.Destination {
      return pcf.RecodeRecovery.createDestination(Transaction as Recovery)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_TransferButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 44, column 69
    function action_dest_15 () : pcf.api.Destination {
      return pcf.TransferRecovery.createDestination(Transaction as Recovery)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_VoidButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 21, column 53
    function action_dest_3 () : pcf.api.Destination {
      return pcf.VoidRecovery.createDestination(Claim, (Transaction as Recovery))
    }
    
    // 'available' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_VoidButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 21, column 53
    function available_0 () : java.lang.Boolean {
      return (Transaction as Recovery).Voidable and perm.Recovery.voidrec(Transaction)
    }
    
    // 'available' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_RecodeButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 39, column 67
    function available_10 () : java.lang.Boolean {
      return (Transaction as Recovery).Recodeable and perm.Recovery.edit(Transaction)
    }
    
    // 'available' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_TransferButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 44, column 69
    function available_13 () : java.lang.Boolean {
      return (Transaction as Recovery).Transferable and perm.Recovery.edit(Transaction)
    }
    
    // 'available' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_ResubmitButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 28, column 58
    function available_4 () : java.lang.Boolean {
      return (Transaction as Recovery).Resubmittable and perm.Recovery.edit(Transaction)
    }
    
    // 'available' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_DeleteButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 34, column 54
    function available_7 () : java.lang.Boolean {
      return (Transaction as Recovery).Deletable and perm.Recovery.edit(Transaction)
    }
    
    // 'visible' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_VoidButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 21, column 53
    function visible_1 () : java.lang.Boolean {
      return (Transaction as Recovery).Voidable
    }
    
    // 'visible' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_ResubmitButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 28, column 58
    function visible_5 () : java.lang.Boolean {
      return (Transaction as Recovery).Resubmittable
    }
    
    // 'visible' attribute on ToolbarButton (id=TransactionDetailToolbarButtons_DeleteButton) at TransactionDetailToolbarButtonSet.recovery.pcf: line 34, column 54
    function visible_8 () : java.lang.Boolean {
      return (Transaction as Recovery).Deletable
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Transaction () : Transaction {
      return getRequireValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setRequireValue("Transaction", 0, $arg)
    }
    
    
    function resubmitRecovery(r : Recovery) {
            CurrentLocation.startEditing();
    
            var success =  false;
            try {
              r.resubmitRecovery();
              CurrentLocation.commit();
              success = true;
            } finally {
              if (!success) {
                CurrentLocation.cancel();
              }
            }
          }
    
          function deleteRecovery(r : Recovery) {
            CurrentLocation.startEditing();
    
            var success =  false;
            try {
              r.deleteRecovery();
              CurrentLocation.commit();
              success = true;
            } finally {
              if (!success) {
                CurrentLocation.cancel();
              } else {
                ClaimFinancialsTransactions.go(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.RECOVERY);
              }
            }
          }
          
        
    
    
  }
  
  
}