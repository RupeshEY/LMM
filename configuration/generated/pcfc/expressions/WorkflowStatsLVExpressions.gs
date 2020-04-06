package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkflowStatsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends WorkflowStatsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=WorkflowType) at WorkflowStatsLV.pcf: line 21, column 41
    function valueRoot_15 () : java.lang.Object {
      return WorkflowStepStats
    }
    
    // 'value' attribute on TypeKeyCell (id=WorkflowType) at WorkflowStatsLV.pcf: line 21, column 41
    function value_13 () : typekey.Workflow {
      return WorkflowStepStats.WorkflowType
    }
    
    // 'value' attribute on TextCell (id=StepName) at WorkflowStatsLV.pcf: line 27, column 58
    function value_16 () : java.lang.String {
      return WorkflowStepStats.localizedStepName()
    }
    
    // 'value' attribute on TextCell (id=ExecMin) at WorkflowStatsLV.pcf: line 33, column 98
    function value_18 () : java.lang.String {
      return gw.api.web.tools.Duration.shortFormatMillisecs(WorkflowStepStats.ExecTimeMin)
    }
    
    // 'value' attribute on TextCell (id=ExecMax) at WorkflowStatsLV.pcf: line 39, column 98
    function value_20 () : java.lang.String {
      return gw.api.web.tools.Duration.shortFormatMillisecs(WorkflowStepStats.execTimeMax)
    }
    
    // 'value' attribute on TextCell (id=ExecMean) at WorkflowStatsLV.pcf: line 45, column 99
    function value_22 () : java.lang.String {
      return gw.api.web.tools.Duration.shortFormatMillisecs(WorkflowStepStats.ExecTimeMean)
    }
    
    // 'value' attribute on TextCell (id=ExecStdDev) at WorkflowStatsLV.pcf: line 51, column 101
    function value_24 () : java.lang.String {
      return gw.api.web.tools.Duration.shortFormatMillisecs(WorkflowStepStats.ExecTimeStdDev)
    }
    
    // 'value' attribute on TextCell (id=ElapsedMin) at WorkflowStatsLV.pcf: line 57, column 101
    function value_26 () : java.lang.String {
      return gw.api.web.tools.Duration.shortFormatMillisecs(WorkflowStepStats.ElapsedTimeMin)
    }
    
    // 'value' attribute on TextCell (id=ElapsedMax) at WorkflowStatsLV.pcf: line 63, column 101
    function value_28 () : java.lang.String {
      return gw.api.web.tools.Duration.shortFormatMillisecs(WorkflowStepStats.ElapsedTimeMax)
    }
    
    // 'value' attribute on TextCell (id=ElapsedMean) at WorkflowStatsLV.pcf: line 69, column 102
    function value_30 () : java.lang.String {
      return gw.api.web.tools.Duration.shortFormatMillisecs(WorkflowStepStats.ElapsedTimeMean)
    }
    
    // 'value' attribute on TextCell (id=ElapsedStdDev) at WorkflowStatsLV.pcf: line 75, column 104
    function value_32 () : java.lang.String {
      return gw.api.web.tools.Duration.shortFormatMillisecs(WorkflowStepStats.ElapsedTimeStdDev)
    }
    
    // 'value' attribute on TextCell (id=Executions) at WorkflowStatsLV.pcf: line 81, column 42
    function value_34 () : java.lang.Integer {
      return WorkflowStepStats.Executions
    }
    
    // 'value' attribute on DateCell (id=StartTime) at WorkflowStatsLV.pcf: line 90, column 48
    function value_37 () : java.util.Date {
      return WorkflowStepStats.StartTime
    }
    
    // 'value' attribute on DateCell (id=EndTime) at WorkflowStatsLV.pcf: line 97, column 46
    function value_40 () : java.util.Date {
      return WorkflowStepStats.EndTime
    }
    
    property get WorkflowStepStats () : entity.WorkflowStepStats {
      return getIteratedValue(1) as entity.WorkflowStepStats
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowStatsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at WorkflowStatsLV.pcf: line 21, column 41
    function sortValue_0 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.WorkflowType
    }
    
    // 'sortBy' attribute on RowIterator at WorkflowStatsLV.pcf: line 27, column 58
    function sortValue_1 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.StepName
    }
    
    // 'value' attribute on RowIterator at WorkflowStatsLV.pcf: line 81, column 42
    function sortValue_10 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.Executions
    }
    
    // 'value' attribute on RowIterator at WorkflowStatsLV.pcf: line 90, column 48
    function sortValue_11 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.StartTime
    }
    
    // 'value' attribute on RowIterator at WorkflowStatsLV.pcf: line 97, column 46
    function sortValue_12 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.EndTime
    }
    
    // 'sortBy' attribute on RowIterator at WorkflowStatsLV.pcf: line 33, column 98
    function sortValue_2 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.ExecTimeMin
    }
    
    // 'sortBy' attribute on RowIterator at WorkflowStatsLV.pcf: line 39, column 98
    function sortValue_3 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.execTimeMax
    }
    
    // 'sortBy' attribute on RowIterator at WorkflowStatsLV.pcf: line 45, column 99
    function sortValue_4 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.ExecTimeMean
    }
    
    // 'sortBy' attribute on RowIterator at WorkflowStatsLV.pcf: line 51, column 101
    function sortValue_5 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.ExecTimeStdDev
    }
    
    // 'sortBy' attribute on RowIterator at WorkflowStatsLV.pcf: line 57, column 101
    function sortValue_6 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.ElapsedTimeMin
    }
    
    // 'sortBy' attribute on RowIterator at WorkflowStatsLV.pcf: line 63, column 101
    function sortValue_7 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.ElapsedTimeMax
    }
    
    // 'sortBy' attribute on RowIterator at WorkflowStatsLV.pcf: line 69, column 102
    function sortValue_8 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.ElapsedTimeMean
    }
    
    // 'sortBy' attribute on RowIterator at WorkflowStatsLV.pcf: line 75, column 104
    function sortValue_9 (WorkflowStepStats :  entity.WorkflowStepStats) : java.lang.Object {
      return WorkflowStepStats.ElapsedTimeStdDev
    }
    
    // 'value' attribute on RowIterator at WorkflowStatsLV.pcf: line 14, column 84
    function value_43 () : gw.api.database.IQueryBeanResult<entity.WorkflowStepStats> {
      return WorkflowStats
    }
    
    property get WorkflowStats () : gw.api.database.IQueryBeanResult<WorkflowStepStats> {
      return getRequireValue("WorkflowStats", 0) as gw.api.database.IQueryBeanResult<WorkflowStepStats>
    }
    
    property set WorkflowStats ($arg :  gw.api.database.IQueryBeanResult<WorkflowStepStats>) {
      setRequireValue("WorkflowStats", 0, $arg)
    }
    
    
  }
  
  
}