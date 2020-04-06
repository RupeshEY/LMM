package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimSummaryPeopleInvolvedLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo, $ClaimContactList :  ClaimContact[]) : void {
    __widgetOf(this, pcf.NewClaimSummaryPeopleInvolvedLV, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $Wizard, $ClaimContactList})
  }
  
  function refreshVariables ($claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo, $ClaimContactList :  ClaimContact[]) : void {
    __widgetOf(this, pcf.NewClaimSummaryPeopleInvolvedLV, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $Wizard, $ClaimContactList})
  }
  
  
}