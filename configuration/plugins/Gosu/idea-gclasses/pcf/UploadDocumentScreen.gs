package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/document/UploadDocumentScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UploadDocumentScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DocumentApplicationContext :  gw.document.DocumentApplicationContext) : void {
    __widgetOf(this, pcf.UploadDocumentScreen, SECTION_WIDGET_CLASS).setVariables(false, {$DocumentApplicationContext})
  }
  
  function refreshVariables ($DocumentApplicationContext :  gw.document.DocumentApplicationContext) : void {
    __widgetOf(this, pcf.UploadDocumentScreen, SECTION_WIDGET_CLASS).setVariables(true, {$DocumentApplicationContext})
  }
  
  
}