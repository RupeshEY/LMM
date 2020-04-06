package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsCV_GroupFrames extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($profilerDataSource :  gw.api.profiler.ProfilerDataSource) : void {
    __widgetOf(this, pcf.ProfilerResultsCV_GroupFrames, SECTION_WIDGET_CLASS).setVariables(false, {$profilerDataSource})
  }
  
  function refreshVariables ($profilerDataSource :  gw.api.profiler.ProfilerDataSource) : void {
    __widgetOf(this, pcf.ProfilerResultsCV_GroupFrames, SECTION_WIDGET_CLASS).setVariables(true, {$profilerDataSource})
  }
  
  
}