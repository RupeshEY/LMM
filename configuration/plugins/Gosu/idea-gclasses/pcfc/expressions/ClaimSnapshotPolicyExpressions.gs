package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/ClaimSnapshotPolicy.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/ClaimSnapshotPolicy.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ClaimSnapshotPolicy) at ClaimSnapshotPolicy.pcf: line 9, column 76
    static function canVisit_19 (Claim :  Claim) : java.lang.Boolean {
      return gw.api.snapshot.ClaimSnapshotUtil.hasSnapshot(Claim) and perm.Policy.view(Claim.Policy) and perm.System.viewpolicy and perm.System.viewsnapshot
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_onEnter_10 (def :  pcf.ClaimSnapshotPolicyScreen_600) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_onEnter_12 (def :  pcf.ClaimSnapshotPolicyScreen_700) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_onEnter_14 (def :  pcf.ClaimSnapshotPolicyScreen_800) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_onEnter_16 (def :  pcf.ClaimSnapshotPolicyScreen_default) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_onEnter_2 (def :  pcf.ClaimSnapshotPolicyScreen_300) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_onEnter_4 (def :  pcf.ClaimSnapshotPolicyScreen_310) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_onEnter_6 (def :  pcf.ClaimSnapshotPolicyScreen_400) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_onEnter_8 (def :  pcf.ClaimSnapshotPolicyScreen_500) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_refreshVariables_11 (def :  pcf.ClaimSnapshotPolicyScreen_600) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_refreshVariables_13 (def :  pcf.ClaimSnapshotPolicyScreen_700) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_refreshVariables_15 (def :  pcf.ClaimSnapshotPolicyScreen_800) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_refreshVariables_17 (def :  pcf.ClaimSnapshotPolicyScreen_default) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotPolicyScreen_300) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_refreshVariables_5 (def :  pcf.ClaimSnapshotPolicyScreen_310) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_refreshVariables_7 (def :  pcf.ClaimSnapshotPolicyScreen_400) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function def_refreshVariables_9 (def :  pcf.ClaimSnapshotPolicyScreen_500) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotPolicy.pcf: line 18, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return gw.api.snapshot.ClaimSnapshotUtil.getSnapshot(Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotPolicy.pcf: line 22, column 22
    function initialValue_1 () : String {
      return gw.api.snapshot.ClaimSnapshotUtil.getPageVersion(Snapshot)
    }
    
    // 'mode' attribute on ScreenRef at ClaimSnapshotPolicy.pcf: line 25, column 23
    function mode_18 () : java.lang.Object {
      return Version
    }
    
    // Page (id=ClaimSnapshotPolicy) at ClaimSnapshotPolicy.pcf: line 9, column 76
    static function parent_20 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimSnapshotGroup.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSnapshotPolicy {
      return super.CurrentLocation as pcf.ClaimSnapshotPolicy
    }
    
    property get Snapshot () : dynamic.Dynamic {
      return getVariableValue("Snapshot", 0) as dynamic.Dynamic
    }
    
    property set Snapshot ($arg :  dynamic.Dynamic) {
      setVariableValue("Snapshot", 0, $arg)
    }
    
    property get Version () : String {
      return getVariableValue("Version", 0) as String
    }
    
    property set Version ($arg :  String) {
      setVariableValue("Version", 0, $arg)
    }
    
    
  }
  
  
}