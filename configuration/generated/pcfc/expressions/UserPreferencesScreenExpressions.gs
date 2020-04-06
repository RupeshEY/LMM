package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/preferences/UserPreferencesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserPreferencesScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/preferences/UserPreferencesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserPreferencesScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at UserPreferencesScreen.pcf: line 18, column 24
    function def_onEnter_1 (def :  pcf.UserPreferencesDV) : void {
      def.onEnter(User)
    }
    
    // 'def' attribute on PanelRef at UserPreferencesScreen.pcf: line 18, column 24
    function def_refreshVariables_2 (def :  pcf.UserPreferencesDV) : void {
      def.refreshVariables(User)
    }
    
    // EditButtons at UserPreferencesScreen.pcf: line 14, column 21
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    property get UserSettings () : UserSettings {
      return getRequireValue("UserSettings", 0) as UserSettings
    }
    
    property set UserSettings ($arg :  UserSettings) {
      setRequireValue("UserSettings", 0, $arg)
    }
    
    
  }
  
  
}