package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/preferences/UserPreferencesWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserPreferencesWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/preferences/UserPreferencesWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserPreferencesWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at UserPreferencesWorksheet.pcf: line 25, column 56
    function def_onEnter_2 (def :  pcf.UserPreferencesScreen) : void {
      def.onEnter(UserSettings, User)
    }
    
    // 'def' attribute on ScreenRef at UserPreferencesWorksheet.pcf: line 25, column 56
    function def_refreshVariables_3 (def :  pcf.UserPreferencesScreen) : void {
      def.refreshVariables(UserSettings, User)
    }
    
    // 'initialValue' attribute on Variable at UserPreferencesWorksheet.pcf: line 19, column 20
    function initialValue_0 () : User {
      return entity.User.util.CurrentUser
    }
    
    // 'initialValue' attribute on Variable at UserPreferencesWorksheet.pcf: line 23, column 28
    function initialValue_1 () : UserSettings {
      return User.getOrCreateUserSettings()
    }
    
    override property get CurrentLocation () : pcf.UserPreferencesWorksheet {
      return super.CurrentLocation as pcf.UserPreferencesWorksheet
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    property get UserSettings () : UserSettings {
      return getVariableValue("UserSettings", 0) as UserSettings
    }
    
    property set UserSettings ($arg :  UserSettings) {
      setVariableValue("UserSettings", 0, $arg)
    }
    
    
  }
  
  
}