package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_BasicInfoPolicyPanelSet_Homeowners extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.FNOLWizard_BasicInfoPolicyPanelSet_Homeowners, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $wizard})
  }
  
  function refreshVariables ($claim :  Claim, $wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.FNOLWizard_BasicInfoPolicyPanelSet_Homeowners, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $wizard})
  }
  
  
}