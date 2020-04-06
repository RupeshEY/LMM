package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsEmptyDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsEmptyDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.ProfilerResultsEmptyDV, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.ProfilerResultsEmptyDV, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}