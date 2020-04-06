package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/scm/SCMClaimMessagesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SCMClaimMessagesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($messages :  java.util.List<entity.LMMessageLloydsSCM_Ext>) : void {
    __widgetOf(this, pcf.SCMClaimMessagesLV, SECTION_WIDGET_CLASS).setVariables(false, {$messages})
  }
  
  function refreshVariables ($messages :  java.util.List<entity.LMMessageLloydsSCM_Ext>) : void {
    __widgetOf(this, pcf.SCMClaimMessagesLV, SECTION_WIDGET_CLASS).setVariables(true, {$messages})
  }
  
  
}