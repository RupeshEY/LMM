package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyVehicle800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyVehicle800PanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyVehicle800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicle800LDPExpressionsImpl extends ClaimSnapshotPolicyVehicle800PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 184, column 21
    function def_onEnter_86 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_700) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 184, column 21
    function def_onEnter_88 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_800) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 184, column 21
    function def_onEnter_90 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_default) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 184, column 21
    function def_refreshVariables_87 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_700) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 184, column 21
    function def_refreshVariables_89 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_800) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 184, column 21
    function def_refreshVariables_91 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_default) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 184, column 21
    function mode_92 () : java.lang.Object {
      return 800
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 118, column 46
    function sortValue_39 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 125, column 71
    function sortValue_41 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.Currency
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 131, column 46
    function sortValue_42 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 137, column 46
    function sortValue_43 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 143, column 46
    function sortValue_44 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 149, column 46
    function sortValue_45 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.NonmedAggLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 155, column 46
    function sortValue_46 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.ReplaceAggLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 161, column 46
    function sortValue_47 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.PersonAggLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 167, column 46
    function sortValue_48 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.ClaimAggLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 172, column 46
    function sortValue_49 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.LimitsIndicator
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 177, column 46
    function sortValue_50 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 111, column 41
    function value_85 () : dynamic.Dynamic {
      return VehicleRU.Coverages
    }
    
    // 'visible' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 125, column 71
    function visible_40 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get SelectedCoverage () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set SelectedCoverage ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyVehicle800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicle800PanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 84, column 79
    function sortValue_32 (VehicleOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(VehicleOwner.Lienholder)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 88, column 78
    function sortValue_33 (VehicleOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(VehicleOwner.OwnerType)
    }
    
    // 'value' attribute on TextInput (id=Number) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 19, column 66
    function value_0 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU.RUNumber)
    }
    
    // 'value' attribute on TextInput (id=VIN) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 40, column 196
    function value_11 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU.Vehicle.Vin)
    }
    
    // 'value' attribute on TextInput (id=SerialNumber) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 45, column 180
    function value_15 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU.Vehicle.SerialNumber)
    }
    
    // 'value' attribute on TextInput (id=Color) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 49, column 71
    function value_18 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU.Vehicle.Color)
    }
    
    // 'value' attribute on TextInput (id=Make) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 23, column 70
    function value_2 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU.Vehicle.Make)
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 53, column 71
    function value_20 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU.Vehicle.State)
    }
    
    // 'value' attribute on TextInput (id=LicensePlate) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 57, column 78
    function value_22 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU.Vehicle.LicensePlate)
    }
    
    // 'value' attribute on TextInput (id=BoatType) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 62, column 71
    function value_25 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU.Vehicle.BoatType)
    }
    
    // 'value' attribute on TextInput (id=OffRoadStyle) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 67, column 128
    function value_29 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU.Vehicle.OffRoadStyle)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 79, column 43
    function value_38 () : dynamic.Dynamic {
      return VehicleRU.Vehicle.Lienholders
    }
    
    // 'value' attribute on TextInput (id=Model) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 27, column 71
    function value_4 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU.Vehicle.Model)
    }
    
    // 'value' attribute on TextInput (id=Year) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 31, column 70
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU.Vehicle.Year)
    }
    
    // 'value' attribute on TextInput (id=Style) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 35, column 71
    function value_8 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleRU.Vehicle.Style)
    }
    
    // 'visible' attribute on TextInput (id=VIN) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 40, column 196
    function visible_10 () : java.lang.Boolean {
      return VehicleRU.Vehicle.Style.Code != "boat" && VehicleRU.Vehicle.Style.Code != "ATV" && VehicleRU.Vehicle.Style.Code != "snowmobile"
    }
    
    // 'visible' attribute on TextInput (id=SerialNumber) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 45, column 180
    function visible_14 () : java.lang.Boolean {
      return VehicleRU.Vehicle.Style.Code == "boat" || VehicleRU.Vehicle.Style.Code == "ATV" || VehicleRU.Vehicle.Style.Code == "snowmobile"
    }
    
    // 'visible' attribute on TextInput (id=BoatType) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 62, column 71
    function visible_24 () : java.lang.Boolean {
      return VehicleRU.Vehicle.Style.Code == "boat"
    }
    
    // 'visible' attribute on TextInput (id=OffRoadStyle) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 67, column 128
    function visible_28 () : java.lang.Boolean {
      return VehicleRU.Vehicle.Style.Code == "ATV" || VehicleRU.Vehicle.Style.Code == "snowmobile"
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get VehicleRU () : dynamic.Dynamic {
      return getRequireValue("VehicleRU", 0) as dynamic.Dynamic
    }
    
    property set VehicleRU ($arg :  dynamic.Dynamic) {
      setRequireValue("VehicleRU", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyVehicle800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotPolicyVehicle800LDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 118, column 46
    function valueRoot_53 () : java.lang.Object {
      return VehicleCoverage
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 118, column 46
    function value_51 () : dynamic.Dynamic {
      return VehicleCoverage.Type
    }
    
    // 'value' attribute on TextCell (id=Currency) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 125, column 71
    function value_55 () : dynamic.Dynamic {
      return VehicleCoverage.Currency
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 131, column 46
    function value_58 () : dynamic.Dynamic {
      return VehicleCoverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 137, column 46
    function value_61 () : dynamic.Dynamic {
      return VehicleCoverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 143, column 46
    function value_64 () : dynamic.Dynamic {
      return VehicleCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=NonmedAggLimit) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 149, column 46
    function value_67 () : dynamic.Dynamic {
      return VehicleCoverage.NonmedAggLimit
    }
    
    // 'value' attribute on TextCell (id=ReplaceAggLimit) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 155, column 46
    function value_70 () : dynamic.Dynamic {
      return VehicleCoverage.ReplaceAggLimit
    }
    
    // 'value' attribute on TextCell (id=PersonAggLimit) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 161, column 46
    function value_73 () : dynamic.Dynamic {
      return VehicleCoverage.PersonAggLimit
    }
    
    // 'value' attribute on TextCell (id=ClaimAggLimit) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 167, column 46
    function value_76 () : dynamic.Dynamic {
      return VehicleCoverage.ClaimAggLimit
    }
    
    // 'value' attribute on TextCell (id=LimitsIndicator) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 172, column 46
    function value_79 () : dynamic.Dynamic {
      return VehicleCoverage.LimitsIndicator
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 177, column 46
    function value_82 () : dynamic.Dynamic {
      return VehicleCoverage.Notes
    }
    
    // 'visible' attribute on TextCell (id=Currency) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 125, column 71
    function visible_54 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get VehicleCoverage () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyVehicle800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyVehicle800PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 84, column 79
    function value_34 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleOwner.Lienholder)
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotPolicyVehicle800PanelSet.pcf: line 88, column 78
    function value_36 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleOwner.OwnerType)
    }
    
    property get VehicleOwner () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}