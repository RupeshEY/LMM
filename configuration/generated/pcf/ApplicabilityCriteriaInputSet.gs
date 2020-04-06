package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ApplicabilityCriteriaInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ApplicabilityCriteriaInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($listBundle :  gw.bizrules.ActivityRulePanelSetHelper.ShuttleListBundle) : void {
    __widgetOf(this, pcf.ApplicabilityCriteriaInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$listBundle})
  }
  
  function refreshVariables ($listBundle :  gw.bizrules.ActivityRulePanelSetHelper.ShuttleListBundle) : void {
    __widgetOf(this, pcf.ApplicabilityCriteriaInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$listBundle})
  }
  
  
}