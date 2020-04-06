package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageDetailsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageDetailsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claimDataMsg :  ECFMessageClaimData_Ext) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 21, column 67
    function def_onEnter_0 (def :  pcf.ECFMessageDetailsSummaryPanelSet) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 52, column 58
    function def_onEnter_11 (def :  pcf.IPLMMessageXMLContentDV_default) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 52, column 58
    function def_onEnter_13 (def :  pcf.IPLMMessageXMLContentDV_financialauthorisation) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 52, column 58
    function def_onEnter_15 (def :  pcf.IPLMMessageXMLContentDV_responserejected) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 52, column 58
    function def_onEnter_17 (def :  pcf.IPLMMessageXMLContentDV_responsesuperseded) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 27, column 66
    function def_onEnter_2 (def :  pcf.ECFMessageDetailsPolicyPanelSet) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 33, column 70
    function def_onEnter_4 (def :  pcf.ECFMessageDetailsFinancialsPanelSet) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 40, column 69
    function def_onEnter_6 (def :  pcf.ECFMessageDetailsBulkClaimPanelSet) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 46, column 61
    function def_onEnter_9 (def :  pcf.ECFMessageDetailsCommentDV) : void {
      def.onEnter(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 21, column 67
    function def_refreshVariables_1 (def :  pcf.ECFMessageDetailsSummaryPanelSet) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 46, column 61
    function def_refreshVariables_10 (def :  pcf.ECFMessageDetailsCommentDV) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 52, column 58
    function def_refreshVariables_12 (def :  pcf.IPLMMessageXMLContentDV_default) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 52, column 58
    function def_refreshVariables_14 (def :  pcf.IPLMMessageXMLContentDV_financialauthorisation) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 52, column 58
    function def_refreshVariables_16 (def :  pcf.IPLMMessageXMLContentDV_responserejected) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 52, column 58
    function def_refreshVariables_18 (def :  pcf.IPLMMessageXMLContentDV_responsesuperseded) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 27, column 66
    function def_refreshVariables_3 (def :  pcf.ECFMessageDetailsPolicyPanelSet) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 33, column 70
    function def_refreshVariables_5 (def :  pcf.ECFMessageDetailsFinancialsPanelSet) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPopup.pcf: line 40, column 69
    function def_refreshVariables_7 (def :  pcf.ECFMessageDetailsBulkClaimPanelSet) : void {
      def.refreshVariables(claimDataMsg)
    }
    
    // 'visible' attribute on Card (id=BulkClaims) at ECFMessageDetailsPopup.pcf: line 38, column 62
    function visible_8 () : java.lang.Boolean {
      return claimDataMsg.BulkClaimNoOfItems > 0bd
    }
    
    override property get CurrentLocation () : pcf.ECFMessageDetailsPopup {
      return super.CurrentLocation as pcf.ECFMessageDetailsPopup
    }
    
    property get claimDataMsg () : ECFMessageClaimData_Ext {
      return getVariableValue("claimDataMsg", 0) as ECFMessageClaimData_Ext
    }
    
    property set claimDataMsg ($arg :  ECFMessageClaimData_Ext) {
      setVariableValue("claimDataMsg", 0, $arg)
    }
    
    
  }
  
  
}