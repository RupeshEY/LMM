package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/EnableWebProfilerPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EnableWebProfilerPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($enableProfilingActions :  block(), $disableProfilingActions :  block()) : void {
    __widgetOf(this, pcf.EnableWebProfilerPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$enableProfilingActions, $disableProfilingActions})
  }
  
  function refreshVariables ($enableProfilingActions :  block(), $disableProfilingActions :  block()) : void {
    __widgetOf(this, pcf.EnableWebProfilerPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$enableProfilingActions, $disableProfilingActions})
  }
  
  
}