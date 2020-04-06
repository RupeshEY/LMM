package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicyLocationParam :  PolicyLocation, $Claim :  Claim, $EditMode :  Boolean) : void {
    __widgetOf(this, pcf.PolicyLocationScreen, SECTION_WIDGET_CLASS).setVariables(false, {$PolicyLocationParam, $Claim, $EditMode})
  }
  
  function refreshVariables ($PolicyLocationParam :  PolicyLocation, $Claim :  Claim, $EditMode :  Boolean) : void {
    __widgetOf(this, pcf.PolicyLocationScreen, SECTION_WIDGET_CLASS).setVariables(true, {$PolicyLocationParam, $Claim, $EditMode})
  }
  
  
}