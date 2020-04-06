package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsCommentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageDetailsCommentLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($comments :  ECFMessageComment_Ext[]) : void {
    __widgetOf(this, pcf.ECFMessageDetailsCommentLV, SECTION_WIDGET_CLASS).setVariables(false, {$comments})
  }
  
  function refreshVariables ($comments :  ECFMessageComment_Ext[]) : void {
    __widgetOf(this, pcf.ECFMessageDetailsCommentLV, SECTION_WIDGET_CLASS).setVariables(true, {$comments})
  }
  
  
}