package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerFrameGroupLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($profilerDataSource :  gw.api.profiler.ProfilerDataSource, $profilerFrameGroupSource :  gw.api.profiler.ProfilerFrameGroupSource) : void {
    __widgetOf(this, pcf.ProfilerFrameGroupLV, SECTION_WIDGET_CLASS).setVariables(false, {$profilerDataSource, $profilerFrameGroupSource})
  }
  
  function refreshVariables ($profilerDataSource :  gw.api.profiler.ProfilerDataSource, $profilerFrameGroupSource :  gw.api.profiler.ProfilerFrameGroupSource) : void {
    __widgetOf(this, pcf.ProfilerFrameGroupLV, SECTION_WIDGET_CLASS).setVariables(true, {$profilerDataSource, $profilerFrameGroupSource})
  }
  
  
}