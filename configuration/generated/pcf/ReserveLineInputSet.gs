package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/ReserveLineInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReserveLineInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($transaction :  Transaction, $helper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.ReserveLineInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$transaction, $helper})
  }
  
  function refreshVariables ($transaction :  Transaction, $helper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.ReserveLineInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$transaction, $helper})
  }
  
  
}