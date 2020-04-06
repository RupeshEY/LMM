package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerOptionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerOptionsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($profilerConfig :  ProfilerConfig) : void {
    __widgetOf(this, pcf.ProfilerOptionsLV, SECTION_WIDGET_CLASS).setVariables(false, {$profilerConfig})
  }
  
  function refreshVariables ($profilerConfig :  ProfilerConfig) : void {
    __widgetOf(this, pcf.ProfilerOptionsLV, SECTION_WIDGET_CLASS).setVariables(true, {$profilerConfig})
  }
  
  
}