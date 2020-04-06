package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsCrossMarketCommentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageDetailsCrossMarketCommentLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($comments :  ECFMessageCrossMarketComment_Ext[]) : void {
    __widgetOf(this, pcf.ECFMessageDetailsCrossMarketCommentLV, SECTION_WIDGET_CLASS).setVariables(false, {$comments})
  }
  
  function refreshVariables ($comments :  ECFMessageCrossMarketComment_Ext[]) : void {
    __widgetOf(this, pcf.ECFMessageDetailsCrossMarketCommentLV, SECTION_WIDGET_CLASS).setVariables(true, {$comments})
  }
  
  
}