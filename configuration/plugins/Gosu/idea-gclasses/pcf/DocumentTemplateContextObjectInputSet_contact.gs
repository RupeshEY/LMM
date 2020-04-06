package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newdocument/DocumentTemplateContextObjectInputSet.contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentTemplateContextObjectInputSet_contact extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($documentApplicationContext :  gw.document.DocumentApplicationContext, $documentCreationInfo :  gw.document.DocumentCreationInfo, $dynamicWidgetInfo :  gw.document.DocumentCreationInfo.DynamicWidgetInfo) : void {
    __widgetOf(this, pcf.DocumentTemplateContextObjectInputSet_contact, SECTION_WIDGET_CLASS).setVariables(false, {$documentApplicationContext, $documentCreationInfo, $dynamicWidgetInfo})
  }
  
  function refreshVariables ($documentApplicationContext :  gw.document.DocumentApplicationContext, $documentCreationInfo :  gw.document.DocumentCreationInfo, $dynamicWidgetInfo :  gw.document.DocumentCreationInfo.DynamicWidgetInfo) : void {
    __widgetOf(this, pcf.DocumentTemplateContextObjectInputSet_contact, SECTION_WIDGET_CLASS).setVariables(true, {$documentApplicationContext, $documentCreationInfo, $dynamicWidgetInfo})
  }
  
  
}