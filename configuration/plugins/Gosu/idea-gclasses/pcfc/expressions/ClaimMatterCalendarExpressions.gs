package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/ClaimMatterCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimMatterCalendarExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/ClaimMatterCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMatterCalendarExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Matter :  Matter) : int {
      return 0
    }
    
    // 'calendarSource' attribute on Calendar at ClaimMatterCalendar.pcf: line 23, column 40
    function calendarSource_0 () : java.lang.Object {
      return new gw.api.calendar.MyMatterCalendarActivitySource(Claim, Matter)
    }
    
    // 'parent' attribute on Page (id=ClaimMatterCalendar) at ClaimMatterCalendar.pcf: line 9, column 71
    static function parent_1 (Claim :  Claim, Matter :  Matter) : pcf.api.Destination {
      return pcf.MatterDetailPage.createDestination(Claim, Matter)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimMatterCalendar {
      return super.CurrentLocation as pcf.ClaimMatterCalendar
    }
    
    property get Matter () : Matter {
      return getVariableValue("Matter", 0) as Matter
    }
    
    property set Matter ($arg :  Matter) {
      setVariableValue("Matter", 0, $arg)
    }
    
    
  }
  
  
}