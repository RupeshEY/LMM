package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExportExclusionsPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, $exclusions :  gw.bizrules.management.RuleExportRequest.ExcludedDraftInfo[], $title :  String, $draftVersionColumnVisible :  boolean, $exportingVersionColumnVisible :  boolean) : void {
    __widgetOf(this, pcf.ExportExclusionsPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$navigationSupport, $exclusions, $title, $draftVersionColumnVisible, $exportingVersionColumnVisible})
  }
  
  function refreshVariables ($navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, $exclusions :  gw.bizrules.management.RuleExportRequest.ExcludedDraftInfo[], $title :  String, $draftVersionColumnVisible :  boolean, $exportingVersionColumnVisible :  boolean) : void {
    __widgetOf(this, pcf.ExportExclusionsPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$navigationSupport, $exclusions, $title, $draftVersionColumnVisible, $exportingVersionColumnVisible})
  }
  
  
}