package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_EditNoteScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_EditNoteScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Note :  Note, $ClaimTest :  Claim) : void {
    __widgetOf(this, pcf.FNOLWizard_EditNoteScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Note, $ClaimTest})
  }
  
  function refreshVariables ($Note :  Note, $ClaimTest :  Claim) : void {
    __widgetOf(this, pcf.FNOLWizard_EditNoteScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Note, $ClaimTest})
  }
  
  
}