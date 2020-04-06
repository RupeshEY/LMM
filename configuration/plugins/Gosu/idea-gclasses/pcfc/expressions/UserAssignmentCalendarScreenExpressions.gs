package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/UserAssignmentCalendarScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserAssignmentCalendarScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/UserAssignmentCalendarScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAssignmentCalendarScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'calendarSource' attribute on Calendar at UserAssignmentCalendarScreen.pcf: line 13, column 37
    function calendarSource_0 () : java.lang.Object {
      return new gw.api.calendar.DesktopMyCalendarActivitySource(User)
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    
  }
  
  
}