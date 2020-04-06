package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/InsurerTransactionReferenceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class InsurerTransactionReferenceInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimResponseRq :  ECFMessageClaimResponseRq_Ext) : void {
    __widgetOf(this, pcf.InsurerTransactionReferenceInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$claimResponseRq})
  }
  
  function refreshVariables ($claimResponseRq :  ECFMessageClaimResponseRq_Ext) : void {
    __widgetOf(this, pcf.InsurerTransactionReferenceInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$claimResponseRq})
  }
  
  
}