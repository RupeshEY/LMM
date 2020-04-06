package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLMenuActionsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLMenuActionsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimMenuActions_NewNote) at FNOLMenuActions.pcf: line 27, column 21
    function action_10 () : void {
      FNOLWizard_NewNoteWorksheet.goInWorkspace(Wizard)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimMenuActions_NewNote) at FNOLMenuActions.pcf: line 27, column 21
    function action_dest_11 () : pcf.api.Destination {
      return pcf.FNOLWizard_NewNoteWorksheet.createDestination(Wizard)
    }
    
    // 'def' attribute on MenuItemSetRef at FNOLMenuActions.pcf: line 21, column 42
    function def_onEnter_0 (def :  pcf.NewClaimNewExposureMenuItemSet_both) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on MenuItemSetRef at FNOLMenuActions.pcf: line 34, column 54
    function def_onEnter_12 (def :  pcf.NewClaimNewDocumentMenuItemSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at FNOLMenuActions.pcf: line 21, column 42
    function def_onEnter_2 (def :  pcf.NewClaimNewExposureMenuItemSet_coverage) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on MenuItemSetRef at FNOLMenuActions.pcf: line 21, column 42
    function def_onEnter_4 (def :  pcf.NewClaimNewExposureMenuItemSet_coveragetype) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on MenuItemSetRef at FNOLMenuActions.pcf: line 21, column 42
    function def_onEnter_6 (def :  pcf.NewClaimNewExposureMenuItemSet_none) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on MenuItemSetRef at FNOLMenuActions.pcf: line 21, column 42
    function def_refreshVariables_1 (def :  pcf.NewClaimNewExposureMenuItemSet_both) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on MenuItemSetRef at FNOLMenuActions.pcf: line 34, column 54
    function def_refreshVariables_13 (def :  pcf.NewClaimNewDocumentMenuItemSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at FNOLMenuActions.pcf: line 21, column 42
    function def_refreshVariables_3 (def :  pcf.NewClaimNewExposureMenuItemSet_coverage) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on MenuItemSetRef at FNOLMenuActions.pcf: line 21, column 42
    function def_refreshVariables_5 (def :  pcf.NewClaimNewExposureMenuItemSet_coveragetype) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on MenuItemSetRef at FNOLMenuActions.pcf: line 21, column 42
    function def_refreshVariables_7 (def :  pcf.NewClaimNewExposureMenuItemSet_none) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'mode' attribute on MenuItemSetRef at FNOLMenuActions.pcf: line 21, column 42
    function mode_8 () : java.lang.Object {
      return getNewExposureMenuMode()
    }
    
    // 'visible' attribute on MenuItem (id=NewClaimMenuActions_NewDocument) at FNOLMenuActions.pcf: line 32, column 72
    function visible_14 () : java.lang.Boolean {
      return perm.Claim.createdocument(Claim) and Wizard.ClaimSaved
    }
    
    // 'visible' attribute on MenuItem (id=NewClaimMenuActions_NewExposure) at FNOLMenuActions.pcf: line 18, column 46
    function visible_9 () : java.lang.Boolean {
      return Wizard.showNewExposureMenu()
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
    
    
          function getNewExposureMenuMode() : String {
            // Return "none" if there's no claim or no loss type yet
            if (Claim == null || Claim.LossType == null || !Claim.isExposureListChangeable()) {
              return "none";
            }
    
            var byCoverageType = gw.api.exposure.NewExposureMenuUtil.showChooseByCoverageTypeMenu(Claim);
            var byCoverage = gw.api.exposure.NewExposureMenuUtil.showChooseByCoverageMenu(Claim);
    
            if (byCoverageType and byCoverage) {
              return "both";
            } else if (byCoverageType) {
              return "coveragetype";
            } else if (byCoverage) {
              return "coverage";
            } else {
              throw new java.lang.IllegalStateException("Claim loss type " + Claim.LossType + " is not configured to show the new exposure menu either by coverage type or by coverage");
            }
          }
        
    
    
  }
  
  
}