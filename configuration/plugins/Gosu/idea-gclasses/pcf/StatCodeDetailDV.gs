package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/policy/StatCodeDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class StatCodeDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($StatCode :  StatCode) : void {
    __widgetOf(this, pcf.StatCodeDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$StatCode})
  }
  
  function refreshVariables ($StatCode :  StatCode) : void {
    __widgetOf(this, pcf.StatCodeDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$StatCode})
  }
  
  
}