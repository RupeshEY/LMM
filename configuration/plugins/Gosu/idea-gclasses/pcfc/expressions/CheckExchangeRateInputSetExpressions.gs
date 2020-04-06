package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/CheckExchangeRateInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckExchangeRateInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/shared/CheckExchangeRateInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckExchangeRateInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Transaction_ExchangeRate) at CheckExchangeRateInputSet.pcf: line 34, column 40
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.TransToReservingExchangeRateRate = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=Transaction_RateSet_Description) at CheckExchangeRateInputSet.pcf: line 41, column 79
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.TransToReservingExchangeRate.ExchangeRateSet.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Transaction_ExchangeRateOverride) at CheckExchangeRateInputSet.pcf: line 23, column 58
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.OverrideTransToReservingExchangeRate = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=Transaction_ExchangeRateOverride) at CheckExchangeRateInputSet.pcf: line 23, column 58
    function editable_2 () : java.lang.Boolean {
      return perm.ExchangeRate.edit
    }
    
    // 'format' attribute on TextInput (id=Transaction_ExchangeRate) at CheckExchangeRateInputSet.pcf: line 34, column 40
    function format_11 () : java.lang.String {
      var rate = check.TransToReservingExchangeRate; return "1 " + rate.BaseCurrency.DisplayName + " = #.###### " + rate.PriceCurrency.DisplayName;
    }
    
    // 'label' attribute on Label at CheckExchangeRateInputSet.pcf: line 16, column 38
    function label_1 () : java.lang.String {
      return widgetLabel
    }
    
    // 'value' attribute on TextInput (id=Transaction_RateSet_Description) at CheckExchangeRateInputSet.pcf: line 41, column 79
    function valueRoot_20 () : java.lang.Object {
      return check.TransToReservingExchangeRate.ExchangeRateSet
    }
    
    // 'value' attribute on BooleanRadioInput (id=Transaction_ExchangeRateOverride) at CheckExchangeRateInputSet.pcf: line 23, column 58
    function valueRoot_7 () : java.lang.Object {
      return check
    }
    
    // 'value' attribute on TextInput (id=Transaction_RateSet_Description) at CheckExchangeRateInputSet.pcf: line 41, column 79
    function value_16 () : java.lang.String {
      return check.TransToReservingExchangeRate.ExchangeRateSet.Description
    }
    
    // 'value' attribute on DateInput (id=Transaction_RateSet_Date) at CheckExchangeRateInputSet.pcf: line 45, column 81
    function value_21 () : java.util.Date {
      return check.TransToReservingExchangeRate.ExchangeRateSet.EffectiveDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=Transaction_ExchangeRateOverride) at CheckExchangeRateInputSet.pcf: line 23, column 58
    function value_3 () : java.lang.Boolean {
      return check.OverrideTransToReservingExchangeRate
    }
    
    // 'value' attribute on TextInput (id=Transaction_ExchangeRate) at CheckExchangeRateInputSet.pcf: line 34, column 40
    function value_9 () : java.math.BigDecimal {
      return check.TransToReservingExchangeRateRate
    }
    
    // 'visible' attribute on Label at CheckExchangeRateInputSet.pcf: line 16, column 38
    function visible_0 () : java.lang.Boolean {
      return widgetLabel != null
    }
    
    // 'visible' attribute on InputSet (id=CheckExchangeRateInputSet) at CheckExchangeRateInputSet.pcf: line 7, column 108
    function visible_24 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode() and check.Currency != check.ReservingCurrency
    }
    
    property get check () : Check {
      return getRequireValue("check", 0) as Check
    }
    
    property set check ($arg :  Check) {
      setRequireValue("check", 0, $arg)
    }
    
    property get widgetLabel () : java.lang.String {
      return getRequireValue("widgetLabel", 0) as java.lang.String
    }
    
    property set widgetLabel ($arg :  java.lang.String) {
      setRequireValue("widgetLabel", 0, $arg)
    }
    
    
  }
  
  
}