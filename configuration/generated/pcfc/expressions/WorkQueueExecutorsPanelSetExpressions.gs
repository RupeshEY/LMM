package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkQueueExecutorsPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends WorkQueueExecutorLDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=InstanceId) at WorkQueueExecutorsPanelSet.pcf: line 120, column 52
    function valueRoot_39 () : java.lang.Object {
      return task
    }
    
    // 'value' attribute on TextCell (id=InstanceId) at WorkQueueExecutorsPanelSet.pcf: line 120, column 52
    function value_37 () : java.lang.Integer {
      return task.InstanceNumber
    }
    
    // 'value' attribute on TextCell (id=WriterId) at WorkQueueExecutorsPanelSet.pcf: line 126, column 49
    function value_40 () : java.lang.Long {
      return task.ProcessHistoryID
    }
    
    // 'value' attribute on BooleanRadioCell (id=Success) at WorkQueueExecutorsPanelSet.pcf: line 131, column 51
    function value_43 () : java.lang.Boolean {
      return task.RanToCompletion
    }
    
    // 'value' attribute on TextCell (id=CheckedOutItemsCount) at WorkQueueExecutorsPanelSet.pcf: line 136, column 52
    function value_46 () : java.lang.Integer {
      return task.WorkitemsCheckedOut
    }
    
    // 'value' attribute on TextCell (id=ProcessedItemsCount) at WorkQueueExecutorsPanelSet.pcf: line 141, column 52
    function value_49 () : java.lang.Integer {
      return task.WorkitemsProcessed
    }
    
    // 'value' attribute on TextCell (id=ExceptionCount) at WorkQueueExecutorsPanelSet.pcf: line 146, column 52
    function value_52 () : java.lang.Integer {
      return task.Exceptions
    }
    
    // 'value' attribute on TextCell (id=OrphansCount) at WorkQueueExecutorsPanelSet.pcf: line 151, column 52
    function value_55 () : java.lang.Integer {
      return task.OrphansAdopted
    }
    
    // 'value' attribute on TextCell (id=FailedCount) at WorkQueueExecutorsPanelSet.pcf: line 156, column 52
    function value_58 () : java.lang.Integer {
      return task.WorkitemsFailed
    }
    
    // 'value' attribute on TextCell (id=SkippedCount) at WorkQueueExecutorsPanelSet.pcf: line 161, column 52
    function value_61 () : java.lang.Integer {
      return task.WorkitemsSkipped
    }
    
    // 'value' attribute on DateCell (id=StartedTime) at WorkQueueExecutorsPanelSet.pcf: line 169, column 45
    function value_64 () : java.util.Date {
      return task.StartTime
    }
    
    // 'value' attribute on DateCell (id=EndedTime) at WorkQueueExecutorsPanelSet.pcf: line 176, column 43
    function value_67 () : java.util.Date {
      return task.EndTime
    }
    
    // 'value' attribute on BooleanRadioCell (id=Active) at WorkQueueExecutorsPanelSet.pcf: line 181, column 51
    function value_70 () : java.lang.Boolean {
      return task.EndTime == null
    }
    
    // 'value' attribute on TextCell (id=ConsecutiveErrors) at WorkQueueExecutorsPanelSet.pcf: line 187, column 52
    function value_72 () : java.lang.Integer {
      return task.ConsecutiveExceptions
    }
    
    property get task () : entity.InstrumentedWorkerTask {
      return getIteratedValue(2) as entity.InstrumentedWorkerTask
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends WorkQueueExecutorLDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'outputConversion' attribute on TextCell (id=UpTime) at WorkQueueExecutorsPanelSet.pcf: line 83, column 54
    function outputConversion_24 (VALUE :  gw.api.web.tools.Duration) : java.lang.String {
      return VALUE.DisplayString
    }
    
    // 'value' attribute on TextCell (id=ProcessedItemsCount) at WorkQueueExecutorsPanelSet.pcf: line 52, column 46
    function valueRoot_11 () : java.lang.Object {
      return executor.Summary
    }
    
    // 'value' attribute on TextCell (id=Hostname) at WorkQueueExecutorsPanelSet.pcf: line 40, column 42
    function valueRoot_5 () : java.lang.Object {
      return executor
    }
    
    // 'value' attribute on TextCell (id=ExceptionsCount) at WorkQueueExecutorsPanelSet.pcf: line 58, column 46
    function value_12 () : java.lang.Integer {
      return executor.Summary.Exceptions
    }
    
    // 'value' attribute on TextCell (id=FailedCount) at WorkQueueExecutorsPanelSet.pcf: line 64, column 46
    function value_15 () : java.lang.Integer {
      return executor.Summary.Failed
    }
    
    // 'value' attribute on TextCell (id=Status) at WorkQueueExecutorsPanelSet.pcf: line 69, column 67
    function value_18 () : java.lang.String {
      return DisplayKey.get(executor.Status.DisplayKey)
    }
    
    // 'value' attribute on DateCell (id=StartedTime) at WorkQueueExecutorsPanelSet.pcf: line 76, column 43
    function value_20 () : java.util.Date {
      return executor.StartTime
    }
    
    // 'value' attribute on TextCell (id=UpTime) at WorkQueueExecutorsPanelSet.pcf: line 83, column 54
    function value_23 () : gw.api.web.tools.Duration {
      return executor.UpTime
    }
    
    // 'value' attribute on TextCell (id=Hostname) at WorkQueueExecutorsPanelSet.pcf: line 40, column 42
    function value_3 () : java.lang.String {
      return executor.HostName
    }
    
    // 'value' attribute on TextCell (id=MaxWorkers) at WorkQueueExecutorsPanelSet.pcf: line 46, column 46
    function value_6 () : java.lang.Integer {
      return executor.MaxNumberOfWorkers
    }
    
    // 'value' attribute on TextCell (id=ProcessedItemsCount) at WorkQueueExecutorsPanelSet.pcf: line 52, column 46
    function value_9 () : java.lang.Integer {
      return executor.Summary.Processed
    }
    
    property get executor () : gw.api.web.tools.WorkQueueExecutorDisplayInfo {
      return getIteratedValue(2) as gw.api.web.tools.WorkQueueExecutorDisplayInfo
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueExecutorLDVExpressionsImpl extends WorkQueueExecutorsPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkQueueExecutorsPanelSet.pcf: line 110, column 101
    function filter_28 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.filters.StandardQueryFilter("All", \ q -> {})
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkQueueExecutorsPanelSet.pcf: line 112, column 178
    function filter_29 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.filters.StandardQueryFilter("With errors", \ q -> q.compare("Exceptions", gw.api.database.Relop.GreaterThan, 0))
    }
    
    // 'value' attribute on RowIterator (id=TaskIterator) at WorkQueueExecutorsPanelSet.pcf: line 136, column 52
    function sortValue_30 (task :  entity.InstrumentedWorkerTask) : java.lang.Object {
      return task.WorkitemsCheckedOut
    }
    
    // 'value' attribute on RowIterator (id=TaskIterator) at WorkQueueExecutorsPanelSet.pcf: line 141, column 52
    function sortValue_31 (task :  entity.InstrumentedWorkerTask) : java.lang.Object {
      return task.WorkitemsProcessed
    }
    
    // 'value' attribute on RowIterator (id=TaskIterator) at WorkQueueExecutorsPanelSet.pcf: line 146, column 52
    function sortValue_32 (task :  entity.InstrumentedWorkerTask) : java.lang.Object {
      return task.Exceptions
    }
    
    // 'value' attribute on RowIterator (id=TaskIterator) at WorkQueueExecutorsPanelSet.pcf: line 151, column 52
    function sortValue_33 (task :  entity.InstrumentedWorkerTask) : java.lang.Object {
      return task.OrphansAdopted
    }
    
    // 'value' attribute on RowIterator (id=TaskIterator) at WorkQueueExecutorsPanelSet.pcf: line 156, column 52
    function sortValue_34 (task :  entity.InstrumentedWorkerTask) : java.lang.Object {
      return task.WorkitemsFailed
    }
    
    // 'value' attribute on RowIterator (id=TaskIterator) at WorkQueueExecutorsPanelSet.pcf: line 161, column 52
    function sortValue_35 (task :  entity.InstrumentedWorkerTask) : java.lang.Object {
      return task.WorkitemsSkipped
    }
    
    // 'value' attribute on RowIterator (id=TaskIterator) at WorkQueueExecutorsPanelSet.pcf: line 169, column 45
    function sortValue_36 (task :  entity.InstrumentedWorkerTask) : java.lang.Object {
      return task.StartTime
    }
    
    // 'value' attribute on RowIterator (id=ExecutorsList) at WorkQueueExecutorsPanelSet.pcf: line 34, column 71
    function value_27 () : gw.api.web.tools.WorkQueueExecutorDisplayInfo[] {
      return Executors
    }
    
    // 'value' attribute on RowIterator (id=TaskIterator) at WorkQueueExecutorsPanelSet.pcf: line 105, column 99
    function value_75 () : gw.api.database.IQueryBeanResult<entity.InstrumentedWorkerTask> {
      return gw.api.database.Query.make(InstrumentedWorkerTask).compare("InstrumentedWorkExecutorID", Equals, SelectedExecutor.InstrumentedExecutor.ID.Value).select()
    }
    
    property get SelectedExecutor () : gw.api.web.tools.WorkQueueExecutorDisplayInfo {
      return getCurrentSelection(1) as gw.api.web.tools.WorkQueueExecutorDisplayInfo
    }
    
    property set SelectedExecutor ($arg :  gw.api.web.tools.WorkQueueExecutorDisplayInfo) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueExecutorsPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at WorkQueueExecutorsPanelSet.pcf: line 17, column 63
    function initialValue_0 () : gw.api.web.tools.WorkQueueExecutorDisplayInfo[] {
      return Helper.getWorkQueueExecutorInfoArray(Queue)
    }
    
    // 'label' attribute on Verbatim at WorkQueueExecutorsPanelSet.pcf: line 21, column 52
    function label_2 () : java.lang.String {
      return getMaxNumberOfExecutorsShownText()
    }
    
    // 'visible' attribute on Verbatim at WorkQueueExecutorsPanelSet.pcf: line 21, column 52
    function visible_1 () : java.lang.Boolean {
      return isMaximumNumberOfExecutorsShown()
    }
    
    property get Executors () : gw.api.web.tools.WorkQueueExecutorDisplayInfo[] {
      return getVariableValue("Executors", 0) as gw.api.web.tools.WorkQueueExecutorDisplayInfo[]
    }
    
    property set Executors ($arg :  gw.api.web.tools.WorkQueueExecutorDisplayInfo[]) {
      setVariableValue("Executors", 0, $arg)
    }
    
    property get Helper () : gw.api.web.tools.WorkQueueInfoPage {
      return getRequireValue("Helper", 0) as gw.api.web.tools.WorkQueueInfoPage
    }
    
    property set Helper ($arg :  gw.api.web.tools.WorkQueueInfoPage) {
      setRequireValue("Helper", 0, $arg)
    }
    
    property get Queue () : gw.api.web.tools.WorkQueueDisplayInfo {
      return getRequireValue("Queue", 0) as gw.api.web.tools.WorkQueueDisplayInfo
    }
    
    property set Queue ($arg :  gw.api.web.tools.WorkQueueDisplayInfo) {
      setRequireValue("Queue", 0, $arg)
    }
    
    function isMaximumNumberOfExecutorsShown() : boolean {
      if (Executors == null) {
        return false
      }
      return Executors.Count >= Helper.MaxSizeOfExecutorsArray;
    }
    
    function getMaxNumberOfExecutorsShownText() : String {
      if (Executors == null) {
        return ""
      }
      return Executors.allMatch(\ w -> w.ActiveStatus) 
          ? DisplayKey.get("Web.InternalTools.WorkQueueInfo.OnlyActiveExecutorsAreShown") : DisplayKey.get("Web.InternalTools.WorkQueueInfo.OnlyLastNRecordsAreShown", Executors.Count)
    }
    
    function formatDuration(milis: java.lang.Long) : String {
      if (milis == null) {
        return ""
      }
      return gw.api.web.tools.Duration.shortFormatMillisecs(milis)
    }
    
    
  }
  
  
}