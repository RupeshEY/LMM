package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/ServerTools.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ServerToolsExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/ServerTools.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem2ExpressionsImpl extends ServerToolsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ClusterPages.pcf: line 13, column 36
    function action_58 () : void {
      pcf.ClusterMembers.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ClusterPages.pcf: line 15, column 39
    function action_60 () : void {
      pcf.ClusterComponents.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ClusterPages.pcf: line 13, column 36
    function action_dest_59 () : pcf.api.Destination {
      return pcf.ClusterMembers.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ClusterPages.pcf: line 15, column 39
    function action_dest_61 () : pcf.api.Destination {
      return pcf.ClusterComponents.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/ServerTools.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem3ExpressionsImpl extends ServerToolsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at CentipedeCacheInfoLG.pcf: line 17, column 40
    function action_66 () : void {
      pcf.CentipedeCacheInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at CentipedeCacheInfoLG.pcf: line 19, column 47
    function action_68 () : void {
      pcf.CentipedeCacheInfoHistory.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at CentipedeCacheInfoLG.pcf: line 21, column 47
    function action_70 () : void {
      pcf.CentipedeCacheInfoDetails.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at CentipedeCacheInfoLG.pcf: line 17, column 40
    function action_dest_67 () : pcf.api.Destination {
      return pcf.CentipedeCacheInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at CentipedeCacheInfoLG.pcf: line 19, column 47
    function action_dest_69 () : pcf.api.Destination {
      return pcf.CentipedeCacheInfoHistory.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at CentipedeCacheInfoLG.pcf: line 21, column 47
    function action_dest_71 () : pcf.api.Destination {
      return pcf.CentipedeCacheInfoDetails.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/ServerTools.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem4ExpressionsImpl extends ServerToolsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at Profiler.pcf: line 10, column 47
    function action_74 () : void {
      pcf.ProfilerConfigurationPage.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at Profiler.pcf: line 12, column 40
    function action_94 () : void {
      pcf.ProfilerAnalysisLG.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at Profiler.pcf: line 10, column 47
    function action_dest_75 () : pcf.api.Destination {
      return pcf.ProfilerConfigurationPage.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at Profiler.pcf: line 12, column 40
    function action_dest_95 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisLG.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/ServerTools.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem5ExpressionsImpl extends LocationGroupMenuItem4ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 13, column 57
    function action_76 () : void {
      pcf.ProfilerAnalysisPage.go("Web")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 16, column 66
    function action_78 () : void {
      pcf.ProfilerAnalysisPage.go("BatchProcess")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 19, column 63
    function action_80 () : void {
      pcf.ProfilerAnalysisPage.go("WorkQueue")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 22, column 72
    function action_82 () : void {
      pcf.ProfilerAnalysisPage.go("MessageDestination")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 25, column 64
    function action_84 () : void {
      pcf.ProfilerAnalysisPage.go("WebService")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 28, column 69
    function action_86 () : void {
      pcf.ProfilerAnalysisPage.go("StartablePlugin")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 31, column 61
    function action_88 () : void {
      pcf.ProfilerAnalysisPage.go("Upgrade")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 34, column 60
    function action_90 () : void {
      pcf.ProfilerAnalysisPage.go("ByTime")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 37, column 63
    function action_92 () : void {
      pcf.ProfilerAnalysisPage.go("SavedFile")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 13, column 57
    function action_dest_77 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("Web")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 16, column 66
    function action_dest_79 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("BatchProcess")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 19, column 63
    function action_dest_81 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("WorkQueue")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 22, column 72
    function action_dest_83 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("MessageDestination")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 25, column 64
    function action_dest_85 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("WebService")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 28, column 69
    function action_dest_87 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("StartablePlugin")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 31, column 61
    function action_dest_89 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("Upgrade")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 34, column 60
    function action_dest_91 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("ByTime")
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ProfilerAnalysisLG.pcf: line 37, column 63
    function action_dest_93 () : pcf.api.Destination {
      return pcf.ProfilerAnalysisPage.createDestination("SavedFile")
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/ServerTools.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItemExpressionsImpl extends ServerToolsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 17, column 33
    function action_10 () : void {
      pcf.ArchiveInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 21, column 38
    function action_12 () : void {
      pcf.ArchiveGraphInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 23, column 39
    function action_14 () : void {
      pcf.ConsistencyChecks.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 26, column 39
    function action_16 () : void {
      pcf.DatabaseTableInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 29, column 40
    function action_18 () : void {
      pcf.DatabaseParameters.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 32, column 37
    function action_20 () : void {
      pcf.DatabaseStorage.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 35, column 42
    function action_22 () : void {
      pcf.DataDistributionInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 38, column 40
    function action_24 () : void {
      pcf.DatabaseStatistics.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 41, column 41
    function action_26 () : void {
      pcf.OracleStatspackInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 44, column 35
    function action_28 () : void {
      pcf.OracleAWRInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 47, column 48
    function action_30 () : void {
      pcf.OracleAWRUnusedIndexesInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 50, column 39
    function action_32 () : void {
      pcf.OracleOutlineInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 53, column 38
    function action_34 () : void {
      pcf.MicrosoftDMVInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 56, column 44
    function action_36 () : void {
      pcf.MicrosoftDriverLogging.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 59, column 37
    function action_38 () : void {
      pcf.LoadHistoryInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 62, column 41
    function action_40 () : void {
      pcf.LoadIntegrityChecks.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 65, column 36
    function action_42 () : void {
      pcf.LoadErrorsInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 68, column 44
    function action_44 () : void {
      pcf.RuntimeEnvironmentInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 71, column 45
    function action_46 () : void {
      pcf.SafePersistingOrderInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 74, column 39
    function action_48 () : void {
      pcf.LoadedGosuClasses.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 76, column 39
    function action_50 () : void {
      pcf.SerializationInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 13, column 39
    function action_8 () : void {
      pcf.ConfigurationInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 17, column 33
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ArchiveInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 21, column 38
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ArchiveGraphInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 23, column 39
    function action_dest_15 () : pcf.api.Destination {
      return pcf.ConsistencyChecks.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 26, column 39
    function action_dest_17 () : pcf.api.Destination {
      return pcf.DatabaseTableInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 29, column 40
    function action_dest_19 () : pcf.api.Destination {
      return pcf.DatabaseParameters.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 32, column 37
    function action_dest_21 () : pcf.api.Destination {
      return pcf.DatabaseStorage.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 35, column 42
    function action_dest_23 () : pcf.api.Destination {
      return pcf.DataDistributionInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 38, column 40
    function action_dest_25 () : pcf.api.Destination {
      return pcf.DatabaseStatistics.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 41, column 41
    function action_dest_27 () : pcf.api.Destination {
      return pcf.OracleStatspackInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 44, column 35
    function action_dest_29 () : pcf.api.Destination {
      return pcf.OracleAWRInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 47, column 48
    function action_dest_31 () : pcf.api.Destination {
      return pcf.OracleAWRUnusedIndexesInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 50, column 39
    function action_dest_33 () : pcf.api.Destination {
      return pcf.OracleOutlineInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 53, column 38
    function action_dest_35 () : pcf.api.Destination {
      return pcf.MicrosoftDMVInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 56, column 44
    function action_dest_37 () : pcf.api.Destination {
      return pcf.MicrosoftDriverLogging.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 59, column 37
    function action_dest_39 () : pcf.api.Destination {
      return pcf.LoadHistoryInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 62, column 41
    function action_dest_41 () : pcf.api.Destination {
      return pcf.LoadIntegrityChecks.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 65, column 36
    function action_dest_43 () : pcf.api.Destination {
      return pcf.LoadErrorsInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 68, column 44
    function action_dest_45 () : pcf.api.Destination {
      return pcf.RuntimeEnvironmentInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 71, column 45
    function action_dest_47 () : pcf.api.Destination {
      return pcf.SafePersistingOrderInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 74, column 39
    function action_dest_49 () : pcf.api.Destination {
      return pcf.LoadedGosuClasses.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 76, column 39
    function action_dest_51 () : pcf.api.Destination {
      return pcf.SerializationInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at InfoPages.pcf: line 13, column 39
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ConfigurationInfo.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/ServerTools.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServerToolsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 12, column 38
    function action_0 () : void {
      pcf.BatchProcessInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 36, column 32
    function action_100 () : void {
      pcf.MetroFlows.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 14, column 35
    function action_2 () : void {
      pcf.WorkQueueInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 16, column 33
    function action_4 () : void {
      pcf.SetLogLevel.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 20, column 31
    function action_52 () : void {
      pcf.InfoPages.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 22, column 28
    function action_54 () : void {
      pcf.MBeans.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 24, column 37
    function action_56 () : void {
      pcf.StartablePlugin.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 18, column 30
    function action_6 () : void {
      pcf.ViewLogs.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 26, column 34
    function action_62 () : void {
      pcf.ClusterPages.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 28, column 33
    function action_64 () : void {
      pcf.UpgradeInfo.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 30, column 42
    function action_72 () : void {
      pcf.CentipedeCacheInfoLG.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 32, column 30
    function action_96 () : void {
      pcf.Profiler.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 34, column 31
    function action_98 () : void {
      pcf.JProfiler.go()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 12, column 38
    function action_dest_1 () : pcf.api.Destination {
      return pcf.BatchProcessInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 36, column 32
    function action_dest_101 () : pcf.api.Destination {
      return pcf.MetroFlows.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 14, column 35
    function action_dest_3 () : pcf.api.Destination {
      return pcf.WorkQueueInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 16, column 33
    function action_dest_5 () : pcf.api.Destination {
      return pcf.SetLogLevel.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 20, column 31
    function action_dest_53 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 22, column 28
    function action_dest_55 () : pcf.api.Destination {
      return pcf.MBeans.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 24, column 37
    function action_dest_57 () : pcf.api.Destination {
      return pcf.StartablePlugin.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 26, column 34
    function action_dest_63 () : pcf.api.Destination {
      return pcf.ClusterPages.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 28, column 33
    function action_dest_65 () : pcf.api.Destination {
      return pcf.UpgradeInfo.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 18, column 30
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ViewLogs.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 30, column 42
    function action_dest_73 () : pcf.api.Destination {
      return pcf.CentipedeCacheInfoLG.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 32, column 30
    function action_dest_97 () : pcf.api.Destination {
      return pcf.Profiler.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 34, column 31
    function action_dest_99 () : pcf.api.Destination {
      return pcf.JProfiler.createDestination()
    }
    
    // 'canVisit' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 10, column 26
    static function canVisit_102 () : java.lang.Boolean {
      return perm.User.ServerTools or perm.User.DevAllAccess
    }
    
    // LocationGroup (id=ServerTools) at ServerTools.pcf: line 10, column 26
    static function firstVisitableChildDestinationMethod_107 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.BatchProcessInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.WorkQueueInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.SetLogLevel.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ViewLogs.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.InfoPages.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.MBeans.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.StartablePlugin.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClusterPages.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.UpgradeInfo.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.CentipedeCacheInfoLG.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.Profiler.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.JProfiler.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.MetroFlows.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'menuActions' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 10, column 26
    function menuActions_onEnter_103 (def :  pcf.InternalToolsMenuActions) : void {
      def.onEnter()
    }
    
    // 'menuActions' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 10, column 26
    function menuActions_refreshVariables_104 (def :  pcf.InternalToolsMenuActions) : void {
      def.refreshVariables()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 10, column 26
    function tabBar_onEnter_105 (def :  pcf.InternalToolsTabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ServerTools) at ServerTools.pcf: line 10, column 26
    function tabBar_refreshVariables_106 (def :  pcf.InternalToolsTabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.ServerTools {
      return super.CurrentLocation as pcf.ServerTools
    }
    
    
  }
  
  
}