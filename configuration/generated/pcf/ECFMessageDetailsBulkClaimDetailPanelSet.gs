package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsBulkClaimDetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageDetailsBulkClaimDetailPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($bulkClaim :  ECFMessageBulkClaim_Ext) : void {
    __widgetOf(this, pcf.ECFMessageDetailsBulkClaimDetailPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$bulkClaim})
  }
  
  function refreshVariables ($bulkClaim :  ECFMessageBulkClaim_Ext) : void {
    __widgetOf(this, pcf.ECFMessageDetailsBulkClaimDetailPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$bulkClaim})
  }
  
  
}