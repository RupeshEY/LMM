package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/DeployRulesToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DeployRulesToolbarButtonSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, $iteratorId :  String, $visibleRulesQuery :  gw.api.database.Query<RuleVersion>) : void {
    __widgetOf(this, pcf.DeployRulesToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(false, {$navigationSupport, $iteratorId, $visibleRulesQuery})
  }
  
  function refreshVariables ($navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, $iteratorId :  String, $visibleRulesQuery :  gw.api.database.Query<RuleVersion>) : void {
    __widgetOf(this, pcf.DeployRulesToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(true, {$navigationSupport, $iteratorId, $visibleRulesQuery})
  }
  
  
}