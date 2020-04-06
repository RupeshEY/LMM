package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizardAutoFirstAndFinalPanelSet.INSURED.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizardAutoFirstAndFinalPanelSet_INSURED extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo, $VehicleIncident :  VehicleIncident) : void {
    __widgetOf(this, pcf.FNOLWizardAutoFirstAndFinalPanelSet_INSURED, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Wizard, $VehicleIncident})
  }
  
  function refreshVariables ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo, $VehicleIncident :  VehicleIncident) : void {
    __widgetOf(this, pcf.FNOLWizardAutoFirstAndFinalPanelSet_INSURED, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Wizard, $VehicleIncident})
  }
  
  
}