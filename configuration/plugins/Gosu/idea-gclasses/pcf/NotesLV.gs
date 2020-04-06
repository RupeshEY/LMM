package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/NotesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NotesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($NoteList :  gw.api.database.IQueryBeanResult<Note>) : void {
    __widgetOf(this, pcf.NotesLV, SECTION_WIDGET_CLASS).setVariables(false, {$NoteList})
  }
  
  function refreshVariables ($NoteList :  gw.api.database.IQueryBeanResult<Note>) : void {
    __widgetOf(this, pcf.NotesLV, SECTION_WIDGET_CLASS).setVariables(true, {$NoteList})
  }
  
  
}