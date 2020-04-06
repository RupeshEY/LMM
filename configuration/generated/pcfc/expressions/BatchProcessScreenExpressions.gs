package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/BatchProcessScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BatchProcessScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/BatchProcessScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BatchProcessInfo_ProcessHistoryLVExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at BatchProcessScreen.pcf: line 246, column 78
    function filters_62 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return gw.api.web.tools.BatchProcessInfoPage.FILTERS
    }
    
    // 'initialValue' attribute on Variable at BatchProcessScreen.pcf: line 236, column 80
    function initialValue_61 () : gw.api.database.IQueryBeanResult<ProcessHistory> {
      return Page.findProcessHistory(SelectedProcess) as gw.api.database.IQueryBeanResult<ProcessHistory>
    }
    
    // 'value' attribute on RowIterator at BatchProcessScreen.pcf: line 256, column 46
    function sortValue_63 (ph :  entity.ProcessHistory) : java.lang.Object {
      return ph.CreationDate
    }
    
    // 'value' attribute on RowIterator at BatchProcessScreen.pcf: line 262, column 43
    function sortValue_64 (ph :  entity.ProcessHistory) : java.lang.Object {
      return ph.StartDate
    }
    
    // 'value' attribute on RowIterator at BatchProcessScreen.pcf: line 273, column 43
    function sortValue_65 (ph :  entity.ProcessHistory) : java.lang.Object {
      return ph.Scheduled
    }
    
    // 'value' attribute on RowIterator at BatchProcessScreen.pcf: line 288, column 52
    function sortValue_66 (ph :  entity.ProcessHistory) : java.lang.Object {
      return ph.OpsPerformed
    }
    
    // 'value' attribute on RowIterator at BatchProcessScreen.pcf: line 293, column 52
    function sortValue_67 (ph :  entity.ProcessHistory) : java.lang.Object {
      return ph.FailedOps
    }
    
    // 'value' attribute on RowIterator at BatchProcessScreen.pcf: line 242, column 91
    function value_94 () : gw.api.database.IQueryBeanResult<entity.ProcessHistory> {
      return qp
    }
    
    property get qp () : gw.api.database.IQueryBeanResult<ProcessHistory> {
      return getVariableValue("qp", 2) as gw.api.database.IQueryBeanResult<ProcessHistory>
    }
    
    property set qp ($arg :  gw.api.database.IQueryBeanResult<ProcessHistory>) {
      setVariableValue("qp", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/BatchProcessScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BatchProcessScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at BatchProcessScreen.pcf: line 14, column 53
    function initialValue_0 () : gw.api.web.tools.BatchProcessInfoPage {
      return new gw.api.web.tools.BatchProcessInfoPage()
    }
    
    // 'visible' attribute on AlertBar (id=SchedulerSuspendedAlert) at BatchProcessScreen.pcf: line 19, column 42
    function visible_1 () : java.lang.Boolean {
      return Page.SchedulerSuspended
    }
    
    property get Page () : gw.api.web.tools.BatchProcessInfoPage {
      return getVariableValue("Page", 0) as gw.api.web.tools.BatchProcessInfoPage
    }
    
    property set Page ($arg :  gw.api.web.tools.BatchProcessInfoPage) {
      setVariableValue("Page", 0, $arg)
    }
    
    property get batchProcessTypes () : BatchProcessType[] {
      return getRequireValue("batchProcessTypes", 0) as BatchProcessType[]
    }
    
    property set batchProcessTypes ($arg :  BatchProcessType[]) {
      setRequireValue("batchProcessTypes", 0, $arg)
    }
    
    function calculatePercentage(processStatus : gw.api.webservice.maintenanceTools.ProcessStatus) : int {
      if (not processStatus.StartingOrExecuting) {
        return 100
      }
      if (processStatus.OpsExpected <= 0 or processStatus.OpsExpected <= processStatus.OpsCompleted) {
        return -1
      }
      return ((processStatus.OpsCompleted * 100) / processStatus.OpsExpected)
    }
    
    function formatSchedule(actualSchedule : String, scheduleFromConfiguration : String) : String {
      if (scheduleFromConfiguration == actualSchedule) {
        return actualSchedule
      } else {
        return DisplayKey.get("Web.InternalTools.BatchProcessInfo.ChangedScheduleTemplate", actualSchedule, scheduleFromConfiguration ?: DisplayKey.get("Java.None"))
      }
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/BatchProcessScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChartPanelExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'dataValues' attribute on DataSeries at BatchProcessScreen.pcf: line 214, column 41
    function dataValues_52 () : java.lang.Object {
      return qp
    }
    
    // 'height' attribute on ChartPanel at BatchProcessScreen.pcf: line 195, column 25
    function height_59 () : java.lang.Double {
      return 500
    }
    
    // 'initialValue' attribute on Variable at BatchProcessScreen.pcf: line 200, column 78
    function initialValue_51 () : gw.api.database.IQueryBeanResult<ProcessHistory> {
      return Page.findLastProcessHistory( SelectedProcess, 14 ) as gw.api.database.IQueryBeanResult<ProcessHistory>
    }
    
    // 'value' attribute on DataSeries at BatchProcessScreen.pcf: line 214, column 41
    function value_53 (value :  entity.ProcessHistory) : java.lang.Object {
      return (value.CompleteDate.Time - value.StartDate.Time)/1000
    }
    
    // 'value' attribute on DualAxisDataSeries at BatchProcessScreen.pcf: line 222, column 43
    function value_57 (value :  entity.ProcessHistory) : java.lang.Object {
      return value.OpsPerformed
    }
    
    // 'visible' attribute on ChartPanel at BatchProcessScreen.pcf: line 195, column 25
    function visible_58 () : java.lang.Boolean {
      return qp.getCount() > 0
    }
    
    // 'width' attribute on ChartPanel at BatchProcessScreen.pcf: line 195, column 25
    function width_60 () : java.lang.Double {
      return 750
    }
    
    // 'xValue' attribute on DataSeries at BatchProcessScreen.pcf: line 214, column 41
    function xValue_54 (value :  entity.ProcessHistory) : java.lang.Object {
      return value.StartDate
    }
    
    property get qp () : gw.api.database.IQueryBeanResult<ProcessHistory> {
      return getVariableValue("qp", 2) as gw.api.database.IQueryBeanResult<ProcessHistory>
    }
    
    property set qp ($arg :  gw.api.database.IQueryBeanResult<ProcessHistory>) {
      setVariableValue("qp", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/BatchProcessScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends BatchProcessInfo_ProcessHistoryLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=StartRequestedDate) at BatchProcessScreen.pcf: line 256, column 46
    function valueRoot_70 () : java.lang.Object {
      return ph
    }
    
    // 'value' attribute on DateCell (id=StartRequestedDate) at BatchProcessScreen.pcf: line 256, column 46
    function value_68 () : java.util.Date {
      return ph.CreationDate
    }
    
    // 'value' attribute on DateCell (id=StartDate) at BatchProcessScreen.pcf: line 262, column 43
    function value_71 () : java.util.Date {
      return ph.StartDate
    }
    
    // 'value' attribute on DateCell (id=CompleteDate) at BatchProcessScreen.pcf: line 269, column 74
    function value_74 () : java.util.Date {
      return ph.RanToCompletion ? ph.CompleteDate : null
    }
    
    // 'value' attribute on BooleanRadioCell (id=Scheduled) at BatchProcessScreen.pcf: line 273, column 43
    function value_76 () : java.lang.Boolean {
      return ph.Scheduled
    }
    
    // 'value' attribute on TextCell (id=ServerId) at BatchProcessScreen.pcf: line 278, column 42
    function value_79 () : java.lang.String {
      return ph.ServerId
    }
    
    // 'value' attribute on TextCell (id=Description) at BatchProcessScreen.pcf: line 283, column 45
    function value_82 () : java.lang.String {
      return ph.Description
    }
    
    // 'value' attribute on TextCell (id=OpsPerformed) at BatchProcessScreen.pcf: line 288, column 52
    function value_85 () : java.lang.Integer {
      return ph.OpsPerformed
    }
    
    // 'value' attribute on TextCell (id=FailedOps) at BatchProcessScreen.pcf: line 293, column 52
    function value_88 () : java.lang.Integer {
      return ph.FailedOps
    }
    
    // 'value' attribute on TextCell (id=FailureReason) at BatchProcessScreen.pcf: line 298, column 47
    function value_91 () : java.lang.String {
      return ph.FailureReason
    }
    
    property get ph () : entity.ProcessHistory {
      return getIteratedValue(3) as entity.ProcessHistory
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/BatchProcessScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=RunBatchWithoutNotify) at BatchProcessScreen.pcf: line 114, column 44
    function action_26 () : void {
      Page.start(batchProcess)
    }
    
    // 'action' attribute on Link (id=TerminateBatchWithoutNotify) at BatchProcessScreen.pcf: line 120, column 44
    function action_28 () : void {
      batchProcess.requestTermination()
    }
    
    // 'action' attribute on Link (id=DownloadHistory) at BatchProcessScreen.pcf: line 126, column 44
    function action_29 () : void {
      SelectedProcess = batchProcessType; BatchProcessDownloadConfigure.go(batchProcessType)
    }
    
    // 'action' attribute on Link (id=ScheduleStop) at BatchProcessScreen.pcf: line 161, column 44
    function action_41 () : void {
      Page.stopSchedule(batchProcessType)
    }
    
    // 'action' attribute on Link (id=ScheduleStart) at BatchProcessScreen.pcf: line 167, column 44
    function action_43 () : void {
      Page.startSchedule(batchProcessType)
    }
    
    // 'action' attribute on Link (id=ScheduleSync) at BatchProcessScreen.pcf: line 174, column 68
    function action_45 () : void {
      Page.syncScheduleWithConfiguration(batchProcessType)
    }
    
    // 'available' attribute on Link (id=RunBatchWithoutNotify) at BatchProcessScreen.pcf: line 114, column 44
    function available_25 () : java.lang.Boolean {
      return batchProcessType.hasCategory(BatchProcessTypeUsage.TC_UIRUNNABLE) and not status.StartingOrExecuting
    }
    
    // 'available' attribute on Link (id=TerminateBatchWithoutNotify) at BatchProcessScreen.pcf: line 120, column 44
    function available_27 () : java.lang.Boolean {
      return status.StartingOrExecuting
    }
    
    // 'available' attribute on LinkCell (id=RunBatchWithoutNotifyContent) at BatchProcessScreen.pcf: line 108, column 29
    function available_30 () : java.lang.Boolean {
      return batchProcessType.hasCategory( BatchProcessTypeUsage.TC_UIRUNNABLE)
    }
    
    // 'available' attribute on Link (id=ScheduleStop) at BatchProcessScreen.pcf: line 161, column 44
    function available_40 () : java.lang.Boolean {
      return nextDate != null
    }
    
    // 'available' attribute on Link (id=ScheduleStart) at BatchProcessScreen.pcf: line 167, column 44
    function available_42 () : java.lang.Boolean {
      return nextDate == null and schedule != null and schedule != ""
    }
    
    // 'initialValue' attribute on Variable at BatchProcessScreen.pcf: line 63, column 49
    function initialValue_15 () : gw.api.tools.BatchProcess {
      return new gw.api.tools.BatchProcess( batchProcessType )
    }
    
    // 'initialValue' attribute on Variable at BatchProcessScreen.pcf: line 68, column 72
    function initialValue_16 () : gw.api.webservice.maintenanceTools.ProcessStatus {
      return batchProcess.ProcessStatus
    }
    
    // 'initialValue' attribute on Variable at BatchProcessScreen.pcf: line 73, column 40
    function initialValue_17 () : java.lang.String {
      return gw.api.tools.BatchProcess.getSchedule( batchProcessType )
    }
    
    // 'initialValue' attribute on Variable at BatchProcessScreen.pcf: line 78, column 40
    function initialValue_18 () : java.lang.String {
      return Page.getScheduleFromConfiguration( batchProcessType )
    }
    
    // 'initialValue' attribute on Variable at BatchProcessScreen.pcf: line 83, column 38
    function initialValue_19 () : java.util.Date {
      return gw.api.tools.BatchProcess.getNextRun( batchProcessType )
    }
    
    // RowIterator at BatchProcessScreen.pcf: line 59, column 52
    function initializeVariables_49 () : void {
        batchProcess = new gw.api.tools.BatchProcess( batchProcessType );
  status = batchProcess.ProcessStatus;
  schedule = gw.api.tools.BatchProcess.getSchedule( batchProcessType );
  scheduleFromConfiguration = Page.getScheduleFromConfiguration( batchProcessType );
  nextDate = gw.api.tools.BatchProcess.getNextRun( batchProcessType );

    }
    
    // 'value' attribute on TextCell (id=Description) at BatchProcessScreen.pcf: line 102, column 30
    function valueRoot_24 () : java.lang.Object {
      return batchProcessType
    }
    
    // 'value' attribute on DateCell (id=LastRun) at BatchProcessScreen.pcf: line 139, column 30
    function valueRoot_35 () : java.lang.Object {
      return status
    }
    
    // 'value' attribute on TypeKeyCell (id=BatchProcess) at BatchProcessScreen.pcf: line 97, column 30
    function value_20 () : typekey.BatchProcessType {
      return batchProcessType
    }
    
    // 'value' attribute on TextCell (id=Description) at BatchProcessScreen.pcf: line 102, column 30
    function value_22 () : java.lang.String {
      return batchProcessType.Description
    }
    
    // 'value' attribute on DateCell (id=LastRun) at BatchProcessScreen.pcf: line 139, column 30
    function value_33 () : java.util.Date {
      return status.DateCreated
    }
    
    // 'value' attribute on TextCell (id=LastRunStatus) at BatchProcessScreen.pcf: line 144, column 30
    function value_36 () : java.lang.String {
      return gw.api.tools.BatchProcess.formatStatus(status)
    }
    
    // 'value' attribute on DateCell (id=NextRun) at BatchProcessScreen.pcf: line 151, column 30
    function value_38 () : java.util.Date {
      return nextDate
    }
    
    // 'value' attribute on TextCell (id=Schedule) at BatchProcessScreen.pcf: line 181, column 30
    function value_46 () : java.lang.String {
      return formatSchedule(schedule, scheduleFromConfiguration)
    }
    
    // 'visible' attribute on LinkCell (id=RunBatchWithoutNotifyContent) at BatchProcessScreen.pcf: line 108, column 29
    function visible_31 () : java.lang.Boolean {
      return perm.User.EditBatchProcess or perm.User.DevAllAccess
    }
    
    // 'visible' attribute on Link (id=ScheduleSync) at BatchProcessScreen.pcf: line 174, column 68
    function visible_44 () : java.lang.Boolean {
      return schedule != scheduleFromConfiguration
    }
    
    // 'visible' attribute on Row at BatchProcessScreen.pcf: line 90, column 140
    function visible_48 () : java.lang.Boolean {
      return batchProcessType != typekey.BatchProcessType.TC_ARCHIVE or gw.api.web.tools.ArchiveInfoPage.isArchivingAvailable()
    }
    
    property get batchProcess () : gw.api.tools.BatchProcess {
      return getVariableValue("batchProcess", 2) as gw.api.tools.BatchProcess
    }
    
    property set batchProcess ($arg :  gw.api.tools.BatchProcess) {
      setVariableValue("batchProcess", 2, $arg)
    }
    
    property get batchProcessType () : typekey.BatchProcessType {
      return getIteratedValue(2) as typekey.BatchProcessType
    }
    
    property get nextDate () : java.util.Date {
      return getVariableValue("nextDate", 2) as java.util.Date
    }
    
    property set nextDate ($arg :  java.util.Date) {
      setVariableValue("nextDate", 2, $arg)
    }
    
    property get schedule () : java.lang.String {
      return getVariableValue("schedule", 2) as java.lang.String
    }
    
    property set schedule ($arg :  java.lang.String) {
      setVariableValue("schedule", 2, $arg)
    }
    
    property get scheduleFromConfiguration () : java.lang.String {
      return getVariableValue("scheduleFromConfiguration", 2) as java.lang.String
    }
    
    property set scheduleFromConfiguration ($arg :  java.lang.String) {
      setVariableValue("scheduleFromConfiguration", 2, $arg)
    }
    
    property get status () : gw.api.webservice.maintenanceTools.ProcessStatus {
      return getVariableValue("status", 2) as gw.api.webservice.maintenanceTools.ProcessStatus
    }
    
    property set status ($arg :  gw.api.webservice.maintenanceTools.ProcessStatus) {
      setVariableValue("status", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/BatchProcessScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends BatchProcessScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=refresh) at BatchProcessScreen.pcf: line 32, column 65
    function action_2 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=download) at BatchProcessScreen.pcf: line 37, column 66
    function action_3 () : void {
      Page.download(batchProcessTypes)
    }
    
    // 'action' attribute on ToolbarButton (id=suspendScheduler) at BatchProcessScreen.pcf: line 43, column 78
    function action_5 () : void {
      Page.suspendScheduler()
    }
    
    // 'action' attribute on ToolbarButton (id=resumeScheduler) at BatchProcessScreen.pcf: line 49, column 74
    function action_7 () : void {
      Page.resumeScheduler()
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at BatchProcessScreen.pcf: line 87, column 80
    function filters_8 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return gw.api.web.tools.BatchProcessInfoPage.USAGE_FILTERS
    }
    
    // 'value' attribute on RowIterator at BatchProcessScreen.pcf: line 102, column 30
    function sortValue_10 (batchProcessType :  typekey.BatchProcessType) : java.lang.Object {
      var batchProcess : gw.api.tools.BatchProcess = (new gw.api.tools.BatchProcess( batchProcessType ))
var status : gw.api.webservice.maintenanceTools.ProcessStatus = (batchProcess.ProcessStatus)
var schedule : java.lang.String = (gw.api.tools.BatchProcess.getSchedule( batchProcessType ))
var scheduleFromConfiguration : java.lang.String = (Page.getScheduleFromConfiguration( batchProcessType ))
var nextDate : java.util.Date = (gw.api.tools.BatchProcess.getNextRun( batchProcessType ))
return batchProcessType.Description
    }
    
    // 'value' attribute on RowIterator at BatchProcessScreen.pcf: line 139, column 30
    function sortValue_12 (batchProcessType :  typekey.BatchProcessType) : java.lang.Object {
      var batchProcess : gw.api.tools.BatchProcess = (new gw.api.tools.BatchProcess( batchProcessType ))
var status : gw.api.webservice.maintenanceTools.ProcessStatus = (batchProcess.ProcessStatus)
var schedule : java.lang.String = (gw.api.tools.BatchProcess.getSchedule( batchProcessType ))
var scheduleFromConfiguration : java.lang.String = (Page.getScheduleFromConfiguration( batchProcessType ))
var nextDate : java.util.Date = (gw.api.tools.BatchProcess.getNextRun( batchProcessType ))
return status.DateCreated
    }
    
    // 'value' attribute on RowIterator at BatchProcessScreen.pcf: line 144, column 30
    function sortValue_13 (batchProcessType :  typekey.BatchProcessType) : java.lang.Object {
      var batchProcess : gw.api.tools.BatchProcess = (new gw.api.tools.BatchProcess( batchProcessType ))
var status : gw.api.webservice.maintenanceTools.ProcessStatus = (batchProcess.ProcessStatus)
var schedule : java.lang.String = (gw.api.tools.BatchProcess.getSchedule( batchProcessType ))
var scheduleFromConfiguration : java.lang.String = (Page.getScheduleFromConfiguration( batchProcessType ))
var nextDate : java.util.Date = (gw.api.tools.BatchProcess.getNextRun( batchProcessType ))
return gw.api.tools.BatchProcess.formatStatus(status)
    }
    
    // 'value' attribute on RowIterator at BatchProcessScreen.pcf: line 151, column 30
    function sortValue_14 (batchProcessType :  typekey.BatchProcessType) : java.lang.Object {
      var batchProcess : gw.api.tools.BatchProcess = (new gw.api.tools.BatchProcess( batchProcessType ))
var status : gw.api.webservice.maintenanceTools.ProcessStatus = (batchProcess.ProcessStatus)
var schedule : java.lang.String = (gw.api.tools.BatchProcess.getSchedule( batchProcessType ))
var scheduleFromConfiguration : java.lang.String = (Page.getScheduleFromConfiguration( batchProcessType ))
var nextDate : java.util.Date = (gw.api.tools.BatchProcess.getNextRun( batchProcessType ))
return nextDate
    }
    
    // 'value' attribute on RowIterator at BatchProcessScreen.pcf: line 97, column 30
    function sortValue_9 (batchProcessType :  typekey.BatchProcessType) : java.lang.Object {
      var batchProcess : gw.api.tools.BatchProcess = (new gw.api.tools.BatchProcess( batchProcessType ))
var status : gw.api.webservice.maintenanceTools.ProcessStatus = (batchProcess.ProcessStatus)
var schedule : java.lang.String = (gw.api.tools.BatchProcess.getSchedule( batchProcessType ))
var scheduleFromConfiguration : java.lang.String = (Page.getScheduleFromConfiguration( batchProcessType ))
var nextDate : java.util.Date = (gw.api.tools.BatchProcess.getNextRun( batchProcessType ))
return batchProcessType
    }
    
    // 'value' attribute on RowIterator at BatchProcessScreen.pcf: line 59, column 52
    function value_50 () : typekey.BatchProcessType[] {
      return batchProcessTypes
    }
    
    // 'visible' attribute on RowIterator at BatchProcessScreen.pcf: line 108, column 29
    function visible_11 () : java.lang.Boolean {
      return perm.User.EditBatchProcess or perm.User.DevAllAccess
    }
    
    // 'visible' attribute on ToolbarButton (id=suspendScheduler) at BatchProcessScreen.pcf: line 43, column 78
    function visible_4 () : java.lang.Boolean {
      return Page.SchedulerEnabled and not Page.SchedulerSuspended
    }
    
    // 'visible' attribute on ToolbarButton (id=resumeScheduler) at BatchProcessScreen.pcf: line 49, column 74
    function visible_6 () : java.lang.Boolean {
      return Page.SchedulerEnabled and Page.SchedulerSuspended
    }
    
    property get SelectedProcess () : BatchProcessType {
      return getCurrentSelection(1) as BatchProcessType
    }
    
    property set SelectedProcess ($arg :  BatchProcessType) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}