package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/DeleteReserveSetDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DeleteReserveSetDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($TransactionSet :  TransactionSet) : void {
    __widgetOf(this, pcf.DeleteReserveSetDV, SECTION_WIDGET_CLASS).setVariables(false, {$TransactionSet})
  }
  
  function refreshVariables ($TransactionSet :  TransactionSet) : void {
    __widgetOf(this, pcf.DeleteReserveSetDV, SECTION_WIDGET_CLASS).setVariables(true, {$TransactionSet})
  }
  
  
}