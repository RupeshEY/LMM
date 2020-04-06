package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/DashboardGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DashboardGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/DashboardGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on LocationGroup (id=DashboardGroup) at DashboardGroup.pcf: line 11, column 62
    static function canVisit_0 () : java.lang.Boolean {
      return perm.User.viewanyedb
    }
    
    // LocationGroup (id=DashboardGroup) at DashboardGroup.pcf: line 11, column 62
    static function firstVisitableChildDestinationMethod_9 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.DashboardSubGroup.createDestination(new gw.api.dashboard.DashboardTreeGroupInfo(null))
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'menuActions' attribute on LocationGroup (id=DashboardGroup) at DashboardGroup.pcf: line 11, column 62
    function menuActions_onEnter_1 (def :  pcf.DesktopMenuActions) : void {
      def.onEnter()
    }
    
    // 'menuActions' attribute on LocationGroup (id=DashboardGroup) at DashboardGroup.pcf: line 11, column 62
    function menuActions_refreshVariables_2 (def :  pcf.DesktopMenuActions) : void {
      def.refreshVariables()
    }
    
    // 'menuLinks' attribute on LocationGroup (id=DashboardGroup) at DashboardGroup.pcf: line 11, column 62
    function menuLinks_onEnter_3 (def :  pcf.BlankMenuLinks) : void {
      def.onEnter()
    }
    
    // 'menuLinks' attribute on LocationGroup (id=DashboardGroup) at DashboardGroup.pcf: line 11, column 62
    function menuLinks_refreshVariables_4 (def :  pcf.BlankMenuLinks) : void {
      def.refreshVariables()
    }
    
    // 'menuTree' attribute on LocationGroup (id=DashboardGroup) at DashboardGroup.pcf: line 11, column 62
    function menuTree_onEnter_5 (def :  pcf.DashboardMenuTree) : void {
      def.onEnter()
    }
    
    // 'menuTree' attribute on LocationGroup (id=DashboardGroup) at DashboardGroup.pcf: line 11, column 62
    function menuTree_refreshVariables_6 (def :  pcf.DashboardMenuTree) : void {
      def.refreshVariables()
    }
    
    // 'tabBar' attribute on LocationGroup (id=DashboardGroup) at DashboardGroup.pcf: line 11, column 62
    function tabBar_onEnter_7 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=DashboardGroup) at DashboardGroup.pcf: line 11, column 62
    function tabBar_refreshVariables_8 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.DashboardGroup {
      return super.CurrentLocation as pcf.DashboardGroup
    }
    
    
  }
  
  
}