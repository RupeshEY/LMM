package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowBooleanInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonRowBooleanInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($row :  gw.bizrules.pcf.RuleComparisonRow<Boolean>) : void {
    __widgetOf(this, pcf.RuleComparisonRowBooleanInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$row})
  }
  
  function refreshVariables ($row :  gw.bizrules.pcf.RuleComparisonRow<Boolean>) : void {
    __widgetOf(this, pcf.RuleComparisonRowBooleanInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$row})
  }
  
  
}