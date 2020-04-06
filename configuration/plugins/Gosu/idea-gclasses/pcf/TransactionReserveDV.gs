package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionReserveDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionReserveDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Reserve :  Reserve) : void {
    __widgetOf(this, pcf.TransactionReserveDV, SECTION_WIDGET_CLASS).setVariables(false, {$Reserve})
  }
  
  function refreshVariables ($Reserve :  Reserve) : void {
    __widgetOf(this, pcf.TransactionReserveDV, SECTION_WIDGET_CLASS).setVariables(true, {$Reserve})
  }
  
  
}