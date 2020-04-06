package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicyLocations :  PolicyLocation[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.PolicyLocationsLV, SECTION_WIDGET_CLASS).setVariables(false, {$PolicyLocations, $Claim})
  }
  
  function refreshVariables ($PolicyLocations :  PolicyLocation[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.PolicyLocationsLV, SECTION_WIDGET_CLASS).setVariables(true, {$PolicyLocations, $Claim})
  }
  
  
}