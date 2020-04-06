package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowDateInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonRowDateInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($row :  gw.bizrules.pcf.RuleComparisonRow<Date>) : void {
    __widgetOf(this, pcf.RuleComparisonRowDateInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$row})
  }
  
  function refreshVariables ($row :  gw.bizrules.pcf.RuleComparisonRow<Date>) : void {
    __widgetOf(this, pcf.RuleComparisonRowDateInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$row})
  }
  
  
}