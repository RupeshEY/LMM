package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_LossDetailsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_LossDetailsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_LossDetailsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_LossDetailsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_LossDetailsScreen.pcf: line 18, column 30
    function def_onEnter_0 (def :  pcf.NewClaimLossDetailsDV_Gl) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_LossDetailsScreen.pcf: line 18, column 30
    function def_onEnter_2 (def :  pcf.NewClaimLossDetailsDV_Pr) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_LossDetailsScreen.pcf: line 18, column 30
    function def_refreshVariables_1 (def :  pcf.NewClaimLossDetailsDV_Gl) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_LossDetailsScreen.pcf: line 18, column 30
    function def_refreshVariables_3 (def :  pcf.NewClaimLossDetailsDV_Pr) : void {
      def.refreshVariables(Claim)
    }
    
    // 'mode' attribute on PanelRef at NewClaimWizard_LossDetailsScreen.pcf: line 18, column 30
    function mode_4 () : java.lang.Object {
      return Claim.LossType
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