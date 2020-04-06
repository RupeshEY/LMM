package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableAuthorityLimitsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableAuthorityLimitsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableAuthorityLimitsLV.pcf: line 30, column 51
    function sortValue_0 (AuthorityLimit :  entity.AuthorityLimit) : java.lang.Object {
      return AuthorityLimit.LimitType
    }
    
    // 'value' attribute on RowIterator at EditableAuthorityLimitsLV.pcf: line 37, column 42
    function sortValue_1 (AuthorityLimit :  entity.AuthorityLimit) : java.lang.Object {
      return AuthorityLimit.PolicyType
    }
    
    // 'value' attribute on RowIterator at EditableAuthorityLimitsLV.pcf: line 48, column 45
    function sortValue_2 (AuthorityLimit :  entity.AuthorityLimit) : java.lang.Object {
      return AuthorityLimit.CoverageType
    }
    
    // 'value' attribute on RowIterator at EditableAuthorityLimitsLV.pcf: line 55, column 41
    function sortValue_3 (AuthorityLimit :  entity.AuthorityLimit) : java.lang.Object {
      return AuthorityLimit.CostType
    }
    
    // 'value' attribute on RowIterator at EditableAuthorityLimitsLV.pcf: line 63, column 47
    function sortValue_4 (AuthorityLimit :  entity.AuthorityLimit) : java.lang.Object {
      return AuthorityLimit.LimitAmount
    }
    
    // 'toAdd' attribute on RowIterator at EditableAuthorityLimitsLV.pcf: line 21, column 43
    function toAdd_26 (AuthorityLimit :  entity.AuthorityLimit) : void {
      user.AuthorityProfile.addToLimits(AuthorityLimit)
    }
    
    // 'toRemove' attribute on RowIterator at EditableAuthorityLimitsLV.pcf: line 21, column 43
    function toRemove_27 (AuthorityLimit :  entity.AuthorityLimit) : void {
      user.AuthorityProfile.removeFromLimits(AuthorityLimit)
    }
    
    // 'value' attribute on RowIterator at EditableAuthorityLimitsLV.pcf: line 21, column 43
    function value_28 () : entity.AuthorityLimit[] {
      return user.AuthorityProfile.Limits
    }
    
    property get user () : User {
      return getRequireValue("user", 0) as User
    }
    
    property set user ($arg :  User) {
      setRequireValue("user", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableAuthorityLimitsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType) at EditableAuthorityLimitsLV.pcf: line 37, column 42
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimit.PolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditableAuthorityLimitsLV.pcf: line 48, column 45
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimit.CoverageType = (__VALUE_TO_SET as typekey.CoverageType)
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at EditableAuthorityLimitsLV.pcf: line 55, column 41
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimit.CostType = (__VALUE_TO_SET as typekey.CostType)
    }
    
    // 'value' attribute on CurrencyCell (id=LimitAmount) at EditableAuthorityLimitsLV.pcf: line 63, column 47
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimit.LimitAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyCell (id=LimitType) at EditableAuthorityLimitsLV.pcf: line 30, column 51
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimit.LimitType = (__VALUE_TO_SET as typekey.AuthorityLimitType)
    }
    
    // 'onChange' attribute on PostOnChange at EditableAuthorityLimitsLV.pcf: line 40, column 33
    function onChange_9 () : void {
      gw.plugin.authoritylimits.AuthorityLimitsConfiguration.validateTypecodeHierarchy(AuthorityLimit)
    }
    
    // 'value' attribute on TypeKeyCell (id=LimitType) at EditableAuthorityLimitsLV.pcf: line 30, column 51
    function valueRoot_8 () : java.lang.Object {
      return AuthorityLimit
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType) at EditableAuthorityLimitsLV.pcf: line 37, column 42
    function value_10 () : typekey.PolicyType {
      return AuthorityLimit.PolicyType
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditableAuthorityLimitsLV.pcf: line 48, column 45
    function value_14 () : typekey.CoverageType {
      return AuthorityLimit.CoverageType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at EditableAuthorityLimitsLV.pcf: line 55, column 41
    function value_18 () : typekey.CostType {
      return AuthorityLimit.CostType
    }
    
    // 'value' attribute on CurrencyCell (id=LimitAmount) at EditableAuthorityLimitsLV.pcf: line 63, column 47
    function value_22 () : gw.api.financials.CurrencyAmount {
      return AuthorityLimit.LimitAmount
    }
    
    // 'value' attribute on TypeKeyCell (id=LimitType) at EditableAuthorityLimitsLV.pcf: line 30, column 51
    function value_5 () : typekey.AuthorityLimitType {
      return AuthorityLimit.LimitType
    }
    
    property get AuthorityLimit () : entity.AuthorityLimit {
      return getIteratedValue(1) as entity.AuthorityLimit
    }
    
    
  }
  
  
}