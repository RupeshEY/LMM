package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/DocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DocumentList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>, $documentSearchCriteria :  DocumentSearchCriteria) : void {
    __widgetOf(this, pcf.DocumentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$DocumentList, $documentSearchCriteria})
  }
  
  function refreshVariables ($DocumentList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>, $documentSearchCriteria :  DocumentSearchCriteria) : void {
    __widgetOf(this, pcf.DocumentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$DocumentList, $documentSearchCriteria})
  }
  
  
}