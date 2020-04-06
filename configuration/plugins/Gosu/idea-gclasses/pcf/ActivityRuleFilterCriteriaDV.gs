package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleFilterCriteriaDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityRuleFilterCriteriaDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivityRuleFilterCriteria :  gw.bizrules.ActivityRuleFilterCriteria) : void {
    __widgetOf(this, pcf.ActivityRuleFilterCriteriaDV, SECTION_WIDGET_CLASS).setVariables(false, {$ActivityRuleFilterCriteria})
  }
  
  function refreshVariables ($ActivityRuleFilterCriteria :  gw.bizrules.ActivityRuleFilterCriteria) : void {
    __widgetOf(this, pcf.ActivityRuleFilterCriteriaDV, SECTION_WIDGET_CLASS).setVariables(true, {$ActivityRuleFilterCriteria})
  }
  
  
}