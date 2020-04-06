package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewPaymentInstructionsDV_single extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Check :  Check, $Wizard :  gw.api.financials.CheckWizardInfo) : void {
    __widgetOf(this, pcf.NewPaymentInstructionsDV_single, SECTION_WIDGET_CLASS).setVariables(false, {$Check, $Wizard})
  }
  
  function refreshVariables ($Check :  Check, $Wizard :  gw.api.financials.CheckWizardInfo) : void {
    __widgetOf(this, pcf.NewPaymentInstructionsDV_single, SECTION_WIDGET_CLASS).setVariables(true, {$Check, $Wizard})
  }
  
  
}