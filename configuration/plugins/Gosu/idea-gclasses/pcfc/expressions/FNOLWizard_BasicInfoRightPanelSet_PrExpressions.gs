package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_BasicInfoRightPanelSet_PrExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_BasicInfoRightPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef (id=PolicyPanelSet) at FNOLWizard_BasicInfoRightPanelSet.Pr.pcf: line 17, column 39
    function def_onEnter_0 (def :  pcf.FNOLWizard_BasicInfoPolicyPanelSet_Homeowners) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'def' attribute on PanelRef (id=PolicyPanelSet) at FNOLWizard_BasicInfoRightPanelSet.Pr.pcf: line 17, column 39
    function def_refreshVariables_1 (def :  pcf.FNOLWizard_BasicInfoPolicyPanelSet_Homeowners) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'mode' attribute on PanelRef (id=PolicyPanelSet) at FNOLWizard_BasicInfoRightPanelSet.Pr.pcf: line 17, column 39
    function mode_2 () : java.lang.Object {
      return claim.Policy.PolicyType
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("wizard", 0, $arg)
    }
    
    
  }
  
  
}