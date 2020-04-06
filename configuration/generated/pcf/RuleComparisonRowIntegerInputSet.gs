package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowIntegerInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonRowIntegerInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($row :  gw.bizrules.pcf.RuleComparisonRow<Integer>) : void {
    __widgetOf(this, pcf.RuleComparisonRowIntegerInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$row})
  }
  
  function refreshVariables ($row :  gw.bizrules.pcf.RuleComparisonRow<Integer>) : void {
    __widgetOf(this, pcf.RuleComparisonRowIntegerInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$row})
  }
  
  
}