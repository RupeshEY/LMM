package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/ClaimDocumentSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimDocumentSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DocumentSearchCriteria :  DocumentSearchCriteria) : void {
    __widgetOf(this, pcf.ClaimDocumentSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$DocumentSearchCriteria})
  }
  
  function refreshVariables ($DocumentSearchCriteria :  DocumentSearchCriteria) : void {
    __widgetOf(this, pcf.ClaimDocumentSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$DocumentSearchCriteria})
  }
  
  
}