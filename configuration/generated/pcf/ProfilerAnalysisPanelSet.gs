package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerAnalysisPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($profilerDataSource :  gw.api.profiler.ProfilerDataSource, $entryPointType :  String) : void {
    __widgetOf(this, pcf.ProfilerAnalysisPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$profilerDataSource, $entryPointType})
  }
  
  function refreshVariables ($profilerDataSource :  gw.api.profiler.ProfilerDataSource, $entryPointType :  String) : void {
    __widgetOf(this, pcf.ProfilerAnalysisPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$profilerDataSource, $entryPointType})
  }
  
  
}