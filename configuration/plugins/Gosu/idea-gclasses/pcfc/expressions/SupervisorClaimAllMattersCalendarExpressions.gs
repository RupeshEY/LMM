package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/calendar/SupervisorClaimAllMattersCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SupervisorClaimAllMattersCalendarExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/calendar/SupervisorClaimAllMattersCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SupervisorClaimAllMattersCalendarExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'calendarSource' attribute on Calendar at SupervisorClaimAllMattersCalendar.pcf: line 21, column 50
    function calendarSource_0 () : java.lang.Object {
      return new gw.api.calendar.SupervisorMatterCalendarSource(Claim, null)
    }
    
    // 'canVisit' attribute on Page (id=SupervisorClaimAllMattersCalendar) at SupervisorClaimAllMattersCalendar.pcf: line 10, column 71
    static function canVisit_1 (Claim :  Claim) : java.lang.Boolean {
      return perm.System.viewsupcalendar
    }
    
    // 'parent' attribute on Page (id=SupervisorClaimAllMattersCalendar) at SupervisorClaimAllMattersCalendar.pcf: line 10, column 71
    static function parent_2 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimMatters.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.SupervisorClaimAllMattersCalendar {
      return super.CurrentLocation as pcf.SupervisorClaimAllMattersCalendar
    }
    
    
  }
  
  
}