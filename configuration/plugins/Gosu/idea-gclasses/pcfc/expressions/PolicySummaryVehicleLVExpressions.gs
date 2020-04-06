package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicySummaryVehicleLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicySummaryVehicleLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/PolicySummaryVehicleLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PolicySummaryVehicleLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on CheckBoxCell (id=VehicleSelected) at PolicySummaryVehicleLV.pcf: line 33, column 24
    function available_10 () : java.lang.Boolean {
      return checkboxesAvailable
    }
    
    // 'value' attribute on CheckBoxCell (id=VehicleSelected) at PolicySummaryVehicleLV.pcf: line 33, column 24
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      vehicle.Selected = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on CheckBoxCell (id=VehicleSelected) at PolicySummaryVehicleLV.pcf: line 33, column 24
    function editable_11 () : java.lang.Boolean {
      return showCheckboxes
    }
    
    // 'value' attribute on CheckBoxCell (id=VehicleSelected) at PolicySummaryVehicleLV.pcf: line 33, column 24
    function valueRoot_18 () : java.lang.Object {
      return vehicle
    }
    
    // 'value' attribute on CheckBoxCell (id=VehicleSelected) at PolicySummaryVehicleLV.pcf: line 33, column 24
    function value_13 () : java.lang.Boolean {
      return vehicle.Selected
    }
    
    // 'value' attribute on TextCell (id=VehicleNumber) at PolicySummaryVehicleLV.pcf: line 39, column 42
    function value_19 () : java.lang.Integer {
      return vehicle.VehicleNumber
    }
    
    // 'value' attribute on TextCell (id=Vin) at PolicySummaryVehicleLV.pcf: line 43, column 32
    function value_22 () : java.lang.String {
      return vehicle.Vin
    }
    
    // 'value' attribute on TextCell (id=Make) at PolicySummaryVehicleLV.pcf: line 47, column 33
    function value_25 () : java.lang.String {
      return vehicle.Make
    }
    
    // 'value' attribute on TextCell (id=Model) at PolicySummaryVehicleLV.pcf: line 51, column 34
    function value_28 () : java.lang.String {
      return vehicle.Model
    }
    
    // 'value' attribute on TextCell (id=Color) at PolicySummaryVehicleLV.pcf: line 55, column 34
    function value_31 () : java.lang.String {
      return vehicle.Color
    }
    
    // 'value' attribute on TextCell (id=LicencePlate) at PolicySummaryVehicleLV.pcf: line 59, column 41
    function value_34 () : java.lang.String {
      return vehicle.LicensePlate
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at PolicySummaryVehicleLV.pcf: line 64, column 45
    function value_37 () : typekey.Jurisdiction {
      return vehicle.State
    }
    
    property get vehicle () : entity.PolicySummaryVehicle {
      return getIteratedValue(1) as entity.PolicySummaryVehicle
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/PolicySummaryVehicleLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicySummaryVehicleLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at PolicySummaryVehicleLV.pcf: line 33, column 24
    function sortValue_1 (vehicle :  entity.PolicySummaryVehicle) : java.lang.Object {
      return vehicle.Selected
    }
    
    // 'value' attribute on RowIterator at PolicySummaryVehicleLV.pcf: line 39, column 42
    function sortValue_2 (vehicle :  entity.PolicySummaryVehicle) : java.lang.Object {
      return vehicle.VehicleNumber
    }
    
    // 'value' attribute on RowIterator at PolicySummaryVehicleLV.pcf: line 43, column 32
    function sortValue_3 (vehicle :  entity.PolicySummaryVehicle) : java.lang.Object {
      return vehicle.Vin
    }
    
    // 'value' attribute on RowIterator at PolicySummaryVehicleLV.pcf: line 47, column 33
    function sortValue_4 (vehicle :  entity.PolicySummaryVehicle) : java.lang.Object {
      return vehicle.Make
    }
    
    // 'value' attribute on RowIterator at PolicySummaryVehicleLV.pcf: line 51, column 34
    function sortValue_5 (vehicle :  entity.PolicySummaryVehicle) : java.lang.Object {
      return vehicle.Model
    }
    
    // 'value' attribute on RowIterator at PolicySummaryVehicleLV.pcf: line 55, column 34
    function sortValue_6 (vehicle :  entity.PolicySummaryVehicle) : java.lang.Object {
      return vehicle.Color
    }
    
    // 'value' attribute on RowIterator at PolicySummaryVehicleLV.pcf: line 59, column 41
    function sortValue_7 (vehicle :  entity.PolicySummaryVehicle) : java.lang.Object {
      return vehicle.LicensePlate
    }
    
    // 'value' attribute on RowIterator at PolicySummaryVehicleLV.pcf: line 64, column 45
    function sortValue_8 (vehicle :  entity.PolicySummaryVehicle) : java.lang.Object {
      return vehicle.State
    }
    
    // 'value' attribute on RowIterator at PolicySummaryVehicleLV.pcf: line 22, column 49
    function value_40 () : entity.PolicySummaryVehicle[] {
      return policySummary.Vehicles
    }
    
    // 'visible' attribute on RowIterator at PolicySummaryVehicleLV.pcf: line 33, column 24
    function visible_0 () : java.lang.Boolean {
      return showCheckboxes
    }
    
    property get checkboxesAvailable () : boolean {
      return getRequireValue("checkboxesAvailable", 0) as java.lang.Boolean
    }
    
    property set checkboxesAvailable ($arg :  boolean) {
      setRequireValue("checkboxesAvailable", 0, $arg)
    }
    
    property get policySummary () : PolicySummary {
      return getRequireValue("policySummary", 0) as PolicySummary
    }
    
    property set policySummary ($arg :  PolicySummary) {
      setRequireValue("policySummary", 0, $arg)
    }
    
    property get showCheckboxes () : boolean {
      return getRequireValue("showCheckboxes", 0) as java.lang.Boolean
    }
    
    property set showCheckboxes ($arg :  boolean) {
      setRequireValue("showCheckboxes", 0, $arg)
    }
    
    
  }
  
  
}