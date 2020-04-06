package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicySummaryInfoPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicySummaryInfoPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (PolicySummary :  PolicySummary) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=PolicySummaryInfoPopup_CloseButton) at PolicySummaryInfoPopup.pcf: line 26, column 25
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    // 'canVisit' attribute on Popup (id=PolicySummaryInfoPopup) at PolicySummaryInfoPopup.pcf: line 9, column 65
    static function canVisit_19 (PolicySummary :  PolicySummary) : java.lang.Boolean {
      return perm.System.viewpolicy
    }
    
    // 'def' attribute on PanelRef at PolicySummaryInfoPopup.pcf: line 30, column 28
    function def_onEnter_10 (def :  pcf.PolicySummaryGeneralDV_Wc) : void {
      def.onEnter(PolicySummary)
    }
    
    // 'def' attribute on PanelRef (id=PolicySummaryRiskUnitPanel) at PolicySummaryInfoPopup.pcf: line 34, column 55
    function def_onEnter_14 (def :  pcf.PolicySummaryVehicleLV) : void {
      def.onEnter( PolicySummary, false, false )
    }
    
    // 'def' attribute on PanelRef (id=PolicySummaryPropertyPanel) at PolicySummaryInfoPopup.pcf: line 42, column 56
    function def_onEnter_17 (def :  pcf.PolicySummaryPropertyLV) : void {
      def.onEnter( PolicySummary, false, false )
    }
    
    // 'def' attribute on PanelRef at PolicySummaryInfoPopup.pcf: line 30, column 28
    function def_onEnter_2 (def :  pcf.PolicySummaryGeneralDV_Auto) : void {
      def.onEnter(PolicySummary)
    }
    
    // 'def' attribute on PanelRef at PolicySummaryInfoPopup.pcf: line 30, column 28
    function def_onEnter_4 (def :  pcf.PolicySummaryGeneralDV_Gl) : void {
      def.onEnter(PolicySummary)
    }
    
    // 'def' attribute on PanelRef at PolicySummaryInfoPopup.pcf: line 30, column 28
    function def_onEnter_6 (def :  pcf.PolicySummaryGeneralDV_Pr) : void {
      def.onEnter(PolicySummary)
    }
    
    // 'def' attribute on PanelRef at PolicySummaryInfoPopup.pcf: line 30, column 28
    function def_onEnter_8 (def :  pcf.PolicySummaryGeneralDV_Trav) : void {
      def.onEnter(PolicySummary)
    }
    
    // 'def' attribute on PanelRef at PolicySummaryInfoPopup.pcf: line 30, column 28
    function def_refreshVariables_11 (def :  pcf.PolicySummaryGeneralDV_Wc) : void {
      def.refreshVariables(PolicySummary)
    }
    
    // 'def' attribute on PanelRef (id=PolicySummaryRiskUnitPanel) at PolicySummaryInfoPopup.pcf: line 34, column 55
    function def_refreshVariables_15 (def :  pcf.PolicySummaryVehicleLV) : void {
      def.refreshVariables( PolicySummary, false, false )
    }
    
    // 'def' attribute on PanelRef (id=PolicySummaryPropertyPanel) at PolicySummaryInfoPopup.pcf: line 42, column 56
    function def_refreshVariables_18 (def :  pcf.PolicySummaryPropertyLV) : void {
      def.refreshVariables( PolicySummary, false, false )
    }
    
    // 'def' attribute on PanelRef at PolicySummaryInfoPopup.pcf: line 30, column 28
    function def_refreshVariables_3 (def :  pcf.PolicySummaryGeneralDV_Auto) : void {
      def.refreshVariables(PolicySummary)
    }
    
    // 'def' attribute on PanelRef at PolicySummaryInfoPopup.pcf: line 30, column 28
    function def_refreshVariables_5 (def :  pcf.PolicySummaryGeneralDV_Gl) : void {
      def.refreshVariables(PolicySummary)
    }
    
    // 'def' attribute on PanelRef at PolicySummaryInfoPopup.pcf: line 30, column 28
    function def_refreshVariables_7 (def :  pcf.PolicySummaryGeneralDV_Pr) : void {
      def.refreshVariables(PolicySummary)
    }
    
    // 'def' attribute on PanelRef at PolicySummaryInfoPopup.pcf: line 30, column 28
    function def_refreshVariables_9 (def :  pcf.PolicySummaryGeneralDV_Trav) : void {
      def.refreshVariables(PolicySummary)
    }
    
    // 'initialValue' attribute on Variable at PolicySummaryInfoPopup.pcf: line 18, column 24
    function initialValue_0 () : LossType {
      return gw.api.policy.PolicyTypeUtil.getLossTypeForPolicyType(PolicySummary.PolicyType)
    }
    
    // 'mode' attribute on PanelRef at PolicySummaryInfoPopup.pcf: line 30, column 28
    function mode_12 () : java.lang.Object {
      return policyType
    }
    
    // 'visible' attribute on PanelRef (id=PolicySummaryRiskUnitPanel) at PolicySummaryInfoPopup.pcf: line 34, column 55
    function visible_13 () : java.lang.Boolean {
      return PolicySummary.isVehiclePolicyType()
    }
    
    // 'visible' attribute on PanelRef (id=PolicySummaryPropertyPanel) at PolicySummaryInfoPopup.pcf: line 42, column 56
    function visible_16 () : java.lang.Boolean {
      return PolicySummary.isPropertyPolicyType()
    }
    
    override property get CurrentLocation () : pcf.PolicySummaryInfoPopup {
      return super.CurrentLocation as pcf.PolicySummaryInfoPopup
    }
    
    property get PolicySummary () : PolicySummary {
      return getVariableValue("PolicySummary", 0) as PolicySummary
    }
    
    property set PolicySummary ($arg :  PolicySummary) {
      setVariableValue("PolicySummary", 0, $arg)
    }
    
    property get policyType () : LossType {
      return getVariableValue("policyType", 0) as LossType
    }
    
    property set policyType ($arg :  LossType) {
      setVariableValue("policyType", 0, $arg)
    }
    
    
  }
  
  
}