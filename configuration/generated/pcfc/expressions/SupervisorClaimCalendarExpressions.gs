package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/calendar/SupervisorClaimCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SupervisorClaimCalendarExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/calendar/SupervisorClaimCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SupervisorClaimCalendarExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'calendarSource' attribute on Calendar at SupervisorClaimCalendar.pcf: line 19, column 45
    function calendarSource_0 () : java.lang.Object {
      return new gw.api.calendar.SupervisorClaimCalendarSource(Claim)
    }
    
    // 'canVisit' attribute on Page (id=SupervisorClaimCalendar) at SupervisorClaimCalendar.pcf: line 8, column 65
    static function canVisit_1 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewsupcalendar
    }
    
    // Page (id=SupervisorClaimCalendar) at SupervisorClaimCalendar.pcf: line 8, column 65
    static function parent_2 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimCalendarGroup.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.SupervisorClaimCalendar {
      return super.CurrentLocation as pcf.SupervisorClaimCalendar
    }
    
    
  }
  
  
}