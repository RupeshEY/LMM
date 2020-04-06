package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowTypeKeyInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonRowTypeKeyInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($row :  gw.bizrules.pcf.RuleComparisonRow<gw.entity.TypeKey>) : void {
    __widgetOf(this, pcf.RuleComparisonRowTypeKeyInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$row})
  }
  
  function refreshVariables ($row :  gw.bizrules.pcf.RuleComparisonRow<gw.entity.TypeKey>) : void {
    __widgetOf(this, pcf.RuleComparisonRowTypeKeyInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$row})
  }
  
  
}