package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagelog/ECFMessageLogLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageLogLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($includeSuspended :  boolean, $messages :  java.util.List<entity.LMMessage_Ext>) : void {
    __widgetOf(this, pcf.ECFMessageLogLV, SECTION_WIDGET_CLASS).setVariables(false, {$includeSuspended, $messages})
  }
  
  function refreshVariables ($includeSuspended :  boolean, $messages :  java.util.List<entity.LMMessage_Ext>) : void {
    __widgetOf(this, pcf.ECFMessageLogLV, SECTION_WIDGET_CLASS).setVariables(true, {$includeSuspended, $messages})
  }
  
  
}