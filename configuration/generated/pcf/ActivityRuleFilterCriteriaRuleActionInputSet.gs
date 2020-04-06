package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleFilterCriteriaRuleActionInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityRuleFilterCriteriaRuleActionInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivityRuleFilterCriteria :  gw.bizrules.ActivityRuleFilterCriteria) : void {
    __widgetOf(this, pcf.ActivityRuleFilterCriteriaRuleActionInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$ActivityRuleFilterCriteria})
  }
  
  function refreshVariables ($ActivityRuleFilterCriteria :  gw.bizrules.ActivityRuleFilterCriteria) : void {
    __widgetOf(this, pcf.ActivityRuleFilterCriteriaRuleActionInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$ActivityRuleFilterCriteria})
  }
  
  
}