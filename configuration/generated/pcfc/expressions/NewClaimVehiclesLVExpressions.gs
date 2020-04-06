package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimVehiclesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewClaimVehiclesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Number) at NewClaimVehiclesLV.pcf: line 34, column 42
    function action_10 () : void {
      NewClaimWizard_PolicyVehicleDetailPopup.push(VehicleRU, Policy)
    }
    
    // 'action' attribute on TextCell (id=VIN) at NewClaimVehiclesLV.pcf: line 61, column 42
    function action_27 () : void {
      NewClaimWizard_PolicyVehicleDetailPopup.push(VehicleRU, Policy)
    }
    
    // 'action' attribute on TextCell (id=Number) at NewClaimVehiclesLV.pcf: line 34, column 42
    function action_dest_11 () : pcf.api.Destination {
      return pcf.NewClaimWizard_PolicyVehicleDetailPopup.createDestination(VehicleRU, Policy)
    }
    
    // 'action' attribute on TextCell (id=VIN) at NewClaimVehiclesLV.pcf: line 61, column 42
    function action_dest_28 () : pcf.api.Destination {
      return pcf.NewClaimWizard_PolicyVehicleDetailPopup.createDestination(VehicleRU, Policy)
    }
    
    // 'value' attribute on TextCell (id=Number) at NewClaimVehiclesLV.pcf: line 34, column 42
    function valueRoot_13 () : java.lang.Object {
      return VehicleRU
    }
    
    // 'value' attribute on TextCell (id=Make) at NewClaimVehiclesLV.pcf: line 39, column 43
    function valueRoot_16 () : java.lang.Object {
      return VehicleRU.Vehicle
    }
    
    // 'value' attribute on TextCell (id=Make) at NewClaimVehiclesLV.pcf: line 39, column 43
    function value_14 () : java.lang.String {
      return VehicleRU.Vehicle.Make
    }
    
    // 'value' attribute on TextCell (id=Model) at NewClaimVehiclesLV.pcf: line 44, column 44
    function value_17 () : java.lang.String {
      return VehicleRU.Vehicle.Model
    }
    
    // 'value' attribute on TextCell (id=Year) at NewClaimVehiclesLV.pcf: line 50, column 42
    function value_20 () : java.lang.Integer {
      return VehicleRU.Vehicle.Year
    }
    
    // 'value' attribute on TextCell (id=Color) at NewClaimVehiclesLV.pcf: line 55, column 44
    function value_23 () : java.lang.String {
      return VehicleRU.Vehicle.Color
    }
    
    // 'value' attribute on TextCell (id=VIN) at NewClaimVehiclesLV.pcf: line 61, column 42
    function value_26 () : java.lang.String {
      return VehicleRU.Vehicle.Vin
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at NewClaimVehiclesLV.pcf: line 67, column 45
    function value_31 () : typekey.Jurisdiction {
      return VehicleRU.Vehicle.State
    }
    
    // 'value' attribute on TextCell (id=LicensePlate) at NewClaimVehiclesLV.pcf: line 72, column 51
    function value_34 () : java.lang.String {
      return VehicleRU.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TextCell (id=Lienholders) at NewClaimVehiclesLV.pcf: line 77, column 114
    function value_37 () : java.lang.String {
      return VehicleRU.Vehicle != null ? VehicleRU.Vehicle.Lienholders.join(", ") : ""
    }
    
    // 'value' attribute on TextCell (id=Number) at NewClaimVehiclesLV.pcf: line 34, column 42
    function value_9 () : java.lang.Integer {
      return VehicleRU.RUNumber
    }
    
    property get VehicleRU () : entity.VehicleRU {
      return getIteratedValue(1) as entity.VehicleRU
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimVehiclesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at NewClaimVehiclesLV.pcf: line 25, column 38
    function pickLocation_39 () : void {
      NewClaimWizard_NewPolicyVehiclePopup.push(Policy)
    }
    
    // 'value' attribute on RowIterator at NewClaimVehiclesLV.pcf: line 34, column 42
    function sortValue_0 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.RUNumber
    }
    
    // 'value' attribute on RowIterator at NewClaimVehiclesLV.pcf: line 39, column 43
    function sortValue_1 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.Make
    }
    
    // 'value' attribute on RowIterator at NewClaimVehiclesLV.pcf: line 44, column 44
    function sortValue_2 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.Model
    }
    
    // 'value' attribute on RowIterator at NewClaimVehiclesLV.pcf: line 50, column 42
    function sortValue_3 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.Year
    }
    
    // 'value' attribute on RowIterator at NewClaimVehiclesLV.pcf: line 55, column 44
    function sortValue_4 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.Color
    }
    
    // 'value' attribute on RowIterator at NewClaimVehiclesLV.pcf: line 61, column 42
    function sortValue_5 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.Vin
    }
    
    // 'value' attribute on RowIterator at NewClaimVehiclesLV.pcf: line 67, column 45
    function sortValue_6 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.State
    }
    
    // 'value' attribute on RowIterator at NewClaimVehiclesLV.pcf: line 72, column 51
    function sortValue_7 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle.LicensePlate
    }
    
    // 'value' attribute on RowIterator at NewClaimVehiclesLV.pcf: line 77, column 114
    function sortValue_8 (VehicleRU :  entity.VehicleRU) : java.lang.Object {
      return VehicleRU.Vehicle != null ? VehicleRU.Vehicle.Lienholders.join(", ") : ""
    }
    
    // 'toRemove' attribute on RowIterator at NewClaimVehiclesLV.pcf: line 25, column 38
    function toRemove_40 (VehicleRU :  entity.VehicleRU) : void {
      Policy.removeVehicleRU(VehicleRU)
    }
    
    // 'value' attribute on RowIterator at NewClaimVehiclesLV.pcf: line 25, column 38
    function value_41 () : entity.VehicleRU[] {
      return PolicyVehicleList
    }
    
    property get Policy () : Policy {
      return getRequireValue("Policy", 0) as Policy
    }
    
    property set Policy ($arg :  Policy) {
      setRequireValue("Policy", 0, $arg)
    }
    
    property get PolicyVehicleList () : VehicleRU[] {
      return getRequireValue("PolicyVehicleList", 0) as VehicleRU[]
    }
    
    property set PolicyVehicleList ($arg :  VehicleRU[]) {
      setRequireValue("PolicyVehicleList", 0, $arg)
    }
    
    
  }
  
  
}