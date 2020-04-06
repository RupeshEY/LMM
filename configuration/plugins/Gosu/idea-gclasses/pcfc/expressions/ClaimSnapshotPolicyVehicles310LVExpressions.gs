package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyVehicles310LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyVehicles310LVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyVehicles310LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles310LVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles310LV.pcf: line 23, column 40
    function sortValue_0 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.VehicleNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles310LV.pcf: line 28, column 40
    function sortValue_1 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.Make
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles310LV.pcf: line 33, column 40
    function sortValue_2 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.Model
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles310LV.pcf: line 38, column 40
    function sortValue_3 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.Year
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles310LV.pcf: line 43, column 40
    function sortValue_4 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.Color
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles310LV.pcf: line 48, column 40
    function sortValue_5 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.VIN
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles310LV.pcf: line 53, column 40
    function sortValue_6 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.State
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles310LV.pcf: line 58, column 40
    function sortValue_7 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.LicensePlate
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles310LV.pcf: line 62, column 81
    function sortValue_8 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.Lienholders)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles310LV.pcf: line 17, column 35
    function value_35 () : dynamic.Dynamic {
      return SnapshotParam.Policy.Vehicles
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyVehicles310LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyVehicles310LVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=VehicleNumber) at ClaimSnapshotPolicyVehicles310LV.pcf: line 23, column 40
    function valueRoot_11 () : java.lang.Object {
      return PolicyVehicle
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotPolicyVehicles310LV.pcf: line 28, column 40
    function valueRoot_14 () : java.lang.Object {
      return PolicyVehicle.Vehicle
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotPolicyVehicles310LV.pcf: line 28, column 40
    function value_12 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.Make
    }
    
    // 'value' attribute on TextCell (id=Model) at ClaimSnapshotPolicyVehicles310LV.pcf: line 33, column 40
    function value_15 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.Model
    }
    
    // 'value' attribute on TextCell (id=Year) at ClaimSnapshotPolicyVehicles310LV.pcf: line 38, column 40
    function value_18 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.Year
    }
    
    // 'value' attribute on TextCell (id=Color) at ClaimSnapshotPolicyVehicles310LV.pcf: line 43, column 40
    function value_21 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.Color
    }
    
    // 'value' attribute on TextCell (id=VIN) at ClaimSnapshotPolicyVehicles310LV.pcf: line 48, column 40
    function value_24 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.VIN
    }
    
    // 'value' attribute on TextCell (id=State) at ClaimSnapshotPolicyVehicles310LV.pcf: line 53, column 40
    function value_27 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.State
    }
    
    // 'value' attribute on TextCell (id=LicensePlate) at ClaimSnapshotPolicyVehicles310LV.pcf: line 58, column 40
    function value_30 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TextCell (id=Lienholders) at ClaimSnapshotPolicyVehicles310LV.pcf: line 62, column 81
    function value_33 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyVehicle.Vehicle.Lienholders)
    }
    
    // 'value' attribute on TextCell (id=VehicleNumber) at ClaimSnapshotPolicyVehicles310LV.pcf: line 23, column 40
    function value_9 () : dynamic.Dynamic {
      return PolicyVehicle.VehicleNumber
    }
    
    property get PolicyVehicle () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}