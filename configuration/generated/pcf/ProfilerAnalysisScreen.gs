package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerAnalysisScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($entryType :  String) : void {
    __widgetOf(this, pcf.ProfilerAnalysisScreen, SECTION_WIDGET_CLASS).setVariables(false, {$entryType})
  }
  
  function refreshVariables ($entryType :  String) : void {
    __widgetOf(this, pcf.ProfilerAnalysisScreen, SECTION_WIDGET_CLASS).setVariables(true, {$entryType})
  }
  
  
}