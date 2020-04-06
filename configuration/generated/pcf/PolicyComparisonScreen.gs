package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyComparisonScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($wizard :  gw.api.policy.refresh.PolicyRefreshAlgorithm, $claim :  Claim) : void {
    __widgetOf(this, pcf.PolicyComparisonScreen, SECTION_WIDGET_CLASS).setVariables(false, {$wizard, $claim})
  }
  
  function refreshVariables ($wizard :  gw.api.policy.refresh.PolicyRefreshAlgorithm, $claim :  Claim) : void {
    __widgetOf(this, pcf.PolicyComparisonScreen, SECTION_WIDGET_CLASS).setVariables(true, {$wizard, $claim})
  }
  
  
}