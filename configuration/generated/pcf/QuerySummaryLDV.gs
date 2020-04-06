package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class QuerySummaryLDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($querySummaries :  gw.api.profiler.QuerySummary[]) : void {
    __widgetOf(this, pcf.QuerySummaryLDV, SECTION_WIDGET_CLASS).setVariables(false, {$querySummaries})
  }
  
  function refreshVariables ($querySummaries :  gw.api.profiler.QuerySummary[]) : void {
    __widgetOf(this, pcf.QuerySummaryLDV, SECTION_WIDGET_CLASS).setVariables(true, {$querySummaries})
  }
  
  
}