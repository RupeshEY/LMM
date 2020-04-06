package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandLabelInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonCommandLabelInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($controller :  gw.bizrules.pcf.RuleVersionComparisonController, $actionLabel :  String) : void {
    __widgetOf(this, pcf.RuleComparisonCommandLabelInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$controller, $actionLabel})
  }
  
  function refreshVariables ($controller :  gw.bizrules.pcf.RuleVersionComparisonController, $actionLabel :  String) : void {
    __widgetOf(this, pcf.RuleComparisonCommandLabelInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$controller, $actionLabel})
  }
  
  
}