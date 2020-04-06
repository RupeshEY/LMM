package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/ecf/ClaimDataSuspenseQueueLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimDataSuspenseQueueLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimDataMessages :  entity.ECFMessageClaimData_Ext[]) : void {
    __widgetOf(this, pcf.ClaimDataSuspenseQueueLV, SECTION_WIDGET_CLASS).setVariables(false, {$claimDataMessages})
  }
  
  function refreshVariables ($claimDataMessages :  entity.ECFMessageClaimData_Ext[]) : void {
    __widgetOf(this, pcf.ClaimDataSuspenseQueueLV, SECTION_WIDGET_CLASS).setVariables(true, {$claimDataMessages})
  }
  
  
}