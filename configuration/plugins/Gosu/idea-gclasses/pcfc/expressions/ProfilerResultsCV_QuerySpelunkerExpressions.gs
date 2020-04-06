package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerResultsCV_QuerySpelunkerExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'outputConversion' attribute on TextCell (id=AverageRowCount) at ProfilerResultsCV.QuerySpelunker.pcf: line 179, column 53
    function outputConversion_89 (VALUE :  java.lang.Double) : java.lang.String {
      return formatAverage(VALUE)
    }
    
    // 'value' attribute on TextCell (id=StackName) at ProfilerResultsCV.QuerySpelunker.pcf: line 128, column 60
    function valueRoot_66 () : java.lang.Object {
      return stackQuerySummary
    }
    
    // 'value' attribute on TextCell (id=StackName) at ProfilerResultsCV.QuerySpelunker.pcf: line 128, column 60
    function value_64 () : java.lang.String {
      return stackQuerySummary.StackName
    }
    
    // 'value' attribute on TextCell (id=Requests) at ProfilerResultsCV.QuerySpelunker.pcf: line 134, column 54
    function value_67 () : java.lang.Integer {
      return stackQuerySummary.StackCount
    }
    
    // 'value' attribute on TextCell (id=QueryCount) at ProfilerResultsCV.QuerySpelunker.pcf: line 140, column 54
    function value_70 () : java.lang.Integer {
      return stackQuerySummary.QueryCount
    }
    
    // 'value' attribute on TextCell (id=QueriesPerRequest) at ProfilerResultsCV.QuerySpelunker.pcf: line 147, column 54
    function value_73 () : java.lang.Integer {
      return stackQuerySummary.QueriesPerStack
    }
    
    // 'value' attribute on TextCell (id=TotalQueryTime) at ProfilerResultsCV.QuerySpelunker.pcf: line 155, column 54
    function value_76 () : java.lang.Integer {
      return stackQuerySummary.TotalQueryTime
    }
    
    // 'value' attribute on TextCell (id=AverageQueryTime) at ProfilerResultsCV.QuerySpelunker.pcf: line 160, column 53
    function value_79 () : java.lang.Double {
      return stackQuerySummary.AverageQueryTime
    }
    
    // 'value' attribute on TextCell (id=MaxQueryTime) at ProfilerResultsCV.QuerySpelunker.pcf: line 165, column 54
    function value_82 () : java.lang.Integer {
      return stackQuerySummary.MaxQueryTime
    }
    
    // 'value' attribute on TextCell (id=TotalRowCount) at ProfilerResultsCV.QuerySpelunker.pcf: line 173, column 54
    function value_85 () : java.lang.Integer {
      return stackQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on TextCell (id=AverageRowCount) at ProfilerResultsCV.QuerySpelunker.pcf: line 179, column 53
    function value_88 () : java.lang.Double {
      return stackQuerySummary.AverageRowCount
    }
    
    property get stackQuerySummary () : gw.api.profiler.StackQuerySummary {
      return getIteratedValue(2) as gw.api.profiler.StackQuerySummary
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'outputConversion' attribute on TextCell (id=AverageTime) at ProfilerResultsCV.QuerySpelunker.pcf: line 71, column 49
    function outputConversion_30 (VALUE :  java.lang.Double) : java.lang.String {
      return formatAverage(VALUE)
    }
    
    // 'value' attribute on TextCell (id=ArgsCount) at ProfilerResultsCV.QuerySpelunker.pcf: line 49, column 50
    function valueRoot_22 () : java.lang.Object {
      return aggregatedQuerySummary
    }
    
    // 'value' attribute on TextCell (id=QueryText) at ProfilerResultsCV.QuerySpelunker.pcf: line 43, column 75
    function value_18 () : java.lang.String {
      return aggregatedQuerySummary.getShortQueryString(80)
    }
    
    // 'value' attribute on TextCell (id=ArgsCount) at ProfilerResultsCV.QuerySpelunker.pcf: line 49, column 50
    function value_20 () : java.lang.Integer {
      return aggregatedQuerySummary.NumDistinctArgLists
    }
    
    // 'value' attribute on TextCell (id=Executions) at ProfilerResultsCV.QuerySpelunker.pcf: line 57, column 50
    function value_23 () : java.lang.Integer {
      return aggregatedQuerySummary.ExecutionCount
    }
    
    // 'value' attribute on TextCell (id=TotalTime) at ProfilerResultsCV.QuerySpelunker.pcf: line 65, column 50
    function value_26 () : java.lang.Integer {
      return aggregatedQuerySummary.TotalTime
    }
    
    // 'value' attribute on TextCell (id=AverageTime) at ProfilerResultsCV.QuerySpelunker.pcf: line 71, column 49
    function value_29 () : java.lang.Double {
      return aggregatedQuerySummary.AverageTime
    }
    
    // 'value' attribute on TextCell (id=TotalRowCount) at ProfilerResultsCV.QuerySpelunker.pcf: line 79, column 50
    function value_33 () : java.lang.Integer {
      return aggregatedQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on TextCell (id=AverageRowCount) at ProfilerResultsCV.QuerySpelunker.pcf: line 85, column 49
    function value_36 () : java.lang.Double {
      return aggregatedQuerySummary.AverageRowCount
    }
    
    property get aggregatedQuerySummary () : gw.api.profiler.GloballyAggregatedQuerySummary {
      return getIteratedValue(2) as gw.api.profiler.GloballyAggregatedQuerySummary
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ProfilerResultsCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.QuerySpelunker.pcf: line 95, column 108
    function def_onEnter_41 (def :  pcf.StackSummaryLDV) : void {
      def.onEnter(selectedGloballyAggregatedQuerySummary.StackAggregatedQuerySummaries)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.QuerySpelunker.pcf: line 101, column 106
    function def_onEnter_43 (def :  pcf.ArgsSummaryLDV) : void {
      def.onEnter(selectedGloballyAggregatedQuerySummary.ArgsAggregatedQuerySummaries)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.QuerySpelunker.pcf: line 107, column 93
    function def_onEnter_45 (def :  pcf.QuerySummaryLDV) : void {
      def.onEnter(selectedGloballyAggregatedQuerySummary.QuerySummaries)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.QuerySpelunker.pcf: line 95, column 108
    function def_refreshVariables_42 (def :  pcf.StackSummaryLDV) : void {
      def.refreshVariables(selectedGloballyAggregatedQuerySummary.StackAggregatedQuerySummaries)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.QuerySpelunker.pcf: line 101, column 106
    function def_refreshVariables_44 (def :  pcf.ArgsSummaryLDV) : void {
      def.refreshVariables(selectedGloballyAggregatedQuerySummary.ArgsAggregatedQuerySummaries)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.QuerySpelunker.pcf: line 107, column 93
    function def_refreshVariables_46 (def :  pcf.QuerySummaryLDV) : void {
      def.refreshVariables(selectedGloballyAggregatedQuerySummary.QuerySummaries)
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 43, column 75
    function sortValue_3 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.getShortQueryString(80)
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 49, column 50
    function sortValue_4 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.NumDistinctArgLists
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 128, column 60
    function sortValue_47 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.StackName
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 134, column 54
    function sortValue_48 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.StackCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 140, column 54
    function sortValue_49 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.QueryCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 57, column 50
    function sortValue_5 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.ExecutionCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 147, column 54
    function sortValue_50 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.QueriesPerStack
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 155, column 54
    function sortValue_51 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.TotalQueryTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 160, column 53
    function sortValue_52 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.AverageQueryTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 165, column 54
    function sortValue_53 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.MaxQueryTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 173, column 54
    function sortValue_54 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 179, column 53
    function sortValue_55 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.AverageRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 65, column 50
    function sortValue_6 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.TotalTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 71, column 49
    function sortValue_7 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.AverageTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 79, column 50
    function sortValue_8 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 85, column 49
    function sortValue_9 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.AverageRowCount
    }
    
    // '$$sumValue' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 49, column 50
    function sumValueRoot_11 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary
    }
    
    // '$$sumValue' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 134, column 54
    function sumValueRoot_57 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 49, column 50
    function sumValue_10 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.NumDistinctArgLists
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 57, column 50
    function sumValue_12 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.ExecutionCount
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 65, column 50
    function sumValue_14 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.TotalTime
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 79, column 50
    function sumValue_16 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.TotalRowCount
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 134, column 54
    function sumValue_56 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.StackCount
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 140, column 54
    function sumValue_58 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.QueryCount
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 155, column 54
    function sumValue_60 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.TotalQueryTime
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 173, column 54
    function sumValue_62 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 37, column 76
    function value_40 () : gw.api.profiler.GloballyAggregatedQuerySummary[] {
      return profilerDataSource.AggregatedQuerySummaries
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.QuerySpelunker.pcf: line 122, column 67
    function value_92 () : gw.api.profiler.StackQuerySummary[] {
      return selectedGloballyAggregatedQuerySummary.StackQuerySummaries
    }
    
    property get selectedGloballyAggregatedQuerySummary () : gw.api.profiler.GloballyAggregatedQuerySummary {
      return getCurrentSelection(1) as gw.api.profiler.GloballyAggregatedQuerySummary
    }
    
    property set selectedGloballyAggregatedQuerySummary ($arg :  gw.api.profiler.GloballyAggregatedQuerySummary) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerResultsCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.QuerySpelunker.pcf: line 18, column 41
    function def_onEnter_0 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.QuerySpelunker.pcf: line 18, column 41
    function def_refreshVariables_1 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.refreshVariables()
    }
    
    // 'visible' attribute on Card (id=Empty) at ProfilerResultsCV.QuerySpelunker.pcf: line 16, column 73
    function visible_2 () : java.lang.Boolean {
      return profilerDataSource.AggregatedQuerySummaries.length == 0
    }
    
    // 'visible' attribute on Card (id=Card) at ProfilerResultsCV.QuerySpelunker.pcf: line 23, column 75
    function visible_93 () : java.lang.Boolean {
      return profilerDataSource.AggregatedQuerySummaries.length > 0
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