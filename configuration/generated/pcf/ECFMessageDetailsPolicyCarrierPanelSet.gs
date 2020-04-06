package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsPolicyCarrierPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageDetailsPolicyCarrierPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($carrier :  ECFMessageClaimDataCarrier_Ext) : void {
    __widgetOf(this, pcf.ECFMessageDetailsPolicyCarrierPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$carrier})
  }
  
  function refreshVariables ($carrier :  ECFMessageClaimDataCarrier_Ext) : void {
    __widgetOf(this, pcf.ECFMessageDetailsPolicyCarrierPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$carrier})
  }
  
  
}