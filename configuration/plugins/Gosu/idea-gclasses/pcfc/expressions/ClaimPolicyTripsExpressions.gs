package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyTripsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyTripsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyTrip_DeverifyPolicy) at ClaimPolicyTrips.pcf: line 25, column 72
    function action_1 () : void {
      gw.api.policy.ClaimPolicyMakeEditableUtil.makePolicyEditable(CurrentLocation, Claim, true)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyTrip_EditButton) at ClaimPolicyTrips.pcf: line 34, column 73
    function action_3 () : void {
      CurrentLocation.startEditing()
    }
    
    // 'canEdit' attribute on Page (id=ClaimPolicyTrips) at ClaimPolicyTrips.pcf: line 9, column 63
    function canEdit_8 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "Trips") and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimPolicyTrips) at ClaimPolicyTrips.pcf: line 9, column 63
    static function canVisit_9 (Claim :  Claim) : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "Trips") and perm.Policy.view(Claim) and perm.System.viewpolicy
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyTrips.pcf: line 44, column 89
    function def_onEnter_6 (def :  pcf.TripLDV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyTrips.pcf: line 44, column 89
    function def_refreshVariables_7 (def :  pcf.TripLDV) : void {
      def.refreshVariables(Claim)
    }
    
    // EditButtons (id=tripsegment_toolbar) at ClaimPolicyTrips.pcf: line 40, column 37
    function label_4 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // Page (id=ClaimPolicyTrips) at ClaimPolicyTrips.pcf: line 9, column 63
    static function parent_10 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPolicyGroup.createDestination(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyTrip_DeverifyPolicy) at ClaimPolicyTrips.pcf: line 25, column 72
    function visible_0 () : java.lang.Boolean {
      return Claim.Policy.Verified and perm.Policy.edit(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyTrip_EditButton) at ClaimPolicyTrips.pcf: line 34, column 73
    function visible_2 () : java.lang.Boolean {
      return !Claim.Policy.Verified and perm.Policy.edit(Claim)
    }
    
    // 'visible' attribute on PanelRef at ClaimPolicyTrips.pcf: line 44, column 89
    function visible_5 () : java.lang.Boolean {
      return Claim.Policy.RiskUnits.where(\ r -> r typeis TripRU).Count > 0
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyTrips {
      return super.CurrentLocation as pcf.ClaimPolicyTrips
    }
    
    
  }
  
  
}