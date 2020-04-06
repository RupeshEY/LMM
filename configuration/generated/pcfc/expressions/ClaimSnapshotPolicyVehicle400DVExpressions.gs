package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyVehicle400DVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicle400DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 82, column 77
    function sortValue_32 (VehicleOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(VehicleOwner.Lienholder)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 86, column 76
    function sortValue_33 (VehicleOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(VehicleOwner.OwnerType)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 112, column 46
    function sortValue_39 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 118, column 46
    function sortValue_40 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 124, column 46
    function sortValue_41 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 130, column 46
    function sortValue_42 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 136, column 46
    function sortValue_43 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.NonmedAggLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 142, column 46
    function sortValue_44 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.ReplaceAggLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 148, column 46
    function sortValue_45 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.PersonAggLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 154, column 46
    function sortValue_46 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.ClaimAggLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 159, column 46
    function sortValue_47 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.LimitsIndicator
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 164, column 46
    function sortValue_48 (VehicleCoverage :  dynamic.Dynamic) : java.lang.Object {
      return VehicleCoverage.Notes
    }
    
    // 'value' attribute on TextInput (id=Number) at ClaimSnapshotPolicyVehicle400DV.pcf: line 17, column 73
    function value_0 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.VehicleNumber)
    }
    
    // 'value' attribute on TextInput (id=VIN) at ClaimSnapshotPolicyVehicle400DV.pcf: line 38, column 206
    function value_11 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.Vin)
    }
    
    // 'value' attribute on TextInput (id=SerialNumber) at ClaimSnapshotPolicyVehicle400DV.pcf: line 43, column 190
    function value_15 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.SerialNumber)
    }
    
    // 'value' attribute on TextInput (id=Color) at ClaimSnapshotPolicyVehicle400DV.pcf: line 47, column 73
    function value_18 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.Color)
    }
    
    // 'value' attribute on TextInput (id=Make) at ClaimSnapshotPolicyVehicle400DV.pcf: line 21, column 72
    function value_2 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.Make)
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotPolicyVehicle400DV.pcf: line 51, column 73
    function value_20 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.State)
    }
    
    // 'value' attribute on TextInput (id=LicensePlate) at ClaimSnapshotPolicyVehicle400DV.pcf: line 55, column 80
    function value_22 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.LicensePlate)
    }
    
    // 'value' attribute on TextInput (id=BoatType) at ClaimSnapshotPolicyVehicle400DV.pcf: line 60, column 73
    function value_25 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.BoatType)
    }
    
    // 'value' attribute on TextInput (id=OffRoadStyle) at ClaimSnapshotPolicyVehicle400DV.pcf: line 65, column 134
    function value_29 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.OffRoadStyle)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 77, column 41
    function value_38 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.Lienholders
    }
    
    // 'value' attribute on TextInput (id=Model) at ClaimSnapshotPolicyVehicle400DV.pcf: line 25, column 73
    function value_4 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.Model)
    }
    
    // 'value' attribute on TextInput (id=Year) at ClaimSnapshotPolicyVehicle400DV.pcf: line 29, column 72
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.Year)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicle400DV.pcf: line 105, column 41
    function value_79 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.Coverages
    }
    
    // 'value' attribute on TextInput (id=Style) at ClaimSnapshotPolicyVehicle400DV.pcf: line 33, column 73
    function value_8 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.Style)
    }
    
    // 'visible' attribute on TextInput (id=VIN) at ClaimSnapshotPolicyVehicle400DV.pcf: line 38, column 206
    function visible_10 () : java.lang.Boolean {
      return PolicyVehicle.Vehicle.Style.Code != "boat" && PolicyVehicle.Vehicle.Style.Code != "ATV" && PolicyVehicle.Vehicle.Style.Code != "snowmobile"
    }
    
    // 'visible' attribute on TextInput (id=SerialNumber) at ClaimSnapshotPolicyVehicle400DV.pcf: line 43, column 190
    function visible_14 () : java.lang.Boolean {
      return PolicyVehicle.Vehicle.Style.Code == "boat" || PolicyVehicle.Vehicle.Style.Code == "ATV" || PolicyVehicle.Vehicle.Style.Code == "snowmobile"
    }
    
    // 'visible' attribute on TextInput (id=BoatType) at ClaimSnapshotPolicyVehicle400DV.pcf: line 60, column 73
    function visible_24 () : java.lang.Boolean {
      return PolicyVehicle.Vehicle.Style.Code == "boat"
    }
    
    // 'visible' attribute on TextInput (id=OffRoadStyle) at ClaimSnapshotPolicyVehicle400DV.pcf: line 65, column 134
    function visible_28 () : java.lang.Boolean {
      return PolicyVehicle.Vehicle.Style.Code == "ATV" || PolicyVehicle.Vehicle.Style.Code == "snowmobile"
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get PolicyVehicle () : dynamic.Dynamic {
      return getRequireValue("PolicyVehicle", 0) as dynamic.Dynamic
    }
    
    property set PolicyVehicle ($arg :  dynamic.Dynamic) {
      setRequireValue("PolicyVehicle", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotPolicyVehicle400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyVehicle400DV.pcf: line 112, column 46
    function valueRoot_51 () : java.lang.Object {
      return VehicleCoverage
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyVehicle400DV.pcf: line 112, column 46
    function value_49 () : dynamic.Dynamic {
      return VehicleCoverage.Type
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyVehicle400DV.pcf: line 118, column 46
    function value_52 () : dynamic.Dynamic {
      return VehicleCoverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyVehicle400DV.pcf: line 124, column 46
    function value_55 () : dynamic.Dynamic {
      return VehicleCoverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyVehicle400DV.pcf: line 130, column 46
    function value_58 () : dynamic.Dynamic {
      return VehicleCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=NonmedAggLimit) at ClaimSnapshotPolicyVehicle400DV.pcf: line 136, column 46
    function value_61 () : dynamic.Dynamic {
      return VehicleCoverage.NonmedAggLimit
    }
    
    // 'value' attribute on TextCell (id=ReplaceAggLimit) at ClaimSnapshotPolicyVehicle400DV.pcf: line 142, column 46
    function value_64 () : dynamic.Dynamic {
      return VehicleCoverage.ReplaceAggLimit
    }
    
    // 'value' attribute on TextCell (id=PersonAggLimit) at ClaimSnapshotPolicyVehicle400DV.pcf: line 148, column 46
    function value_67 () : dynamic.Dynamic {
      return VehicleCoverage.PersonAggLimit
    }
    
    // 'value' attribute on TextCell (id=ClaimAggLimit) at ClaimSnapshotPolicyVehicle400DV.pcf: line 154, column 46
    function value_70 () : dynamic.Dynamic {
      return VehicleCoverage.ClaimAggLimit
    }
    
    // 'value' attribute on TextCell (id=LimitsIndicator) at ClaimSnapshotPolicyVehicle400DV.pcf: line 159, column 46
    function value_73 () : dynamic.Dynamic {
      return VehicleCoverage.LimitsIndicator
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyVehicle400DV.pcf: line 164, column 46
    function value_76 () : dynamic.Dynamic {
      return VehicleCoverage.Notes
    }
    
    property get VehicleCoverage () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyVehicle400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotPolicyVehicle400DV.pcf: line 82, column 77
    function value_34 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleOwner.Lienholder)
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotPolicyVehicle400DV.pcf: line 86, column 76
    function value_36 () : java.lang.String {
      return util.Snapshot.renderValue(VehicleOwner.OwnerType)
    }
    
    property get VehicleOwner () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}