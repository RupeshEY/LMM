package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopCalendarGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopCalendarGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=DesktopCalendarGroup) at DesktopCalendarGroup.pcf: line 13, column 21
    function action_0 () : void {
      pcf.Calendar.go()
    }
    
    // 'location' attribute on LocationGroup (id=DesktopCalendarGroup) at DesktopCalendarGroup.pcf: line 17, column 21
    function action_2 () : void {
      pcf.SupervisorCalendar.go()
    }
    
    // 'location' attribute on LocationGroup (id=DesktopCalendarGroup) at DesktopCalendarGroup.pcf: line 13, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.Calendar.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=DesktopCalendarGroup) at DesktopCalendarGroup.pcf: line 17, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.SupervisorCalendar.createDestination()
    }
    
    // LocationGroup (id=DesktopCalendarGroup) at DesktopCalendarGroup.pcf: line 7, column 71
    static function firstVisitableChildDestinationMethod_7 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.Calendar.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.SupervisorCalendar.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=DesktopCalendarGroup) at DesktopCalendarGroup.pcf: line 7, column 71
    static function parent_4 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=DesktopCalendarGroup) at DesktopCalendarGroup.pcf: line 7, column 71
    function tabBar_onEnter_5 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=DesktopCalendarGroup) at DesktopCalendarGroup.pcf: line 7, column 71
    function tabBar_refreshVariables_6 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.DesktopCalendarGroup {
      return super.CurrentLocation as pcf.DesktopCalendarGroup
    }
    
    
  }
  
  
}