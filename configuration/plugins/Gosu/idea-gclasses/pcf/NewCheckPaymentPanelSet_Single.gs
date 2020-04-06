package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/NewCheckPaymentPanelSet.Single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCheckPaymentPanelSet_Single extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Wizard :  gw.api.financials.CheckWizardInfo, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.NewCheckPaymentPanelSet_Single, SECTION_WIDGET_CLASS).setVariables(false, {$Wizard, $reserveLineInputSetHelper})
  }
  
  function refreshVariables ($Wizard :  gw.api.financials.CheckWizardInfo, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.NewCheckPaymentPanelSet_Single, SECTION_WIDGET_CLASS).setVariables(true, {$Wizard, $reserveLineInputSetHelper})
  }
  
  
}