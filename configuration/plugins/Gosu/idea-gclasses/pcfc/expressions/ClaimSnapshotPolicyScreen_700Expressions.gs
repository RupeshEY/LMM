package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyScreen_700Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 20, column 84
    function def_onEnter_0 (def :  pcf.ClaimSnapshotPolicyGeneral700DetailPanelSet) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 149, column 73
    function def_onEnter_46 (def :  pcf.ClaimSnapshotPolicyStatCodes700LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 158, column 76
    function def_onEnter_49 (def :  pcf.ClaimSnapshotPolicyEndorsements700LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 20, column 84
    function def_refreshVariables_1 (def :  pcf.ClaimSnapshotPolicyGeneral700DetailPanelSet) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 149, column 73
    function def_refreshVariables_47 (def :  pcf.ClaimSnapshotPolicyStatCodes700LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 158, column 76
    function def_refreshVariables_50 (def :  pcf.ClaimSnapshotPolicyEndorsements700LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'title' attribute on Card (id=ClaimSnapshotPolicyLocations700Screen) at ClaimSnapshotPolicyScreen.700.pcf: line 46, column 202
    function title_14 () : java.lang.String {
      return  gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_PROPERTIES) ?               DisplayKey.get("JSP.ClaimSnapshot.Navigation.Policy.Locations") :               DisplayKey.get("JSP.ClaimSnapshot.Navigation.Policy.ClassCodes")
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyLocations700Screen) at ClaimSnapshotPolicyScreen.700.pcf: line 46, column 202
    function visible_13 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_PROPERTIES) or               gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_CLASSCODES)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyTrips700Card) at ClaimSnapshotPolicyScreen.700.pcf: line 69, column 97
    function visible_45 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_TRIPS)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyStatCodes700Card) at ClaimSnapshotPolicyScreen.700.pcf: line 147, column 101
    function visible_48 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_STATCODES)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyEndorsements700Card) at ClaimSnapshotPolicyScreen.700.pcf: line 156, column 104
    function visible_51 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_ENDORSEMENTS)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyVehicles700Card) at ClaimSnapshotPolicyScreen.700.pcf: line 25, column 100
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
    
    
    function getTrips(riskUnits : dynamic.Dynamic) : dynamic.Dynamic {
      var list = new java.util.ArrayList()
      for (ru in riskUnits) {
        if (ru.Subtype.Name == "TripRU") {
          list.add( ru )
        }
      }
      return list.toArray()
    }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TripCoverageLDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyScreen.700.pcf: line 108, column 56
    function valueRoot_24 () : java.lang.Object {
      return TripCoverage
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyScreen.700.pcf: line 108, column 56
    function value_22 () : dynamic.Dynamic {
      return TripCoverage.Type
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyScreen.700.pcf: line 114, column 56
    function value_25 () : dynamic.Dynamic {
      return TripCoverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyScreen.700.pcf: line 120, column 56
    function value_28 () : dynamic.Dynamic {
      return TripCoverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyScreen.700.pcf: line 126, column 56
    function value_31 () : dynamic.Dynamic {
      return TripCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyScreen.700.pcf: line 131, column 56
    function value_34 () : dynamic.Dynamic {
      return TripCoverage.Notes
    }
    
    property get TripCoverage () : dynamic.Dynamic {
      return getIteratedValue(3) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanel2ExpressionsImpl extends ClaimSnapshotPolicyScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 61, column 86
    function def_onEnter_10 (def :  pcf.ClaimSnapshotPolicyLocation700PanelSet) : void {
      def.onEnter(Claim, PolicyLocation)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 51, column 75
    function def_onEnter_8 (def :  pcf.ClaimSnapshotPolicyLocations700LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 61, column 86
    function def_refreshVariables_11 (def :  pcf.ClaimSnapshotPolicyLocation700PanelSet) : void {
      def.refreshVariables(Claim, PolicyLocation)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 51, column 75
    function def_refreshVariables_9 (def :  pcf.ClaimSnapshotPolicyLocations700LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'title' attribute on Card (id=PolicyPropertyCard) at ClaimSnapshotPolicyScreen.700.pcf: line 59, column 65
    function title_12 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyLocation)
    }
    
    property get PolicyLocation () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set PolicyLocation ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanel3ExpressionsImpl extends ClaimSnapshotPolicyScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 74, column 71
    function def_onEnter_15 (def :  pcf.ClaimSnapshotPolicyTrips700LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 74, column 71
    function def_refreshVariables_16 (def :  pcf.ClaimSnapshotPolicyTrips700LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    property get aTripRU () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set aTripRU ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotPolicyScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 30, column 74
    function def_onEnter_2 (def :  pcf.ClaimSnapshotPolicyVehicles700LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 38, column 80
    function def_onEnter_4 (def :  pcf.ClaimSnapshotPolicyVehicle700PanelSet) : void {
      def.onEnter(Claim, VehicleRU)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 30, column 74
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotPolicyVehicles700LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 38, column 80
    function def_refreshVariables_5 (def :  pcf.ClaimSnapshotPolicyVehicle700PanelSet) : void {
      def.refreshVariables(Claim, VehicleRU)
    }
    
    // 'title' attribute on Card (id=PolicyVehicleCard) at ClaimSnapshotPolicyScreen.700.pcf: line 36, column 60
    function title_6 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU)
    }
    
    property get VehicleRU () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set VehicleRU ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripCoverageLDPExpressionsImpl extends ListDetailPanel3ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 138, column 31
    function def_onEnter_38 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_700) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 138, column 31
    function def_onEnter_40 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_800) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 138, column 31
    function def_onEnter_42 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_default) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 138, column 31
    function def_refreshVariables_39 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_700) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 138, column 31
    function def_refreshVariables_41 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_800) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 138, column 31
    function def_refreshVariables_43 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_default) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotPolicyScreen.700.pcf: line 138, column 31
    function mode_44 () : java.lang.Object {
      return 700
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.700.pcf: line 108, column 56
    function sortValue_17 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.700.pcf: line 114, column 56
    function sortValue_18 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.700.pcf: line 120, column 56
    function sortValue_19 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.700.pcf: line 126, column 56
    function sortValue_20 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.700.pcf: line 131, column 56
    function sortValue_21 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.700.pcf: line 101, column 51
    function value_37 () : dynamic.Dynamic {
      return aTripRU.Coverages
    }
    
    property get SelectedCoverage () : dynamic.Dynamic {
      return getCurrentSelection(2) as dynamic.Dynamic
    }
    
    property set SelectedCoverage ($arg :  dynamic.Dynamic) {
      setCurrentSelection(2, $arg)
    }
    
    
  }
  
  
}