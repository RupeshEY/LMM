package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyRefreshExistingVehicleRULVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PolicyRefreshExistingVehicleRULVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at PolicyRefreshExistingVehicleRULV.pcf: line 24, column 25
    function initialValue_8 () : Vehicle {
      return (riskUnitWrapper.RiskUnit as VehicleRU).Vehicle
    }
    
    // RowIterator at PolicyRefreshExistingVehicleRULV.pcf: line 20, column 71
    function initializeVariables_33 () : void {
        vehicle = (riskUnitWrapper.RiskUnit as VehicleRU).Vehicle;

    }
    
    // 'value' attribute on TextCell (id=Present) at PolicyRefreshExistingVehicleRULV.pcf: line 33, column 24
    function valueRoot_11 () : java.lang.Object {
      return riskUnitWrapper
    }
    
    // 'value' attribute on TextCell (id=VehicleNumber) at PolicyRefreshExistingVehicleRULV.pcf: line 39, column 42
    function valueRoot_14 () : java.lang.Object {
      return riskUnitWrapper.RiskUnit
    }
    
    // 'value' attribute on TextCell (id=Vin) at PolicyRefreshExistingVehicleRULV.pcf: line 43, column 32
    function valueRoot_17 () : java.lang.Object {
      return vehicle
    }
    
    // 'value' attribute on TextCell (id=VehicleNumber) at PolicyRefreshExistingVehicleRULV.pcf: line 39, column 42
    function value_12 () : java.lang.Integer {
      return riskUnitWrapper.RiskUnit.RUNumber
    }
    
    // 'value' attribute on TextCell (id=Vin) at PolicyRefreshExistingVehicleRULV.pcf: line 43, column 32
    function value_15 () : java.lang.String {
      return vehicle.Vin
    }
    
    // 'value' attribute on TextCell (id=Make) at PolicyRefreshExistingVehicleRULV.pcf: line 47, column 33
    function value_18 () : java.lang.String {
      return vehicle.Make
    }
    
    // 'value' attribute on TextCell (id=Model) at PolicyRefreshExistingVehicleRULV.pcf: line 51, column 34
    function value_21 () : java.lang.String {
      return vehicle.Model
    }
    
    // 'value' attribute on TextCell (id=Color) at PolicyRefreshExistingVehicleRULV.pcf: line 55, column 34
    function value_24 () : java.lang.String {
      return vehicle.Color
    }
    
    // 'value' attribute on TextCell (id=LicencePlate) at PolicyRefreshExistingVehicleRULV.pcf: line 59, column 41
    function value_27 () : java.lang.String {
      return vehicle.LicensePlate
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at PolicyRefreshExistingVehicleRULV.pcf: line 64, column 45
    function value_30 () : typekey.Jurisdiction {
      return vehicle.State
    }
    
    // 'value' attribute on TextCell (id=Present) at PolicyRefreshExistingVehicleRULV.pcf: line 33, column 24
    function value_9 () : java.lang.String {
      return riskUnitWrapper.MatchedString
    }
    
    property get riskUnitWrapper () : gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper {
      return getIteratedValue(1) as gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper
    }
    
    property get vehicle () : Vehicle {
      return getVariableValue("vehicle", 1) as Vehicle
    }
    
    property set vehicle ($arg :  Vehicle) {
      setVariableValue("vehicle", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyRefreshExistingVehicleRULVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingVehicleRULV.pcf: line 33, column 24
    function sortValue_0 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      return riskUnitWrapper.MatchedString
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingVehicleRULV.pcf: line 39, column 42
    function sortValue_1 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      return riskUnitWrapper.RiskUnit.RUNumber
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingVehicleRULV.pcf: line 43, column 32
    function sortValue_2 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var vehicle : Vehicle = ((riskUnitWrapper.RiskUnit as VehicleRU).Vehicle)
return vehicle.Vin
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingVehicleRULV.pcf: line 47, column 33
    function sortValue_3 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var vehicle : Vehicle = ((riskUnitWrapper.RiskUnit as VehicleRU).Vehicle)
return vehicle.Make
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingVehicleRULV.pcf: line 51, column 34
    function sortValue_4 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var vehicle : Vehicle = ((riskUnitWrapper.RiskUnit as VehicleRU).Vehicle)
return vehicle.Model
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingVehicleRULV.pcf: line 55, column 34
    function sortValue_5 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var vehicle : Vehicle = ((riskUnitWrapper.RiskUnit as VehicleRU).Vehicle)
return vehicle.Color
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingVehicleRULV.pcf: line 59, column 41
    function sortValue_6 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var vehicle : Vehicle = ((riskUnitWrapper.RiskUnit as VehicleRU).Vehicle)
return vehicle.LicensePlate
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingVehicleRULV.pcf: line 64, column 45
    function sortValue_7 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var vehicle : Vehicle = ((riskUnitWrapper.RiskUnit as VehicleRU).Vehicle)
return vehicle.State
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingVehicleRULV.pcf: line 20, column 71
    function value_34 () : gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper[] {
      return gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper.createWrapper(claim.Policy.RiskUnits.where(\ r -> r typeis VehicleRU), policySummary)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get policySummary () : PolicySummary {
      return getRequireValue("policySummary", 0) as PolicySummary
    }
    
    property set policySummary ($arg :  PolicySummary) {
      setRequireValue("policySummary", 0, $arg)
    }
    
    
  }
  
  
}