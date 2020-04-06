package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefresh_PickVehicleRiskUnitsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyRefresh_PickVehicleRiskUnitsScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($wizard :  gw.api.policy.refresh.PolicyRefreshAlgorithm, $claim :  Claim, $policySummary :  PolicySummary) : void {
    __widgetOf(this, pcf.PolicyRefresh_PickVehicleRiskUnitsScreen, SECTION_WIDGET_CLASS).setVariables(false, {$wizard, $claim, $policySummary})
  }
  
  function refreshVariables ($wizard :  gw.api.policy.refresh.PolicyRefreshAlgorithm, $claim :  Claim, $policySummary :  PolicySummary) : void {
    __widgetOf(this, pcf.PolicyRefresh_PickVehicleRiskUnitsScreen, SECTION_WIDGET_CLASS).setVariables(true, {$wizard, $claim, $policySummary})
  }
  
  
}