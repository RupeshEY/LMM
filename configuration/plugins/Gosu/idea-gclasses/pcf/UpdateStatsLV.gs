package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/UpdateStatsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UpdateStatsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PageHelper :  gw.api.tools.UpdateStatsDVHelper) : void {
    __widgetOf(this, pcf.UpdateStatsLV, SECTION_WIDGET_CLASS).setVariables(false, {$PageHelper})
  }
  
  function refreshVariables ($PageHelper :  gw.api.tools.UpdateStatsDVHelper) : void {
    __widgetOf(this, pcf.UpdateStatsLV, SECTION_WIDGET_CLASS).setVariables(true, {$PageHelper})
  }
  
  
}