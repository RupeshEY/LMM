package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 17, column 21
    function action_0 () : void {
      pcf.ClaimPolicyGeneral.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 36, column 47
    function action_11 () : void {
      pcf.ClaimPolicyStatCodes.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 40, column 21
    function action_13 () : void {
      pcf.ClaimPolicyAggregateLimits.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 21, column 21
    function action_2 () : void {
      pcf.ClaimPolicyVehicles.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 25, column 21
    function action_4 () : void {
      pcf.ClaimPolicyTrips.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 29, column 21
    function action_6 () : void {
      pcf.ClaimPolicyLocations.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 33, column 21
    function action_9 () : void {
      pcf.ClaimPolicyEndorsements.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 17, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimPolicyGeneral.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 33, column 21
    function action_dest_10 () : pcf.api.Destination {
      return pcf.ClaimPolicyEndorsements.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 36, column 47
    function action_dest_12 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodes.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 40, column 21
    function action_dest_14 () : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimits.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 21, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimPolicyVehicles.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 25, column 21
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ClaimPolicyTrips.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 29, column 21
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ClaimPolicyLocations.createDestination(Claim)
    }
    
    // 'canVisit' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 8, column 76
    static function canVisit_15 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.Policy.view(Claim) and perm.System.viewpolicy and (Claim.State != ClaimState.TC_DRAFT)
    }
    
    // LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 8, column 76
    static function firstVisitableChildDestinationMethod_19 (Claim :  Claim) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ClaimPolicyGeneral.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimPolicyVehicles.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimPolicyTrips.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimPolicyLocations.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimPolicyEndorsements.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimPolicyStatCodes.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimPolicyAggregateLimits.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'label' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 29, column 21
    function label_8 () : java.lang.Object {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "Classcodes") ? DisplayKey.get("JSP.ClaimPolicy.Policy.Navigation.WCLocations") : DisplayKey.get("JSP.ClaimPolicy.Policy.Navigation.Locations")
    }
    
    // LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 8, column 76
    static function parent_16 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 8, column 76
    function tabBar_onEnter_17 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimPolicyGroup) at ClaimPolicyGroup.pcf: line 8, column 76
    function tabBar_refreshVariables_18 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyGroup {
      return super.CurrentLocation as pcf.ClaimPolicyGroup
    }
    
    
  }
  
  
}