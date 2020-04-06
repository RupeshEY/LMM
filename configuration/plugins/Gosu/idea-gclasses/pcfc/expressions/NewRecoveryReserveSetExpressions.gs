package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewRecoveryReserveSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRecoveryReserveSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at NewRecoveryReserveSet.pcf: line 61, column 43
    function action_6 () : void {
      PickExistingDocumentPopup.push(Claim)
    }
    
    // 'action' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at NewRecoveryReserveSet.pcf: line 61, column 43
    function action_dest_7 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(Claim)
    }
    
    // 'afterCancel' attribute on Page (id=NewRecoveryReserveSet) at NewRecoveryReserveSet.pcf: line 17, column 93
    function afterCancel_11 () : void {
      ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'afterCancel' attribute on Page (id=NewRecoveryReserveSet) at NewRecoveryReserveSet.pcf: line 17, column 93
    function afterCancel_dest_12 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactions.createDestination(Claim)
    }
    
    // 'afterCommit' attribute on Page (id=NewRecoveryReserveSet) at NewRecoveryReserveSet.pcf: line 17, column 93
    function afterCommit_13 (TopLocation :  pcf.api.Location) : void {
      ClaimFinancialsTransactions.go(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.RECOVERY_RESERVE)
    }
    
    // 'afterEnter' attribute on Page (id=NewRecoveryReserveSet) at NewRecoveryReserveSet.pcf: line 17, column 93
    function afterEnter_14 () : void {
      afterEnter()
    }
    
    // 'available' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at NewRecoveryReserveSet.pcf: line 61, column 43
    function available_4 () : java.lang.Boolean {
      return documentActionsUIHelper.DocumentMetadataActionsAvailable
    }
    
    // 'beforeCommit' attribute on Page (id=NewRecoveryReserveSet) at NewRecoveryReserveSet.pcf: line 17, column 93
    function beforeCommit_15 (pickedValue :  java.lang.Object) : void {
      beforeCommit()
    }
    
    // 'canVisit' attribute on Page (id=NewRecoveryReserveSet) at NewRecoveryReserveSet.pcf: line 17, column 93
    static function canVisit_16 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.createrecoveryreserve(Claim) and perm.Claim.viewrecoveryreserves(Claim)
    }
    
    // 'def' attribute on PanelRef at NewRecoveryReserveSet.pcf: line 66, column 54
    function def_onEnter_9 (def :  pcf.RecoveryReservesSummaryDV) : void {
      def.onEnter(PageHelper)
    }
    
    // 'def' attribute on PanelRef at NewRecoveryReserveSet.pcf: line 66, column 54
    function def_refreshVariables_10 (def :  pcf.RecoveryReservesSummaryDV) : void {
      def.refreshVariables(PageHelper)
    }
    
    // 'initialValue' attribute on Variable at NewRecoveryReserveSet.pcf: line 23, column 61
    function initialValue_0 () : gw.api.financials.RecoveryReserveWizardHelper {
      return new gw.api.financials.RecoveryReserveWizardHelper()
    }
    
    // 'initialValue' attribute on Variable at NewRecoveryReserveSet.pcf: line 31, column 37
    function initialValue_1 () : entity.TransactionSet {
      return PageHelper.WorkingTransactionSet
    }
    
    // 'initialValue' attribute on Variable at NewRecoveryReserveSet.pcf: line 36, column 32
    function initialValue_2 () : java.lang.Object {
      return RecoveryReserveSet
    }
    
    // 'initialValue' attribute on Variable at NewRecoveryReserveSet.pcf: line 40, column 52
    function initialValue_3 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at NewRecoveryReserveSet.pcf: line 61, column 43
    function onPick_8 (PickedValue :  Document) : void {
      gw.api.financials.TransactionSetLinkDocumentHelper.linkDocument(PickedValue, PageHelper.WorkingTransactionSet)
    }
    
    // 'onResume' attribute on Page (id=NewRecoveryReserveSet) at NewRecoveryReserveSet.pcf: line 17, column 93
    function onResume_17 () : void {
      gw.api.system.bundle.BundleCommitCondition.verify(Claim)
    }
    
    // 'parent' attribute on Page (id=NewRecoveryReserveSet) at NewRecoveryReserveSet.pcf: line 17, column 93
    static function parent_18 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'visible' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at NewRecoveryReserveSet.pcf: line 61, column 43
    function visible_5 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewRecoveryReserveSet {
      return super.CurrentLocation as pcf.NewRecoveryReserveSet
    }
    
    property get PageHelper () : gw.api.financials.RecoveryReserveWizardHelper {
      return getVariableValue("PageHelper", 0) as gw.api.financials.RecoveryReserveWizardHelper
    }
    
    property set PageHelper ($arg :  gw.api.financials.RecoveryReserveWizardHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get RecoveryReserveSet () : entity.TransactionSet {
      return getVariableValue("RecoveryReserveSet", 0) as entity.TransactionSet
    }
    
    property set RecoveryReserveSet ($arg :  entity.TransactionSet) {
      setVariableValue("RecoveryReserveSet", 0, $arg)
    }
    
    property get TransactionSet () : java.lang.Object {
      return getVariableValue("TransactionSet", 0) as java.lang.Object
    }
    
    property set TransactionSet ($arg :  java.lang.Object) {
      setVariableValue("TransactionSet", 0, $arg)
    }
    
    property get documentActionsUIHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentActionsUIHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentActionsUIHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentActionsUIHelper", 0, $arg)
    }
    
    function afterEnter() {
      if (PageHelper.getTransactionWrappers().length == 0) {
        PageHelper.initializeTransactionSet(Claim);    
      }                 
      PageHelper.updateTransactionSet(Claim);
      Claim.freezeCurrency()
    }
    
    function beforeCommit() { 
      gw.api.system.bundle.BundleCommitCondition.verify(Claim)
      PageHelper.beforeCommit()
    }
    
    
  }
  
  
}