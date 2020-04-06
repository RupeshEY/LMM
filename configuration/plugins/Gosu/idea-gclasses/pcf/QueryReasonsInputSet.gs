package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/QueryReasonsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class QueryReasonsInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimResponseRq :  entity.ECFMessageClaimResponseRq_Ext) : void {
    __widgetOf(this, pcf.QueryReasonsInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$claimResponseRq})
  }
  
  function refreshVariables ($claimResponseRq :  entity.ECFMessageClaimResponseRq_Ext) : void {
    __widgetOf(this, pcf.QueryReasonsInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$claimResponseRq})
  }
  
  
}