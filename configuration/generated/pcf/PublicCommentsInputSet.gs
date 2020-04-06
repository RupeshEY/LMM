package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/PublicCommentsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PublicCommentsInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimResponseRq :  ECFMessageClaimResponseRq_Ext) : void {
    __widgetOf(this, pcf.PublicCommentsInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$claimResponseRq})
  }
  
  function refreshVariables ($claimResponseRq :  ECFMessageClaimResponseRq_Ext) : void {
    __widgetOf(this, pcf.PublicCommentsInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$claimResponseRq})
  }
  
  
}