package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickProfilerSourceLV_BatchProcessExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PickProfilerSourceLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Description) at PickProfilerSourceLV.BatchProcess.pcf: line 42, column 64
    function valueRoot_10 () : java.lang.Object {
      return batchProcessHistory.ProcessType
    }
    
    // 'value' attribute on TypeKeyCell (id=BatchProcess) at PickProfilerSourceLV.BatchProcess.pcf: line 37, column 49
    function valueRoot_7 () : java.lang.Object {
      return batchProcessHistory
    }
    
    // 'value' attribute on DateCell (id=StartDate) at PickProfilerSourceLV.BatchProcess.pcf: line 50, column 50
    function value_11 () : java.util.Date {
      return batchProcessHistory.StartDate
    }
    
    // 'value' attribute on DateCell (id=CompleteDate) at PickProfilerSourceLV.BatchProcess.pcf: line 56, column 53
    function value_14 () : java.util.Date {
      return batchProcessHistory.CompleteDate
    }
    
    // 'value' attribute on BooleanRadioCell (id=RanToCompletion) at PickProfilerSourceLV.BatchProcess.pcf: line 60, column 56
    function value_17 () : java.lang.Boolean {
      return batchProcessHistory.RanToCompletion
    }
    
    // 'value' attribute on TypeKeyCell (id=BatchProcess) at PickProfilerSourceLV.BatchProcess.pcf: line 37, column 49
    function value_5 () : typekey.BatchProcessType {
      return batchProcessHistory.ProcessType
    }
    
    // 'value' attribute on TextCell (id=Description) at PickProfilerSourceLV.BatchProcess.pcf: line 42, column 64
    function value_8 () : java.lang.String {
      return batchProcessHistory.ProcessType.Description
    }
    
    property get batchProcessHistory () : entity.ProcessHistory {
      return getIteratedValue(1) as entity.ProcessHistory
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickProfilerSourceLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at PickProfilerSourceLV.BatchProcess.pcf: line 24, column 146
    function filters_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return new gw.api.filters.TypeKeyFilterSet(ProcessHistory.Type.TypeInfo.getProperty( "ProcessType" )).getFilterOptions()
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.BatchProcess.pcf: line 37, column 49
    function sortValue_1 (batchProcessHistory :  entity.ProcessHistory) : java.lang.Object {
      return batchProcessHistory.ProcessType
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.BatchProcess.pcf: line 50, column 50
    function sortValue_2 (batchProcessHistory :  entity.ProcessHistory) : java.lang.Object {
      return batchProcessHistory.StartDate
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.BatchProcess.pcf: line 56, column 53
    function sortValue_3 (batchProcessHistory :  entity.ProcessHistory) : java.lang.Object {
      return batchProcessHistory.CompleteDate
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.BatchProcess.pcf: line 60, column 56
    function sortValue_4 (batchProcessHistory :  entity.ProcessHistory) : java.lang.Object {
      return batchProcessHistory.RanToCompletion
    }
    
    // 'toRemove' attribute on RowIterator at PickProfilerSourceLV.BatchProcess.pcf: line 19, column 81
    function toRemove_20 (batchProcessHistory :  entity.ProcessHistory) : void {
      deleteProfilerData(batchProcessHistory)
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.BatchProcess.pcf: line 19, column 81
    function value_21 () : gw.api.database.IQueryBeanResult<entity.ProcessHistory> {
      return gw.api.database.Query.make(ProcessHistory).compare("ProfilerData", NotEquals, null).select()
    }
    
    function deleteProfilerData(processHistory : ProcessHistory) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
          var localSource = bundle.add( processHistory )
          localSource.ProfilerData = null
        }
      )
    }
    
    
  }
  
  
}