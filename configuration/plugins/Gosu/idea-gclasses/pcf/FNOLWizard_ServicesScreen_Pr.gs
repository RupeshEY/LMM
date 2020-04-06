package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_ServicesScreen.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_ServicesScreen_Pr extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.FNOLWizard_ServicesScreen_Pr, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $wizard})
  }
  
  function refreshVariables ($claim :  Claim, $wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.FNOLWizard_ServicesScreen_Pr, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $wizard})
  }
  
  
}