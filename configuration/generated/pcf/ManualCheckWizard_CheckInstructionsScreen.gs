package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckInstructionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ManualCheckWizard_CheckInstructionsScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Wizard :  gw.api.financials.CheckWizardInfo) : void {
    __widgetOf(this, pcf.ManualCheckWizard_CheckInstructionsScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Wizard})
  }
  
  function refreshVariables ($Claim :  Claim, $Wizard :  gw.api.financials.CheckWizardInfo) : void {
    __widgetOf(this, pcf.ManualCheckWizard_CheckInstructionsScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Wizard})
  }
  
  
}