package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerResultsCV_NameThisQueryExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'outputConversion' attribute on TextCell (id=AverageRowCount) at ProfilerResultsCV.NameThisQuery.pcf: line 181, column 55
    function outputConversion_78 (VALUE :  java.lang.Double) : java.lang.String {
      return formatAverage(VALUE)
    }
    
    // 'value' attribute on TextCell (id=StackName) at ProfilerResultsCV.NameThisQuery.pcf: line 133, column 62
    function valueRoot_55 () : java.lang.Object {
      return stackQuerySummary
    }
    
    // 'value' attribute on TextCell (id=StackName) at ProfilerResultsCV.NameThisQuery.pcf: line 133, column 62
    function value_53 () : java.lang.String {
      return stackQuerySummary.StackName
    }
    
    // 'value' attribute on TextCell (id=Requests) at ProfilerResultsCV.NameThisQuery.pcf: line 138, column 56
    function value_56 () : java.lang.Integer {
      return stackQuerySummary.StackCount
    }
    
    // 'value' attribute on TextCell (id=QueryCount) at ProfilerResultsCV.NameThisQuery.pcf: line 143, column 56
    function value_59 () : java.lang.Integer {
      return stackQuerySummary.QueryCount
    }
    
    // 'value' attribute on TextCell (id=QueriesPerRequest) at ProfilerResultsCV.NameThisQuery.pcf: line 150, column 56
    function value_62 () : java.lang.Integer {
      return stackQuerySummary.QueriesPerStack
    }
    
    // 'value' attribute on TextCell (id=TotalQueryTime) at ProfilerResultsCV.NameThisQuery.pcf: line 157, column 56
    function value_65 () : java.lang.Integer {
      return stackQuerySummary.TotalQueryTime
    }
    
    // 'value' attribute on TextCell (id=AverageQueryTime) at ProfilerResultsCV.NameThisQuery.pcf: line 162, column 55
    function value_68 () : java.lang.Double {
      return stackQuerySummary.AverageQueryTime
    }
    
    // 'value' attribute on TextCell (id=MaxQueryTime) at ProfilerResultsCV.NameThisQuery.pcf: line 167, column 56
    function value_71 () : java.lang.Integer {
      return stackQuerySummary.MaxQueryTime
    }
    
    // 'value' attribute on TextCell (id=TotalRowCount) at ProfilerResultsCV.NameThisQuery.pcf: line 175, column 56
    function value_74 () : java.lang.Integer {
      return stackQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on TextCell (id=AverageRowCount) at ProfilerResultsCV.NameThisQuery.pcf: line 181, column 55
    function value_77 () : java.lang.Double {
      return stackQuerySummary.AverageRowCount
    }
    
    property get stackQuerySummary () : gw.api.profiler.StackQuerySummary {
      return getIteratedValue(3) as gw.api.profiler.StackQuerySummary
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'outputConversion' attribute on TextCell (id=AverageTime) at ProfilerResultsCV.NameThisQuery.pcf: line 89, column 51
    function outputConversion_29 (VALUE :  java.lang.Double) : java.lang.String {
      return formatAverage(VALUE)
    }
    
    // 'value' attribute on TextCell (id=Score) at ProfilerResultsCV.NameThisQuery.pcf: line 71, column 51
    function valueRoot_21 () : java.lang.Object {
      return aggregatedQuerySummary
    }
    
    // 'value' attribute on TextCell (id=QueryText) at ProfilerResultsCV.NameThisQuery.pcf: line 64, column 77
    function value_17 () : java.lang.String {
      return aggregatedQuerySummary.getShortQueryString(80)
    }
    
    // 'value' attribute on TextCell (id=Score) at ProfilerResultsCV.NameThisQuery.pcf: line 71, column 51
    function value_19 () : java.lang.Double {
      return aggregatedQuerySummary.Score
    }
    
    // 'value' attribute on TextCell (id=Executions) at ProfilerResultsCV.NameThisQuery.pcf: line 76, column 52
    function value_22 () : java.lang.Integer {
      return aggregatedQuerySummary.ExecutionCount
    }
    
    // 'value' attribute on TextCell (id=TotalTime) at ProfilerResultsCV.NameThisQuery.pcf: line 81, column 52
    function value_25 () : java.lang.Integer {
      return aggregatedQuerySummary.TotalTime
    }
    
    // 'value' attribute on TextCell (id=AverageTime) at ProfilerResultsCV.NameThisQuery.pcf: line 89, column 51
    function value_28 () : java.lang.Double {
      return aggregatedQuerySummary.AverageTime
    }
    
    // 'value' attribute on TextCell (id=TotalRowCount) at ProfilerResultsCV.NameThisQuery.pcf: line 97, column 52
    function value_32 () : java.lang.Integer {
      return aggregatedQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on TextCell (id=AverageRowCount) at ProfilerResultsCV.NameThisQuery.pcf: line 103, column 51
    function value_35 () : java.lang.Double {
      return aggregatedQuerySummary.AverageRowCount
    }
    
    property get aggregatedQuerySummary () : gw.api.profiler.GloballyAggregatedQuerySummary {
      return getIteratedValue(3) as gw.api.profiler.GloballyAggregatedQuerySummary
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends SearchPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.NameThisQuery.pcf: line 113, column 87
    function def_onEnter_40 (def :  pcf.QuerySummaryLDV) : void {
      def.onEnter(selectedAggregatedQuerySummary.QuerySummaries)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.NameThisQuery.pcf: line 113, column 87
    function def_refreshVariables_41 (def :  pcf.QuerySummaryLDV) : void {
      def.refreshVariables(selectedAggregatedQuerySummary.QuerySummaries)
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 76, column 52
    function sortValue_10 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.ExecutionCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 81, column 52
    function sortValue_11 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.TotalTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 89, column 51
    function sortValue_12 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.AverageTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 97, column 52
    function sortValue_13 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 103, column 51
    function sortValue_14 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.AverageRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 133, column 62
    function sortValue_42 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.StackName
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 138, column 56
    function sortValue_43 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.StackCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 143, column 56
    function sortValue_44 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.QueryCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 150, column 56
    function sortValue_45 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.QueriesPerStack
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 157, column 56
    function sortValue_46 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.TotalQueryTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 162, column 55
    function sortValue_47 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.AverageQueryTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 167, column 56
    function sortValue_48 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.MaxQueryTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 175, column 56
    function sortValue_49 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 181, column 55
    function sortValue_50 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.AverageRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 64, column 77
    function sortValue_8 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.getShortQueryString(80)
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 71, column 51
    function sortValue_9 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.Score
    }
    
    // '$$sumValue' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 97, column 52
    function sumValueRoot_16 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary
    }
    
    // '$$sumValue' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 175, column 56
    function sumValueRoot_52 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 97, column 52
    function sumValue_15 (aggregatedQuerySummary :  gw.api.profiler.GloballyAggregatedQuerySummary) : java.lang.Object {
      return aggregatedQuerySummary.TotalRowCount
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 175, column 56
    function sumValue_51 (stackQuerySummary :  gw.api.profiler.StackQuerySummary) : java.lang.Object {
      return stackQuerySummary.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 59, column 78
    function value_39 () : gw.api.profiler.GloballyAggregatedQuerySummary[] {
      return globalAggregatedQuerySummaries
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.NameThisQuery.pcf: line 128, column 69
    function value_81 () : gw.api.profiler.StackQuerySummary[] {
      return selectedAggregatedQuerySummary.StackQuerySummaries
    }
    
    property get selectedAggregatedQuerySummary () : gw.api.profiler.GloballyAggregatedQuerySummary {
      return getCurrentSelection(2) as gw.api.profiler.GloballyAggregatedQuerySummary
    }
    
    property set selectedAggregatedQuerySummary ($arg :  gw.api.profiler.GloballyAggregatedQuerySummary) {
      setCurrentSelection(2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerResultsCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.NameThisQuery.pcf: line 18, column 41
    function def_onEnter_0 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.NameThisQuery.pcf: line 18, column 41
    function def_refreshVariables_1 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.refreshVariables()
    }
    
    // 'visible' attribute on Card (id=Empty) at ProfilerResultsCV.NameThisQuery.pcf: line 16, column 73
    function visible_2 () : java.lang.Boolean {
      return profilerDataSource.AggregatedQuerySummaries.length == 0
    }
    
    // 'visible' attribute on Card (id=Card) at ProfilerResultsCV.NameThisQuery.pcf: line 23, column 75
    function visible_83 () : java.lang.Boolean {
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
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends ProfilerResultsCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ProfilerResultsCV.NameThisQuery.pcf: line 43, column 47
    function def_onEnter_6 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at ProfilerResultsCV.NameThisQuery.pcf: line 43, column 47
    function def_refreshVariables_7 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on TextAreaInput (id=SQLString) at ProfilerResultsCV.NameThisQuery.pcf: line 39, column 33
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      criteria = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'search' attribute on SearchPanel at ProfilerResultsCV.NameThisQuery.pcf: line 30, column 78
    function search_82 () : java.lang.Object {
      return profilerDataSource.getStackQuerySummariesNear(criteria)
    }
    
    // 'value' attribute on TextAreaInput (id=SQLString) at ProfilerResultsCV.NameThisQuery.pcf: line 39, column 33
    function value_3 () : java.lang.String {
      return criteria
    }
    
    property get criteria () : java.lang.String {
      return getCriteriaValue(1) as java.lang.String
    }
    
    property set criteria ($arg :  java.lang.String) {
      setCriteriaValue(1, $arg)
    }
    
    property get globalAggregatedQuerySummaries () : gw.api.profiler.GloballyAggregatedQuerySummary[] {
      return getResultsValue(1) as gw.api.profiler.GloballyAggregatedQuerySummary[]
    }
    
    
  }
  
  
}