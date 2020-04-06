package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/OracleAWRInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OracleAWRInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/OracleAWRInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleAWRInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=OracleAWRInfo) at OracleAWRInfo.pcf: line 12, column 83
    static function canVisit_99 () : java.lang.Boolean {
      return gw.api.tools.OracleAWRHelper.dbSupportsAWR()
    }
    
    // 'initialValue' attribute on Variable at OracleAWRInfo.pcf: line 16, column 44
    function initialValue_0 () : gw.api.tools.OracleAWRHelper {
      return new gw.api.tools.OracleAWRHelper()
    }
    
    // 'initialValue' attribute on Variable at OracleAWRInfo.pcf: line 28, column 53
    function initialValue_1 () : gw.api.database.AWRReportUserSettings {
      return (new gw.api.database.AWRReportUserSettingsFactory()).AwrReportUserSettings
    }
    
    // 'parent' attribute on Page (id=OracleAWRInfo) at OracleAWRInfo.pcf: line 12, column 83
    static function parent_100 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    property get AwrReportUserSettings () : gw.api.database.AWRReportUserSettings {
      return getVariableValue("AwrReportUserSettings", 0) as gw.api.database.AWRReportUserSettings
    }
    
    property set AwrReportUserSettings ($arg :  gw.api.database.AWRReportUserSettings) {
      setVariableValue("AwrReportUserSettings", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.OracleAWRInfo {
      return super.CurrentLocation as pcf.OracleAWRInfo
    }
    
    property get PageHelper () : gw.api.tools.OracleAWRHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.OracleAWRHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.OracleAWRHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get Paging () : Boolean {
      return getVariableValue("Paging", 0) as Boolean
    }
    
    property set Paging ($arg :  Boolean) {
      setVariableValue("Paging", 0, $arg)
    }
    
    property get ReportDescription () : java.lang.String {
      return getVariableValue("ReportDescription", 0) as java.lang.String
    }
    
    property set ReportDescription ($arg :  java.lang.String) {
      setVariableValue("ReportDescription", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/OracleAWRInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleAWRInfoScreenExpressionsImpl extends OracleAWRInfoExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=submitBatch) at OracleAWRInfo.pcf: line 77, column 112
    function action_10 () : void {
      PageHelper.submitBatchFromUI(AwrReportUserSettings)
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButton) at OracleAWRInfo.pcf: line 50, column 112
    function action_3 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=TogglePaging) at OracleAWRInfo.pcf: line 204, column 176
    function action_91 () : void {
      Paging = !Paging
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshAWRs) at OracleAWRInfo.pcf: line 208, column 69
    function action_93 () : void {
      PageHelper.loadAwrSnapshots();
    }
    
    // 'available' attribute on ButtonInput (id=submitBatch) at OracleAWRInfo.pcf: line 77, column 112
    function available_8 () : java.lang.Boolean {
      return PageHelper.isReadyToDownload(false) and !PageHelper.BatchRunning
    }
    
    // 'def' attribute on ListViewInput (id=PerfDownloadLV) at OracleAWRInfo.pcf: line 45, column 33
    function def_onEnter_4 (def :  pcf.PerfDownloadLV) : void {
      def.onEnter(PageHelper)
    }
    
    // 'def' attribute on PanelRef (id=snapshotsPanel) at OracleAWRInfo.pcf: line 198, column 71
    function def_onEnter_94 (def :  pcf.OracleAWRLV_nopaging) : void {
      def.onEnter(AWRSnapshots)
    }
    
    // 'def' attribute on PanelRef (id=snapshotsPanel) at OracleAWRInfo.pcf: line 198, column 71
    function def_onEnter_96 (def :  pcf.OracleAWRLV_paging) : void {
      def.onEnter(AWRSnapshots)
    }
    
    // 'def' attribute on ListViewInput (id=PerfDownloadLV) at OracleAWRInfo.pcf: line 45, column 33
    function def_refreshVariables_5 (def :  pcf.PerfDownloadLV) : void {
      def.refreshVariables(PageHelper)
    }
    
    // 'def' attribute on PanelRef (id=snapshotsPanel) at OracleAWRInfo.pcf: line 198, column 71
    function def_refreshVariables_95 (def :  pcf.OracleAWRLV_nopaging) : void {
      def.refreshVariables(AWRSnapshots)
    }
    
    // 'def' attribute on PanelRef (id=snapshotsPanel) at OracleAWRInfo.pcf: line 198, column 71
    function def_refreshVariables_97 (def :  pcf.OracleAWRLV_paging) : void {
      def.refreshVariables(AWRSnapshots)
    }
    
    // 'value' attribute on CheckBoxInput (id=ProbeVDollarTablesFlag) at OracleAWRInfo.pcf: line 90, column 66
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.ProbeVDollarTables = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=CapturePeakedBindVariables) at OracleAWRInfo.pcf: line 100, column 75
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.CapturePeakedBindVariables = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=ProbeInMemorySQLMonitor) at OracleAWRInfo.pcf: line 107, column 71
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.ProbeInMemorySQLMonitor = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=InMemorySQLMonitorIncludeAllExecutions) at OracleAWRInfo.pcf: line 117, column 87
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.InMemorySQLMonitorIncludeAllExecutions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=SearchForQueriesWithMultiplePlansFlag) at OracleAWRInfo.pcf: line 122, column 82
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.SearchForQueriesWithMultiplePlans = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=SearchForQueriesOnlyInFirstSnapshotFlag) at OracleAWRInfo.pcf: line 127, column 84
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.SearchForQueriesOnlyInFirstSnapshot = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=SearchForQueriesOnlyInLastSnapshotFlag) at OracleAWRInfo.pcf: line 132, column 83
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.SearchForQueriesOnlyInLastSnapshot = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeMetadataForInstrumentationTables) at OracleAWRInfo.pcf: line 137, column 88
    function defaultSetter_50 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.IncludeMetadataForInstrumentationTables = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeDatabaseStatistics) at OracleAWRInfo.pcf: line 142, column 74
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.IncludeDatabaseStatistics = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=ProbeOnDiskSQLMonitor) at OracleAWRInfo.pcf: line 151, column 69
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.ProbeOnDiskSQLMonitor = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=OnDiskSQLMonitorIncludeAllExecutions) at OracleAWRInfo.pcf: line 161, column 85
    function defaultSetter_65 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.OnDiskSQLMonitorIncludeAllExecutions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=CapturePeakedBindVariablesFromAWR) at OracleAWRInfo.pcf: line 166, column 82
    function defaultSetter_69 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.CapturePeakedBindVariablesFromAWR = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=GenerateCallsToASHScripts) at OracleAWRInfo.pcf: line 171, column 74
    function defaultSetter_73 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.GenerateCallsToASHScripts = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=ConcurrentMessagingAnalysis) at OracleAWRInfo.pcf: line 176, column 76
    function defaultSetter_77 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.ConcurrentMessagingAnalysis = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=ConcurrentBatchProcessAndWorkerAnalysis) at OracleAWRInfo.pcf: line 181, column 88
    function defaultSetter_81 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.ConcurrentBatchProcessAndWorkerAnalysis = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=ConcurrentHistoryAnalysis) at OracleAWRInfo.pcf: line 186, column 74
    function defaultSetter_85 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.ConcurrentHistoryAnalysis = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeNativeOracleAWRReport) at OracleAWRInfo.pcf: line 192, column 77
    function defaultSetter_89 (__VALUE_TO_SET :  java.lang.Object) : void {
      AwrReportUserSettings.IncludeNativeOracleAWRReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'helpText' attribute on CheckBoxInput (id=ProbeVDollarTablesFlag) at OracleAWRInfo.pcf: line 90, column 66
    function helpText_13 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.InfoPages.OracleAWR.ProbeVDollarTables.Required2", DisplayKey.get("Web.InternalTools.InfoPages.OracleAWR.CapturePeakedBindVariables"), DisplayKey.get("Web.InternalTools.InfoPages.OracleAWR.ProbeInMemorySQLMonitor")) 
    }
    
    // 'initialValue' attribute on Variable at OracleAWRInfo.pcf: line 35, column 56
    function initialValue_2 () : gw.api.database.DatabaseSnapshotInfo[] {
      return PageHelper.AWRSnapshots
    }
    
    // 'label' attribute on ToolbarButton (id=TogglePaging) at OracleAWRInfo.pcf: line 204, column 176
    function label_92 () : java.lang.Object {
      return Paging ? DisplayKey.get("Web.InternalTools.InfoPages.DisablePaging") : DisplayKey.get("Web.InternalTools.InfoPages.EnablePaging")
    }
    
    // 'mode' attribute on PanelRef (id=snapshotsPanel) at OracleAWRInfo.pcf: line 198, column 71
    function mode_98 () : java.lang.Object {
      return Paging ? "paging" : "nopaging"
    }
    
    // 'onChange' attribute on PostOnChange at OracleAWRInfo.pcf: line 92, column 192
    function onChange_11 () : void {
      if (!AwrReportUserSettings.ProbeVDollarTables) {AwrReportUserSettings.CapturePeakedBindVariables = false; AwrReportUserSettings.ProbeInMemorySQLMonitor = false}
    }
    
    // 'onChange' attribute on PostOnChange at OracleAWRInfo.pcf: line 109, column 154
    function onChange_23 () : void {
      if (!AwrReportUserSettings.ProbeInMemorySQLMonitor) {AwrReportUserSettings.InMemorySQLMonitorIncludeAllExecutions = false}
    }
    
    // 'onChange' attribute on PostOnChange at OracleAWRInfo.pcf: line 153, column 150
    function onChange_56 () : void {
      if (!AwrReportUserSettings.ProbeOnDiskSQLMonitor) {AwrReportUserSettings.OnDiskSQLMonitorIncludeAllExecutions = false}
    }
    
    // 'percentage' attribute on ProgressInput (id=batchProgress) at OracleAWRInfo.pcf: line 58, column 33
    function percentage_6 () : java.lang.Double {
      return PageHelper.BatchRunning ? -1 : 100
    }
    
    // 'status' attribute on ProgressInput (id=batchProgress) at OracleAWRInfo.pcf: line 58, column 33
    function status_7 () : java.lang.String {
      return PageHelper.BatchRunning ? DisplayKey.get("Web.InternalTools.InfoPages.PerfDownload.RunningBatchProcess") : null
    }
    
    // 'value' attribute on CheckBoxInput (id=ProbeVDollarTablesFlag) at OracleAWRInfo.pcf: line 90, column 66
    function valueRoot_16 () : java.lang.Object {
      return AwrReportUserSettings
    }
    
    // 'value' attribute on CheckBoxInput (id=ProbeVDollarTablesFlag) at OracleAWRInfo.pcf: line 90, column 66
    function value_12 () : java.lang.Boolean {
      return AwrReportUserSettings.ProbeVDollarTables
    }
    
    // 'value' attribute on CheckBoxInput (id=CapturePeakedBindVariables) at OracleAWRInfo.pcf: line 100, column 75
    function value_18 () : java.lang.Boolean {
      return AwrReportUserSettings.CapturePeakedBindVariables
    }
    
    // 'value' attribute on CheckBoxInput (id=ProbeInMemorySQLMonitor) at OracleAWRInfo.pcf: line 107, column 71
    function value_25 () : java.lang.Boolean {
      return AwrReportUserSettings.ProbeInMemorySQLMonitor
    }
    
    // 'value' attribute on CheckBoxInput (id=InMemorySQLMonitorIncludeAllExecutions) at OracleAWRInfo.pcf: line 117, column 87
    function value_31 () : java.lang.Boolean {
      return AwrReportUserSettings.InMemorySQLMonitorIncludeAllExecutions
    }
    
    // 'value' attribute on CheckBoxInput (id=SearchForQueriesWithMultiplePlansFlag) at OracleAWRInfo.pcf: line 122, column 82
    function value_36 () : java.lang.Boolean {
      return AwrReportUserSettings.SearchForQueriesWithMultiplePlans
    }
    
    // 'value' attribute on CheckBoxInput (id=SearchForQueriesOnlyInFirstSnapshotFlag) at OracleAWRInfo.pcf: line 127, column 84
    function value_40 () : java.lang.Boolean {
      return AwrReportUserSettings.SearchForQueriesOnlyInFirstSnapshot
    }
    
    // 'value' attribute on CheckBoxInput (id=SearchForQueriesOnlyInLastSnapshotFlag) at OracleAWRInfo.pcf: line 132, column 83
    function value_44 () : java.lang.Boolean {
      return AwrReportUserSettings.SearchForQueriesOnlyInLastSnapshot
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeMetadataForInstrumentationTables) at OracleAWRInfo.pcf: line 137, column 88
    function value_48 () : java.lang.Boolean {
      return AwrReportUserSettings.IncludeMetadataForInstrumentationTables
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeDatabaseStatistics) at OracleAWRInfo.pcf: line 142, column 74
    function value_52 () : java.lang.Boolean {
      return AwrReportUserSettings.IncludeDatabaseStatistics
    }
    
    // 'value' attribute on CheckBoxInput (id=ProbeOnDiskSQLMonitor) at OracleAWRInfo.pcf: line 151, column 69
    function value_57 () : java.lang.Boolean {
      return AwrReportUserSettings.ProbeOnDiskSQLMonitor
    }
    
    // 'value' attribute on CheckBoxInput (id=OnDiskSQLMonitorIncludeAllExecutions) at OracleAWRInfo.pcf: line 161, column 85
    function value_62 () : java.lang.Boolean {
      return AwrReportUserSettings.OnDiskSQLMonitorIncludeAllExecutions
    }
    
    // 'value' attribute on CheckBoxInput (id=CapturePeakedBindVariablesFromAWR) at OracleAWRInfo.pcf: line 166, column 82
    function value_67 () : java.lang.Boolean {
      return AwrReportUserSettings.CapturePeakedBindVariablesFromAWR
    }
    
    // 'value' attribute on CheckBoxInput (id=GenerateCallsToASHScripts) at OracleAWRInfo.pcf: line 171, column 74
    function value_71 () : java.lang.Boolean {
      return AwrReportUserSettings.GenerateCallsToASHScripts
    }
    
    // 'value' attribute on CheckBoxInput (id=ConcurrentMessagingAnalysis) at OracleAWRInfo.pcf: line 176, column 76
    function value_75 () : java.lang.Boolean {
      return AwrReportUserSettings.ConcurrentMessagingAnalysis
    }
    
    // 'value' attribute on CheckBoxInput (id=ConcurrentBatchProcessAndWorkerAnalysis) at OracleAWRInfo.pcf: line 181, column 88
    function value_79 () : java.lang.Boolean {
      return AwrReportUserSettings.ConcurrentBatchProcessAndWorkerAnalysis
    }
    
    // 'value' attribute on CheckBoxInput (id=ConcurrentHistoryAnalysis) at OracleAWRInfo.pcf: line 186, column 74
    function value_83 () : java.lang.Boolean {
      return AwrReportUserSettings.ConcurrentHistoryAnalysis
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeNativeOracleAWRReport) at OracleAWRInfo.pcf: line 192, column 77
    function value_87 () : java.lang.Boolean {
      return AwrReportUserSettings.IncludeNativeOracleAWRReport
    }
    
    property get AWRSnapshots () : gw.api.database.DatabaseSnapshotInfo[] {
      return getVariableValue("AWRSnapshots", 1) as gw.api.database.DatabaseSnapshotInfo[]
    }
    
    property set AWRSnapshots ($arg :  gw.api.database.DatabaseSnapshotInfo[]) {
      setVariableValue("AWRSnapshots", 1, $arg)
    }
    
    
  }
  
  
}