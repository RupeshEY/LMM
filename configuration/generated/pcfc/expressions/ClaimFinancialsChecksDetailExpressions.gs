package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimFinancialsChecksDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsChecksDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, check :  Check) : int {
      return 0
    }
    
    static function __constructorIndex (claim :  Claim, check :  Check, autoPaidInvoice :  ServiceRequestInvoice) : int {
      return 1
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_TransferButton) at ClaimFinancialsChecksDetail.pcf: line 63, column 49
    function action_12 () : void {
      CheckTransfer.go(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_VoidStopButton) at ClaimFinancialsChecksDetail.pcf: line 70, column 53
    function action_16 () : void {
      VoidStopCheck.go(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_ReissueButton) at ClaimFinancialsChecksDetail.pcf: line 76, column 53
    function action_20 () : void {
      ReissueCheck.go(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_ResubmitButton) at ClaimFinancialsChecksDetail.pcf: line 83, column 42
    function action_24 () : void {
      resubmitCheck(check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_CloneButton) at ClaimFinancialsChecksDetail.pcf: line 89, column 54
    function action_27 () : void {
      CloneCheckWizard.go(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_EditAllButton) at ClaimFinancialsChecksDetail.pcf: line 98, column 85
    function action_31 () : void {
      EditRecurrenceCheckWizard.go(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_ChangeRecurrenceScheduleButton) at ClaimFinancialsChecksDetail.pcf: line 105, column 85
    function action_35 () : void {
      ChangeCheckRecurrence.go(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_EditButton) at ClaimFinancialsChecksDetail.pcf: line 47, column 47
    function action_4 () : void {
      EditCheckWizard.go(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_DeleteButton) at ClaimFinancialsChecksDetail.pcf: line 55, column 47
    function action_8 () : void {
      ensureLocationEditing();  beforeCommitAction = \ -> deleteCheck(check);  afterCommitAction = \ -> ClaimFinancialsChecks.go(claim);  CurrentLocation.commit()
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_TransferButton) at ClaimFinancialsChecksDetail.pcf: line 63, column 49
    function action_dest_13 () : pcf.api.Destination {
      return pcf.CheckTransfer.createDestination(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_VoidStopButton) at ClaimFinancialsChecksDetail.pcf: line 70, column 53
    function action_dest_17 () : pcf.api.Destination {
      return pcf.VoidStopCheck.createDestination(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_ReissueButton) at ClaimFinancialsChecksDetail.pcf: line 76, column 53
    function action_dest_21 () : pcf.api.Destination {
      return pcf.ReissueCheck.createDestination(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_CloneButton) at ClaimFinancialsChecksDetail.pcf: line 89, column 54
    function action_dest_28 () : pcf.api.Destination {
      return pcf.CloneCheckWizard.createDestination(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_EditAllButton) at ClaimFinancialsChecksDetail.pcf: line 98, column 85
    function action_dest_32 () : pcf.api.Destination {
      return pcf.EditRecurrenceCheckWizard.createDestination(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_ChangeRecurrenceScheduleButton) at ClaimFinancialsChecksDetail.pcf: line 105, column 85
    function action_dest_36 () : pcf.api.Destination {
      return pcf.ChangeCheckRecurrence.createDestination(claim, check)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_EditButton) at ClaimFinancialsChecksDetail.pcf: line 47, column 47
    function action_dest_5 () : pcf.api.Destination {
      return pcf.EditCheckWizard.createDestination(claim, check)
    }
    
    // 'afterCommit' attribute on Page (id=ClaimFinancialsChecksDetail) at ClaimFinancialsChecksDetail.pcf: line 13, column 73
    function afterCommit_42 (TopLocation :  pcf.api.Location) : void {
      if (afterCommitAction != null) {afterCommitAction()}
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_TransferButton) at ClaimFinancialsChecksDetail.pcf: line 63, column 49
    function available_10 () : java.lang.Boolean {
      return  check.isTransferable() and perm.Check.transfer(check)
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_VoidStopButton) at ClaimFinancialsChecksDetail.pcf: line 70, column 53
    function available_14 () : java.lang.Boolean {
      return ( (check.Voidable or check.Stoppable)) and perm.Payment.voidorstop(check)
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_ReissueButton) at ClaimFinancialsChecksDetail.pcf: line 76, column 53
    function available_18 () : java.lang.Boolean {
      return !check.Bulked and check.Reissueable and perm.Payment.voidorstop(check) and check.PaymentMethod != PaymentMethod.TC_EFT
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_EditButton) at ClaimFinancialsChecksDetail.pcf: line 47, column 47
    function available_2 () : java.lang.Boolean {
      return !check.Bulked and ((check.Group != null) ? check.Group.isEditable() : check.isEditable()) and (!check.CheckSet.Recurring || check.CheckSet.Approved) and perm.Payment.edit(check)
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_ResubmitButton) at ClaimFinancialsChecksDetail.pcf: line 83, column 42
    function available_22 () : java.lang.Boolean {
      return  check.Resubmittable and perm.Check.edit(check)
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_CloneButton) at ClaimFinancialsChecksDetail.pcf: line 89, column 54
    function available_25 () : java.lang.Boolean {
      return !check.Bulked and perm.Claim.createpayment(claim)
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_EditAllButton) at ClaimFinancialsChecksDetail.pcf: line 98, column 85
    function available_29 () : java.lang.Boolean {
      return check.CheckSet.Recurrence != null and check.CheckSet.Recurrence.hasEditableChecks() and perm.Payment.edit(check)
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_DeleteButton) at ClaimFinancialsChecksDetail.pcf: line 55, column 47
    function available_6 () : java.lang.Boolean {
      return !check.Bulked and check.Deletable and perm.Payment.edit(check)
    }
    
    // 'beforeCommit' attribute on Page (id=ClaimFinancialsChecksDetail) at ClaimFinancialsChecksDetail.pcf: line 13, column 73
    function beforeCommit_43 (pickedValue :  java.lang.Object) : void {
      if (beforeCommitAction != null) {beforeCommitAction()}
    }
    
    // 'canVisit' attribute on Page (id=ClaimFinancialsChecksDetail) at ClaimFinancialsChecksDetail.pcf: line 13, column 73
    static function canVisit_44 (autoPaidInvoice :  ServiceRequestInvoice, check :  Check, claim :  Claim) : java.lang.Boolean {
      return perm.Check.view(check)
    }
    
    // 'confirmMessage' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_DeleteButton) at ClaimFinancialsChecksDetail.pcf: line 55, column 47
    function confirmMessage_9 () : java.lang.String {
      return getDeleteConfirmationMsg(check)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsChecksDetail.pcf: line 113, column 35
    function def_onEnter_40 (def :  pcf.CheckDV) : void {
      def.onEnter(check)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsChecksDetail.pcf: line 113, column 35
    function def_refreshVariables_41 (def :  pcf.CheckDV) : void {
      def.refreshVariables(check)
    }
    
    // 'initialValue' attribute on Variable at ClaimFinancialsChecksDetail.pcf: line 30, column 23
    function initialValue_0 () : block() {
      return null
    }
    
    // 'label' attribute on AlertBar (id=InvoiceWasAutoPaid) at ClaimFinancialsChecksDetail.pcf: line 110, column 44
    function label_38 () : java.lang.Object {
      return autoPaidInvoice.ReferenceNumber.HasContent ? DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AutoPaidWithReferenceNumber", autoPaidInvoice.ReferenceNumber, autoPaidInvoice.Amount) : DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AutoPaid", autoPaidInvoice.Amount)
    }
    
    // 'parent' attribute on Page (id=ClaimFinancialsChecksDetail) at ClaimFinancialsChecksDetail.pcf: line 13, column 73
    static function parent_45 (autoPaidInvoice :  ServiceRequestInvoice, check :  Check, claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimFinancialsChecks.createDestination(claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_TransferButton) at ClaimFinancialsChecksDetail.pcf: line 63, column 49
    function visible_11 () : java.lang.Boolean {
      return perm.Check.transfer(check)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_VoidStopButton) at ClaimFinancialsChecksDetail.pcf: line 70, column 53
    function visible_15 () : java.lang.Boolean {
      return perm.Payment.voidorstop(check)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_ResubmitButton) at ClaimFinancialsChecksDetail.pcf: line 83, column 42
    function visible_23 () : java.lang.Boolean {
      return check.Resubmittable
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_CloneButton) at ClaimFinancialsChecksDetail.pcf: line 89, column 54
    function visible_26 () : java.lang.Boolean {
      return perm.Claim.createpayment(claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_EditButton) at ClaimFinancialsChecksDetail.pcf: line 47, column 47
    function visible_3 () : java.lang.Boolean {
      return perm.Payment.edit(check)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimFinancialsChecksDetail_EditAllButton) at ClaimFinancialsChecksDetail.pcf: line 98, column 85
    function visible_30 () : java.lang.Boolean {
      return check.CheckSet.Recurrence != null and perm.Payment.edit(check)
    }
    
    // 'visible' attribute on AlertBar (id=InvoiceWasAutoPaid) at ClaimFinancialsChecksDetail.pcf: line 110, column 44
    function visible_37 () : java.lang.Boolean {
      return autoPaidInvoice != null
    }
    
    // 'visible' attribute on PanelRef at ClaimFinancialsChecksDetail.pcf: line 113, column 35
    function visible_39 () : java.lang.Boolean {
      return !check.Retired
    }
    
    property get CheckView () : CheckView {
      return getVariableValue("CheckView", 0) as CheckView
    }
    
    property set CheckView ($arg :  CheckView) {
      setVariableValue("CheckView", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimFinancialsChecksDetail {
      return super.CurrentLocation as pcf.ClaimFinancialsChecksDetail
    }
    
    property get afterCommitAction () : block() {
      return getVariableValue("afterCommitAction", 0) as block()
    }
    
    property set afterCommitAction ($arg :  block()) {
      setVariableValue("afterCommitAction", 0, $arg)
    }
    
    property get autoPaidInvoice () : ServiceRequestInvoice {
      return getVariableValue("autoPaidInvoice", 0) as ServiceRequestInvoice
    }
    
    property set autoPaidInvoice ($arg :  ServiceRequestInvoice) {
      setVariableValue("autoPaidInvoice", 0, $arg)
    }
    
    property get beforeCommitAction () : block() {
      return getVariableValue("beforeCommitAction", 0) as block()
    }
    
    property set beforeCommitAction ($arg :  block()) {
      setVariableValue("beforeCommitAction", 0, $arg)
    }
    
    property get check () : Check {
      return getVariableValue("check", 0) as Check
    }
    
    property set check ($arg :  Check) {
      setVariableValue("check", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    function deleteCheck(aCheck: Check) {
      // only unlink deductible if the deleted check is the primary check or not in a checkgroup. 
      if (aCheck.Group == null or (aCheck.Group != null and aCheck.PublicID == aCheck.Group.PrimaryCheck.PublicID)) {
        aCheck.unlinkDeductibles()
      }
      aCheck.delete()
    }
    
    function getDeleteConfirmationMsg(chk: Check): java.lang.String {
      var invoiceList = chk.BulletedListOfServiceRequestInvoicesForWarning
      if (chk.Primary) {
        if (invoiceList != null) {
          return DisplayKey.get("Java.Financials.DeleteCheckWithInvoices.Tip", ServiceRequestInvoiceStatus.TC_APPROVED.DisplayName, invoiceList)
        } else {
          return DisplayKey.get("Java.Financials.DeleteCheck.Tip")
        }
      } else {
        if (invoiceList != null) {
          return DisplayKey.get("Java.Financials.DeleteCheckWithInvoices.Tip.Secondary", ServiceRequestInvoiceStatus.TC_APPROVED.DisplayName, invoiceList)
        } else {
          return DisplayKey.get("Java.Financials.DeleteCheck.Tip.Secondary");
        }
      }
    }
    
    function resubmitCheck(rcheck: Check) {
      ensureLocationEditing()
      var success = false
      try {
        //relinks the deductible
        rcheck.relinkFormerDeductiblesForResubmit()
        rcheck.resubmit()
        CurrentLocation.commit()
        success = true
      } finally {
        if (!success) {
          CurrentLocation.cancel()
        }
      }
    }
    
    function ensureLocationEditing() {
      if (!CurrentLocation.InEditMode) {
        CurrentLocation.startEditing();
      }
    }
    
    
  }
  
  
}