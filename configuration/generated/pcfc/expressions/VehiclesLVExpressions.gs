package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/VehiclesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehiclesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/VehiclesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends VehiclesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Number) at VehiclesLV.pcf: line 34, column 23
    function valueRoot_11 () : java.lang.Object {
      return VehicleRU
    }
    
    // 'value' attribute on TextCell (id=Make) at VehiclesLV.pcf: line 40, column 24
    function valueRoot_14 () : java.lang.Object {
      return VehicleRU.Vehicle
    }
    
    // 'value' attribute on TextCell (id=Make) at VehiclesLV.pcf: line 40, column 24
    function value_12 () : java.lang.String {
      return VehicleRU.Vehicle.Make
    }
    
    // 'value' attribute on TextCell (id=Model) at VehiclesLV.pcf: line 46, column 24
    function value_15 () : java.lang.String {
      return VehicleRU.Vehicle.Model
    }
    
    // 'value' attribute on TextCell (id=Year) at VehiclesLV.pcf: line 53, column 23
    function value_18 () : java.lang.Integer {
      return VehicleRU.Vehicle.Year
    }
    
    // 'value' attribute on TextCell (id=Color) at VehiclesLV.pcf: line 58, column 44
    function value_21 () : java.lang.String {
      return VehicleRU.Vehicle.Color
    }
    
    // 'value' attribute on TextCell (id=VIN) at VehiclesLV.pcf: line 63, column 42
    function value_24 () : java.lang.String {
      return VehicleRU.Vehicle.Vin
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at VehiclesLV.pcf: line 69, column 45
    function value_27 () : typekey.Jurisdiction {
      return VehicleRU.Vehicle.State
    }
    
    // 'value' attribute on TextCell (id=LicensePlate) at VehiclesLV.pcf: line 75, column 24
    function value_30 () : java.lang.String {
      return VehicleRU.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TextCell (id=Lienholders) at VehiclesLV.pcf: line 80, column 114
    function value_33 () : java.lang.String {
      return VehicleRU.Vehicle != null ? VehicleRU.Vehicle.Lienholders.join(", ") : ""
    }
    
    // 'value' attribute on TextCell (id=Number) at VehiclesLV.pcf: line 34, column 23
    function value_9 () : java.lang.Integer {
      return VehicleRU.RUNumber
    }
    
    property get VehicleRU () : entity.VehicleRU {
      return getIteratedValue(1) as entity.VehicleRU
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/VehiclesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehiclesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at VehiclesLV.pcf: line 34, column 23
    function sortValue_0 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.RUNumber
    }
    
    // 'value' attribute on RowIterator at VehiclesLV.pcf: line 40, column 24
    function sortValue_1 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.Make
    }
    
    // 'value' attribute on RowIterator at VehiclesLV.pcf: line 46, column 24
    function sortValue_2 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.Model
    }
    
    // 'value' attribute on RowIterator at VehiclesLV.pcf: line 53, column 23
    function sortValue_3 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.Year
    }
    
    // 'value' attribute on RowIterator at VehiclesLV.pcf: line 58, column 44
    function sortValue_4 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.Color
    }
    
    // 'value' attribute on RowIterator at VehiclesLV.pcf: line 63, column 42
    function sortValue_5 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.Vin
    }
    
    // 'value' attribute on RowIterator at VehiclesLV.pcf: line 69, column 45
    function sortValue_6 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.State
    }
    
    // 'value' attribute on RowIterator at VehiclesLV.pcf: line 75, column 24
    function sortValue_7 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.LicensePlate
    }
    
    // 'value' attribute on RowIterator at VehiclesLV.pcf: line 80, column 114
    function sortValue_8 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle != null ? VehicleRU.Vehicle.Lienholders.join(", ") : ""
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at VehiclesLV.pcf: line 25, column 38
    function toCreateAndAdd_35 () : entity.VehicleRU {
      return Claim.Policy.createVehicleRU()
    }
    
    // 'toRemove' attribute on RowIterator at VehiclesLV.pcf: line 25, column 38
    function toRemove_36 (VehicleRU :  entity.VehicleRU) : void {
      Claim.Policy.removeVehicleRU(VehicleRU)
    }
    
    // 'value' attribute on RowIterator at VehiclesLV.pcf: line 25, column 38
    function value_37 () : entity.VehicleRU[] {
      return PolicyVehicleList
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get PolicyVehicleList () : VehicleRU[] {
      return getRequireValue("PolicyVehicleList", 0) as VehicleRU[]
    }
    
    property set PolicyVehicleList ($arg :  VehicleRU[]) {
      setRequireValue("PolicyVehicleList", 0, $arg)
    }
    
    
  }
  
  
}