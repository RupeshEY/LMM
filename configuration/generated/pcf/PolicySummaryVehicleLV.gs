package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicySummaryVehicleLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySummaryVehicleLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($policySummary :  PolicySummary, $showCheckboxes :  boolean, $checkboxesAvailable :  boolean) : void {
    __widgetOf(this, pcf.PolicySummaryVehicleLV, SECTION_WIDGET_CLASS).setVariables(false, {$policySummary, $showCheckboxes, $checkboxesAvailable})
  }
  
  function refreshVariables ($policySummary :  PolicySummary, $showCheckboxes :  boolean, $checkboxesAvailable :  boolean) : void {
    __widgetOf(this, pcf.PolicySummaryVehicleLV, SECTION_WIDGET_CLASS).setVariables(true, {$policySummary, $showCheckboxes, $checkboxesAvailable})
  }
  
  
}