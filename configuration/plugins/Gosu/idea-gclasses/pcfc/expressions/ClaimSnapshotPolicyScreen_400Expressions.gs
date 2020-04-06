package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyScreen_400Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 20, column 72
    function def_onEnter_0 (def :  pcf.ClaimSnapshotPolicyGeneral400DV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 69, column 76
    function def_onEnter_15 (def :  pcf.ClaimSnapshotPolicyEndorsements400LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 78, column 73
    function def_onEnter_18 (def :  pcf.ClaimSnapshotPolicyStatCodes400LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 20, column 72
    function def_refreshVariables_1 (def :  pcf.ClaimSnapshotPolicyGeneral400DV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 69, column 76
    function def_refreshVariables_16 (def :  pcf.ClaimSnapshotPolicyEndorsements400LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 78, column 73
    function def_refreshVariables_19 (def :  pcf.ClaimSnapshotPolicyStatCodes400LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'title' attribute on Card (id=ClaimSnapshotPolicyLocations400Screen) at ClaimSnapshotPolicyScreen.400.pcf: line 46, column 202
    function title_14 () : java.lang.String {
      return  gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_PROPERTIES) ?               DisplayKey.get("JSP.ClaimSnapshot.Navigation.Policy.Locations") :               DisplayKey.get("JSP.ClaimSnapshot.Navigation.Policy.ClassCodes")
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyLocations400Screen) at ClaimSnapshotPolicyScreen.400.pcf: line 46, column 202
    function visible_13 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_PROPERTIES) or               gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_CLASSCODES)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyEndorsements400Card) at ClaimSnapshotPolicyScreen.400.pcf: line 67, column 104
    function visible_17 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_ENDORSEMENTS)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyStatCodes400Card) at ClaimSnapshotPolicyScreen.400.pcf: line 76, column 101
    function visible_20 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_STATCODES)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyVehicles400Card) at ClaimSnapshotPolicyScreen.400.pcf: line 25, column 100
    function visible_7 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_VEHICLES)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanel2ExpressionsImpl extends ClaimSnapshotPolicyScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 59, column 80
    function def_onEnter_10 (def :  pcf.ClaimSnapshotPolicyLocation400DV) : void {
      def.onEnter(Claim, PolicyProperty)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 51, column 75
    function def_onEnter_8 (def :  pcf.ClaimSnapshotPolicyLocations400LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 59, column 80
    function def_refreshVariables_11 (def :  pcf.ClaimSnapshotPolicyLocation400DV) : void {
      def.refreshVariables(Claim, PolicyProperty)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 51, column 75
    function def_refreshVariables_9 (def :  pcf.ClaimSnapshotPolicyLocations400LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'title' attribute on Card (id=PolicyPropertyCard) at ClaimSnapshotPolicyScreen.400.pcf: line 57, column 65
    function title_12 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyProperty)
    }
    
    property get PolicyProperty () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set PolicyProperty ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotPolicyScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 30, column 74
    function def_onEnter_2 (def :  pcf.ClaimSnapshotPolicyVehicles400LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 38, column 78
    function def_onEnter_4 (def :  pcf.ClaimSnapshotPolicyVehicle400DV) : void {
      def.onEnter(Claim, PolicyVehicle)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 30, column 74
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotPolicyVehicles400LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.400.pcf: line 38, column 78
    function def_refreshVariables_5 (def :  pcf.ClaimSnapshotPolicyVehicle400DV) : void {
      def.refreshVariables(Claim, PolicyVehicle)
    }
    
    // 'title' attribute on Card (id=PolicyVehicleCard) at ClaimSnapshotPolicyScreen.400.pcf: line 36, column 64
    function title_6 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle)
    }
    
    property get PolicyVehicle () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set PolicyVehicle ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}