package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/lm/LMSuspenseQueueLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LMSuspenseQueueLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($messages :  entity.LMMessageLloydsSCM_Ext[]) : void {
    __widgetOf(this, pcf.LMSuspenseQueueLV, SECTION_WIDGET_CLASS).setVariables(false, {$messages})
  }
  
  function refreshVariables ($messages :  entity.LMMessageLloydsSCM_Ext[]) : void {
    __widgetOf(this, pcf.LMSuspenseQueueLV, SECTION_WIDGET_CLASS).setVariables(true, {$messages})
  }
  
  
}