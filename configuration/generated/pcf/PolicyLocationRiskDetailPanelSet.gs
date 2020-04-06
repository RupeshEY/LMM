package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationRiskDetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationRiskDetailPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicyLocation :  PolicyLocation, $Policy :  Policy) : void {
    __widgetOf(this, pcf.PolicyLocationRiskDetailPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$PolicyLocation, $Policy})
  }
  
  function refreshVariables ($PolicyLocation :  PolicyLocation, $Policy :  Policy) : void {
    __widgetOf(this, pcf.PolicyLocationRiskDetailPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$PolicyLocation, $Policy})
  }
  
  
}