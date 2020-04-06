package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LirmaSAPRequestsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LirmaSAPRequestsInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimResponseRq :  ECFMessageClaimResponseRq_Ext, $ecfClaimData :  ECFMessageClaimData_Ext) : void {
    __widgetOf(this, pcf.LirmaSAPRequestsInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$claimResponseRq, $ecfClaimData})
  }
  
  function refreshVariables ($claimResponseRq :  ECFMessageClaimResponseRq_Ext, $ecfClaimData :  ECFMessageClaimData_Ext) : void {
    __widgetOf(this, pcf.LirmaSAPRequestsInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$claimResponseRq, $ecfClaimData})
  }
  
  
}