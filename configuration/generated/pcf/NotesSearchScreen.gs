package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/NotesSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NotesSearchScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Activity :  Activity) : void {
    __widgetOf(this, pcf.NotesSearchScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Activity})
  }
  
  function refreshVariables ($Claim :  Claim, $Activity :  Activity) : void {
    __widgetOf(this, pcf.NotesSearchScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Activity})
  }
  
  
}