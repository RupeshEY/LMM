package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/preferences/UserPreferencesInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserPreferencesInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/preferences/UserPreferencesInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserPreferencesInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=RegionalFormats) at UserPreferencesInputSet.pcf: line 23, column 59
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      user.UserLocale = (__VALUE_TO_SET as typekey.LocaleType)
    }
    
    // 'value' attribute on TypeKeyInput (id=DefaultCountry) at UserPreferencesInputSet.pcf: line 29, column 36
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      user.UserDefaultCountry = (__VALUE_TO_SET as typekey.Country)
    }
    
    // 'value' attribute on TypeKeyInput (id=DefaultPhoneCountry) at UserPreferencesInputSet.pcf: line 35, column 45
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      user.UserDefaultPhoneCountry = (__VALUE_TO_SET as typekey.PhoneCountryCode)
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at UserPreferencesInputSet.pcf: line 16, column 61
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      user.UserLanguage = (__VALUE_TO_SET as typekey.LanguageType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at UserPreferencesInputSet.pcf: line 16, column 61
    function valueRoot_5 () : java.lang.Object {
      return user
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at UserPreferencesInputSet.pcf: line 16, column 61
    function value_1 () : typekey.LanguageType {
      return user.UserLanguage
    }
    
    // 'value' attribute on TypeKeyInput (id=DefaultCountry) at UserPreferencesInputSet.pcf: line 29, column 36
    function value_12 () : typekey.Country {
      return user.UserDefaultCountry
    }
    
    // 'value' attribute on TypeKeyInput (id=DefaultPhoneCountry) at UserPreferencesInputSet.pcf: line 35, column 45
    function value_16 () : typekey.PhoneCountryCode {
      return user.UserDefaultPhoneCountry
    }
    
    // 'value' attribute on TypeKeyInput (id=RegionalFormats) at UserPreferencesInputSet.pcf: line 23, column 59
    function value_7 () : typekey.LocaleType {
      return user.UserLocale
    }
    
    // 'visible' attribute on TypeKeyInput (id=Language) at UserPreferencesInputSet.pcf: line 16, column 61
    function visible_0 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.canSwitchLanguage()
    }
    
    // 'visible' attribute on TypeKeyInput (id=RegionalFormats) at UserPreferencesInputSet.pcf: line 23, column 59
    function visible_6 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.canSwitchLocale()
    }
    
    property get user () : User {
      return getRequireValue("user", 0) as User
    }
    
    property set user ($arg :  User) {
      setRequireValue("user", 0, $arg)
    }
    
    
  }
  
  
}