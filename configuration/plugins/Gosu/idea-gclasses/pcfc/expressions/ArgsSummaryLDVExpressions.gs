package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArgsSummaryLDVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArgsSummaryLDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // TemplatePanel at ArgsSummaryLDV.pcf: line 79, column 24
    function renderCall_36 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.ArgsSummaryLDV_TemplatePanel1.render(__writer, __escaper, selectedArgsSummary, __writer, __escaper)
    }
    
    // TemplatePanel at ArgsSummaryLDV.pcf: line 89, column 24
    function renderCall_37 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.ArgsSummaryLDV_TemplatePanel2.render(__writer, __escaper, selectedArgsSummary, __writer, __escaper)
    }
    
    // 'value' attribute on RowIterator at ArgsSummaryLDV.pcf: line 29, column 53
    function sortValue_0 (argsSummary :  gw.api.profiler.ArgsAggregatedQuerySummary) : java.lang.Object {
      return argsSummary.getShortArgs(80)
    }
    
    // 'value' attribute on RowIterator at ArgsSummaryLDV.pcf: line 37, column 46
    function sortValue_1 (argsSummary :  gw.api.profiler.ArgsAggregatedQuerySummary) : java.lang.Object {
      return argsSummary.ExecutionCount
    }
    
    // 'value' attribute on RowIterator at ArgsSummaryLDV.pcf: line 45, column 46
    function sortValue_2 (argsSummary :  gw.api.profiler.ArgsAggregatedQuerySummary) : java.lang.Object {
      return argsSummary.TotalTime
    }
    
    // 'value' attribute on RowIterator at ArgsSummaryLDV.pcf: line 51, column 45
    function sortValue_3 (argsSummary :  gw.api.profiler.ArgsAggregatedQuerySummary) : java.lang.Object {
      return argsSummary.AverageTime
    }
    
    // 'value' attribute on RowIterator at ArgsSummaryLDV.pcf: line 56, column 46
    function sortValue_4 (argsSummary :  gw.api.profiler.ArgsAggregatedQuerySummary) : java.lang.Object {
      return argsSummary.MaxQueryTime
    }
    
    // 'value' attribute on RowIterator at ArgsSummaryLDV.pcf: line 64, column 46
    function sortValue_5 (argsSummary :  gw.api.profiler.ArgsAggregatedQuerySummary) : java.lang.Object {
      return argsSummary.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at ArgsSummaryLDV.pcf: line 70, column 45
    function sortValue_6 (argsSummary :  gw.api.profiler.ArgsAggregatedQuerySummary) : java.lang.Object {
      return argsSummary.AverageRowCount
    }
    
    // '$$sumValue' attribute on RowIterator at ArgsSummaryLDV.pcf: line 37, column 46
    function sumValueRoot_8 (argsSummary :  gw.api.profiler.ArgsAggregatedQuerySummary) : java.lang.Object {
      return argsSummary
    }
    
    // 'footerSumValue' attribute on RowIterator at ArgsSummaryLDV.pcf: line 64, column 46
    function sumValue_11 (argsSummary :  gw.api.profiler.ArgsAggregatedQuerySummary) : java.lang.Object {
      return argsSummary.TotalRowCount
    }
    
    // 'footerSumValue' attribute on RowIterator at ArgsSummaryLDV.pcf: line 37, column 46
    function sumValue_7 (argsSummary :  gw.api.profiler.ArgsAggregatedQuerySummary) : java.lang.Object {
      return argsSummary.ExecutionCount
    }
    
    // 'footerSumValue' attribute on RowIterator at ArgsSummaryLDV.pcf: line 45, column 46
    function sumValue_9 (argsSummary :  gw.api.profiler.ArgsAggregatedQuerySummary) : java.lang.Object {
      return argsSummary.TotalTime
    }
    
    // 'value' attribute on RowIterator at ArgsSummaryLDV.pcf: line 23, column 68
    function value_35 () : gw.api.profiler.ArgsAggregatedQuerySummary[] {
      return argsSummaries
    }
    
    property get argsSummaries () : gw.api.profiler.ArgsAggregatedQuerySummary[] {
      return getRequireValue("argsSummaries", 0) as gw.api.profiler.ArgsAggregatedQuerySummary[]
    }
    
    property set argsSummaries ($arg :  gw.api.profiler.ArgsAggregatedQuerySummary[]) {
      setRequireValue("argsSummaries", 0, $arg)
    }
    
    property get selectedArgsSummary () : gw.api.profiler.ArgsAggregatedQuerySummary {
      return getCurrentSelection(0) as gw.api.profiler.ArgsAggregatedQuerySummary
    }
    
    property set selectedArgsSummary ($arg :  gw.api.profiler.ArgsAggregatedQuerySummary) {
      setCurrentSelection(0, $arg)
    }
    
    
    function formatAverage(value: java.lang.Double): String {
            return gw.api.util.StringUtil.formatNumber(value, "#,##0.00")
          }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ArgsSummaryLDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'outputConversion' attribute on TextCell (id=AverageTime) at ArgsSummaryLDV.pcf: line 51, column 45
    function outputConversion_22 (VALUE :  java.lang.Double) : java.lang.String {
      return formatAverage(VALUE)
    }
    
    // 'value' attribute on TextCell (id=QueryCount) at ArgsSummaryLDV.pcf: line 37, column 46
    function valueRoot_17 () : java.lang.Object {
      return argsSummary
    }
    
    // 'value' attribute on TextCell (id=ShortArgs) at ArgsSummaryLDV.pcf: line 29, column 53
    function value_13 () : java.lang.String {
      return argsSummary.getShortArgs(80)
    }
    
    // 'value' attribute on TextCell (id=QueryCount) at ArgsSummaryLDV.pcf: line 37, column 46
    function value_15 () : java.lang.Integer {
      return argsSummary.ExecutionCount
    }
    
    // 'value' attribute on TextCell (id=TotalQueryTime) at ArgsSummaryLDV.pcf: line 45, column 46
    function value_18 () : java.lang.Integer {
      return argsSummary.TotalTime
    }
    
    // 'value' attribute on TextCell (id=AverageTime) at ArgsSummaryLDV.pcf: line 51, column 45
    function value_21 () : java.lang.Double {
      return argsSummary.AverageTime
    }
    
    // 'value' attribute on TextCell (id=MaxQueryTime) at ArgsSummaryLDV.pcf: line 56, column 46
    function value_25 () : java.lang.Integer {
      return argsSummary.MaxQueryTime
    }
    
    // 'value' attribute on TextCell (id=TotalRowCount) at ArgsSummaryLDV.pcf: line 64, column 46
    function value_28 () : java.lang.Integer {
      return argsSummary.TotalRowCount
    }
    
    // 'value' attribute on TextCell (id=AverageRowCount) at ArgsSummaryLDV.pcf: line 70, column 45
    function value_31 () : java.lang.Double {
      return argsSummary.AverageRowCount
    }
    
    property get argsSummary () : gw.api.profiler.ArgsAggregatedQuerySummary {
      return getIteratedValue(1) as gw.api.profiler.ArgsAggregatedQuerySummary
    }
    
    
  }
  
  
}