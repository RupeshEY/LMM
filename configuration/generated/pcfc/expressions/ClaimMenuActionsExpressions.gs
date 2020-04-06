package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/ClaimMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimMenuActionsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/ClaimMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMenuActionsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_Check) at ClaimMenuActions.pcf: line 47, column 60
    function action_14 () : void {
      ManualCreateCheckWizardForward.go(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_RecoverySet) at ClaimMenuActions.pcf: line 55, column 55
    function action_19 () : void {
      NewRecoverySet.go(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_RecoveryReserveSet) at ClaimMenuActions.pcf: line 63, column 62
    function action_24 () : void {
      NewRecoveryReserveSet.go(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_ReserveSet) at ClaimMenuActions.pcf: line 27, column 52
    function action_4 () : void {
      NewReserveSet.go(Claim, null, true)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_CheckSet) at ClaimMenuActions.pcf: line 35, column 52
    function action_9 () : void {
      NormalCreateCheckWizardForward.go(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_CheckSet) at ClaimMenuActions.pcf: line 35, column 52
    function action_dest_10 () : pcf.api.Destination {
      return pcf.NormalCreateCheckWizardForward.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_Check) at ClaimMenuActions.pcf: line 47, column 60
    function action_dest_15 () : pcf.api.Destination {
      return pcf.ManualCreateCheckWizardForward.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_RecoverySet) at ClaimMenuActions.pcf: line 55, column 55
    function action_dest_20 () : pcf.api.Destination {
      return pcf.NewRecoverySet.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_RecoveryReserveSet) at ClaimMenuActions.pcf: line 63, column 62
    function action_dest_25 () : pcf.api.Destination {
      return pcf.NewRecoveryReserveSet.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_ReserveSet) at ClaimMenuActions.pcf: line 27, column 52
    function action_dest_5 () : pcf.api.Destination {
      return pcf.NewReserveSet.createDestination(Claim, null, true)
    }
    
    // 'available' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_Check) at ClaimMenuActions.pcf: line 47, column 60
    function available_12 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isManualCheckAllowed(Claim)
    }
    
    // 'available' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_RecoverySet) at ClaimMenuActions.pcf: line 55, column 55
    function available_17 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isRecoveryAllowed(Claim)
    }
    
    // 'available' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_ReserveSet) at ClaimMenuActions.pcf: line 27, column 52
    function available_2 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isReserveAllowed(Claim)
    }
    
    // 'available' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_RecoveryReserveSet) at ClaimMenuActions.pcf: line 63, column 62
    function available_22 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isRecoveryReserveAllowed(Claim)
    }
    
    // 'available' attribute on MenuItem (id=ClaimMenuActions_NewExposure) at ClaimMenuActions.pcf: line 86, column 46
    function available_43 () : java.lang.Boolean {
      return !Claim.Closed
    }
    
    // 'available' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_CheckSet) at ClaimMenuActions.pcf: line 35, column 52
    function available_7 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isNormalCheckAllowed(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 14, column 46
    function def_onEnter_0 (def :  pcf.ClaimNewOtherMenuItemSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 72, column 51
    function def_onEnter_29 (def :  pcf.ClaimNewDocumentMenuItemSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 79, column 46
    function def_onEnter_32 (def :  pcf.NewActivityMenuItemSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 89, column 42
    function def_onEnter_34 (def :  pcf.NewExposureMenuItemSet_both) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 89, column 42
    function def_onEnter_36 (def :  pcf.NewExposureMenuItemSet_coverage) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 89, column 42
    function def_onEnter_38 (def :  pcf.NewExposureMenuItemSet_coveragetype) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 89, column 42
    function def_onEnter_40 (def :  pcf.NewExposureMenuItemSet_none) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 92, column 42
    function def_onEnter_45 (def :  pcf.ClaimFileMenuItemSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 14, column 46
    function def_refreshVariables_1 (def :  pcf.ClaimNewOtherMenuItemSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 72, column 51
    function def_refreshVariables_30 (def :  pcf.ClaimNewDocumentMenuItemSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 79, column 46
    function def_refreshVariables_33 (def :  pcf.NewActivityMenuItemSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 89, column 42
    function def_refreshVariables_35 (def :  pcf.NewExposureMenuItemSet_both) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 89, column 42
    function def_refreshVariables_37 (def :  pcf.NewExposureMenuItemSet_coverage) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 89, column 42
    function def_refreshVariables_39 (def :  pcf.NewExposureMenuItemSet_coveragetype) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 89, column 42
    function def_refreshVariables_41 (def :  pcf.NewExposureMenuItemSet_none) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 92, column 42
    function def_refreshVariables_46 (def :  pcf.ClaimFileMenuItemSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'mode' attribute on MenuItemSetRef at ClaimMenuActions.pcf: line 89, column 42
    function mode_42 () : java.lang.Object {
      return getNewExposureMenuMode()
    }
    
    // 'tooltip' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_CheckSet) at ClaimMenuActions.pcf: line 35, column 52
    function tooltip_11 () : java.lang.String {
      return gw.api.financials.FinancialsUtil.getNormalCheckTooltip(Claim)
    }
    
    // 'tooltip' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_Check) at ClaimMenuActions.pcf: line 47, column 60
    function tooltip_16 () : java.lang.String {
      return gw.api.financials.FinancialsUtil.getManualCheckTooltip(Claim)
    }
    
    // 'tooltip' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_RecoverySet) at ClaimMenuActions.pcf: line 55, column 55
    function tooltip_21 () : java.lang.String {
      return gw.api.financials.FinancialsUtil.getRecoveryTooltip(Claim)
    }
    
    // 'tooltip' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_RecoveryReserveSet) at ClaimMenuActions.pcf: line 63, column 62
    function tooltip_26 () : java.lang.String {
      return gw.api.financials.FinancialsUtil.getRecoveryReserveTooltip(Claim)
    }
    
    // 'tooltip' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_ReserveSet) at ClaimMenuActions.pcf: line 27, column 52
    function tooltip_6 () : java.lang.String {
      return gw.api.financials.FinancialsUtil.getReserveTooltip(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_Check) at ClaimMenuActions.pcf: line 47, column 60
    function visible_13 () : java.lang.Boolean {
      return perm.Claim.createmanualpayment(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_RecoverySet) at ClaimMenuActions.pcf: line 55, column 55
    function visible_18 () : java.lang.Boolean {
      return perm.Claim.createrecovery(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_RecoveryReserveSet) at ClaimMenuActions.pcf: line 63, column 62
    function visible_23 () : java.lang.Boolean {
      return perm.Claim.createrecoveryreserve(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewOtherTrans) at ClaimMenuActions.pcf: line 39, column 58
    function visible_27 () : java.lang.Boolean {
      return perm.Claim.createanytransaction(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_ReserveSet) at ClaimMenuActions.pcf: line 27, column 52
    function visible_3 () : java.lang.Boolean {
      return perm.Claim.createreserve(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewDocument) at ClaimMenuActions.pcf: line 70, column 50
    function visible_31 () : java.lang.Boolean {
      return perm.Claim.createdocument(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewExposure) at ClaimMenuActions.pcf: line 86, column 46
    function visible_44 () : java.lang.Boolean {
      return Claim.ExposureListChangeable
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewTransaction_CheckSet) at ClaimMenuActions.pcf: line 35, column 52
    function visible_8 () : java.lang.Boolean {
      return perm.Claim.createpayment(Claim)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
    function getNewExposureMenuMode() : String {
            // Return "none" if claim doesn't show new exposure menu at all
            if (!Claim.isExposureListChangeable()) {
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