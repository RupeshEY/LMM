package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/IPLMMessageXMLContentDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IPLMMessageXMLContentDV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/IPLMMessageXMLContentDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IPLMMessageXMLContentDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=XMLContent) at IPLMMessageXMLContentDV.default.pcf: line 18, column 128
    function value_0 () : java.lang.String {
      return message.Content.ContentString?:DisplayKey.get("Accelerator.IPLM.Admin.MessageLog.XmlContent.Empty")
    }
    
    property get message () : LMMessage_Ext {
      return getRequireValue("message", 0) as LMMessage_Ext
    }
    
    property set message ($arg :  LMMessage_Ext) {
      setRequireValue("message", 0, $arg)
    }
    
    
  }
  
  
}