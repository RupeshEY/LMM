package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/Desktop.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/Desktop.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 13, column 39
    function action_0 () : void {
      pcf.DesktopActivities.go()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 25, column 47
    function action_12 () : void {
      pcf.DesktopAwaitingAssignment.go()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 28, column 45
    function action_15 () : void {
      pcf.DesktopQueuedActivities.go()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 30, column 42
    function action_22 () : void {
      pcf.DesktopCalendarGroup.go()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 32, column 29
    function action_24 () : void {
      pcf.BulkPay.go()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 35, column 45
    function action_26 () : void {
      pcf.ECFMessageSuspenseQueue.go()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 16, column 35
    function action_3 () : void {
      pcf.DesktopClaims.go()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 19, column 38
    function action_6 () : void {
      pcf.DesktopExposures.go()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 22, column 41
    function action_9 () : void {
      pcf.DesktopSubrogations.go()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 13, column 39
    function action_dest_1 () : pcf.api.Destination {
      return pcf.DesktopActivities.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 22, column 41
    function action_dest_10 () : pcf.api.Destination {
      return pcf.DesktopSubrogations.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 25, column 47
    function action_dest_13 () : pcf.api.Destination {
      return pcf.DesktopAwaitingAssignment.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 28, column 45
    function action_dest_16 () : pcf.api.Destination {
      return pcf.DesktopQueuedActivities.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 30, column 42
    function action_dest_23 () : pcf.api.Destination {
      return pcf.DesktopCalendarGroup.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 32, column 29
    function action_dest_25 () : pcf.api.Destination {
      return pcf.BulkPay.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 35, column 45
    function action_dest_27 () : pcf.api.Destination {
      return pcf.ECFMessageSuspenseQueue.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 16, column 35
    function action_dest_4 () : pcf.api.Destination {
      return pcf.DesktopClaims.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 19, column 38
    function action_dest_7 () : pcf.api.Destination {
      return pcf.DesktopExposures.createDestination()
    }
    
    // LocationGroup (id=Desktop) at Desktop.pcf: line 8, column 60
    static function firstVisitableChildDestinationMethod_33 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.DesktopActivities.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DesktopClaims.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DesktopExposures.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DesktopSubrogations.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DesktopAwaitingAssignment.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DesktopQueuedActivities.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DesktopCalendarGroup.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.BulkPay.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ECFMessageSuspenseQueue.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'label' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 22, column 41
    function label_11 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.Subrogations", gw.api.desktop.DesktopCounts.getDesktopCounts().ActiveSubrogations)
    }
    
    // 'label' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 25, column 47
    function label_14 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.UnassignedItems", gw.api.desktop.DesktopCounts.getDesktopCounts().AwaitingAssignment)
    }
    
    // 'label' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 28, column 45
    function label_17 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.ActivityQueues", gw.api.desktop.DesktopCounts.getDesktopCounts().Queues)
    }
    
    // 'label' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 13, column 39
    function label_2 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.Activities", gw.api.desktop.DesktopCounts.getDesktopCounts().Activities)
    }
    
    // 'label' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 35, column 45
    function label_28 () : java.lang.Object {
      return DisplayKey.get("Accelerator.IPLM.Web.Desktop.SuspenseQueue.DesktopTitle", gw.acc.iplm.desktop.DesktopMessageSuspenseQueue.getSuspendedMessagesCount(User.util.CurrentUser))
    }
    
    // 'label' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 16, column 35
    function label_5 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.Claims", gw.api.desktop.DesktopCounts.getDesktopCounts().Claims)
    }
    
    // 'label' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 19, column 38
    function label_8 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.Exposures", gw.api.desktop.DesktopCounts.getDesktopCounts().Exposures)
    }
    
    // 'menuActions' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 8, column 60
    function menuActions_onEnter_29 (def :  pcf.DesktopMenuActions) : void {
      def.onEnter()
    }
    
    // 'menuActions' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 8, column 60
    function menuActions_refreshVariables_30 (def :  pcf.DesktopMenuActions) : void {
      def.refreshVariables()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 8, column 60
    function tabBar_onEnter_31 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Desktop) at Desktop.pcf: line 8, column 60
    function tabBar_refreshVariables_32 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.Desktop {
      return super.CurrentLocation as pcf.Desktop
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/desktop/Desktop.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItemExpressionsImpl extends DesktopExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at DesktopCalendarGroup.pcf: line 13, column 21
    function action_18 () : void {
      pcf.Calendar.go()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at DesktopCalendarGroup.pcf: line 17, column 21
    function action_20 () : void {
      pcf.SupervisorCalendar.go()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at DesktopCalendarGroup.pcf: line 13, column 21
    function action_dest_19 () : pcf.api.Destination {
      return pcf.Calendar.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Desktop) at DesktopCalendarGroup.pcf: line 17, column 21
    function action_dest_21 () : pcf.api.Destination {
      return pcf.SupervisorCalendar.createDestination()
    }
    
    
  }
  
  
}