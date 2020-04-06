package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicles400LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyVehicles400LVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicles400LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles400LVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles400LV.pcf: line 24, column 40
    function sortValue_0 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.VehicleNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles400LV.pcf: line 29, column 40
    function sortValue_1 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.Make
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles400LV.pcf: line 34, column 40
    function sortValue_2 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.Model
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles400LV.pcf: line 39, column 40
    function sortValue_3 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.Year
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles400LV.pcf: line 44, column 40
    function sortValue_4 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.Color
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles400LV.pcf: line 49, column 40
    function sortValue_5 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.VIN
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles400LV.pcf: line 54, column 40
    function sortValue_6 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.State
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles400LV.pcf: line 59, column 40
    function sortValue_7 (PolicyVehicle :  dynamic.Dynamic) : java.lang.Object {
      return PolicyVehicle.Vehicle.LicensePlate
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyVehicles400LV.pcf: line 17, column 35
    function value_32 () : dynamic.Dynamic {
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicles400LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyVehicles400LVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=VehicleNumber) at ClaimSnapshotPolicyVehicles400LV.pcf: line 24, column 40
    function valueRoot_10 () : java.lang.Object {
      return PolicyVehicle
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotPolicyVehicles400LV.pcf: line 29, column 40
    function valueRoot_13 () : java.lang.Object {
      return PolicyVehicle.Vehicle
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotPolicyVehicles400LV.pcf: line 29, column 40
    function value_11 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.Make
    }
    
    // 'value' attribute on TextCell (id=Model) at ClaimSnapshotPolicyVehicles400LV.pcf: line 34, column 40
    function value_14 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.Model
    }
    
    // 'value' attribute on TextCell (id=Year) at ClaimSnapshotPolicyVehicles400LV.pcf: line 39, column 40
    function value_17 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.Year
    }
    
    // 'value' attribute on TextCell (id=Color) at ClaimSnapshotPolicyVehicles400LV.pcf: line 44, column 40
    function value_20 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.Color
    }
    
    // 'value' attribute on TextCell (id=VIN) at ClaimSnapshotPolicyVehicles400LV.pcf: line 49, column 40
    function value_23 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.VIN
    }
    
    // 'value' attribute on TextCell (id=State) at ClaimSnapshotPolicyVehicles400LV.pcf: line 54, column 40
    function value_26 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.State
    }
    
    // 'value' attribute on TextCell (id=LicensePlate) at ClaimSnapshotPolicyVehicles400LV.pcf: line 59, column 40
    function value_29 () : dynamic.Dynamic {
      return PolicyVehicle.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TextCell (id=VehicleNumber) at ClaimSnapshotPolicyVehicles400LV.pcf: line 24, column 40
    function value_8 () : dynamic.Dynamic {
      return PolicyVehicle.VehicleNumber
    }
    
    property get PolicyVehicle () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}