package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/IPLMMessageXMLContentDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class IPLMMessageXMLContentDV_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($message :  LMMessage_Ext) : void {
    __widgetOf(this, pcf.IPLMMessageXMLContentDV_default, SECTION_WIDGET_CLASS).setVariables(false, {$message})
  }
  
  function refreshVariables ($message :  LMMessage_Ext) : void {
    __widgetOf(this, pcf.IPLMMessageXMLContentDV_default, SECTION_WIDGET_CLASS).setVariables(true, {$message})
  }
  
  
}