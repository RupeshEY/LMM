package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ApprovalDetailWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalDetailWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Activity :  Activity) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ApprovalDetailWorksheet_ViewReserveRequestButton) at ApprovalDetailWorksheet.pcf: line 55, column 46
    function action_12 () : void {
      CurrentLocation.cancel();ClaimFinancialsTransactionsDetail.goInMain(Activity.Claim, (Activity.TransactionSet as ReserveSet).AllTransactions[0])
    }
    
    // 'action' attribute on ToolbarButton (id=ApprovalDetailWorksheet_ViewAllReservesButton) at ApprovalDetailWorksheet.pcf: line 61, column 46
    function action_15 () : void {
      CurrentLocation.cancel();NewReserveSet.goInMain(Activity.Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=ApprovalDetailWorksheet_ApproveButton) at ApprovalDetailWorksheet.pcf: line 34, column 44
    function action_3 () : void {
      beforeCommitAction = \-> Activity.approve(); CurrentLocation.commit()
    }
    
    // 'action' attribute on ToolbarButton (id=ApprovalDetailWorksheet_RejectButton) at ApprovalDetailWorksheet.pcf: line 39, column 44
    function action_5 () : void {
      beforeCommitAction = \-> Activity.reject(); CurrentLocation.commit()
    }
    
    // 'action' attribute on ToolbarButton (id=ApprovalDetailWorksheet_CancelButton) at ApprovalDetailWorksheet.pcf: line 43, column 96
    function action_6 () : void {
      CurrentLocation.cancel()
    }
    
    // 'action' attribute on ToolbarButton (id=ApprovalDetailWorksheet_ViewCheckButton) at ApprovalDetailWorksheet.pcf: line 49, column 149
    function action_9 () : void {
      CurrentLocation.cancel();ClaimFinancialsChecksDetail.goInMain(Activity.Claim, (Activity.TransactionSet as CheckSet).PrimaryCheck)
    }
    
    // 'available' attribute on ToolbarButton (id=ApprovalDetailWorksheet_ViewReserveRequestButton) at ApprovalDetailWorksheet.pcf: line 55, column 46
    function available_10 () : java.lang.Boolean {
      return reserveButtonsAvailable()
    }
    
    // 'available' attribute on ToolbarButton (id=ApprovalDetailWorksheet_ViewCheckButton) at ApprovalDetailWorksheet.pcf: line 49, column 149
    function available_7 () : java.lang.Boolean {
      return (Activity.TransactionSet.Subtype == TC_CHECKSET)
    }
    
    // 'beforeCommit' attribute on Worksheet (id=ApprovalDetailWorksheet) at ApprovalDetailWorksheet.pcf: line 12, column 115
    function beforeCommit_25 (pickedValue :  java.lang.Object) : void {
      if (beforeCommitAction != null) { beforeCommitAction() }
    }
    
    // 'canVisit' attribute on Worksheet (id=ApprovalDetailWorksheet) at ApprovalDetailWorksheet.pcf: line 12, column 115
    static function canVisit_26 (Activity :  Activity, Claim :  Claim) : java.lang.Boolean {
      return perm.Activity.view(Activity)
    }
    
    // 'def' attribute on PanelRef at ApprovalDetailWorksheet.pcf: line 65, column 54
    function def_onEnter_16 (def :  pcf.ApprovalDetailDV_CheckSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on PanelRef at ApprovalDetailWorksheet.pcf: line 65, column 54
    function def_onEnter_18 (def :  pcf.ApprovalDetailDV_RecoveryReserveSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on PanelRef at ApprovalDetailWorksheet.pcf: line 65, column 54
    function def_onEnter_20 (def :  pcf.ApprovalDetailDV_RecoverySet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on PanelRef at ApprovalDetailWorksheet.pcf: line 65, column 54
    function def_onEnter_22 (def :  pcf.ApprovalDetailDV_ReserveSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on PanelRef at ApprovalDetailWorksheet.pcf: line 65, column 54
    function def_refreshVariables_17 (def :  pcf.ApprovalDetailDV_CheckSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on PanelRef at ApprovalDetailWorksheet.pcf: line 65, column 54
    function def_refreshVariables_19 (def :  pcf.ApprovalDetailDV_RecoveryReserveSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on PanelRef at ApprovalDetailWorksheet.pcf: line 65, column 54
    function def_refreshVariables_21 (def :  pcf.ApprovalDetailDV_RecoverySet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on PanelRef at ApprovalDetailWorksheet.pcf: line 65, column 54
    function def_refreshVariables_23 (def :  pcf.ApprovalDetailDV_ReserveSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'initialValue' attribute on Variable at ApprovalDetailWorksheet.pcf: line 26, column 23
    function initialValue_1 () : block() {
      return null
    }
    
    // 'location' attribute on Scope at ApprovalDetailWorksheet.pcf: line 16, column 32
    function location_0 () : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'mode' attribute on PanelRef at ApprovalDetailWorksheet.pcf: line 65, column 54
    function mode_24 () : java.lang.Object {
      return Activity.TransactionSet.Subtype.Code
    }
    
    // 'title' attribute on Worksheet (id=ApprovalDetailWorksheet) at ApprovalDetailWorksheet.pcf: line 12, column 115
    static function title_27 (Activity :  Activity, Claim :  Claim) : java.lang.Object {
      return DisplayKey.get("JSP.ApprovalActivityDetailHeader.Detail.Title", Activity.Claim.ClaimNumber)
    }
    
    // 'visible' attribute on ToolbarButton (id=ApprovalDetailWorksheet_ViewReserveRequestButton) at ApprovalDetailWorksheet.pcf: line 55, column 46
    function visible_11 () : java.lang.Boolean {
      return reserveButtonsVisible()
    }
    
    // 'visible' attribute on ToolbarButton (id=ApprovalDetailWorksheet_ApproveButton) at ApprovalDetailWorksheet.pcf: line 34, column 44
    function visible_2 () : java.lang.Boolean {
      return Activity.canApprove()
    }
    
    // 'visible' attribute on ToolbarButton (id=ApprovalDetailWorksheet_ViewCheckButton) at ApprovalDetailWorksheet.pcf: line 49, column 149
    function visible_8 () : java.lang.Boolean {
      return (Activity.TransactionSet.Subtype == TC_CHECKSET ? perm.Payment.view((Activity.TransactionSet as CheckSet).PrimaryCheck):false)
    }
    
    property get Activity () : Activity {
      return getVariableValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setVariableValue("Activity", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ApprovalDetailWorksheet {
      return super.CurrentLocation as pcf.ApprovalDetailWorksheet
    }
    
    property get beforeCommitAction () : block() {
      return getVariableValue("beforeCommitAction", 0) as block()
    }
    
    property set beforeCommitAction ($arg :  block()) {
      setVariableValue("beforeCommitAction", 0, $arg)
    }
    
    function reserveButtonsAvailable() : boolean {
      return reserveButtonsVisible() and not Activity.Claim.Closed
    }
    function reserveButtonsVisible() : boolean {
      return Activity.TransactionSet typeis ReserveSet and 
             Activity.TransactionSet.AllTransactions.length > 0 and 
             perm.Reserve.edit(Activity.TransactionSet.AllTransactions[0])
    }
    
    
  }
  
  
}