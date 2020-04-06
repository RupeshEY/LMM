package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/InfoPages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InfoPagesExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/InfoPages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InfoPagesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 13, column 39
    function action_0 () : void {
      pcf.ConfigurationInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 29, column 40
    function action_10 () : void {
      pcf.DatabaseParameters.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 32, column 37
    function action_12 () : void {
      pcf.DatabaseStorage.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 35, column 42
    function action_14 () : void {
      pcf.DataDistributionInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 38, column 40
    function action_16 () : void {
      pcf.DatabaseStatistics.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 41, column 41
    function action_18 () : void {
      pcf.OracleStatspackInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 17, column 33
    function action_2 () : void {
      pcf.ArchiveInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 44, column 35
    function action_20 () : void {
      pcf.OracleAWRInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 47, column 48
    function action_22 () : void {
      pcf.OracleAWRUnusedIndexesInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 50, column 39
    function action_24 () : void {
      pcf.OracleOutlineInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 53, column 38
    function action_26 () : void {
      pcf.MicrosoftDMVInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 56, column 44
    function action_28 () : void {
      pcf.MicrosoftDriverLogging.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 59, column 37
    function action_30 () : void {
      pcf.LoadHistoryInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 62, column 41
    function action_32 () : void {
      pcf.LoadIntegrityChecks.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 65, column 36
    function action_34 () : void {
      pcf.LoadErrorsInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 68, column 44
    function action_36 () : void {
      pcf.RuntimeEnvironmentInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 71, column 45
    function action_38 () : void {
      pcf.SafePersistingOrderInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 21, column 38
    function action_4 () : void {
      pcf.ArchiveGraphInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 74, column 39
    function action_40 () : void {
      pcf.LoadedGosuClasses.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 76, column 39
    function action_42 () : void {
      pcf.SerializationInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 23, column 39
    function action_6 () : void {
      pcf.ConsistencyChecks.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 26, column 39
    function action_8 () : void {
      pcf.DatabaseTableInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 13, column 39
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ConfigurationInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 29, column 40
    function action_dest_11 () : pcf.api.Destination {
      return pcf.DatabaseParameters.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 32, column 37
    function action_dest_13 () : pcf.api.Destination {
      return pcf.DatabaseStorage.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 35, column 42
    function action_dest_15 () : pcf.api.Destination {
      return pcf.DataDistributionInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 38, column 40
    function action_dest_17 () : pcf.api.Destination {
      return pcf.DatabaseStatistics.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 41, column 41
    function action_dest_19 () : pcf.api.Destination {
      return pcf.OracleStatspackInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 44, column 35
    function action_dest_21 () : pcf.api.Destination {
      return pcf.OracleAWRInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 47, column 48
    function action_dest_23 () : pcf.api.Destination {
      return pcf.OracleAWRUnusedIndexesInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 50, column 39
    function action_dest_25 () : pcf.api.Destination {
      return pcf.OracleOutlineInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 53, column 38
    function action_dest_27 () : pcf.api.Destination {
      return pcf.MicrosoftDMVInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 56, column 44
    function action_dest_29 () : pcf.api.Destination {
      return pcf.MicrosoftDriverLogging.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 17, column 33
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ArchiveInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 59, column 37
    function action_dest_31 () : pcf.api.Destination {
      return pcf.LoadHistoryInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 62, column 41
    function action_dest_33 () : pcf.api.Destination {
      return pcf.LoadIntegrityChecks.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 65, column 36
    function action_dest_35 () : pcf.api.Destination {
      return pcf.LoadErrorsInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 68, column 44
    function action_dest_37 () : pcf.api.Destination {
      return pcf.RuntimeEnvironmentInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 71, column 45
    function action_dest_39 () : pcf.api.Destination {
      return pcf.SafePersistingOrderInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 74, column 39
    function action_dest_41 () : pcf.api.Destination {
      return pcf.LoadedGosuClasses.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 76, column 39
    function action_dest_43 () : pcf.api.Destination {
      return pcf.SerializationInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 21, column 38
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ArchiveGraphInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 23, column 39
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ConsistencyChecks.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 26, column 39
    function action_dest_9 () : pcf.api.Destination {
      return pcf.DatabaseTableInfo.createDestination()
    }
    
    // 'canVisit' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 10, column 78
    static function canVisit_44 () : java.lang.Boolean {
      return perm.User.ViewInfo or perm.User.DevAllAccess
    }
    
    // LocationGroup (id=InfoPages) at InfoPages.pcf: line 10, column 78
    static function firstVisitableChildDestinationMethod_48 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ConfigurationInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ArchiveInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ArchiveGraphInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ConsistencyChecks.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DatabaseTableInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DatabaseParameters.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DatabaseStorage.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DataDistributionInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DatabaseStatistics.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.OracleStatspackInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.OracleAWRInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.OracleAWRUnusedIndexesInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.OracleOutlineInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.MicrosoftDMVInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.MicrosoftDriverLogging.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.LoadHistoryInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.LoadIntegrityChecks.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.LoadErrorsInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.RuntimeEnvironmentInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.SafePersistingOrderInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.LoadedGosuClasses.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.SerializationInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=InfoPages) at InfoPages.pcf: line 10, column 78
    static function parent_45 () : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 10, column 78
    function tabBar_onEnter_46 (def :  pcf.InternalToolsTabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=InfoPages) at InfoPages.pcf: line 10, column 78
    function tabBar_refreshVariables_47 (def :  pcf.InternalToolsTabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.InfoPages {
      return super.CurrentLocation as pcf.InfoPages
    }
    
    
  }
  
  
}