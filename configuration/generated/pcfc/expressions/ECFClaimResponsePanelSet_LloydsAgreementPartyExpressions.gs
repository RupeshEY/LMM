package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.LloydsAgreementParty.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFClaimResponsePanelSet_LloydsAgreementPartyExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.LloydsAgreementParty.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFClaimResponsePanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 17, column 64
    function def_onEnter_0 (def :  pcf.MessageBeingRespondedToInputSet) : void {
      def.onEnter(ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 20, column 71
    function def_onEnter_2 (def :  pcf.InsurerTransactionReferenceInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 50, column 59
    function def_onEnter_22 (def :  pcf.ResponseInputSet) : void {
      def.onEnter(claimResponseRq, false)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 52, column 56
    function def_onEnter_24 (def :  pcf.QueryReasonsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 22, column 74
    function def_onEnter_4 (def :  pcf.CatastropheCodesInputSet) : void {
      def.onEnter(ecfClaimData, claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 25, column 58
    function def_onEnter_6 (def :  pcf.PublicCommentsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 28, column 59
    function def_onEnter_8 (def :  pcf.PrivateCommentsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 17, column 64
    function def_refreshVariables_1 (def :  pcf.MessageBeingRespondedToInputSet) : void {
      def.refreshVariables(ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 50, column 59
    function def_refreshVariables_23 (def :  pcf.ResponseInputSet) : void {
      def.refreshVariables(claimResponseRq, false)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 52, column 56
    function def_refreshVariables_25 (def :  pcf.QueryReasonsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 20, column 71
    function def_refreshVariables_3 (def :  pcf.InsurerTransactionReferenceInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 22, column 74
    function def_refreshVariables_5 (def :  pcf.CatastropheCodesInputSet) : void {
      def.refreshVariables(ecfClaimData, claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 25, column 58
    function def_refreshVariables_7 (def :  pcf.PublicCommentsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 28, column 59
    function def_refreshVariables_9 (def :  pcf.PrivateCommentsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'value' attribute on TextInput (id=claimReference1) at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 39, column 64
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.InsurerOrReinsurerClaimRef1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=claimReference2) at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 48, column 64
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.InsurerOrReinsurerClaimRef2 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'inputConversion' attribute on TextInput (id=claimReference1) at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 39, column 64
    function inputConversion_11 (VALUE :  java.lang.String) : java.lang.Object {
      return VALUE == ecfClaimData.InsurerOrReinsurerClaimRef1 ? null : VALUE
    }
    
    // 'inputConversion' attribute on TextInput (id=claimReference2) at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 48, column 64
    function inputConversion_17 (VALUE :  java.lang.String) : java.lang.Object {
      return VALUE == ecfClaimData.InsurerOrReinsurerClaimRef1? null : VALUE 
    }
    
    // 'outputConversion' attribute on TextInput (id=claimReference1) at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 39, column 64
    function outputConversion_12 (VALUE :  java.lang.String) : java.lang.String {
      return VALUE == null ? ecfClaimData.InsurerOrReinsurerClaimRef1 : VALUE
    }
    
    // 'outputConversion' attribute on TextInput (id=claimReference2) at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 48, column 64
    function outputConversion_18 (VALUE :  java.lang.String) : java.lang.String {
      return VALUE == null ? ecfClaimData.InsurerOrReinsurerClaimRef2 : VALUE
    }
    
    // 'value' attribute on TextInput (id=claimReference1) at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 39, column 64
    function valueRoot_15 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on TextInput (id=claimReference1) at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 39, column 64
    function value_10 () : java.lang.String {
      return claimResponseRq.InsurerOrReinsurerClaimRef1
    }
    
    // 'value' attribute on TextInput (id=claimReference2) at ECFClaimResponsePanelSet.LloydsAgreementParty.pcf: line 48, column 64
    function value_16 () : java.lang.String {
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