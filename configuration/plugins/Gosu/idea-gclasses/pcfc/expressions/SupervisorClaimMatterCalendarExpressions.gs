package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/calendar/SupervisorClaimMatterCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SupervisorClaimMatterCalendarExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/calendar/SupervisorClaimMatterCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SupervisorClaimMatterCalendarExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Matter :  Matter) : int {
      return 0
    }
    
    // 'calendarSource' attribute on Calendar at SupervisorClaimMatterCalendar.pcf: line 24, column 50
    function calendarSource_0 () : java.lang.Object {
      return new gw.api.calendar.SupervisorMatterCalendarSource(Claim, Matter)
    }
    
    // 'canVisit' attribute on Page (id=SupervisorClaimMatterCalendar) at SupervisorClaimMatterCalendar.pcf: line 10, column 71
    static function canVisit_1 (Claim :  Claim, Matter :  Matter) : java.lang.Boolean {
      return perm.System.viewsupcalendar
    }
    
    // 'parent' attribute on Page (id=SupervisorClaimMatterCalendar) at SupervisorClaimMatterCalendar.pcf: line 10, column 71
    static function parent_2 (Claim :  Claim, Matter :  Matter) : pcf.api.Destination {
      return pcf.MatterDetailPage.createDestination(Claim, Matter)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.SupervisorClaimMatterCalendar {
      return super.CurrentLocation as pcf.SupervisorClaimMatterCalendar
    }
    
    property get Matter () : Matter {
      return getVariableValue("Matter", 0) as Matter
    }
    
    property set Matter ($arg :  Matter) {
      setVariableValue("Matter", 0, $arg)
    }
    
    
  }
  
  
}