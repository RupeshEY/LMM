package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PickProfilerSourceLV_BatchProcess extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.PickProfilerSourceLV_BatchProcess, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.PickProfilerSourceLV_BatchProcess, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}