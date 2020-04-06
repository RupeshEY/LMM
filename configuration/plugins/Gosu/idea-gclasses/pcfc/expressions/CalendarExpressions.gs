package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/calendar/Calendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CalendarExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/calendar/Calendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CalendarExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'calendarSource' attribute on Calendar at Calendar.pcf: line 15, column 39
    function calendarSource_0 () : java.lang.Object {
      return new gw.api.calendar.DesktopMyCalendarActivitySource(null)
    }
    
    // 'canVisit' attribute on Page (id=Calendar) at Calendar.pcf: line 9, column 54
    static function canVisit_1 () : java.lang.Boolean {
      return perm.Activity.own and perm.System.viewdesktop
    }
    
    // Page (id=Calendar) at Calendar.pcf: line 9, column 54
    static function parent_2 () : pcf.api.Destination {
      return pcf.DesktopCalendarGroup.createDestination()
    }
    
    override property get CurrentLocation () : pcf.Calendar {
      return super.CurrentLocation as pcf.Calendar
    }
    
    
  }
  
  
}