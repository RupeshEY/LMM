package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/monitoring/Monitoring.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MonitoringExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/monitoring/Monitoring.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MonitoringExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=Monitoring) at Monitoring.pcf: line 10, column 53
    function action_0 () : void {
      pcf.MessagingDestinationControlList.go()
    }
    
    // 'location' attribute on LocationGroup (id=Monitoring) at Monitoring.pcf: line 12, column 36
    function action_2 () : void {
      pcf.WorkflowSearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=Monitoring) at Monitoring.pcf: line 14, column 35
    function action_4 () : void {
      pcf.WorkflowStats.go()
    }
    
    // 'location' attribute on LocationGroup (id=Monitoring) at Monitoring.pcf: line 10, column 53
    function action_dest_1 () : pcf.api.Destination {
      return pcf.MessagingDestinationControlList.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Monitoring) at Monitoring.pcf: line 12, column 36
    function action_dest_3 () : pcf.api.Destination {
      return pcf.WorkflowSearch.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Monitoring) at Monitoring.pcf: line 14, column 35
    function action_dest_5 () : pcf.api.Destination {
      return pcf.WorkflowStats.createDestination()
    }
    
    // 'canVisit' attribute on LocationGroup (id=Monitoring) at Monitoring.pcf: line 8, column 62
    static function canVisit_6 () : java.lang.Boolean {
      return perm.System.integadmin or perm.System.eventmessageview or perm.System.workflowview
    }
    
    // LocationGroup (id=Monitoring) at Monitoring.pcf: line 8, column 62
    static function firstVisitableChildDestinationMethod_10 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.MessagingDestinationControlList.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.WorkflowSearch.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.WorkflowStats.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=Monitoring) at Monitoring.pcf: line 8, column 62
    static function parent_7 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Monitoring) at Monitoring.pcf: line 8, column 62
    function tabBar_onEnter_8 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Monitoring) at Monitoring.pcf: line 8, column 62
    function tabBar_refreshVariables_9 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.Monitoring {
      return super.CurrentLocation as pcf.Monitoring
    }
    
    
  }
  
  
}