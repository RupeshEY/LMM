package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/TransactionEditWrapperExchangeRateInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionEditWrapperExchangeRateInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/shared/TransactionEditWrapperExchangeRateInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionEditWrapperExchangeRateInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=ExchangeRate) at TransactionEditWrapperExchangeRateInputSet.pcf: line 32, column 40
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      transactionEditWrapper.ExchangeRateRate = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=Description) at TransactionEditWrapperExchangeRateInputSet.pcf: line 39, column 85
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      transaction.TransToReservingExchangeRate.ExchangeRateSet.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ManualOrAutomatic) at TransactionEditWrapperExchangeRateInputSet.pcf: line 21, column 59
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      transactionEditWrapper.OverrideExchangeRate = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=ManualOrAutomatic) at TransactionEditWrapperExchangeRateInputSet.pcf: line 21, column 59
    function editable_1 () : java.lang.Boolean {
      return perm.ExchangeRate.edit
    }
    
    // 'editable' attribute on TextInput (id=ExchangeRate) at TransactionEditWrapperExchangeRateInputSet.pcf: line 32, column 40
    function editable_7 () : java.lang.Boolean {
      return transaction.OverrideTransToReservingExchangeRate
    }
    
    // 'format' attribute on TextInput (id=ExchangeRate) at TransactionEditWrapperExchangeRateInputSet.pcf: line 32, column 40
    function format_10 () : java.lang.String {
      var rate = transaction.TransToReservingExchangeRate; return "1 " + rate.BaseCurrency.DisplayName + " = #.###### " + rate.PriceCurrency.DisplayName;
    }
    
    // 'initialValue' attribute on Variable at TransactionEditWrapperExchangeRateInputSet.pcf: line 14, column 27
    function initialValue_0 () : Transaction {
      return transactionEditWrapper.Transaction
    }
    
    // 'value' attribute on TextInput (id=Description) at TransactionEditWrapperExchangeRateInputSet.pcf: line 39, column 85
    function valueRoot_19 () : java.lang.Object {
      return transaction.TransToReservingExchangeRate.ExchangeRateSet
    }
    
    // 'value' attribute on BooleanRadioInput (id=ManualOrAutomatic) at TransactionEditWrapperExchangeRateInputSet.pcf: line 21, column 59
    function valueRoot_6 () : java.lang.Object {
      return transactionEditWrapper
    }
    
    // 'value' attribute on TextInput (id=Description) at TransactionEditWrapperExchangeRateInputSet.pcf: line 39, column 85
    function value_15 () : java.lang.String {
      return transaction.TransToReservingExchangeRate.ExchangeRateSet.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=ManualOrAutomatic) at TransactionEditWrapperExchangeRateInputSet.pcf: line 21, column 59
    function value_2 () : java.lang.Boolean {
      return transactionEditWrapper.OverrideExchangeRate
    }
    
    // 'value' attribute on DateInput (id=Date) at TransactionEditWrapperExchangeRateInputSet.pcf: line 43, column 87
    function value_20 () : java.util.Date {
      return transaction.TransToReservingExchangeRate.ExchangeRateSet.EffectiveDate
    }
    
    // 'value' attribute on TextInput (id=ExchangeRate) at TransactionEditWrapperExchangeRateInputSet.pcf: line 32, column 40
    function value_8 () : java.math.BigDecimal {
      return transactionEditWrapper.ExchangeRateRate
    }
    
    // 'visible' attribute on InputSet (id=TransactionEditWrapperExchangeRateInputSet) at TransactionEditWrapperExchangeRateInputSet.pcf: line 7, column 120
    function visible_23 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode() and transaction.Currency != transaction.ReservingCurrency
    }
    
    property get transaction () : Transaction {
      return getVariableValue("transaction", 0) as Transaction
    }
    
    property set transaction ($arg :  Transaction) {
      setVariableValue("transaction", 0, $arg)
    }
    
    property get transactionEditWrapper () : TransactionEditWrapper {
      return getRequireValue("transactionEditWrapper", 0) as TransactionEditWrapper
    }
    
    property set transactionEditWrapper ($arg :  TransactionEditWrapper) {
      setRequireValue("transactionEditWrapper", 0, $arg)
    }
    
    
  }
  
  
}