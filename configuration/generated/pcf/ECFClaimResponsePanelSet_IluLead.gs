package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.IluLead.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFClaimResponsePanelSet_IluLead extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ecfClaimData :  ECFMessageClaimData_Ext, $claimResponseRq :  ECFMessageClaimResponseRq_Ext) : void {
    __widgetOf(this, pcf.ECFClaimResponsePanelSet_IluLead, SECTION_WIDGET_CLASS).setVariables(false, {$ecfClaimData, $claimResponseRq})
  }
  
  function refreshVariables ($ecfClaimData :  ECFMessageClaimData_Ext, $claimResponseRq :  ECFMessageClaimResponseRq_Ext) : void {
    __widgetOf(this, pcf.ECFClaimResponsePanelSet_IluLead, SECTION_WIDGET_CLASS).setVariables(true, {$ecfClaimData, $claimResponseRq})
  }
  
  
}