package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recovery/NewRecoverySet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewRecoverySetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/recovery/NewRecoverySet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRecoverySetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (Claim :  Claim, Payment :  Payment) : int {
      return 1
    }
    
    // 'afterCancel' attribute on Page (id=NewRecoverySet) at NewRecoverySet.pcf: line 17, column 84
    function afterCancel_5 () : void {
      ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'afterCancel' attribute on Page (id=NewRecoverySet) at NewRecoverySet.pcf: line 17, column 84
    function afterCancel_dest_6 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactions.createDestination(Claim)
    }
    
    // 'afterCommit' attribute on Page (id=NewRecoverySet) at NewRecoverySet.pcf: line 17, column 84
    function afterCommit_7 (TopLocation :  pcf.api.Location) : void {
      ClaimFinancialsTransactions.go(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.RECOVERY)
    }
    
    // 'afterEnter' attribute on Page (id=NewRecoverySet) at NewRecoverySet.pcf: line 17, column 84
    function afterEnter_8 () : void {
      Claim.freezeCurrency()
    }
    
    // 'beforeCommit' attribute on Page (id=NewRecoverySet) at NewRecoverySet.pcf: line 17, column 84
    function beforeCommit_9 (pickedValue :  java.lang.Object) : void {
      beforeCommit()
    }
    
    // 'canVisit' attribute on Page (id=NewRecoverySet) at NewRecoverySet.pcf: line 17, column 84
    static function canVisit_10 (Claim :  Claim, Payment :  Payment) : java.lang.Boolean {
      return perm.Claim.createrecovery(Claim) and (Claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'def' attribute on PanelRef at NewRecoverySet.pcf: line 51, column 86
    function def_onEnter_3 (def :  pcf.RecoveryDetailDV) : void {
      def.onEnter(Recovery, reserveLineInputSetHelper, recoveryHelper)
    }
    
    // 'def' attribute on PanelRef at NewRecoverySet.pcf: line 51, column 86
    function def_refreshVariables_4 (def :  pcf.RecoveryDetailDV) : void {
      def.refreshVariables(Recovery, reserveLineInputSetHelper, recoveryHelper)
    }
    
    // 'initialValue' attribute on Variable at NewRecoverySet.pcf: line 31, column 24
    function initialValue_0 () : Recovery {
      return gw.api.financials.FinancialsUtil.newRecovery(Claim, Payment)
    }
    
    // 'initialValue' attribute on Variable at NewRecoverySet.pcf: line 35, column 48
    function initialValue_1 () : gw.api.financials.RecoveryHelper {
      return new gw.api.financials.RecoveryHelper(Recovery)
    }
    
    // 'initialValue' attribute on Variable at NewRecoverySet.pcf: line 39, column 59
    function initialValue_2 () : gw.api.financials.ReserveLineInputSetHelper {
      return gw.api.financials.ReserveLineInputSetStrategyForNewRecovery.newHelper(recoveryHelper)
    }
    
    // 'onResume' attribute on Page (id=NewRecoverySet) at NewRecoverySet.pcf: line 17, column 84
    function onResume_11 () : void {
      gw.api.system.bundle.BundleCommitCondition.verify(Claim)
    }
    
    // 'parent' attribute on Page (id=NewRecoverySet) at NewRecoverySet.pcf: line 17, column 84
    static function parent_12 (Claim :  Claim, Payment :  Payment) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewRecoverySet {
      return super.CurrentLocation as pcf.NewRecoverySet
    }
    
    property get Payment () : Payment {
      return getVariableValue("Payment", 0) as Payment
    }
    
    property set Payment ($arg :  Payment) {
      setVariableValue("Payment", 0, $arg)
    }
    
    property get Recovery () : Recovery {
      return getVariableValue("Recovery", 0) as Recovery
    }
    
    property set Recovery ($arg :  Recovery) {
      setVariableValue("Recovery", 0, $arg)
    }
    
    property get recoveryHelper () : gw.api.financials.RecoveryHelper {
      return getVariableValue("recoveryHelper", 0) as gw.api.financials.RecoveryHelper
    }
    
    property set recoveryHelper ($arg :  gw.api.financials.RecoveryHelper) {
      setVariableValue("recoveryHelper", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getVariableValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setVariableValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    function beforeCommit() {
      gw.api.system.bundle.BundleCommitCondition.verify(Claim)
      gw.api.financials.FinancialsUtil.preCommitRecovery(Recovery)
    }
    
    
  }
  
  
}