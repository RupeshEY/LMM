package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyRefreshExistingPropertyRULVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PolicyRefreshExistingPropertyRULVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at PolicyRefreshExistingPropertyRULV.pcf: line 24, column 33
    function initialValue_8 () : LocationBasedRU {
      return riskUnitWrapper.RiskUnit as LocationBasedRU
    }
    
    // RowIterator at PolicyRefreshExistingPropertyRULV.pcf: line 20, column 71
    function initializeVariables_29 () : void {
        propertyRU = riskUnitWrapper.RiskUnit as LocationBasedRU;

    }
    
    // 'value' attribute on TextCell (id=Present) at PolicyRefreshExistingPropertyRULV.pcf: line 33, column 24
    function valueRoot_11 () : java.lang.Object {
      return riskUnitWrapper
    }
    
    // 'value' attribute on TextCell (id=PropertyNumber) at PolicyRefreshExistingPropertyRULV.pcf: line 39, column 42
    function valueRoot_14 () : java.lang.Object {
      return propertyRU
    }
    
    // 'value' attribute on TextCell (id=Location) at PolicyRefreshExistingPropertyRULV.pcf: line 43, column 61
    function valueRoot_17 () : java.lang.Object {
      return propertyRU.PolicyLocation
    }
    
    // 'value' attribute on TextCell (id=BuildingNumber) at PolicyRefreshExistingPropertyRULV.pcf: line 47, column 55
    function valueRoot_20 () : java.lang.Object {
      return propertyRU.Building
    }
    
    // 'value' attribute on TextCell (id=City) at PolicyRefreshExistingPropertyRULV.pcf: line 60, column 53
    function valueRoot_28 () : java.lang.Object {
      return propertyRU.Property.Address
    }
    
    // 'value' attribute on TextCell (id=PropertyNumber) at PolicyRefreshExistingPropertyRULV.pcf: line 39, column 42
    function value_12 () : java.lang.Integer {
      return propertyRU.RUNumber
    }
    
    // 'value' attribute on TextCell (id=Location) at PolicyRefreshExistingPropertyRULV.pcf: line 43, column 61
    function value_15 () : java.lang.String {
      return propertyRU.PolicyLocation.LocationNumber
    }
    
    // 'value' attribute on TextCell (id=BuildingNumber) at PolicyRefreshExistingPropertyRULV.pcf: line 47, column 55
    function value_18 () : java.lang.String {
      return propertyRU.Building.BuildingNumber
    }
    
    // 'value' attribute on TextCell (id=Description) at PolicyRefreshExistingPropertyRULV.pcf: line 51, column 43
    function value_21 () : java.lang.String {
      return propertyRU.Description
    }
    
    // 'value' attribute on TextCell (id=Address) at PolicyRefreshExistingPropertyRULV.pcf: line 56, column 67
    function value_24 () : java.lang.String {
      return getDisplayAddress(propertyRU.Property.Address)
    }
    
    // 'value' attribute on TextCell (id=City) at PolicyRefreshExistingPropertyRULV.pcf: line 60, column 53
    function value_26 () : java.lang.String {
      return propertyRU.Property.Address.City
    }
    
    // 'value' attribute on TextCell (id=Present) at PolicyRefreshExistingPropertyRULV.pcf: line 33, column 24
    function value_9 () : java.lang.String {
      return riskUnitWrapper.MatchedString
    }
    
    property get propertyRU () : LocationBasedRU {
      return getVariableValue("propertyRU", 1) as LocationBasedRU
    }
    
    property set propertyRU ($arg :  LocationBasedRU) {
      setVariableValue("propertyRU", 1, $arg)
    }
    
    property get riskUnitWrapper () : gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper {
      return getIteratedValue(1) as gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyRefreshExistingPropertyRULVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingPropertyRULV.pcf: line 33, column 24
    function sortValue_0 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      return riskUnitWrapper.MatchedString
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingPropertyRULV.pcf: line 39, column 42
    function sortValue_1 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var propertyRU : LocationBasedRU = (riskUnitWrapper.RiskUnit as LocationBasedRU)
return propertyRU.RUNumber
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingPropertyRULV.pcf: line 43, column 61
    function sortValue_2 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var propertyRU : LocationBasedRU = (riskUnitWrapper.RiskUnit as LocationBasedRU)
return propertyRU.PolicyLocation.LocationNumber
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingPropertyRULV.pcf: line 47, column 55
    function sortValue_3 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var propertyRU : LocationBasedRU = (riskUnitWrapper.RiskUnit as LocationBasedRU)
return propertyRU.Building.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingPropertyRULV.pcf: line 51, column 43
    function sortValue_4 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var propertyRU : LocationBasedRU = (riskUnitWrapper.RiskUnit as LocationBasedRU)
return propertyRU.Description
    }
    
    // 'sortBy' attribute on RowIterator at PolicyRefreshExistingPropertyRULV.pcf: line 56, column 67
    function sortValue_5 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var propertyRU : LocationBasedRU = (riskUnitWrapper.RiskUnit as LocationBasedRU)
return propertyRU.Property.Address.AddressLine1
    }
    
    // 'sortBy' attribute on RowIterator at PolicyRefreshExistingPropertyRULV.pcf: line 56, column 67
    function sortValue_6 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var propertyRU : LocationBasedRU = (riskUnitWrapper.RiskUnit as LocationBasedRU)
return propertyRU.Property.Address.AddressLine2
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingPropertyRULV.pcf: line 60, column 53
    function sortValue_7 (riskUnitWrapper :  gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper) : java.lang.Object {
      var propertyRU : LocationBasedRU = (riskUnitWrapper.RiskUnit as LocationBasedRU)
return propertyRU.Property.Address.City
    }
    
    // 'value' attribute on RowIterator at PolicyRefreshExistingPropertyRULV.pcf: line 20, column 71
    function value_30 () : gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper[] {
      return gw.pcf.policyrefresh.PolicyRefreshRiskUnitWrapper.createWrapper(claim.Policy.RiskUnits.where(\ r -> r typeis LocationBasedRU), policySummary)
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
    
    function getDisplayAddress(address : Address): String {
      var formatter =  new gw.api.address.AddressFormatter() {
          :AddressLine1 = address.AddressLine1,
          :AddressLine2 = address.AddressLine2,
          :AddressLine1Kanji = address.AddressLine1Kanji,
          :AddressLine2Kanji = address.AddressLine2Kanji
      }
      return formatter.format(formatter, ", ")  
    }
    
    
  }
  
  
}