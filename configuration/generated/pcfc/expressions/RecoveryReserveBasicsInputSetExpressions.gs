package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecoveryReserveBasicsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecoveryReserveBasicsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecoveryReserveBasicsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryReserveBasicsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at RecoveryReserveBasicsInputSet.pcf: line 59, column 25
    function def_onEnter_28 (def :  pcf.TransactionExchangeRateInputSet) : void {
      def.onEnter(recoveryReserve)
    }
    
    // 'def' attribute on InputSetRef at RecoveryReserveBasicsInputSet.pcf: line 59, column 25
    function def_refreshVariables_29 (def :  pcf.TransactionExchangeRateInputSet) : void {
      def.refreshVariables(recoveryReserve)
    }
    
    // 'value' attribute on CurrencyInput (id=OpenRecoveryReserves) at RecoveryReserveBasicsInputSet.pcf: line 50, column 142
    function valueRoot_24 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getOpenRecoveryReserves().withRecoveryCoding(recoveryReserve.Coding)
    }
    
    // 'value' attribute on TypeKeyInput (id=Coverage) at RecoveryReserveBasicsInputSet.pcf: line 20, column 41
    function valueRoot_4 () : java.lang.Object {
      return recoveryReserve.Exposure
    }
    
    // 'value' attribute on TypeKeyInput (id=CostType) at RecoveryReserveBasicsInputSet.pcf: line 25, column 37
    function valueRoot_7 () : java.lang.Object {
      return recoveryReserve
    }
    
    // 'value' attribute on TextInput (id=Exposure) at RecoveryReserveBasicsInputSet.pcf: line 15, column 165
    function value_0 () : java.lang.String {
      return recoveryReserve.Exposure.DisplayName == null ? DisplayKey.get("Web.Financials.Exposure.ClaimLevel") : recoveryReserve.Exposure.DisplayName
    }
    
    // 'value' attribute on TypeKeyInput (id=ReservingCurrency) at RecoveryReserveBasicsInputSet.pcf: line 36, column 70
    function value_12 () : typekey.Currency {
      return recoveryReserve.ReservingCurrency
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryCategory) at RecoveryReserveBasicsInputSet.pcf: line 41, column 45
    function value_16 () : typekey.RecoveryCategory {
      return recoveryReserve.RecoveryCategory
    }
    
    // 'value' attribute on TextInput (id=Comments) at RecoveryReserveBasicsInputSet.pcf: line 45, column 41
    function value_19 () : java.lang.String {
      return recoveryReserve.Comments
    }
    
    // 'value' attribute on TypeKeyInput (id=Coverage) at RecoveryReserveBasicsInputSet.pcf: line 20, column 41
    function value_2 () : typekey.CoverageType {
      return recoveryReserve.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on CurrencyInput (id=OpenRecoveryReserves) at RecoveryReserveBasicsInputSet.pcf: line 50, column 142
    function value_22 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getOpenRecoveryReserves().withRecoveryCoding(recoveryReserve.Coding).ReservingAmount
    }
    
    // 'value' attribute on CurrencyInput (id=Amount) at RecoveryReserveBasicsInputSet.pcf: line 56, column 51
    function value_25 () : gw.api.financials.IPairedMoney {
      return recoveryReserve.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on TypeKeyInput (id=CostType) at RecoveryReserveBasicsInputSet.pcf: line 25, column 37
    function value_5 () : typekey.CostType {
      return recoveryReserve.CostType
    }
    
    // 'value' attribute on TypeKeyInput (id=CostCategory) at RecoveryReserveBasicsInputSet.pcf: line 30, column 41
    function value_8 () : typekey.CostCategory {
      return recoveryReserve.CostCategory
    }
    
    // 'visible' attribute on TypeKeyInput (id=ReservingCurrency) at RecoveryReserveBasicsInputSet.pcf: line 36, column 70
    function visible_11 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get recoveryReserve () : RecoveryReserve {
      return getRequireValue("recoveryReserve", 0) as RecoveryReserve
    }
    
    property set recoveryReserve ($arg :  RecoveryReserve) {
      setRequireValue("recoveryReserve", 0, $arg)
    }
    
    
  }
  
  
}