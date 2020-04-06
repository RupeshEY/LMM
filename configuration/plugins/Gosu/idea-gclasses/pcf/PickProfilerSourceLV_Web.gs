package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.Web.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PickProfilerSourceLV_Web extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.PickProfilerSourceLV_Web, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.PickProfilerSourceLV_Web, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}