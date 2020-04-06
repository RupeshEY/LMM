package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NotesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NotesScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim) : void {
    __widgetOf(this, pcf.FNOLWizard_NotesScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Claim})
  }
  
  function refreshVariables ($Claim :  Claim) : void {
    __widgetOf(this, pcf.FNOLWizard_NotesScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Claim})
  }
  
  
}