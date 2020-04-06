package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_QuickClaimScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_QuickClaimScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_QuickClaimScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_QuickClaimScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton) at NewClaimWizard_QuickClaimScreen.pcf: line 20, column 23
    function action_0 () : void {
      Wizard.returnToFullWizard(ReturnStep, HighWaterStep)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_QuickClaimScreen.pcf: line 24, column 38
    function def_onEnter_1 (def :  pcf.QuickClaimDV_GL) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_QuickClaimScreen.pcf: line 24, column 38
    function def_onEnter_3 (def :  pcf.QuickClaimDV_QuickClaimAuto) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_QuickClaimScreen.pcf: line 24, column 38
    function def_onEnter_5 (def :  pcf.QuickClaimDV_QuickClaimProperty) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_QuickClaimScreen.pcf: line 24, column 38
    function def_onEnter_7 (def :  pcf.QuickClaimDV_TravelBaggageOnly) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_QuickClaimScreen.pcf: line 24, column 38
    function def_onEnter_9 (def :  pcf.QuickClaimDV_TravelCancelOnly) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_QuickClaimScreen.pcf: line 24, column 38
    function def_refreshVariables_10 (def :  pcf.QuickClaimDV_TravelCancelOnly) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_QuickClaimScreen.pcf: line 24, column 38
    function def_refreshVariables_2 (def :  pcf.QuickClaimDV_GL) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_QuickClaimScreen.pcf: line 24, column 38
    function def_refreshVariables_4 (def :  pcf.QuickClaimDV_QuickClaimAuto) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_QuickClaimScreen.pcf: line 24, column 38
    function def_refreshVariables_6 (def :  pcf.QuickClaimDV_QuickClaimProperty) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_QuickClaimScreen.pcf: line 24, column 38
    function def_refreshVariables_8 (def :  pcf.QuickClaimDV_TravelBaggageOnly) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'mode' attribute on PanelRef at NewClaimWizard_QuickClaimScreen.pcf: line 24, column 38
    function mode_11 () : java.lang.Object {
      return Wizard.QuickClaim.Mode
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
    
    
    property get ReturnStep() : String {
      return usesClassicWizard() ?  "ClassicMainContacts" : "MainContacts"
    }
    
    property get HighWaterStep() : String {
      return usesClassicWizard() ?  "ClassicSummary" : "Summary"
    }
    
    function usesClassicWizard() : boolean {
      switch (Wizard.QuickClaim.Mode) {
      case "QuickClaimProperty":
      case "GL":
        return true
      default:
        return false
      }
    }
        
    
    
  }
  
  
}