package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/ECFDocumentSearchMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFDocumentSearchMenuItemSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  entity.Claim, $transactionReferences :  List<String>) : void {
    __widgetOf(this, pcf.ECFDocumentSearchMenuItemSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $transactionReferences})
  }
  
  function refreshVariables ($claim :  entity.Claim, $transactionReferences :  List<String>) : void {
    __widgetOf(this, pcf.ECFDocumentSearchMenuItemSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $transactionReferences})
  }
  
  
}