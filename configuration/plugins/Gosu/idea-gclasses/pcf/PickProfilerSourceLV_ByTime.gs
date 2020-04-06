package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.ByTime.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PickProfilerSourceLV_ByTime extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.PickProfilerSourceLV_ByTime, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.PickProfilerSourceLV_ByTime, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}