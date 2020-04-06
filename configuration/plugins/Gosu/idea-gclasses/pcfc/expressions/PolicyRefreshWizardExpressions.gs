package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.policy.refresh.PolicyRefreshAlgorithm
uses gw.api.policy.refresh.RefreshPolicyFetcher
uses gw.api.policy.refresh.ui.PolicyRefreshWebUI
@javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyRefreshWizardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyRefreshWizardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, policyFetcher :  gw.api.policy.refresh.RefreshPolicyFetcher) : int {
      return 0
    }
    
    // 'afterCancel' attribute on PolicyRefreshWizard (id=PolicyRefreshWizard) at PolicyRefreshWizard.pcf: line 11, column 79
    function afterCancel_12 () : void {
      ClaimPolicyGeneral.go(claim)
    }
    
    // 'afterCancel' attribute on PolicyRefreshWizard (id=PolicyRefreshWizard) at PolicyRefreshWizard.pcf: line 11, column 79
    function afterCancel_dest_13 () : pcf.api.Destination {
      return pcf.ClaimPolicyGeneral.createDestination(claim)
    }
    
    // 'afterFinish' attribute on PolicyRefreshWizard (id=PolicyRefreshWizard) at PolicyRefreshWizard.pcf: line 11, column 79
    function afterFinish_19 () : void {
      ClaimPolicyGeneral.go(claim)
    }
    
    // 'afterFinish' attribute on PolicyRefreshWizard (id=PolicyRefreshWizard) at PolicyRefreshWizard.pcf: line 11, column 79
    function afterFinish_dest_20 () : pcf.api.Destination {
      return pcf.ClaimPolicyGeneral.createDestination(claim)
    }
    
    // 'allowFinish' attribute on WizardStep (id=PolicyDiffStep) at PolicyRefreshWizard.pcf: line 42, column 79
    function allowFinish_9 () : java.lang.Boolean {
      return not wizard.Messages?.containsMessageOfType(ERROR)
    }
    
    // 'infoBar' attribute on PolicyRefreshWizard (id=PolicyRefreshWizard) at PolicyRefreshWizard.pcf: line 11, column 79
    function infoBar_onEnter_14 (def :  pcf.ClaimInfoBar) : void {
      def.onEnter(claim)
    }
    
    // 'infoBar' attribute on PolicyRefreshWizard (id=PolicyRefreshWizard) at PolicyRefreshWizard.pcf: line 11, column 79
    function infoBar_refreshVariables_15 (def :  pcf.ClaimInfoBar) : void {
      def.refreshVariables(claim)
    }
    
    // 'initialValue' attribute on Variable at PolicyRefreshWizard.pcf: line 23, column 60
    function initialValue_0 () : gw.api.policy.refresh.PolicyRefreshAlgorithm {
      return createWizardAlgorithm(claim.Policy, policyFetcher)
    }
    
    // 'onExit' attribute on WizardStep (id=SelectVehiclesStep) at PolicyRefreshWizard.pcf: line 30, column 96
    function onExit_2 () : void {
      onRiskUnitSelectExit()
    }
    
    // 'onExit' attribute on WizardStep (id=SelectPropertiesStep) at PolicyRefreshWizard.pcf: line 37, column 98
    function onExit_6 () : void {
      onRiskUnitSelectExit()
    }
    
    // 'parent' attribute on PolicyRefreshWizard (id=PolicyRefreshWizard) at PolicyRefreshWizard.pcf: line 11, column 79
    static function parent_16 (claim :  Claim, policyFetcher :  gw.api.policy.refresh.RefreshPolicyFetcher) : pcf.api.Destination {
      return pcf.Claim.createDestination(claim)
    }
    
    // 'screen' attribute on WizardStep (id=PolicyDiffStep) at PolicyRefreshWizard.pcf: line 42, column 79
    function screen_onEnter_10 (def :  pcf.PolicyComparisonScreen) : void {
      def.onEnter(wizard, claim)
    }
    
    // 'screen' attribute on WizardStep (id=SelectVehiclesStep) at PolicyRefreshWizard.pcf: line 30, column 96
    function screen_onEnter_3 (def :  pcf.PolicyRefresh_PickVehicleRiskUnitsScreen) : void {
      def.onEnter(wizard, claim, wizard.PolicySummary)
    }
    
    // 'screen' attribute on WizardStep (id=SelectPropertiesStep) at PolicyRefreshWizard.pcf: line 37, column 98
    function screen_onEnter_7 (def :  pcf.PolicyRefresh_PickPropertyRiskUnitsScreen) : void {
      def.onEnter(wizard, claim, wizard.PolicySummary)
    }
    
    // 'screen' attribute on WizardStep (id=PolicyDiffStep) at PolicyRefreshWizard.pcf: line 42, column 79
    function screen_refreshVariables_11 (def :  pcf.PolicyComparisonScreen) : void {
      def.refreshVariables(wizard, claim)
    }
    
    // 'screen' attribute on WizardStep (id=SelectVehiclesStep) at PolicyRefreshWizard.pcf: line 30, column 96
    function screen_refreshVariables_4 (def :  pcf.PolicyRefresh_PickVehicleRiskUnitsScreen) : void {
      def.refreshVariables(wizard, claim, wizard.PolicySummary)
    }
    
    // 'screen' attribute on WizardStep (id=SelectPropertiesStep) at PolicyRefreshWizard.pcf: line 37, column 98
    function screen_refreshVariables_8 (def :  pcf.PolicyRefresh_PickPropertyRiskUnitsScreen) : void {
      def.refreshVariables(wizard, claim, wizard.PolicySummary)
    }
    
    // 'tabBar' attribute on PolicyRefreshWizard (id=PolicyRefreshWizard) at PolicyRefreshWizard.pcf: line 11, column 79
    function tabBar_onEnter_17 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on PolicyRefreshWizard (id=PolicyRefreshWizard) at PolicyRefreshWizard.pcf: line 11, column 79
    function tabBar_refreshVariables_18 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    // 'visible' attribute on WizardStep (id=SelectVehiclesStep) at PolicyRefreshWizard.pcf: line 30, column 96
    function visible_1 () : java.lang.Boolean {
      return wizard.allowRiskUnitSelection() and not wizard.PolicySummary.Vehicles.IsEmpty
    }
    
    // 'visible' attribute on WizardStep (id=SelectPropertiesStep) at PolicyRefreshWizard.pcf: line 37, column 98
    function visible_5 () : java.lang.Boolean {
      return wizard.allowRiskUnitSelection() and not wizard.PolicySummary.Properties.IsEmpty
    }
    
    override property get CurrentLocation () : pcf.PolicyRefreshWizard {
      return super.CurrentLocation as pcf.PolicyRefreshWizard
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get policyFetcher () : gw.api.policy.refresh.RefreshPolicyFetcher {
      return getVariableValue("policyFetcher", 0) as gw.api.policy.refresh.RefreshPolicyFetcher
    }
    
    property set policyFetcher ($arg :  gw.api.policy.refresh.RefreshPolicyFetcher) {
      setVariableValue("policyFetcher", 0, $arg)
    }
    
    property get wizard () : gw.api.policy.refresh.PolicyRefreshAlgorithm {
      return getVariableValue("wizard", 0) as gw.api.policy.refresh.PolicyRefreshAlgorithm
    }
    
    property set wizard ($arg :  gw.api.policy.refresh.PolicyRefreshAlgorithm) {
      setVariableValue("wizard", 0, $arg)
    }
    
    
    function createWizardAlgorithm(policy : Policy, refreshPolicyFetcher : RefreshPolicyFetcher) : PolicyRefreshAlgorithm {
      var result = new PolicyRefreshAlgorithm(policy, refreshPolicyFetcher)
      PolicyRefreshWebUI.setAlgorithm(CurrentLocation, result, {
              "SelectVehiclesStep" ->PICKED_RISK_UNITS,
              "SelectPropertiesStep" ->PICKED_RISK_UNITS,
              "PolicyDiffStep" ->COMPARED
      })
      return result
    }
    
    function onRiskUnitSelectExit() {
      // Validate at least one risk unit has been selected.
      if (wizard.PolicySummary.VehiclePolicyType) {
        validateMinimumRiskUnitsSelected(wizard.PolicySummary.Vehicles)
      } else {
        validateMinimumRiskUnitsSelected(wizard.PolicySummary.Properties)
      }
    }
    
    function validateMinimumRiskUnitsSelected(ru : PolicySummaryRiskUnit[]) {
      foreach(r in ru) {
        if (r.Selected) {
          return
        }
      }
      throw new gw.api.util.DisplayableException(DisplayKey.get("Web.PolicyRefresh.SelectValidation"))
    }
    
    
  }
  
  
}