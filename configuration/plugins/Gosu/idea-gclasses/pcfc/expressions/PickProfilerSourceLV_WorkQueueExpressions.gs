package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickProfilerSourceLV_WorkQueueExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PickProfilerSourceLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at PickProfilerSourceLV.WorkQueue.pcf: line 28, column 27
    function condition_4 () : java.lang.Boolean {
      return instrumentedWorkerTask.EndTime != null
    }
    
    // 'condition' attribute on ToolbarFlag at PickProfilerSourceLV.WorkQueue.pcf: line 31, column 30
    function condition_5 () : java.lang.Boolean {
      return instrumentedWorkerTask.EndTime == null
    }
    
    // 'outputConversion' attribute on TextCell (id=Duration) at PickProfilerSourceLV.WorkQueue.pcf: line 71, column 50
    function outputConversion_22 (VALUE :  gw.api.web.tools.Duration) : java.lang.String {
      return VALUE.DisplayString
    }
    
    // 'value' attribute on TextCell (id=InstanceNumber) at PickProfilerSourceLV.WorkQueue.pcf: line 50, column 42
    function valueRoot_14 () : java.lang.Object {
      return instrumentedWorkerTask
    }
    
    // 'value' attribute on TypeKeyCell (id=WorkQueueName) at PickProfilerSourceLV.WorkQueue.pcf: line 38, column 49
    function valueRoot_8 () : java.lang.Object {
      return instrumentedWorkerTask.InstrumentedWorkExecutor
    }
    
    // 'value' attribute on TextCell (id=InstanceNumber) at PickProfilerSourceLV.WorkQueue.pcf: line 50, column 42
    function value_12 () : java.lang.Integer {
      return instrumentedWorkerTask.InstanceNumber
    }
    
    // 'value' attribute on DateCell (id=StartTime) at PickProfilerSourceLV.WorkQueue.pcf: line 58, column 53
    function value_15 () : java.util.Date {
      return instrumentedWorkerTask.StartTime
    }
    
    // 'value' attribute on DateCell (id=EndTime) at PickProfilerSourceLV.WorkQueue.pcf: line 64, column 51
    function value_18 () : java.util.Date {
      return instrumentedWorkerTask.EndTime
    }
    
    // 'value' attribute on TextCell (id=Duration) at PickProfilerSourceLV.WorkQueue.pcf: line 71, column 50
    function value_21 () : gw.api.web.tools.Duration {
      return new gw.api.web.tools.Duration(instrumentedWorkerTask.StartTime, instrumentedWorkerTask.EndTime)
    }
    
    // 'value' attribute on TypeKeyCell (id=WorkQueueName) at PickProfilerSourceLV.WorkQueue.pcf: line 38, column 49
    function value_6 () : typekey.BatchProcessType {
      return instrumentedWorkerTask.InstrumentedWorkExecutor.WorkQueueID
    }
    
    // 'value' attribute on TextCell (id=AppServerName) at PickProfilerSourceLV.WorkQueue.pcf: line 44, column 82
    function value_9 () : java.lang.String {
      return instrumentedWorkerTask.InstrumentedWorkExecutor.AppServerName
    }
    
    property get instrumentedWorkerTask () : entity.InstrumentedWorkerTask {
      return getIteratedValue(1) as entity.InstrumentedWorkerTask
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickProfilerSourceLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at PickProfilerSourceLV.WorkQueue.pcf: line 24, column 76
    function filters_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return new gw.api.filters.WorkQueueFilterSet().FilterOptions
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.WorkQueue.pcf: line 50, column 42
    function sortValue_1 (instrumentedWorkerTask :  entity.InstrumentedWorkerTask) : java.lang.Object {
      return instrumentedWorkerTask.InstanceNumber
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.WorkQueue.pcf: line 58, column 53
    function sortValue_2 (instrumentedWorkerTask :  entity.InstrumentedWorkerTask) : java.lang.Object {
      return instrumentedWorkerTask.StartTime
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.WorkQueue.pcf: line 64, column 51
    function sortValue_3 (instrumentedWorkerTask :  entity.InstrumentedWorkerTask) : java.lang.Object {
      return instrumentedWorkerTask.EndTime
    }
    
    // 'toRemove' attribute on RowIterator at PickProfilerSourceLV.WorkQueue.pcf: line 19, column 89
    function toRemove_24 (instrumentedWorkerTask :  entity.InstrumentedWorkerTask) : void {
      deleteProfilerData(instrumentedWorkerTask)
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.WorkQueue.pcf: line 19, column 89
    function value_25 () : gw.api.database.IQueryBeanResult<entity.InstrumentedWorkerTask> {
      return gw.api.profiler.WorkQueueProfilerPageHelper.getQuery()
    }
    
    function deleteProfilerData(instrumentedTask : InstrumentedWorkerTask) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
          var localSource = bundle.add( instrumentedTask )
          localSource.ProfilerData = null
        }
      )
    }
    
    
  }
  
  
}