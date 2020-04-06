package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 16, column 51
    function action_0 () : void {
      pcf.ClaimSnapshotLossDetails.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 36, column 21
    function action_10 () : void {
      pcf.ClaimSnapshotDocuments.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 40, column 21
    function action_12 () : void {
      pcf.ClaimSnapshotExtraFields.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 20, column 21
    function action_2 () : void {
      pcf.ClaimSnapshotPartiesInvolved.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 24, column 21
    function action_4 () : void {
      pcf.ClaimSnapshotPolicy.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 28, column 21
    function action_6 () : void {
      pcf.ClaimSnapshotExposures.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 32, column 21
    function action_8 () : void {
      pcf.ClaimSnapshotNotes.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 16, column 51
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimSnapshotLossDetails.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 36, column 21
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ClaimSnapshotDocuments.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 40, column 21
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ClaimSnapshotExtraFields.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 20, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimSnapshotPartiesInvolved.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 24, column 21
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ClaimSnapshotPolicy.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 28, column 21
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ClaimSnapshotExposures.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 32, column 21
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ClaimSnapshotNotes.createDestination(Claim)
    }
    
    // 'canVisit' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 8, column 26
    static function canVisit_14 (Claim :  Claim) : java.lang.Boolean {
      return gw.api.snapshot.ClaimSnapshotUtil.hasSnapshot(Claim) and perm.Claim.view(Claim) and perm.System.viewsnapshot and (perm.System.viewclaimbasics or perm.System.viewclaimparties or perm.System.viewpolicy or perm.System.viewexposures or perm.System.viewclaimnotes or perm.System.viewdocs)
    }
    
    // LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 8, column 26
    static function firstVisitableChildDestinationMethod_18 (Claim :  Claim) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ClaimSnapshotLossDetails.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimSnapshotPartiesInvolved.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimSnapshotPolicy.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimSnapshotExposures.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimSnapshotNotes.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimSnapshotDocuments.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimSnapshotExtraFields.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 8, column 26
    static function parent_15 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 8, column 26
    function tabBar_onEnter_16 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimSnapshotGroup) at ClaimSnapshotGroup.pcf: line 8, column 26
    function tabBar_refreshVariables_17 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSnapshotGroup {
      return super.CurrentLocation as pcf.ClaimSnapshotGroup
    }
    
    
  }
  
  
}