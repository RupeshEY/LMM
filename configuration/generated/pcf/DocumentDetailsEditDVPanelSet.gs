package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/document/DocumentDetailsEditDVPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsEditDVPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($documentDetailsApplicationHelper :  gw.document.DocumentDetailsApplicationHelper, $fromTemplate :  boolean) : void {
    __widgetOf(this, pcf.DocumentDetailsEditDVPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$documentDetailsApplicationHelper, $fromTemplate})
  }
  
  function refreshVariables ($documentDetailsApplicationHelper :  gw.document.DocumentDetailsApplicationHelper, $fromTemplate :  boolean) : void {
    __widgetOf(this, pcf.DocumentDetailsEditDVPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$documentDetailsApplicationHelper, $fromTemplate})
  }
  
  
}