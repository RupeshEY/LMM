package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ConditionBuilderPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($controller :  gw.bizrules.pcf.ConditionBuilderController) : void {
    __widgetOf(this, pcf.ConditionBuilderPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$controller})
  }
  
  function refreshVariables ($controller :  gw.bizrules.pcf.ConditionBuilderController) : void {
    __widgetOf(this, pcf.ConditionBuilderPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$controller})
  }
  
  
}