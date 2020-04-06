package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerAnalysisLGExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerAnalysisLGExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 13, column 57
    function action_0 () : void {
      pcf.ProfilerAnalysisPage.go("Web")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 28, column 69
    function action_10 () : void {
      pcf.ProfilerAnalysisPage.go("StartablePlugin")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 31, column 61
    function action_12 () : void {
      pcf.ProfilerAnalysisPage.go("Upgrade")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 34, column 60
    function action_14 () : void {
      pcf.ProfilerAnalysisPage.go("ByTime")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 37, column 63
    function action_16 () : void {
      pcf.ProfilerAnalysisPage.go("SavedFile")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 16, column 66
    function action_2 () : void {
      pcf.ProfilerAnalysisPage.go("BatchProcess")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 19, column 63
    function action_4 () : void {
      pcf.ProfilerAnalysisPage.go("WorkQueue")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 22, column 72
    function action_6 () : void {
      pcf.ProfilerAnalysisPage.go("MessageDestination")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 25, column 64
    function action_8 () : void {
      pcf.ProfilerAnalysisPage.go("WebService")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 13, column 57
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("Web")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 28, column 69
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("StartablePlugin")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 31, column 61
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("Upgrade")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 34, column 60
    function action_dest_15 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("ByTime")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 37, column 63
    function action_dest_17 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("SavedFile")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 16, column 66
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("BatchProcess")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 19, column 63
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("WorkQueue")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 22, column 72
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("MessageDestination")
    }
    
    // 'location' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 25, column 64
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("WebService")
    }
    
    // 'canVisit' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 10, column 63
    static function canVisit_18 () : java.lang.Boolean {
      return perm.User.ViewProfiler or perm.User.DevAllAccess
    }
    
    // LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 10, column 63
    static function firstVisitableChildDestinationMethod_22 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ProfilerAnalysisPage.createDestination("Web")
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ProfilerAnalysisPage.createDestination("BatchProcess")
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ProfilerAnalysisPage.createDestination("WorkQueue")
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ProfilerAnalysisPage.createDestination("MessageDestination")
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ProfilerAnalysisPage.createDestination("WebService")
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ProfilerAnalysisPage.createDestination("StartablePlugin")
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ProfilerAnalysisPage.createDestination("Upgrade")
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ProfilerAnalysisPage.createDestination("ByTime")
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ProfilerAnalysisPage.createDestination("SavedFile")
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 10, column 63
    static function parent_19 () : pcf.api.Destination {
      return pcf.Profiler.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 10, column 63
    function tabBar_onEnter_20 (def :  pcf.InternalToolsTabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ProfilerAnalysisLG) at ProfilerAnalysisLG.pcf: line 10, column 63
    function tabBar_refreshVariables_21 (def :  pcf.InternalToolsTabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.ProfilerAnalysisLG {
      return super.CurrentLocation as pcf.ProfilerAnalysisLG
    }
    
    
  }
  
  
}