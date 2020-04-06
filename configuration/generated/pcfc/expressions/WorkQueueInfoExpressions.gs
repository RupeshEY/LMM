package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkQueueInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailViewPanelExpressionsImpl extends WorkQueueInfoExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at WorkQueueInfo.pcf: line 32, column 67
    function initialValue_1 () : gw.api.web.tools.WorkQueueThreadPoolDisplayInfo {
      return Page.getThreadPoolInfo()
    }
    
    // 'value' attribute on TextInput (id=maximumPoolSize) at WorkQueueInfo.pcf: line 38, column 44
    function valueRoot_4 () : java.lang.Object {
      return PoolInfo
    }
    
    // 'value' attribute on TextInput (id=maximumPoolSize) at WorkQueueInfo.pcf: line 38, column 44
    function value_2 () : java.lang.Integer {
      return PoolInfo.ThreadPoolMaximumSize
    }
    
    // 'value' attribute on TextInput (id=poolSize) at WorkQueueInfo.pcf: line 45, column 44
    function value_5 () : java.lang.Integer {
      return PoolInfo.ThreadPoolSize
    }
    
    // 'value' attribute on TextInput (id=activeThreads) at WorkQueueInfo.pcf: line 52, column 44
    function value_8 () : java.lang.Integer {
      return PoolInfo.ActiveThreadCount
    }
    
    property get PoolInfo () : gw.api.web.tools.WorkQueueThreadPoolDisplayInfo {
      return getVariableValue("PoolInfo", 1) as gw.api.web.tools.WorkQueueThreadPoolDisplayInfo
    }
    
    property set PoolInfo ($arg :  gw.api.web.tools.WorkQueueThreadPoolDisplayInfo) {
      setVariableValue("PoolInfo", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=RunWriter) at WorkQueueInfo.pcf: line 136, column 46
    function action_41 () : void {
      SelectedQueue = WorkQueueRow;Page.runWriter(WorkQueueRow)
    }
    
    // 'action' attribute on Link (id=Notify) at WorkQueueInfo.pcf: line 141, column 46
    function action_42 () : void {
      SelectedQueue = WorkQueueRow;Page.notifyWorkers(WorkQueueRow)
    }
    
    // 'action' attribute on Link (id=StopWorkers) at WorkQueueInfo.pcf: line 146, column 46
    function action_43 () : void {
      Page.stopWorkers(WorkQueueRow)
    }
    
    // 'action' attribute on Link (id=RestartWorkers) at WorkQueueInfo.pcf: line 151, column 46
    function action_44 () : void {
      Page.restartWorkers(WorkQueueRow)
    }
    
    // 'action' attribute on Link (id=PrintHistory) at WorkQueueInfo.pcf: line 156, column 46
    function action_45 () : void {
      SelectedQueue = WorkQueueRow; WorkQueueHistoryDownloadConfigurePopup.push(WorkQueueRow);
    }
    
    // 'available' attribute on Link (id=RunWriter) at WorkQueueInfo.pcf: line 136, column 46
    function available_40 () : java.lang.Boolean {
      return (not batchProcess.ProcessStatus.StartingOrExecuting) and Page.canStartFromUi(WorkQueueRow)
    }
    
    // 'initialValue' attribute on Variable at WorkQueueInfo.pcf: line 85, column 51
    function initialValue_20 () : gw.api.tools.BatchProcess {
      return new gw.api.tools.BatchProcess(WorkQueueRow.WorkQueueInfo.QueueType)
    }
    
    // RowIterator at WorkQueueInfo.pcf: line 81, column 67
    function initializeVariables_48 () : void {
        batchProcess = new gw.api.tools.BatchProcess(WorkQueueRow.WorkQueueInfo.QueueType);

    }
    
    // 'value' attribute on TextCell (id=WorkQueueName) at WorkQueueInfo.pcf: line 93, column 32
    function valueRoot_23 () : java.lang.Object {
      return WorkQueueRow.WorkQueueInfo
    }
    
    // 'value' attribute on TextCell (id=numActive) at WorkQueueInfo.pcf: line 99, column 50
    function valueRoot_26 () : java.lang.Object {
      return WorkQueueRow
    }
    
    // 'value' attribute on TextCell (id=WorkQueueName) at WorkQueueInfo.pcf: line 93, column 32
    function value_21 () : java.lang.String {
      return WorkQueueRow.WorkQueueInfo.QueueName
    }
    
    // 'value' attribute on TextCell (id=numActive) at WorkQueueInfo.pcf: line 99, column 50
    function value_24 () : java.lang.Integer {
      return WorkQueueRow.AvailableCount
    }
    
    // 'value' attribute on TextCell (id=numCheckedOut) at WorkQueueInfo.pcf: line 105, column 50
    function value_27 () : java.lang.Integer {
      return WorkQueueRow.CheckedOutCount
    }
    
    // 'value' attribute on TextCell (id=numFailed) at WorkQueueInfo.pcf: line 111, column 50
    function value_30 () : java.lang.Integer {
      return WorkQueueRow.FailedCount
    }
    
    // 'value' attribute on TextCell (id=numExecutorsActive) at WorkQueueInfo.pcf: line 117, column 50
    function value_33 () : java.lang.Integer {
      return WorkQueueRow.ExecutorsRunning
    }
    
    // 'value' attribute on TextCell (id=startedClusterWide) at WorkQueueInfo.pcf: line 121, column 175
    function value_36 () : java.lang.String {
      return WorkQueueRow.Started ? DisplayKey.get("Web.WorkQueueExecutorsLv.Started") : DisplayKey.get("Web.WorkQueueExecutorsLv.Stopped")
    }
    
    // 'value' attribute on TextCell (id=WriterStatus) at WorkQueueInfo.pcf: line 125, column 63
    function value_38 () : java.lang.String {
      return Page.getWriterStatus(WorkQueueRow)
    }
    
    // 'visible' attribute on LinkCell (id=NotifyCell) at WorkQueueInfo.pcf: line 130, column 31
    function visible_46 () : java.lang.Boolean {
      return perm.User.EditWorkQueue or perm.User.DevAllAccess
    }
    
    // 'visible' attribute on Row at WorkQueueInfo.pcf: line 87, column 148
    function visible_47 () : java.lang.Boolean {
      return WorkQueueRow.QueueType != typekey.BatchProcessType.TC_ARCHIVE or gw.api.web.tools.ArchiveInfoPage.isArchivingAvailable()
    }
    
    property get WorkQueueRow () : gw.api.web.tools.WorkQueueDisplayInfo {
      return getIteratedValue(2) as gw.api.web.tools.WorkQueueDisplayInfo
    }
    
    property get batchProcess () : gw.api.tools.BatchProcess {
      return getVariableValue("batchProcess", 2) as gw.api.tools.BatchProcess
    }
    
    property set batchProcess ($arg :  gw.api.tools.BatchProcess) {
      setVariableValue("batchProcess", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends WorkQueueInfoExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=refresh) at WorkQueueInfo.pcf: line 64, column 67
    function action_11 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=download) at WorkQueueInfo.pcf: line 68, column 68
    function action_12 () : void {
      WorkQueueInfoDownloadConfigurePopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=downloadRawData) at WorkQueueInfo.pcf: line 72, column 100
    function action_14 () : void {
      WorkQueueRawDataDownloadConfigurePopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=download) at WorkQueueInfo.pcf: line 68, column 68
    function action_dest_13 () : pcf.api.Destination {
      return pcf.WorkQueueInfoDownloadConfigurePopup.createDestination()
    }
    
    // 'action' attribute on ToolbarButton (id=downloadRawData) at WorkQueueInfo.pcf: line 72, column 100
    function action_dest_15 () : pcf.api.Destination {
      return pcf.WorkQueueRawDataDownloadConfigurePopup.createDestination()
    }
    
    // 'def' attribute on PanelRef at WorkQueueInfo.pcf: line 171, column 70
    function def_onEnter_50 (def :  pcf.WorkQueueWritersPanelSet) : void {
      def.onEnter(Page, SelectedQueue)
    }
    
    // 'def' attribute on PanelRef at WorkQueueInfo.pcf: line 177, column 72
    function def_onEnter_52 (def :  pcf.WorkQueueExecutorsPanelSet) : void {
      def.onEnter(Page, SelectedQueue)
    }
    
    // 'def' attribute on PanelRef at WorkQueueInfo.pcf: line 183, column 67
    function def_onEnter_54 (def :  pcf.WorkQueueWorkItemsLDV) : void {
      def.onEnter(Page, SelectedQueue)
    }
    
    // 'def' attribute on PanelRef at WorkQueueInfo.pcf: line 171, column 70
    function def_refreshVariables_51 (def :  pcf.WorkQueueWritersPanelSet) : void {
      def.refreshVariables(Page, SelectedQueue)
    }
    
    // 'def' attribute on PanelRef at WorkQueueInfo.pcf: line 177, column 72
    function def_refreshVariables_53 (def :  pcf.WorkQueueExecutorsPanelSet) : void {
      def.refreshVariables(Page, SelectedQueue)
    }
    
    // 'def' attribute on PanelRef at WorkQueueInfo.pcf: line 183, column 67
    function def_refreshVariables_55 (def :  pcf.WorkQueueWorkItemsLDV) : void {
      def.refreshVariables(Page, SelectedQueue)
    }
    
    // 'selectionOnEnter' attribute on ListDetailPanel at WorkQueueInfo.pcf: line 58, column 63
    function selectionOnEnter_56 () : java.lang.Object {
      return initialWorkQueueInfo
    }
    
    // 'value' attribute on RowIterator at WorkQueueInfo.pcf: line 93, column 32
    function sortValue_16 (WorkQueueRow :  gw.api.web.tools.WorkQueueDisplayInfo) : java.lang.Object {
      return WorkQueueRow.WorkQueueInfo.QueueName
    }
    
    // 'value' attribute on RowIterator at WorkQueueInfo.pcf: line 121, column 175
    function sortValue_17 (WorkQueueRow :  gw.api.web.tools.WorkQueueDisplayInfo) : java.lang.Object {
      return WorkQueueRow.Started ? DisplayKey.get("Web.WorkQueueExecutorsLv.Started") : DisplayKey.get("Web.WorkQueueExecutorsLv.Stopped")
    }
    
    // 'value' attribute on RowIterator at WorkQueueInfo.pcf: line 125, column 63
    function sortValue_18 (WorkQueueRow :  gw.api.web.tools.WorkQueueDisplayInfo) : java.lang.Object {
      return Page.getWriterStatus(WorkQueueRow)
    }
    
    // 'value' attribute on RowIterator at WorkQueueInfo.pcf: line 81, column 67
    function value_49 () : gw.api.web.tools.WorkQueueDisplayInfo[] {
      return Page.WorkQueueList
    }
    
    // 'visible' attribute on RowIterator at WorkQueueInfo.pcf: line 130, column 31
    function visible_19 () : java.lang.Boolean {
      return perm.User.EditWorkQueue or perm.User.DevAllAccess
    }
    
    property get SelectedQueue () : gw.api.web.tools.WorkQueueDisplayInfo {
      return getCurrentSelection(1) as gw.api.web.tools.WorkQueueDisplayInfo
    }
    
    property set SelectedQueue ($arg :  gw.api.web.tools.WorkQueueDisplayInfo) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (initialWorkQueueInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : int {
      return 1
    }
    
    // 'canVisit' attribute on Page (id=WorkQueueInfo) at WorkQueueInfo.pcf: line 12, column 79
    static function canVisit_57 (initialWorkQueueInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : java.lang.Boolean {
      return perm.User.ViewWorkQueue or perm.User.DevAllAccess
    }
    
    // 'initialValue' attribute on Variable at WorkQueueInfo.pcf: line 20, column 50
    function initialValue_0 () : gw.api.web.tools.WorkQueueInfoPage {
      return new gw.api.web.tools.WorkQueueInfoPage()
    }
    
    // 'parent' attribute on Page (id=WorkQueueInfo) at WorkQueueInfo.pcf: line 12, column 79
    static function parent_58 (initialWorkQueueInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    override property get CurrentLocation () : pcf.WorkQueueInfo {
      return super.CurrentLocation as pcf.WorkQueueInfo
    }
    
    property get Page () : gw.api.web.tools.WorkQueueInfoPage {
      return getVariableValue("Page", 0) as gw.api.web.tools.WorkQueueInfoPage
    }
    
    property set Page ($arg :  gw.api.web.tools.WorkQueueInfoPage) {
      setVariableValue("Page", 0, $arg)
    }
    
    property get initialWorkQueueInfo () : gw.api.web.tools.WorkQueueDisplayInfo {
      return getVariableValue("initialWorkQueueInfo", 0) as gw.api.web.tools.WorkQueueDisplayInfo
    }
    
    property set initialWorkQueueInfo ($arg :  gw.api.web.tools.WorkQueueDisplayInfo) {
      setVariableValue("initialWorkQueueInfo", 0, $arg)
    }
    
    
  }
  
  
}