package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.payment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionDetailToolbarButtonSet_paymentExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.payment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_RecodeButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 38, column 51
    function action_11 () : void {
      RecodePayment.go(Claim, Payment)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_ViewButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 45, column 51
    function action_14 () : void {
      ClaimFinancialsChecksDetail.go(Claim, Payment.Check)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_CreateRecoveryButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 53, column 51
    function action_18 () : void {
      NewRecoverySet.go(Claim, Payment)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_EditButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 25, column 49
    function action_3 () : void {
      EditCheckWizard.go(Claim, Payment.Check)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_DeleteButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 32, column 49
    function action_7 () : void {
      DeleteSinglePayment.go(Claim, Payment)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_RecodeButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 38, column 51
    function action_dest_12 () : pcf.api.Destination {
      return pcf.RecodePayment.createDestination(Claim, Payment)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_ViewButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 45, column 51
    function action_dest_15 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, Payment.Check)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_CreateRecoveryButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 53, column 51
    function action_dest_19 () : pcf.api.Destination {
      return pcf.NewRecoverySet.createDestination(Claim, Payment)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_EditButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 25, column 49
    function action_dest_4 () : pcf.api.Destination {
      return pcf.EditCheckWizard.createDestination(Claim, Payment.Check)
    }
    
    // 'action' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_DeleteButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 32, column 49
    function action_dest_8 () : pcf.api.Destination {
      return pcf.DeleteSinglePayment.createDestination(Claim, Payment)
    }
    
    // 'available' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_EditButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 25, column 49
    function available_1 () : java.lang.Boolean {
      return !Payment.Check.Bulked and Payment.Editable and perm.Payment.edit(Transaction)
    }
    
    // 'available' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_CreateRecoveryButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 53, column 51
    function available_16 () : java.lang.Boolean {
      return  Payment.canCreateRecovery() and perm.Claim.createrecovery(Claim)
    }
    
    // 'available' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_DeleteButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 32, column 49
    function available_5 () : java.lang.Boolean {
      return !Payment.Check.Bulked and Payment.Check.Deletable and perm.Payment.edit(Transaction)
    }
    
    // 'available' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_RecodeButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 38, column 51
    function available_9 () : java.lang.Boolean {
      return Payment.Recodeable and perm.Payment.recode(Transaction)
    }
    
    // 'initialValue' attribute on Variable at TransactionDetailToolbarButtonSet.payment.pcf: line 18, column 23
    function initialValue_0 () : Payment {
      return Transaction as Payment
    }
    
    // 'visible' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_RecodeButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 38, column 51
    function visible_10 () : java.lang.Boolean {
      return perm.Payment.recode(Transaction)
    }
    
    // 'visible' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_ViewButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 45, column 51
    function visible_13 () : java.lang.Boolean {
      return perm.Payment.view(Payment.Check)
    }
    
    // 'visible' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_CreateRecoveryButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 53, column 51
    function visible_17 () : java.lang.Boolean {
      return perm.Claim.createrecovery(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=TransactionDetailToolbarButtonSet_EditButton) at TransactionDetailToolbarButtonSet.payment.pcf: line 25, column 49
    function visible_2 () : java.lang.Boolean {
      return perm.Payment.edit(Transaction)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Payment () : Payment {
      return getVariableValue("Payment", 0) as Payment
    }
    
    property set Payment ($arg :  Payment) {
      setVariableValue("Payment", 0, $arg)
    }
    
    property get Transaction () : Transaction {
      return getRequireValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setRequireValue("Transaction", 0, $arg)
    }
    
    
  }
  
  
}