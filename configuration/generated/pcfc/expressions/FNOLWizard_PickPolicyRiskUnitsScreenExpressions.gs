package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_PickPolicyRiskUnitsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_PickPolicyRiskUnitsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_PickPolicyRiskUnitsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_PickPolicyRiskUnitsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=EditSelectionsVehicle) at FNOLWizard_PickPolicyRiskUnitsScreen.pcf: line 30, column 111
    function action_2 () : void {
      RiskUnitsEditable = true
    }
    
    // 'action' attribute on ToolbarButton (id=EditSelectionsProperty) at FNOLWizard_PickPolicyRiskUnitsScreen.pcf: line 43, column 112
    function action_7 () : void {
      RiskUnitsEditable = true
    }
    
    // 'available' attribute on ToolbarButton (id=EditSelectionsVehicle) at FNOLWizard_PickPolicyRiskUnitsScreen.pcf: line 30, column 111
    function available_1 () : java.lang.Boolean {
      return !RiskUnitsEditable
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_PickPolicyRiskUnitsScreen.pcf: line 23, column 56
    function def_onEnter_4 (def :  pcf.PolicySummaryVehicleLV) : void {
      def.onEnter( Wizard.PolicySummary, true, RiskUnitsEditable )
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_PickPolicyRiskUnitsScreen.pcf: line 36, column 57
    function def_onEnter_9 (def :  pcf.PolicySummaryPropertyLV) : void {
      def.onEnter( Wizard.PolicySummary, true, RiskUnitsEditable )
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_PickPolicyRiskUnitsScreen.pcf: line 36, column 57
    function def_refreshVariables_10 (def :  pcf.PolicySummaryPropertyLV) : void {
      def.refreshVariables( Wizard.PolicySummary, true, RiskUnitsEditable )
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_PickPolicyRiskUnitsScreen.pcf: line 23, column 56
    function def_refreshVariables_5 (def :  pcf.PolicySummaryVehicleLV) : void {
      def.refreshVariables( Wizard.PolicySummary, true, RiskUnitsEditable )
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_PickPolicyRiskUnitsScreen.pcf: line 16, column 23
    function initialValue_0 () : boolean {
      return Claim.Policy == null or !Wizard.PolicySummary.hasSameRiskUnits( Claim.Policy )
    }
    
    // 'visible' attribute on PanelRef at FNOLWizard_PickPolicyRiskUnitsScreen.pcf: line 23, column 56
    function visible_3 () : java.lang.Boolean {
      return Wizard.PolicySummary.VehiclePolicyType
    }
    
    // 'visible' attribute on PanelRef at FNOLWizard_PickPolicyRiskUnitsScreen.pcf: line 36, column 57
    function visible_8 () : java.lang.Boolean {
      return Wizard.PolicySummary.PropertyPolicyType
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get RiskUnitsEditable () : boolean {
      return getVariableValue("RiskUnitsEditable", 0) as java.lang.Boolean
    }
    
    property set RiskUnitsEditable ($arg :  boolean) {
      setVariableValue("RiskUnitsEditable", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
  }
  
  
}