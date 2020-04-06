package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleListMoreButtonMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleListMoreButtonMenuItemSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, $iteratorId :  java.lang.String, $allQuery :  gw.api.database.Query<RuleVersion>) : void {
    __widgetOf(this, pcf.RuleListMoreButtonMenuItemSet, SECTION_WIDGET_CLASS).setVariables(false, {$navigationSupport, $iteratorId, $allQuery})
  }
  
  function refreshVariables ($navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, $iteratorId :  java.lang.String, $allQuery :  gw.api.database.Query<RuleVersion>) : void {
    __widgetOf(this, pcf.RuleListMoreButtonMenuItemSet, SECTION_WIDGET_CLASS).setVariables(true, {$navigationSupport, $iteratorId, $allQuery})
  }
  
  
}