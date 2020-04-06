package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/NewCheckPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCheckPaymentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PaymentList :  Payment[], $Wizard :  gw.api.financials.CheckWizardInfo) : void {
    __widgetOf(this, pcf.NewCheckPaymentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$PaymentList, $Wizard})
  }
  
  function refreshVariables ($PaymentList :  Payment[], $Wizard :  gw.api.financials.CheckWizardInfo) : void {
    __widgetOf(this, pcf.NewCheckPaymentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$PaymentList, $Wizard})
  }
  
  
}