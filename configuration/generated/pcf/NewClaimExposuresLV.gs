package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimExposuresLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo, $ExposureList :  Exposure[]) : void {
    __widgetOf(this, pcf.NewClaimExposuresLV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Wizard, $ExposureList})
  }
  
  function refreshVariables ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo, $ExposureList :  Exposure[]) : void {
    __widgetOf(this, pcf.NewClaimExposuresLV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Wizard, $ExposureList})
  }
  
  
}