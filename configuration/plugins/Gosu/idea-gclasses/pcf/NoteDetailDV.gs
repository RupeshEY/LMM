package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/NoteDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NoteDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Note :  Note, $topicEditable :  boolean, $relatedToEditable :  boolean) : void {
    __widgetOf(this, pcf.NoteDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$Note, $topicEditable, $relatedToEditable})
  }
  
  function refreshVariables ($Note :  Note, $topicEditable :  boolean, $relatedToEditable :  boolean) : void {
    __widgetOf(this, pcf.NoteDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$Note, $topicEditable, $relatedToEditable})
  }
  
  
}