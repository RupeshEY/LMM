package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimPeopleInvolvedDetailedLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Wizard :  gw.api.claim.NewClaimWizardInfo, $Claim :  Claim) : void {
    __widgetOf(this, pcf.NewClaimPeopleInvolvedDetailedLV, SECTION_WIDGET_CLASS).setVariables(false, {$Wizard, $Claim})
  }
  
  function refreshVariables ($Wizard :  gw.api.claim.NewClaimWizardInfo, $Claim :  Claim) : void {
    __widgetOf(this, pcf.NewClaimPeopleInvolvedDetailedLV, SECTION_WIDGET_CLASS).setVariables(true, {$Wizard, $Claim})
  }
  
  
}