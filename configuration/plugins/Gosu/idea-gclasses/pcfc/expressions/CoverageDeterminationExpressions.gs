package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/coverage/CoverageDetermination.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CoverageDeterminationExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/coverage/CoverageDetermination.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageDeterminationExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=CoverageDetermination) at CoverageDetermination.pcf: line 13, column 45
    function action_0 () : void {
      pcf.InvalidCoverageForCause.go()
    }
    
    // 'location' attribute on LocationGroup (id=CoverageDetermination) at CoverageDetermination.pcf: line 15, column 45
    function action_2 () : void {
      pcf.IncompatibleNewExposure.go()
    }
    
    // 'location' attribute on LocationGroup (id=CoverageDetermination) at CoverageDetermination.pcf: line 17, column 45
    function action_4 () : void {
      pcf.InvalidCoverageForFault.go()
    }
    
    // 'location' attribute on LocationGroup (id=CoverageDetermination) at CoverageDetermination.pcf: line 13, column 45
    function action_dest_1 () : pcf.api.Destination {
      return pcf.InvalidCoverageForCause.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=CoverageDetermination) at CoverageDetermination.pcf: line 15, column 45
    function action_dest_3 () : pcf.api.Destination {
      return pcf.IncompatibleNewExposure.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=CoverageDetermination) at CoverageDetermination.pcf: line 17, column 45
    function action_dest_5 () : pcf.api.Destination {
      return pcf.InvalidCoverageForFault.createDestination()
    }
    
    // 'canVisit' attribute on LocationGroup (id=CoverageDetermination) at CoverageDetermination.pcf: line 9, column 74
    static function canVisit_6 () : java.lang.Boolean {
      return perm.System.covverifyview
    }
    
    // LocationGroup (id=CoverageDetermination) at CoverageDetermination.pcf: line 9, column 74
    static function firstVisitableChildDestinationMethod_10 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.InvalidCoverageForCause.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.IncompatibleNewExposure.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.InvalidCoverageForFault.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'parent' attribute on LocationGroup (id=CoverageDetermination) at CoverageDetermination.pcf: line 9, column 74
    static function parent_7 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=CoverageDetermination) at CoverageDetermination.pcf: line 9, column 74
    function tabBar_onEnter_8 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=CoverageDetermination) at CoverageDetermination.pcf: line 9, column 74
    function tabBar_refreshVariables_9 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.CoverageDetermination {
      return super.CurrentLocation as pcf.CoverageDetermination
    }
    
    
  }
  
  
}