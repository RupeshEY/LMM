package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizardCheckDV.ready.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizardCheckDV_ready extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.FNOLWizardCheckDV_ready, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $Wizard})
  }
  
  function refreshVariables ($claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.FNOLWizardCheckDV_ready, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $Wizard})
  }
  
  
}