package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/StackSummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StackSummaryLDVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/StackSummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends StackSummaryLDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'outputConversion' attribute on TextCell (id=ArgsAverageTime) at StackSummaryLDV.pcf: line 132, column 49
    function outputConversion_48 (VALUE :  java.lang.Double) : java.lang.String {
      return formatAverage(VALUE)
    }
    
    // 'value' attribute on TextCell (id=AllArgs) at StackSummaryLDV.pcf: line 110, column 32
    function valueRoot_40 () : java.lang.Object {
      return args
    }
    
    // 'value' attribute on TextCell (id=AllArgs) at StackSummaryLDV.pcf: line 110, column 32
    function value_38 () : java.lang.String {
      return args.Args
    }
    
    // 'value' attribute on TextCell (id=ArgsQueryCount) at StackSummaryLDV.pcf: line 118, column 50
    function value_41 () : java.lang.Integer {
      return args.ExecutionCount
    }
    
    // 'value' attribute on TextCell (id=ArgsTotalQueryTime) at StackSummaryLDV.pcf: line 126, column 50
    function value_44 () : java.lang.Integer {
      return args.TotalTime
    }
    
    // 'value' attribute on TextCell (id=ArgsAverageTime) at StackSummaryLDV.pcf: line 132, column 49
    function value_47 () : java.lang.Double {
      return args.AverageTime
    }
    
    // 'value' attribute on TextCell (id=ArgsMaxQueryTime) at StackSummaryLDV.pcf: line 137, column 50
    function value_51 () : java.lang.Integer {
      return args.MaxQueryTime
    }
    
    // 'value' attribute on TextCell (id=TotalRowCount) at StackSummaryLDV.pcf: line 145, column 50
    function value_54 () : java.lang.Integer {
      return args.TotalRowCount
    }
    
    // 'value' attribute on TextCell (id=AverageRowCount) at StackSummaryLDV.pcf: line 151, column 49
    function value_57 () : java.lang.Double {
      return args.AverageRowCount
    }
    
    property get args () : gw.api.profiler.ArgsStackAggregatedQuerySummary {
      return getIteratedValue(1) as gw.api.profiler.ArgsStackAggregatedQuerySummary
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/StackSummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends StackSummaryLDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ArgsCount) at StackSummaryLDV.pcf: line 35, column 46
    function valueRoot_14 () : java.lang.Object {
      return stack
    }
    
    // 'value' attribute on TextCell (id=SummarizedStack) at StackSummaryLDV.pcf: line 29, column 54
    function value_10 () : java.lang.String {
      return stack.getDomainStackTrace(70)
    }
    
    // 'value' attribute on TextCell (id=ArgsCount) at StackSummaryLDV.pcf: line 35, column 46
    function value_12 () : java.lang.Integer {
      return stack.NumDistinctArgLists
    }
    
    // 'value' attribute on TextCell (id=TotalQueryTime) at StackSummaryLDV.pcf: line 43, column 46
    function value_15 () : java.lang.Integer {
      return stack.TotalTime
    }
    
    // 'value' attribute on TextCell (id=TotalRowCount) at StackSummaryLDV.pcf: line 51, column 46
    function value_18 () : java.lang.Integer {
      return stack.TotalRowCount
    }
    
    property get stack () : gw.api.profiler.StackAggregatedQuerySummary {
      return getIteratedValue(1) as gw.api.profiler.StackAggregatedQuerySummary
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/StackSummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StackSummaryLDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // TemplatePanel at StackSummaryLDV.pcf: line 60, column 24
    function renderCall_22 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.StackSummaryLDV_TemplatePanel1.render(__writer, __escaper, selectedStackSummary)
    }
    
    // TemplatePanel at StackSummaryLDV.pcf: line 72, column 24
    function renderCall_23 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.StackSummaryLDV_TemplatePanel2.render(__writer, __escaper, selectedStackSummary)
    }
    
    // TemplatePanel at StackSummaryLDV.pcf: line 84, column 24
    function renderCall_24 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.StackSummaryLDV_TemplatePanel3.render(__writer, __escaper, selectedStackSummary, __writer, __escaper)
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 29, column 54
    function sortValue_0 (stack :  gw.api.profiler.StackAggregatedQuerySummary) : java.lang.Object {
      return stack.getDomainStackTrace(70)
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 35, column 46
    function sortValue_1 (stack :  gw.api.profiler.StackAggregatedQuerySummary) : java.lang.Object {
      return stack.NumDistinctArgLists
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 43, column 46
    function sortValue_2 (stack :  gw.api.profiler.StackAggregatedQuerySummary) : java.lang.Object {
      return stack.TotalTime
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 110, column 32
    function sortValue_25 (args :  gw.api.profiler.ArgsStackAggregatedQuerySummary) : java.lang.Object {
      return args.Args
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 118, column 50
    function sortValue_26 (args :  gw.api.profiler.ArgsStackAggregatedQuerySummary) : java.lang.Object {
      return args.ExecutionCount
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 126, column 50
    function sortValue_27 (args :  gw.api.profiler.ArgsStackAggregatedQuerySummary) : java.lang.Object {
      return args.TotalTime
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 132, column 49
    function sortValue_28 (args :  gw.api.profiler.ArgsStackAggregatedQuerySummary) : java.lang.Object {
      return args.AverageTime
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 137, column 50
    function sortValue_29 (args :  gw.api.profiler.ArgsStackAggregatedQuerySummary) : java.lang.Object {
      return args.MaxQueryTime
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 51, column 46
    function sortValue_3 (stack :  gw.api.profiler.StackAggregatedQuerySummary) : java.lang.Object {
      return stack.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 145, column 50
    function sortValue_30 (args :  gw.api.profiler.ArgsStackAggregatedQuerySummary) : java.lang.Object {
      return args.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 151, column 49
    function sortValue_31 (args :  gw.api.profiler.ArgsStackAggregatedQuerySummary) : java.lang.Object {
      return args.AverageRowCount
    }
    
    // '$$sumValue' attribute on RowIterator at StackSummaryLDV.pcf: line 118, column 50
    function sumValueRoot_33 (args :  gw.api.profiler.ArgsStackAggregatedQuerySummary) : java.lang.Object {
      return args
    }
    
    // '$$sumValue' attribute on RowIterator at StackSummaryLDV.pcf: line 35, column 46
    function sumValueRoot_5 (stack :  gw.api.profiler.StackAggregatedQuerySummary) : java.lang.Object {
      return stack
    }
    
    // 'footerSumValue' attribute on RowIterator at StackSummaryLDV.pcf: line 118, column 50
    function sumValue_32 (args :  gw.api.profiler.ArgsStackAggregatedQuerySummary) : java.lang.Object {
      return args.ExecutionCount
    }
    
    // 'footerSumValue' attribute on RowIterator at StackSummaryLDV.pcf: line 126, column 50
    function sumValue_34 (args :  gw.api.profiler.ArgsStackAggregatedQuerySummary) : java.lang.Object {
      return args.TotalTime
    }
    
    // 'footerSumValue' attribute on RowIterator at StackSummaryLDV.pcf: line 145, column 50
    function sumValue_36 (args :  gw.api.profiler.ArgsStackAggregatedQuerySummary) : java.lang.Object {
      return args.TotalRowCount
    }
    
    // 'footerSumValue' attribute on RowIterator at StackSummaryLDV.pcf: line 35, column 46
    function sumValue_4 (stack :  gw.api.profiler.StackAggregatedQuerySummary) : java.lang.Object {
      return stack.NumDistinctArgLists
    }
    
    // 'footerSumValue' attribute on RowIterator at StackSummaryLDV.pcf: line 43, column 46
    function sumValue_6 (stack :  gw.api.profiler.StackAggregatedQuerySummary) : java.lang.Object {
      return stack.TotalTime
    }
    
    // 'footerSumValue' attribute on RowIterator at StackSummaryLDV.pcf: line 51, column 46
    function sumValue_8 (stack :  gw.api.profiler.StackAggregatedQuerySummary) : java.lang.Object {
      return stack.TotalRowCount
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 23, column 69
    function value_21 () : gw.api.profiler.StackAggregatedQuerySummary[] {
      return stacks
    }
    
    // 'value' attribute on RowIterator at StackSummaryLDV.pcf: line 104, column 77
    function value_61 () : gw.api.profiler.ArgsStackAggregatedQuerySummary[] {
      return selectedStackSummary.ArgsStackAggregatedQuerySummaries
    }
    
    property get selectedStackSummary () : gw.api.profiler.StackAggregatedQuerySummary {
      return getCurrentSelection(0) as gw.api.profiler.StackAggregatedQuerySummary
    }
    
    property set selectedStackSummary ($arg :  gw.api.profiler.StackAggregatedQuerySummary) {
      setCurrentSelection(0, $arg)
    }
    
    property get stacks () : gw.api.profiler.StackAggregatedQuerySummary[] {
      return getRequireValue("stacks", 0) as gw.api.profiler.StackAggregatedQuerySummary[]
    }
    
    property set stacks ($arg :  gw.api.profiler.StackAggregatedQuerySummary[]) {
      setRequireValue("stacks", 0, $arg)
    }
    
    
          function formatAverage(value: java.lang.Double): String {
            return gw.api.util.StringUtil.formatNumber(value, "#,##0.00")
          }
        
    
    
  }
  
  
}