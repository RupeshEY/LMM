package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentTemplateSearchResultLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DocTemplateSearchResultsList :  DocumentTemplateSearchResults[]) : void {
    __widgetOf(this, pcf.DocumentTemplateSearchResultLV, SECTION_WIDGET_CLASS).setVariables(false, {$DocTemplateSearchResultsList})
  }
  
  function refreshVariables ($DocTemplateSearchResultsList :  DocumentTemplateSearchResults[]) : void {
    __widgetOf(this, pcf.DocumentTemplateSearchResultLV, SECTION_WIDGET_CLASS).setVariables(true, {$DocTemplateSearchResultsList})
  }
  
  
}