package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsSummaryMessageDetailsInputSet.ECFMessageClaimNotifyRq_Ext.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageDetailsSummaryMessageDetailsInputSet_ECFMessageClaimNotifyRq_ExtExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsSummaryMessageDetailsInputSet.ECFMessageClaimNotifyRq_Ext.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageDetailsSummaryMessageDetailsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ECFMessageDetailsSummaryMessageDetailsInputSet.ECFMessageClaimNotifyRq_Ext.pcf: line 14, column 43
    function initialValue_0 () : ECFMessageClaimNotifyRq_Ext {
      return (claimData as ECFMessageClaimNotifyRq_Ext)
    }
    
    // 'value' attribute on TextInput (id=ResponseCode) at ECFMessageDetailsSummaryMessageDetailsInputSet.ECFMessageClaimNotifyRq_Ext.pcf: line 33, column 70
    function valueRoot_11 () : java.lang.Object {
      return claimNotifyMsg.ResponseCode
    }
    
    // 'value' attribute on TextInput (id=ActionParticipant) at ECFMessageDetailsSummaryMessageDetailsInputSet.ECFMessageClaimNotifyRq_Ext.pcf: line 22, column 49
    function valueRoot_3 () : java.lang.Object {
      return claimNotifyMsg
    }
    
    // 'value' attribute on TextInput (id=ActionParticipantType) at ECFMessageDetailsSummaryMessageDetailsInputSet.ECFMessageClaimNotifyRq_Ext.pcf: line 27, column 65
    function valueRoot_6 () : java.lang.Object {
      return claimNotifyMsg.ActionParticipantType
    }
    
    // 'value' attribute on TextInput (id=ActionParticipant) at ECFMessageDetailsSummaryMessageDetailsInputSet.ECFMessageClaimNotifyRq_Ext.pcf: line 22, column 49
    function value_1 () : java.lang.String {
      return claimNotifyMsg.ActionParticipant
    }
    
    // 'value' attribute on TextInput (id=ActionParticipantType) at ECFMessageDetailsSummaryMessageDetailsInputSet.ECFMessageClaimNotifyRq_Ext.pcf: line 27, column 65
    function value_4 () : java.lang.String {
      return claimNotifyMsg.ActionParticipantType.DisplayName
    }
    
    // 'value' attribute on TextInput (id=ResponseCode) at ECFMessageDetailsSummaryMessageDetailsInputSet.ECFMessageClaimNotifyRq_Ext.pcf: line 33, column 70
    function value_8 () : java.lang.String {
      return claimNotifyMsg.ResponseCode.Code
    }
    
    // 'visible' attribute on TextInput (id=ResponseCode) at ECFMessageDetailsSummaryMessageDetailsInputSet.ECFMessageClaimNotifyRq_Ext.pcf: line 33, column 70
    function visible_7 () : java.lang.Boolean {
      return claimNotifyMsg.ActionCode == ECFActionCode_Ext.TC_R
    }
    
    property get claimData () : ECFMessageClaimData_Ext {
      return getRequireValue("claimData", 0) as ECFMessageClaimData_Ext
    }
    
    property set claimData ($arg :  ECFMessageClaimData_Ext) {
      setRequireValue("claimData", 0, $arg)
    }
    
    property get claimNotifyMsg () : ECFMessageClaimNotifyRq_Ext {
      return getVariableValue("claimNotifyMsg", 0) as ECFMessageClaimNotifyRq_Ext
    }
    
    property set claimNotifyMsg ($arg :  ECFMessageClaimNotifyRq_Ext) {
      setVariableValue("claimNotifyMsg", 0, $arg)
    }
    
    
  }
  
  
}