package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleListPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleListPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, $dataHolder :  gw.bizrules.pcf.LVDataHolder<RuleVersion>) : void {
    __widgetOf(this, pcf.RuleListPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$navigationSupport, $dataHolder})
  }
  
  function refreshVariables ($navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, $dataHolder :  gw.bizrules.pcf.LVDataHolder<RuleVersion>) : void {
    __widgetOf(this, pcf.RuleListPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$navigationSupport, $dataHolder})
  }
  
  
}