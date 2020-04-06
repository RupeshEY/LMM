package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/QuickCheckWizard_QuickCheckBasicsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class QuickCheckWizard_QuickCheckBasicsScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Wizard :  gw.api.financials.QuickCreateCheckWizardInfo) : void {
    __widgetOf(this, pcf.QuickCheckWizard_QuickCheckBasicsScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Wizard})
  }
  
  function refreshVariables ($Claim :  Claim, $Wizard :  gw.api.financials.QuickCreateCheckWizardInfo) : void {
    __widgetOf(this, pcf.QuickCheckWizard_QuickCheckBasicsScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Wizard})
  }
  
  
}