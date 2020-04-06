package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NoteTemplateSearchResultLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($NoteTemplateSearchResultsList :  NoteTemplateSearchResults[]) : void {
    __widgetOf(this, pcf.NoteTemplateSearchResultLV, SECTION_WIDGET_CLASS).setVariables(false, {$NoteTemplateSearchResultsList})
  }
  
  function refreshVariables ($NoteTemplateSearchResultsList :  NoteTemplateSearchResults[]) : void {
    __widgetOf(this, pcf.NoteTemplateSearchResultLV, SECTION_WIDGET_CLASS).setVariables(true, {$NoteTemplateSearchResultsList})
  }
  
  
}