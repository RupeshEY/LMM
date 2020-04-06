package libraries

uses gw.api.locale.DisplayKey

@Export
enhancement TotalLossCalculator : entity.VehicleIncident {
  
  function TotalLossCalculatorPreUpdate() {
    // only applies to Auto LOB
    if (this.Claim.LossType == LossType.TC_AUTO){
      //var ThisFunctionTotalLossPoints = this.TotalLossPoints
      var currentValue = this.TotalLossPoints
      var newCalcValue = this.calcTotalLossPoints()
      var wasFlaggedAsTotalLoss = false
      this.TotalLossPoints = newCalcValue
      
      // change total loss field to Yes and flag claim if calculated value goes over 25 and a previous total loss history event was not logged
      if (newCalcValue > 25 ) {
        // check for a total loss history event and break out of the loop after the first match
        for(onlyFlaggingHistory in this.Claim.History.where( \ h -> h.Type == TC_FLAGGED )) {
          if(onlyFlaggingHistory.Description != null and onlyFlaggingHistory.Description.contains( DisplayKey.get("Web.TotalLossCalculatorPopup.TotalLossEarlyTow", this.DisplayName) )) {
            wasFlaggedAsTotalLoss = true
            break
          }
        }
        //The following added to make the Total Loss field (in the Salvage Subtab) True
        this.TotalLoss = true             
        if(!wasFlaggedAsTotalLoss) {
          this.Claim.setFlagExt( DisplayKey.get("Web.TotalLossCalculatorPopup.TotalLossEarlyTow", this.DisplayName))        
        }
      // change total loss field to No and clear claim flag
      // if calculated value changes from over 25 to 
      // 25 or under
      } else if (currentValue > 25 and newCalcValue <= 25) {
        //The following added to make the Total Loss field (in the Salvage Subtab) False
        this.TotalLoss = false
        this.Claim.removeFlagExt( DisplayKey.get("Web.TotalLossCalculatorPopup.TotalLossEarlyTow", this.DisplayName) )
      }
    }
  }

  function calcTotalLossPoints() : int {
    // declare variables
    var total = 0;	
    // declare point values for each field in the calculator
    var VehicleAge5YearsValue = 10
    var VehicleAge10YearsValue = 15
    var Mileage100KValue = 10
    var VehicleTowValue = 5
    var ExtricationValue = 25
    var VehicleAirBagsDeployedValue = 10
    var VehicleRollOverValue = 15
    var FireBurnDashValue = 15
    var FireBurnEngineValue = 15
    var FireBurnWindshieldValue = 10
    var VehicleSubmergedValue = 25
    var WaterLevelDashValue = 20
    var FloodSaltWaterValue = 15
    var WaterLevelSeatsValue = 10
    var ComponentsMissingValue = 10
    var InteriorMissingValue = 10
    var AirbagsDeployedValue = 10
    
    // test each field on Total Loss Calculator;
    // if the field is set to Yes, include the field's 
    // value (defined above) in total
    if (this.VehicleAge5Years and not this.VehicleAge10Years) {
      total = total + VehicleAge5YearsValue
    }

    if (this.VehicleAge10Years) {
      total = total + VehicleAge10YearsValue
    }

    if (this.Mileage100K) {
      total = total + Mileage100KValue
    }

    if (this.Extrication) {
      total = total + ExtricationValue
    }

    if (this.AirbagsDeployed) {
      total = total + VehicleAirBagsDeployedValue
    }

    if (this.VehicleRollOver) {
      total = total + VehicleRollOverValue
    }

    if (this.FireBurnDash) {
      total = total + FireBurnDashValue
    }

    if (this.FireBurnEngine) {
      total = total + FireBurnEngineValue
    }

    if (this.FireBurnWindshield) {
      total = total + FireBurnWindshieldValue
    }

    if (this.VehicleSubmerged) {
      total = total + VehicleSubmergedValue
    }

    if (this.WaterLevelDash) {
      total = total + WaterLevelDashValue
    }
 
    if (this.FloodSaltWater) {
      total = total + FloodSaltWaterValue
    }
  
    if (this.WaterLevelSeats) {
      total = total + WaterLevelSeatsValue
    }
  
    if (this.ComponentsMissing) {
      total = total + ComponentsMissingValue
    }
  
    if (this.InteriorMissing) {
      total = total + InteriorMissingValue
    }
    
    if (this.AirbagsDeployed) {
      total = total + AirbagsDeployedValue
    }
   
    if (this.HasTowingServices) {
      total = total + VehicleTowValue
    }
    
    return total;
  }
}