package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefresh_PickVehicleRiskUnitsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyRefresh_PickVehicleRiskUnitsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefresh_PickVehicleRiskUnitsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyRefresh_PickVehicleRiskUnitsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at PolicyRefresh_PickVehicleRiskUnitsScreen.pcf: line 22, column 67
    function def_onEnter_0 (def :  pcf.PolicyRefreshExistingVehicleRULV) : void {
      def.onEnter(claim,policySummary)
    }
    
    // 'def' attribute on PanelRef at PolicyRefresh_PickVehicleRiskUnitsScreen.pcf: line 33, column 23
    function def_onEnter_2 (def :  pcf.PolicySummaryVehicleLV) : void {
      def.onEnter( policySummary, true, true )
    }
    
    // 'def' attribute on PanelRef at PolicyRefresh_PickVehicleRiskUnitsScreen.pcf: line 22, column 67
    function def_refreshVariables_1 (def :  pcf.PolicyRefreshExistingVehicleRULV) : void {
      def.refreshVariables(claim,policySummary)
    }
    
    // 'def' attribute on PanelRef at PolicyRefresh_PickVehicleRiskUnitsScreen.pcf: line 33, column 23
    function def_refreshVariables_3 (def :  pcf.PolicySummaryVehicleLV) : void {
      def.refreshVariables( policySummary, true, true )
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get policySummary () : PolicySummary {
      return getRequireValue("policySummary", 0) as PolicySummary
    }
    
    property set policySummary ($arg :  PolicySummary) {
      setRequireValue("policySummary", 0, $arg)
    }
    
    property get wizard () : gw.api.policy.refresh.PolicyRefreshAlgorithm {
      return getRequireValue("wizard", 0) as gw.api.policy.refresh.PolicyRefreshAlgorithm
    }
    
    property set wizard ($arg :  gw.api.policy.refresh.PolicyRefreshAlgorithm) {
      setRequireValue("wizard", 0, $arg)
    }
    
    
  }
  
  
}