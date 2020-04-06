package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/calendar/SupervisorCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SupervisorCalendarExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/calendar/SupervisorCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SupervisorCalendarExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'calendarSource' attribute on Calendar at SupervisorCalendar.pcf: line 15, column 47
    function calendarSource_0 () : java.lang.Object {
      return new gw.api.calendar.SupervisorDesktopCalendarSource()
    }
    
    // 'canVisit' attribute on Page (id=SupervisorCalendar) at SupervisorCalendar.pcf: line 9, column 54
    static function canVisit_1 () : java.lang.Boolean {
      return perm.System.viewsupcalendar
    }
    
    // Page (id=SupervisorCalendar) at SupervisorCalendar.pcf: line 9, column 54
    static function parent_2 () : pcf.api.Destination {
      return pcf.DesktopCalendarGroup.createDestination()
    }
    
    override property get CurrentLocation () : pcf.SupervisorCalendar {
      return super.CurrentLocation as pcf.SupervisorCalendar
    }
    
    
  }
  
  
}