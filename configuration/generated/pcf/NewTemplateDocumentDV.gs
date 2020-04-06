package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newdocument/NewTemplateDocumentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewTemplateDocumentDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($documentCCContext :  gw.document.DocumentCCContext, $documentCreationInfo :  gw.document.DocumentCreationInfo, $document :  Document, $claim :  Claim, $activity :  Activity) : void {
    __widgetOf(this, pcf.NewTemplateDocumentDV, SECTION_WIDGET_CLASS).setVariables(false, {$documentCCContext, $documentCreationInfo, $document, $claim, $activity})
  }
  
  function refreshVariables ($documentCCContext :  gw.document.DocumentCCContext, $documentCreationInfo :  gw.document.DocumentCreationInfo, $document :  Document, $claim :  Claim, $activity :  Activity) : void {
    __widgetOf(this, pcf.NewTemplateDocumentDV, SECTION_WIDGET_CLASS).setVariables(true, {$documentCCContext, $documentCreationInfo, $document, $claim, $activity})
  }
  
  
}