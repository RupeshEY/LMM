package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyScreen_310Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.310.pcf: line 19, column 72
    function def_onEnter_0 (def :  pcf.ClaimSnapshotPolicyGeneral310DV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.310.pcf: line 53, column 73
    function def_onEnter_12 (def :  pcf.ClaimSnapshotPolicyStatCodes310LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.310.pcf: line 26, column 72
    function def_onEnter_2 (def :  pcf.ClaimSnapshotPolicyVehicles310LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.310.pcf: line 35, column 73
    function def_onEnter_5 (def :  pcf.ClaimSnapshotPolicyLocations310LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.310.pcf: line 44, column 76
    function def_onEnter_9 (def :  pcf.ClaimSnapshotPolicyEndorsements310LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.310.pcf: line 19, column 72
    function def_refreshVariables_1 (def :  pcf.ClaimSnapshotPolicyGeneral310DV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.310.pcf: line 44, column 76
    function def_refreshVariables_10 (def :  pcf.ClaimSnapshotPolicyEndorsements310LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.310.pcf: line 53, column 73
    function def_refreshVariables_13 (def :  pcf.ClaimSnapshotPolicyStatCodes310LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.310.pcf: line 26, column 72
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotPolicyVehicles310LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.310.pcf: line 35, column 73
    function def_refreshVariables_6 (def :  pcf.ClaimSnapshotPolicyLocations310LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'title' attribute on Card (id=ClaimSnapshotPolicyLocations310Screen) at ClaimSnapshotPolicyScreen.310.pcf: line 33, column 202
    function title_8 () : java.lang.String {
      return  gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_PROPERTIES) ?               DisplayKey.get("JSP.ClaimSnapshot.Navigation.Policy.Locations") :               DisplayKey.get("JSP.ClaimSnapshot.Navigation.Policy.ClassCodes")
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyEndorsements310Card) at ClaimSnapshotPolicyScreen.310.pcf: line 42, column 104
    function visible_11 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_ENDORSEMENTS)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyStatCodes310Card) at ClaimSnapshotPolicyScreen.310.pcf: line 51, column 101
    function visible_14 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_STATCODES)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyVehicles310Card) at ClaimSnapshotPolicyScreen.310.pcf: line 24, column 100
    function visible_4 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_VEHICLES)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyLocations310Screen) at ClaimSnapshotPolicyScreen.310.pcf: line 33, column 202
    function visible_7 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_PROPERTIES) or               gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_CLASSCODES)
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
  
  
}