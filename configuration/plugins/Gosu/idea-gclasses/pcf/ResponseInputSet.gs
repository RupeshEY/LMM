package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ResponseInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ResponseInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimResponseRq :  ECFMessageClaimResponseRq_Ext, $enablePostOnChange :  Boolean) : void {
    __widgetOf(this, pcf.ResponseInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$claimResponseRq, $enablePostOnChange})
  }
  
  function refreshVariables ($claimResponseRq :  ECFMessageClaimResponseRq_Ext, $enablePostOnChange :  Boolean) : void {
    __widgetOf(this, pcf.ResponseInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$claimResponseRq, $enablePostOnChange})
  }
  
  
}