package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/MessageBeingRespondedToInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MessageBeingRespondedToInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/MessageBeingRespondedToInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageBeingRespondedToInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=claimNotifyUUID) at MessageBeingRespondedToInputSet.pcf: line 17, column 31
    function valueRoot_2 () : java.lang.Object {
      return claimData
    }
    
    // 'value' attribute on TextInput (id=claimNotifyUUID) at MessageBeingRespondedToInputSet.pcf: line 17, column 31
    function value_0 () : java.lang.String {
      return claimData.UUID
    }
    
    // 'value' attribute on TextInput (id=claimDataTime) at MessageBeingRespondedToInputSet.pcf: line 23, column 35
    function value_3 () : java.util.Date {
      return claimData.OriginTimeStamp
    }
    
    // 'value' attribute on TextInput (id=claimDataTR) at MessageBeingRespondedToInputSet.pcf: line 28, column 29
    function value_6 () : java.lang.String {
      return claimData.TR
    }
    
    // 'value' attribute on TextInput (id=claimDataSequenceNo) at MessageBeingRespondedToInputSet.pcf: line 33, column 46
    function value_9 () : java.lang.String {
      return claimData.TransactionSequence
    }
    
    property get claimData () : ECFMessageClaimData_Ext {
      return getRequireValue("claimData", 0) as ECFMessageClaimData_Ext
    }
    
    property set claimData ($arg :  ECFMessageClaimData_Ext) {
      setRequireValue("claimData", 0, $arg)
    }
    
    
  }
  
  
}