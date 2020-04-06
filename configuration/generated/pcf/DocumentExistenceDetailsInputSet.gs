package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentExistenceDetailsInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Document :  Document) : void {
    __widgetOf(this, pcf.DocumentExistenceDetailsInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$Document})
  }
  
  function refreshVariables ($Document :  Document) : void {
    __widgetOf(this, pcf.DocumentExistenceDetailsInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$Document})
  }
  
  
}