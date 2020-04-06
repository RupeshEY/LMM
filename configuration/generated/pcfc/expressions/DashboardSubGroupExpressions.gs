package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/DashboardSubGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DashboardSubGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/DashboardSubGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardSubGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=DashboardSubGroup) at DashboardSubGroup.pcf: line 16, column 21
    function action_0 () : void {
      pcf.DashboardClaimCount.go(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=DashboardSubGroup) at DashboardSubGroup.pcf: line 20, column 21
    function action_2 () : void {
      pcf.DashboardClaimActivity.go(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=DashboardSubGroup) at DashboardSubGroup.pcf: line 24, column 21
    function action_4 () : void {
      pcf.DashboardCurrentFinancials.go(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=DashboardSubGroup) at DashboardSubGroup.pcf: line 28, column 21
    function action_6 () : void {
      pcf.DashboardPeriodFinancials.go(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=DashboardSubGroup) at DashboardSubGroup.pcf: line 16, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.DashboardClaimCount.createDestination(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=DashboardSubGroup) at DashboardSubGroup.pcf: line 20, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.DashboardClaimActivity.createDestination(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=DashboardSubGroup) at DashboardSubGroup.pcf: line 24, column 21
    function action_dest_5 () : pcf.api.Destination {
      return pcf.DashboardCurrentFinancials.createDestination(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=DashboardSubGroup) at DashboardSubGroup.pcf: line 28, column 21
    function action_dest_7 () : pcf.api.Destination {
      return pcf.DashboardPeriodFinancials.createDestination(GroupInfo)
    }
    
    // LocationGroup (id=DashboardSubGroup) at DashboardSubGroup.pcf: line 7, column 62
    static function firstVisitableChildDestinationMethod_11 (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.DashboardClaimCount.createDestination(GroupInfo)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DashboardClaimActivity.createDestination(GroupInfo)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DashboardCurrentFinancials.createDestination(GroupInfo)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DashboardPeriodFinancials.createDestination(GroupInfo)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=DashboardSubGroup) at DashboardSubGroup.pcf: line 7, column 62
    static function parent_8 (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : pcf.api.Destination {
      return pcf.DashboardGroup.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=DashboardSubGroup) at DashboardSubGroup.pcf: line 7, column 62
    function tabBar_onEnter_9 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=DashboardSubGroup) at DashboardSubGroup.pcf: line 7, column 62
    function tabBar_refreshVariables_10 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.DashboardSubGroup {
      return super.CurrentLocation as pcf.DashboardSubGroup
    }
    
    property get GroupInfo () : gw.api.dashboard.DashboardTreeGroupInfo {
      return getVariableValue("GroupInfo", 0) as gw.api.dashboard.DashboardTreeGroupInfo
    }
    
    property set GroupInfo ($arg :  gw.api.dashboard.DashboardTreeGroupInfo) {
      setVariableValue("GroupInfo", 0, $arg)
    }
    
    
  }
  
  
}