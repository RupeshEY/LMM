package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckWizard_CheckInstructionsScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $wizard :  gw.api.financials.CheckWizardInfo) : void {
    __widgetOf(this, pcf.CheckWizard_CheckInstructionsScreen, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $wizard})
  }
  
  function refreshVariables ($claim :  Claim, $wizard :  gw.api.financials.CheckWizardInfo) : void {
    __widgetOf(this, pcf.CheckWizard_CheckInstructionsScreen, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $wizard})
  }
  
  
}