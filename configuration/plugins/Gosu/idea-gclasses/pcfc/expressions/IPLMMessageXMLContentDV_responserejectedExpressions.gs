package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/IPLMMessageXMLContentDV.responserejected.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IPLMMessageXMLContentDV_responserejectedExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/IPLMMessageXMLContentDV.responserejected.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IPLMMessageXMLContentDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at IPLMMessageXMLContentDV.responserejected.pcf: line 14, column 45
    function initialValue_0 () : ECFMessageClaimResponseRq_Ext {
      return message as ECFMessageClaimResponseRq_Ext
    }
    
    // 'initialValue' attribute on Variable at IPLMMessageXMLContentDV.responserejected.pcf: line 18, column 24
    function initialValue_1 () : Activity {
      return claimResponseRq?.Activities?.where(\act -> act.ECFApproval and act.Rejected).orderBy(\act -> act.CloseDate).last()
    }
    
    // 'value' attribute on TextAreaInput (id=XMLContent) at IPLMMessageXMLContentDV.responserejected.pcf: line 26, column 132
    function value_2 () : java.lang.String {
      return DisplayKey.get("Accelerator.IPLM.Admin.MessageLog.XmlContent.Rejected", lastRejectedActivity.CloseUser)
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getVariableValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setVariableValue("claimResponseRq", 0, $arg)
    }
    
    property get lastRejectedActivity () : Activity {
      return getVariableValue("lastRejectedActivity", 0) as Activity
    }
    
    property set lastRejectedActivity ($arg :  Activity) {
      setVariableValue("lastRejectedActivity", 0, $arg)
    }
    
    property get message () : LMMessage_Ext {
      return getRequireValue("message", 0) as LMMessage_Ext
    }
    
    property set message ($arg :  LMMessage_Ext) {
      setRequireValue("message", 0, $arg)
    }
    
    
  }
  
  
}