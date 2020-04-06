package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerResultsCV_StackQuerySummaryExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ListDetailPanel2ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'outputConversion' attribute on TextCell (id=AverageTime) at ProfilerResultsCV.StackQuerySummary.pcf: line 152, column 55
    function outputConversion_77 (VALUE :  java.lang.Double) : java.lang.String {
      return formatAverage(VALUE)
    }
    
    // 'value' attribute on TextCell (id=ArgsCount) at ProfilerResultsCV.StackQuerySummary.pcf: line 130, column 56
    function valueRoot_69 () : java.lang.Object {
      return aggregatedQuerySummary
    }
    
    // 'value' attribute on TextCell (id=QueryText) at ProfilerResultsCV.StackQuerySummary.pcf: line 124, column 81
    function value_65 () : java.lang.String {
      return aggregatedQuerySummary.getShortQueryString(80)
    }
    
    // 'value' attribute on TextCell (id=ArgsCount) at ProfilerResultsCV.StackQuerySummary.pcf: line 130, column 56
    function value_67 () : java.lang.Integer {
      return aggregatedQuerySummary.NumDistinctArgLists
    }
    
    // 'value' attribute on TextCell (id=Executions) at ProfilerResultsCV.StackQuerySummary.pcf: line 138, column 56
    function value_70 () : java.lang.Integer {
      return aggregatedQuerySummary.ExecutionCount
    }
    
    // 'value' attribute on TextCell (id=TotalTime) at ProfilerResultsCV.StackQuerySummary.pcf: line 146, column 56
    function value_73 () : java.lang.Integer {
      return aggregatedQuerySummary.TotalTime
    }
    
    // 'value' attribute on TextCell (id=AverageTime) at ProfilerResultsCV.StackQuerySummary.pcf: line 152, column 55
    function value_76 () : java.lang.Double {
      return aggregatedQuerySummary.AverageTime
    }
    
    // 'value' attribute on TextCell (id=TotalRowCount) at ProfilerResultsCV.StackQuerySummary.pcf: line 160, column 56
    function value_80 () : java.lang.Integer {
      return aggregatedQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on TextCell (id=AverageRowCount) at ProfilerResultsCV.StackQuerySummary.pcf: line 166, column 55
    function value_83 () : java.lang.Double {
      return aggregatedQuerySummary.AverageRowCount
    }
    
    property get aggregatedQuerySummary () : gw.api.profiler.AggregatedQuerySummary {
      return getIteratedValue(3) as gw.api.profiler.AggregatedQuerySummary
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'outputConversion' attribute on TextCell (id=AverageQueryTime) at ProfilerResultsCV.StackQuerySummary.pcf: line 76, column 49
    function outputConversion_36 (VALUE :  java.lang.Double) : java.lang.String {
      return formatAverage(VALUE)
    }
    
    // 'value' attribute on TextCell (id=StackName) at ProfilerResultsCV.StackQuerySummary.pcf: line 43, column 56
    function valueRoot_22 () : java.lang.Object {
      return stackQuerySummary
    }
    
    // 'value' attribute on TextCell (id=StackName) at ProfilerResultsCV.StackQuerySummary.pcf: line 43, column 56
    function value_20 () : java.lang.String {
      return stackQuerySummary.StackName
    }
    
    // 'value' attribute on TextCell (id=Requests) at ProfilerResultsCV.StackQuerySummary.pcf: line 49, column 50
    function value_23 () : java.lang.Integer {
      return stackQuerySummary.StackCount
    }
    
    // 'value' attribute on TextCell (id=QueryCount) at ProfilerResultsCV.StackQuerySummary.pcf: line 55, column 50
    function value_26 () : java.lang.Integer {
      return stackQuerySummary.QueryCount
    }
    
    // 'value' attribute on TextCell (id=QueriesPerRequest) at ProfilerResultsCV.StackQuerySummary.pcf: line 62, column 50
    function value_29 () : java.lang.Integer {
      return stackQuerySummary.QueriesPerStack
    }
    
    // 'value' attribute on TextCell (id=TotalQueryTime) at ProfilerResultsCV.StackQuerySummary.pcf: line 70, column 50
    function value_32 () : java.lang.Integer {
      return stackQuerySummary.TotalQueryTime
    }
    
    // 'value' attribute on TextCell (id=AverageQueryTime) at ProfilerResultsCV.StackQuerySummary.pcf: line 76, column 49
    function value_35 () : java.lang.Double {
      return stackQuerySummary.AverageQueryTime
    }
    
    // 'value' attribute on TextCell (id=MaxQueryTime) at ProfilerResultsCV.StackQuerySummary.pcf: line 81, column 50
    function value_39 () : java.lang.Integer {
      return stackQuerySummary.MaxQueryTime
    }
    
    // 'value' attribute on TextCell (id=TotalRowCount) at ProfilerResultsCV.StackQuerySummary.pcf: line 89, column 50
    function value_42 () : java.lang.Integer {
      return stackQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on TextCell (id=AverageRowCount) at ProfilerResultsCV.StackQuerySummary.pcf: line 95, column 49
    function value_45 () : java.lang.Double {
      return stackQuerySummary.AverageRowCount
    }
    
    property get stackQuerySummary () : gw.api.profiler.StackQuerySummary {
      return getIteratedValue(2) as gw.api.profiler.StackQuerySummary
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanel2ExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.StackQuerySummary.pcf: line 176, column 106
    function def_onEnter_88 (def :  pcf.StackSummaryLDV) : void {
      def.onEnter(selectedAggregatedQuerySummary.StackAggregatedQuerySummaries)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.StackQuerySummary.pcf: line 182, column 104
    function def_onEnter_90 (def :  pcf.ArgsSummaryLDV) : void {
      def.onEnter(selectedAggregatedQuerySummary.ArgsAggregatedQuerySummaries)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.StackQuerySummary.pcf: line 188, column 91
    function def_onEnter_92 (def :  pcf.QuerySummaryLDV) : void {
      def.onEnter(selectedAggregatedQuerySummary.QuerySummaries)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.StackQuerySummary.pcf: line 176, column 106
    function def_refreshVariables_89 (def :  pcf.StackSummaryLDV) : void {
      def.refreshVariables(selectedAggregatedQuerySummary.StackAggregatedQuerySummaries)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.StackQuerySummary.pcf: line 182, column 104
    function def_refreshVariables_91 (def :  pcf.ArgsSummaryLDV) : void {
      def.refreshVariables(selectedAggregatedQuerySummary.ArgsAggregatedQuerySummaries)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.StackQuerySummary.pcf: line 188, column 91
    function def_refreshVariables_93 (def :  pcf.QuerySummaryLDV) : void {
      def.refreshVariables(selectedAggregatedQuerySummary.QuerySummaries)
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 124, column 81
    function sortValue_50 (aggregatedQuerySummary :  gw.api.profiler.AggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.getShortQueryString(80)
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 130, column 56
    function sortValue_51 (aggregatedQuerySummary :  gw.api.profiler.AggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.NumDistinctArgLists
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 138, column 56
    function sortValue_52 (aggregatedQuerySummary :  gw.api.profiler.AggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.ExecutionCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 146, column 56
    function sortValue_53 (aggregatedQuerySummary :  gw.api.profiler.AggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.TotalTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 152, column 55
    function sortValue_54 (aggregatedQuerySummary :  gw.api.profiler.AggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.AverageTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 160, column 56
    function sortValue_55 (aggregatedQuerySummary :  gw.api.profiler.AggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 166, column 55
    function sortValue_56 (aggregatedQuerySummary :  gw.api.profiler.AggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.AverageRowCount
    }
    
    // '$$sumValue' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 130, column 56
    function sumValueRoot_58 (aggregatedQuerySummary :  gw.api.profiler.AggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 130, column 56
    function sumValue_57 (aggregatedQuerySummary :  gw.api.profiler.AggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.NumDistinctArgLists
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 138, column 56
    function sumValue_59 (aggregatedQuerySummary :  gw.api.profiler.AggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.ExecutionCount
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 146, column 56
    function sumValue_61 (aggregatedQuerySummary :  gw.api.profiler.AggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.TotalTime
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 160, column 56
    function sumValue_63 (aggregatedQuerySummary :  gw.api.profiler.AggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 118, column 74
    function value_87 () : gw.api.profiler.AggregatedQuerySummary[] {
      return selectedStackQuerySummary.AggregatedQuerySummaries
    }
    
    property get selectedAggregatedQuerySummary () : gw.api.profiler.AggregatedQuerySummary {
      return getCurrentSelection(2) as gw.api.profiler.AggregatedQuerySummary
    }
    
    property set selectedAggregatedQuerySummary ($arg :  gw.api.profiler.AggregatedQuerySummary) {
      setCurrentSelection(2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ProfilerResultsCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 89, column 50
    function sortValue_10 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 95, column 49
    function sortValue_11 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.AverageRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 43, column 56
    function sortValue_3 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.StackName
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 49, column 50
    function sortValue_4 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.StackCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 55, column 50
    function sortValue_5 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.QueryCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 62, column 50
    function sortValue_6 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.QueriesPerStack
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 70, column 50
    function sortValue_7 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.TotalQueryTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 76, column 49
    function sortValue_8 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.AverageQueryTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 81, column 50
    function sortValue_9 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.MaxQueryTime
    }
    
    // '$$sumValue' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 49, column 50
    function sumValueRoot_13 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 49, column 50
    function sumValue_12 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.StackCount
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 55, column 50
    function sumValue_14 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.QueryCount
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 70, column 50
    function sumValue_16 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.TotalQueryTime
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 89, column 50
    function sumValue_18 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StackQuerySummary.pcf: line 37, column 63
    function value_49 () : gw.api.profiler.StackQuerySummary[] {
      return profilerDataSource.StackQuerySummaries
    }
    
    property get selectedStackQuerySummary () : gw.api.profiler.StackQuerySummary {
      return getCurrentSelection(1) as gw.api.profiler.StackQuerySummary
    }
    
    property set selectedStackQuerySummary ($arg :  gw.api.profiler.StackQuerySummary) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerResultsCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.StackQuerySummary.pcf: line 18, column 41
    function def_onEnter_0 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.StackQuerySummary.pcf: line 18, column 41
    function def_refreshVariables_1 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.refreshVariables()
    }
    
    // 'visible' attribute on Card (id=Empty) at ProfilerResultsCV.StackQuerySummary.pcf: line 16, column 68
    function visible_2 () : java.lang.Boolean {
      return profilerDataSource.StackQuerySummaries.length == 0
    }
    
    // 'visible' attribute on Card (id=Card) at ProfilerResultsCV.StackQuerySummary.pcf: line 23, column 70
    function visible_94 () : java.lang.Boolean {
      return profilerDataSource.StackQuerySummaries.length > 0
    }
    
    property get profilerDataSource () : gw.api.profiler.ProfilerDataSource {
      return getRequireValue("profilerDataSource", 0) as gw.api.profiler.ProfilerDataSource
    }
    
    property set profilerDataSource ($arg :  gw.api.profiler.ProfilerDataSource) {
      setRequireValue("profilerDataSource", 0, $arg)
    }
    
    
    function formatAverage(value: java.lang.Double): String {
      return gw.api.util.StringUtil.formatNumber(value, "#,##0.00")
    }
        
    
    
  }
  
  
}