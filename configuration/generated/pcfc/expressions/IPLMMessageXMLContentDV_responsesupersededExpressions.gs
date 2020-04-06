package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/IPLMMessageXMLContentDV.responsesuperseded.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IPLMMessageXMLContentDV_responsesupersededExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/IPLMMessageXMLContentDV.responsesuperseded.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IPLMMessageXMLContentDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at IPLMMessageXMLContentDV.responsesuperseded.pcf: line 14, column 45
    function initialValue_0 () : ECFMessageClaimResponseRq_Ext {
      return message as ECFMessageClaimResponseRq_Ext
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getVariableValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setVariableValue("claimResponseRq", 0, $arg)
    }
    
    property get message () : LMMessage_Ext {
      return getRequireValue("message", 0) as LMMessage_Ext
    }
    
    property set message ($arg :  LMMessage_Ext) {
      setRequireValue("message", 0, $arg)
    }
    
    
  }
  
  
}