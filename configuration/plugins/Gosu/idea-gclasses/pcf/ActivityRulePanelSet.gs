package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRulePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityRulePanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($version :  ActivityRuleVersion, $importingVersion :  boolean, $controller :  gw.bizrules.pcf.RulePageController) : void {
    __widgetOf(this, pcf.ActivityRulePanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$version, $importingVersion, $controller})
  }
  
  function refreshVariables ($version :  ActivityRuleVersion, $importingVersion :  boolean, $controller :  gw.bizrules.pcf.RulePageController) : void {
    __widgetOf(this, pcf.ActivityRulePanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$version, $importingVersion, $controller})
  }
  
  
}