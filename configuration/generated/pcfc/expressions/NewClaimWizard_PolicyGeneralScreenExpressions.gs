package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_PolicyGeneralScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_PolicyGeneralScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_PolicyGeneralScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_PolicyGeneralScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=NewClaimWizard_PolicyGeneralScreen_EditExternalFieldsButton) at NewClaimWizard_PolicyGeneralScreen.pcf: line 23, column 106
    function action_1 () : void {
      Wizard.deverifyPolicy()
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyGeneralScreen.pcf: line 30, column 30
    function def_onEnter_10 (def :  pcf.NewClaimPolicyGeneralPanelSet_Trav) : void {
      def.onEnter(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyGeneralScreen.pcf: line 30, column 30
    function def_onEnter_12 (def :  pcf.NewClaimPolicyGeneralPanelSet_Wc) : void {
      def.onEnter(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyGeneralScreen.pcf: line 30, column 30
    function def_onEnter_4 (def :  pcf.NewClaimPolicyGeneralPanelSet_Auto) : void {
      def.onEnter(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyGeneralScreen.pcf: line 30, column 30
    function def_onEnter_6 (def :  pcf.NewClaimPolicyGeneralPanelSet_Gl) : void {
      def.onEnter(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyGeneralScreen.pcf: line 30, column 30
    function def_onEnter_8 (def :  pcf.NewClaimPolicyGeneralPanelSet_Pr) : void {
      def.onEnter(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyGeneralScreen.pcf: line 30, column 30
    function def_refreshVariables_11 (def :  pcf.NewClaimPolicyGeneralPanelSet_Trav) : void {
      def.refreshVariables(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyGeneralScreen.pcf: line 30, column 30
    function def_refreshVariables_13 (def :  pcf.NewClaimPolicyGeneralPanelSet_Wc) : void {
      def.refreshVariables(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyGeneralScreen.pcf: line 30, column 30
    function def_refreshVariables_5 (def :  pcf.NewClaimPolicyGeneralPanelSet_Auto) : void {
      def.refreshVariables(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyGeneralScreen.pcf: line 30, column 30
    function def_refreshVariables_7 (def :  pcf.NewClaimPolicyGeneralPanelSet_Gl) : void {
      def.refreshVariables(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyGeneralScreen.pcf: line 30, column 30
    function def_refreshVariables_9 (def :  pcf.NewClaimPolicyGeneralPanelSet_Pr) : void {
      def.refreshVariables(Claim.Policy)
    }
    
    // 'editable' attribute on PanelRef at NewClaimWizard_PolicyGeneralScreen.pcf: line 30, column 30
    function editable_3 () : java.lang.Boolean {
      return !Claim.Policy.Verified
    }
    
    // 'label' attribute on Verbatim at NewClaimWizard_PolicyGeneralScreen.pcf: line 26, column 236
    function label_2 () : java.lang.String {
      return Claim.Policy.Verified ? DisplayKey.get("JSP.NewClaimPolicyGeneral.ReviewPolicyInformation.Tip")                         : DisplayKey.get("JSP.NewClaimPolicyGeneral.ReviewOrEditPolicyInformation.Tip")
    }
    
    // 'mode' attribute on PanelRef at NewClaimWizard_PolicyGeneralScreen.pcf: line 30, column 30
    function mode_14 () : java.lang.Object {
      return Claim.LossType
    }
    
    // 'visible' attribute on ToolbarButton (id=NewClaimWizard_PolicyGeneralScreen_EditExternalFieldsButton) at NewClaimWizard_PolicyGeneralScreen.pcf: line 23, column 106
    function visible_0 () : java.lang.Boolean {
      return Claim.Policy.Verified and perm.Policy.makeeditable(Claim) and perm.Policy.edit(Claim)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
  }
  
  
}