package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonColumnHeadingsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonColumnHeadingsInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($controller :  gw.bizrules.pcf.RuleVersionComparisonController, $headings :  List<String>) : void {
    __widgetOf(this, pcf.RuleComparisonColumnHeadingsInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$controller, $headings})
  }
  
  function refreshVariables ($controller :  gw.bizrules.pcf.RuleVersionComparisonController, $headings :  List<String>) : void {
    __widgetOf(this, pcf.RuleComparisonColumnHeadingsInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$controller, $headings})
  }
  
  
}