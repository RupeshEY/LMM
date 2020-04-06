package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/shared/EditTransactionInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditTransactionInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($payment :  Payment, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.EditTransactionInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$payment, $reserveLineInputSetHelper})
  }
  
  function refreshVariables ($payment :  Payment, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.EditTransactionInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$payment, $reserveLineInputSetHelper})
  }
  
  
}