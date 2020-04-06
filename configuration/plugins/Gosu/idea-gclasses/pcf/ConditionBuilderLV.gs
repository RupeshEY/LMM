package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ConditionBuilderLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($controller :  gw.bizrules.pcf.ConditionBuilderController, $advanced :  boolean) : void {
    __widgetOf(this, pcf.ConditionBuilderLV, SECTION_WIDGET_CLASS).setVariables(false, {$controller, $advanced})
  }
  
  function refreshVariables ($controller :  gw.bizrules.pcf.ConditionBuilderController, $advanced :  boolean) : void {
    __widgetOf(this, pcf.ConditionBuilderLV, SECTION_WIDGET_CLASS).setVariables(true, {$controller, $advanced})
  }
  
  
}