package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/preferences/UserPreferencesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserPreferencesDVExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/preferences/UserPreferencesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserPreferencesDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=GlobalizationPreferences) at UserPreferencesDV.pcf: line 32, column 40
    function def_onEnter_23 (def :  pcf.UserPreferencesInputSet) : void {
      def.onEnter(User)
    }
    
    // 'def' attribute on InputSetRef (id=GlobalizationPreferences) at UserPreferencesDV.pcf: line 32, column 40
    function def_refreshVariables_24 (def :  pcf.UserPreferencesInputSet) : void {
      def.refreshVariables(User)
    }
    
    // 'value' attribute on RangeInput (id=StartupPage) at UserPreferencesDV.pcf: line 29, column 42
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.UserSettings.StartupPage = (__VALUE_TO_SET as typekey.StartupPage)
    }
    
    // 'value' attribute on ConfirmPasswordInput (id=Password) at UserPreferencesDV.pcf: line 20, column 43
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.Credential.Password = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=NumClaims) at UserPreferencesDV.pcf: line 38, column 40
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.UserSettings.NumOpenClaims = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'valueRange' attribute on RangeInput (id=StartupPage) at UserPreferencesDV.pcf: line 29, column 42
    function valueRange_20 () : java.lang.Object {
      return User.VisibleStartupPages
    }
    
    // 'value' attribute on RangeInput (id=StartupPage) at UserPreferencesDV.pcf: line 29, column 42
    function valueRoot_19 () : java.lang.Object {
      return User.UserSettings
    }
    
    // 'value' attribute on ConfirmPasswordInput (id=Password) at UserPreferencesDV.pcf: line 20, column 43
    function valueRoot_3 () : java.lang.Object {
      return User.Credential
    }
    
    // 'value' attribute on ConfirmPasswordInput (id=Password) at UserPreferencesDV.pcf: line 20, column 43
    function value_0 () : java.lang.String {
      return User.Credential.Password
    }
    
    // 'value' attribute on RangeInput (id=StartupPage) at UserPreferencesDV.pcf: line 29, column 42
    function value_16 () : typekey.StartupPage {
      return User.UserSettings.StartupPage
    }
    
    // 'value' attribute on TextInput (id=NumClaims) at UserPreferencesDV.pcf: line 38, column 40
    function value_25 () : java.lang.Integer {
      return User.UserSettings.NumOpenClaims
    }
    
    // 'valueRange' attribute on RangeInput (id=StartupPage) at UserPreferencesDV.pcf: line 29, column 42
    function verifyValueRangeIsAllowedType_21 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=StartupPage) at UserPreferencesDV.pcf: line 29, column 42
    function verifyValueRangeIsAllowedType_21 ($$arg :  typekey.StartupPage[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=StartupPage) at UserPreferencesDV.pcf: line 29, column 42
    function verifyValueRange_22 () : void {
      var __valueRangeArg = User.VisibleStartupPages
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_21(__valueRangeArg)
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    
  }
  
  
}