package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsBulkClaimPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageDetailsBulkClaimPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimDataMsg :  ECFMessageClaimData_Ext) : void {
    __widgetOf(this, pcf.ECFMessageDetailsBulkClaimPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$claimDataMsg})
  }
  
  function refreshVariables ($claimDataMsg :  ECFMessageClaimData_Ext) : void {
    __widgetOf(this, pcf.ECFMessageDetailsBulkClaimPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$claimDataMsg})
  }
  
  
}