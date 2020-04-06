package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentTemplateSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DocTemplateSearchCriteria :  DocumentTemplateSearchCriteria) : void {
    __widgetOf(this, pcf.DocumentTemplateSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$DocTemplateSearchCriteria})
  }
  
  function refreshVariables ($DocTemplateSearchCriteria :  DocumentTemplateSearchCriteria) : void {
    __widgetOf(this, pcf.DocumentTemplateSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$DocTemplateSearchCriteria})
  }
  
  
}