package gw.pcf.policyrefresh

uses gw.api.locale.DisplayKey

@Export
class PolicyRefreshRiskUnitWrapper {
  var _matched : boolean as Matched 
  var _riskUnit : RiskUnit as RiskUnit
  property get MatchedString() : String {
    return Matched ? DisplayKey.get("Java.NameValueView.Boolean.True") : DisplayKey.get("Java.NameValueView.Boolean.False")    
  }
  
  construct(aRiskUnit : RiskUnit) {
    RiskUnit = aRiskUnit
  }

  static function createWrapper(riskUnits : RiskUnit[], policySummary : PolicySummary) : PolicyRefreshRiskUnitWrapper[] {
    var wrapper = new PolicyRefreshRiskUnitWrapper[riskUnits.Count]
    for (var riskUnit in riskUnits index i) {
      var ru = new PolicyRefreshRiskUnitWrapper(riskUnit)
      ru.setMatched(policySummary)
      wrapper[i] = ru
    }
    return wrapper
  }
  
  /**
   * Set Matched to true or false depending on whether RiskUnit has a match in the policy summary
   */ 
  function setMatched(policySummary : PolicySummary) {
    if (RiskUnit typeis LocationBasedRU) {
      for (var aProperty in policySummary.Properties) {
        if (policySummary.matchProperty(RiskUnit, aProperty)) {
          Matched = true
          return
        }
      }
    } else if (RiskUnit typeis VehicleRU) {
      for (var aVehicle in policySummary.Vehicles) {
        if (policySummary.matchVehicle(RiskUnit, aVehicle)) {
          Matched = true
          return
        }
      }
    }
    Matched = false
  }
}
