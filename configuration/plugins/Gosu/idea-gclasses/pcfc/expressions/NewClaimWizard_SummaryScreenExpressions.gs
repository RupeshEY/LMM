package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_SummaryScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_SummaryScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_SummaryScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_SummaryScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_SummaryScreen.pcf: line 17, column 36
    function def_onEnter_0 (def :  pcf.ClaimSummaryDV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_SummaryScreen.pcf: line 21, column 76
    function def_onEnter_2 (def :  pcf.NewClaimSummaryExposuresLV) : void {
      def.onEnter(Claim, Wizard, Claim.Exposures)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_SummaryScreen.pcf: line 32, column 80
    function def_onEnter_4 (def :  pcf.NewClaimSummaryPeopleInvolvedLV) : void {
      def.onEnter(Claim, Wizard, Claim.Contacts)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_SummaryScreen.pcf: line 41, column 46
    function def_onEnter_6 (def :  pcf.NotesLV) : void {
      def.onEnter(Claim.ViewableNotes)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_SummaryScreen.pcf: line 17, column 36
    function def_refreshVariables_1 (def :  pcf.ClaimSummaryDV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_SummaryScreen.pcf: line 21, column 76
    function def_refreshVariables_3 (def :  pcf.NewClaimSummaryExposuresLV) : void {
      def.refreshVariables(Claim, Wizard, Claim.Exposures)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_SummaryScreen.pcf: line 32, column 80
    function def_refreshVariables_5 (def :  pcf.NewClaimSummaryPeopleInvolvedLV) : void {
      def.refreshVariables(Claim, Wizard, Claim.Contacts)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_SummaryScreen.pcf: line 41, column 46
    function def_refreshVariables_7 (def :  pcf.NotesLV) : void {
      def.refreshVariables(Claim.ViewableNotes)
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