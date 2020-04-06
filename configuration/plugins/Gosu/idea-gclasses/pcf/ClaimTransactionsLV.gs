package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimtransactions/ClaimTransactionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimTransactionsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ecfMessages :  java.util.List<entity.ECFMessageClaimData_Ext>) : void {
    __widgetOf(this, pcf.ClaimTransactionsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ecfMessages})
  }
  
  function refreshVariables ($ecfMessages :  java.util.List<entity.ECFMessageClaimData_Ext>) : void {
    __widgetOf(this, pcf.ClaimTransactionsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ecfMessages})
  }
  
  
}