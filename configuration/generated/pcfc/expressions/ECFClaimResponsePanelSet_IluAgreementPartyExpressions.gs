package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.IluAgreementParty.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFClaimResponsePanelSet_IluAgreementPartyExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.IluAgreementParty.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFClaimResponsePanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluAgreementParty.pcf: line 17, column 64
    function def_onEnter_0 (def :  pcf.MessageBeingRespondedToInputSet) : void {
      def.onEnter(ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluAgreementParty.pcf: line 33, column 58
    function def_onEnter_10 (def :  pcf.QueryReasonsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluAgreementParty.pcf: line 20, column 71
    function def_onEnter_2 (def :  pcf.InsurerTransactionReferenceInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluAgreementParty.pcf: line 23, column 58
    function def_onEnter_4 (def :  pcf.PublicCommentsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluAgreementParty.pcf: line 26, column 59
    function def_onEnter_6 (def :  pcf.PrivateCommentsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluAgreementParty.pcf: line 31, column 61
    function def_onEnter_8 (def :  pcf.ResponseInputSet) : void {
      def.onEnter(claimResponseRq, false)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluAgreementParty.pcf: line 17, column 64
    function def_refreshVariables_1 (def :  pcf.MessageBeingRespondedToInputSet) : void {
      def.refreshVariables(ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluAgreementParty.pcf: line 33, column 58
    function def_refreshVariables_11 (def :  pcf.QueryReasonsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluAgreementParty.pcf: line 20, column 71
    function def_refreshVariables_3 (def :  pcf.InsurerTransactionReferenceInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluAgreementParty.pcf: line 23, column 58
    function def_refreshVariables_5 (def :  pcf.PublicCommentsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluAgreementParty.pcf: line 26, column 59
    function def_refreshVariables_7 (def :  pcf.PrivateCommentsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluAgreementParty.pcf: line 31, column 61
    function def_refreshVariables_9 (def :  pcf.ResponseInputSet) : void {
      def.refreshVariables(claimResponseRq, false)
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