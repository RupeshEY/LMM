package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/document/DocumentCreationToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentCreationToolbarButtonSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($documentApplicationContext :  gw.document.DocumentApplicationContext, $documentCreationInfo :  gw.document.DocumentCreationInfo) : void {
    __widgetOf(this, pcf.DocumentCreationToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(false, {$documentApplicationContext, $documentCreationInfo})
  }
  
  function refreshVariables ($documentApplicationContext :  gw.document.DocumentApplicationContext, $documentCreationInfo :  gw.document.DocumentCreationInfo) : void {
    __widgetOf(this, pcf.DocumentCreationToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(true, {$documentApplicationContext, $documentCreationInfo})
  }
  
  
}