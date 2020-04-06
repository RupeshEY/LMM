package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/document/DocumentCreationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentCreationInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($documentApplicationContext :  gw.document.DocumentApplicationContext, $documentCreationInfo :  gw.document.DocumentCreationInfo, $CreateStepLabel :  String) : void {
    __widgetOf(this, pcf.DocumentCreationInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$documentApplicationContext, $documentCreationInfo, $CreateStepLabel})
  }
  
  function refreshVariables ($documentApplicationContext :  gw.document.DocumentApplicationContext, $documentCreationInfo :  gw.document.DocumentCreationInfo, $CreateStepLabel :  String) : void {
    __widgetOf(this, pcf.DocumentCreationInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$documentApplicationContext, $documentCreationInfo, $CreateStepLabel})
  }
  
  
}