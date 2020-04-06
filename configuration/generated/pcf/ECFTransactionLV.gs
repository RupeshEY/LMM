package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ECFTransactionLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFTransactionLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ECFClaimResponse :  ECFMessageClaimResponseRq_Ext) : void {
    __widgetOf(this, pcf.ECFTransactionLV, SECTION_WIDGET_CLASS).setVariables(false, {$ECFClaimResponse})
  }
  
  function refreshVariables ($ECFClaimResponse :  ECFMessageClaimResponseRq_Ext) : void {
    __widgetOf(this, pcf.ECFTransactionLV, SECTION_WIDGET_CLASS).setVariables(true, {$ECFClaimResponse})
  }
  
  
}