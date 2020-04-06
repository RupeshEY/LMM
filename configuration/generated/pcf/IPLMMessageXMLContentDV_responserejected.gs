package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/IPLMMessageXMLContentDV.responserejected.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class IPLMMessageXMLContentDV_responserejected extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($message :  LMMessage_Ext) : void {
    __widgetOf(this, pcf.IPLMMessageXMLContentDV_responserejected, SECTION_WIDGET_CLASS).setVariables(false, {$message})
  }
  
  function refreshVariables ($message :  LMMessage_Ext) : void {
    __widgetOf(this, pcf.IPLMMessageXMLContentDV_responserejected, SECTION_WIDGET_CLASS).setVariables(true, {$message})
  }
  
  
}