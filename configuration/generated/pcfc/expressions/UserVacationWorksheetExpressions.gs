package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/vacationstatus/UserVacationWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserVacationWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/vacationstatus/UserVacationWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserVacationWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at UserVacationWorksheet.pcf: line 21, column 46
    function def_onEnter_1 (def :  pcf.UserVacationScreen) : void {
      def.onEnter(CurrentUser)
    }
    
    // 'def' attribute on ScreenRef at UserVacationWorksheet.pcf: line 21, column 46
    function def_refreshVariables_2 (def :  pcf.UserVacationScreen) : void {
      def.refreshVariables(CurrentUser)
    }
    
    // 'initialValue' attribute on Variable at UserVacationWorksheet.pcf: line 19, column 20
    function initialValue_0 () : User {
      return User.util.CurrentUser
    }
    
    override property get CurrentLocation () : pcf.UserVacationWorksheet {
      return super.CurrentLocation as pcf.UserVacationWorksheet
    }
    
    property get CurrentUser () : User {
      return getVariableValue("CurrentUser", 0) as User
    }
    
    property set CurrentUser ($arg :  User) {
      setVariableValue("CurrentUser", 0, $arg)
    }
    
    
  }
  
  
}