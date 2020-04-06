package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterPages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClusterPagesExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterPages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterPagesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ClusterPages) at ClusterPages.pcf: line 13, column 36
    function action_0 () : void {
      pcf.ClusterMembers.go()
    }
    
    // 'location' attribute on LocationGroup (id=ClusterPages) at ClusterPages.pcf: line 15, column 39
    function action_2 () : void {
      pcf.ClusterComponents.go()
    }
    
    // 'location' attribute on LocationGroup (id=ClusterPages) at ClusterPages.pcf: line 13, column 36
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClusterMembers.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ClusterPages) at ClusterPages.pcf: line 15, column 39
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClusterComponents.createDestination()
    }
    
    // 'canVisit' attribute on LocationGroup (id=ClusterPages) at ClusterPages.pcf: line 10, column 81
    static function canVisit_4 () : java.lang.Boolean {
      return perm.User.ViewCluster or perm.User.DevAllAccess
    }
    
    // LocationGroup (id=ClusterPages) at ClusterPages.pcf: line 10, column 81
    static function firstVisitableChildDestinationMethod_8 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ClusterMembers.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClusterComponents.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=ClusterPages) at ClusterPages.pcf: line 10, column 81
    static function parent_5 () : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClusterPages) at ClusterPages.pcf: line 10, column 81
    function tabBar_onEnter_6 (def :  pcf.InternalToolsTabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClusterPages) at ClusterPages.pcf: line 10, column 81
    function tabBar_refreshVariables_7 (def :  pcf.InternalToolsTabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.ClusterPages {
      return super.CurrentLocation as pcf.ClusterPages
    }
    
    
  }
  
  
}