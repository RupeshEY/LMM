package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/ECFMessageSuspenseQueueScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageSuspenseQueueScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($wasChildPopupCommitted :  boolean) : void {
    __widgetOf(this, pcf.ECFMessageSuspenseQueueScreen, SECTION_WIDGET_CLASS).setVariables(false, {$wasChildPopupCommitted})
  }
  
  function refreshVariables ($wasChildPopupCommitted :  boolean) : void {
    __widgetOf(this, pcf.ECFMessageSuspenseQueueScreen, SECTION_WIDGET_CLASS).setVariables(true, {$wasChildPopupCommitted})
  }
  
  
}