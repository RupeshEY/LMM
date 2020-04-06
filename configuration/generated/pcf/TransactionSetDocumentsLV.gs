package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/TransactionSetDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionSetDocumentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($TransactionSet :  TransactionSet) : void {
    __widgetOf(this, pcf.TransactionSetDocumentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$TransactionSet})
  }
  
  function refreshVariables ($TransactionSet :  TransactionSet) : void {
    __widgetOf(this, pcf.TransactionSetDocumentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$TransactionSet})
  }
  
  
}