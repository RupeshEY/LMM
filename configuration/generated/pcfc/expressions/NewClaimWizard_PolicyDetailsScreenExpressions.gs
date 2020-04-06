package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_PolicyDetailsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_PolicyDetailsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=NewClaimWizard_PolicyDetailsScreen_EditExternalFieldsButton) at NewClaimWizard_PolicyDetailsScreen.pcf: line 27, column 106
    function action_2 () : void {
      Wizard.deverifyPolicy()
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 46, column 112
    function def_onEnter_14 (def :  pcf.PolicyLocationsLV) : void {
      def.onEnter(Claim.Policy.PolicyLocations, Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 58, column 90
    function def_onEnter_19 (def :  pcf.PolicyTripLV) : void {
      def.onEnter( Claim, Wizard )
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 71, column 65
    function def_onEnter_24 (def :  pcf.NewClaimEndorsementsLV) : void {
      def.onEnter(Claim.Policy.Endorsements, Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 84, column 62
    function def_onEnter_29 (def :  pcf.NewClaimStatCodesLV) : void {
      def.onEnter(Claim.Policy.StatCodes, Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 34, column 61
    function def_onEnter_8 (def :  pcf.NewClaimVehiclesLV) : void {
      def.onEnter(Claim.Policy.Vehicles, Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 46, column 112
    function def_refreshVariables_15 (def :  pcf.PolicyLocationsLV) : void {
      def.refreshVariables(Claim.Policy.PolicyLocations, Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 58, column 90
    function def_refreshVariables_20 (def :  pcf.PolicyTripLV) : void {
      def.refreshVariables( Claim, Wizard )
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 71, column 65
    function def_refreshVariables_25 (def :  pcf.NewClaimEndorsementsLV) : void {
      def.refreshVariables(Claim.Policy.Endorsements, Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 84, column 62
    function def_refreshVariables_30 (def :  pcf.NewClaimStatCodesLV) : void {
      def.refreshVariables(Claim.Policy.StatCodes, Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 34, column 61
    function def_refreshVariables_9 (def :  pcf.NewClaimVehiclesLV) : void {
      def.refreshVariables(Claim.Policy.Vehicles, Claim.Policy)
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_PolicyDetailsScreen.pcf: line 16, column 29
    function initialValue_0 () : java.util.Set {
      return gw.api.policy.PolicyTabUtil.getTabSet(Claim)
    }
    
    // 'label' attribute on Verbatim at NewClaimWizard_PolicyDetailsScreen.pcf: line 30, column 225
    function label_3 () : java.lang.String {
      return Claim.Policy.Verified ? DisplayKey.get("JSP.NewClaimPolicyDetails.ReviewPolicyDetails.Tip") :                      DisplayKey.get("JSP.NewClaimPolicyDetails.ReviewOrEditPolicyDetails.Tip")
    }
    
    // 'title' attribute on TitleBar at NewClaimWizard_PolicyDetailsScreen.pcf: line 48, column 308
    function title_10 () : java.lang.String {
      return  !Claim.Policy.Verified or (Claim.Policy.TotalProperties == Claim.Policy.Properties.length) ? DisplayKey.get("JSP.NewClaimPolicyDetails.Policy.Locations") as String : DisplayKey.get("JSP.NewClaimPolicyDetails.Policy.Locations.PartialList", Claim.Policy.TotalProperties)
    }
    
    // 'title' attribute on TitleBar at NewClaimWizard_PolicyDetailsScreen.pcf: line 36, column 302
    function title_4 () : java.lang.String {
      return  (!Claim.Policy.Verified or (Claim.Policy.TotalVehicles == Claim.Policy.Vehicles.length)) ? DisplayKey.get("JSP.NewClaimPolicyDetails.Policy.Vehicles") as String : DisplayKey.get("JSP.NewClaimPolicyDetails.Policy.Vehicles.PartialList", Claim.Policy.TotalVehicles)
    }
    
    // 'visible' attribute on ToolbarButton (id=NewClaimWizard_PolicyDetailsScreen_EditExternalFieldsButton) at NewClaimWizard_PolicyDetailsScreen.pcf: line 27, column 106
    function visible_1 () : java.lang.Boolean {
      return Claim.Policy.Verified and perm.Policy.makeeditable(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'addVisible' attribute on IteratorButtons at NewClaimWizard_PolicyDetailsScreen.pcf: line 53, column 106
    function visible_11 () : java.lang.Boolean {
      return !Claim.Policy.Verified and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'visible' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 46, column 112
    function visible_13 () : java.lang.Boolean {
      return PolicyTabSet.contains("Properties") or PolicyTabSet.contains("Classcodes")
    }
    
    // 'visible' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 58, column 90
    function visible_18 () : java.lang.Boolean {
      return PolicyTabSet != null && PolicyTabSet.contains("Trips")
    }
    
    // 'visible' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 71, column 65
    function visible_23 () : java.lang.Boolean {
      return PolicyTabSet.contains("Endorsements")
    }
    
    // 'visible' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 84, column 62
    function visible_28 () : java.lang.Boolean {
      return PolicyTabSet.contains("Statcodes")
    }
    
    // 'addVisible' attribute on IteratorButtons at NewClaimWizard_PolicyDetailsScreen.pcf: line 41, column 52
    function visible_5 () : java.lang.Boolean {
      return  !Claim.Policy.Verified and perm.Policy.edit(Claim)
    }
    
    // 'removeVisible' attribute on IteratorButtons at NewClaimWizard_PolicyDetailsScreen.pcf: line 41, column 52
    function visible_6 () : java.lang.Boolean {
      return perm.Policy.edit(Claim)
    }
    
    // 'visible' attribute on PanelRef at NewClaimWizard_PolicyDetailsScreen.pcf: line 34, column 61
    function visible_7 () : java.lang.Boolean {
      return PolicyTabSet.contains("Vehicles")
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get PolicyTabSet () : java.util.Set {
      return getVariableValue("PolicyTabSet", 0) as java.util.Set
    }
    
    property set PolicyTabSet ($arg :  java.util.Set) {
      setVariableValue("PolicyTabSet", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
  }
  
  
}