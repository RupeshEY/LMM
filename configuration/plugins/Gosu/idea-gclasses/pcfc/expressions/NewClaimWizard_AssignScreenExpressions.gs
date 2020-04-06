package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_AssignScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_AssignScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_AssignScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_AssignScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_AssignScreen.pcf: line 19, column 53
    function def_onEnter_0 (def :  pcf.NewClaimWizard_AssignDV) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_AssignScreen.pcf: line 19, column 53
    function def_refreshVariables_1 (def :  pcf.NewClaimWizard_AssignDV) : void {
      def.refreshVariables(Claim, Wizard)
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