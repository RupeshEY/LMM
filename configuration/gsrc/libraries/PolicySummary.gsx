package libraries

@Export
enhancement PolicySummary : entity.PolicySummary
{
  /**this method provides the equivalence of "equals" method function to check if two PolicySummary are the same
    *For the FNOL Wizard, the find policy page needs to store the policySummary to display the results table
    *correctly.  This equality is customizable and defaults to having PolicyType, PolicyNumber, EffecitveDate,
    *and ExpirationDate equal.
    */
  function isSamePolicySummary(summary : PolicySummary) : boolean
  {
    if (summary == null) {
      return false;
    }

    //this array contains the list of database fields that need to checked for equality, add/remove
    //the properties to customize the database fields to check for equality.
    var properties : String[] = {"PolicyType", "PolicyNumber", "EffectiveDate", "ExpirationDate"};
    
    for (policySummaryProperty in properties) {
      if (this.getFieldValue(policySummaryProperty) != summary.getFieldValue( policySummaryProperty )) {
        return false;
      }
    }
    return true;
  }    

  /**this method provides the equivalence of "equals" method function to check if a policySummary is referring to the same
    *policy. For the FNOL Wizard, the set policy method in NewClaimPolicy needs to know if the existing policy is the same
    *one as selected currently on the UI.  This equality is customizable and defaults to having PolicyType, PolicyNumber,
    *EffecitveDate, and ExpirationDate equal.
    *This method is required because it is called from NewClaimPolicy.java
    */
  function isSamePolicy(policy : Policy) : boolean
  {
    if (policy == null) {
      return false;
    }

    //this array contains the list of database fields that need to checked for equality, add/remove
    //the properties to customize the database fields to check for equality.
    var properties : String[] = {"PolicyType", "PolicyNumber", "EffectiveDate", "ExpirationDate"};

    for (policySummaryProperty in properties) {
      if (this.getFieldValue(policySummaryProperty) != policy.getFieldValue( policySummaryProperty )) {
        return false;
      }
    }

    // check the RiskUnits match (if the user selected a limited set of RiskUnits and that set differs
    // from the ones on the downloaded Policy, the policy is considered to differ
    if (CanSelectRiskUnits) {
      return hasSameRiskUnits(policy)
    }

    return true
  }
  
  /**
   * Compares the selected riskunits with the ones on the policy.  Returns true if the 
   * RUNumbers and types match.  Does not check if the policy otherwise
   * matches this summary.
   */
  function hasSameRiskUnits(policy : Policy) : boolean {
    var selectedVehicles = this.Vehicles.where( \ v -> v.Selected )
    var selectedProperties = this.Properties.where( \ p -> p.Selected )
    
    // easy case -- totals don't match
    if (selectedVehicles.Count != policy.Vehicles.Count or
       selectedProperties.Count != policy.Properties.Count) {
      return false
    }
    
    for (selectedVehicle in selectedVehicles) {
      if (!policy.Vehicles.hasMatch(\ v -> v.RUNumber == selectedVehicle.VehicleNumber)) {
        return false
      }
    }
    
    for (selectedProperty in selectedProperties) {
      if (!policy.Properties.hasMatch(\ p -> p.RUNumber == selectedProperty.PropertyNumber)) {
        return false
      }
    }
    
    return true
  }

  property get CanSelectRiskUnits() : boolean {
    return this.PolicyType.AllowsRiskUnitSelection and  (CanSelectVehicles or CanSelectProperties)    
  }
  
  property get CanSelectProperties() : boolean {
    return this.PropertyPolicyType and this.Properties.length > 0
  }
  
  property get CanSelectVehicles() : boolean {
    return this.VehiclePolicyType and this.Vehicles.length > 0
  }

  /**
   * Given a policy, set the Selected property to true on all vehicles and properties in the summary that match risk units on the policy
   */ 
  function selectMatchingRiskUnits(oldPolicy : Policy) {
    for (var riskUnit in oldPolicy.RiskUnits) {
      if (riskUnit typeis LocationBasedRU) {
        for (var aProperty in this.Properties) {
          if (matchProperty(riskUnit, aProperty)) {
            aProperty.Selected = true
            break
          }
        }
      } else if (riskUnit typeis VehicleRU) {
        for (var aVehicle in this.Vehicles) {
          if (matchVehicle(riskUnit, aVehicle)) {
            aVehicle.Selected = true
            break
          }
        }
      }
    }
  }

  /**
   * Select all risk units on this policy summary, both vehicles and properties
   */
  function selectAllRiskUnits() {
    for (var v in this.Vehicles) {
      v.Selected = true
    }
    for (var p in this.Properties) {
      p.Selected = true
    }
  }
    
  function matchProperty(locationBasedRU : LocationBasedRU, policySummaryProperty : PolicySummaryProperty) : boolean {
    var psid1 = locationBasedRU.PolicySystemId
    var psid2 = policySummaryProperty.PolicySystemId
    if (areBothNotNull(psid1, psid2))
      return (psid1 == psid2)

    var buildingNum1 = locationBasedRU.Building.BuildingNumber
    var buildingNum2 = policySummaryProperty.BuildingNumber
    var addr1 = locationBasedRU.PolicyLocation.Address.AddressLine1
    var addr2 = policySummaryProperty.Address    
    var city1 = locationBasedRU.PolicyLocation.Address.City
    var city2 = policySummaryProperty.City
    
    if (areBothNotNull(buildingNum1, buildingNum2) and areBothNotNull(addr1, addr2) and areBothNotNull(city1, city2))
      return (buildingNum1 == buildingNum2 and addr1 == addr2 and city1 == city2)
    
    if (areBothNotNull(addr1, addr2) and areBothNotNull(city1, city2))
      return (addr1 == addr2 and city1 == city2)

    return false
  }
  
 function matchVehicle(vehicleRU : VehicleRU, policySummaryVehicle : PolicySummaryVehicle) : boolean {
    var psid1 = vehicleRU.PolicySystemId
    var psid2 = policySummaryVehicle.PolicySystemId
    if (areBothNotNull(psid1, psid2))
      return (psid1 == psid2)
  
    var vin1 = vehicleRU.Vehicle.Vin
    var vin2 = policySummaryVehicle.Vin
    if (areBothNotNull(vin1, vin2))
      return (vin1 == vin2)
      
    var license1 = vehicleRU.Vehicle.LicensePlate
    var license2 = policySummaryVehicle.LicensePlate
    var state1 = vehicleRU.Vehicle.State.Code
    var state2 = policySummaryVehicle.State.Code
    if (areBothNotNull(license1, license2) and areBothNotNull(state1, state2))
      return (license1 == license2 and state1 == state2)
      
    if (areBothNotNull(license1, license2))
      return (license1 == license2)

    var serial1 = vehicleRU.Vehicle.SerialNumber
    var serial2 = policySummaryVehicle.SerialNumber
    if (areBothNotNull(serial1, serial2))
      return (serial1 == serial2)

    return false
  }
  
  private function areBothNotNull(o1 : Object, o2 : Object) : boolean {
    return o1 != null && o2 != null
  }

}