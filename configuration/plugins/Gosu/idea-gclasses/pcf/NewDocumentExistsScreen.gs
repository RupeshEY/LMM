package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/NewDocumentExistsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewDocumentExistsScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DocumentCreationInfo :  gw.document.DocumentCreationInfo, $Claim :  Claim) : void {
    __widgetOf(this, pcf.NewDocumentExistsScreen, SECTION_WIDGET_CLASS).setVariables(false, {$DocumentCreationInfo, $Claim})
  }
  
  function refreshVariables ($DocumentCreationInfo :  gw.document.DocumentCreationInfo, $Claim :  Claim) : void {
    __widgetOf(this, pcf.NewDocumentExistsScreen, SECTION_WIDGET_CLASS).setVariables(true, {$DocumentCreationInfo, $Claim})
  }
  
  
}