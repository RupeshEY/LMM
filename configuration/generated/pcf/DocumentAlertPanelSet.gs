package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/DocumentAlertPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentAlertPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.DocumentAlertPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.DocumentAlertPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}