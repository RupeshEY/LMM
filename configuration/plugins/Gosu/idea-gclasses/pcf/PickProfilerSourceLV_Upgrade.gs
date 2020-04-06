package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.Upgrade.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PickProfilerSourceLV_Upgrade extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.PickProfilerSourceLV_Upgrade, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.PickProfilerSourceLV_Upgrade, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}