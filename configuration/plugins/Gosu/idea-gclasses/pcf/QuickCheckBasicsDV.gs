package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class QuickCheckBasicsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Payment :  Payment, $Wizard :  gw.api.financials.QuickCreateCheckWizardInfo, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.QuickCheckBasicsDV, SECTION_WIDGET_CLASS).setVariables(false, {$Payment, $Wizard, $reserveLineInputSetHelper})
  }
  
  function refreshVariables ($Payment :  Payment, $Wizard :  gw.api.financials.QuickCreateCheckWizardInfo, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.QuickCheckBasicsDV, SECTION_WIDGET_CLASS).setVariables(true, {$Payment, $Wizard, $reserveLineInputSetHelper})
  }
  
  
}