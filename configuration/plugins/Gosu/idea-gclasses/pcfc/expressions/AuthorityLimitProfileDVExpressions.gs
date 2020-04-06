package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AuthorityLimitProfileDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AuthorityLimitProfileDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AuthorityLimitProfileDV.pcf: line 29, column 66
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimitProfile.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextInput (id=Name) at AuthorityLimitProfileDV.pcf: line 16, column 45
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimitProfile.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Description) at AuthorityLimitProfileDV.pcf: line 21, column 52
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimitProfile.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RowIterator at AuthorityLimitProfileDV.pcf: line 58, column 57
    function sortValue_14 (AuthorityLimit :  entity.AuthorityLimit) : java.lang.Object {
      return AuthorityLimit.LimitType
    }
    
    // 'value' attribute on RowIterator at AuthorityLimitProfileDV.pcf: line 64, column 48
    function sortValue_15 (AuthorityLimit :  entity.AuthorityLimit) : java.lang.Object {
      return AuthorityLimit.PolicyType
    }
    
    // 'value' attribute on RowIterator at AuthorityLimitProfileDV.pcf: line 74, column 50
    function sortValue_16 (AuthorityLimit :  entity.AuthorityLimit) : java.lang.Object {
      return AuthorityLimit.CoverageType
    }
    
    // 'value' attribute on RowIterator at AuthorityLimitProfileDV.pcf: line 84, column 47
    function sortValue_17 (AuthorityLimit :  entity.AuthorityLimit) : java.lang.Object {
      return AuthorityLimit.CostType
    }
    
    // 'value' attribute on RowIterator at AuthorityLimitProfileDV.pcf: line 90, column 53
    function sortValue_18 (AuthorityLimit :  entity.AuthorityLimit) : java.lang.Object {
      return AuthorityLimit.LimitAmount
    }
    
    // 'toAdd' attribute on RowIterator at AuthorityLimitProfileDV.pcf: line 50, column 49
    function toAdd_41 (AuthorityLimit :  entity.AuthorityLimit) : void {
      AuthorityLimitProfile.addToLimits(AuthorityLimit)
    }
    
    // 'toRemove' attribute on RowIterator at AuthorityLimitProfileDV.pcf: line 50, column 49
    function toRemove_42 (AuthorityLimit :  entity.AuthorityLimit) : void {
      AuthorityLimitProfile.removeFromLimits(AuthorityLimit)
    }
    
    // 'validationExpression' attribute on ListViewInput at AuthorityLimitProfileDV.pcf: line 35, column 210
    function validationExpression_44 () : java.lang.Object {
      return !gw.plugin.authoritylimits.AuthorityLimitsConfiguration.resolveAuthorityLimits(AuthorityLimitProfile) ? gw.plugin.authoritylimits.AuthorityLimitsConfiguration.ErrorString : null
    }
    
    // 'value' attribute on TextInput (id=Name) at AuthorityLimitProfileDV.pcf: line 16, column 45
    function valueRoot_3 () : java.lang.Object {
      return AuthorityLimitProfile
    }
    
    // 'value' attribute on TextInput (id=Name) at AuthorityLimitProfileDV.pcf: line 16, column 45
    function value_0 () : java.lang.String {
      return AuthorityLimitProfile.Name
    }
    
    // 'value' attribute on TextInput (id=Description) at AuthorityLimitProfileDV.pcf: line 21, column 52
    function value_4 () : java.lang.String {
      return AuthorityLimitProfile.Description
    }
    
    // 'value' attribute on RowIterator at AuthorityLimitProfileDV.pcf: line 50, column 49
    function value_43 () : entity.AuthorityLimit[] {
      return AuthorityLimitProfile.Limits
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AuthorityLimitProfileDV.pcf: line 29, column 66
    function value_9 () : typekey.Currency {
      return AuthorityLimitProfile.Currency
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at AuthorityLimitProfileDV.pcf: line 29, column 66
    function visible_8 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    property get AuthorityLimitProfile () : AuthorityLimitProfile {
      return getRequireValue("AuthorityLimitProfile", 0) as AuthorityLimitProfile
    }
    
    property set AuthorityLimitProfile ($arg :  AuthorityLimitProfile) {
      setRequireValue("AuthorityLimitProfile", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AuthorityLimitProfileDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=LimitType) at AuthorityLimitProfileDV.pcf: line 58, column 57
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimit.LimitType = (__VALUE_TO_SET as typekey.AuthorityLimitType)
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType) at AuthorityLimitProfileDV.pcf: line 64, column 48
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimit.PolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at AuthorityLimitProfileDV.pcf: line 74, column 50
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimit.CoverageType = (__VALUE_TO_SET as typekey.CoverageType)
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at AuthorityLimitProfileDV.pcf: line 84, column 47
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimit.CostType = (__VALUE_TO_SET as typekey.CostType)
    }
    
    // 'value' attribute on CurrencyCell (id=LimitAmount) at AuthorityLimitProfileDV.pcf: line 90, column 53
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimit.LimitAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'onChange' attribute on PostOnChange at AuthorityLimitProfileDV.pcf: line 67, column 39
    function onChange_23 () : void {
      gw.plugin.authoritylimits.AuthorityLimitsConfiguration.validateTypecodeHierarchy(AuthorityLimit)
    }
    
    // 'onChange' attribute on PostOnChange at AuthorityLimitProfileDV.pcf: line 77, column 39
    function onChange_28 () : void {
      gw.plugin.authoritylimits.AuthorityLimitsConfiguration.validateTypecodeHierarchy(AuthorityLimit)
    }
    
    // 'value' attribute on TypeKeyCell (id=LimitType) at AuthorityLimitProfileDV.pcf: line 58, column 57
    function valueRoot_22 () : java.lang.Object {
      return AuthorityLimit
    }
    
    // 'value' attribute on TypeKeyCell (id=LimitType) at AuthorityLimitProfileDV.pcf: line 58, column 57
    function value_19 () : typekey.AuthorityLimitType {
      return AuthorityLimit.LimitType
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType) at AuthorityLimitProfileDV.pcf: line 64, column 48
    function value_24 () : typekey.PolicyType {
      return AuthorityLimit.PolicyType
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at AuthorityLimitProfileDV.pcf: line 74, column 50
    function value_29 () : typekey.CoverageType {
      return AuthorityLimit.CoverageType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at AuthorityLimitProfileDV.pcf: line 84, column 47
    function value_33 () : typekey.CostType {
      return AuthorityLimit.CostType
    }
    
    // 'value' attribute on CurrencyCell (id=LimitAmount) at AuthorityLimitProfileDV.pcf: line 90, column 53
    function value_37 () : gw.api.financials.CurrencyAmount {
      return AuthorityLimit.LimitAmount
    }
    
    property get AuthorityLimit () : entity.AuthorityLimit {
      return getIteratedValue(1) as entity.AuthorityLimit
    }
    
    
  }
  
  
}