package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonSectionLabelInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonSectionLabelInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($controller :  gw.bizrules.pcf.RuleVersionComparisonController, $sectionLabel :  String) : void {
    __widgetOf(this, pcf.RuleComparisonSectionLabelInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$controller, $sectionLabel})
  }
  
  function refreshVariables ($controller :  gw.bizrules.pcf.RuleVersionComparisonController, $sectionLabel :  String) : void {
    __widgetOf(this, pcf.RuleComparisonSectionLabelInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$controller, $sectionLabel})
  }
  
  
}