package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuerySummaryLDVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends QuerySummaryLDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=QueryTime) at QuerySummaryLDV.pcf: line 46, column 46
    function valueRoot_14 () : java.lang.Object {
      return querySummary
    }
    
    // 'value' attribute on TextCell (id=Args) at QuerySummaryLDV.pcf: line 38, column 54
    function value_10 () : java.lang.String {
      return querySummary.getShortArgs(30)
    }
    
    // 'value' attribute on TextCell (id=QueryTime) at QuerySummaryLDV.pcf: line 46, column 46
    function value_12 () : java.lang.Integer {
      return querySummary.Time
    }
    
    // 'value' attribute on TextCell (id=TotalRowCount) at QuerySummaryLDV.pcf: line 54, column 46
    function value_15 () : java.lang.Integer {
      return querySummary.RowCount
    }
    
    // 'value' attribute on TextCell (id=CallStack) at QuerySummaryLDV.pcf: line 34, column 62
    function value_8 () : java.lang.String {
      return querySummary.getDomainStackTrace(100)
    }
    
    property get querySummary () : gw.api.profiler.QuerySummary {
      return getIteratedValue(1) as gw.api.profiler.QuerySummary
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuerySummaryLDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // TemplatePanel at QuerySummaryLDV.pcf: line 63, column 24
    function renderCall_19 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.QuerySummaryLDV_TemplatePanel1.render(__writer, __escaper, SelectedQuerySummary)
    }
    
    // TemplatePanel at QuerySummaryLDV.pcf: line 73, column 24
    function renderCall_20 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.QuerySummaryLDV_TemplatePanel2.render(__writer, __escaper, SelectedQuerySummary)
    }
    
    // TemplatePanel at QuerySummaryLDV.pcf: line 83, column 24
    function renderCall_21 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.QuerySummaryLDV_TemplatePanel3.render(__writer, __escaper, SelectedQuerySummary)
    }
    
    // TemplatePanel at QuerySummaryLDV.pcf: line 93, column 24
    function renderCall_22 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.QuerySummaryLDV_TemplatePanel4.render(__writer, __escaper, SelectedQuerySummary, __writer, __escaper)
    }
    
    // TemplatePanel at QuerySummaryLDV.pcf: line 103, column 24
    function renderCall_23 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.QuerySummaryLDV_TemplatePanel5.render(__writer, __escaper, SelectedQuerySummary, __writer, __escaper)
    }
    
    // 'value' attribute on RowIterator at QuerySummaryLDV.pcf: line 34, column 62
    function sortValue_0 (querySummary :  gw.api.profiler.QuerySummary) : java.lang.Object {
      return querySummary.getDomainStackTrace(100)
    }
    
    // 'value' attribute on RowIterator at QuerySummaryLDV.pcf: line 38, column 54
    function sortValue_1 (querySummary :  gw.api.profiler.QuerySummary) : java.lang.Object {
      return querySummary.getShortArgs(30)
    }
    
    // 'value' attribute on RowIterator at QuerySummaryLDV.pcf: line 46, column 46
    function sortValue_2 (querySummary :  gw.api.profiler.QuerySummary) : java.lang.Object {
      return querySummary.Time
    }
    
    // 'value' attribute on RowIterator at QuerySummaryLDV.pcf: line 54, column 46
    function sortValue_3 (querySummary :  gw.api.profiler.QuerySummary) : java.lang.Object {
      return querySummary.RowCount
    }
    
    // '$$sumValue' attribute on RowIterator at QuerySummaryLDV.pcf: line 46, column 46
    function sumValueRoot_5 (querySummary :  gw.api.profiler.QuerySummary) : java.lang.Object {
      return querySummary
    }
    
    // 'footerSumValue' attribute on RowIterator at QuerySummaryLDV.pcf: line 46, column 46
    function sumValue_4 (querySummary :  gw.api.profiler.QuerySummary) : java.lang.Object {
      return querySummary.Time
    }
    
    // 'footerSumValue' attribute on RowIterator at QuerySummaryLDV.pcf: line 54, column 46
    function sumValue_6 (querySummary :  gw.api.profiler.QuerySummary) : java.lang.Object {
      return querySummary.RowCount
    }
    
    // 'value' attribute on RowIterator at QuerySummaryLDV.pcf: line 28, column 54
    function value_18 () : gw.api.profiler.QuerySummary[] {
      return querySummaries
    }
    
    property get SelectedQuerySummary () : gw.api.profiler.QuerySummary {
      return getCurrentSelection(0) as gw.api.profiler.QuerySummary
    }
    
    property set SelectedQuerySummary ($arg :  gw.api.profiler.QuerySummary) {
      setCurrentSelection(0, $arg)
    }
    
    property get querySummaries () : gw.api.profiler.QuerySummary[] {
      return getRequireValue("querySummaries", 0) as gw.api.profiler.QuerySummary[]
    }
    
    property set querySummaries ($arg :  gw.api.profiler.QuerySummary[]) {
      setRequireValue("querySummaries", 0, $arg)
    }
    
    
  }
  
  
}