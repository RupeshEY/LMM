package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/UpgradeInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UpgradeInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/UpgradeInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends UpgradeInfoExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=BatchProcess) at UpgradeInfo.pcf: line 274, column 57
    function valueRoot_73 () : java.lang.Object {
      return processHistory
    }
    
    // 'value' attribute on TypeKeyCell (id=BatchProcess) at UpgradeInfo.pcf: line 274, column 57
    function value_71 () : typekey.BatchProcessType {
      return processHistory.ProcessType
    }
    
    // 'value' attribute on DateCell (id=StartDate) at UpgradeInfo.pcf: line 283, column 32
    function value_74 () : java.util.Date {
      return processHistory.StartDate
    }
    
    // 'value' attribute on DateCell (id=CompleteDate) at UpgradeInfo.pcf: line 291, column 32
    function value_77 () : java.util.Date {
      return processHistory.RanToCompletion ? processHistory.CompleteDate : null
    }
    
    // 'value' attribute on TextCell (id=OpsPerformed) at UpgradeInfo.pcf: line 296, column 50
    function value_79 () : java.lang.Integer {
      return processHistory.OpsPerformed
    }
    
    // 'value' attribute on TextCell (id=FailedOps) at UpgradeInfo.pcf: line 301, column 50
    function value_82 () : java.lang.Integer {
      return processHistory.FailedOps
    }
    
    // 'value' attribute on TextCell (id=FailureReason) at UpgradeInfo.pcf: line 306, column 57
    function value_85 () : java.lang.String {
      return processHistory.FailureReason
    }
    
    property get processHistory () : entity.ProcessHistory {
      return getIteratedValue(1) as entity.ProcessHistory
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/UpgradeInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends UpgradeInfoExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=View) at UpgradeInfo.pcf: line 214, column 66
    function action_58 () : void {
      ReportView.push("UpgradeInfo", UpgradeRow.PublicID)
    }
    
    // 'action' attribute on Link (id=Download) at UpgradeInfo.pcf: line 229, column 66
    function action_62 () : void {
      Page.download(UpgradeRow)
    }
    
    // 'action' attribute on Link (id=DeleteDetails) at UpgradeInfo.pcf: line 242, column 66
    function action_64 () : void {
      UpgradeRow.deleteAllChildren()
    }
    
    // 'action' attribute on Link (id=View) at UpgradeInfo.pcf: line 214, column 66
    function action_dest_59 () : pcf.api.Destination {
      return pcf.ReportView.createDestination("UpgradeInfo", UpgradeRow.PublicID)
    }
    
    // 'initialValue' attribute on Variable at UpgradeInfo.pcf: line 128, column 83
    function initialValue_33 () : gw.api.database.IQueryBeanResult<UpgradeRowCount> {
      return UpgradeRow.findUpgradeRowCounts() as gw.api.database.IQueryBeanResult<UpgradeRowCount>
    }
    
    // 'initialValue' attribute on Variable at UpgradeInfo.pcf: line 132, column 88
    function initialValue_34 () : gw.api.database.IQueryBeanResult<UpgradeTableRegistry> {
      return UpgradeRow.findUpgradeTableRegistries() as gw.api.database.IQueryBeanResult<UpgradeTableRegistry>
    }
    
    // 'initialValue' attribute on Variable at UpgradeInfo.pcf: line 136, column 87
    function initialValue_35 () : gw.api.database.IQueryBeanResult<UpgradeDBStorageSet> {
      return UpgradeRow.findUpgradeDBStorageSets(false) as gw.api.database.IQueryBeanResult<UpgradeDBStorageSet>
    }
    
    // RowIterator (id=UpgradeInstanceIterator) at UpgradeInfo.pcf: line 124, column 74
    function initializeVariables_65 () : void {
        RowCountsQuery = UpgradeRow.findUpgradeRowCounts() as gw.api.database.IQueryBeanResult<UpgradeRowCount>;
  TableRegistryQuery = UpgradeRow.findUpgradeTableRegistries() as gw.api.database.IQueryBeanResult<UpgradeTableRegistry>;
  StorageSetQueryBefore = UpgradeRow.findUpgradeDBStorageSets(false) as gw.api.database.IQueryBeanResult<UpgradeDBStorageSet>;

    }
    
    // 'label' attribute on Link (id=Status) at UpgradeInfo.pcf: line 147, column 59
    function label_38 () : java.lang.Object {
      return Page.getStatus(UpgradeRow)
    }
    
    // 'label' attribute on Link (id=DeferredTaskStatus) at UpgradeInfo.pcf: line 199, column 85
    function label_56 () : java.lang.Object {
      return Page.getDeferredUpgradeStatus(UpgradeRow).DisplayKey
    }
    
    // 'tooltip' attribute on Link (id=NotRunning) at UpgradeInfo.pcf: line 196, column 82
    function tooltip_55 () : java.lang.String {
      return Page.getDeferredUpgradeStatus(UpgradeRow).DisplayKey.localize()
    }
    
    // 'value' attribute on DateCell (id=TotalStartTime) at UpgradeInfo.pcf: line 160, column 39
    function valueRoot_43 () : java.lang.Object {
      return UpgradeRow
    }
    
    // 'value' attribute on TextCell (id=Version) at UpgradeInfo.pcf: line 141, column 61
    function value_36 () : java.lang.String {
      return Page.getBuildLabel(UpgradeRow)
    }
    
    // 'value' attribute on TextCell (id=Type) at UpgradeInfo.pcf: line 152, column 55
    function value_39 () : java.lang.String {
      return Page.getType(UpgradeRow)
    }
    
    // 'value' attribute on DateCell (id=TotalStartTime) at UpgradeInfo.pcf: line 160, column 39
    function value_41 () : java.util.Date {
      return UpgradeRow.StartTime
    }
    
    // 'value' attribute on DateCell (id=TotalEndTime) at UpgradeInfo.pcf: line 168, column 39
    function value_44 () : java.util.Date {
      return UpgradeRow.EndTime
    }
    
    // 'value' attribute on TextCell (id=DatabaseDuration) at UpgradeInfo.pcf: line 173, column 67
    function value_47 () : java.lang.String {
      return UpgradeRow.FormattedDatabaseDuration
    }
    
    // 'value' attribute on TextCell (id=TotalDuration) at UpgradeInfo.pcf: line 180, column 39
    function value_50 () : java.lang.String {
      return UpgradeRow.FormattedTotalDuration
    }
    
    // 'visible' attribute on Link (id=Completed) at UpgradeInfo.pcf: line 191, column 86
    function visible_53 () : java.lang.Boolean {
      return Page.getDeferredUpgradeStatus(UpgradeRow).Completed
    }
    
    // 'visible' attribute on Link (id=NotRunning) at UpgradeInfo.pcf: line 196, column 82
    function visible_54 () : java.lang.Boolean {
      return Page.getDeferredUpgradeStatus(UpgradeRow).Error
    }
    
    // 'visible' attribute on Link (id=View) at UpgradeInfo.pcf: line 214, column 66
    function visible_57 () : java.lang.Boolean {
      return UpgradeRow.ProfilerData != null
    }
    
    // 'visible' attribute on LinkCell (id=ViewLinkCell) at UpgradeInfo.pcf: line 206, column 71
    function visible_60 () : java.lang.Boolean {
      return gw.api.system.server.ServerModeUtil.Dev
    }
    
    property get RowCountsQuery () : gw.api.database.IQueryBeanResult<UpgradeRowCount> {
      return getVariableValue("RowCountsQuery", 1) as gw.api.database.IQueryBeanResult<UpgradeRowCount>
    }
    
    property set RowCountsQuery ($arg :  gw.api.database.IQueryBeanResult<UpgradeRowCount>) {
      setVariableValue("RowCountsQuery", 1, $arg)
    }
    
    property get StorageSetQueryBefore () : gw.api.database.IQueryBeanResult<UpgradeDBStorageSet> {
      return getVariableValue("StorageSetQueryBefore", 1) as gw.api.database.IQueryBeanResult<UpgradeDBStorageSet>
    }
    
    property set StorageSetQueryBefore ($arg :  gw.api.database.IQueryBeanResult<UpgradeDBStorageSet>) {
      setVariableValue("StorageSetQueryBefore", 1, $arg)
    }
    
    property get TableRegistryQuery () : gw.api.database.IQueryBeanResult<UpgradeTableRegistry> {
      return getVariableValue("TableRegistryQuery", 1) as gw.api.database.IQueryBeanResult<UpgradeTableRegistry>
    }
    
    property set TableRegistryQuery ($arg :  gw.api.database.IQueryBeanResult<UpgradeTableRegistry>) {
      setVariableValue("TableRegistryQuery", 1, $arg)
    }
    
    property get UpgradeRow () : entity.UpgradeInstance {
      return getIteratedValue(1) as entity.UpgradeInstance
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/UpgradeInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpgradeInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=InitiateBackout) at UpgradeInfo.pcf: line 54, column 80
    function action_11 () : void {
      if (!Page.DatabaseWorkInProgress and !Page.BackOutInProgress) { if (Page.UpgradeJustStarted) { Page.cancelRollingUpgrade() } else { InitiateBackoutConfirmPopup.push(Page) } }
    }
    
    // 'action' attribute on ToolbarButton (id=StartFull) at UpgradeInfo.pcf: line 59, column 50
    function action_14 () : void {
      StartFullUpgradePopup.push(Page)
    }
    
    // 'action' attribute on ToolbarButton (id=CancelFull) at UpgradeInfo.pcf: line 64, column 49
    function action_17 () : void {
      Page.cancelFullUpgrade()
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshButton) at UpgradeInfo.pcf: line 34, column 63
    function action_2 () : void {
      
    }
    
    // 'actionOnComplete' attribute on ProgressInput (id=BackOutProgress) at UpgradeInfo.pcf: line 85, column 47
    function action_23 () : void {
      UpgradeInfo.go()
    }
    
    // 'action' attribute on ToolbarButton (id=StartRolling) at UpgradeInfo.pcf: line 39, column 111
    function action_4 () : void {
      StartRollingUpgradePopup.push(Page)
    }
    
    // 'action' attribute on ToolbarButton (id=RollingComplete) at UpgradeInfo.pcf: line 46, column 79
    function action_8 () : void {
      Page.rollingUpgradeComplete()
    }
    
    // 'action' attribute on ToolbarButton (id=StartFull) at UpgradeInfo.pcf: line 59, column 50
    function action_dest_15 () : pcf.api.Destination {
      return pcf.StartFullUpgradePopup.createDestination(Page)
    }
    
    // 'actionOnComplete' attribute on ProgressInput (id=BackOutProgress) at UpgradeInfo.pcf: line 85, column 47
    function action_dest_24 () : pcf.api.Destination {
      return pcf.UpgradeInfo.createDestination()
    }
    
    // 'action' attribute on ToolbarButton (id=StartRolling) at UpgradeInfo.pcf: line 39, column 111
    function action_dest_5 () : pcf.api.Destination {
      return pcf.StartRollingUpgradePopup.createDestination(Page)
    }
    
    // 'afterEnter' attribute on Page (id=UpgradeInfo) at UpgradeInfo.pcf: line 11, column 81
    function afterEnter_90 () : void {
      if (Page.SomeUpgradeInProgress) { gw.api.util.LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("Web.InternalTools.InfoPages.UpgradeInfo.RollingInProgress")) }
    }
    
    // 'available' attribute on ToolbarButton (id=RollingComplete) at UpgradeInfo.pcf: line 46, column 79
    function available_6 () : java.lang.Boolean {
      return Page.DatabaseWorkDone
    }
    
    // 'available' attribute on ToolbarButton (id=InitiateBackout) at UpgradeInfo.pcf: line 54, column 80
    function available_9 () : java.lang.Boolean {
      return !Page.DatabaseWorkInProgress
    }
    
    // 'confirmMessage' attribute on ToolbarButton (id=InitiateBackout) at UpgradeInfo.pcf: line 54, column 80
    function confirmMessage_12 () : java.lang.String {
      return Page.DatabaseWorkInProgress ? DisplayKey.get("Web.InternalTools.InfoPages.UpgradeInfo.BackOutCannotStartMigrationInProgress") : Page.BackOutInProgress ? DisplayKey.get("Web.InternalTools.InfoPages.UpgradeInfo.BackOutCannotStartAnotherBackOutInProgress") : null
    }
    
    // 'initialValue' attribute on Variable at UpgradeInfo.pcf: line 17, column 50
    function initialValue_0 () : gw.api.tools.UpgradeInfoPageHelper {
      return new gw.api.tools.UpgradeInfoPageHelper()
    }
    
    // 'initialValue' attribute on Variable at UpgradeInfo.pcf: line 26, column 71
    function initialValue_1 () : gw.api.database.IQueryBeanResult<UpgradeInstance> {
      return Page.findAllUpgradeInstancesDateDescending()
    }
    
    // 'label' attribute on Verbatim at UpgradeInfo.pcf: line 68, column 48
    function label_19 () : java.lang.String {
      return Page.LatestUpgrade.UpdateStatistics ? DisplayKey.get("Web.InternalTools.InfoPages.UpgradeInfo.StatsUpdated") : (Page.hasRecentUpdateStatisticsProcessRun() ? DisplayKey.get("Web.InternalTools.InfoPages.UpgradeInfo.StatsNotUpdatedRecentRuns") : DisplayKey.get("Web.InternalTools.InfoPages.UpgradeInfo.StatsNotUpdatedNoRecentRuns"))
    }
    
    // 'label' attribute on Verbatim (id=CurrentVersion) at UpgradeInfo.pcf: line 73, column 124
    function label_20 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.InfoPages.UpgradeInfo.CurrentVersion", Page.ActiveBuildLabel)
    }
    
    // 'parent' attribute on Page (id=UpgradeInfo) at UpgradeInfo.pcf: line 11, column 81
    static function parent_91 () : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    // 'percentage' attribute on ProgressInput (id=BackOutProgress) at UpgradeInfo.pcf: line 85, column 47
    function percentage_25 () : java.lang.Double {
      return Page.BackOutInProgress ? -1 : 100
    }
    
    // 'value' attribute on RowIterator (id=UpgradeInstanceIterator) at UpgradeInfo.pcf: line 141, column 61
    function sortValue_26 (UpgradeRow :  entity.UpgradeInstance) : java.lang.Object {
      return Page.getBuildLabel(UpgradeRow)
    }
    
    // 'value' attribute on RowIterator (id=UpgradeInstanceIterator) at UpgradeInfo.pcf: line 152, column 55
    function sortValue_27 (UpgradeRow :  entity.UpgradeInstance) : java.lang.Object {
      return Page.getType(UpgradeRow)
    }
    
    // 'value' attribute on RowIterator (id=UpgradeInstanceIterator) at UpgradeInfo.pcf: line 160, column 39
    function sortValue_28 (UpgradeRow :  entity.UpgradeInstance) : java.lang.Object {
      return UpgradeRow.StartTime
    }
    
    // 'value' attribute on RowIterator (id=UpgradeInstanceIterator) at UpgradeInfo.pcf: line 168, column 39
    function sortValue_29 (UpgradeRow :  entity.UpgradeInstance) : java.lang.Object {
      return UpgradeRow.EndTime
    }
    
    // 'value' attribute on RowIterator (id=UpgradeInstanceIterator) at UpgradeInfo.pcf: line 173, column 67
    function sortValue_30 (UpgradeRow :  entity.UpgradeInstance) : java.lang.Object {
      return UpgradeRow.FormattedDatabaseDuration
    }
    
    // 'value' attribute on RowIterator (id=UpgradeInstanceIterator) at UpgradeInfo.pcf: line 180, column 39
    function sortValue_31 (UpgradeRow :  entity.UpgradeInstance) : java.lang.Object {
      return UpgradeRow.FormattedTotalDuration
    }
    
    // 'value' attribute on RowIterator at UpgradeInfo.pcf: line 274, column 57
    function sortValue_67 (processHistory :  entity.ProcessHistory) : java.lang.Object {
      return processHistory.ProcessType
    }
    
    // 'value' attribute on RowIterator at UpgradeInfo.pcf: line 283, column 32
    function sortValue_68 (processHistory :  entity.ProcessHistory) : java.lang.Object {
      return processHistory.StartDate
    }
    
    // 'value' attribute on RowIterator at UpgradeInfo.pcf: line 296, column 50
    function sortValue_69 (processHistory :  entity.ProcessHistory) : java.lang.Object {
      return processHistory.OpsPerformed
    }
    
    // 'value' attribute on RowIterator at UpgradeInfo.pcf: line 301, column 50
    function sortValue_70 (processHistory :  entity.ProcessHistory) : java.lang.Object {
      return processHistory.FailedOps
    }
    
    // 'value' attribute on RowIterator (id=UpgradeInstanceIterator) at UpgradeInfo.pcf: line 124, column 74
    function value_66 () : java.util.List<entity.UpgradeInstance> {
      return Page.findAllUpgradeInstancesDateDescending().iterator().toList()
    }
    
    // 'value' attribute on RowIterator at UpgradeInfo.pcf: line 268, column 89
    function value_88 () : gw.api.database.IQueryBeanResult<entity.ProcessHistory> {
      return Page.findUpdateStatisticsProcessesAfterLatestUpgrade()
    }
    
    // 'visible' attribute on ToolbarButton (id=InitiateBackout) at UpgradeInfo.pcf: line 54, column 80
    function visible_10 () : java.lang.Boolean {
      return Page.RollingUpgradeInProgress and !Page.LocalSameAsTarget
    }
    
    // 'visible' attribute on ToolbarButton (id=StartFull) at UpgradeInfo.pcf: line 59, column 50
    function visible_13 () : java.lang.Boolean {
      return !Page.SomeUpgradeInProgress
    }
    
    // 'visible' attribute on ToolbarButton (id=CancelFull) at UpgradeInfo.pcf: line 64, column 49
    function visible_16 () : java.lang.Boolean {
      return Page.FullUpgradeInProgress
    }
    
    // 'visible' attribute on ProgressInput (id=BackOutProgress) at UpgradeInfo.pcf: line 85, column 47
    function visible_21 () : java.lang.Boolean {
      return Page.BackOutInProgress
    }
    
    // 'visible' attribute on ToolbarButton (id=StartRolling) at UpgradeInfo.pcf: line 39, column 111
    function visible_3 () : java.lang.Boolean {
      return !Page.SomeUpgradeInProgress and gw.api.system.PLConfigParameters.ClusteringEnabled.Value
    }
    
    // 'visible' attribute on RowIterator (id=UpgradeInstanceIterator) at UpgradeInfo.pcf: line 206, column 71
    function visible_32 () : java.lang.Boolean {
      return gw.api.system.server.ServerModeUtil.Dev
    }
    
    // 'visible' attribute on ToolbarButton (id=RollingComplete) at UpgradeInfo.pcf: line 46, column 79
    function visible_7 () : java.lang.Boolean {
      return Page.RollingUpgradeInProgress and Page.LocalSameAsTarget
    }
    
    // 'visible' attribute on PanelSet (id=StatisticsPanelSet) at UpgradeInfo.pcf: line 257, column 137
    function visible_89 () : java.lang.Boolean {
      return Page.LatestUpgrade != null and not Page.LatestUpgrade.UpdateStatistics and Page.hasRecentUpdateStatisticsProcessRun()
    }
    
    override property get CurrentLocation () : pcf.UpgradeInfo {
      return super.CurrentLocation as pcf.UpgradeInfo
    }
    
    property get Page () : gw.api.tools.UpgradeInfoPageHelper {
      return getVariableValue("Page", 0) as gw.api.tools.UpgradeInfoPageHelper
    }
    
    property set Page ($arg :  gw.api.tools.UpgradeInfoPageHelper) {
      setVariableValue("Page", 0, $arg)
    }
    
    property get UpgradeRows () : gw.api.database.IQueryBeanResult<UpgradeInstance> {
      return getVariableValue("UpgradeRows", 0) as gw.api.database.IQueryBeanResult<UpgradeInstance>
    }
    
    property set UpgradeRows ($arg :  gw.api.database.IQueryBeanResult<UpgradeInstance>) {
      setVariableValue("UpgradeRows", 0, $arg)
    }
    
    property get hideInfoMsg () : boolean {
      return getVariableValue("hideInfoMsg", 0) as java.lang.Boolean
    }
    
    property set hideInfoMsg ($arg :  boolean) {
      setVariableValue("hideInfoMsg", 0, $arg)
    }
    
    
  }
  
  
}