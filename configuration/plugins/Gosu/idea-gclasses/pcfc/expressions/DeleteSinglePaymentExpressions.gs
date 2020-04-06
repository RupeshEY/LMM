package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/DeleteSinglePayment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DeleteSinglePaymentExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/DeleteSinglePayment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteSinglePaymentExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Payment :  Payment) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=DeleteSinglePayment_CancelButton) at DeleteSinglePayment.pcf: line 41, column 62
    function action_3 () : void {
      ClaimFinancialsTransactionsDetail.go(Claim, Payment)
    }
    
    // 'action' attribute on ToolbarButton (id=DeleteSinglePayment_DeleteButton) at DeleteSinglePayment.pcf: line 47, column 47
    function action_7 () : void {
      ensureLocationEditing(); beforeCommitAction = \ -> deleteCheck(Check); afterCommitAction = \ -> saveAndGo();  CurrentLocation.commit()
    }
    
    // 'action' attribute on ToolbarButton (id=DeleteSinglePayment_CancelButton) at DeleteSinglePayment.pcf: line 41, column 62
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(Claim, Payment)
    }
    
    // 'afterCommit' attribute on Page (id=DeleteSinglePayment) at DeleteSinglePayment.pcf: line 12, column 71
    function afterCommit_13 (TopLocation :  pcf.api.Location) : void {
      if (afterCommitAction != null) {afterCommitAction()}
    }
    
    // 'available' attribute on ToolbarButton (id=DeleteSinglePayment_DeleteButton) at DeleteSinglePayment.pcf: line 47, column 47
    function available_5 () : java.lang.Boolean {
      return Check.Deletable and perm.Payment.edit(Check)
    }
    
    // 'beforeCommit' attribute on Page (id=DeleteSinglePayment) at DeleteSinglePayment.pcf: line 12, column 71
    function beforeCommit_14 (pickedValue :  java.lang.Object) : void {
      if (beforeCommitAction != null) {beforeCommitAction()}
    }
    
    // 'canVisit' attribute on Page (id=DeleteSinglePayment) at DeleteSinglePayment.pcf: line 12, column 71
    static function canVisit_15 (Claim :  Claim, Payment :  Payment) : java.lang.Boolean {
      return perm.Payment.view(Payment)
    }
    
    // 'def' attribute on PanelRef at DeleteSinglePayment.pcf: line 61, column 35
    function def_onEnter_11 (def :  pcf.CheckDV) : void {
      def.onEnter(Check)
    }
    
    // 'def' attribute on PanelRef at DeleteSinglePayment.pcf: line 61, column 35
    function def_refreshVariables_12 (def :  pcf.CheckDV) : void {
      def.refreshVariables(Check)
    }
    
    // 'initialValue' attribute on Variable at DeleteSinglePayment.pcf: line 25, column 28
    function initialValue_0 () : entity.Check {
      return Payment.Check
    }
    
    // 'initialValue' attribute on Variable at DeleteSinglePayment.pcf: line 29, column 23
    function initialValue_1 () : block() {
      return null
    }
    
    // 'label' attribute on TextInput (id=DeletePaymentWarningMessage) at DeleteSinglePayment.pcf: line 56, column 35
    function label_8 () : java.lang.Object {
      return DeleteCheckWarningMessage
    }
    
    // 'parent' attribute on Page (id=DeleteSinglePayment) at DeleteSinglePayment.pcf: line 12, column 71
    static function parent_16 (Claim :  Claim, Payment :  Payment) : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, Payment.Check)
    }
    
    // 'visible' attribute on PanelRef at DeleteSinglePayment.pcf: line 61, column 35
    function visible_10 () : java.lang.Boolean {
      return !Check.Retired
    }
    
    // 'visible' attribute on ToolbarButton (id=DeleteSinglePayment_DeleteButton) at DeleteSinglePayment.pcf: line 47, column 47
    function visible_6 () : java.lang.Boolean {
      return perm.Payment.edit(Check)
    }
    
    property get Check () : entity.Check {
      return getVariableValue("Check", 0) as entity.Check
    }
    
    property set Check ($arg :  entity.Check) {
      setVariableValue("Check", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.DeleteSinglePayment {
      return super.CurrentLocation as pcf.DeleteSinglePayment
    }
    
    property get Payment () : Payment {
      return getVariableValue("Payment", 0) as Payment
    }
    
    property set Payment ($arg :  Payment) {
      setVariableValue("Payment", 0, $arg)
    }
    
    property get afterCommitAction () : block() {
      return getVariableValue("afterCommitAction", 0) as block()
    }
    
    property set afterCommitAction ($arg :  block()) {
      setVariableValue("afterCommitAction", 0, $arg)
    }
    
    property get beforeCommitAction () : block() {
      return getVariableValue("beforeCommitAction", 0) as block()
    }
    
    property set beforeCommitAction ($arg :  block()) {
      setVariableValue("beforeCommitAction", 0, $arg)
    }
    
    function deleteCheck(aCheck: Check) {
      aCheck.unlinkDeductibles()
      aCheck.delete()
    }
    
    function saveAndGo() {
      gw.api.financials.ClaimFinancialsTransactionsOption.PAYMENT.saveOption(Claim)
      ClaimFinancialsTransactions.go(Claim)
    }
    
    function ensureLocationEditing() {
      if (!CurrentLocation.InEditMode) {
        CurrentLocation.startEditing();
      }
    }
    
    property get DeleteCheckWarningMessage(): String {
      var invoiceList = Check.BulletedListOfServiceRequestInvoicesForWarning
      if (invoiceList != null) {
        return DisplayKey.get("Java.Financials.DeleteCheckWithInvoices.Tip.Payment", ServiceRequestInvoiceStatus.TC_APPROVED.DisplayName, invoiceList)
      } else {
        return DisplayKey.get("Java.Financials.DeleteCheck.Tip.Payment")
    }
    }
    
    
  }
  
  
}