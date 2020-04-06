package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyRefreshExistingVehicleRULV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $policySummary :  PolicySummary) : void {
    __widgetOf(this, pcf.PolicyRefreshExistingVehicleRULV, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $policySummary})
  }
  
  function refreshVariables ($claim :  Claim, $policySummary :  PolicySummary) : void {
    __widgetOf(this, pcf.PolicyRefreshExistingVehicleRULV, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $policySummary})
  }
  
  
}