package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionBasicsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionBasicsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionBasicsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionBasicsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at TransactionBasicsInputSet.pcf: line 54, column 25
    function def_onEnter_25 (def :  pcf.TransactionExchangeRateInputSet) : void {
      def.onEnter(Transaction)
    }
    
    // 'def' attribute on InputSetRef at TransactionBasicsInputSet.pcf: line 54, column 25
    function def_refreshVariables_26 (def :  pcf.TransactionExchangeRateInputSet) : void {
      def.refreshVariables(Transaction)
    }
    
    // 'value' attribute on CurrencyInput (id=OpenReserves) at TransactionBasicsInputSet.pcf: line 45, column 132
    function valueRoot_21 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withReserveLine(Transaction.ReserveLine)
    }
    
    // 'value' attribute on TypeKeyInput (id=Coverage) at TransactionBasicsInputSet.pcf: line 20, column 41
    function valueRoot_4 () : java.lang.Object {
      return Transaction.Exposure
    }
    
    // 'value' attribute on TypeKeyInput (id=CostType) at TransactionBasicsInputSet.pcf: line 25, column 37
    function valueRoot_7 () : java.lang.Object {
      return Transaction
    }
    
    // 'value' attribute on TextInput (id=Exposure) at TransactionBasicsInputSet.pcf: line 15, column 157
    function value_0 () : java.lang.String {
      return Transaction.Exposure.DisplayName == null ? DisplayKey.get("Web.Financials.Exposure.ClaimLevel") : Transaction.Exposure.DisplayName
    }
    
    // 'value' attribute on TypeKeyInput (id=ReservingCurrency) at TransactionBasicsInputSet.pcf: line 36, column 70
    function value_12 () : typekey.Currency {
      return Transaction.ReservingCurrency
    }
    
    // 'value' attribute on TextInput (id=Comments) at TransactionBasicsInputSet.pcf: line 40, column 37
    function value_16 () : java.lang.String {
      return Transaction.Comments
    }
    
    // 'value' attribute on CurrencyInput (id=OpenReserves) at TransactionBasicsInputSet.pcf: line 45, column 132
    function value_19 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withReserveLine(Transaction.ReserveLine).ReservingAmount
    }
    
    // 'value' attribute on TypeKeyInput (id=Coverage) at TransactionBasicsInputSet.pcf: line 20, column 41
    function value_2 () : typekey.CoverageType {
      return Transaction.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on CurrencyInput (id=Amount) at TransactionBasicsInputSet.pcf: line 51, column 51
    function value_22 () : gw.api.financials.IPairedMoney {
      return Transaction.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on TypeKeyInput (id=CostType) at TransactionBasicsInputSet.pcf: line 25, column 37
    function value_5 () : typekey.CostType {
      return Transaction.CostType
    }
    
    // 'value' attribute on TypeKeyInput (id=CostCategory) at TransactionBasicsInputSet.pcf: line 30, column 41
    function value_8 () : typekey.CostCategory {
      return Transaction.CostCategory
    }
    
    // 'visible' attribute on TypeKeyInput (id=ReservingCurrency) at TransactionBasicsInputSet.pcf: line 36, column 70
    function visible_11 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get Transaction () : Transaction {
      return getRequireValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setRequireValue("Transaction", 0, $arg)
    }
    
    
  }
  
  
}