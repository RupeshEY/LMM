package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newnote/NoteTemplateSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NoteTemplateSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($NoteTemplateSearchCriteria :  NoteTemplateSearchCriteria) : void {
    __widgetOf(this, pcf.NoteTemplateSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$NoteTemplateSearchCriteria})
  }
  
  function refreshVariables ($NoteTemplateSearchCriteria :  NoteTemplateSearchCriteria) : void {
    __widgetOf(this, pcf.NoteTemplateSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$NoteTemplateSearchCriteria})
  }
  
  
}