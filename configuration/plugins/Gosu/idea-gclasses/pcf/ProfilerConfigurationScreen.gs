package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerConfigurationScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($enableWebProfilingActions :  block(), $disableWebProfilingActions :  block()) : void {
    __widgetOf(this, pcf.ProfilerConfigurationScreen, SECTION_WIDGET_CLASS).setVariables(false, {$enableWebProfilingActions, $disableWebProfilingActions})
  }
  
  function refreshVariables ($enableWebProfilingActions :  block(), $disableWebProfilingActions :  block()) : void {
    __widgetOf(this, pcf.ProfilerConfigurationScreen, SECTION_WIDGET_CLASS).setVariables(true, {$enableWebProfilingActions, $disableWebProfilingActions})
  }
  
  
}