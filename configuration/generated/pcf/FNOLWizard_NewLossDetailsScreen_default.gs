package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NewLossDetailsScreen_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.FNOLWizard_NewLossDetailsScreen_default, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Wizard})
  }
  
  function refreshVariables ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.FNOLWizard_NewLossDetailsScreen_default, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Wizard})
  }
  
  
}