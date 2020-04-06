package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyEndorsementsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyEndorsementsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyEndorsements_AddMoreEndorsementsButton) at ClaimPolicyEndorsements.pcf: line 30, column 80
    function action_3 () : void {
      gw.api.policy.ClaimPolicyMakeEditableUtil.makePolicyEditable(CurrentLocation, Claim)
    }
    
    // 'canEdit' attribute on Page (id=ClaimPolicyEndorsements) at ClaimPolicyEndorsements.pcf: line 9, column 77
    function canEdit_14 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "Endorsements") and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimPolicyEndorsements) at ClaimPolicyEndorsements.pcf: line 9, column 77
    static function canVisit_15 (Claim :  Claim) : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "Endorsements") and perm.Policy.view(Claim) and perm.System.viewpolicy
    }
    
    // Page (id=ClaimPolicyEndorsements) at ClaimPolicyEndorsements.pcf: line 9, column 77
    static function parent_16 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPolicyGroup.createDestination(Claim)
    }
    
    // 'addVisible' attribute on IteratorButtons at ClaimPolicyEndorsements.pcf: line 23, column 106
    function visible_0 () : java.lang.Boolean {
      return !Claim.Policy.Verified and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyEndorsements_AddMoreEndorsementsButton) at ClaimPolicyEndorsements.pcf: line 30, column 80
    function visible_2 () : java.lang.Boolean {
      return Claim.Policy.Verified and perm.Policy.makeeditable(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyEndorsements {
      return super.CurrentLocation as pcf.ClaimPolicyEndorsements
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimPolicyEndorsementsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyEndorsements_EditButton) at ClaimPolicyEndorsements.pcf: line 52, column 143
    function action_7 () : void {
      gw.api.policy.ClaimPolicyMakeEditableUtil.makePolicyEditable(CurrentLocation, Claim, true);
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyEndorsements.pcf: line 42, column 54
    function def_onEnter_12 (def :  pcf.EndorsementDetailDV) : void {
      def.onEnter(Endorsement)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyEndorsements.pcf: line 36, column 67
    function def_onEnter_4 (def :  pcf.EndorsementsLV) : void {
      def.onEnter(Claim.Policy.Endorsements, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyEndorsements.pcf: line 42, column 54
    function def_refreshVariables_13 (def :  pcf.EndorsementDetailDV) : void {
      def.refreshVariables(Endorsement)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyEndorsements.pcf: line 36, column 67
    function def_refreshVariables_5 (def :  pcf.EndorsementsLV) : void {
      def.refreshVariables(Claim.Policy.Endorsements, Claim)
    }
    
    // EditButtons at ClaimPolicyEndorsements.pcf: line 57, column 59
    function label_11 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyEndorsements_EditButton) at ClaimPolicyEndorsements.pcf: line 52, column 143
    function visible_6 () : java.lang.Boolean {
      return Claim.Policy.Verified and perm.Claim.edit(Claim) and perm.Policy.edit(Claim) and perm.Policy.makeeditable(Claim)
    }
    
    // 'cancelVisible' attribute on EditButtons at ClaimPolicyEndorsements.pcf: line 57, column 59
    function visible_8 () : java.lang.Boolean {
      return !Claim.Policy.Verified
    }
    
    property get Endorsement () : Endorsement {
      return getCurrentSelection(1) as Endorsement
    }
    
    property set Endorsement ($arg :  Endorsement) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}