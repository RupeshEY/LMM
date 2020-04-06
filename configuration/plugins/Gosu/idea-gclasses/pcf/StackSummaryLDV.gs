package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/StackSummaryLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class StackSummaryLDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($stacks :  gw.api.profiler.StackAggregatedQuerySummary[]) : void {
    __widgetOf(this, pcf.StackSummaryLDV, SECTION_WIDGET_CLASS).setVariables(false, {$stacks})
  }
  
  function refreshVariables ($stacks :  gw.api.profiler.StackAggregatedQuerySummary[]) : void {
    __widgetOf(this, pcf.StackSummaryLDV, SECTION_WIDGET_CLASS).setVariables(true, {$stacks})
  }
  
  
}