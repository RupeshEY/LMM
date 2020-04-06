package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationLDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim) : void {
    __widgetOf(this, pcf.PolicyLocationLDV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim})
  }
  
  function refreshVariables ($Claim :  Claim) : void {
    __widgetOf(this, pcf.PolicyLocationLDV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim})
  }
  
  
}