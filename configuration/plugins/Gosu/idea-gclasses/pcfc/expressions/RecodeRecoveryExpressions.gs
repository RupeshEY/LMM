package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecodeRecoveryExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecodeRecoveryExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (originalRecovery :  Recovery) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=RecodeButton) at RecodeRecovery.pcf: line 35, column 86
    function action_3 () : void {
      doRecode()
    }
    
    // 'afterCancel' attribute on Page (id=RecodeRecovery) at RecodeRecovery.pcf: line 12, column 66
    function afterCancel_18 () : void {
      ClaimFinancialsTransactionsDetail.go(claim, originalRecovery)
    }
    
    // 'afterCancel' attribute on Page (id=RecodeRecovery) at RecodeRecovery.pcf: line 12, column 66
    function afterCancel_dest_19 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(claim, originalRecovery)
    }
    
    // 'afterCommit' attribute on Page (id=RecodeRecovery) at RecodeRecovery.pcf: line 12, column 66
    function afterCommit_20 (TopLocation :  pcf.api.Location) : void {
      ClaimFinancialsTransactions.go(claim, gw.api.financials.ClaimFinancialsTransactionsOption.RECOVERY)
    }
    
    // 'def' attribute on ListViewInput at RecodeRecovery.pcf: line 66, column 31
    function def_onEnter_16 (def :  pcf.EditableRecodeLineItemsLV) : void {
      def.onEnter(onsetRecovery)
    }
    
    // 'def' attribute on InputSetRef at RecodeRecovery.pcf: line 45, column 82
    function def_onEnter_5 (def :  pcf.ReserveLineInputSet) : void {
      def.onEnter(onsetRecovery, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on ListViewInput at RecodeRecovery.pcf: line 66, column 31
    function def_refreshVariables_17 (def :  pcf.EditableRecodeLineItemsLV) : void {
      def.refreshVariables(onsetRecovery)
    }
    
    // 'def' attribute on InputSetRef at RecodeRecovery.pcf: line 45, column 82
    function def_refreshVariables_6 (def :  pcf.ReserveLineInputSet) : void {
      def.refreshVariables(onsetRecovery, reserveLineInputSetHelper)
    }
    
    // 'value' attribute on TextInput (id=Comments) at RecodeRecovery.pcf: line 60, column 45
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      onsetRecovery.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryCategory) at RecodeRecovery.pcf: line 52, column 50
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      onsetRecovery.RecoveryCategory = (__VALUE_TO_SET as typekey.RecoveryCategory)
    }
    
    // 'editable' attribute on ListViewInput at RecodeRecovery.pcf: line 66, column 31
    function editable_15 () : java.lang.Boolean {
      return onsetRecovery.ReserveLine != null
    }
    
    // 'initialValue' attribute on Variable at RecodeRecovery.pcf: line 21, column 24
    function initialValue_0 () : Recovery {
      return originalRecovery.createOnsetRecovery()
    }
    
    // 'initialValue' attribute on Variable at RecodeRecovery.pcf: line 25, column 59
    function initialValue_1 () : gw.api.financials.ReserveLineInputSetHelper {
      return gw.api.financials.ReserveLineInputSetStrategyForRecoveryRecode.newHelper(originalRecovery.TransToReservingExchangeRate)
    }
    
    // 'initialValue' attribute on Variable at RecodeRecovery.pcf: line 29, column 21
    function initialValue_2 () : Claim {
      return originalRecovery.Claim
    }
    
    // EditButtons at RecodeRecovery.pcf: line 40, column 34
    function label_4 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=RecodeRecovery) at RecodeRecovery.pcf: line 12, column 66
    static function parent_21 (originalRecovery :  Recovery) : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(originalRecovery.Claim, originalRecovery)
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryCategory) at RecodeRecovery.pcf: line 52, column 50
    function valueRoot_10 () : java.lang.Object {
      return onsetRecovery
    }
    
    // 'value' attribute on TextInput (id=Comments) at RecodeRecovery.pcf: line 60, column 45
    function value_11 () : java.lang.String {
      return onsetRecovery.Comments
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryCategory) at RecodeRecovery.pcf: line 52, column 50
    function value_7 () : typekey.RecoveryCategory {
      return onsetRecovery.RecoveryCategory
    }
    
    override property get CurrentLocation () : pcf.RecodeRecovery {
      return super.CurrentLocation as pcf.RecodeRecovery
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
    
    
    function doRecode() {
      gw.api.util.CCLocationUtil.runAndCommit(\ -> originalRecovery.recode(), CurrentLocation)
    }
          
        
    
    
  }
  
  
}