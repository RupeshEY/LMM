package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimtransactions/ECFTransactionDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFTransactionDetailsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimtransactions/ECFTransactionDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFTransactionDetailsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claimDataMsg :  ECFMessageClaimData_Ext) : int {
      return 0
    }
    
    static function __constructorIndex (claimDataMsg :  ECFMessageClaimData_Ext, goToRespondOnEnter :  Boolean) : int {
      return 1
    }
    
    // 'beforeCommit' attribute on Popup (id=ECFTransactionDetailsPopup) at ECFTransactionDetailsPopup.pcf: line 11, column 194
    function beforeCommit_32 (pickedValue :  java.lang.Object) : void {
      claimResponseRq?.sendResponse()
    }
    
    // 'beforeValidate' attribute on Popup (id=ECFTransactionDetailsPopup) at ECFTransactionDetailsPopup.pcf: line 11, column 194
    function beforeValidate_33 (pickedValue :  java.lang.Object) : void {
      claimResponseRq?.processBeforeValidate()
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 68, column 31
    function def_onEnter_12 (def :  pcf.ECFMessageDetailsCommentDV) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_onEnter_15 (def :  pcf.ECFClaimResponsePanelSet_IluAgreementParty) : void {
      def.onEnter(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_onEnter_17 (def :  pcf.ECFClaimResponsePanelSet_IluLead) : void {
      def.onEnter(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_onEnter_19 (def :  pcf.ECFClaimResponsePanelSet_LirmaAgreementParty) : void {
      def.onEnter(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_onEnter_21 (def :  pcf.ECFClaimResponsePanelSet_LirmaLead) : void {
      def.onEnter(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_onEnter_23 (def :  pcf.ECFClaimResponsePanelSet_LloydsAgreementParty) : void {
      def.onEnter(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_onEnter_25 (def :  pcf.ECFClaimResponsePanelSet_LloydsLead) : void {
      def.onEnter(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_onEnter_27 (def :  pcf.ECFClaimResponsePanelSet_default) : void {
      def.onEnter(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 39, column 31
    function def_onEnter_3 (def :  pcf.ECFMessageDetailsSummaryPanelSet) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 46, column 31
    function def_onEnter_5 (def :  pcf.ECFMessageDetailsPolicyPanelSet) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 53, column 31
    function def_onEnter_7 (def :  pcf.ECFMessageDetailsFinancialsPanelSet) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 61, column 31
    function def_onEnter_9 (def :  pcf.ECFMessageDetailsBulkClaimPanelSet) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 61, column 31
    function def_refreshVariables_10 (def :  pcf.ECFMessageDetailsBulkClaimPanelSet) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 68, column 31
    function def_refreshVariables_13 (def :  pcf.ECFMessageDetailsCommentDV) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_refreshVariables_16 (def :  pcf.ECFClaimResponsePanelSet_IluAgreementParty) : void {
      def.refreshVariables(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_refreshVariables_18 (def :  pcf.ECFClaimResponsePanelSet_IluLead) : void {
      def.refreshVariables(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_refreshVariables_20 (def :  pcf.ECFClaimResponsePanelSet_LirmaAgreementParty) : void {
      def.refreshVariables(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_refreshVariables_22 (def :  pcf.ECFClaimResponsePanelSet_LirmaLead) : void {
      def.refreshVariables(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_refreshVariables_24 (def :  pcf.ECFClaimResponsePanelSet_LloydsAgreementParty) : void {
      def.refreshVariables(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_refreshVariables_26 (def :  pcf.ECFClaimResponsePanelSet_LloydsLead) : void {
      def.refreshVariables(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function def_refreshVariables_28 (def :  pcf.ECFClaimResponsePanelSet_default) : void {
      def.refreshVariables(claimDataMsg, claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 39, column 31
    function def_refreshVariables_4 (def :  pcf.ECFMessageDetailsSummaryPanelSet) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 46, column 31
    function def_refreshVariables_6 (def :  pcf.ECFMessageDetailsPolicyPanelSet) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 53, column 31
    function def_refreshVariables_8 (def :  pcf.ECFMessageDetailsFinancialsPanelSet) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'initialValue' attribute on Variable at ECFTransactionDetailsPopup.pcf: line 22, column 45
    function initialValue_0 () : ECFMessageClaimResponseRq_Ext {
      return claimDataMsg.Respondable ? gw.acc.iplm.entitymapper.ecfwb.claimresponse.ClaimResponseRqEntityMapper.createClaimResponseRqEntity(claimDataMsg, CurrentLocation.Bundle) : null
    }
    
    // 'label' attribute on AlertBar (id=ResponseCannotBeSentAlert) at ECFTransactionDetailsPopup.pcf: line 31, column 77
    function label_2 () : java.lang.Object {
      return claimResponseRq.LirmaResponse ? DisplayKey.get("Accelerator.IPLM.Web.ClaimResponse.NoCommentsEditable.LirmaLead"): DisplayKey.get("Accelerator.IPLM.Web.ClaimResponse.NoCommentsEditable")
    }
    
    // 'mode' attribute on PanelRef at ECFTransactionDetailsPopup.pcf: line 78, column 43
    function mode_29 () : java.lang.Object {
      return claimDataMsg.Mode.Code
    }
    
    // 'selectOnEnter' attribute on Card (id=Respond) at ECFTransactionDetailsPopup.pcf: line 74, column 46
    function selectOnEnter_31 () : java.lang.Boolean {
      return goToRespondOnEnter
    }
    
    // 'title' attribute on Popup (id=ECFTransactionDetailsPopup) at ECFTransactionDetailsPopup.pcf: line 11, column 194
    static function title_35 (claimDataMsg :  ECFMessageClaimData_Ext, goToRespondOnEnter :  Boolean) : java.lang.Object {
      return DisplayKey.get("Accelerator.IPLM.Web.ECFTransactionDetailsPopup.Title", claimDataMsg.TR ,claimDataMsg.SyndicateID, claimDataMsg.BureauType.DisplayName, claimDataMsg.Role)
    }
    
    // 'visible' attribute on AlertBar (id=ResponseCannotBeSentAlert) at ECFTransactionDetailsPopup.pcf: line 31, column 77
    function visible_1 () : java.lang.Boolean {
      return claimResponseRq?.commentsLimitReachedByIncomingMessage()
    }
    
    // 'visible' attribute on Card (id=BulkClaims) at ECFTransactionDetailsPopup.pcf: line 58, column 62
    function visible_11 () : java.lang.Boolean {
      return claimDataMsg.BulkClaimNoOfItems > 0bd
    }
    
    // 'updateVisible' attribute on EditButtons at ECFTransactionDetailsPopup.pcf: line 84, column 74
    function visible_14 () : java.lang.Boolean {
      return claimResponseRq.responseSendAvailable()
    }
    
    // 'visible' attribute on Card (id=Respond) at ECFTransactionDetailsPopup.pcf: line 74, column 46
    function visible_30 () : java.lang.Boolean {
      return claimDataMsg.Respondable
    }
    
    override property get CurrentLocation () : pcf.ECFTransactionDetailsPopup {
      return super.CurrentLocation as pcf.ECFTransactionDetailsPopup
    }
    
    property get claimDataMsg () : ECFMessageClaimData_Ext {
      return getVariableValue("claimDataMsg", 0) as ECFMessageClaimData_Ext
    }
    
    property set claimDataMsg ($arg :  ECFMessageClaimData_Ext) {
      setVariableValue("claimDataMsg", 0, $arg)
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getVariableValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setVariableValue("claimResponseRq", 0, $arg)
    }
    
    property get goToRespondOnEnter () : Boolean {
      return getVariableValue("goToRespondOnEnter", 0) as Boolean
    }
    
    property set goToRespondOnEnter ($arg :  Boolean) {
      setVariableValue("goToRespondOnEnter", 0, $arg)
    }
    
    
  }
  
  
}