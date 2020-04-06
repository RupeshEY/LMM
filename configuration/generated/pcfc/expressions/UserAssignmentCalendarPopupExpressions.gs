package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/UserAssignmentCalendarPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserAssignmentCalendarPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/UserAssignmentCalendarPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAssignmentCalendarPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at UserAssignmentCalendarPopup.pcf: line 15, column 49
    function def_onEnter_0 (def :  pcf.UserAssignmentCalendarScreen) : void {
      def.onEnter(User)
    }
    
    // 'def' attribute on ScreenRef at UserAssignmentCalendarPopup.pcf: line 15, column 49
    function def_refreshVariables_1 (def :  pcf.UserAssignmentCalendarScreen) : void {
      def.refreshVariables(User)
    }
    
    override property get CurrentLocation () : pcf.UserAssignmentCalendarPopup {
      return super.CurrentLocation as pcf.UserAssignmentCalendarPopup
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    
  }
  
  
}