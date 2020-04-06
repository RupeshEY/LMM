package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyGeneralExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyGeneralExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on MenuItem (id=EditInternalOnly) at ClaimPolicyGeneral.pcf: line 71, column 48
    function action_10 () : void {
      CurrentLocation.startEditing()
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyGeneral_RefreshPolicyButton) at ClaimPolicyGeneral.pcf: line 80, column 45
    function action_13 () : void {
      PolicyRefreshWizard.go(getClaimAndCheckForUnsavedWork(), gw.api.policy.refresh.RefreshPolicyFetcher.createForRefresh(Claim))
    }
    
    // 'action' attribute on PickerToolbarButton (id=ClaimPolicyGeneral_SelectPolicyButton) at ClaimPolicyGeneral.pcf: line 89, column 80
    function action_16 () : void {
      ClaimPolicySelectPolicyPopup.push(getClaimAndCheckForUnsavedWork())
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyGeneral_EditButton) at ClaimPolicyGeneral.pcf: line 33, column 73
    function action_2 () : void {
      CurrentLocation.startEditing()
    }
    
    // 'action' attribute on ToolbarButton (id=ViewInPC) at ClaimPolicyGeneral.pcf: line 97, column 121
    function action_21 () : void {
      ViewPolicy.push(gw.api.system.CCConfigParameters.PolicySystemURL.Value, Claim.Policy.PolicyNumber, Claim.LossDate)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyGeneral_EditButton2) at ClaimPolicyGeneral.pcf: line 43, column 112
    function action_4 () : void {
      gw.api.policy.ClaimPolicyMakeEditableUtil.makePolicyEditable(CurrentLocation, Claim, true);
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyGeneral_EditButton4) at ClaimPolicyGeneral.pcf: line 52, column 110
    function action_6 () : void {
      CurrentLocation.startEditing()
    }
    
    // 'action' attribute on MenuItem (id=EditFullPolicy) at ClaimPolicyGeneral.pcf: line 65, column 56
    function action_8 () : void {
      gw.api.policy.ClaimPolicyMakeEditableUtil.makePolicyEditable(CurrentLocation, Claim, true)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyGeneral_RefreshPolicyButton) at ClaimPolicyGeneral.pcf: line 80, column 45
    function action_dest_14 () : pcf.api.Destination {
      return pcf.PolicyRefreshWizard.createDestination(getClaimAndCheckForUnsavedWork(), gw.api.policy.refresh.RefreshPolicyFetcher.createForRefresh(Claim))
    }
    
    // 'action' attribute on PickerToolbarButton (id=ClaimPolicyGeneral_SelectPolicyButton) at ClaimPolicyGeneral.pcf: line 89, column 80
    function action_dest_17 () : pcf.api.Destination {
      return pcf.ClaimPolicySelectPolicyPopup.createDestination(getClaimAndCheckForUnsavedWork())
    }
    
    // 'action' attribute on ToolbarButton (id=ViewInPC) at ClaimPolicyGeneral.pcf: line 97, column 121
    function action_dest_22 () : pcf.api.Destination {
      return pcf.ViewPolicy.createDestination(gw.api.system.CCConfigParameters.PolicySystemURL.Value, Claim.Policy.PolicyNumber, Claim.LossDate)
    }
    
    // 'canVisit' attribute on Page (id=ClaimPolicyGeneral) at ClaimPolicyGeneral.pcf: line 11, column 33
    static function canVisit_35 (Claim :  Claim) : java.lang.Boolean {
      return perm.Policy.view(Claim) and perm.System.viewpolicy
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyGeneral.pcf: line 101, column 32
    function def_onEnter_24 (def :  pcf.PolicyGeneralPanelSet_Auto) : void {
      def.onEnter(Claim.Policy, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyGeneral.pcf: line 101, column 32
    function def_onEnter_26 (def :  pcf.PolicyGeneralPanelSet_Gl) : void {
      def.onEnter(Claim.Policy, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyGeneral.pcf: line 101, column 32
    function def_onEnter_28 (def :  pcf.PolicyGeneralPanelSet_Pr) : void {
      def.onEnter(Claim.Policy, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyGeneral.pcf: line 101, column 32
    function def_onEnter_30 (def :  pcf.PolicyGeneralPanelSet_Trav) : void {
      def.onEnter(Claim.Policy, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyGeneral.pcf: line 101, column 32
    function def_onEnter_32 (def :  pcf.PolicyGeneralPanelSet_Wc) : void {
      def.onEnter(Claim.Policy, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyGeneral.pcf: line 101, column 32
    function def_refreshVariables_25 (def :  pcf.PolicyGeneralPanelSet_Auto) : void {
      def.refreshVariables(Claim.Policy, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyGeneral.pcf: line 101, column 32
    function def_refreshVariables_27 (def :  pcf.PolicyGeneralPanelSet_Gl) : void {
      def.refreshVariables(Claim.Policy, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyGeneral.pcf: line 101, column 32
    function def_refreshVariables_29 (def :  pcf.PolicyGeneralPanelSet_Pr) : void {
      def.refreshVariables(Claim.Policy, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyGeneral.pcf: line 101, column 32
    function def_refreshVariables_31 (def :  pcf.PolicyGeneralPanelSet_Trav) : void {
      def.refreshVariables(Claim.Policy, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyGeneral.pcf: line 101, column 32
    function def_refreshVariables_33 (def :  pcf.PolicyGeneralPanelSet_Wc) : void {
      def.refreshVariables(Claim.Policy, Claim)
    }
    
    // 'handlesValidationIssue' attribute on Page (id=ClaimPolicyGeneral) at ClaimPolicyGeneral.pcf: line 11, column 33
    static function handlesValidationIssue_36 (Claim :  Claim, VALUE :  java.lang.Object) : java.lang.Boolean {
      return VALUE typeis entity.Policy or VALUE == Claim.Insured
    }
    
    // 'initialValue' attribute on Variable at ClaimPolicyGeneral.pcf: line 20, column 23
    function initialValue_0 () : Boolean {
      return gw.api.policy.PolicyTypeUtil.hasInternalOnlyFields()
    }
    
    // EditButtons at ClaimPolicyGeneral.pcf: line 91, column 32
    function label_19 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on PanelRef at ClaimPolicyGeneral.pcf: line 101, column 32
    function mode_34 () : java.lang.Object {
      return Claim.LossType
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=ClaimPolicyGeneral_SelectPolicyButton) at ClaimPolicyGeneral.pcf: line 89, column 80
    function onPick_18 (PickedValue :  PolicySummary) : void {
      PolicyRefreshWizard.go(Claim, gw.api.policy.refresh.RefreshPolicyFetcher.createForPolicySelect(Claim, PickedValue))
    }
    
    // Page (id=ClaimPolicyGeneral) at ClaimPolicyGeneral.pcf: line 11, column 33
    static function parent_37 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPolicyGroup.createDestination(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyGeneral_EditButton) at ClaimPolicyGeneral.pcf: line 33, column 73
    function visible_1 () : java.lang.Boolean {
      return !Claim.Policy.Verified and perm.Policy.edit(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyGeneral_EditButton5) at ClaimPolicyGeneral.pcf: line 58, column 135
    function visible_11 () : java.lang.Boolean {
      return Claim.Policy.Verified and HasInternalOnlyFields and (perm.Policy.makeeditable(Claim) and perm.Policy.edit(Claim))
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyGeneral_RefreshPolicyButton) at ClaimPolicyGeneral.pcf: line 80, column 45
    function visible_12 () : java.lang.Boolean {
      return Claim.LossDate != null
    }
    
    // 'visible' attribute on PickerToolbarButton (id=ClaimPolicyGeneral_SelectPolicyButton) at ClaimPolicyGeneral.pcf: line 89, column 80
    function visible_15 () : java.lang.Boolean {
      return Claim.LossDate != null and perm.Claim.selectpolicy(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ViewInPC) at ClaimPolicyGeneral.pcf: line 97, column 121
    function visible_20 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.PolicySystemURL.Value.HasContent and perm.System.viewpolicysystem
    }
    
    // 'visible' attribute on Toolbar at ClaimPolicyGeneral.pcf: line 24, column 42
    function visible_23 () : java.lang.Boolean {
      return perm.Claim.edit(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyGeneral_EditButton2) at ClaimPolicyGeneral.pcf: line 43, column 112
    function visible_3 () : java.lang.Boolean {
      return perm.Policy.makeeditable(Claim) and (Claim.Policy.Verified and not HasInternalOnlyFields)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyGeneral_EditButton4) at ClaimPolicyGeneral.pcf: line 52, column 110
    function visible_5 () : java.lang.Boolean {
      return not perm.Policy.makeeditable(Claim) and Claim.Policy.Verified and HasInternalOnlyFields
    }
    
    // 'visible' attribute on MenuItem (id=EditFullPolicy) at ClaimPolicyGeneral.pcf: line 65, column 56
    function visible_7 () : java.lang.Boolean {
      return perm.Policy.makeeditable(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=EditInternalOnly) at ClaimPolicyGeneral.pcf: line 71, column 48
    function visible_9 () : java.lang.Boolean {
      return perm.Policy.edit(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyGeneral {
      return super.CurrentLocation as pcf.ClaimPolicyGeneral
    }
    
    property get HasInternalOnlyFields () : Boolean {
      return getVariableValue("HasInternalOnlyFields", 0) as Boolean
    }
    
    property set HasInternalOnlyFields ($arg :  Boolean) {
      setVariableValue("HasInternalOnlyFields", 0, $arg)
    }
    
    function getClaimAndCheckForUnsavedWork() : Claim {
      if(gw.api.claim.ClaimUtil.doesClaimHaveUnsavedWork()) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.ClaimPolicy.General.UnsavedWorkOnClaim"))
      }
      return Claim
    }
    
    
  }
  
  
}