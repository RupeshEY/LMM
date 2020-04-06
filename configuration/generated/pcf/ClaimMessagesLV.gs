package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/ClaimMessagesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimMessagesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ecfMessages :  java.util.List<entity.ECFMessageClaimData_Ext>, $showActionCode :  Boolean) : void {
    __widgetOf(this, pcf.ClaimMessagesLV, SECTION_WIDGET_CLASS).setVariables(false, {$ecfMessages, $showActionCode})
  }
  
  function refreshVariables ($ecfMessages :  java.util.List<entity.ECFMessageClaimData_Ext>, $showActionCode :  Boolean) : void {
    __widgetOf(this, pcf.ClaimMessagesLV, SECTION_WIDGET_CLASS).setVariables(true, {$ecfMessages, $showActionCode})
  }
  
  
}