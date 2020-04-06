package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsSummaryMessageDetailsInputSet.ECFMessageClaimNotifyRq_Ext.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageDetailsSummaryMessageDetailsInputSet_ECFMessageClaimNotifyRq_Ext extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimData :  ECFMessageClaimData_Ext) : void {
    __widgetOf(this, pcf.ECFMessageDetailsSummaryMessageDetailsInputSet_ECFMessageClaimNotifyRq_Ext, SECTION_WIDGET_CLASS).setVariables(false, {$claimData})
  }
  
  function refreshVariables ($claimData :  ECFMessageClaimData_Ext) : void {
    __widgetOf(this, pcf.ECFMessageDetailsSummaryMessageDetailsInputSet_ECFMessageClaimNotifyRq_Ext, SECTION_WIDGET_CLASS).setVariables(true, {$claimData})
  }
  
  
}