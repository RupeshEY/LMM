package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/IPLMMessageXMLContentDV.responsesuperseded.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class IPLMMessageXMLContentDV_responsesuperseded extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($message :  LMMessage_Ext) : void {
    __widgetOf(this, pcf.IPLMMessageXMLContentDV_responsesuperseded, SECTION_WIDGET_CLASS).setVariables(false, {$message})
  }
  
  function refreshVariables ($message :  LMMessage_Ext) : void {
    __widgetOf(this, pcf.IPLMMessageXMLContentDV_responsesuperseded, SECTION_WIDGET_CLASS).setVariables(true, {$message})
  }
  
  
}