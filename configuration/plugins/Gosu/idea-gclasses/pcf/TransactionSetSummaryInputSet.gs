package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionSetSummaryInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionSetSummaryInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($TransactionSet :  TransactionSet) : void {
    __widgetOf(this, pcf.TransactionSetSummaryInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$TransactionSet})
  }
  
  function refreshVariables ($TransactionSet :  TransactionSet) : void {
    __widgetOf(this, pcf.TransactionSetSummaryInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$TransactionSet})
  }
  
  
}