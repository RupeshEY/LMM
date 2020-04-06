package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/NewPaymentDetailDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewPaymentDetailDV_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Payment :  Payment, $Wizard :  gw.api.financials.CheckWizardInfo, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.NewPaymentDetailDV_default, SECTION_WIDGET_CLASS).setVariables(false, {$Payment, $Wizard, $reserveLineInputSetHelper})
  }
  
  function refreshVariables ($Payment :  Payment, $Wizard :  gw.api.financials.CheckWizardInfo, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.NewPaymentDetailDV_default, SECTION_WIDGET_CLASS).setVariables(true, {$Payment, $Wizard, $reserveLineInputSetHelper})
  }
  
  
}