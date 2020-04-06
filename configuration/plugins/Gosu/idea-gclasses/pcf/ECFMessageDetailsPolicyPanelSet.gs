package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsPolicyPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageDetailsPolicyPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimDataMsg :  ECFMessageClaimData_Ext) : void {
    __widgetOf(this, pcf.ECFMessageDetailsPolicyPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$claimDataMsg})
  }
  
  function refreshVariables ($claimDataMsg :  ECFMessageClaimData_Ext) : void {
    __widgetOf(this, pcf.ECFMessageDetailsPolicyPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$claimDataMsg})
  }
  
  
}