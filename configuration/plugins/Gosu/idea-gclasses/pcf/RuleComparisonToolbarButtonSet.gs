package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonToolbarButtonSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($importEntry :  RuleImportTaskEntry, $importHelper :  gw.bizrules.pcf.RuleExportImportPageHelper, $navSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport) : void {
    __widgetOf(this, pcf.RuleComparisonToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(false, {$importEntry, $importHelper, $navSupport})
  }
  
  function refreshVariables ($importEntry :  RuleImportTaskEntry, $importHelper :  gw.bizrules.pcf.RuleExportImportPageHelper, $navSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport) : void {
    __widgetOf(this, pcf.RuleComparisonToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(true, {$importEntry, $importHelper, $navSupport})
  }
  
  
}