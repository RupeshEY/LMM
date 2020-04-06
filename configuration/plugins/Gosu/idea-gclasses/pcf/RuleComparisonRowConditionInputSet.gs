package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowConditionInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonRowConditionInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($row :  gw.bizrules.pcf.RuleComparisonRow<String>) : void {
    __widgetOf(this, pcf.RuleComparisonRowConditionInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$row})
  }
  
  function refreshVariables ($row :  gw.bizrules.pcf.RuleComparisonRow<String>) : void {
    __widgetOf(this, pcf.RuleComparisonRowConditionInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$row})
  }
  
  
}