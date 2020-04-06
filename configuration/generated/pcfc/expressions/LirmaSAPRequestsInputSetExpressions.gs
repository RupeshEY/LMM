package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LirmaSAPRequestsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LirmaSAPRequestsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LirmaSAPRequestsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LirmaSAPRequestsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=claimReference2) at LirmaSAPRequestsInputSet.pcf: line 32, column 59
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.InsurerOrReinsurerClaimRef2 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=requestToBroker) at LirmaSAPRequestsInputSet.pcf: line 43, column 48
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.RequestToBroker1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=requestToBroker2) at LirmaSAPRequestsInputSet.pcf: line 51, column 48
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.RequestToBroker2 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=privateFootnote) at LirmaSAPRequestsInputSet.pcf: line 59, column 47
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.PrivateFootnote = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=claimReference1) at LirmaSAPRequestsInputSet.pcf: line 22, column 59
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.InsurerOrReinsurerClaimRef1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'inputConversion' attribute on TextInput (id=claimReference1) at LirmaSAPRequestsInputSet.pcf: line 22, column 59
    function inputConversion_1 (VALUE :  java.lang.String) : java.lang.Object {
      return VALUE == ecfClaimData.InsurerOrReinsurerClaimRef1 ? null : VALUE
    }
    
    // 'inputConversion' attribute on TextInput (id=claimReference2) at LirmaSAPRequestsInputSet.pcf: line 32, column 59
    function inputConversion_7 (VALUE :  java.lang.String) : java.lang.Object {
      return VALUE == ecfClaimData.InsurerOrReinsurerClaimRef2 ? null : VALUE
    }
    
    // 'outputConversion' attribute on TextInput (id=claimReference1) at LirmaSAPRequestsInputSet.pcf: line 22, column 59
    function outputConversion_2 (VALUE :  java.lang.String) : java.lang.String {
      return VALUE == null ? ecfClaimData.InsurerOrReinsurerClaimRef1 : VALUE
    }
    
    // 'outputConversion' attribute on TextInput (id=claimReference2) at LirmaSAPRequestsInputSet.pcf: line 32, column 59
    function outputConversion_8 (VALUE :  java.lang.String) : java.lang.String {
      return VALUE == null ? ecfClaimData.InsurerOrReinsurerClaimRef2 : VALUE
    }
    
    // 'required' attribute on TextInput (id=requestToBroker) at LirmaSAPRequestsInputSet.pcf: line 43, column 48
    function required_13 () : java.lang.Boolean {
      return claimResponseRq.RequestToBrokerMandatory
    }
    
    // 'value' attribute on TextInput (id=claimReference1) at LirmaSAPRequestsInputSet.pcf: line 22, column 59
    function valueRoot_5 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on TextInput (id=claimReference1) at LirmaSAPRequestsInputSet.pcf: line 22, column 59
    function value_0 () : java.lang.String {
      return claimResponseRq.InsurerOrReinsurerClaimRef1
    }
    
    // 'value' attribute on TextInput (id=requestToBroker) at LirmaSAPRequestsInputSet.pcf: line 43, column 48
    function value_12 () : java.lang.String {
      return claimResponseRq.RequestToBroker1
    }
    
    // 'value' attribute on TextInput (id=requestToBroker2) at LirmaSAPRequestsInputSet.pcf: line 51, column 48
    function value_17 () : java.lang.String {
      return claimResponseRq.RequestToBroker2
    }
    
    // 'value' attribute on TextInput (id=privateFootnote) at LirmaSAPRequestsInputSet.pcf: line 59, column 47
    function value_22 () : java.lang.String {
      return claimResponseRq.PrivateFootnote
    }
    
    // 'value' attribute on TextInput (id=claimReference2) at LirmaSAPRequestsInputSet.pcf: line 32, column 59
    function value_6 () : java.lang.String {
      return claimResponseRq.InsurerOrReinsurerClaimRef2
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getRequireValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setRequireValue("claimResponseRq", 0, $arg)
    }
    
    property get ecfClaimData () : ECFMessageClaimData_Ext {
      return getRequireValue("ecfClaimData", 0) as ECFMessageClaimData_Ext
    }
    
    property set ecfClaimData ($arg :  ECFMessageClaimData_Ext) {
      setRequireValue("ecfClaimData", 0, $arg)
    }
    
    
  }
  
  
}