package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.LirmaAgreementParty.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFClaimResponsePanelSet_LirmaAgreementPartyExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.LirmaAgreementParty.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFClaimResponsePanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaAgreementParty.pcf: line 20, column 68
    function def_onEnter_0 (def :  pcf.MessageBeingRespondedToInputSet) : void {
      def.onEnter(ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaAgreementParty.pcf: line 22, column 75
    function def_onEnter_2 (def :  pcf.InsurerTransactionReferenceInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaAgreementParty.pcf: line 27, column 64
    function def_onEnter_4 (def :  pcf.ResponseInputSet) : void {
      def.onEnter(claimResponseRq, true)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaAgreementParty.pcf: line 40, column 79
    function def_onEnter_6 (def :  pcf.LirmaSAPActionsInputSet) : void {
      def.onEnter(claimResponseRq, ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaAgreementParty.pcf: line 20, column 68
    function def_refreshVariables_1 (def :  pcf.MessageBeingRespondedToInputSet) : void {
      def.refreshVariables(ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaAgreementParty.pcf: line 22, column 75
    function def_refreshVariables_3 (def :  pcf.InsurerTransactionReferenceInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaAgreementParty.pcf: line 27, column 64
    function def_refreshVariables_5 (def :  pcf.ResponseInputSet) : void {
      def.refreshVariables(claimResponseRq, true)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaAgreementParty.pcf: line 40, column 79
    function def_refreshVariables_7 (def :  pcf.LirmaSAPActionsInputSet) : void {
      def.refreshVariables(claimResponseRq, ecfClaimData)
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