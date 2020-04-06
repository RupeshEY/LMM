package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyScreen_800Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 20, column 84
    function def_onEnter_0 (def :  pcf.ClaimSnapshotPolicyGeneral800DetailPanelSet) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 156, column 73
    function def_onEnter_52 (def :  pcf.ClaimSnapshotPolicyStatCodes800LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 165, column 76
    function def_onEnter_55 (def :  pcf.ClaimSnapshotPolicyEndorsements800LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 20, column 84
    function def_refreshVariables_1 (def :  pcf.ClaimSnapshotPolicyGeneral800DetailPanelSet) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 156, column 73
    function def_refreshVariables_53 (def :  pcf.ClaimSnapshotPolicyStatCodes800LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 165, column 76
    function def_refreshVariables_56 (def :  pcf.ClaimSnapshotPolicyEndorsements800LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'title' attribute on Card (id=ClaimSnapshotPolicyLocations800Screen) at ClaimSnapshotPolicyScreen.800.pcf: line 46, column 202
    function title_14 () : java.lang.String {
      return  gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_PROPERTIES) ?               DisplayKey.get("JSP.ClaimSnapshot.Navigation.Policy.Locations") :               DisplayKey.get("JSP.ClaimSnapshot.Navigation.Policy.ClassCodes")
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyLocations800Screen) at ClaimSnapshotPolicyScreen.800.pcf: line 46, column 202
    function visible_13 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_PROPERTIES) or               gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_CLASSCODES)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyTrips800Card) at ClaimSnapshotPolicyScreen.800.pcf: line 69, column 97
    function visible_51 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_TRIPS)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyStatCodes800Card) at ClaimSnapshotPolicyScreen.800.pcf: line 154, column 101
    function visible_54 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_STATCODES)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyEndorsements800Card) at ClaimSnapshotPolicyScreen.800.pcf: line 163, column 104
    function visible_57 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_ENDORSEMENTS)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyVehicles800Card) at ClaimSnapshotPolicyScreen.800.pcf: line 25, column 100
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TripCoverageLDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyScreen.800.pcf: line 108, column 56
    function valueRoot_26 () : java.lang.Object {
      return TripCoverage
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyScreen.800.pcf: line 108, column 56
    function value_24 () : dynamic.Dynamic {
      return TripCoverage.Type
    }
    
    // 'value' attribute on TextCell (id=Currency) at ClaimSnapshotPolicyScreen.800.pcf: line 115, column 81
    function value_28 () : dynamic.Dynamic {
      return TripCoverage.Currency
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyScreen.800.pcf: line 121, column 56
    function value_31 () : dynamic.Dynamic {
      return TripCoverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyScreen.800.pcf: line 127, column 56
    function value_34 () : dynamic.Dynamic {
      return TripCoverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyScreen.800.pcf: line 133, column 56
    function value_37 () : dynamic.Dynamic {
      return TripCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyScreen.800.pcf: line 138, column 56
    function value_40 () : dynamic.Dynamic {
      return TripCoverage.Notes
    }
    
    // 'visible' attribute on TextCell (id=Currency) at ClaimSnapshotPolicyScreen.800.pcf: line 115, column 81
    function visible_27 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get TripCoverage () : dynamic.Dynamic {
      return getIteratedValue(3) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanel2ExpressionsImpl extends ClaimSnapshotPolicyScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 61, column 86
    function def_onEnter_10 (def :  pcf.ClaimSnapshotPolicyLocation800PanelSet) : void {
      def.onEnter(Claim, PolicyLocation)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 51, column 75
    function def_onEnter_8 (def :  pcf.ClaimSnapshotPolicyLocations800LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 61, column 86
    function def_refreshVariables_11 (def :  pcf.ClaimSnapshotPolicyLocation800PanelSet) : void {
      def.refreshVariables(Claim, PolicyLocation)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 51, column 75
    function def_refreshVariables_9 (def :  pcf.ClaimSnapshotPolicyLocations800LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'title' attribute on Card (id=PolicyPropertyCard) at ClaimSnapshotPolicyScreen.800.pcf: line 59, column 65
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanel3ExpressionsImpl extends ClaimSnapshotPolicyScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 74, column 71
    function def_onEnter_15 (def :  pcf.ClaimSnapshotPolicyTrips800LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 74, column 71
    function def_refreshVariables_16 (def :  pcf.ClaimSnapshotPolicyTrips800LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    property get aTripRU () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set aTripRU ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotPolicyScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 30, column 74
    function def_onEnter_2 (def :  pcf.ClaimSnapshotPolicyVehicles800LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 38, column 80
    function def_onEnter_4 (def :  pcf.ClaimSnapshotPolicyVehicle800PanelSet) : void {
      def.onEnter(Claim, VehicleRU)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 30, column 74
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotPolicyVehicles800LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 38, column 80
    function def_refreshVariables_5 (def :  pcf.ClaimSnapshotPolicyVehicle800PanelSet) : void {
      def.refreshVariables(Claim, VehicleRU)
    }
    
    // 'title' attribute on Card (id=PolicyVehicleCard) at ClaimSnapshotPolicyScreen.800.pcf: line 36, column 60
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripCoverageLDPExpressionsImpl extends ListDetailPanel3ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 145, column 31
    function def_onEnter_44 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_700) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 145, column 31
    function def_onEnter_46 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_800) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 145, column 31
    function def_onEnter_48 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_default) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 145, column 31
    function def_refreshVariables_45 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_700) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 145, column 31
    function def_refreshVariables_47 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_800) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 145, column 31
    function def_refreshVariables_49 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_default) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotPolicyScreen.800.pcf: line 145, column 31
    function mode_50 () : java.lang.Object {
      return 800
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.800.pcf: line 108, column 56
    function sortValue_17 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.800.pcf: line 115, column 81
    function sortValue_19 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.Currency
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.800.pcf: line 121, column 56
    function sortValue_20 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.800.pcf: line 127, column 56
    function sortValue_21 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.800.pcf: line 133, column 56
    function sortValue_22 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.800.pcf: line 138, column 56
    function sortValue_23 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.800.pcf: line 101, column 51
    function value_43 () : dynamic.Dynamic {
      return aTripRU.Coverages
    }
    
    // 'visible' attribute on RowIterator at ClaimSnapshotPolicyScreen.800.pcf: line 115, column 81
    function visible_18 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get SelectedCoverage () : dynamic.Dynamic {
      return getCurrentSelection(2) as dynamic.Dynamic
    }
    
    property set SelectedCoverage ($arg :  dynamic.Dynamic) {
      setCurrentSelection(2, $arg)
    }
    
    
  }
  
  
}