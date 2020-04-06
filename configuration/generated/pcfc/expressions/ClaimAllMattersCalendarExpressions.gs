package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/calendar/ClaimAllMattersCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimAllMattersCalendarExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/calendar/ClaimAllMattersCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAllMattersCalendarExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'calendarSource' attribute on Calendar at ClaimAllMattersCalendar.pcf: line 20, column 40
    function calendarSource_0 () : java.lang.Object {
      return new gw.api.calendar.MyMatterCalendarActivitySource(Claim, null)
    }
    
    // 'parent' attribute on Page (id=ClaimAllMattersCalendar) at ClaimAllMattersCalendar.pcf: line 9, column 71
    static function parent_1 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimMatters.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimAllMattersCalendar {
      return super.CurrentLocation as pcf.ClaimAllMattersCalendar
    }
    
    
  }
  
  
}