package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/UnmodifiableTransactionSetDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UnmodifiableTransactionSetDocumentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DocumentList :  Document[]) : void {
    __widgetOf(this, pcf.UnmodifiableTransactionSetDocumentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$DocumentList})
  }
  
  function refreshVariables ($DocumentList :  Document[]) : void {
    __widgetOf(this, pcf.UnmodifiableTransactionSetDocumentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$DocumentList})
  }
  
  
}