package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CentipedeCacheInfoLGExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CentipedeCacheInfoLGExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=CentipedeCacheInfoLG) at CentipedeCacheInfoLG.pcf: line 17, column 40
    function action_1 () : void {
      pcf.CentipedeCacheInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=CentipedeCacheInfoLG) at CentipedeCacheInfoLG.pcf: line 19, column 47
    function action_3 () : void {
      pcf.CentipedeCacheInfoHistory.go()
    }
    
    // 'location' attribute on LocationGroup (id=CentipedeCacheInfoLG) at CentipedeCacheInfoLG.pcf: line 21, column 47
    function action_5 () : void {
      pcf.CentipedeCacheInfoDetails.go()
    }
    
    // 'location' attribute on LocationGroup (id=CentipedeCacheInfoLG) at CentipedeCacheInfoLG.pcf: line 17, column 40
    function action_dest_2 () : pcf.api.Destination {
      return pcf.CentipedeCacheInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=CentipedeCacheInfoLG) at CentipedeCacheInfoLG.pcf: line 19, column 47
    function action_dest_4 () : pcf.api.Destination {
      return pcf.CentipedeCacheInfoHistory.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=CentipedeCacheInfoLG) at CentipedeCacheInfoLG.pcf: line 21, column 47
    function action_dest_6 () : pcf.api.Destination {
      return pcf.CentipedeCacheInfoDetails.createDestination()
    }
    
    // 'canVisit' attribute on LocationGroup (id=CentipedeCacheInfoLG) at CentipedeCacheInfoLG.pcf: line 10, column 79
    static function canVisit_7 () : java.lang.Boolean {
      return perm.User.ViewCacheInfo or perm.User.DevAllAccess
    }
    
    // LocationGroup (id=CentipedeCacheInfoLG) at CentipedeCacheInfoLG.pcf: line 10, column 79
    static function firstVisitableChildDestinationMethod_11 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.CentipedeCacheInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.CentipedeCacheInfoHistory.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.CentipedeCacheInfoDetails.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'initialValue' attribute on Variable at CentipedeCacheInfoLG.pcf: line 15, column 49
    function initialValue_0 () : gw.api.cache2.CacheInfoPageHelper {
      gw.api.cache2.CacheInfoPageHelper.INSTANCE.reload(); return gw.api.cache2.CacheInfoPageHelper.INSTANCE
    }
    
    // LocationGroup (id=CentipedeCacheInfoLG) at CentipedeCacheInfoLG.pcf: line 10, column 79
    static function parent_8 () : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=CentipedeCacheInfoLG) at CentipedeCacheInfoLG.pcf: line 10, column 79
    function tabBar_onEnter_9 (def :  pcf.InternalToolsTabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=CentipedeCacheInfoLG) at CentipedeCacheInfoLG.pcf: line 10, column 79
    function tabBar_refreshVariables_10 (def :  pcf.InternalToolsTabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.CentipedeCacheInfoLG {
      return super.CurrentLocation as pcf.CentipedeCacheInfoLG
    }
    
    property get pageHelper () : gw.api.cache2.CacheInfoPageHelper {
      return getVariableValue("pageHelper", 0) as gw.api.cache2.CacheInfoPageHelper
    }
    
    property set pageHelper ($arg :  gw.api.cache2.CacheInfoPageHelper) {
      setVariableValue("pageHelper", 0, $arg)
    }
    
    
  }
  
  
}