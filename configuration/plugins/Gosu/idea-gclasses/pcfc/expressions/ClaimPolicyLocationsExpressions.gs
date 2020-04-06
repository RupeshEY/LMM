package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyLocationsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyLocationsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyLocations_AddMoreLocationsButton) at ClaimPolicyLocations.pcf: line 34, column 135
    function action_5 () : void {
      gw.api.policy.ClaimPolicyMakeEditableUtil.makePolicyEditable(CurrentLocation, Claim); CurrentLocation.startEditing()
    }
    
    // 'beforeCommit' attribute on Page (id=ClaimPolicyLocations) at ClaimPolicyLocations.pcf: line 10, column 67
    function beforeCommit_8 (pickedValue :  java.lang.Object) : void {
      validateValidRiskUnits(); gw.policy.location.PolicyLocationUtil.addNewBuildingsToPolicyLocation(Claim.Policy)
    }
    
    // 'canEdit' attribute on Page (id=ClaimPolicyLocations) at ClaimPolicyLocations.pcf: line 10, column 67
    function canEdit_9 () : java.lang.Boolean {
      return (gw.api.policy.PolicyTabUtil.hasTab(Claim, "Properties") or gw.api.policy.PolicyTabUtil.hasTab(Claim, "Classcodes")) and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimPolicyLocations) at ClaimPolicyLocations.pcf: line 10, column 67
    static function canVisit_10 (Claim :  Claim) : java.lang.Boolean {
      return (gw.api.policy.PolicyTabUtil.hasTab(Claim, "Properties") or gw.api.policy.PolicyTabUtil.hasTab(Claim, "Classcodes")) and perm.Policy.view(Claim) and perm.System.viewpolicy
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyLocations.pcf: line 37, column 41
    function def_onEnter_6 (def :  pcf.PolicyLocationLDV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyLocations.pcf: line 37, column 41
    function def_refreshVariables_7 (def :  pcf.PolicyLocationLDV) : void {
      def.refreshVariables(Claim)
    }
    
    // EditButtons at ClaimPolicyLocations.pcf: line 28, column 104
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // Page (id=ClaimPolicyLocations) at ClaimPolicyLocations.pcf: line 10, column 67
    static function parent_11 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPolicyGroup.createDestination(Claim)
    }
    
    // 'addVisible' attribute on IteratorButtons (id=AddLocation) at ClaimPolicyLocations.pcf: line 26, column 106
    function visible_0 () : java.lang.Boolean {
      return !Claim.Policy.Verified and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyLocations_AddMoreLocationsButton) at ClaimPolicyLocations.pcf: line 34, column 135
    function visible_4 () : java.lang.Boolean {
      return Claim.Policy.Verified and perm.Claim.edit(Claim) and perm.Policy.edit(Claim) and perm.Policy.makeeditable(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyLocations {
      return super.CurrentLocation as pcf.ClaimPolicyLocations
    }
    
    function validateValidRiskUnits() {
      if (Claim.Policy.hasValidRiskUnits()) {return}
      throw new gw.api.util.DisplayableException(DisplayKey.get("JSP.ClaimPolicy.Policy.CombinationMustBeUnique"))
    }
    
    
  }
  
  
}