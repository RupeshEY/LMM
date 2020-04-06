package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPaymentsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckWizard_CheckPaymentsScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Wizard :  gw.api.financials.CheckWizardInfo) : void {
    __widgetOf(this, pcf.CheckWizard_CheckPaymentsScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Wizard})
  }
  
  function refreshVariables ($Claim :  Claim, $Wizard :  gw.api.financials.CheckWizardInfo) : void {
    __widgetOf(this, pcf.CheckWizard_CheckPaymentsScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Wizard})
  }
  
  
}