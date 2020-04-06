package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyScreen_500Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 20, column 84
    function def_onEnter_0 (def :  pcf.ClaimSnapshotPolicyGeneral500DetailPanelSet) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 198, column 73
    function def_onEnter_60 (def :  pcf.ClaimSnapshotPolicyStatCodes500LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 207, column 76
    function def_onEnter_63 (def :  pcf.ClaimSnapshotPolicyEndorsements500LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 20, column 84
    function def_refreshVariables_1 (def :  pcf.ClaimSnapshotPolicyGeneral500DetailPanelSet) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 198, column 73
    function def_refreshVariables_61 (def :  pcf.ClaimSnapshotPolicyStatCodes500LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 207, column 76
    function def_refreshVariables_64 (def :  pcf.ClaimSnapshotPolicyEndorsements500LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'title' attribute on Card (id=ClaimSnapshotPolicyLocations500Screen) at ClaimSnapshotPolicyScreen.500.pcf: line 46, column 202
    function title_14 () : java.lang.String {
      return  gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_PROPERTIES) ?               DisplayKey.get("JSP.ClaimSnapshot.Navigation.Policy.Locations") :               DisplayKey.get("JSP.ClaimSnapshot.Navigation.Policy.ClassCodes")
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyLocations500Screen) at ClaimSnapshotPolicyScreen.500.pcf: line 46, column 202
    function visible_13 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_PROPERTIES) or               gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_CLASSCODES)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyTrips500Card) at ClaimSnapshotPolicyScreen.500.pcf: line 67, column 97
    function visible_59 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_TRIPS)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyStatCodes500Card) at ClaimSnapshotPolicyScreen.500.pcf: line 196, column 101
    function visible_62 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_STATCODES)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyEndorsements500Card) at ClaimSnapshotPolicyScreen.500.pcf: line 205, column 104
    function visible_65 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, typekey.PolicyTab.TC_ENDORSEMENTS)
    }
    
    // 'visible' attribute on Card (id=ClaimSnapshotPolicyVehicles500Card) at ClaimSnapshotPolicyScreen.500.pcf: line 25, column 100
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends TripCoverageLDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyScreen.500.pcf: line 159, column 64
    function valueRoot_45 () : java.lang.Object {
      return CovTerm
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyScreen.500.pcf: line 159, column 64
    function value_43 () : dynamic.Dynamic {
      return CovTerm.Type
    }
    
    // 'value' attribute on TextCell (id=Value) at ClaimSnapshotPolicyScreen.500.pcf: line 164, column 64
    function value_46 () : dynamic.Dynamic {
      return CovTerm.Value
    }
    
    // 'value' attribute on TextCell (id=ValueType) at ClaimSnapshotPolicyScreen.500.pcf: line 169, column 64
    function value_49 () : dynamic.Dynamic {
      return CovTerm.ValueType
    }
    
    // 'value' attribute on TextCell (id=AggregationModel) at ClaimSnapshotPolicyScreen.500.pcf: line 174, column 64
    function value_52 () : dynamic.Dynamic {
      return CovTerm.AggregationModel
    }
    
    // 'value' attribute on TextCell (id=RestrictionModel) at ClaimSnapshotPolicyScreen.500.pcf: line 179, column 64
    function value_55 () : dynamic.Dynamic {
      return CovTerm.RestrictionModel
    }
    
    property get CovTerm () : dynamic.Dynamic {
      return getIteratedValue(3) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TripCoverageLDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyScreen.500.pcf: line 106, column 56
    function valueRoot_24 () : java.lang.Object {
      return TripCoverage
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyScreen.500.pcf: line 106, column 56
    function value_22 () : dynamic.Dynamic {
      return TripCoverage.Type
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyScreen.500.pcf: line 112, column 56
    function value_25 () : dynamic.Dynamic {
      return TripCoverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyScreen.500.pcf: line 118, column 56
    function value_28 () : dynamic.Dynamic {
      return TripCoverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyScreen.500.pcf: line 124, column 56
    function value_31 () : dynamic.Dynamic {
      return TripCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyScreen.500.pcf: line 129, column 56
    function value_34 () : dynamic.Dynamic {
      return TripCoverage.Notes
    }
    
    property get TripCoverage () : dynamic.Dynamic {
      return getIteratedValue(3) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanel2ExpressionsImpl extends ClaimSnapshotPolicyScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 59, column 87
    function def_onEnter_10 (def :  pcf.ClaimSnapshotPolicyLocation500PanelSet) : void {
      def.onEnter(Claim, LocationBasedRU)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 51, column 75
    function def_onEnter_8 (def :  pcf.ClaimSnapshotPolicyLocations500LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 59, column 87
    function def_refreshVariables_11 (def :  pcf.ClaimSnapshotPolicyLocation500PanelSet) : void {
      def.refreshVariables(Claim, LocationBasedRU)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 51, column 75
    function def_refreshVariables_9 (def :  pcf.ClaimSnapshotPolicyLocations500LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'title' attribute on Card (id=PolicyPropertyCard) at ClaimSnapshotPolicyScreen.500.pcf: line 57, column 66
    function title_12 () : java.lang.String {
      return util.Snapshot.renderValue(LocationBasedRU)
    }
    
    property get LocationBasedRU () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set LocationBasedRU ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanel3ExpressionsImpl extends ClaimSnapshotPolicyScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 72, column 71
    function def_onEnter_15 (def :  pcf.ClaimSnapshotPolicyTrips500LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 72, column 71
    function def_refreshVariables_16 (def :  pcf.ClaimSnapshotPolicyTrips500LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    property get aTripRU () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set aTripRU ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotPolicyScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 30, column 74
    function def_onEnter_2 (def :  pcf.ClaimSnapshotPolicyVehicles500LV) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 38, column 80
    function def_onEnter_4 (def :  pcf.ClaimSnapshotPolicyVehicle500PanelSet) : void {
      def.onEnter(Claim, VehicleRU)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 30, column 74
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotPolicyVehicles500LV) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyScreen.500.pcf: line 38, column 80
    function def_refreshVariables_5 (def :  pcf.ClaimSnapshotPolicyVehicle500PanelSet) : void {
      def.refreshVariables(Claim, VehicleRU)
    }
    
    // 'title' attribute on Card (id=PolicyVehicleCard) at ClaimSnapshotPolicyScreen.500.pcf: line 36, column 60
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripCoverageLDPExpressionsImpl extends ListDetailPanel3ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.500.pcf: line 106, column 56
    function sortValue_17 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.500.pcf: line 112, column 56
    function sortValue_18 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.500.pcf: line 118, column 56
    function sortValue_19 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.500.pcf: line 124, column 56
    function sortValue_20 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.500.pcf: line 129, column 56
    function sortValue_21 (TripCoverage :  dynamic.Dynamic) : java.lang.Object {
      return TripCoverage.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.500.pcf: line 159, column 64
    function sortValue_38 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.500.pcf: line 164, column 64
    function sortValue_39 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.Value
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.500.pcf: line 169, column 64
    function sortValue_40 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.ValueType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.500.pcf: line 174, column 64
    function sortValue_41 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.AggregationModel
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.500.pcf: line 179, column 64
    function sortValue_42 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.RestrictionModel
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.500.pcf: line 99, column 51
    function value_37 () : dynamic.Dynamic {
      return aTripRU.Coverages
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyScreen.500.pcf: line 152, column 59
    function value_58 () : dynamic.Dynamic {
      return SelectedCoverage.CovTerms
    }
    
    property get SelectedCoverage () : dynamic.Dynamic {
      return getCurrentSelection(2) as dynamic.Dynamic
    }
    
    property set SelectedCoverage ($arg :  dynamic.Dynamic) {
      setCurrentSelection(2, $arg)
    }
    
    
  }
  
  
}