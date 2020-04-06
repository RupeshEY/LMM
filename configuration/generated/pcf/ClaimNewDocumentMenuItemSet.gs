package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newdocument/ClaimNewDocumentMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewDocumentMenuItemSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimNewDocumentMenuItemSet, SECTION_WIDGET_CLASS).setVariables(false, {$Claim})
  }
  
  function refreshVariables ($Claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimNewDocumentMenuItemSet, SECTION_WIDGET_CLASS).setVariables(true, {$Claim})
  }
  
  
}