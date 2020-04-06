package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/trip/PolicyTripLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyTripLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aClaim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.PolicyTripLV, SECTION_WIDGET_CLASS).setVariables(false, {$aClaim, $Wizard})
  }
  
  function refreshVariables ($aClaim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.PolicyTripLV, SECTION_WIDGET_CLASS).setVariables(true, {$aClaim, $Wizard})
  }
  
  
}