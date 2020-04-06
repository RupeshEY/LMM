package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NewLossDetailsPanelSet_homeowners extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.FNOLWizard_NewLossDetailsPanelSet_homeowners, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $wizard})
  }
  
  function refreshVariables ($claim :  Claim, $wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.FNOLWizard_NewLossDetailsPanelSet_homeowners, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $wizard})
  }
  
  
}