package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/WideNotesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WideNotesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($notes :  Note[], $relatedToVisible :  boolean) : void {
    __widgetOf(this, pcf.WideNotesLV, SECTION_WIDGET_CLASS).setVariables(false, {$notes, $relatedToVisible})
  }
  
  function refreshVariables ($notes :  Note[], $relatedToVisible :  boolean) : void {
    __widgetOf(this, pcf.WideNotesLV, SECTION_WIDGET_CLASS).setVariables(true, {$notes, $relatedToVisible})
  }
  
  
}