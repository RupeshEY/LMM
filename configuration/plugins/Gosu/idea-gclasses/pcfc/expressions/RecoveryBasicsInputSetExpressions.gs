package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecoveryBasicsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecoveryBasicsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecoveryBasicsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryBasicsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at RecoveryBasicsInputSet.pcf: line 66, column 25
    function def_onEnter_34 (def :  pcf.TransactionExchangeRateInputSet) : void {
      def.onEnter(recovery)
    }
    
    // 'def' attribute on ListViewInput at RecoveryBasicsInputSet.pcf: line 69, column 103
    function def_onEnter_36 (def :  pcf.TransactionLineItemsLV) : void {
      def.onEnter(recovery)
    }
    
    // 'def' attribute on InputSetRef at RecoveryBasicsInputSet.pcf: line 66, column 25
    function def_refreshVariables_35 (def :  pcf.TransactionExchangeRateInputSet) : void {
      def.refreshVariables(recovery)
    }
    
    // 'def' attribute on ListViewInput at RecoveryBasicsInputSet.pcf: line 69, column 103
    function def_refreshVariables_37 (def :  pcf.TransactionLineItemsLV) : void {
      def.refreshVariables(recovery)
    }
    
    // 'value' attribute on TextInput (id=Comments) at RecoveryBasicsInputSet.pcf: line 57, column 34
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      recovery.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Coverage) at RecoveryBasicsInputSet.pcf: line 31, column 41
    function valueRoot_12 () : java.lang.Object {
      return recovery.Exposure
    }
    
    // 'value' attribute on TextInput (id=NVV_Financials_TransactionRecovery_Recovery_Payer) at RecoveryBasicsInputSet.pcf: line 16, column 35
    function valueRoot_2 () : java.lang.Object {
      return recovery
    }
    
    // 'value' attribute on TextInput (id=NVV_Financials_TransactionRecovery_Recovery_Payer) at RecoveryBasicsInputSet.pcf: line 16, column 35
    function value_0 () : entity.Contact {
      return recovery.Payer
    }
    
    // 'value' attribute on TypeKeyInput (id=Coverage) at RecoveryBasicsInputSet.pcf: line 31, column 41
    function value_10 () : typekey.CoverageType {
      return recovery.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyInput (id=CostType) at RecoveryBasicsInputSet.pcf: line 36, column 37
    function value_13 () : typekey.CostType {
      return recovery.CostType
    }
    
    // 'value' attribute on TypeKeyInput (id=CostCategory) at RecoveryBasicsInputSet.pcf: line 41, column 41
    function value_16 () : typekey.CostCategory {
      return recovery.CostCategory
    }
    
    // 'value' attribute on TypeKeyInput (id=ReservingCurrency) at RecoveryBasicsInputSet.pcf: line 47, column 70
    function value_20 () : typekey.Currency {
      return recovery.ReservingCurrency
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryCategory) at RecoveryBasicsInputSet.pcf: line 52, column 45
    function value_24 () : typekey.RecoveryCategory {
      return recovery.RecoveryCategory
    }
    
    // 'value' attribute on TextInput (id=Comments) at RecoveryBasicsInputSet.pcf: line 57, column 34
    function value_27 () : java.lang.String {
      return recovery.Comments
    }
    
    // 'value' attribute on CurrencyInput (id=Amount) at RecoveryBasicsInputSet.pcf: line 63, column 51
    function value_31 () : gw.api.financials.IPairedMoney {
      return recovery.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on TextInput (id=NVV_Financials_TransactionRecovery_Recovery_OnBehalfOf) at RecoveryBasicsInputSet.pcf: line 22, column 73
    function value_4 () : entity.Contact {
      return recovery.OnBehalfOf
    }
    
    // 'value' attribute on TextInput (id=Exposure) at RecoveryBasicsInputSet.pcf: line 26, column 151
    function value_8 () : java.lang.String {
      return recovery.Exposure.DisplayName == null ? DisplayKey.get("Web.Financials.Exposure.ClaimLevel") : recovery.Exposure.DisplayName
    }
    
    // 'visible' attribute on TypeKeyInput (id=ReservingCurrency) at RecoveryBasicsInputSet.pcf: line 47, column 70
    function visible_19 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    // 'visible' attribute on TextInput (id=NVV_Financials_TransactionRecovery_Recovery_OnBehalfOf) at RecoveryBasicsInputSet.pcf: line 22, column 73
    function visible_3 () : java.lang.Boolean {
      return recovery.RecoveryCategory == RecoveryCategory.TC_SUBRO
    }
    
    property get recovery () : Recovery {
      return getRequireValue("recovery", 0) as Recovery
    }
    
    property set recovery ($arg :  Recovery) {
      setRequireValue("recovery", 0, $arg)
    }
    
    
  }
  
  
}