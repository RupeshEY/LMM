package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/PickExistingDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PickExistingDocumentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DocumentList :  gw.api.database.IQueryBeanResult<Document>) : void {
    __widgetOf(this, pcf.PickExistingDocumentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$DocumentList})
  }
  
  function refreshVariables ($DocumentList :  gw.api.database.IQueryBeanResult<Document>) : void {
    __widgetOf(this, pcf.PickExistingDocumentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$DocumentList})
  }
  
  
}