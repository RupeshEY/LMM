package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ArgsSummaryLDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($argsSummaries :  gw.api.profiler.ArgsAggregatedQuerySummary[]) : void {
    __widgetOf(this, pcf.ArgsSummaryLDV, SECTION_WIDGET_CLASS).setVariables(false, {$argsSummaries})
  }
  
  function refreshVariables ($argsSummaries :  gw.api.profiler.ArgsAggregatedQuerySummary[]) : void {
    __widgetOf(this, pcf.ArgsSummaryLDV, SECTION_WIDGET_CLASS).setVariables(true, {$argsSummaries})
  }
  
  
}