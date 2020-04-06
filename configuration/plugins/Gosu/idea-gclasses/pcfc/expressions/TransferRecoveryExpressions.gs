package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransferRecoveryExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransferRecoveryExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (originalRecovery :  Recovery) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=TransferButton) at TransferRecovery.pcf: line 42, column 90
    function action_4 () : void {
      doTransfer()
    }
    
    // 'pickLocation' attribute on PickerInput (id=Claim) at TransferRecovery.pcf: line 61, column 43
    function action_7 () : void {
      ClaimSearchPopup.push()
    }
    
    // 'pickLocation' attribute on PickerInput (id=Claim) at TransferRecovery.pcf: line 61, column 43
    function action_dest_8 () : pcf.api.Destination {
      return pcf.ClaimSearchPopup.createDestination()
    }
    
    // 'afterCancel' attribute on Page (id=TransferRecovery) at TransferRecovery.pcf: line 15, column 68
    function afterCancel_27 () : void {
      ClaimFinancialsTransactionsDetail.go(claim, originalRecovery)
    }
    
    // 'afterCancel' attribute on Page (id=TransferRecovery) at TransferRecovery.pcf: line 15, column 68
    function afterCancel_dest_28 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(claim, originalRecovery)
    }
    
    // 'afterCommit' attribute on Page (id=TransferRecovery) at TransferRecovery.pcf: line 15, column 68
    function afterCommit_29 (TopLocation :  pcf.api.Location) : void {
      ClaimFinancialsTransactions.go(claim, gw.api.financials.ClaimFinancialsTransactionsOption.RECOVERY)
    }
    
    // 'afterEnter' attribute on Page (id=TransferRecovery) at TransferRecovery.pcf: line 15, column 68
    function afterEnter_30 () : void {
      afterEnter()
    }
    
    // 'beforeCommit' attribute on Page (id=TransferRecovery) at TransferRecovery.pcf: line 15, column 68
    function beforeCommit_31 (pickedValue :  java.lang.Object) : void {
      gw.api.system.bundle.BundleCommitCondition.verify(onsetRecovery)
    }
    
    // 'conversionExpression' attribute on PickerInput (id=Claim) at TransferRecovery.pcf: line 61, column 43
    function conversionExpression_10 (PickedValue :  Object) : entity.ClaimInfo {
      return (PickedValue as ClaimSearchView).Claim.ClaimInfo
    }
    
    // 'def' attribute on InputSetRef at TransferRecovery.pcf: line 63, column 82
    function def_onEnter_13 (def :  pcf.ReserveLineInputSet) : void {
      def.onEnter(onsetRecovery, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on ListViewInput at TransferRecovery.pcf: line 75, column 31
    function def_onEnter_22 (def :  pcf.EditableRecodeLineItemsLV) : void {
      def.onEnter(onsetRecovery)
    }
    
    // 'def' attribute on InputSetRef at TransferRecovery.pcf: line 87, column 126
    function def_onEnter_25 (def :  pcf.TransactionExchangeRateInputSet) : void {
      def.onEnter(onsetRecovery)
    }
    
    // 'def' attribute on InputSetRef at TransferRecovery.pcf: line 63, column 82
    function def_refreshVariables_14 (def :  pcf.ReserveLineInputSet) : void {
      def.refreshVariables(onsetRecovery, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on ListViewInput at TransferRecovery.pcf: line 75, column 31
    function def_refreshVariables_23 (def :  pcf.EditableRecodeLineItemsLV) : void {
      def.refreshVariables(onsetRecovery)
    }
    
    // 'def' attribute on InputSetRef at TransferRecovery.pcf: line 87, column 126
    function def_refreshVariables_26 (def :  pcf.TransactionExchangeRateInputSet) : void {
      def.refreshVariables(onsetRecovery)
    }
    
    // 'value' attribute on PickerInput (id=Claim) at TransferRecovery.pcf: line 61, column 43
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      targetClaimInfo = (__VALUE_TO_SET as entity.ClaimInfo)
    }
    
    // 'value' attribute on TextInput (id=Comments) at TransferRecovery.pcf: line 69, column 45
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      onsetRecovery.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on ListViewInput at TransferRecovery.pcf: line 75, column 31
    function editable_21 () : java.lang.Boolean {
      return onsetRecovery.ReserveLine != null
    }
    
    // 'initialValue' attribute on Variable at TransferRecovery.pcf: line 24, column 24
    function initialValue_0 () : Recovery {
      return originalRecovery.createOnsetRecovery()
    }
    
    // 'initialValue' attribute on Variable at TransferRecovery.pcf: line 28, column 59
    function initialValue_1 () : gw.api.financials.ReserveLineInputSetHelper {
      return gw.api.financials.ReserveLineInputSetStrategyForRecovery.newHelper(originalRecovery.TransToReservingExchangeRate)
    }
    
    // 'initialValue' attribute on Variable at TransferRecovery.pcf: line 32, column 21
    function initialValue_2 () : Claim {
      return originalRecovery.Claim
    }
    
    // 'initialValue' attribute on Variable at TransferRecovery.pcf: line 36, column 25
    function initialValue_3 () : ClaimInfo {
      return null
    }
    
    // EditButtons at TransferRecovery.pcf: line 47, column 34
    function label_5 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'onPick' attribute on PickerInput (id=Claim) at TransferRecovery.pcf: line 61, column 43
    function onPick_9 (PickedValue :  Object) : void {
      resetRecoveryFields()
    }
    
    // 'onResume' attribute on Page (id=TransferRecovery) at TransferRecovery.pcf: line 15, column 68
    function onResume_32 () : void {
      gw.api.system.bundle.BundleCommitCondition.verify(onsetRecovery)
    }
    
    // 'parent' attribute on Page (id=TransferRecovery) at TransferRecovery.pcf: line 15, column 68
    static function parent_33 (originalRecovery :  Recovery) : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(originalRecovery.Claim, originalRecovery)
    }
    
    // 'value' attribute on TextInput (id=Comments) at TransferRecovery.pcf: line 69, column 45
    function valueRoot_18 () : java.lang.Object {
      return onsetRecovery
    }
    
    // 'value' attribute on TextInput (id=Comments) at TransferRecovery.pcf: line 69, column 45
    function value_15 () : java.lang.String {
      return onsetRecovery.Comments
    }
    
    // 'value' attribute on PickerInput (id=Claim) at TransferRecovery.pcf: line 61, column 43
    function value_6 () : entity.ClaimInfo {
      return targetClaimInfo
    }
    
    // 'addVisible' attribute on IteratorButtons at TransferRecovery.pcf: line 82, column 94
    function visible_19 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isAllowMultipleLineItems()
    }
    
    // 'visible' attribute on InputSetRef at TransferRecovery.pcf: line 87, column 126
    function visible_24 () : java.lang.Boolean {
      return onsetRecovery.ReservingCurrency != null and onsetRecovery.Currency != onsetRecovery.ReservingCurrency
    }
    
    override property get CurrentLocation () : pcf.TransferRecovery {
      return super.CurrentLocation as pcf.TransferRecovery
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get onsetRecovery () : Recovery {
      return getVariableValue("onsetRecovery", 0) as Recovery
    }
    
    property set onsetRecovery ($arg :  Recovery) {
      setVariableValue("onsetRecovery", 0, $arg)
    }
    
    property get originalRecovery () : Recovery {
      return getVariableValue("originalRecovery", 0) as Recovery
    }
    
    property set originalRecovery ($arg :  Recovery) {
      setVariableValue("originalRecovery", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getVariableValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setVariableValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    property get targetClaimInfo () : ClaimInfo {
      return getVariableValue("targetClaimInfo", 0) as ClaimInfo
    }
    
    property set targetClaimInfo ($arg :  ClaimInfo) {
      setVariableValue("targetClaimInfo", 0, $arg)
    }
    
    function resetRecoveryFields() {
      onsetRecovery.Claim = targetClaimInfo.Claim
      onsetRecovery.Exposure = null
      onsetRecovery.CostType = null
      onsetRecovery.CostCategory = null
      if (onsetRecovery.Claim.Currency == originalRecovery.Claim.Currency) {
        onsetRecovery.TransToClaimExchangeRate = originalRecovery.TransToClaimExchangeRate
      }
      
      // This line may appear to be totally bogus, but it's apparently a necessary evil required for forcing recalculation 
      // of various rates and amounts set on the Recovery.
      onsetRecovery.Currency = onsetRecovery.Currency
      onsetRecovery.ReservingCurrency = onsetRecovery.Claim.Currency
      onsetRecovery.Claim.freezeCurrency()
    }
    
    function doTransfer() {
      gw.api.util.CCLocationUtil.runAndCommit(\ -> originalRecovery.transfer(), CurrentLocation)
    }
    
    function afterEnter() {
      onsetRecovery.Claim = null; 
      onsetRecovery.ReserveLine = null; 
      onsetRecovery.Exposure = null; 
      onsetRecovery.CostType = null; 
      onsetRecovery.CostCategory = null
    }
    
    
  }
  
  
}