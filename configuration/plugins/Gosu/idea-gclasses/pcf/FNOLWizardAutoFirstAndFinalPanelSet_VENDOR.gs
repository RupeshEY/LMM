package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizardAutoFirstAndFinalPanelSet.VENDOR.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizardAutoFirstAndFinalPanelSet_VENDOR extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo, $VehicleIncident :  VehicleIncident) : void {
    __widgetOf(this, pcf.FNOLWizardAutoFirstAndFinalPanelSet_VENDOR, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Wizard, $VehicleIncident})
  }
  
  function refreshVariables ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo, $VehicleIncident :  VehicleIncident) : void {
    __widgetOf(this, pcf.FNOLWizardAutoFirstAndFinalPanelSet_VENDOR, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Wizard, $VehicleIncident})
  }
  
  
}