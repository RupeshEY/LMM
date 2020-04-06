package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimDocumentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DocumentList :  Document[], $Claim :  Claim, $documentsActionsHelper :  gw.document.DocumentsActionsUIHelper) : void {
    __widgetOf(this, pcf.NewClaimDocumentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$DocumentList, $Claim, $documentsActionsHelper})
  }
  
  function refreshVariables ($DocumentList :  Document[], $Claim :  Claim, $documentsActionsHelper :  gw.document.DocumentsActionsUIHelper) : void {
    __widgetOf(this, pcf.NewClaimDocumentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$DocumentList, $Claim, $documentsActionsHelper})
  }
  
  
}